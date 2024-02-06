package p040o;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: o.AudioAttributesCompatParcelizer */
public final class AudioAttributesCompatParcelizer {
    private static final double MediaBrowserCompat$ItemReceiver;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        MediaBrowserCompat$ItemReceiver = d;
    }

    public static long MediaBrowserCompat$ItemReceiver() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    public static double write(long j) {
        long j2;
        if (Build.VERSION.SDK_INT >= 17) {
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = SystemClock.uptimeMillis();
        }
        return ((double) (j2 - j)) * MediaBrowserCompat$ItemReceiver;
    }
}
