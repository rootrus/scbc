package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.AccountChangeEvent */
public final class AccountChangeEvent extends FragmentBuilder_BindSummaryFragment {
    public static List<setOnIndoorStateChangeListener> read(List<Utils> list) {
        if (list == null) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        Iterable<Utils> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (Utils utils : iterable) {
            String str = null;
            String str2 = utils != null ? utils.IconCompatParcelizer : null;
            String str3 = utils != null ? utils.MediaBrowserCompat$ItemReceiver : null;
            String str4 = utils != null ? utils.read : null;
            String str5 = utils != null ? utils.RatingCompat : null;
            String str6 = utils != null ? utils.write : null;
            if (utils != null) {
                str = utils.MediaBrowserCompat$CustomActionResultReceiver;
            }
            arrayList.add(new setOnIndoorStateChangeListener(str2, str3, str4, str5, str6, str));
        }
        return (List) arrayList;
    }
}
