package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getSettings$MediaSessionCompat$QueueItem */
public final class getSettings$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<gePayeeName> {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public getSettings$MediaSessionCompat$QueueItem(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((gePayeeName) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
