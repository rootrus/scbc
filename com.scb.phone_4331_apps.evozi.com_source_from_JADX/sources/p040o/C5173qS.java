package p040o;

import p040o.AbstractIterator;
import p040o.AppMeasurementSdk;
import p040o.getLastKnownLocation;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.qS */
public final class C5173qS extends getLastKnownLocation<getTopLeftCornerWidth.PlaybackStateCompat.CustomAction> {
    private final AbstractIterator.C30031 MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5173qS(AbstractIterator.C30031 r2, toShortArray toshortarray, AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, RegularImmutableBiMap regularImmutableBiMap) {
        super(toshortarray, conditionalUserProperty, regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "remittanceSuccessCase");
        onGetStartedClick.write((Object) toshortarray, "favouriteTargetDisplayMapper");
        onGetStartedClick.write((Object) conditionalUserProperty, "transferAndPayCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = r2;
    }

    public final void IconCompatParcelizer(String str, int i) {
        super.IconCompatParcelizer(str, i);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void IconCompatParcelizer() {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) conditionalUserProperty, "transferAndPayCase");
        conditionalUserProperty.MediaBrowserCompat$CustomActionResultReceiver();
        this.read.IconCompatParcelizer(new getLastKnownLocation.read());
    }
}
