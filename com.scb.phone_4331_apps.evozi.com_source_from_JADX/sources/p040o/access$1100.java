package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.access$1100 */
public final class access$1100 extends constrainedListMultimap {
    @HmlPinActivity
    public access$1100(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static List<getAppIdentifier> write(List<setSelect> list, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (setSelect next : list) {
                getAppIdentifier MediaBrowserCompat$ItemReceiver = getAppIdentifier.MediaBrowserCompat$ItemReceiver();
                String str3 = next.write;
                if ("th".equals(str)) {
                    str2 = next.MediaBrowserCompat$ItemReceiver;
                } else {
                    str2 = next.IconCompatParcelizer;
                }
                MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = str2;
                arrayList.add(MediaBrowserCompat$ItemReceiver);
            }
        }
        return arrayList;
    }
}
