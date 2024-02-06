package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.sp$MediaBrowserCompat$CustomActionResultReceiver */
public final class sp$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70684.read> {
    private /* synthetic */ immediateFailedFuture read;

    public sp$MediaBrowserCompat$CustomActionResultReceiver(immediateFailedFuture immediatefailedfuture) {
        this.read = immediatefailedfuture;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C70684.read) obj).read(this.read);
    }
}
