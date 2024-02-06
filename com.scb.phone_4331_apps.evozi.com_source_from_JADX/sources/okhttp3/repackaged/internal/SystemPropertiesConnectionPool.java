package okhttp3.repackaged.internal;

import java.util.concurrent.TimeUnit;
import okhttp3.repackaged.ConnectionPool;

public final class SystemPropertiesConnectionPool {
    public static final ConnectionPool INSTANCE;
    private static final long ajz = 300000;

    static {
        int i;
        String property = System.getProperty("http.keepAlive");
        if (property == null || Boolean.parseBoolean(property)) {
            String property2 = System.getProperty("http.maxConnections");
            i = property2 != null ? Integer.parseInt(property2) : 5;
        } else {
            i = 0;
        }
        String property3 = System.getProperty("http.keepAliveDuration");
        INSTANCE = new ConnectionPool(i, property3 != null ? Long.parseLong(property3) : ajz, TimeUnit.MILLISECONDS);
    }

    private SystemPropertiesConnectionPool() {
    }
}
