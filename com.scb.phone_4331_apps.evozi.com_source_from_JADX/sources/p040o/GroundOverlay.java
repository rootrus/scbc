package p040o;

import p040o.StreetViewPanoramaFragment;

/* renamed from: o.GroundOverlay */
public final /* synthetic */ class GroundOverlay implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ doGoAsync read;

    public /* synthetic */ GroundOverlay(doGoAsync dogoasync) {
        this.read = dogoasync;
    }

    public final Object write(Object obj) {
        doGoAsync dogoasync = this.read;
        setActivity setactivity = (setActivity) obj;
        if ("PAYMENT".equalsIgnoreCase(setactivity.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
            return dogoasync.read.MediaBrowserCompat$ItemReceiver(setactivity.MediaSessionCompat$ResultReceiverWrapper.read, (String) null).onErrorResumeNext(DebitCardResetOtpActivity.just(new StreetViewPanoramaFragment.zza()));
        }
        return DebitCardResetOtpActivity.just(new StreetViewPanoramaFragment.zza());
    }
}
