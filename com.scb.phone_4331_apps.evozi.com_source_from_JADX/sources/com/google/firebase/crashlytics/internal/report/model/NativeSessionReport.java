package com.google.firebase.crashlytics.internal.report.model;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.util.Map;

public class NativeSessionReport implements Report {
    private final File reportDirectory;

    public Map<String, String> getCustomHeaders() {
        return null;
    }

    public File getFile() {
        return null;
    }

    public String getFileName() {
        return null;
    }

    public NativeSessionReport(File file) {
        this.reportDirectory = file;
    }

    public void remove() {
        for (File file : getFiles()) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Removing native report file at ");
            sb.append(file.getPath());
            logger.mo8866d(sb.toString());
            file.delete();
        }
        Logger logger2 = Logger.getLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Removing native report directory at ");
        sb2.append(this.reportDirectory);
        logger2.mo8866d(sb2.toString());
        this.reportDirectory.delete();
    }

    public String getIdentifier() {
        return this.reportDirectory.getName();
    }

    public File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    public Report.Type getType() {
        return Report.Type.NATIVE;
    }
}
