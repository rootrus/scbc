package p040o;

import java.util.Comparator;
import p040o.zzwe;

/* renamed from: o.readCount$MediaBrowserCompat$CustomActionResultReceiver */
public final class readCount$MediaBrowserCompat$CustomActionResultReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((zzwe.IconCompatParcelizer) t).MediaBrowserCompat$SearchResultReceiver);
        Comparable valueOf2 = Integer.valueOf(((zzwe.IconCompatParcelizer) t2).MediaBrowserCompat$SearchResultReceiver);
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
