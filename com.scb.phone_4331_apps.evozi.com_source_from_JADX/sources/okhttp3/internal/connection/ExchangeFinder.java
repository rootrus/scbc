package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public final class ExchangeFinder {
    private final Address address;
    private final Call call;
    private RealConnection connectingConnection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private boolean hasStreamFailure;
    private Route nextRouteToTry;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector;
    private final Transmitter transmitter;

    public ExchangeFinder(Transmitter transmitter2, RealConnectionPool realConnectionPool, Address address2, Call call2, EventListener eventListener2) {
        onGetStartedClick.write((Object) transmitter2, "transmitter");
        onGetStartedClick.write((Object) realConnectionPool, "connectionPool");
        onGetStartedClick.write((Object) address2, "address");
        onGetStartedClick.write((Object) call2, "call");
        onGetStartedClick.write((Object) eventListener2, "eventListener");
        this.transmitter = transmitter2;
        this.connectionPool = realConnectionPool;
        this.address = address2;
        this.call = call2;
        this.eventListener = eventListener2;
        this.routeSelector = new RouteSelector(address2, realConnectionPool.getRouteDatabase(), this.call, this.eventListener);
    }

    public final ExchangeCodec find(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
        onGetStartedClick.write((Object) okHttpClient, "client");
        onGetStartedClick.write((Object) chain, "chain");
        try {
            return findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec$okhttp(okHttpClient, chain);
        } catch (RouteException e) {
            trackFailure();
            throw e;
        } catch (IOException e2) {
            trackFailure();
            throw new RouteException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.isHealthy(r9) != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.RealConnection r0 = r3.findConnection(r4, r5, r6, r7, r8)
            okhttp3.internal.connection.RealConnectionPool r1 = r3.connectionPool
            monitor-enter(r1)
            int r2 = r0.getSuccessCount$okhttp()     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)
            return r0
        L_0x000f:
            o.HmlVerifyPhoneValidateOtpActivity r2 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x001d }
            monitor-exit(r1)
            boolean r1 = r0.isHealthy(r9)
            if (r1 != 0) goto L_0x001c
            r0.noNewExchanges()
            goto L_0x0000
        L_0x001c:
            return r0
        L_0x001d:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findHealthyConnection(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    private final okhttp3.internal.connection.RealConnection findConnection(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            o.onNotNowClick$read r0 = new o.onNotNowClick$read
            r0.<init>()
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            boolean r3 = r3.isCanceled()     // Catch:{ all -> 0x01e6 }
            if (r3 != 0) goto L_0x01dc
            r3 = 0
            r1.hasStreamFailure = r3     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()     // Catch:{ all -> 0x01e6 }
            r0.MediaBrowserCompat$ItemReceiver = r4     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()     // Catch:{ all -> 0x01e6 }
            r5 = 0
            if (r4 == 0) goto L_0x003e
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()     // Catch:{ all -> 0x01e6 }
            if (r4 != 0) goto L_0x0031
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01e6 }
        L_0x0031:
            boolean r4 = r4.getNoNewExchanges()     // Catch:{ all -> 0x01e6 }
            if (r4 == 0) goto L_0x003e
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            java.net.Socket r4 = r4.releaseConnectionNoEvents()     // Catch:{ all -> 0x01e6 }
            goto L_0x003f
        L_0x003e:
            r4 = r5
        L_0x003f:
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()     // Catch:{ all -> 0x01e6 }
            if (r6 == 0) goto L_0x0050
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()     // Catch:{ all -> 0x01e6 }
            r0.MediaBrowserCompat$ItemReceiver = r5     // Catch:{ all -> 0x01e6 }
            goto L_0x0051
        L_0x0050:
            r6 = r5
        L_0x0051:
            r7 = 1
            if (r6 != 0) goto L_0x0088
            okhttp3.internal.connection.RealConnectionPool r8 = r1.connectionPool     // Catch:{ all -> 0x01e6 }
            okhttp3.Address r9 = r1.address     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.Transmitter r10 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            boolean r8 = r8.transmitterAcquirePooledConnection(r9, r10, r5, r3)     // Catch:{ all -> 0x01e6 }
            if (r8 == 0) goto L_0x0069
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()     // Catch:{ all -> 0x01e6 }
            r8 = r5
            r9 = r7
            goto L_0x008a
        L_0x0069:
            okhttp3.Route r8 = r1.nextRouteToTry     // Catch:{ all -> 0x01e6 }
            if (r8 == 0) goto L_0x0072
            okhttp3.Route r8 = r1.nextRouteToTry     // Catch:{ all -> 0x01e6 }
            r1.nextRouteToTry = r5     // Catch:{ all -> 0x01e6 }
            goto L_0x0089
        L_0x0072:
            boolean r8 = r18.retryCurrentRoute()     // Catch:{ all -> 0x01e6 }
            if (r8 == 0) goto L_0x0088
            okhttp3.internal.connection.Transmitter r8 = r1.transmitter     // Catch:{ all -> 0x01e6 }
            okhttp3.internal.connection.RealConnection r8 = r8.getConnection()     // Catch:{ all -> 0x01e6 }
            if (r8 != 0) goto L_0x0083
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01e6 }
        L_0x0083:
            okhttp3.Route r8 = r8.route()     // Catch:{ all -> 0x01e6 }
            goto L_0x0089
        L_0x0088:
            r8 = r5
        L_0x0089:
            r9 = r3
        L_0x008a:
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01e6 }
            monitor-exit(r2)
            if (r4 == 0) goto L_0x0092
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r4)
        L_0x0092:
            T r2 = r0.MediaBrowserCompat$ItemReceiver
            okhttp3.internal.connection.RealConnection r2 = (okhttp3.internal.connection.RealConnection) r2
            if (r2 == 0) goto L_0x00aa
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.Call r4 = r1.call
            T r0 = r0.MediaBrowserCompat$ItemReceiver
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0
            if (r0 != 0) goto L_0x00a5
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x00a5:
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            r2.connectionReleased(r4, r0)
        L_0x00aa:
            if (r9 == 0) goto L_0x00bb
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            if (r6 != 0) goto L_0x00b5
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x00b5:
            r4 = r6
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r0.connectionAcquired(r2, r4)
        L_0x00bb:
            if (r6 == 0) goto L_0x00c3
            if (r6 != 0) goto L_0x00c2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x00c2:
            return r6
        L_0x00c3:
            if (r8 != 0) goto L_0x00de
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection
            if (r0 == 0) goto L_0x00d4
            if (r0 != 0) goto L_0x00ce
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x00ce:
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x00de
        L_0x00d4:
            okhttp3.internal.connection.RouteSelector r0 = r1.routeSelector
            okhttp3.internal.connection.RouteSelector$Selection r0 = r0.next()
            r1.routeSelection = r0
            r0 = r7
            goto L_0x00df
        L_0x00de:
            r0 = r3
        L_0x00df:
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01d9 }
            boolean r4 = r4.isCanceled()     // Catch:{ all -> 0x01d9 }
            if (r4 != 0) goto L_0x01cf
            if (r0 == 0) goto L_0x010b
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x00f3
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01d9 }
        L_0x00f3:
            java.util.List r0 = r0.getRoutes()     // Catch:{ all -> 0x01d9 }
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool     // Catch:{ all -> 0x01d9 }
            okhttp3.Address r10 = r1.address     // Catch:{ all -> 0x01d9 }
            okhttp3.internal.connection.Transmitter r11 = r1.transmitter     // Catch:{ all -> 0x01d9 }
            boolean r3 = r4.transmitterAcquirePooledConnection(r10, r11, r0, r3)     // Catch:{ all -> 0x01d9 }
            if (r3 == 0) goto L_0x010c
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch:{ all -> 0x01d9 }
            okhttp3.internal.connection.RealConnection r6 = r3.getConnection()     // Catch:{ all -> 0x01d9 }
            r9 = r7
            goto L_0x010c
        L_0x010b:
            r0 = r5
        L_0x010c:
            if (r9 != 0) goto L_0x0129
            if (r8 != 0) goto L_0x011b
            okhttp3.internal.connection.RouteSelector$Selection r3 = r1.routeSelection     // Catch:{ all -> 0x01d9 }
            if (r3 != 0) goto L_0x0117
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01d9 }
        L_0x0117:
            okhttp3.Route r8 = r3.next()     // Catch:{ all -> 0x01d9 }
        L_0x011b:
            okhttp3.internal.connection.RealConnection r6 = new okhttp3.internal.connection.RealConnection     // Catch:{ all -> 0x01d9 }
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool     // Catch:{ all -> 0x01d9 }
            if (r8 != 0) goto L_0x0124
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01d9 }
        L_0x0124:
            r6.<init>(r3, r8)     // Catch:{ all -> 0x01d9 }
            r1.connectingConnection = r6     // Catch:{ all -> 0x01d9 }
        L_0x0129:
            o.HmlVerifyPhoneValidateOtpActivity r3 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01d9 }
            monitor-exit(r2)
            if (r9 == 0) goto L_0x0143
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            if (r6 != 0) goto L_0x0137
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0137:
            r3 = r6
            okhttp3.Connection r3 = (okhttp3.Connection) r3
            r0.connectionAcquired(r2, r3)
            if (r6 != 0) goto L_0x0142
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0142:
            return r6
        L_0x0143:
            if (r6 != 0) goto L_0x0148
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0148:
            okhttp3.Call r2 = r1.call
            okhttp3.EventListener r3 = r1.eventListener
            r10 = r6
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r2
            r17 = r3
            r10.connect(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            okhttp3.internal.connection.RouteDatabase r2 = r2.getRouteDatabase()
            if (r6 != 0) goto L_0x0169
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0169:
            okhttp3.Route r3 = r6.route()
            r2.connected(r3)
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            r1.connectingConnection = r5     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool     // Catch:{ all -> 0x01cc }
            okhttp3.Address r4 = r1.address     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.Transmitter r9 = r1.transmitter     // Catch:{ all -> 0x01cc }
            boolean r0 = r3.transmitterAcquirePooledConnection(r4, r9, r0, r7)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x019b
            if (r6 != 0) goto L_0x0186
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01cc }
        L_0x0186:
            r6.setNoNewExchanges(r7)     // Catch:{ all -> 0x01cc }
            if (r6 != 0) goto L_0x018e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01cc }
        L_0x018e:
            java.net.Socket r5 = r6.socket()     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.RealConnection r6 = r0.getConnection()     // Catch:{ all -> 0x01cc }
            r1.nextRouteToTry = r8     // Catch:{ all -> 0x01cc }
            goto L_0x01af
        L_0x019b:
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch:{ all -> 0x01cc }
            if (r6 != 0) goto L_0x01a2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01cc }
        L_0x01a2:
            r0.put(r6)     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch:{ all -> 0x01cc }
            if (r6 != 0) goto L_0x01ac
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01cc }
        L_0x01ac:
            r0.acquireConnectionNoEvents(r6)     // Catch:{ all -> 0x01cc }
        L_0x01af:
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01cc }
            monitor-exit(r2)
            if (r5 == 0) goto L_0x01b7
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r5)
        L_0x01b7:
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            if (r6 != 0) goto L_0x01c0
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x01c0:
            r3 = r6
            okhttp3.Connection r3 = (okhttp3.Connection) r3
            r0.connectionAcquired(r2, r3)
            if (r6 != 0) goto L_0x01cb
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x01cb:
            return r6
        L_0x01cc:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01cf:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01d9 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01d9 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01d9 }
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01dc:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01e6 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01e6 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e6 }
            throw r0     // Catch:{ all -> 0x01e6 }
        L_0x01e6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final RealConnection connectingConnection() {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
            return this.connectingConnection;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void trackFailure() {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            synchronized (this.connectionPool) {
                this.hasStreamFailure = true;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final boolean hasStreamFailure() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.hasStreamFailure;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasRouteToTry() {
        /*
            r4 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r4.connectionPool
            monitor-enter(r0)
            okhttp3.Route r1 = r4.nextRouteToTry     // Catch:{ all -> 0x003c }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            boolean r1 = r4.retryCurrentRoute()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0023
            okhttp3.internal.connection.Transmitter r1 = r4.transmitter     // Catch:{ all -> 0x003c }
            okhttp3.internal.connection.RealConnection r1 = r1.getConnection()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x001b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x003c }
        L_0x001b:
            okhttp3.Route r1 = r1.route()     // Catch:{ all -> 0x003c }
            r4.nextRouteToTry = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r0)
            return r2
        L_0x0023:
            okhttp3.internal.connection.RouteSelector$Selection r1 = r4.routeSelection     // Catch:{ all -> 0x003c }
            r3 = 0
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.hasNext()     // Catch:{ all -> 0x003c }
            goto L_0x002e
        L_0x002d:
            r1 = r3
        L_0x002e:
            if (r1 != 0) goto L_0x003a
            okhttp3.internal.connection.RouteSelector r1 = r4.routeSelector     // Catch:{ all -> 0x003c }
            boolean r1 = r1.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            monitor-exit(r0)
            return r2
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.hasRouteToTry():boolean");
    }

    private final boolean retryCurrentRoute() {
        if (this.transmitter.getConnection() != null) {
            RealConnection connection = this.transmitter.getConnection();
            if (connection == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (connection.getRouteFailureCount$okhttp() == 0) {
                RealConnection connection2 = this.transmitter.getConnection();
                if (connection2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (Util.canReuseConnectionFor(connection2.route().address().url(), this.address.url())) {
                    return true;
                }
            }
        }
        return false;
    }
}
