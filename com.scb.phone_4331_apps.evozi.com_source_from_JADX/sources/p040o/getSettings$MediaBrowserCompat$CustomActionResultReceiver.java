package p040o;

import p040o.Futures;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSettings$MediaBrowserCompat$CustomActionResultReceiver */
public final class getSettings$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<gePayeeName> {
    private /* synthetic */ Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer write;

    public getSettings$MediaBrowserCompat$CustomActionResultReceiver(Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((gePayeeName) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write.MediaBrowserCompat$MediaItem);
    }
}
