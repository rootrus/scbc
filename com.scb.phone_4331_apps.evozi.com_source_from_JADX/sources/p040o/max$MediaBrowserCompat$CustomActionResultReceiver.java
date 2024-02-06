package p040o;

import java.util.Comparator;

/* renamed from: o.max$MediaBrowserCompat$CustomActionResultReceiver */
public final class max$MediaBrowserCompat$CustomActionResultReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((setDataCollectionEnabled) t).MediaBrowserCompat$CustomActionResultReceiver);
        Comparable valueOf2 = Integer.valueOf(((setDataCollectionEnabled) t2).MediaBrowserCompat$CustomActionResultReceiver);
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
