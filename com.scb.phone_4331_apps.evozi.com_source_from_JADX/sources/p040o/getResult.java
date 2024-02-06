package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.getResult */
public final class getResult extends FragmentBuilder_BindSummaryFragment {
    public static List<GoogleMap.OnCameraMoveCanceledListener> MediaBrowserCompat$CustomActionResultReceiver(List<LottieRelativeIntegerValueCallback> list) {
        onGetStartedClick.write((Object) list, "wallet");
        Iterable<LottieRelativeIntegerValueCallback> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (LottieRelativeIntegerValueCallback lottieRelativeIntegerValueCallback : iterable) {
            arrayList.add(new GoogleMap.OnCameraMoveCanceledListener(lottieRelativeIntegerValueCallback.MediaBrowserCompat$CustomActionResultReceiver, lottieRelativeIntegerValueCallback.write, lottieRelativeIntegerValueCallback.MediaBrowserCompat$SearchResultReceiver, lottieRelativeIntegerValueCallback.read, lottieRelativeIntegerValueCallback.MediaMetadataCompat, lottieRelativeIntegerValueCallback.RatingCompat, lottieRelativeIntegerValueCallback.MediaBrowserCompat$ItemReceiver, lottieRelativeIntegerValueCallback.MediaDescriptionCompat, lottieRelativeIntegerValueCallback.IconCompatParcelizer));
        }
        return (List) arrayList;
    }
}
