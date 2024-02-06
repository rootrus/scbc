package p040o;

import java.util.Comparator;

/* renamed from: o.NullsLastOrdering$MediaBrowserCompat$ItemReceiver */
public final class NullsLastOrdering$MediaBrowserCompat$ItemReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable comparable = ((clearConditionalUserProperty) t).read;
        Comparable comparable2 = ((clearConditionalUserProperty) t2).read;
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
