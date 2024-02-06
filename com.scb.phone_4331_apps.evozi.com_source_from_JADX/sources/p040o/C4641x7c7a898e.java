package p040o;

import java.util.Comparator;
import kotlin.TypeCastException;
import p040o.PersonalizeActivity;

/* renamed from: o.getReuseAddress$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$ItemReceiver */
public final class C4641x7c7a898e<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer = (PersonalizeActivity.IconCompatParcelizer) t;
        onGetStartedClick.IconCompatParcelizer((Object) iconCompatParcelizer, "category");
        String str = iconCompatParcelizer.read;
        onGetStartedClick.IconCompatParcelizer((Object) str, "category.name");
        if (str != null) {
            String upperCase = str.toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            Comparable comparable = upperCase;
            PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer2 = (PersonalizeActivity.IconCompatParcelizer) t2;
            onGetStartedClick.IconCompatParcelizer((Object) iconCompatParcelizer2, "category");
            String str2 = iconCompatParcelizer2.read;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "category.name");
            if (str2 != null) {
                String upperCase2 = str2.toUpperCase();
                onGetStartedClick.IconCompatParcelizer((Object) upperCase2, "(this as java.lang.String).toUpperCase()");
                Comparable comparable2 = upperCase2;
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
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
