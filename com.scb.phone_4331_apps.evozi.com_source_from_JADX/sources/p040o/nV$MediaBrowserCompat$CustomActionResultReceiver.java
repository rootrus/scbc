package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nV$MediaBrowserCompat$CustomActionResultReceiver */
public final class nV$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706313> {
    private /* synthetic */ boolean write;

    public nV$MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.write = z;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C706313) obj).IconCompatParcelizer(this.write);
    }
}
