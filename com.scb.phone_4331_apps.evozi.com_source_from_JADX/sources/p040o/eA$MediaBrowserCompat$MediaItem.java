package p040o;

import p040o.getProjectAsync;
import p040o.writeUInt64NoTag;

/* renamed from: o.eA$MediaBrowserCompat$MediaItem */
final class eA$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getProjectAsync.write> {
    public static final eA$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver = new eA$MediaBrowserCompat$MediaItem();

    eA$MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getProjectAsync.write write = (getProjectAsync.write) obj;
        write.MediaDescriptionCompat();
        write.RatingCompat();
        write.MediaBrowserCompat$ItemReceiver();
    }
}
