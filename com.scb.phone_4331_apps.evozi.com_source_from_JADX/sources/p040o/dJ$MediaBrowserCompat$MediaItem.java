package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dJ$MediaBrowserCompat$MediaItem */
public final class dJ$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<IdRegion$MediaBrowserCompat$ItemReceiver> {
    public static final dJ$MediaBrowserCompat$MediaItem write = new dJ$MediaBrowserCompat$MediaItem();

    dJ$MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdRegion$MediaBrowserCompat$ItemReceiver) obj).read();
    }
}
