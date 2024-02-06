package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.reconnect */
public final class reconnect extends FragmentBuilder_BindSummaryFragment {
    public static List<setOnIndoorStateChangeListener> MediaBrowserCompat$ItemReceiver(List<Utils> list) {
        Iterable<Utils> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
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
