package p040o;

import java.util.Comparator;

/* renamed from: o.NullsLastOrdering$MediaBrowserCompat$CustomActionResultReceiver */
public final class NullsLastOrdering$MediaBrowserCompat$CustomActionResultReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable comparable = ((beginAdUnitExposure) t).IconCompatParcelizer;
        Comparable comparable2 = ((beginAdUnitExposure) t2).IconCompatParcelizer;
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
