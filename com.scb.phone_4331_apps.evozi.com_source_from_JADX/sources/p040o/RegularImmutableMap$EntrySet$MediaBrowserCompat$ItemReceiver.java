package p040o;

import java.util.Comparator;

/* renamed from: o.RegularImmutableMap$EntrySet$MediaBrowserCompat$ItemReceiver */
public final class RegularImmutableMap$EntrySet$MediaBrowserCompat$ItemReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((deleteSessionPartFilesFor) t).MediaDescriptionCompat);
        Comparable valueOf2 = Integer.valueOf(((deleteSessionPartFilesFor) t2).MediaDescriptionCompat);
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
