package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.modifyString$MediaBrowserCompat$MediaItem */
final class modifyString$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
    private /* synthetic */ isValue IconCompatParcelizer;

    modifyString$MediaBrowserCompat$MediaItem(isValue isvalue) {
        this.IconCompatParcelizer = isvalue;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(false);
        iconCompatParcelizer.read(false);
        iconCompatParcelizer.MediaSessionCompat$QueueItem();
        iconCompatParcelizer.MediaBrowserCompat$MediaItem();
        iconCompatParcelizer.read();
        iconCompatParcelizer.MediaMetadataCompat();
        iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer.MediaSessionCompat$QueueItem);
    }
}
