package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nT$MediaBrowserCompat$CustomActionResultReceiver */
public final class nT$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706212> {
    private /* synthetic */ C5021nT IconCompatParcelizer;

    public nT$MediaBrowserCompat$CustomActionResultReceiver(C5021nT nTVar) {
        this.IconCompatParcelizer = nTVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C706212) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.write, (String) null, this.IconCompatParcelizer.read, (String) null, (String) null, true, false, (String) null, 72));
    }
}
