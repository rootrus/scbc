package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {
    private final byte[] contents;
    private final String filename;

    private AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.filename = str;
        this.contents = bArr;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final byte[] getContents() {
        return this.contents;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("File{filename=");
        sb.append(this.filename);
        sb.append(", contents=");
        sb.append(Arrays.toString(this.contents));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.filename.equals(file.getFilename())) {
            if (Arrays.equals(this.contents, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).contents : file.getContents())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.filename.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.contents);
    }

    static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {
        private byte[] contents;
        private String filename;

        Builder() {
        }

        public final CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str != null) {
                this.filename = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }

        public final CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr != null) {
                this.contents = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        public final CrashlyticsReport.FilesPayload.File build() {
            String str;
            if (this.filename == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" filename");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.contents == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" contents");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(this.filename, this.contents);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }
}
