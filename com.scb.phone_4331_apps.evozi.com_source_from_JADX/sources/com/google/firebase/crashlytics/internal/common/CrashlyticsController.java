package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsReceiver;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.ndk.NativeFileUtils;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.proto.ClsFileOutputStream;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.firebase.crashlytics.internal.proto.SessionProtobufHelper;
import com.google.firebase.crashlytics.internal.report.ReportManager;
import com.google.firebase.crashlytics.internal.report.ReportUploader;
import com.google.firebase.crashlytics.internal.report.model.Report;
import com.google.firebase.crashlytics.internal.report.model.SessionReport;
import com.google.firebase.crashlytics.internal.report.network.CompositeCreateReportSpiCall;
import com.google.firebase.crashlytics.internal.report.network.CreateReportSpiCall;
import com.google.firebase.crashlytics.internal.report.network.DefaultCreateReportSpiCall;
import com.google.firebase.crashlytics.internal.report.network.NativeCreateReportSpiCall;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.unity.UnityVersionProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.cache.DiskLruCache;

class CrashlyticsController {
    private static final String[] INITIAL_SESSION_PART_TAGS = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    static final Comparator<File> LARGEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", DiskLruCache.VERSION_1);
    static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter("BeginSession") {
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    };
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    };
    /* access modifiers changed from: private */
    public static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    /* access modifiers changed from: private */
    public final AnalyticsConnector analyticsConnector;
    /* access modifiers changed from: private */
    public final AnalyticsReceiver analyticsReceiver;
    /* access modifiers changed from: private */
    public final AppData appData;
    /* access modifiers changed from: private */
    public final CrashlyticsBackgroundWorker backgroundWorker;
    AtomicBoolean checkForUnsentReportsCalled = new AtomicBoolean(false);
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    /* access modifiers changed from: private */
    public final CrashlyticsFileMarker crashMarker;
    /* access modifiers changed from: private */
    public final DataCollectionArbiter dataCollectionArbiter;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final FileStore fileStore;
    /* access modifiers changed from: private */
    public final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    private final HttpRequestFactory httpRequestFactory;
    private final IdManager idManager;
    private final LogFileDirectoryProvider logFileDirectoryProvider;
    /* access modifiers changed from: private */
    public final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    TaskCompletionSource<Boolean> reportActionProvided = new TaskCompletionSource<>();
    /* access modifiers changed from: private */
    public final ReportManager reportManager;
    /* access modifiers changed from: private */
    public final ReportUploader.Provider reportUploaderProvider;
    /* access modifiers changed from: private */
    public final SessionReportingCoordinator reportingCoordinator;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    /* access modifiers changed from: private */
    public final String unityVersion;
    TaskCompletionSource<Boolean> unsentReportsAvailable = new TaskCompletionSource<>();
    TaskCompletionSource<Void> unsentReportsHandled = new TaskCompletionSource<>();
    private final UserMetadata userMetadata;

    interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream) throws Exception;
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(".cls_temp");
        }
    }

    static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.sessionId);
            sb.append(".cls");
            if (!str.equals(sb.toString()) && str.contains(this.sessionId) && !str.endsWith(".cls_temp")) {
                return true;
            }
            return false;
        }
    }

    static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) && CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    static class InvalidPartFileFilter implements FilenameFilter {
        InvalidPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    CrashlyticsController(Context context2, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, HttpRequestFactory httpRequestFactory2, IdManager idManager2, DataCollectionArbiter dataCollectionArbiter2, FileStore fileStore2, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData2, ReportManager reportManager2, ReportUploader.Provider provider, CrashlyticsNativeComponent crashlyticsNativeComponent, UnityVersionProvider unityVersionProvider, AnalyticsReceiver analyticsReceiver2, AnalyticsConnector analyticsConnector2, SettingsDataProvider settingsDataProvider) {
        ReportUploader.Provider provider2 = provider;
        this.context = context2;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = httpRequestFactory2;
        this.idManager = idManager2;
        this.dataCollectionArbiter = dataCollectionArbiter2;
        this.fileStore = fileStore2;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData2;
        if (provider2 != null) {
            this.reportUploaderProvider = provider2;
        } else {
            this.reportUploaderProvider = defaultReportUploader();
        }
        this.nativeComponent = crashlyticsNativeComponent;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.analyticsReceiver = analyticsReceiver2;
        this.analyticsConnector = analyticsConnector2;
        this.userMetadata = new UserMetadata();
        LogFileDirectoryProvider logFileDirectoryProvider2 = new LogFileDirectoryProvider(fileStore2);
        this.logFileDirectoryProvider = logFileDirectoryProvider2;
        this.logFileManager = new LogFileManager(context2, logFileDirectoryProvider2);
        this.reportManager = reportManager2 == null ? new ReportManager(new ReportUploaderFilesProvider()) : reportManager2;
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
        this.stackTraceTrimmingStrategy = middleOutFallbackStrategy;
        this.reportingCoordinator = SessionReportingCoordinator.create(context2, idManager2, fileStore2, appData2, this.logFileManager, this.userMetadata, middleOutFallbackStrategy, settingsDataProvider);
    }

    private Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: package-private */
    public void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsDataProvider settingsDataProvider) {
        openSession();
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {
            public void onUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th);
            }
        }, settingsDataProvider, uncaughtExceptionHandler);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    /* access modifiers changed from: package-private */
    public void handleUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th) {
        synchronized (this) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics is handling uncaught exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            logger.mo8866d(sb.toString());
            final Date date = new Date();
            final Task<Void> recordFatalFirebaseEvent = recordFatalFirebaseEvent(date.getTime());
            final Throwable th2 = th;
            final Thread thread2 = thread;
            final SettingsDataProvider settingsDataProvider2 = settingsDataProvider;
            try {
                Utils.awaitEvenIfOnMainThread(this.backgroundWorker.submitTask(new Callable<Task<Void>>() {
                    public Task<Void> call() throws Exception {
                        CrashlyticsController.this.crashMarker.create();
                        long access$400 = CrashlyticsController.getTimestampSeconds(date);
                        CrashlyticsController.this.reportingCoordinator.persistFatalEvent(th2, thread2, access$400);
                        CrashlyticsController.this.writeFatal(thread2, th2, access$400);
                        Settings settings = settingsDataProvider2.getSettings();
                        int i = settings.getSessionData().maxCustomExceptionEvents;
                        int i2 = settings.getSessionData().maxCompleteSessionsCount;
                        CrashlyticsController.this.doCloseSessions(i);
                        CrashlyticsController.this.doOpenSession();
                        CrashlyticsController.this.trimSessionFiles(i2);
                        if (!CrashlyticsController.this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                            return Tasks.forResult(null);
                        }
                        final Executor executor = CrashlyticsController.this.backgroundWorker.getExecutor();
                        return settingsDataProvider2.getAppSettings().onSuccessTask(executor, new SuccessContinuation<AppSettingsData, Void>() {
                            public Task<Void> then(AppSettingsData appSettingsData) throws Exception {
                                if (appSettingsData == null) {
                                    Logger.getLogger().mo8872w("Received null app settings, cannot send reports at crash time.");
                                    return Tasks.forResult(null);
                                }
                                CrashlyticsController.this.sendSessionReports(appSettingsData, true);
                                return Tasks.whenAll((Task<?>[]) new Task[]{CrashlyticsController.this.reportingCoordinator.sendReports(executor, DataTransportState.getState(appSettingsData)), recordFatalFirebaseEvent});
                            }
                        });
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    private Task<Boolean> waitForReportAction() {
        boolean isAutomaticDataCollectionEnabled = this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
        Boolean bool = Boolean.TRUE;
        if (isAutomaticDataCollectionEnabled) {
            Logger.getLogger().mo8866d("Automatic data collection is enabled. Allowing upload.");
            this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
            return Tasks.forResult(bool);
        }
        Logger.getLogger().mo8866d("Automatic data collection is disabled.");
        Logger.getLogger().mo8866d("Notifying that unsent reports are available.");
        this.unsentReportsAvailable.trySetResult(bool);
        Task<TContinuationResult> onSuccessTask = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().onSuccessTask(new SuccessContinuation<Void, Boolean>() {
            public Task<Boolean> then(Void voidR) throws Exception {
                return Tasks.forResult(Boolean.TRUE);
            }
        });
        Logger.getLogger().mo8866d("Waiting for send/deleteUnsentReports to be called.");
        return Utils.race(onSuccessTask, this.reportActionProvided.getTask());
    }

    /* access modifiers changed from: package-private */
    public boolean didCrashOnPreviousExecution() {
        if (!this.crashMarker.isPresent()) {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null || !this.nativeComponent.hasCrashDataForSession(currentSessionId)) {
                return false;
            }
            return true;
        }
        Logger.getLogger().mo8866d("Found previous crash marker.");
        this.crashMarker.remove();
        return true;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> submitAllReports(final float f, final Task<AppSettingsData> task) {
        if (!this.reportManager.areReportsAvailable()) {
            Logger.getLogger().mo8866d("No reports are available.");
            this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        Logger.getLogger().mo8866d("Unsent reports are available.");
        return waitForReportAction().onSuccessTask(new SuccessContinuation<Boolean, Void>() {
            public Task<Void> then(final Boolean bool) throws Exception {
                return CrashlyticsController.this.backgroundWorker.submitTask(new Callable<Task<Void>>() {
                    public Task<Void> call() throws Exception {
                        final List<Report> findReports = CrashlyticsController.this.reportManager.findReports();
                        if (!bool.booleanValue()) {
                            Logger.getLogger().mo8866d("Reports are being deleted.");
                            CrashlyticsController.this.reportManager.deleteReports(findReports);
                            CrashlyticsController.this.reportingCoordinator.removeAllReports();
                            CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                            return Tasks.forResult(null);
                        }
                        Logger.getLogger().mo8866d("Reports are being sent.");
                        final boolean booleanValue = bool.booleanValue();
                        CrashlyticsController.this.dataCollectionArbiter.grantDataCollectionPermission(booleanValue);
                        final Executor executor = CrashlyticsController.this.backgroundWorker.getExecutor();
                        return task.onSuccessTask(executor, new SuccessContinuation<AppSettingsData, Void>() {
                            public Task<Void> then(AppSettingsData appSettingsData) throws Exception {
                                if (appSettingsData == null) {
                                    Logger.getLogger().mo8872w("Received null app settings, cannot send reports during app startup.");
                                    return Tasks.forResult(null);
                                }
                                for (Report report : findReports) {
                                    if (report.getType() == Report.Type.JAVA) {
                                        CrashlyticsController.appendOrganizationIdToSessionFile(appSettingsData.organizationId, report.getFile());
                                    }
                                }
                                CrashlyticsController.this.reportUploaderProvider.createReportUploader(appSettingsData).uploadReportsAsync(findReports, booleanValue, f);
                                CrashlyticsController.this.reportingCoordinator.sendReports(executor, DataTransportState.getState(appSettingsData));
                                CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                                return Tasks.forResult(null);
                            }
                        });
                    }
                });
            }
        });
    }

    private ReportUploader.Provider defaultReportUploader() {
        return new ReportUploader.Provider() {
            public ReportUploader createReportUploader(AppSettingsData appSettingsData) {
                String str = appSettingsData.reportsUrl;
                String str2 = appSettingsData.ndkReportsUrl;
                return new ReportUploader(appSettingsData.organizationId, CrashlyticsController.this.appData.googleAppId, DataTransportState.getState(appSettingsData), CrashlyticsController.this.reportManager, CrashlyticsController.this.getCreateReportSpiCall(str, str2), CrashlyticsController.this.handlingExceptionCheck);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() throws Exception {
                if (CrashlyticsController.this.isHandlingException()) {
                    return null;
                }
                CrashlyticsController.this.logFileManager.writeToLog(j, str);
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    long access$400 = CrashlyticsController.getTimestampSeconds(date);
                    CrashlyticsController.this.reportingCoordinator.persistNonFatalEvent(th, thread, access$400);
                    CrashlyticsController.this.doWriteNonFatal(thread, th, access$400);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void setUserId(String str) {
        this.userMetadata.setUserId(str);
        cacheUserData(this.userMetadata);
    }

    private void cacheUserData(final UserMetadata userMetadata2) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsController.this.reportingCoordinator.persistUserId();
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), userMetadata2);
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void openSession() {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    public String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]);
        }
        return null;
    }

    static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: package-private */
    public boolean finalizeSessions(int i) {
        this.backgroundWorker.checkRunningOnThread();
        if (isHandlingException()) {
            Logger.getLogger().mo8866d("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().mo8866d("Finalizing previously open sessions.");
        try {
            doCloseSessions(i, false);
            Logger.getLogger().mo8866d("Closed all previously open sessions");
            return true;
        } catch (Exception e) {
            Logger.getLogger().mo8869e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void doOpenSession() throws Exception {
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        String obj = new CLSUUID(this.idManager).toString();
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Opening a new session with ID ");
        sb.append(obj);
        logger.mo8866d(sb.toString());
        this.nativeComponent.openSession(obj);
        writeBeginSession(obj, currentTimestampSeconds);
        writeSessionApp(obj);
        writeSessionOS(obj);
        writeSessionDevice(obj);
        this.logFileManager.setCurrentSession(obj);
        this.reportingCoordinator.onBeginSession(makeFirebaseSessionIdentifier(obj), currentTimestampSeconds);
    }

    /* access modifiers changed from: package-private */
    public void doCloseSessions(int i) throws Exception {
        doCloseSessions(i, true);
    }

    private void doCloseSessions(int i, boolean z) throws Exception {
        int i2 = !z;
        trimOpenSessions(i2 + 8);
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length <= i2) {
            Logger.getLogger().mo8866d("No open sessions to be closed.");
            return;
        }
        String sessionIdFromSessionFile = getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]);
        writeSessionUser(sessionIdFromSessionFile);
        if (z) {
            this.reportingCoordinator.onEndSession();
        } else if (this.nativeComponent.hasCrashDataForSession(sessionIdFromSessionFile)) {
            finalizePreviousNativeSession(sessionIdFromSessionFile);
            if (!this.nativeComponent.finalizeSession(sessionIdFromSessionFile)) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not finalize native session: ");
                sb.append(sessionIdFromSessionFile);
                logger.mo8866d(sb.toString());
            }
        }
        closeOpenSessions(listSortedSessionBeginFiles, i2, i);
        this.reportingCoordinator.finalizeSessions(getCurrentTimestampSeconds());
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        Logger.getLogger().mo8866d("Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Closing session: ");
            sb.append(sessionIdFromSessionFile);
            logger.mo8866d(sb.toString());
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream != null) {
            try {
                clsFileOutputStream.closeInProgressStream();
            } catch (IOException e) {
                Logger.getLogger().mo8869e("Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File delete : listSessionPartFilesFor(str)) {
            delete.delete();
        }
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching(new SessionPartFileFilter(str));
    }

    /* access modifiers changed from: package-private */
    public File[] listCompleteSessionFiles() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), SESSION_FILE_FILTER));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    public File[] listNativeSessionFileDirectories() {
        return ensureFileArrayNotNull(getNativeSessionFilesDir().listFiles());
    }

    /* access modifiers changed from: package-private */
    public File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    /* access modifiers changed from: private */
    public File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private void trimSessionEventFiles(String str, int i) {
        File filesDir = getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        Utils.capFileCount(filesDir, new FileNameContainsFilter(sb.toString()), i, SMALLEST_FILE_NAME_FIRST);
    }

    /* access modifiers changed from: package-private */
    public void trimSessionFiles(int i) {
        int capSessionCount = i - Utils.capSessionCount(getNativeSessionFilesDir(), getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, capSessionCount - Utils.capFileCount(getNonFatalSessionFilesDir(), capSessionCount, SMALLEST_FILE_NAME_FIRST), SMALLEST_FILE_NAME_FIRST);
    }

    private void trimOpenSessions(int i) {
        HashSet hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching(new AnySessionPartFileFilter()), hashSet);
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            if (!matcher.matches()) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting unknown file: ");
                sb.append(name);
                logger.mo8866d(sb.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Trimming session file: ");
                sb2.append(name);
                logger2.mo8866d(sb2.toString());
                file.delete();
            }
        }
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        Logger.getLogger().mo8866d(String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        trimSessionEventFiles(str, i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        return listFilesMatching(new FileNameContainsFilter(sb.toString()));
    }

    /* access modifiers changed from: package-private */
    public void cleanInvalidTempFiles() {
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                CrashlyticsController crashlyticsController = CrashlyticsController.this;
                crashlyticsController.doCleanInvalidTempFiles(crashlyticsController.listFilesMatching(new InvalidPartFileFilter()));
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void doCleanInvalidTempFiles(File[] fileArr) {
        final HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Found invalid session part file: ");
            sb.append(file);
            logger.mo8866d(sb.toString());
            hashSet.add(getSessionIdFromSessionFile(file));
        }
        if (!hashSet.isEmpty()) {
            for (File file2 : listFilesMatching(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Deleting invalid session file: ");
                sb2.append(file2);
                logger2.mo8866d(sb2.toString());
                file2.delete();
            }
        }
    }

    private void finalizePreviousNativeSession(String str) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Finalizing native report for session ");
        sb.append(str);
        logger.mo8866d(sb.toString());
        NativeSessionFileProvider sessionFileProvider = this.nativeComponent.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        if (minidumpFile == null || !minidumpFile.exists()) {
            Logger logger2 = Logger.getLogger();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No minidump data found for session ");
            sb2.append(str);
            logger2.mo8872w(sb2.toString());
            return;
        }
        LogFileManager logFileManager2 = new LogFileManager(this.context, this.logFileDirectoryProvider, str);
        File file = new File(getNativeSessionFilesDir(), str);
        if (!file.mkdirs()) {
            Logger.getLogger().mo8866d("Couldn't create native sessions directory");
            return;
        }
        List<NativeSessionFile> nativeSessionFiles = getNativeSessionFiles(sessionFileProvider, str, getContext(), getFilesDir(), logFileManager2.getBytesForLog());
        NativeSessionFileGzipper.processNativeSessions(file, nativeSessionFiles);
        this.reportingCoordinator.finalizeSessionWithNativeEvent(makeFirebaseSessionIdentifier(str), nativeSessionFiles);
        logFileManager2.clearLog();
    }

    private static long getCurrentTimestampSeconds() {
        return getTimestampSeconds(new Date());
    }

    /* access modifiers changed from: private */
    public static long getTimestampSeconds(Date date) {
        return date.getTime() / 1000;
    }

    private static String makeFirebaseSessionIdentifier(String str) {
        return str.replaceAll("-", "");
    }

    /* access modifiers changed from: private */
    public void writeFatal(Thread thread, Throwable th, long j) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null) {
                Logger.getLogger().mo8868e("Tried to write a fatal exception while no session was open.");
                CommonUtils.flushOrLog((Flushable) null, "Failed to flush to session begin file.");
                CommonUtils.closeOrLog((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            File filesDir = getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append(currentSessionId);
            sb.append("SessionCrash");
            clsFileOutputStream = new ClsFileOutputStream(filesDir, sb.toString());
            try {
                codedOutputStream = CodedOutputStream.newInstance(clsFileOutputStream);
                writeSessionEvent(codedOutputStream, thread, th, j, "crash", true);
            } catch (Exception e) {
                e = e;
            }
            CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to session begin file.");
            CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Exception e2) {
            e = e2;
            clsFileOutputStream = null;
            try {
                Logger.getLogger().mo8869e("An error occurred in the fatal exception logger", e);
                CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to session begin file.");
                CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to session begin file.");
                CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
            CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to session begin file.");
            CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void doWriteNonFatal(Thread thread, Throwable th, long j) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream newInstance;
        String currentSessionId = getCurrentSessionId();
        if (currentSessionId == null) {
            Logger.getLogger().mo8866d("Tried to write a non-fatal exception while no session was open.");
            return;
        }
        CodedOutputStream codedOutputStream = null;
        try {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics is logging non-fatal exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            logger.mo8866d(sb.toString());
            String padWithZerosToMaxIntWidth = CommonUtils.padWithZerosToMaxIntWidth(this.eventCounter.getAndIncrement());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currentSessionId);
            sb2.append("SessionEvent");
            sb2.append(padWithZerosToMaxIntWidth);
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), sb2.toString());
            try {
                newInstance = CodedOutputStream.newInstance(clsFileOutputStream);
            } catch (Exception e) {
                e = e;
                try {
                    Logger.getLogger().mo8869e("An error occurred in the non-fatal exception logger", e);
                    CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to non-fatal file.");
                    CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                    trimSessionEventFiles(currentSessionId, 64);
                } catch (Throwable th2) {
                    th = th2;
                    clsFileOutputStream = clsFileOutputStream;
                    codedOutputStream = codedOutputStream;
                    CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to non-fatal file.");
                    CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                    throw th;
                }
            }
            try {
                writeSessionEvent(newInstance, thread, th, j, "error", false);
                CommonUtils.flushOrLog(newInstance, "Failed to flush to non-fatal file.");
            } catch (Exception e2) {
                e = e2;
                codedOutputStream = newInstance;
                Logger.getLogger().mo8869e("An error occurred in the non-fatal exception logger", e);
                CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to non-fatal file.");
                CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                trimSessionEventFiles(currentSessionId, 64);
            } catch (Throwable th3) {
                th = th3;
                codedOutputStream = newInstance;
                CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to non-fatal file.");
                CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            Logger.getLogger().mo8869e("An error occurred in the non-fatal exception logger", e);
            CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to non-fatal file.");
            CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
            CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to non-fatal file.");
            CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
            throw th;
        }
        CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Exception e4) {
            Logger.getLogger().mo8869e("An error occurred when trimming non-fatal files.", e4);
        }
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) throws Exception {
        Throwable th;
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream newInstance;
        CodedOutputStream codedOutputStream = null;
        try {
            File filesDir = getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            clsFileOutputStream = new ClsFileOutputStream(filesDir, sb.toString());
            try {
                newInstance = CodedOutputStream.newInstance(clsFileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to flush to session ");
                sb2.append(str2);
                sb2.append(" file.");
                CommonUtils.flushOrLog(codedOutputStream, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to close session ");
                sb3.append(str2);
                sb3.append(" file.");
                CommonUtils.closeOrLog(clsFileOutputStream, sb3.toString());
                throw th;
            }
            try {
                codedOutputStreamWriteAction.writeTo(newInstance);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to flush to session ");
                sb4.append(str2);
                sb4.append(" file.");
                CommonUtils.flushOrLog(newInstance, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Failed to close session ");
                sb5.append(str2);
                sb5.append(" file.");
                CommonUtils.closeOrLog(clsFileOutputStream, sb5.toString());
            } catch (Throwable th3) {
                th = th3;
                codedOutputStream = newInstance;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("Failed to flush to session ");
                sb22.append(str2);
                sb22.append(" file.");
                CommonUtils.flushOrLog(codedOutputStream, sb22.toString());
                StringBuilder sb32 = new StringBuilder();
                sb32.append("Failed to close session ");
                sb32.append(str2);
                sb32.append(" file.");
                CommonUtils.closeOrLog(clsFileOutputStream, sb32.toString());
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
            StringBuilder sb222 = new StringBuilder();
            sb222.append("Failed to flush to session ");
            sb222.append(str2);
            sb222.append(" file.");
            CommonUtils.flushOrLog(codedOutputStream, sb222.toString());
            StringBuilder sb322 = new StringBuilder();
            sb322.append("Failed to close session ");
            sb322.append(str2);
            sb322.append(" file.");
            CommonUtils.closeOrLog(clsFileOutputStream, sb322.toString());
            throw th;
        }
    }

    private static void appendToProtoFile(File file, CodedOutputStreamWriteAction codedOutputStreamWriteAction) throws Exception {
        FileOutputStream fileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                codedOutputStream = CodedOutputStream.newInstance(fileOutputStream);
                codedOutputStreamWriteAction.writeTo(codedOutputStream);
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to flush to append to ");
                sb.append(file.getPath());
                CommonUtils.flushOrLog(codedOutputStream, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to close ");
                sb2.append(file.getPath());
                CommonUtils.closeOrLog(fileOutputStream, sb2.toString());
            } catch (Throwable th) {
                th = th;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to flush to append to ");
                sb3.append(file.getPath());
                CommonUtils.flushOrLog(codedOutputStream, sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to close ");
                sb4.append(file.getPath());
                CommonUtils.closeOrLog(fileOutputStream, sb4.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            StringBuilder sb32 = new StringBuilder();
            sb32.append("Failed to flush to append to ");
            sb32.append(file.getPath());
            CommonUtils.flushOrLog(codedOutputStream, sb32.toString());
            StringBuilder sb42 = new StringBuilder();
            sb42.append("Failed to close ");
            sb42.append(file.getPath());
            CommonUtils.closeOrLog(fileOutputStream, sb42.toString());
            throw th;
        }
    }

    private void writeBeginSession(String str, long j) throws Exception {
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{CrashlyticsCore.getVersion()});
        final String str2 = str;
        final String str3 = format;
        final long j2 = j;
        writeSessionPartFile(str, "BeginSession", new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str2, str3, j2);
            }
        });
        this.nativeComponent.writeBeginSession(str, format, j);
    }

    private void writeSessionApp(String str) throws Exception {
        String appIdentifier = this.idManager.getAppIdentifier();
        String str2 = this.appData.versionCode;
        String str3 = this.appData.versionName;
        final String str4 = appIdentifier;
        final String str5 = str2;
        final String str6 = str3;
        final String crashlyticsInstallId = this.idManager.getCrashlyticsInstallId();
        final int id = DeliveryMechanism.determineFrom(this.appData.installerPackageName).getId();
        writeSessionPartFile(str, "SessionApp", new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, str4, str5, str6, crashlyticsInstallId, id, CrashlyticsController.this.unityVersion);
            }
        });
        this.nativeComponent.writeSessionApp(str, str4, str5, str6, crashlyticsInstallId, id, this.unityVersion);
    }

    private void writeSessionOS(String str) throws Exception {
        final String str2 = Build.VERSION.RELEASE;
        final String str3 = Build.VERSION.CODENAME;
        final boolean isRooted = CommonUtils.isRooted(getContext());
        writeSessionPartFile(str, "SessionOS", new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, str2, str3, isRooted);
            }
        });
        this.nativeComponent.writeSessionOs(str, str2, str3, isRooted);
    }

    private void writeSessionDevice(String str) throws Exception {
        Context context2 = getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int cpuArchitectureInt = CommonUtils.getCpuArchitectureInt();
        String str2 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long totalRamInBytes = CommonUtils.getTotalRamInBytes();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean isEmulator = CommonUtils.isEmulator(context2);
        int deviceState = CommonUtils.getDeviceState(context2);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        final int i = cpuArchitectureInt;
        final String str5 = str2;
        final int i2 = availableProcessors;
        final long j = totalRamInBytes;
        final long j2 = blockCount;
        final boolean z = isEmulator;
        final int i3 = deviceState;
        final String str6 = str3;
        final String str7 = str4;
        writeSessionPartFile(str, "SessionDevice", new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, i, str5, i2, j, j2, z, i3, str6, str7);
            }
        });
        this.nativeComponent.writeSessionDevice(str, cpuArchitectureInt, str2, availableProcessors, totalRamInBytes, blockCount, isEmulator, deviceState, str3, str4);
    }

    private void writeSessionUser(String str) throws Exception {
        final UserMetadata userMetadata2 = getUserMetadata(str);
        writeSessionPartFile(str, "SessionUser", new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetadata2.getUserId(), (String) null, (String) null);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.util.TreeMap} */
    /* JADX WARNING: type inference failed for: r10v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeSessionEvent(com.google.firebase.crashlytics.internal.proto.CodedOutputStream r26, java.lang.Thread r27, java.lang.Throwable r28, long r29, java.lang.String r31, boolean r32) throws java.lang.Exception {
        /*
            r25 = this;
            r0 = r25
            com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r5 = new com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData
            com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy r1 = r0.stackTraceTrimmingStrategy
            r2 = r28
            r5.<init>(r2, r1)
            android.content.Context r1 = r25.getContext()
            com.google.firebase.crashlytics.internal.common.BatteryState r2 = com.google.firebase.crashlytics.internal.common.BatteryState.get(r1)
            java.lang.Float r17 = r2.getBatteryLevel()
            int r18 = r2.getBatteryVelocity()
            boolean r19 = com.google.firebase.crashlytics.internal.common.CommonUtils.getProximitySensorEnabled(r1)
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r14 = r2.orientation
            long r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.getTotalRamInBytes()
            long r6 = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateFreeRamInBytes(r1)
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r22 = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateUsedDiskSpaceInBytes(r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r13 = com.google.firebase.crashlytics.internal.common.CommonUtils.getAppProcessInfo(r4, r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r8 = r5.stacktrace
            com.google.firebase.crashlytics.internal.common.AppData r4 = r0.appData
            java.lang.String r15 = r4.buildId
            com.google.firebase.crashlytics.internal.common.IdManager r4 = r0.idManager
            java.lang.String r16 = r4.getAppIdentifier()
            r4 = 0
            if (r32 == 0) goto L_0x009a
            java.util.Map r11 = java.lang.Thread.getAllStackTraces()
            int r12 = r11.size()
            java.lang.Thread[] r12 = new java.lang.Thread[r12]
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x006b:
            boolean r20 = r11.hasNext()
            if (r20 == 0) goto L_0x0097
            java.lang.Object r20 = r11.next()
            java.util.Map$Entry r20 = (java.util.Map.Entry) r20
            java.lang.Object r21 = r20.getKey()
            java.lang.Thread r21 = (java.lang.Thread) r21
            r12[r4] = r21
            com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy r10 = r0.stackTraceTrimmingStrategy
            java.lang.Object r20 = r20.getValue()
            r32 = r11
            r11 = r20
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r10 = r10.getTrimmedStackTrace(r11)
            r9.add(r10)
            r10 = 1
            int r4 = r4 + r10
            r11 = r32
            goto L_0x006b
        L_0x0097:
            r10 = 1
            r11 = r12
            goto L_0x009e
        L_0x009a:
            r10 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r11 = r4
        L_0x009e:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.getBooleanResourceValue(r1, r4, r10)
            if (r1 != 0) goto L_0x00ac
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x00c2
        L_0x00ac:
            com.google.firebase.crashlytics.internal.common.UserMetadata r1 = r0.userMetadata
            java.util.Map r1 = r1.getCustomKeys()
            if (r1 == 0) goto L_0x00c2
            int r4 = r1.size()
            if (r4 <= r10) goto L_0x00c2
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r24 = r4
            goto L_0x00c4
        L_0x00c2:
            r24 = r1
        L_0x00c4:
            com.google.firebase.crashlytics.internal.log.LogFileManager r1 = r0.logFileManager
            byte[] r12 = r1.getBytesForLog()
            r10 = 8
            long r20 = r2 - r6
            r1 = r26
            r2 = r29
            r4 = r31
            r6 = r27
            r7 = r8
            r8 = r11
            r11 = r24
            r24 = r15
            r15 = r16
            r16 = r24
            com.google.firebase.crashlytics.internal.proto.SessionProtobufHelper.writeSessionEvent(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22)
            com.google.firebase.crashlytics.internal.log.LogFileManager r1 = r0.logFileManager
            r1.clearLog()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.writeSessionEvent(com.google.firebase.crashlytics.internal.proto.CodedOutputStream, java.lang.Thread, java.lang.Throwable, long, java.lang.String, boolean):void");
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Collecting session parts for ID ");
        sb.append(str);
        logger.mo8866d(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("SessionCrash");
        File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(sb2.toString()));
        boolean z = listFilesMatching != null && listFilesMatching.length > 0;
        Logger.getLogger().mo8866d(String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("SessionEvent");
        File[] listFilesMatching2 = listFilesMatching(new FileNameContainsFilter(sb3.toString()));
        boolean z2 = listFilesMatching2 != null && listFilesMatching2.length > 0;
        Logger.getLogger().mo8866d(String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, listFilesMatching2, i), z ? listFilesMatching[0] : null);
        } else {
            Logger logger2 = Logger.getLogger();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("No events present for session ID ");
            sb4.append(str);
            logger2.mo8866d(sb4.toString());
        }
        Logger logger3 = Logger.getLogger();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Removing session part files for ID ");
        sb5.append(str);
        logger3.mo8866d(sb5.toString());
        deleteSessionPartFilesFor(str);
    }

    private void synthesizeSessionFile(File file, String str, File[] fileArr, File file2) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream newInstance;
        boolean z = file2 != null;
        File fatalSessionFilesDir = z ? getFatalSessionFilesDir() : getNonFatalSessionFilesDir();
        if (!fatalSessionFilesDir.exists()) {
            fatalSessionFilesDir.mkdirs();
        }
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(fatalSessionFilesDir, str);
            try {
                newInstance = CodedOutputStream.newInstance(clsFileOutputStream);
            } catch (Exception e) {
                e = e;
                try {
                    Logger logger = Logger.getLogger();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to write session file for session ID: ");
                    sb.append(str);
                    logger.mo8869e(sb.toString(), e);
                    CommonUtils.flushOrLog(codedOutputStream, "Error flushing session file stream");
                    closeWithoutRenamingOrLog(clsFileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.flushOrLog(codedOutputStream, "Error flushing session file stream");
                    CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close CLS file");
                    throw th;
                }
            }
            try {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Collecting SessionStart data for session ID ");
                sb2.append(str);
                logger2.mo8866d(sb2.toString());
                writeToCosFromFile(newInstance, file);
                newInstance.writeUInt64(4, getCurrentTimestampSeconds());
                newInstance.writeBool(5, z);
                newInstance.writeUInt32(11, 1);
                newInstance.writeEnum(12, 3);
                writeInitialPartsTo(newInstance, str);
                writeNonFatalEventsTo(newInstance, fileArr, str);
                if (z) {
                    writeToCosFromFile(newInstance, file2);
                }
                CommonUtils.flushOrLog(newInstance, "Error flushing session file stream");
                CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close CLS file");
            } catch (Exception e2) {
                e = e2;
                codedOutputStream = newInstance;
                Logger logger3 = Logger.getLogger();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to write session file for session ID: ");
                sb3.append(str);
                logger3.mo8869e(sb3.toString(), e);
                CommonUtils.flushOrLog(codedOutputStream, "Error flushing session file stream");
                closeWithoutRenamingOrLog(clsFileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                codedOutputStream = newInstance;
                CommonUtils.flushOrLog(codedOutputStream, "Error flushing session file stream");
                CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close CLS file");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            Logger logger32 = Logger.getLogger();
            StringBuilder sb32 = new StringBuilder();
            sb32.append("Failed to write session file for session ID: ");
            sb32.append(str);
            logger32.mo8869e(sb32.toString(), e);
            CommonUtils.flushOrLog(codedOutputStream, "Error flushing session file stream");
            closeWithoutRenamingOrLog(clsFileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
            CommonUtils.flushOrLog(codedOutputStream, "Error flushing session file stream");
            CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close CLS file");
            throw th;
        }
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, CommonUtils.FILE_MODIFIED_COMPARATOR);
        for (File file : fileArr) {
            try {
                Logger.getLogger().mo8866d(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                writeToCosFromFile(codedOutputStream, file);
            } catch (Exception e) {
                Logger.getLogger().mo8869e("Error writting non-fatal to session.", e);
            }
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) throws IOException {
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(".cls");
            File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(sb.toString()));
            if (listFilesMatching.length == 0) {
                Logger logger = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find ");
                sb2.append(str2);
                sb2.append(" data for session ID ");
                sb2.append(str);
                logger.mo8866d(sb2.toString());
            } else {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Collecting ");
                sb3.append(str2);
                sb3.append(" data for session ID ");
                sb3.append(str);
                logger2.mo8866d(sb3.toString());
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void appendOrganizationIdToSessionFile(final String str, File file) throws Exception {
        if (str != null) {
            appendToProtoFile(file, new CodedOutputStreamWriteAction() {
                public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                    SessionProtobufHelper.writeSessionAppClsId(codedOutputStream, str);
                }
            });
        }
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) throws IOException {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to include a file that doesn't exist: ");
            sb.append(file.getName());
            logger.mo8868e(sb.toString());
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                copyToCodedOutputStream(fileInputStream, codedOutputStream, (int) file.length());
                CommonUtils.closeOrLog(fileInputStream, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                CommonUtils.closeOrLog(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            CommonUtils.closeOrLog(fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private UserMetadata getUserMetadata(String str) {
        if (isHandlingException()) {
            return this.userMetadata;
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    /* access modifiers changed from: package-private */
    public boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    /* access modifiers changed from: package-private */
    public File getFilesDir() {
        return this.fileStore.getFilesDir();
    }

    /* access modifiers changed from: package-private */
    public File getNativeSessionFilesDir() {
        return new File(getFilesDir(), "native-sessions");
    }

    /* access modifiers changed from: package-private */
    public File getFatalSessionFilesDir() {
        return new File(getFilesDir(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public void registerAnalyticsListener() {
        boolean register = this.analyticsReceiver.register();
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Registered Firebase Analytics event listener for breadcrumbs: ");
        sb.append(register);
        logger.mo8866d(sb.toString());
    }

    /* access modifiers changed from: private */
    public CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String stringsFileValue = CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(stringsFileValue, str, this.httpRequestFactory, CrashlyticsCore.getVersion()), new NativeCreateReportSpiCall(stringsFileValue, str2, this.httpRequestFactory, CrashlyticsCore.getVersion()));
    }

    /* access modifiers changed from: private */
    public void sendSessionReports(AppSettingsData appSettingsData, boolean z) throws Exception {
        Context context2 = getContext();
        ReportUploader createReportUploader = this.reportUploaderProvider.createReportUploader(appSettingsData);
        for (File file : listCompleteSessionFiles()) {
            appendOrganizationIdToSessionFile(appSettingsData.organizationId, file);
            this.backgroundWorker.submit((Runnable) new SendReportRunnable(context2, new SessionReport(file, SEND_AT_CRASHTIME_HEADER), createReportUploader, z));
        }
    }

    static class BlockingCrashEventListener implements AnalyticsReceiver.CrashlyticsOriginEventListener {
        private final CountDownLatch eventLatch;

        private BlockingCrashEventListener() {
            this.eventLatch = new CountDownLatch(1);
        }

        public void awaitEvent() throws InterruptedException {
            Logger.getLogger().mo8866d("Background thread awaiting app exception callback from FA...");
            if (this.eventLatch.await(2000, TimeUnit.MILLISECONDS)) {
                Logger.getLogger().mo8866d("App exception callback received from FA listener.");
            } else {
                Logger.getLogger().mo8866d("Timeout exceeded while awaiting app exception callback from FA listener.");
            }
        }

        public void onCrashlyticsOriginEvent(int i, Bundle bundle) {
            if ("_ae".equals(bundle.getString("name"))) {
                this.eventLatch.countDown();
            }
        }
    }

    private Task<Void> recordFatalFirebaseEvent(final long j) {
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() {
            public Void call() throws Exception {
                if (CrashlyticsController.this.firebaseCrashExists()) {
                    Logger.getLogger().mo8866d("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    return null;
                } else if (CrashlyticsController.this.analyticsConnector == null) {
                    Logger.getLogger().mo8866d("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
                    return null;
                } else {
                    BlockingCrashEventListener blockingCrashEventListener = new BlockingCrashEventListener();
                    CrashlyticsController.this.analyticsReceiver.setCrashlyticsOriginEventListener(blockingCrashEventListener);
                    Logger.getLogger().mo8866d("Logging Crashlytics event to Firebase");
                    Bundle bundle = new Bundle();
                    bundle.putInt("fatal", 1);
                    bundle.putLong("timestamp", j);
                    CrashlyticsController.this.analyticsConnector.logEvent("clx", "_ae", bundle);
                    blockingCrashEventListener.awaitEvent();
                    CrashlyticsController.this.analyticsReceiver.setCrashlyticsOriginEventListener((AnalyticsReceiver.CrashlyticsOriginEventListener) null);
                    return null;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final class ReportUploaderHandlingExceptionCheck implements ReportUploader.HandlingExceptionCheck {
        private ReportUploaderHandlingExceptionCheck() {
        }

        public final boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }
    }

    final class ReportUploaderFilesProvider implements ReportUploader.ReportFilesProvider {
        private ReportUploaderFilesProvider() {
        }

        public final File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        public final File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    static final class SendReportRunnable implements Runnable {
        private final Context context;
        private final boolean dataCollectionToken;
        private final Report report;
        private final ReportUploader reportUploader;

        public SendReportRunnable(Context context2, Report report2, ReportUploader reportUploader2, boolean z) {
            this.context = context2;
            this.report = report2;
            this.reportUploader = reportUploader2;
            this.dataCollectionToken = z;
        }

        public final void run() {
            if (CommonUtils.canTryConnection(this.context)) {
                Logger.getLogger().mo8866d("Attempting to send crash report at time of crash...");
                this.reportUploader.uploadReport(this.report, this.dataCollectionToken);
            }
        }
    }

    static List<NativeSessionFile> getNativeSessionFiles(NativeSessionFileProvider nativeSessionFileProvider, String str, Context context2, File file, byte[] bArr) {
        byte[] bArr2;
        MetaDataStore metaDataStore = new MetaDataStore(file);
        File userDataFileForSession = metaDataStore.getUserDataFileForSession(str);
        File keysFileForSession = metaDataStore.getKeysFileForSession(str);
        try {
            bArr2 = NativeFileUtils.binaryImagesJsonFromMapsFile(nativeSessionFileProvider.getBinaryImagesFile(), context2);
        } catch (Exception unused) {
            bArr2 = null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new BytesBackedNativeSessionFile("binary_images_file", "binaryImages", bArr2));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", "device", nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(new FileBackedNativeSessionFile("minidump_file", "minidump", nativeSessionFileProvider.getMinidumpFile()));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", userDataFileForSession));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", "keys", keysFileForSession));
        return arrayList;
    }

    static final class LogFileDirectoryProvider implements LogFileManager.DirectoryProvider {
        private final FileStore rootFileStore;

        public LogFileDirectoryProvider(FileStore fileStore) {
            this.rootFileStore = fileStore;
        }

        public final File getLogFileDir() {
            File file = new File(this.rootFileStore.getFilesDir(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }
}
