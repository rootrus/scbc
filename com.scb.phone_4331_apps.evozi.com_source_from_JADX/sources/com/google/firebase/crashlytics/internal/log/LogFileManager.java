package com.google.firebase.crashlytics.internal.log;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Set;

public class LogFileManager {
    private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
    private final Context context;
    private FileLogStore currentLog;
    private final DirectoryProvider directoryProvider;

    public interface DirectoryProvider {
        File getLogFileDir();
    }

    public LogFileManager(Context context2, DirectoryProvider directoryProvider2) {
        this(context2, directoryProvider2, (String) null);
    }

    public LogFileManager(Context context2, DirectoryProvider directoryProvider2, String str) {
        this.context = context2;
        this.directoryProvider = directoryProvider2;
        this.currentLog = NOOP_LOG_STORE;
        setCurrentSession(str);
    }

    public final void setCurrentSession(String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str != null) {
            if (!CommonUtils.getBooleanResourceValue(this.context, "com.crashlytics.CollectCustomLogs", true)) {
                Logger.getLogger().mo8866d("Preferences requested no custom logs. Aborting log file creation.");
            } else {
                setLogFile(getWorkingFileForSession(str), 65536);
            }
        }
    }

    public void writeToLog(long j, String str) {
        this.currentLog.writeToLog(j, str);
    }

    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    public String getLogString() {
        return this.currentLog.getLogAsString();
    }

    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    public void discardOldLogFiles(Set<String> set) {
        File[] listFiles = this.directoryProvider.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(getSessionIdForFile(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setLogFile(File file, int i) {
        this.currentLog = new QueueFileLogStore(file, i);
    }

    private File getWorkingFileForSession(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("crashlytics-userlog-");
        sb.append(str);
        sb.append(".temp");
        return new File(this.directoryProvider.getLogFileDir(), sb.toString());
    }

    private String getSessionIdForFile(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }

    static final class NoopLogStore implements FileLogStore {
        public final void closeLogFile() {
        }

        public final void deleteLogFile() {
        }

        public final byte[] getLogAsBytes() {
            return null;
        }

        public final String getLogAsString() {
            return null;
        }

        public final void writeToLog(long j, String str) {
        }

        private NoopLogStore() {
        }
    }
}
