package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStoreImpl;
import com.google.firebase.crashlytics.internal.report.ReportManager;
import com.google.firebase.crashlytics.internal.report.ReportUploader;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.unity.ResourceUnityVersionProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CrashlyticsCore {
    private final AnalyticsConnector analyticsConnector;
    private final FirebaseApp app;
    private CrashlyticsBackgroundWorker backgroundWorker;
    private final Context context;
    /* access modifiers changed from: private */
    public CrashlyticsController controller;
    private ExecutorService crashHandlerExecutor;
    private CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final IdManager idManager;
    /* access modifiers changed from: private */
    public CrashlyticsFileMarker initializationMarker;
    private CrashlyticsNativeComponent nativeComponent;
    private final long startTime;

    public static String getVersion() {
        return "17.0.1";
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager2, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter2, AnalyticsConnector analyticsConnector2) {
        this(firebaseApp, idManager2, crashlyticsNativeComponent, dataCollectionArbiter2, analyticsConnector2, ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler"));
    }

    CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager2, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter2, AnalyticsConnector analyticsConnector2, ExecutorService executorService) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter2;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager2;
        this.nativeComponent = crashlyticsNativeComponent;
        this.analyticsConnector = analyticsConnector2;
        this.crashHandlerExecutor = executorService;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.startTime = System.currentTimeMillis();
    }

    public boolean onPreExecute(SettingsDataProvider settingsDataProvider) {
        String mappingFileId = CommonUtils.getMappingFileId(this.context);
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Mapping file ID is: ");
        sb.append(mappingFileId);
        logger.mo8866d(sb.toString());
        if (isBuildIdValid(mappingFileId, CommonUtils.getBooleanResourceValue(this.context, "com.crashlytics.RequireBuildId", true))) {
            String applicationId = this.app.getOptions().getApplicationId();
            try {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Initializing Crashlytics ");
                sb2.append(getVersion());
                logger2.mo8870i(sb2.toString());
                FileStoreImpl fileStoreImpl = new FileStoreImpl(this.context);
                this.crashMarker = new CrashlyticsFileMarker("crash_marker", fileStoreImpl);
                this.initializationMarker = new CrashlyticsFileMarker("initialization_marker", fileStoreImpl);
                HttpRequestFactory httpRequestFactory = new HttpRequestFactory();
                AppData create = AppData.create(this.context, this.idManager, applicationId, mappingFileId);
                ResourceUnityVersionProvider resourceUnityVersionProvider = new ResourceUnityVersionProvider(this.context);
                AnalyticsConnectorReceiver analyticsConnectorReceiver = new AnalyticsConnectorReceiver(this.analyticsConnector, new AnalyticsConnectorReceiver.BreadcrumbHandler() {
                    public void dropBreadcrumb(String str) {
                        CrashlyticsCore.this.log(str);
                    }
                });
                Logger logger3 = Logger.getLogger();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Installer package name is: ");
                sb3.append(create.installerPackageName);
                logger3.mo8866d(sb3.toString());
                this.controller = new CrashlyticsController(this.context, this.backgroundWorker, httpRequestFactory, this.idManager, this.dataCollectionArbiter, fileStoreImpl, this.crashMarker, create, (ReportManager) null, (ReportUploader.Provider) null, this.nativeComponent, resourceUnityVersionProvider, analyticsConnectorReceiver, this.analyticsConnector, settingsDataProvider);
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                this.controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), settingsDataProvider);
                if (!didPreviousInitializationFail || !CommonUtils.canTryConnection(this.context)) {
                    Logger.getLogger().mo8866d("Exception handling initialization successful");
                    return true;
                }
                Logger.getLogger().mo8866d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                finishInitSynchronously(settingsDataProvider);
                return false;
            } catch (Exception e) {
                Logger.getLogger().mo8869e("Crashlytics was not started due to an exception during initialization", e);
                this.controller = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    public Task<Void> doBackgroundInitializationAsync(final SettingsDataProvider settingsDataProvider) {
        return Utils.callTask(this.crashHandlerExecutor, new Callable<Task<Void>>() {
            public Task<Void> call() throws Exception {
                return CrashlyticsCore.this.doBackgroundInitialization(settingsDataProvider);
            }
        });
    }

    /* access modifiers changed from: private */
    public Task<Void> doBackgroundInitialization(SettingsDataProvider settingsDataProvider) {
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            this.controller.registerAnalyticsListener();
            Settings settings = settingsDataProvider.getSettings();
            if (!settings.getFeaturesData().collectReports) {
                Logger.getLogger().mo8866d("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.controller.finalizeSessions(settings.getSessionData().maxCustomExceptionEvents)) {
                Logger.getLogger().mo8866d("Could not finalize previous sessions.");
            }
            Task<Void> submitAllReports = this.controller.submitAllReports(1.0f, settingsDataProvider.getAppSettings());
            markInitializationComplete();
            return submitAllReports;
        } catch (Exception e) {
            Logger.getLogger().mo8869e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return Tasks.forException(e);
        } finally {
            markInitializationComplete();
        }
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(z);
    }

    public void logException(Throwable th) {
        this.controller.writeNonFatalException(Thread.currentThread(), th);
    }

    public void log(String str) {
        this.controller.writeToLog(System.currentTimeMillis() - this.startTime, str);
    }

    public void setUserId(String str) {
        this.controller.setUserId(str);
    }

    private void finishInitSynchronously(final SettingsDataProvider settingsDataProvider) {
        Future<?> submit = this.crashHandlerExecutor.submit(new Runnable() {
            public void run() {
                Task unused = CrashlyticsCore.this.doBackgroundInitialization(settingsDataProvider);
            }
        });
        Logger.getLogger().mo8866d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.getLogger().mo8869e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Logger.getLogger().mo8869e("Problem encountered during Crashlytics initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.getLogger().mo8869e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* access modifiers changed from: package-private */
    public void markInitializationStarted() {
        this.backgroundWorker.checkRunningOnThread();
        this.initializationMarker.create();
        Logger.getLogger().mo8866d("Initialization marker file created.");
    }

    /* access modifiers changed from: package-private */
    public void markInitializationComplete() {
        this.backgroundWorker.submit(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    Logger logger = Logger.getLogger();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Initialization marker file removed: ");
                    sb.append(remove);
                    logger.mo8866d(sb.toString());
                    return Boolean.valueOf(remove);
                } catch (Exception e) {
                    Logger.getLogger().mo8869e("Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    private void checkForPreviousCrash() {
        try {
            this.didCrashOnPreviousExecution = Boolean.TRUE.equals((Boolean) Utils.awaitEvenIfOnMainThread(this.backgroundWorker.submit(new Callable<Boolean>() {
                public Boolean call() throws Exception {
                    return Boolean.valueOf(CrashlyticsCore.this.controller.didCrashOnPreviousExecution());
                }
            })));
        } catch (Exception unused) {
            this.didCrashOnPreviousExecution = false;
        }
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            Logger.getLogger().mo8866d("Configured not to require a build ID.");
            return true;
        } else if (!CommonUtils.isNullOrEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }
}
