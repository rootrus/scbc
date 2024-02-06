package p040o;

import java.util.Comparator;

/* renamed from: o.onNotifyListenerFailed$MediaBrowserCompat$ItemReceiver */
public final class onNotifyListenerFailed$MediaBrowserCompat$ItemReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((getTiltGesturesEnabled) t).MediaMetadataCompat);
        Comparable valueOf2 = Integer.valueOf(((getTiltGesturesEnabled) t2).MediaMetadataCompat);
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
