package p040o;

import java.util.List;
import p040o.C10829Sizeof;

/* renamed from: o.decrementRemainingLicenseCount */
public final /* synthetic */ class decrementRemainingLicenseCount implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C10829Sizeof.C37931 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ decrementRemainingLicenseCount(C10829Sizeof.C37931 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof.C37931 r0 = this.MediaBrowserCompat$ItemReceiver;
        r0.write(r0.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver((List<PlaceLikelihoodBuffer>) (List) obj, r0.PlaybackStateCompat$CustomAction.write.setCheckable()).read);
        newLicenseOverlayView newlicenseoverlayview = newLicenseOverlayView.IconCompatParcelizer;
        if (r0.RatingCompat != null) {
            newlicenseoverlayview.IconCompatParcelizer(r0.RatingCompat);
        }
    }
}
