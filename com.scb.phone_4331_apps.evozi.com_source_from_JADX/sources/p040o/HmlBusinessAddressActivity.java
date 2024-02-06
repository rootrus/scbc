package p040o;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: o.HmlBusinessAddressActivity */
public enum HmlBusinessAddressActivity implements Callable<List<Object>>, DirectDebitDeepLinkActivity<Object, List<Object>> {
    ;

    private HmlBusinessAddressActivity(String str) {
    }

    public static <T> Callable<List<T>> IconCompatParcelizer() {
        return INSTANCE;
    }

    public static <T, O> DirectDebitDeepLinkActivity<O, List<T>> MediaBrowserCompat$ItemReceiver() {
        return INSTANCE;
    }
}
