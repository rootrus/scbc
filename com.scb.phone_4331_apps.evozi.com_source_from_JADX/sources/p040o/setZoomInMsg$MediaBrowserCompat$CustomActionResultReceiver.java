package p040o;

import p040o.StreetViewPanorama;
import p040o.access$2300;

/* renamed from: o.setZoomInMsg$MediaBrowserCompat$CustomActionResultReceiver */
public class setZoomInMsg$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanorama.OnStreetViewPanoramaClickListener> {
    final /* synthetic */ setZoomInMsg read;

    private setZoomInMsg$MediaBrowserCompat$CustomActionResultReceiver(setZoomInMsg setzoominmsg) {
        this.read = setzoominmsg;
    }

    public /* synthetic */ setZoomInMsg$MediaBrowserCompat$CustomActionResultReceiver(setZoomInMsg setzoominmsg, byte b) {
        this(setzoominmsg);
    }

    public final /* synthetic */ void onNext(Object obj) {
        StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener = (StreetViewPanorama.OnStreetViewPanoramaClickListener) obj;
        boolean z = true;
        if (this.read.RatingCompat != null) {
            setZoomInMsg setzoominmsg = this.read;
            CrashlyticsReport unused = setzoominmsg.MediaBrowserCompat$ItemReceiver = setzoominmsg.MediaMetadataCompat.IconCompatParcelizer(onStreetViewPanoramaClickListener);
            setZoomInMsg setzoominmsg2 = this.read;
            C4732hR hRVar = new C4732hR(this);
            if (setzoominmsg2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                hRVar.IconCompatParcelizer(setzoominmsg2.RatingCompat);
            }
            setZoomInMsg.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    public final void onError(Throwable th) {
        if (this.read.RatingCompat != null) {
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
