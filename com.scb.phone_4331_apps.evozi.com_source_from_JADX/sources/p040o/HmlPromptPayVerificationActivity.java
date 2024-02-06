package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.HmlPromptPayVerificationActivity */
public interface HmlPromptPayVerificationActivity {

    /* renamed from: o.HmlPromptPayVerificationActivity$IconCompatParcelizer */
    public interface IconCompatParcelizer extends HmlPromptPayVerificationActivity {
        <E extends IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);

        HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> MediaBrowserCompat$ItemReceiver();
    }

    <E extends IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);

    HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity);

    <R> R read(R r, BaseDiscoverFundFilterActivity<? super R, ? super IconCompatParcelizer, ? extends R> baseDiscoverFundFilterActivity);

    HmlPromptPayVerificationActivity read(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);

    /* renamed from: o.HmlPromptPayVerificationActivity$write */
    public static final class write {
        public static List<onPolygonClick> write(List<setMaxHighlightDistance> list) {
            Iterable<setMaxHighlightDistance> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (setMaxHighlightDistance setmaxhighlightdistance : iterable) {
                onPolygonClick onpolygonclick = r3;
                onPolygonClick onpolygonclick2 = new onPolygonClick(setmaxhighlightdistance.read, setmaxhighlightdistance.MediaMetadataCompat, setmaxhighlightdistance.write, setmaxhighlightdistance.MediaBrowserCompat$ItemReceiver, setmaxhighlightdistance.IconCompatParcelizer, setmaxhighlightdistance.RatingCompat, setmaxhighlightdistance.MediaDescriptionCompat, setmaxhighlightdistance.MediaBrowserCompat$CustomActionResultReceiver);
                arrayList.add(onpolygonclick);
            }
            return (List) arrayList;
        }
    }
}
