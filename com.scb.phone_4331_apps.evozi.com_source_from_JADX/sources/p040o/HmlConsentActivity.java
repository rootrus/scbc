package p040o;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: o.HmlConsentActivity */
public enum HmlConsentActivity implements Callable<Map<Object, Object>> {
    ;

    private HmlConsentActivity(String str) {
    }

    public static <K, V> Callable<Map<K, V>> MediaBrowserCompat$ItemReceiver() {
        return INSTANCE;
    }
}
