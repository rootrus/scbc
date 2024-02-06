package p040o;

import p040o.access$2300;

/* renamed from: o.fc$MediaBrowserCompat$ItemReceiver */
public final class fc$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnPolygonClickListener> {
    private /* synthetic */ C4419fc read;

    public final void onComplete() {
    }

    private fc$MediaBrowserCompat$ItemReceiver(C4419fc fcVar) {
        this.read = fcVar;
    }

    public /* synthetic */ fc$MediaBrowserCompat$ItemReceiver(C4419fc fcVar, byte b) {
        this(fcVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4419fc fcVar = this.read;
        getCores unused = fcVar.IconCompatParcelizer = fcVar.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver((setOnPolygonClickListener) obj, this.read.write.read.setItemInvoker());
        if (this.read.MediaSessionCompat$QueueItem) {
            C4419fc.MediaDescriptionCompat(this.read);
        } else {
            C4419fc.MediaBrowserCompat$SearchResultReceiver(this.read);
        }
    }

    public final void onError(Throwable th) {
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
