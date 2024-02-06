package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.MapsInitializer */
public enum MapsInitializer {
    REQUEST_MONEY(DiskLruCache.VERSION_1),
    EBILL_SUBSCRIPTION("2"),
    PROMPTPAY_QR("3");
    
    public String type;

    private MapsInitializer(String str) {
        this.type = str;
    }

    public static MapsInitializer MediaBrowserCompat$ItemReceiver(String str) {
        if (REQUEST_MONEY.type.equals(str)) {
            return REQUEST_MONEY;
        }
        if (EBILL_SUBSCRIPTION.type.equals(str)) {
            return EBILL_SUBSCRIPTION;
        }
        if (PROMPTPAY_QR.type.equals(str)) {
            return PROMPTPAY_QR;
        }
        return REQUEST_MONEY;
    }
}
