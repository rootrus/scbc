package com.google.firebase.crashlytics.internal.proto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class ClsFileOutputStream extends FileOutputStream {
    public static final FilenameFilter TEMP_FILENAME_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    };
    private boolean closed = false;
    private File complete;
    private File inProgress;
    private final String root;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClsFileOutputStream(java.io.File r4, java.lang.String r5) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = ".cls_temp"
            r0.append(r1)
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r0.toString()
            r2.<init>(r4, r0)
            r3.<init>(r2)
            r0 = 0
            r3.closed = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = java.io.File.separator
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.root = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.root
            r4.append(r5)
            r4.append(r1)
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            r3.inProgress = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.proto.ClsFileOutputStream.<init>(java.io.File, java.lang.String):void");
    }

    public void close() throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.closed = true;
                super.flush();
                super.close();
                StringBuilder sb = new StringBuilder();
                sb.append(this.root);
                sb.append(".cls");
                File file = new File(sb.toString());
                if (this.inProgress.renameTo(file)) {
                    this.inProgress = null;
                    this.complete = file;
                    return;
                }
                String str = !file.exists() ? !this.inProgress.exists() ? " (source does not exist)" : "" : " (target already exists)";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not rename temp file: ");
                sb2.append(this.inProgress);
                sb2.append(" -> ");
                sb2.append(file);
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
        }
    }

    public void closeInProgressStream() throws IOException {
        if (!this.closed) {
            this.closed = true;
            super.flush();
            super.close();
        }
    }
}
