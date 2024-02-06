package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
final class C0332xce3d994b extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {
    private final String file;
    private final int importance;
    private final long offset;

    /* renamed from: pc */
    private final long f55pc;
    private final String symbol;

    private C0332xce3d994b(long j, String str, String str2, long j2, int i) {
        this.f55pc = j;
        this.symbol = str;
        this.file = str2;
        this.offset = j2;
        this.importance = i;
    }

    public final long getPc() {
        return this.f55pc;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getFile() {
        return this.file;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frame{pc=");
        sb.append(this.f55pc);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", importance=");
        sb.append(this.importance);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.f55pc == frame.getPc() && this.symbol.equals(frame.getSymbol()) && ((str = this.file) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.offset == frame.getOffset() && this.importance == frame.getImportance()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f55pc;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.symbol.hashCode();
        String str = this.file;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.offset;
        return ((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.importance;
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
        private String file;
        private Integer importance;
        private Long offset;

        /* renamed from: pc */
        private Long f56pc;
        private String symbol;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j) {
            this.f56pc = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str != null) {
                this.symbol = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.file = str;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j) {
            this.offset = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str;
            if (this.f56pc == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" pc");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.symbol == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" symbol");
                str = sb2.toString();
            }
            if (this.offset == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" offset");
                str = sb3.toString();
            }
            if (this.importance == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" importance");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new C0332xce3d994b(this.f56pc.longValue(), this.symbol, this.file, this.offset.longValue(), this.importance.intValue());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }
}
