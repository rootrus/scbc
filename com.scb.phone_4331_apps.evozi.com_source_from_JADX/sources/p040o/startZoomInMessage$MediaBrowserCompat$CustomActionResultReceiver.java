package p040o;

import p040o.access$2300;

/* renamed from: o.startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver */
public class startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanoramaFragment> {
    final String IconCompatParcelizer;
    final /* synthetic */ startZoomInMessage write;

    public final /* synthetic */ void onNext(Object obj) {
        StreetViewPanoramaFragment streetViewPanoramaFragment = (StreetViewPanoramaFragment) obj;
        boolean z = true;
        if ((this.write.RatingCompat != null) && streetViewPanoramaFragment != null) {
            startZoomInMessage startzoominmessage = this.write;
            showFitWithinFrameMessage showfitwithinframemessage = new showFitWithinFrameMessage(this, streetViewPanoramaFragment);
            if (startzoominmessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                showfitwithinframemessage.IconCompatParcelizer(startzoominmessage.RatingCompat);
            }
        }
    }

    public startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver(startZoomInMessage startzoominmessage, String str) {
        this.write = startzoominmessage;
        this.IconCompatParcelizer = str;
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
