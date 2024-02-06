package p040o;

import java.util.Comparator;
import p040o.zzcb;

/* renamed from: o.min$MediaBrowserCompat$CustomActionResultReceiver */
public final class min$MediaBrowserCompat$CustomActionResultReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((zzcb.zza.C10764zza) t).read);
        Comparable valueOf2 = Integer.valueOf(((zzcb.zza.C10764zza) t2).read);
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
