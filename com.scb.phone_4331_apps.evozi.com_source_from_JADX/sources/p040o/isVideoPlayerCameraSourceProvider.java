package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isVideoPlayerCameraSourceProvider */
public final /* synthetic */ class isVideoPlayerCameraSourceProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getAssetProvider MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isVideoPlayerCameraSourceProvider(getAssetProvider getassetprovider) {
        this.MediaBrowserCompat$ItemReceiver = getassetprovider;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7512tW) obj).read(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
    }
}
