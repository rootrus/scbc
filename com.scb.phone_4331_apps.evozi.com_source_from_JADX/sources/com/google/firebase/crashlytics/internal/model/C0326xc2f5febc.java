package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
final class C0326xc2f5febc extends CrashlyticsReport.Session.Event.Application.Execution.Exception {
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception causedBy;
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
    private final int overflowCount;
    private final String reason;
    private final String type;

    private C0326xc2f5febc(String str, String str2, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.type = str;
        this.reason = str2;
        this.frames = immutableList;
        this.causedBy = exception;
        this.overflowCount = i;
    }

    public final String getType() {
        return this.type;
    }

    public final String getReason() {
        return this.reason;
    }

    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.frames;
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
        return this.causedBy;
    }

    public final int getOverflowCount() {
        return this.overflowCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception{type=");
        sb.append(this.type);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", frames=");
        sb.append(this.frames);
        sb.append(", causedBy=");
        sb.append(this.causedBy);
        sb.append(", overflowCount=");
        sb.append(this.overflowCount);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (!this.type.equals(exception2.getType()) || ((str = this.reason) != null ? !str.equals(exception2.getReason()) : exception2.getReason() != null) || !this.frames.equals(exception2.getFrames()) || ((exception = this.causedBy) != null ? !exception.equals(exception2.getCausedBy()) : exception2.getCausedBy() != null) || this.overflowCount != exception2.getOverflowCount()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        String str = this.reason;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.frames.hashCode();
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.causedBy;
        if (exception != null) {
            i = exception.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ this.overflowCount;
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {
        private CrashlyticsReport.Session.Event.Application.Execution.Exception causedBy;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
        private Integer overflowCount;
        private String reason;
        private String type;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(String str) {
            this.reason = str;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
            if (immutableList != null) {
                this.frames = immutableList;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.causedBy = exception;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i) {
            this.overflowCount = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
            String str;
            if (this.type == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" type");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.frames == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" frames");
                str = sb2.toString();
            }
            if (this.overflowCount == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" overflowCount");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C0326xc2f5febc(this.type, this.reason, this.frames, this.causedBy, this.overflowCount.intValue());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
