package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nV$MediaBrowserCompat$ItemReceiver */
public final class nV$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706313> {
    private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ String write;

    public nV$MediaBrowserCompat$ItemReceiver(boolean z, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.write = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ServerProjectProvider.C706313 r2 = (ServerProjectProvider.C706313) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            r2.read(this.write);
        } else {
            r2.IconCompatParcelizer(this.write);
        }
    }
}
