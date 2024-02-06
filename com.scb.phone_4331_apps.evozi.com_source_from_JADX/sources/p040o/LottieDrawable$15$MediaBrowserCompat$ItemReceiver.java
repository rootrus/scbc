package p040o;

import java.util.Comparator;

/* renamed from: o.LottieDrawable$15$MediaBrowserCompat$ItemReceiver */
public final class LottieDrawable$15$MediaBrowserCompat$ItemReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable comparable = ((debug) t).PlaybackStateCompat$CustomAction;
        Comparable comparable2 = ((debug) t2).PlaybackStateCompat$CustomAction;
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
