package p040o;

import p040o.AppStatistics;
import p040o.Futures;
import p040o.getPercentBlackPixels;
import p040o.writeUInt64NoTag;

/* renamed from: o.daoCalcObjSizeResult */
public final /* synthetic */ class daoCalcObjSizeResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.ChainingListenableFuture IconCompatParcelizer;

    public /* synthetic */ daoCalcObjSizeResult(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.IconCompatParcelizer = chainingListenableFuture;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatistics.C3025c.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, (getPercentBlackPixels.IconCompatParcelizer) obj);
    }
}
