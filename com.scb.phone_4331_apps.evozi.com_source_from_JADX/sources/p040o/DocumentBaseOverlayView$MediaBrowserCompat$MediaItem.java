package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentBaseOverlayView$MediaBrowserCompat$MediaItem */
final class DocumentBaseOverlayView$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<C7134hH> {
    private /* synthetic */ getPlaceIds MediaBrowserCompat$ItemReceiver;

    DocumentBaseOverlayView$MediaBrowserCompat$MediaItem(getPlaceIds getplaceids) {
        this.MediaBrowserCompat$ItemReceiver = getplaceids;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((C7134hH) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.read, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }
}
