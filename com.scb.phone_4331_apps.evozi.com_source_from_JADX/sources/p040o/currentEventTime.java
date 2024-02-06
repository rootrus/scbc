package p040o;

import p040o.AppStatistics;
import p040o.Futures;
import p040o.getPercentBlackPixels;
import p040o.writeUInt64NoTag;

/* renamed from: o.currentEventTime */
public final /* synthetic */ class currentEventTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.ChainingListenableFuture MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ currentEventTime(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.MediaBrowserCompat$CustomActionResultReceiver = chainingListenableFuture;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatistics.C3025c.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, (getPercentBlackPixels.IconCompatParcelizer) obj);
    }
}
