package p040o;

import java.util.Comparator;
import p040o.zzcb;

/* renamed from: o.min$MediaBrowserCompat$ItemReceiver */
public final class min$MediaBrowserCompat$ItemReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((zzcb.zzb) t).read);
        Comparable valueOf2 = Integer.valueOf(((zzcb.zzb) t2).read);
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
