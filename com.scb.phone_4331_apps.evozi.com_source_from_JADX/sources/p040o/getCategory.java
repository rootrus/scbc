package p040o;

import p040o.Futures;
import p040o.getPercentBlackPixels;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCategory */
public final /* synthetic */ class getCategory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.ChainingListenableFuture MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getCategory(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.MediaBrowserCompat$ItemReceiver = chainingListenableFuture;
    }

    public final void IconCompatParcelizer(Object obj) {
        logAppStats.write(this.MediaBrowserCompat$ItemReceiver, (getPercentBlackPixels.write) obj);
    }
}
