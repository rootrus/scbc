package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
final class C0328x7c929f5b extends CrashlyticsReport.Session.Event.Application.Execution.Signal {
    private final long address;
    private final String code;
    private final String name;

    private C0328x7c929f5b(String str, String str2, long j) {
        this.name = str;
        this.code = str2;
        this.address = j;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final long getAddress() {
        return this.address;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Signal{name=");
        sb.append(this.name);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", address=");
        sb.append(this.address);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        if (!this.name.equals(signal.getName()) || !this.code.equals(signal.getCode()) || this.address != signal.getAddress()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.code.hashCode();
        long j = this.address;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
        private Long address;
        private String code;
        private String name;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str != null) {
                this.code = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j) {
            this.address = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str;
            if (this.name == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" name");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.code == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" code");
                str = sb2.toString();
            }
            if (this.address == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" address");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C0328x7c929f5b(this.name, this.code, this.address.longValue());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
