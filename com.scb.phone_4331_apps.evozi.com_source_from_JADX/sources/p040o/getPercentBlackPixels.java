package p040o;

import java.util.List;
import p040o.Futures;

/* renamed from: o.getPercentBlackPixels */
public interface getPercentBlackPixels {

    /* renamed from: o.getPercentBlackPixels$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        void MediaBrowserCompat$ItemReceiver(int i);

        void MediaBrowserCompat$MediaItem(String str);

        void RatingCompat(String str);

        void read(int i);

        void read(String str);

        void write();

        void write(String str);
    }

    /* renamed from: o.getPercentBlackPixels$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(List<Futures.ChainingListenableFuture.C34131> list);

        void IconCompatParcelizer(Futures.ChainingListenableFuture chainingListenableFuture);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void read();

        void write();

        void write(String str);

        void write(List<Futures.C34115> list);

        void write(Futures.ChainingListenableFuture chainingListenableFuture);
    }

    void MediaBrowserCompat$CustomActionResultReceiver(forceCompat forcecompat, Long3 long3);
}
