package com.google.firebase.analytics.connector;

import android.os.Bundle;

public interface AnalyticsConnector {

    public interface AnalyticsConnectorHandle {
    }

    public interface AnalyticsConnectorListener {
        void onMessageTriggered(int i, Bundle bundle);
    }

    void logEvent(String str, String str2, Bundle bundle);

    AnalyticsConnectorHandle registerAnalyticsConnectorListener(String str, AnalyticsConnectorListener analyticsConnectorListener);

    void setUserProperty(String str, String str2, Object obj);
}
