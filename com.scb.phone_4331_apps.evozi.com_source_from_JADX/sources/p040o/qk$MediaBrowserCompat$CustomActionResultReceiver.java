package p040o;

import java.util.List;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.qk$MediaBrowserCompat$CustomActionResultReceiver */
final class qk$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706414> {
    private /* synthetic */ List write;

    qk$MediaBrowserCompat$CustomActionResultReceiver(List list) {
        this.write = list;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C706414) obj).IconCompatParcelizer(this.write);
    }
}
