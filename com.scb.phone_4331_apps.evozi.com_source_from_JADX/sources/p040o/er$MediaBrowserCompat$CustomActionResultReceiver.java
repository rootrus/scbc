package p040o;

import p040o.access$2300;

/* renamed from: o.er$MediaBrowserCompat$CustomActionResultReceiver */
final class er$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnPolygonClickListener> {
    private /* synthetic */ C4382er write;

    public final void onComplete() {
    }

    private er$MediaBrowserCompat$CustomActionResultReceiver(C4382er erVar) {
        this.write = erVar;
    }

    /* synthetic */ er$MediaBrowserCompat$CustomActionResultReceiver(C4382er erVar, byte b) {
        this(erVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4382er.write(this.write);
        C4382er erVar = this.write;
        getCores unused = erVar.write = erVar.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver((setOnPolygonClickListener) obj, this.write.MediaDescriptionCompat.IconCompatParcelizer.setItemInvoker());
        C4382er.MediaDescriptionCompat(this.write);
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
