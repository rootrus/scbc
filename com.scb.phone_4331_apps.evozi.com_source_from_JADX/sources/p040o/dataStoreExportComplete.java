package p040o;

import p040o.Futures;
import p040o.getPercentBlackPixels;
import p040o.writeUInt64NoTag;

/* renamed from: o.dataStoreExportComplete */
public final /* synthetic */ class dataStoreExportComplete implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.ChainingListenableFuture write;

    public /* synthetic */ dataStoreExportComplete(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.write = chainingListenableFuture;
    }

    public final void IconCompatParcelizer(Object obj) {
        logAppStats.IconCompatParcelizer(this.write, (getPercentBlackPixels.write) obj);
    }
}
