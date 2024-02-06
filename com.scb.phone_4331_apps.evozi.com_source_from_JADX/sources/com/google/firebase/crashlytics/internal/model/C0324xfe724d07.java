package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
final class C0324xfe724d07 extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {
    private final long baseAddress;
    private final String name;
    private final long size;
    private final String uuid;

    private C0324xfe724d07(long j, long j2, String str, String str2) {
        this.baseAddress = j;
        this.size = j2;
        this.name = str;
        this.uuid = str2;
    }

    public final long getBaseAddress() {
        return this.baseAddress;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BinaryImage{baseAddress=");
        sb.append(this.baseAddress);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.baseAddress == binaryImage.getBaseAddress() && this.size == binaryImage.getSize() && this.name.equals(binaryImage.getName())) {
            String str = this.uuid;
            if (str == null) {
                if (binaryImage.getUuid() == null) {
                    return true;
                }
            } else if (str.equals(binaryImage.getUuid())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.baseAddress;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.size;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int hashCode = this.name.hashCode();
        String str = this.uuid;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ hashCode) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
        private Long baseAddress;
        private String name;
        private Long size;
        private String uuid;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j) {
            this.baseAddress = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j) {
            this.size = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(String str) {
            this.uuid = str;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            String str;
            if (this.baseAddress == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" baseAddress");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.size == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" size");
                str = sb2.toString();
            }
            if (this.name == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" name");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C0324xfe724d07(this.baseAddress.longValue(), this.size.longValue(), this.name, this.uuid);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
