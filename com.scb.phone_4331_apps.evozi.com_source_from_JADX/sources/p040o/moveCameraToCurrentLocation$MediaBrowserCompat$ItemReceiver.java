package p040o;

/* renamed from: o.moveCameraToCurrentLocation$MediaBrowserCompat$ItemReceiver */
public final class moveCameraToCurrentLocation$MediaBrowserCompat$ItemReceiver implements MwCurrentUserEwalletActivity {
    private /* synthetic */ moveCameraToCurrentLocation IconCompatParcelizer;
    private /* synthetic */ Runnable read;

    moveCameraToCurrentLocation$MediaBrowserCompat$ItemReceiver(moveCameraToCurrentLocation movecameratocurrentlocation, Runnable runnable) {
        this.IconCompatParcelizer = movecameratocurrentlocation;
        this.read = runnable;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.read.removeCallbacks(this.read);
    }
}
