package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class CrashlyticsReportPersistence {
    private static final FilenameFilter EVENT_FILE_FILTER = CrashlyticsReportPersistence$$Lambda$6.lambdaFactory$();
    private static final int EVENT_NAME_LENGTH = 15;
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = CrashlyticsReportPersistence$$Lambda$5.lambdaFactory$();
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final File nativeReportsDirectory;
    private final File openSessionsDirectory;
    private final File priorityReportsDirectory;
    private final File reportsDirectory;
    private final SettingsDataProvider settingsDataProvider;

    public CrashlyticsReportPersistence(File file, SettingsDataProvider settingsDataProvider2) {
        File file2 = new File(file, "report-persistence");
        this.openSessionsDirectory = new File(file2, "sessions");
        this.priorityReportsDirectory = new File(file2, "priority-reports");
        this.reportsDirectory = new File(file2, "reports");
        this.nativeReportsDirectory = new File(file2, "native-reports");
        this.settingsDataProvider = settingsDataProvider2;
    }

    public void persistReport(CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().mo8866d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            File prepareDirectory = prepareDirectory(getSessionDirectoryById(identifier));
            writeTextFile(new File(prepareDirectory, "report"), TRANSFORM.reportToJson(crashlyticsReport));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not persist report for session ");
            sb.append(identifier);
            logger.mo8867d(sb.toString(), e);
        }
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str, boolean z) {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCustomExceptionEvents;
        File sessionDirectoryById = getSessionDirectoryById(str);
        try {
            writeTextFile(new File(sessionDirectoryById, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not persist event for session ");
            sb.append(str);
            logger.mo8867d(sb.toString(), e);
        }
        trimEvents(sessionDirectoryById, i);
    }

    public void persistUserIdForSession(String str, String str2) {
        try {
            writeTextFile(new File(getSessionDirectoryById(str2), "user"), str);
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not persist user ID for session ");
            sb.append(str2);
            logger.mo8867d(sb.toString(), e);
        }
    }

    public void deleteAllReports() {
        for (File delete : getAllFinalizedReportFiles()) {
            delete.delete();
        }
    }

    public void deleteFinalizedReport(String str) {
        FilenameFilter lambdaFactory$ = CrashlyticsReportPersistence$$Lambda$1.lambdaFactory$(str);
        for (File delete : combineReportFiles(getFilesInDirectory(this.priorityReportsDirectory, lambdaFactory$), getFilesInDirectory(this.nativeReportsDirectory, lambdaFactory$), getFilesInDirectory(this.reportsDirectory, lambdaFactory$))) {
            delete.delete();
        }
    }

    public void finalizeReports(String str, long j) {
        for (File next : capAndGetOpenSessions(str)) {
            synthesizeReport(next, j);
            recursiveDelete(next);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload) {
        synthesizeNativeReportFile(new File(getSessionDirectoryById(str), "report"), this.nativeReportsDirectory, filesPayload, str);
    }

    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(allFinalizedReportFiles.size());
        for (File next : getAllFinalizedReportFiles()) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(next)), next.getName()));
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not load report file ");
                sb.append(next);
                sb.append("; deleting");
                logger.mo8867d(sb.toString(), e);
                next.delete();
            }
        }
        return arrayList;
    }

    private List<File> capAndGetOpenSessions(String str) {
        List<File> filesInDirectory = getFilesInDirectory(this.openSessionsDirectory, CrashlyticsReportPersistence$$Lambda$2.lambdaFactory$(str));
        Collections.sort(filesInDirectory, LATEST_SESSION_ID_FIRST_COMPARATOR);
        if (filesInDirectory.size() <= 8) {
            return filesInDirectory;
        }
        for (File recursiveDelete : filesInDirectory.subList(8, filesInDirectory.size())) {
            recursiveDelete(recursiveDelete);
        }
        return filesInDirectory.subList(0, 8);
    }

    static /* synthetic */ boolean lambda$capAndGetOpenSessions$3(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    private void capFinalizedReports() {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCompleteSessionsCount;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size > i) {
            for (File delete : allFinalizedReportFiles.subList(i, size)) {
                delete.delete();
            }
        }
    }

    private List<File> getAllFinalizedReportFiles() {
        return sortAndCombineReportFiles(combineReportFiles(getAllFilesInDirectory(this.priorityReportsDirectory), getAllFilesInDirectory(this.nativeReportsDirectory)), getAllFilesInDirectory(this.reportsDirectory));
    }

    private File getSessionDirectoryById(String str) {
        return new File(this.openSessionsDirectory, str);
    }

    private void synthesizeReport(File file, long j) {
        boolean z;
        List<File> filesInDirectory = getFilesInDirectory(file, EVENT_FILE_FILTER);
        if (!filesInDirectory.isEmpty()) {
            Collections.sort(filesInDirectory);
            ArrayList arrayList = new ArrayList();
            Iterator<File> it = filesInDirectory.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    File next = it.next();
                    try {
                        arrayList.add(TRANSFORM.eventFromJson(readTextFile(next)));
                        if (z || isHighPriorityEventFile(next.getName())) {
                            z = true;
                        }
                    } catch (IOException e) {
                        Logger logger = Logger.getLogger();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Could not add event to report for ");
                        sb.append(next);
                        logger.mo8867d(sb.toString(), e);
                    }
                }
            }
            String str = null;
            try {
                str = readTextFile(new File(file, "user"));
            } catch (IOException e2) {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not read user ID file in ");
                sb2.append(file.getName());
                logger2.mo8867d(sb2.toString(), e2);
            }
            synthesizeReportFile(new File(file, "report"), z ? this.priorityReportsDirectory : this.reportsDirectory, arrayList, j, z, str);
        }
    }

    private static void synthesizeNativeReportFile(File file, File file2, CrashlyticsReport.FilesPayload filesPayload, String str) {
        try {
            writeTextFile(new File(prepareDirectory(file2), str), TRANSFORM.reportToJson(TRANSFORM.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload)));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not synthesize final native report file for ");
            sb.append(file);
            logger.mo8867d(sb.toString(), e);
        }
    }

    private static void synthesizeReportFile(File file, File file2, List<CrashlyticsReport.Session.Event> list, long j, boolean z, String str) {
        try {
            CrashlyticsReport withEvents = TRANSFORM.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withEvents(ImmutableList.from(list));
            CrashlyticsReport.Session session = withEvents.getSession();
            if (session != null) {
                writeTextFile(new File(prepareDirectory(file2), session.getIdentifier()), TRANSFORM.reportToJson(withEvents));
            }
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not synthesize final report file for ");
            sb.append(file);
            logger.mo8867d(sb.toString(), e);
        }
    }

    private static List<File> sortAndCombineReportFiles(List<File>... listArr) {
        for (List<File> sort : listArr) {
            Collections.sort(sort, LATEST_SESSION_ID_FIRST_COMPARATOR);
        }
        return combineReportFiles(listArr);
    }

    private static List<File> combineReportFiles(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> size : listArr) {
            i += size.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    private static boolean isHighPriorityEventFile(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static boolean isNormalPriorityEventFile(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    private static String generateEventFilename(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        String str = z ? "_" : "";
        StringBuilder sb = new StringBuilder();
        sb.append("event");
        sb.append(format);
        sb.append(str);
        return sb.toString();
    }

    private static int trimEvents(File file, int i) {
        List<File> filesInDirectory = getFilesInDirectory(file, CrashlyticsReportPersistence$$Lambda$3.lambdaFactory$());
        Collections.sort(filesInDirectory, CrashlyticsReportPersistence$$Lambda$4.lambdaFactory$());
        return capFilesCount(filesInDirectory, i);
    }

    private static String getEventNameWithoutPriority(String str) {
        return str.substring(0, EVENT_NAME_LENGTH);
    }

    /* access modifiers changed from: private */
    public static int oldestEventFileFirst(File file, File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    private static List<File> getAllFilesInDirectory(File file) {
        return getFilesInDirectory(file, (FileFilter) null);
    }

    private static List<File> getFilesInDirectory(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> getFilesInDirectory(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static File prepareDirectory(File file) throws IOException {
        if (makeDirectory(file)) {
            return file;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not create directory ");
        sb.append(file);
        throw new IOException(sb.toString());
    }

    private static boolean makeDirectory(File file) {
        return file.exists() || file.mkdirs();
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    private static String readTextFile(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    private static int capFilesCount(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            recursiveDelete(next);
            size--;
        }
        return size;
    }

    private static void recursiveDelete(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File recursiveDelete : file.listFiles()) {
                    recursiveDelete(recursiveDelete);
                }
            }
            file.delete();
        }
    }
}
