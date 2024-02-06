package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.buildFromJson$MediaBrowserCompat$MediaItem */
public final class buildFromJson$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
    public static final buildFromJson$MediaBrowserCompat$MediaItem IconCompatParcelizer = new buildFromJson$MediaBrowserCompat$MediaItem();

    buildFromJson$MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getUndersizeImage getundersizeimage = (getUndersizeImage) obj;
        getundersizeimage.MediaDescriptionCompat();
        getundersizeimage.MediaBrowserCompat$CustomActionResultReceiver(true);
        getundersizeimage.write(false);
    }
}
