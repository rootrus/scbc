package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IsEdgeConfident$MediaBrowserCompat$CustomActionResultReceiver */
final class IsEdgeConfident$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<newIdExtractor> {
    private /* synthetic */ Throwable write;

    IsEdgeConfident$MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        this.write = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((newIdExtractor) obj).write(this.write);
    }
}
