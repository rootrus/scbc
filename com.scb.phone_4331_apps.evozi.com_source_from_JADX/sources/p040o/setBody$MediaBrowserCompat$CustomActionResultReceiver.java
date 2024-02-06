package p040o;

import java.util.Comparator;

/* renamed from: o.setBody$MediaBrowserCompat$CustomActionResultReceiver */
public final class setBody$MediaBrowserCompat$CustomActionResultReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable comparable = ((matchesName) t).MediaSessionCompat$QueueItem;
        Comparable comparable2 = ((matchesName) t2).MediaSessionCompat$QueueItem;
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
