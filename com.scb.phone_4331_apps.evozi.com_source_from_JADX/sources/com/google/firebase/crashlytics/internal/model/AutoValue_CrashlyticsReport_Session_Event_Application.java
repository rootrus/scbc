package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {
    private final Boolean background;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
    private final CrashlyticsReport.Session.Event.Application.Execution execution;
    private final int uiOrientation;

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution2, ImmutableList<CrashlyticsReport.CustomAttribute> immutableList, Boolean bool, int i) {
        this.execution = execution2;
        this.customAttributes = immutableList;
        this.background = bool;
        this.uiOrientation = i;
    }

    public final CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.execution;
    }

    public final ImmutableList<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.customAttributes;
    }

    public final Boolean getBackground() {
        return this.background;
    }

    public final int getUiOrientation() {
        return this.uiOrientation;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Application{execution=");
        sb.append(this.execution);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", uiOrientation=");
        sb.append(this.uiOrientation);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (!this.execution.equals(application.getExecution()) || ((immutableList = this.customAttributes) != null ? !immutableList.equals(application.getCustomAttributes()) : application.getCustomAttributes() != null) || ((bool = this.background) != null ? !bool.equals(application.getBackground()) : application.getBackground() != null) || this.uiOrientation != application.getUiOrientation()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.execution.hashCode();
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList = this.customAttributes;
        int i = 0;
        int hashCode2 = immutableList == null ? 0 : immutableList.hashCode();
        Boolean bool = this.background;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ this.uiOrientation;
    }

    public final CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {
        private Boolean background;
        private ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
        private CrashlyticsReport.Session.Event.Application.Execution execution;
        private Integer uiOrientation;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.execution = application.getExecution();
            this.customAttributes = application.getCustomAttributes();
            this.background = application.getBackground();
            this.uiOrientation = Integer.valueOf(application.getUiOrientation());
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution2) {
            if (execution2 != null) {
                this.execution = execution2;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.customAttributes = immutableList;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setBackground(Boolean bool) {
            this.background = bool;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.uiOrientation = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application build() {
            String str;
            if (this.execution == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" execution");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.uiOrientation == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uiOrientation");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.execution, this.customAttributes, this.background, this.uiOrientation.intValue());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }
}
