package p040o;

import java.util.Comparator;

/* renamed from: o.onFastPaySettingCoachmarkClicked$MediaBrowserCompat$CustomActionResultReceiver */
public final class C7321xdb4572f0<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Comparable valueOf = Integer.valueOf(((FullScreenLoadingActivity) t).read());
        Comparable valueOf2 = Integer.valueOf(((FullScreenLoadingActivity) t2).read());
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
