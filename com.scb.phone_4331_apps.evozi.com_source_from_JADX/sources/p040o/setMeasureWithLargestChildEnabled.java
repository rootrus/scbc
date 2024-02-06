package p040o;

import android.os.Build;
import android.os.Trace;

/* renamed from: o.setMeasureWithLargestChildEnabled */
public final class setMeasureWithLargestChildEnabled {
    public static void read(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
