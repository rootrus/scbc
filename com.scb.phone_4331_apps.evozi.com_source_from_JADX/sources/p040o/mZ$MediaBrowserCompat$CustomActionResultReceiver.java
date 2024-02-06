package p040o;

/* renamed from: o.mZ$MediaBrowserCompat$CustomActionResultReceiver */
public final class mZ$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<MapView> {
    private /* synthetic */ C4962mZ write;

    private mZ$MediaBrowserCompat$CustomActionResultReceiver(C4962mZ mZVar) {
        this.write = mZVar;
    }

    public /* synthetic */ mZ$MediaBrowserCompat$CustomActionResultReceiver(C4962mZ mZVar, byte b) {
        this(mZVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        MapView mapView = (MapView) obj;
        if (!(this.write.IconCompatParcelizer == null || mapView == null)) {
            this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.write.ParcelableVolumeInfo.write(mapView, this.write.MediaSessionCompat$QueueItem, this.write.write, this.write.MediaBrowserCompat$SearchResultReceiver, this.write.MediaBrowserCompat$ItemReceiver, this.write.MediaMetadataCompat));
            C4962mZ.MediaDescriptionCompat(this.write);
        }
        boolean unused = this.write.read = false;
    }

    public final void onError(Throwable th) {
        if (this.write.IconCompatParcelizer != null && !this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.write.RatingCompat(th);
            boolean unused = this.write.read = false;
            this.write.IconCompatParcelizer.IconCompatParcelizer(true);
        }
    }
}
