package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;

public enum DataTransportState {
    NONE,
    JAVA_ONLY,
    ALL;
    
    static final int REPORT_UPLOAD_VARIANT_DATATRANSPORT = 2;
    static final int REPORT_UPLOAD_VARIANT_LEGACY = 1;

    static DataTransportState getState(boolean z, boolean z2) {
        if (!z) {
            return NONE;
        }
        if (!z2) {
            return JAVA_ONLY;
        }
        return ALL;
    }

    static DataTransportState getState(AppSettingsData appSettingsData) {
        boolean z = false;
        boolean z2 = appSettingsData.reportUploadVariant == 2;
        if (appSettingsData.nativeReportUploadVariant == 2) {
            z = true;
        }
        return getState(z2, z);
    }
}
