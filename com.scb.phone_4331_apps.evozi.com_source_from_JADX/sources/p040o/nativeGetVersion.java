package p040o;

/* renamed from: o.nativeGetVersion */
public class nativeGetVersion extends writeUInt64NoTag<IdCaptureModule_GetProcessingParametersFactory> {
    final toLongArray IconCompatParcelizer;
    private final continueWith MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public nativeGetVersion(RegularImmutableBiMap regularImmutableBiMap, continueWith continuewith, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = continuewith;
        this.IconCompatParcelizer = tolongarray;
    }

    public void onDestroy() {
        continueWith continuewith = this.MediaBrowserCompat$ItemReceiver;
        if (!continuewith.MediaBrowserCompat$MediaItem.isDisposed()) {
            continuewith.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
