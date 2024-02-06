package p040o;

import p040o.Futures;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSettings$MediaBrowserCompat$SearchResultReceiver */
public final class getSettings$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<gePayeeName> {
    private /* synthetic */ Futures.ListenableFutureAdapter.C34161.read MediaBrowserCompat$CustomActionResultReceiver;

    public getSettings$MediaBrowserCompat$SearchResultReceiver(Futures.ListenableFutureAdapter.C34161.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((gePayeeName) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }
}
