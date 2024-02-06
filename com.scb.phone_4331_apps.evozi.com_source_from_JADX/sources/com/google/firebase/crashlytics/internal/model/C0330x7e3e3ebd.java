package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
final class C0330x7e3e3ebd extends CrashlyticsReport.Session.Event.Application.Execution.Thread {
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
    private final int importance;
    private final String name;

    private C0330x7e3e3ebd(String str, int i, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
        this.name = str;
        this.importance = i;
        this.frames = immutableList;
    }

    public final String getName() {
        return this.name;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.frames;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Thread{name=");
        sb.append(this.name);
        sb.append(", importance=");
        sb.append(this.importance);
        sb.append(", frames=");
        sb.append(this.frames);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        if (!this.name.equals(thread.getName()) || this.importance != thread.getImportance() || !this.frames.equals(thread.getFrames())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.importance) * 1000003) ^ this.frames.hashCode();
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> frames;
        private Integer importance;
        private String name;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
            if (immutableList != null) {
                this.frames = immutableList;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str;
            if (this.name == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" name");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.importance == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" importance");
                str = sb2.toString();
            }
            if (this.frames == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" frames");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C0330x7e3e3ebd(this.name, this.importance.intValue(), this.frames);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
