package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;
import p040o.LottieInterpolatedPointValue;

/* renamed from: o.PendingResults */
public final class PendingResults implements OPRStatusRewardsLandingActivity_ViewBinding<immediatePendingResult> {
    private static final PendingResults MediaBrowserCompat$ItemReceiver = new PendingResults();

    /* renamed from: o.PendingResults$zab */
    public final class zab extends FragmentBuilder_BindSummaryFragment {
    }

    /* renamed from: o.PendingResults$zac */
    public final class zac extends FragmentBuilder_BindSummaryFragment {
    }

    public static PendingResults write() {
        return MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.PendingResults$zaa */
    public final class zaa extends FragmentBuilder_BindSummaryFragment {
        public static List<GoogleMap.OnCameraMoveCanceledListener> MediaBrowserCompat$CustomActionResultReceiver(List<LottieInterpolatedPointValue.read> list) {
            onGetStartedClick.write((Object) list, "toWalletEntity");
            Iterable<LottieInterpolatedPointValue.read> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (LottieInterpolatedPointValue.read read : iterable) {
                arrayList.add(new GoogleMap.OnCameraMoveCanceledListener(read.write, read.read, read.MediaBrowserCompat$ItemReceiver, read.MediaBrowserCompat$CustomActionResultReceiver, read.MediaBrowserCompat$SearchResultReceiver, read.MediaBrowserCompat$MediaItem, read.IconCompatParcelizer, 0, 0));
            }
            return (List) arrayList;
        }

        public static List<GoogleMap.OnCameraChangeListener.IconCompatParcelizer> write(List<LottieInterpolatedPointValue.write> list) {
            onGetStartedClick.write((Object) list, "fxRateEntity");
            Iterable<LottieInterpolatedPointValue.write> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (LottieInterpolatedPointValue.write write : iterable) {
                arrayList.add(new GoogleMap.OnCameraChangeListener.IconCompatParcelizer(write.write, write.read, write.IconCompatParcelizer, write.MediaBrowserCompat$CustomActionResultReceiver, write.MediaBrowserCompat$ItemReceiver));
            }
            return (List) arrayList;
        }
    }

    public final /* synthetic */ Object get() {
        return new immediatePendingResult();
    }
}
