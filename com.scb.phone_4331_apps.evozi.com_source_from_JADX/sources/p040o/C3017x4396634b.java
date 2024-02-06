package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.AnalyticsReceiver;

/* renamed from: o.AnalyticsReceiver$CrashlyticsOriginEventListener$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3017x4396634b {
    private C3017x4396634b() {
    }

    public /* synthetic */ C3017x4396634b(byte b) {
        this();
    }

    public static AnalyticsReceiver.CrashlyticsOriginEventListener IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        for (AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener : AnalyticsReceiver.CrashlyticsOriginEventListener.values()) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) crashlyticsOriginEventListener.name(), (Object) str)) {
                return crashlyticsOriginEventListener;
            }
        }
        return null;
    }
}
