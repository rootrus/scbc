package p040o;

import java.util.List;
import p040o.Futures;
import p040o.getPercentBlackPixels;

/* renamed from: o.logAppStats */
public class logAppStats extends writeUInt64NoTag<getPercentBlackPixels.write> {
    @HmlPinActivity
    public logAppStats(RegularImmutableBiMap regularImmutableBiMap, MapDifference mapDifference) {
        super(regularImmutableBiMap);
    }

    static /* synthetic */ void read(Futures.ChainingListenableFuture chainingListenableFuture, getPercentBlackPixels.write write) {
        write.write(chainingListenableFuture);
        write.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void write(Futures.ChainingListenableFuture chainingListenableFuture, getPercentBlackPixels.write write) {
        if (chainingListenableFuture == null || !"COMMERCIAL_LOAN".equalsIgnoreCase(chainingListenableFuture.AppCompatActivity)) {
            write.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            write.IconCompatParcelizer(chainingListenableFuture);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(Futures.ChainingListenableFuture chainingListenableFuture, getPercentBlackPixels.write write) {
        List<Futures.ChainingListenableFuture.C34131> list = chainingListenableFuture.MediaSessionCompat$QueueItem;
        if (list == null || list.isEmpty()) {
            write.write("0");
            write.read();
            return;
        }
        write.IconCompatParcelizer(list);
        write.write(String.valueOf(list.size()));
    }

    static /* synthetic */ void IconCompatParcelizer(Futures.ChainingListenableFuture chainingListenableFuture, getPercentBlackPixels.write write) {
        List<Futures.C34115> list = chainingListenableFuture.MediaSessionCompat$ResultReceiverWrapper;
        if (list == null || list.isEmpty()) {
            write.write("0");
            write.write();
            return;
        }
        write.write(list);
        write.write(String.valueOf(list.size()));
    }
}
