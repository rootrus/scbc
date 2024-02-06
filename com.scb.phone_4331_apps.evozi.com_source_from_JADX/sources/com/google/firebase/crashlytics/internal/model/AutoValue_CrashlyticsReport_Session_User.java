package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {
    private final String identifier;

    private AutoValue_CrashlyticsReport_Session_User(String str) {
        this.identifier = str;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{identifier=");
        sb.append(this.identifier);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.identifier.equals(((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    public final int hashCode() {
        return this.identifier.hashCode() ^ 1000003;
    }

    static final class Builder extends CrashlyticsReport.Session.User.Builder {
        private String identifier;

        Builder() {
        }

        public final CrashlyticsReport.Session.User.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public final CrashlyticsReport.Session.User build() {
            String str;
            if (this.identifier == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" identifier");
                str = sb.toString();
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_User(this.identifier);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
