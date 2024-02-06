package p040o;

import java.lang.reflect.Constructor;
import java.util.Comparator;

/* renamed from: o.onCheckedConsent$MediaBrowserCompat$CustomActionResultReceiver */
public final class onCheckedConsent$MediaBrowserCompat$CustomActionResultReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Constructor constructor = (Constructor) t2;
        onGetStartedClick.IconCompatParcelizer((Object) constructor, "it");
        Comparable valueOf = Integer.valueOf(constructor.getParameterTypes().length);
        Constructor constructor2 = (Constructor) t;
        onGetStartedClick.IconCompatParcelizer((Object) constructor2, "it");
        Comparable valueOf2 = Integer.valueOf(constructor2.getParameterTypes().length);
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
