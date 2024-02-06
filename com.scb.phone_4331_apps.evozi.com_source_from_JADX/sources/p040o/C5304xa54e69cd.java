package p040o;

import java.util.Comparator;

/* renamed from: o.setExpandedTitleMarginBottom$write$MediaBrowserCompat$ItemReceiver */
public final class C5304xa54e69cd<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable comparable = ((ActivityRecognitionResult) t).MediaSessionCompat$QueueItem;
        Comparable comparable2 = ((ActivityRecognitionResult) t2).MediaSessionCompat$QueueItem;
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
