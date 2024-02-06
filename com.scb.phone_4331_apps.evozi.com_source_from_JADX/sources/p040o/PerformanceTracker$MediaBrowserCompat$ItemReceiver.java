package p040o;

import java.util.Comparator;
import p040o.LottieDrawable;

/* renamed from: o.PerformanceTracker$MediaBrowserCompat$ItemReceiver */
public final class PerformanceTracker$MediaBrowserCompat$ItemReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((LottieDrawable.C36224) t).MediaBrowserCompat$CustomActionResultReceiver);
        Comparable valueOf2 = Integer.valueOf(((LottieDrawable.C36224) t2).MediaBrowserCompat$CustomActionResultReceiver);
        if (valueOf == valueOf2) {
            return 0;
        }
        if (valueOf == null) {
            return -1;
        }
        if (valueOf2 == null) {
            return 1;
        }
        return valueOf.compareTo(valueOf2);
    }
}
