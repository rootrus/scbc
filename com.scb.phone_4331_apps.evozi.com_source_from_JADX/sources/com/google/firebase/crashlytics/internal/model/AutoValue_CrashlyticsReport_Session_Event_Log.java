package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {
    private final String content;

    private AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.content = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Log{content=");
        sb.append(this.content);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.content.equals(((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    public final int hashCode() {
        return this.content.hashCode() ^ 1000003;
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {
        private String content;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Log.Builder setContent(String str) {
            if (str != null) {
                this.content = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }

        public final CrashlyticsReport.Session.Event.Log build() {
            String str;
            if (this.content == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" content");
                str = sb.toString();
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(this.content);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
