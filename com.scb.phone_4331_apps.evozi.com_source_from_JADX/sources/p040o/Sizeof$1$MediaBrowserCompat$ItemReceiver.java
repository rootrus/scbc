package p040o;

import p040o.C10829Sizeof;

/* renamed from: o.Sizeof$1$MediaBrowserCompat$ItemReceiver */
public class Sizeof$1$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getPlace> {
    /* synthetic */ C10829Sizeof.C37931 MediaBrowserCompat$ItemReceiver;

    public Sizeof$1$MediaBrowserCompat$ItemReceiver(C10829Sizeof.C37931 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        getPlace getplace = (getPlace) obj;
        C10829Sizeof.C37931 r0 = this.MediaBrowserCompat$ItemReceiver;
        r0.Keep = r0.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(getplace.MediaDescriptionCompat, getplace.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction.write.setCheckable());
        C10829Sizeof.C37931 r02 = this.MediaBrowserCompat$ItemReceiver;
        getKippVersion getkippversion = new getKippVersion(this, getplace);
        if (r02.RatingCompat != null) {
            getkippversion.IconCompatParcelizer(r02.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
    }

    public final void onComplete() {
        super.onComplete();
    }
}
