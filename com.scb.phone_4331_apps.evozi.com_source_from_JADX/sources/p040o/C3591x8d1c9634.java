package p040o;

import java.util.Comparator;

/* renamed from: o.ListenerHolder$ListenerKey$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3591x8d1c9634<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable comparable = ((compassEnabled) t).MediaSessionCompat$Token;
        Comparable comparable2 = ((compassEnabled) t2).MediaSessionCompat$Token;
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
