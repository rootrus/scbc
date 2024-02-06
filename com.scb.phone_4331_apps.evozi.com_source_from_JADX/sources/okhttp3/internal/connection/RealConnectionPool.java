package okhttp3.internal.connection;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Transmitter;
import okhttp3.internal.platform.Platform;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class RealConnectionPool {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    private final RealConnectionPool$cleanupRunnable$1 cleanupRunnable = new RealConnectionPool$cleanupRunnable$1(this);
    private boolean cleanupRunning;
    private final ArrayDeque<RealConnection> connections = new ArrayDeque<>();
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    private final RouteDatabase routeDatabase = new RouteDatabase();

    public RealConnectionPool(int i, long j, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "timeUnit");
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        if (!(j > 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final boolean getCleanupRunning() {
        return this.cleanupRunning;
    }

    public final void setCleanupRunning(boolean z) {
        this.cleanupRunning = z;
    }

    public final int idleConnectionCount() {
        int i;
        synchronized (this) {
            Iterable<RealConnection> iterable = this.connections;
            i = 0;
            if (iterable instanceof Collection) {
                if (((Collection) iterable).isEmpty()) {
                }
            }
            for (RealConnection transmitters : iterable) {
                if (transmitters.getTransmitters().isEmpty()) {
                    i++;
                    if (i < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
        }
        return i;
    }

    public final int connectionCount() {
        int size;
        synchronized (this) {
            size = this.connections.size();
        }
        return size;
    }

    public final boolean transmitterAcquirePooledConnection(Address address, Transmitter transmitter, List<Route> list, boolean z) {
        onGetStartedClick.write((Object) address, "address");
        onGetStartedClick.write((Object) transmitter, "transmitter");
        boolean holdsLock = Thread.holdsLock(this);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
            Iterator<RealConnection> it = this.connections.iterator();
            while (it.hasNext()) {
                RealConnection next = it.next();
                if ((!z || next.isMultiplexed()) && next.isEligible$okhttp(address, list)) {
                    onGetStartedClick.IconCompatParcelizer((Object) next, "connection");
                    transmitter.acquireConnectionNoEvents(next);
                    return true;
                }
            }
            return false;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void put(RealConnection realConnection) {
        onGetStartedClick.write((Object) realConnection, "connection");
        boolean holdsLock = Thread.holdsLock(this);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
            if (!this.cleanupRunning) {
                this.cleanupRunning = true;
                executor.execute(this.cleanupRunnable);
            }
            this.connections.add(realConnection);
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        onGetStartedClick.write((Object) realConnection, "connection");
        boolean holdsLock = Thread.holdsLock(this);
        if (HmlBusinessOwnerDocumentSubmissionActivity.write && !holdsLock) {
            throw new AssertionError("Assertion failed");
        } else if (realConnection.getNoNewExchanges() || this.maxIdleConnections == 0) {
            this.connections.remove(realConnection);
            return true;
        } else {
            notifyAll();
            return false;
        }
    }

    public final void evictAll() {
        List<RealConnection> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            onGetStartedClick.IconCompatParcelizer((Object) it, "connections.iterator()");
            while (it.hasNext()) {
                RealConnection next = it.next();
                if (next.getTransmitters().isEmpty()) {
                    next.setNoNewExchanges(true);
                    onGetStartedClick.IconCompatParcelizer((Object) next, "connection");
                    arrayList.add(next);
                    it.remove();
                }
            }
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        for (RealConnection socket : arrayList) {
            Util.closeQuietly(socket.socket());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r4 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        okhttp3.internal.Util.closeQuietly(r4.socket());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long cleanup(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayDeque<okhttp3.internal.connection.RealConnection> r0 = r11.connections     // Catch:{ all -> 0x0069 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0069 }
            r1 = -9223372036854775808
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r5
        L_0x000d:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x0036
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0069 }
            okhttp3.internal.connection.RealConnection r7 = (okhttp3.internal.connection.RealConnection) r7     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = "connection"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0069 }
            int r8 = r11.pruneAndGetAllocationCount(r7, r12)     // Catch:{ all -> 0x0069 }
            if (r8 <= 0) goto L_0x0027
            int r6 = r6 + 1
            goto L_0x000d
        L_0x0027:
            int r5 = r5 + 1
            long r8 = r7.getIdleAtNanos$okhttp()     // Catch:{ all -> 0x0069 }
            long r8 = r12 - r8
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x000d
            r4 = r7
            r1 = r8
            goto L_0x000d
        L_0x0036:
            long r12 = r11.keepAliveDurationNs     // Catch:{ all -> 0x0069 }
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0054
            int r12 = r11.maxIdleConnections     // Catch:{ all -> 0x0069 }
            if (r5 <= r12) goto L_0x0041
            goto L_0x0054
        L_0x0041:
            if (r5 <= 0) goto L_0x0048
            long r12 = r11.keepAliveDurationNs     // Catch:{ all -> 0x0069 }
            monitor-exit(r11)
            long r12 = r12 - r1
            return r12
        L_0x0048:
            if (r6 <= 0) goto L_0x004e
            long r12 = r11.keepAliveDurationNs     // Catch:{ all -> 0x0069 }
            monitor-exit(r11)
            return r12
        L_0x004e:
            r11.cleanupRunning = r3     // Catch:{ all -> 0x0069 }
            monitor-exit(r11)
            r12 = -1
            return r12
        L_0x0054:
            java.util.ArrayDeque<okhttp3.internal.connection.RealConnection> r12 = r11.connections     // Catch:{ all -> 0x0069 }
            r12.remove(r4)     // Catch:{ all -> 0x0069 }
            monitor-exit(r11)
            if (r4 != 0) goto L_0x005f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x005f:
            java.net.Socket r12 = r4.socket()
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r12)
            r12 = 0
            return r12
        L_0x0069:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.cleanup(long):long");
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        List<Reference<Transmitter>> transmitters = realConnection.getTransmitters();
        int i = 0;
        while (i < transmitters.size()) {
            Reference reference = transmitters.get(i);
            if (reference.get() != null) {
                i++;
            } else if (reference != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(realConnection.route().address().url());
                sb.append(" was leaked. ");
                sb.append("Did you forget to close a response body?");
                Platform.Companion.get().logCloseableLeak(sb.toString(), ((Transmitter.TransmitterReference) reference).getCallStackTrace());
                transmitters.remove(i);
                realConnection.setNoNewExchanges(true);
                if (transmitters.isEmpty()) {
                    realConnection.setIdleAtNanos$okhttp(j - this.keepAliveDurationNs);
                    return 0;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.connection.Transmitter.TransmitterReference");
            }
        }
        return transmitters.size();
    }

    public final void connectFailed(Route route, IOException iOException) {
        onGetStartedClick.write((Object) route, "failedRoute");
        onGetStartedClick.write((Object) iOException, "failure");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        this.routeDatabase.failed(route);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            onGetStartedClick.write((Object) connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }
}
