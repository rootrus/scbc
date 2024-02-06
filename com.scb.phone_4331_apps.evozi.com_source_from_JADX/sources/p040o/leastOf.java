package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import p040o.dispatchCrashlyticsOriginEvent;

/* renamed from: o.leastOf */
public final class leastOf extends constrainedSetMultimap<getStringsFileValue, dispatchCrashlyticsOriginEvent> {
    public final /* bridge */ /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return MediaBrowserCompat$ItemReceiver((getStringsFileValue) obj);
    }

    @HmlPinActivity
    public leastOf(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static dispatchCrashlyticsOriginEvent MediaBrowserCompat$ItemReceiver(getStringsFileValue getstringsfilevalue) {
        double d;
        ArrayList arrayList = new ArrayList();
        for (padWithZerosToMaxIntWidth next : getstringsfilevalue.AppCompatDialogFragment) {
            dispatchCrashlyticsOriginEvent.write.read read = new dispatchCrashlyticsOriginEvent.write.read();
            read.write = next.IconCompatParcelizer;
            String str = next.MediaBrowserCompat$ItemReceiver;
            boolean z = true;
            double d2 = 0.0d;
            if (!(str == null || str.length() == 0)) {
                d = Double.parseDouble(next.MediaBrowserCompat$ItemReceiver);
            } else {
                d = 0.0d;
            }
            read.MediaBrowserCompat$ItemReceiver = Double.valueOf(d);
            String str2 = next.MediaBrowserCompat$ItemReceiver;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                d2 = Double.parseDouble(next.MediaBrowserCompat$CustomActionResultReceiver);
            }
            read.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(d2);
            arrayList.add(new dispatchCrashlyticsOriginEvent.write(read, (byte) 0));
        }
        dispatchCrashlyticsOriginEvent.read read2 = new dispatchCrashlyticsOriginEvent.read();
        read2.read = arrayList;
        read2.IconCompatParcelizer = getstringsfilevalue.MediaSessionCompat$QueueItem;
        return new dispatchCrashlyticsOriginEvent(read2, (byte) 0);
    }
}
