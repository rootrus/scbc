package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.SignInConfiguration */
public final class SignInConfiguration extends FragmentBuilder_BindSummaryFragment {
    @HmlPinActivity
    public SignInConfiguration(hash hash) {
        onGetStartedClick.write((Object) hash, "answerEntityMapper");
    }

    public static LocationListener MediaBrowserCompat$CustomActionResultReceiver(getCornerRadius getcornerradius) {
        List list;
        int i;
        onGetStartedClick.write((Object) getcornerradius, "investmentRiskAssessmentQuestionEntity");
        List<PolystarShape> list2 = getcornerradius.IconCompatParcelizer;
        if (list2 != null) {
            Iterable<PolystarShape> iterable = list2;
            int i2 = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i2 = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i2);
            for (PolystarShape polystarShape : iterable) {
                onGetStartedClick.write((Object) polystarShape, "investmentRiskAssessmentAnswerEntity");
                arrayList.add(new getFastestInterval(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) polystarShape.MediaBrowserCompat$ItemReceiver, (Object) DiskLruCache.VERSION_1), polystarShape.IconCompatParcelizer, polystarShape.write));
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        List list3 = list;
        String str = getcornerradius.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = Integer.parseInt(str);
        } else {
            i = 0;
        }
        return new LocationListener(i, Integer.parseInt(getcornerradius.write), getcornerradius.read, getcornerradius.MediaBrowserCompat$CustomActionResultReceiver, list3);
    }
}
