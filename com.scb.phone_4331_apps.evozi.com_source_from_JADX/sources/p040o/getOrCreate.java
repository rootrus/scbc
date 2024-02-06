package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.getOrCreate */
public final class getOrCreate extends constrainedListMultimap {
    @HmlPinActivity
    public getOrCreate(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static List<String> write(List<isBlePresent> list) {
        ArrayList arrayList = new ArrayList();
        for (isBlePresent next : list) {
            if (!TextUtils.isEmpty(next.MediaBrowserCompat$CustomActionResultReceiver)) {
                arrayList.add(next.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                arrayList.add(next.MediaBrowserCompat$ItemReceiver);
            }
        }
        return arrayList;
    }

    public static List<String> read(List<isBlePresent> list) {
        List<String> write = write(list);
        ArrayList arrayList = new ArrayList();
        for (String MediaSessionCompat$ResultReceiverWrapper : write) {
            arrayList.add(getICheckDeserializerRtti.MediaSessionCompat$ResultReceiverWrapper(MediaSessionCompat$ResultReceiverWrapper));
        }
        return arrayList;
    }
}
