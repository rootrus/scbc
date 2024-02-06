package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RealConnectionPool;
import p040o.onGetStartedClick;

public final class ConnectionPool {
    private final RealConnectionPool delegate;

    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "timeUnit");
        this.delegate = new RealConnectionPool(i, j, timeUnit);
    }

    public final RealConnectionPool getDelegate$okhttp() {
        return this.delegate;
    }

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }
}
