package p040o;

import java.util.Enumeration;

/* renamed from: o.PrepaidTravelConversionLandingActivity */
final class PrepaidTravelConversionLandingActivity implements Enumeration {
    private final /* synthetic */ Enumeration MediaBrowserCompat$CustomActionResultReceiver;

    PrepaidTravelConversionLandingActivity(Enumeration enumeration) {
        this.MediaBrowserCompat$CustomActionResultReceiver = enumeration;
    }

    public final boolean hasMoreElements() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.hasMoreElements();
    }

    public final Object nextElement() {
        return ((PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver) this.MediaBrowserCompat$CustomActionResultReceiver.nextElement()).read.get();
    }
}
