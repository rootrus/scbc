package p040o;

import p040o.Futures;
import p040o.getPercentBlackPixels;
import p040o.writeUInt64NoTag;

/* renamed from: o.dataStoreInitialized */
public final /* synthetic */ class dataStoreInitialized implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.ChainingListenableFuture MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ dataStoreInitialized(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.MediaBrowserCompat$CustomActionResultReceiver = chainingListenableFuture;
    }

    public final void IconCompatParcelizer(Object obj) {
        logAppStats.read(this.MediaBrowserCompat$CustomActionResultReceiver, (getPercentBlackPixels.write) obj);
    }
}
