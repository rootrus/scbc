package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$1$MediaBrowserCompat$MediaItem */
public final class FieldNamingPolicy$1$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.write> {
    private /* synthetic */ intoSet MediaBrowserCompat$CustomActionResultReceiver;

    public FieldNamingPolicy$1$MediaBrowserCompat$MediaItem(intoSet intoset) {
        this.MediaBrowserCompat$CustomActionResultReceiver = intoset;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.write write = (getFirstName.write) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
        if (str != null) {
            write.MediaMetadataCompat(str);
        }
    }
}
