package okhttp3.repackaged.internal.http;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.repackaged.Address;
import okhttp3.repackaged.ConnectionPool;
import okhttp3.repackaged.Route;
import okhttp3.repackaged.internal.Internal;
import okhttp3.repackaged.internal.RouteDatabase;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.p090io.RealConnection;
import p040o.QuickPromptPayActivity;

public final class StreamAllocation {
    public final Address address;
    private final ConnectionPool aio;
    private boolean aiu;
    private Route amD;
    private RouteSelector amE;
    private RealConnection amF;
    private boolean amG;
    private HttpStream amH;

    public StreamAllocation(ConnectionPool connectionPool, Address address2) {
        this.aio = connectionPool;
        this.address = address2;
        this.amE = new RouteSelector(address2, m6161vi());
    }

    public final HttpStream newStream(int i, int i2, int i3, boolean z, boolean z2) throws RouteException, IOException {
        HttpStream httpStream;
        try {
            RealConnection a = m6157a(i, i2, i3, z, z2);
            if (a.framedConnection != null) {
                httpStream = new Http2xStream(this, a.framedConnection);
            } else {
                a.socket().setSoTimeout(i2);
                a.source.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
                a.sink.timeout().timeout((long) i3, TimeUnit.MILLISECONDS);
                httpStream = new Http1xStream(this, a.source, a.sink);
            }
            synchronized (this.aio) {
                this.amH = httpStream;
            }
            return httpStream;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.isHealthy(r8) == false) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.repackaged.internal.p090io.RealConnection m6157a(int r4, int r5, int r6, boolean r7, boolean r8) throws java.io.IOException, okhttp3.repackaged.internal.http.RouteException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.repackaged.internal.io.RealConnection r0 = r3.m6156a(r4, r5, r6, r7)
            okhttp3.repackaged.ConnectionPool r1 = r3.aio
            monitor-enter(r1)
            int r2 = r0.successCount     // Catch:{ all -> 0x001e }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)
            return r0
        L_0x000d:
            monitor-exit(r1)
            boolean r1 = r0.isHealthy(r8)
            if (r1 == 0) goto L_0x0015
            return r0
        L_0x0015:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            r3.connectionFailed(r0)
            goto L_0x0000
        L_0x001e:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.http.StreamAllocation.m6157a(int, int, int, boolean, boolean):okhttp3.repackaged.internal.io.RealConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002c, code lost:
        if (r1 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        r1 = r8.amE.next();
        r0 = r8.aio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8.amD = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x003e, code lost:
        r0 = new okhttp3.repackaged.internal.p090io.RealConnection(r1);
        acquire(r0);
        r1 = r8.aio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0048, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        okhttp3.repackaged.internal.Internal.instance.put(r8.aio, r0);
        r8.amF = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        if (r8.aiu != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        r0.connect(r9, r10, r11, r8.address.connectionSpecs(), r12);
        m6161vi().connected(r0.route());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
        throw new java.io.IOException("Canceled");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.repackaged.internal.p090io.RealConnection m6156a(int r9, int r10, int r11, boolean r12) throws java.io.IOException, okhttp3.repackaged.internal.http.RouteException {
        /*
            r8 = this;
            okhttp3.repackaged.ConnectionPool r0 = r8.aio
            monitor-enter(r0)
            boolean r1 = r8.amG     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x008c
            okhttp3.repackaged.internal.http.HttpStream r1 = r8.amH     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0084
            boolean r1 = r8.aiu     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x007c
            okhttp3.repackaged.internal.io.RealConnection r1 = r8.amF     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.noNewStreams     // Catch:{ all -> 0x0094 }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r0)
            return r1
        L_0x0019:
            okhttp3.repackaged.internal.Internal r1 = okhttp3.repackaged.internal.Internal.instance     // Catch:{ all -> 0x0094 }
            okhttp3.repackaged.ConnectionPool r2 = r8.aio     // Catch:{ all -> 0x0094 }
            okhttp3.repackaged.Address r3 = r8.address     // Catch:{ all -> 0x0094 }
            okhttp3.repackaged.internal.io.RealConnection r1 = r1.get(r2, r3, r8)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0029
            r8.amF = r1     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)
            return r1
        L_0x0029:
            okhttp3.repackaged.Route r1 = r8.amD     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x003e
            okhttp3.repackaged.internal.http.RouteSelector r0 = r8.amE
            okhttp3.repackaged.Route r1 = r0.next()
            okhttp3.repackaged.ConnectionPool r0 = r8.aio
            monitor-enter(r0)
            r8.amD = r1     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            goto L_0x003e
        L_0x003b:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L_0x003e:
            okhttp3.repackaged.internal.io.RealConnection r0 = new okhttp3.repackaged.internal.io.RealConnection
            r0.<init>(r1)
            r8.acquire(r0)
            okhttp3.repackaged.ConnectionPool r1 = r8.aio
            monitor-enter(r1)
            okhttp3.repackaged.internal.Internal r2 = okhttp3.repackaged.internal.Internal.instance     // Catch:{ all -> 0x0079 }
            okhttp3.repackaged.ConnectionPool r3 = r8.aio     // Catch:{ all -> 0x0079 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0079 }
            r8.amF = r0     // Catch:{ all -> 0x0079 }
            boolean r2 = r8.aiu     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0071
            monitor-exit(r1)
            okhttp3.repackaged.Address r1 = r8.address
            java.util.List r6 = r1.connectionSpecs()
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            r2.connect(r3, r4, r5, r6, r7)
            okhttp3.repackaged.internal.RouteDatabase r9 = r8.m6161vi()
            okhttp3.repackaged.Route r10 = r0.route()
            r9.connected(r10)
            return r0
        L_0x0071:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0079 }
            java.lang.String r10 = "Canceled"
            r9.<init>(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        L_0x007c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0094 }
            java.lang.String r10 = "Canceled"
            r9.<init>(r10)     // Catch:{ all -> 0x0094 }
            throw r9     // Catch:{ all -> 0x0094 }
        L_0x0084:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0094 }
            java.lang.String r10 = "stream != null"
            r9.<init>(r10)     // Catch:{ all -> 0x0094 }
            throw r9     // Catch:{ all -> 0x0094 }
        L_0x008c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0094 }
            java.lang.String r10 = "released"
            r9.<init>(r10)     // Catch:{ all -> 0x0094 }
            throw r9     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.http.StreamAllocation.m6156a(int, int, int, boolean):okhttp3.repackaged.internal.io.RealConnection");
    }

    public final void streamFinished(boolean z, HttpStream httpStream) {
        synchronized (this.aio) {
            if (httpStream != null) {
                if (httpStream == this.amH) {
                    if (!z) {
                        this.amF.successCount++;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected ");
            sb.append(this.amH);
            sb.append(" but was ");
            sb.append(httpStream);
            throw new IllegalStateException(sb.toString());
        }
        m6158a(z, false, true);
    }

    public final HttpStream stream() {
        HttpStream httpStream;
        synchronized (this.aio) {
            httpStream = this.amH;
        }
        return httpStream;
    }

    /* renamed from: vi */
    private RouteDatabase m6161vi() {
        return Internal.instance.routeDatabase(this.aio);
    }

    public final RealConnection connection() {
        RealConnection realConnection;
        synchronized (this) {
            realConnection = this.amF;
        }
        return realConnection;
    }

    public final void release() {
        m6158a(false, true, false);
    }

    public final void noNewStreams() {
        m6158a(true, false, false);
    }

    /* renamed from: a */
    private void m6158a(boolean z, boolean z2, boolean z3) {
        RealConnection realConnection;
        RealConnection realConnection2;
        synchronized (this.aio) {
            realConnection = null;
            if (z3) {
                try {
                    this.amH = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                this.amG = true;
            }
            if (this.amF != null) {
                if (z) {
                    this.amF.noNewStreams = true;
                }
                if (this.amH == null && (this.amG || this.amF.noNewStreams)) {
                    m6160c(this.amF);
                    if (this.amF.allocations.isEmpty()) {
                        this.amF.idleAtNanos = System.nanoTime();
                        if (Internal.instance.connectionBecameIdle(this.aio, this.amF)) {
                            realConnection2 = this.amF;
                            this.amF = null;
                            realConnection = realConnection2;
                        }
                    }
                    realConnection2 = null;
                    this.amF = null;
                    realConnection = realConnection2;
                }
            }
        }
        if (realConnection != null) {
            Util.closeQuietly(realConnection.socket());
        }
    }

    public final void cancel() {
        HttpStream httpStream;
        RealConnection realConnection;
        synchronized (this.aio) {
            this.aiu = true;
            httpStream = this.amH;
            realConnection = this.amF;
        }
        if (httpStream != null) {
            httpStream.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public final void connectionFailed(IOException iOException) {
        synchronized (this.aio) {
            if (this.amF != null && this.amF.successCount == 0) {
                if (!(this.amD == null || iOException == null)) {
                    this.amE.connectFailed(this.amD, iOException);
                }
                this.amD = null;
            }
        }
        m6158a(true, false, true);
    }

    public final void acquire(RealConnection realConnection) {
        realConnection.allocations.add(new WeakReference(this));
    }

    /* renamed from: c */
    private void m6160c(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (realConnection.allocations.get(i).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean recover(IOException iOException, QuickPromptPayActivity quickPromptPayActivity) {
        if (this.amF != null) {
            connectionFailed(iOException);
        }
        boolean z = quickPromptPayActivity == null || (quickPromptPayActivity instanceof RetryableSink);
        RouteSelector routeSelector = this.amE;
        return (routeSelector == null || routeSelector.hasNext()) && m6159a(iOException) && z;
    }

    /* renamed from: a */
    private boolean m6159a(IOException iOException) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return iOException instanceof SocketTimeoutException;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.address.toString();
    }
}
