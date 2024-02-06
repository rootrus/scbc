package okhttp3.repackaged;

import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.repackaged.internal.Internal;
import okhttp3.repackaged.internal.RouteDatabase;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.http.StreamAllocation;
import okhttp3.repackaged.internal.p090io.RealConnection;

public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Executor ahj = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    private final int ahk;
    private final long ahl;
    private final Runnable ahm;
    private final Deque<RealConnection> ahn;
    final RouteDatabase aho;
    boolean cleanupRunning;

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this.ahm = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r8 = this;
                L_0x0000:
                    okhttp3.repackaged.ConnectionPool r0 = okhttp3.repackaged.ConnectionPool.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.cleanup(r1)
                    r2 = -1
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    okhttp3.repackaged.ConnectionPool r6 = okhttp3.repackaged.ConnectionPool.this
                    monitor-enter(r6)
                    okhttp3.repackaged.ConnectionPool r7 = okhttp3.repackaged.ConnectionPool.this     // Catch:{ InterruptedException -> 0x002e, all -> 0x002b }
                    java.lang.Long.signum(r4)
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    int r0 = (int) r0
                    r7.wait(r4, r0)     // Catch:{ InterruptedException -> 0x002e, all -> 0x002b }
                    goto L_0x002e
                L_0x002b:
                    r0 = move-exception
                    monitor-exit(r6)
                    throw r0
                L_0x002e:
                    monitor-exit(r6)
                    goto L_0x0000
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.ConnectionPool.C102001.run():void");
            }
        };
        this.ahn = new ArrayDeque();
        this.aho = new RouteDatabase();
        this.ahk = i;
        this.ahl = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final int idleConnectionCount() {
        int i;
        synchronized (this) {
            i = 0;
            for (RealConnection realConnection : this.ahn) {
                if (realConnection.allocations.isEmpty()) {
                    i++;
                }
            }
        }
        return i;
    }

    public final int connectionCount() {
        int size;
        synchronized (this) {
            size = this.ahn.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final RealConnection mo58279a(Address address, StreamAllocation streamAllocation) {
        for (RealConnection next : this.ahn) {
            if (next.allocations.size() < next.allocationLimit && address.equals(next.route().address) && !next.noNewStreams) {
                streamAllocation.acquire(next);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58280a(RealConnection realConnection) {
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            ahj.execute(this.ahm);
        }
        this.ahn.add(realConnection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo58281b(RealConnection realConnection) {
        if (realConnection.noNewStreams || this.ahk == 0) {
            this.ahn.remove(realConnection);
            return true;
        }
        notifyAll();
        return false;
    }

    public final void evictAll() {
        ArrayList<RealConnection> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<RealConnection> it = this.ahn.iterator();
            while (it.hasNext()) {
                RealConnection next = it.next();
                if (next.allocations.isEmpty()) {
                    next.noNewStreams = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        for (RealConnection socket : arrayList) {
            Util.closeQuietly(socket.socket());
        }
    }

    /* access modifiers changed from: package-private */
    public final long cleanup(long j) {
        synchronized (this) {
            RealConnection realConnection = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (RealConnection next : this.ahn) {
                if (m5804a(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.idleAtNanos;
                    if (j3 > j2) {
                        realConnection = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.ahl) {
                if (i <= this.ahk) {
                    if (i > 0) {
                        long j4 = this.ahl;
                        return j4 - j2;
                    } else if (i2 > 0) {
                        long j5 = this.ahl;
                        return j5;
                    } else {
                        this.cleanupRunning = false;
                        return -1;
                    }
                }
            }
            this.ahn.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            return 0;
        }
    }

    /* renamed from: a */
    private int m5804a(RealConnection realConnection, long j) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).get() != null) {
                i++;
            } else {
                Logger logger = Internal.logger;
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(realConnection.route().address().url());
                sb.append(" was leaked. Did you forget to close a response body?");
                logger.warning(sb.toString());
                list.remove(i);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j - this.ahl;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
