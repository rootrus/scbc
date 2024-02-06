package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;

public interface AnalyticsReceiver {

    public interface CrashlyticsOriginEventListener {
        void onCrashlyticsOriginEvent(int i, Bundle bundle);
    }

    boolean register();

    void setCrashlyticsOriginEventListener(CrashlyticsOriginEventListener crashlyticsOriginEventListener);
}
