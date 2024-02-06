package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.hl$MediaBrowserCompat$CustomActionResultReceiver */
public final class hl$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<C6941xae337a3a> {
    private /* synthetic */ C4773hl MediaBrowserCompat$ItemReceiver;

    public hl$MediaBrowserCompat$CustomActionResultReceiver(C4773hl hlVar) {
        this.MediaBrowserCompat$ItemReceiver = hlVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((C6941xae337a3a) obj).MediaBrowserCompat$ItemReceiver(C4773hl.write(this.MediaBrowserCompat$ItemReceiver.write));
    }
}
