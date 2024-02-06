package p040o;

import p040o.access$2300;

/* renamed from: o.gM$MediaBrowserCompat$CustomActionResultReceiver */
final class gM$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<newLatLngBoundsWithSize> {
    final /* synthetic */ C4455gM IconCompatParcelizer;

    public final void onComplete() {
    }

    private gM$MediaBrowserCompat$CustomActionResultReceiver(C4455gM gMVar) {
        this.IconCompatParcelizer = gMVar;
    }

    /* synthetic */ gM$MediaBrowserCompat$CustomActionResultReceiver(C4455gM gMVar, byte b) {
        this(gMVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4455gM gMVar = this.IconCompatParcelizer;
        C4448gE gEVar = new C4448gE(this, (newLatLngBoundsWithSize) obj);
        if (gMVar.RatingCompat != null) {
            gEVar.IconCompatParcelizer(gMVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
