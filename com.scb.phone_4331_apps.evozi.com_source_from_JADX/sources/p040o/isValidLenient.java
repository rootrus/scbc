package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.isValidLenient */
public final class isValidLenient extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public isValidLenient(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final C3085x7c929f5b MediaBrowserCompat$ItemReceiver(List<getCamera> list, boolean z) {
        String str;
        onGetStartedClick.write((Object) list, "countryList");
        Iterable<getCamera> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getCamera getcamera : iterable) {
            if (write()) {
                str = getcamera.write;
            } else {
                str = getcamera.MediaBrowserCompat$CustomActionResultReceiver;
            }
            arrayList.add(new setCausedBy(str, getcamera.MediaBrowserCompat$ItemReceiver));
        }
        return new C3085x7c929f5b(read((List) arrayList, z), write());
    }

    private static List<setCausedBy> read(List<setCausedBy> list, boolean z) {
        Object obj;
        Collection write2 = HmlNTBBusinessURLInformationActivity.write(list, new write());
        onGetStartedClick.write((Object) write2, "$this$toMutableList");
        List<setCausedBy> arrayList = new ArrayList<>(write2);
        if (z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(((setCausedBy) obj).IconCompatParcelizer, "th", true)) {
                    break;
                }
            }
            setCausedBy setcausedby = (setCausedBy) obj;
            if (setcausedby != null) {
                arrayList.remove(setcausedby);
                arrayList.add(0, setcausedby);
            }
        }
        return arrayList;
    }

    /* renamed from: o.isValidLenient$write */
    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable comparable = ((setCausedBy) t).write;
            Comparable comparable2 = ((setCausedBy) t2).write;
            if (comparable == comparable2) {
                return 0;
            }
            if (comparable == null) {
                return -1;
            }
            if (comparable2 == null) {
                return 1;
            }
            return comparable.compareTo(comparable2);
        }
    }
}
