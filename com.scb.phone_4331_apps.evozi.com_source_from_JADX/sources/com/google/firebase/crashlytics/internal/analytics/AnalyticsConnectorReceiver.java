package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsReceiver;
import org.json.JSONException;
import org.json.JSONObject;

public class AnalyticsConnectorReceiver implements AnalyticsConnector.AnalyticsConnectorListener, AnalyticsReceiver {
    private final AnalyticsConnector analyticsConnector;
    private AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandle;
    private final BreadcrumbHandler breadcrumbHandler;
    private AnalyticsReceiver.CrashlyticsOriginEventListener crashOriginEventListener;

    public interface BreadcrumbHandler {
        void dropBreadcrumb(String str);
    }

    public AnalyticsConnectorReceiver(AnalyticsConnector analyticsConnector2, BreadcrumbHandler breadcrumbHandler2) {
        this.analyticsConnector = analyticsConnector2;
        this.breadcrumbHandler = breadcrumbHandler2;
    }

    public boolean register() {
        AnalyticsConnector analyticsConnector2 = this.analyticsConnector;
        if (analyticsConnector2 == null) {
            Logger.getLogger().mo8866d("Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener = analyticsConnector2.registerAnalyticsConnectorListener("clx", this);
        this.analyticsConnectorHandle = registerAnalyticsConnectorListener;
        if (registerAnalyticsConnectorListener == null) {
            Logger.getLogger().mo8866d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener2 = this.analyticsConnector.registerAnalyticsConnectorListener("crash", this);
            this.analyticsConnectorHandle = registerAnalyticsConnectorListener2;
            if (registerAnalyticsConnectorListener2 != null) {
                Logger.getLogger().mo8872w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (this.analyticsConnectorHandle != null) {
            return true;
        }
        return false;
    }

    public void setCrashlyticsOriginEventListener(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener) {
        this.crashOriginEventListener = crashlyticsOriginEventListener;
    }

    public void onMessageTriggered(int i, Bundle bundle) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("AnalyticsConnectorReceiver received message: ");
        sb.append(i);
        sb.append(" ");
        sb.append(bundle);
        logger.mo8866d(sb.toString());
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                dispatchCrashlyticsOriginEvent(i, bundle);
                return;
            }
            String string = bundle.getString("name");
            if (string != null) {
                dispatchBreadcrumbEvent(string, bundle2);
            }
        }
    }

    private void dispatchCrashlyticsOriginEvent(int i, Bundle bundle) {
        AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener = this.crashOriginEventListener;
        if (crashlyticsOriginEventListener != null) {
            crashlyticsOriginEventListener.onCrashlyticsOriginEvent(i, bundle);
        }
    }

    private void dispatchBreadcrumbEvent(String str, Bundle bundle) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("$A$:");
            sb.append(serializeEvent(str, bundle));
            this.breadcrumbHandler.dropBreadcrumb(sb.toString());
        } catch (JSONException unused) {
            Logger.getLogger().mo8872w("Unable to serialize Firebase Analytics event.");
        }
    }

    private static String serializeEvent(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
