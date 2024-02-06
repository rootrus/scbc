package p040o;

import p040o.AppStatistics;
import p040o.Futures;
import p040o.getPercentBlackPixels;
import p040o.writeUInt64NoTag;

/* renamed from: o.addDataStoreInitializedListener */
public final /* synthetic */ class addDataStoreInitializedListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.ChainingListenableFuture read;

    public /* synthetic */ addDataStoreInitializedListener(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.read = chainingListenableFuture;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatistics.C3025c.write(this.read, (getPercentBlackPixels.IconCompatParcelizer) obj);
    }
}
