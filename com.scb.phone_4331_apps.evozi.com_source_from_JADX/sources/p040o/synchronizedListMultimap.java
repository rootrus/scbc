package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: o.synchronizedListMultimap */
public final class synchronizedListMultimap extends constrainedListMultimap {
    @HmlPinActivity
    public synchronizedListMultimap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static rowKeySet IconCompatParcelizer(List<doWriteNonFatal> list, LinkedHashMap<String, String> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        for (doWriteNonFatal next : list) {
            containsColumn containscolumn = new containsColumn(next.MediaBrowserCompat$CustomActionResultReceiver);
            containscolumn.MediaBrowserCompat$CustomActionResultReceiver = linkedHashMap.get(next.MediaBrowserCompat$CustomActionResultReceiver);
            arrayList.add(containscolumn);
        }
        rowKeySet rowkeyset = new rowKeySet();
        rowkeyset.read = arrayList;
        return rowkeyset;
    }
}
