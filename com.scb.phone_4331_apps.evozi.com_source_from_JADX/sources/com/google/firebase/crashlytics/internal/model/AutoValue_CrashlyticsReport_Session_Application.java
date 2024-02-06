package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {
    private final String displayVersion;
    private final String identifier;
    private final String installationUuid;
    private final CrashlyticsReport.Session.Application.Organization organization;
    private final String version;

    private AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization2, String str4) {
        this.identifier = str;
        this.version = str2;
        this.displayVersion = str3;
        this.organization = organization2;
        this.installationUuid = str4;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getDisplayVersion() {
        return this.displayVersion;
    }

    public final CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.organization;
    }

    public final String getInstallationUuid() {
        return this.installationUuid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Application{identifier=");
        sb.append(this.identifier);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", displayVersion=");
        sb.append(this.displayVersion);
        sb.append(", organization=");
        sb.append(this.organization);
        sb.append(", installationUuid=");
        sb.append(this.installationUuid);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (this.identifier.equals(application.getIdentifier()) && this.version.equals(application.getVersion()) && ((str = this.displayVersion) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization2 = this.organization) != null ? organization2.equals(application.getOrganization()) : application.getOrganization() == null)) {
            String str2 = this.installationUuid;
            if (str2 == null) {
                if (application.getInstallationUuid() == null) {
                    return true;
                }
            } else if (str2.equals(application.getInstallationUuid())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.identifier.hashCode();
        int hashCode2 = this.version.hashCode();
        String str = this.displayVersion;
        int i = 0;
        int hashCode3 = str == null ? 0 : str.hashCode();
        CrashlyticsReport.Session.Application.Organization organization2 = this.organization;
        int hashCode4 = organization2 == null ? 0 : organization2.hashCode();
        String str2 = this.installationUuid;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i;
    }

    static final class Builder extends CrashlyticsReport.Session.Application.Builder {
        private String displayVersion;
        private String identifier;
        private String installationUuid;
        private CrashlyticsReport.Session.Application.Organization organization;
        private String version;

        Builder() {
        }

        public final CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public final CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str != null) {
                this.version = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        public final CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.displayVersion = str;
            return this;
        }

        public final CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.installationUuid = str;
            return this;
        }

        public final CrashlyticsReport.Session.Application build() {
            String str;
            if (this.identifier == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" identifier");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.version == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" version");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application(this.identifier, this.version, this.displayVersion, this.organization, this.installationUuid);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }
}
