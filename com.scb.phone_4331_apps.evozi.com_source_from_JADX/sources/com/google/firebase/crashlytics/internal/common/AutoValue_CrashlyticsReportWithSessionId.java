package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {
    private final CrashlyticsReport report;
    private final String sessionId;

    AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str) {
        if (crashlyticsReport != null) {
            this.report = crashlyticsReport;
            if (str != null) {
                this.sessionId = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public final CrashlyticsReport getReport() {
        return this.report;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CrashlyticsReportWithSessionId{report=");
        sb.append(this.report);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        if (!this.report.equals(crashlyticsReportWithSessionId.getReport()) || !this.sessionId.equals(crashlyticsReportWithSessionId.getSessionId())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.report.hashCode() ^ 1000003) * 1000003) ^ this.sessionId.hashCode();
    }
}
