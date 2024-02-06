package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dJ$MediaBrowserCompat$ItemReceiver */
public final class dJ$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdRegion$MediaBrowserCompat$ItemReceiver> {
    private /* synthetic */ String read;

    public dJ$MediaBrowserCompat$ItemReceiver(String str) {
        this.read = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdRegion$MediaBrowserCompat$ItemReceiver) obj).write(this.read);
    }
}
