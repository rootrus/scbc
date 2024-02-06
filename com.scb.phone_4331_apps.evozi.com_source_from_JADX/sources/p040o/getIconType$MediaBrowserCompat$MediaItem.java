package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getIconType$MediaBrowserCompat$MediaItem */
final class getIconType$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontImage> {
    public static final getIconType$MediaBrowserCompat$MediaItem IconCompatParcelizer = new getIconType$MediaBrowserCompat$MediaItem();

    getIconType$MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFrontImage getfrontimage = (getFrontImage) obj;
        getfrontimage.MediaBrowserCompat$ItemReceiver();
        getfrontimage.MediaMetadataCompat();
    }
}
