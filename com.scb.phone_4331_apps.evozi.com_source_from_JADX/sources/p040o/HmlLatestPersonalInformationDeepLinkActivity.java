package p040o;

/* renamed from: o.HmlLatestPersonalInformationDeepLinkActivity */
public final class HmlLatestPersonalInformationDeepLinkActivity {
    private static CreditCardServiceTabDeepLinkActivity<Object, Object> IconCompatParcelizer = new read();

    public static int IconCompatParcelizer(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static int read(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static <T> T write(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean MediaBrowserCompat$ItemReceiver(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> CreditCardServiceTabDeepLinkActivity<T, T> MediaBrowserCompat$CustomActionResultReceiver() {
        return IconCompatParcelizer;
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static long MediaBrowserCompat$ItemReceiver(long j, String str) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o.HmlLatestPersonalInformationDeepLinkActivity$read */
    static final class read implements CreditCardServiceTabDeepLinkActivity<Object, Object> {
        read() {
        }

        public final boolean IconCompatParcelizer(Object obj, Object obj2) {
            return HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(obj, obj2);
        }
    }
}
