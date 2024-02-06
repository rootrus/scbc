package okhttp3.internal.connection;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p089ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import p040o.GoodToKnowActivity;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit = 1;
    private final RealConnectionPool connectionPool;
    /* access modifiers changed from: private */
    public Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNanos = Long.MAX_VALUE;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private NsipPartnerPaymentReviewActivity sink;
    /* access modifiers changed from: private */
    public Socket socket;
    private NsipPartnerPaymentOtpActivity source;
    private int successCount;
    private final List<Reference<Transmitter>> transmitters = new ArrayList();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$0[Proxy.Type.HTTP.ordinal()] = 2;
            int[] iArr2 = new int[ErrorCode.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ErrorCode.REFUSED_STREAM.ordinal()] = 1;
            $EnumSwitchMapping$1[ErrorCode.CANCEL.ordinal()] = 2;
        }
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route2) {
        onGetStartedClick.write((Object) realConnectionPool, "connectionPool");
        onGetStartedClick.write((Object) route2, "route");
        this.connectionPool = realConnectionPool;
        this.route = route2;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    public final int getSuccessCount$okhttp() {
        return this.successCount;
    }

    public final void setSuccessCount$okhttp(int i) {
        this.successCount = i;
    }

    public final List<Reference<Transmitter>> getTransmitters() {
        return this.transmitters;
    }

    public final long getIdleAtNanos$okhttp() {
        return this.idleAtNanos;
    }

    public final void setIdleAtNanos$okhttp(long j) {
        this.idleAtNanos = j;
    }

    public final boolean isMultiplexed() {
        return this.http2Connection != null;
    }

    public final void noNewExchanges() {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            synchronized (this.connectionPool) {
                this.noNewExchanges = true;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9 A[Catch:{ IOException -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            java.lang.String r0 = "eventListener"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            okhttp3.Protocol r0 = r7.protocol
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x0177
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r10 = new okhttp3.internal.connection.ConnectionSpecSelector
            r10.<init>(r0)
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L_0x008d
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x007c
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r1.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L_0x0057
            goto L_0x009f
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CLEARTEXT communication to "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            r2.<init>(r0)
            java.io.IOException r2 = (java.io.IOException) r2
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x007c:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            java.io.IOException r1 = (java.io.IOException) r1
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x008d:
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0166
        L_0x009f:
            r11 = 0
            r12 = r11
        L_0x00a1:
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x0117 }
            boolean r0 = r0.requiresTunnel()     // Catch:{ IOException -> 0x0117 }
            if (r0 == 0) goto L_0x00c1
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0117 }
            java.net.Socket r0 = r7.rawSocket     // Catch:{ IOException -> 0x0117 }
            if (r0 == 0) goto L_0x00de
            r13 = r17
            r14 = r18
            goto L_0x00c8
        L_0x00c1:
            r13 = r17
            r14 = r18
            r7.connectSocket(r13, r14, r8, r9)     // Catch:{ IOException -> 0x0113 }
        L_0x00c8:
            r15 = r20
            r7.establishProtocol(r10, r15, r8, r9)     // Catch:{ IOException -> 0x0111 }
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x0111 }
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch:{ IOException -> 0x0111 }
            okhttp3.Route r1 = r7.route     // Catch:{ IOException -> 0x0111 }
            java.net.Proxy r1 = r1.proxy()     // Catch:{ IOException -> 0x0111 }
            okhttp3.Protocol r2 = r7.protocol     // Catch:{ IOException -> 0x0111 }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x0111 }
        L_0x00de:
            okhttp3.Route r0 = r7.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x00fc
            java.net.Socket r0 = r7.rawSocket
            if (r0 == 0) goto L_0x00eb
            goto L_0x00fc
        L_0x00eb:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            java.io.IOException r1 = (java.io.IOException) r1
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00fc:
            okhttp3.internal.http2.Http2Connection r0 = r7.http2Connection
            if (r0 == 0) goto L_0x0110
            okhttp3.internal.connection.RealConnectionPool r1 = r7.connectionPool
            monitor-enter(r1)
            int r0 = r0.maxConcurrentStreams()     // Catch:{ all -> 0x010d }
            r7.allocationLimit = r0     // Catch:{ all -> 0x010d }
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010d }
            monitor-exit(r1)
            return
        L_0x010d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0110:
            return
        L_0x0111:
            r0 = move-exception
            goto L_0x011d
        L_0x0113:
            r0 = move-exception
        L_0x0114:
            r15 = r20
            goto L_0x011d
        L_0x0117:
            r0 = move-exception
            r13 = r17
            r14 = r18
            goto L_0x0114
        L_0x011d:
            java.net.Socket r1 = r7.socket
            if (r1 == 0) goto L_0x0124
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x0124:
            java.net.Socket r1 = r7.rawSocket
            if (r1 == 0) goto L_0x012b
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x012b:
            r7.socket = r11
            r7.rawSocket = r11
            r7.source = r11
            r7.sink = r11
            r7.handshake = r11
            r7.protocol = r11
            r7.http2Connection = r11
            okhttp3.Route r1 = r7.route
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.route
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0156
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x0159
        L_0x0156:
            r12.addConnectException(r0)
        L_0x0159:
            if (r21 == 0) goto L_0x0163
            boolean r0 = r10.connectionFailed(r0)
            if (r0 == 0) goto L_0x0163
            goto L_0x00a1
        L_0x0163:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        L_0x0166:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            java.io.IOException r1 = (java.io.IOException) r1
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0177:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i4 = 0;
        while (i4 < 21) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Socket socket2 = this.rawSocket;
                if (socket2 != null) {
                    Util.closeQuietly(socket2);
                }
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), (Protocol) null);
                i4++;
            } else {
                return;
            }
        }
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket2;
        int i3;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null || !((i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i3 == 2)) {
            socket2 = new Socket(proxy);
        } else {
            socket2 = address.socketFactory().createSocket();
            if (socket2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
        }
        this.rawSocket = socket2;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socket2.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(socket2, this.route.socketAddress(), i);
            try {
                this.source = onSubmit.read(onSubmit.read(socket2));
                this.sink = onSubmit.read(onSubmit.write(socket2));
            } catch (NullPointerException e) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) e.getMessage(), (Object) NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.route.socketAddress());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i);
            }
        } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            startHttp2(i);
        } else {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        }
    }

    private final void startHttp2(int i) throws IOException {
        Socket socket2 = this.socket;
        if (socket2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity = this.source;
        if (nsipPartnerPaymentOtpActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.sink;
        if (nsipPartnerPaymentReviewActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        socket2.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true).socket(socket2, this.route.address().url().host(), nsipPartnerPaymentOtpActivity, nsipPartnerPaymentReviewActivity).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = build;
        Http2Connection.start$default(build, false, 1, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r11) throws java.io.IOException {
        /*
            r10 = this;
            okhttp3.Route r0 = r10.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r1 = r0.sslSocketFactory()
            r2 = 0
            if (r1 != 0) goto L_0x0010
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x019e }
        L_0x0010:
            java.net.Socket r3 = r10.rawSocket     // Catch:{ all -> 0x019e }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x019e }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x019e }
            okhttp3.HttpUrl r5 = r0.url()     // Catch:{ all -> 0x019e }
            int r5 = r5.port()     // Catch:{ all -> 0x019e }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x0196
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x019e }
            okhttp3.ConnectionSpec r11 = r11.configureSecureSocket(r1)     // Catch:{ all -> 0x0193 }
            boolean r3 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0193 }
            if (r3 == 0) goto L_0x004a
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0193 }
            okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x0193 }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x0193 }
            java.util.List r5 = r0.protocols()     // Catch:{ all -> 0x0193 }
            r3.configureTlsExtensions(r1, r4, r5)     // Catch:{ all -> 0x0193 }
        L_0x004a:
            r1.startHandshake()     // Catch:{ all -> 0x0193 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0193 }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.Companion     // Catch:{ all -> 0x0193 }
            java.lang.String r5 = "sslSocketSession"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r5)     // Catch:{ all -> 0x0193 }
            okhttp3.Handshake r4 = r4.get(r3)     // Catch:{ all -> 0x0193 }
            javax.net.ssl.HostnameVerifier r5 = r0.hostnameVerifier()     // Catch:{ all -> 0x0193 }
            if (r5 != 0) goto L_0x0065
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0193 }
        L_0x0065:
            okhttp3.HttpUrl r7 = r0.url()     // Catch:{ all -> 0x0193 }
            java.lang.String r7 = r7.host()     // Catch:{ all -> 0x0193 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0193 }
            if (r3 != 0) goto L_0x0116
            java.util.List r11 = r4.peerCertificates()     // Catch:{ all -> 0x0193 }
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0193 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0193 }
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x00f0
            r2 = 0
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x0090
            kotlin.TypeCastException r11 = new kotlin.TypeCastException     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r0)     // Catch:{ all -> 0x0193 }
            throw r11     // Catch:{ all -> 0x0193 }
        L_0x0090:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0193 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0193 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
            r3.<init>()     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = "\n              |Hostname "
            r3.append(r4)     // Catch:{ all -> 0x0193 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0193 }
            r3.append(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r3.append(r0)     // Catch:{ all -> 0x0193 }
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion     // Catch:{ all -> 0x0193 }
            r4 = r11
            java.security.cert.Certificate r4 = (java.security.cert.Certificate) r4     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r0.pin(r4)     // Catch:{ all -> 0x0193 }
            r3.append(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "\n              |    DN: "
            r3.append(r0)     // Catch:{ all -> 0x0193 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = "cert.subjectDN"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r4)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0193 }
            r3.append(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r3.append(r0)     // Catch:{ all -> 0x0193 }
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE     // Catch:{ all -> 0x0193 }
            java.util.List r11 = r0.allSubjectAltNames(r11)     // Catch:{ all -> 0x0193 }
            r3.append(r11)     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "\n              "
            r3.append(r11)     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = p040o.GoodToKnowActivity.IconCompatParcelizer(r11)     // Catch:{ all -> 0x0193 }
            r2.<init>(r11)     // Catch:{ all -> 0x0193 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0193 }
            throw r2     // Catch:{ all -> 0x0193 }
        L_0x00f0:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0193 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
            r2.<init>()     // Catch:{ all -> 0x0193 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0193 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0193 }
            r2.append(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0193 }
            r11.<init>(r0)     // Catch:{ all -> 0x0193 }
            java.lang.Throwable r11 = (java.lang.Throwable) r11     // Catch:{ all -> 0x0193 }
            throw r11     // Catch:{ all -> 0x0193 }
        L_0x0116:
            okhttp3.CertificatePinner r3 = r0.certificatePinner()     // Catch:{ all -> 0x0193 }
            if (r3 != 0) goto L_0x011f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0193 }
        L_0x011f:
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x0193 }
            okhttp3.TlsVersion r6 = r4.tlsVersion()     // Catch:{ all -> 0x0193 }
            okhttp3.CipherSuite r7 = r4.cipherSuite()     // Catch:{ all -> 0x0193 }
            java.util.List r8 = r4.localCertificates()     // Catch:{ all -> 0x0193 }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x0193 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0193 }
            o.FundActionsSuccessActivity r9 = (p040o.FundActionsSuccessActivity) r9     // Catch:{ all -> 0x0193 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0193 }
            r10.handshake = r5     // Catch:{ all -> 0x0193 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0193 }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x0193 }
            r4.<init>(r10)     // Catch:{ all -> 0x0193 }
            o.FundActionsSuccessActivity r4 = (p040o.FundActionsSuccessActivity) r4     // Catch:{ all -> 0x0193 }
            r3.check$okhttp(r0, r4)     // Catch:{ all -> 0x0193 }
            boolean r11 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0193 }
            if (r11 == 0) goto L_0x015b
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0193 }
            okhttp3.internal.platform.Platform r11 = r11.get()     // Catch:{ all -> 0x0193 }
            java.lang.String r2 = r11.getSelectedProtocol(r1)     // Catch:{ all -> 0x0193 }
        L_0x015b:
            r11 = r1
            java.net.Socket r11 = (java.net.Socket) r11     // Catch:{ all -> 0x0193 }
            r10.socket = r11     // Catch:{ all -> 0x0193 }
            r11 = r1
            java.net.Socket r11 = (java.net.Socket) r11     // Catch:{ all -> 0x0193 }
            o.HowToAddAccountStep2Activity r11 = p040o.onSubmit.read((java.net.Socket) r11)     // Catch:{ all -> 0x0193 }
            o.NsipPartnerPaymentOtpActivity r11 = p040o.onSubmit.read((p040o.HowToAddAccountStep2Activity) r11)     // Catch:{ all -> 0x0193 }
            r10.source = r11     // Catch:{ all -> 0x0193 }
            r11 = r1
            java.net.Socket r11 = (java.net.Socket) r11     // Catch:{ all -> 0x0193 }
            o.PinChangeActivity r11 = p040o.onSubmit.write((java.net.Socket) r11)     // Catch:{ all -> 0x0193 }
            o.NsipPartnerPaymentReviewActivity r11 = p040o.onSubmit.read((p040o.PinChangeActivity) r11)     // Catch:{ all -> 0x0193 }
            r10.sink = r11     // Catch:{ all -> 0x0193 }
            if (r2 == 0) goto L_0x0183
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x0193 }
            okhttp3.Protocol r11 = r11.get(r2)     // Catch:{ all -> 0x0193 }
            goto L_0x0185
        L_0x0183:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x0193 }
        L_0x0185:
            r10.protocol = r11     // Catch:{ all -> 0x0193 }
            if (r1 == 0) goto L_0x0192
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r11 = r11.get()
            r11.afterHandshake(r1)
        L_0x0192:
            return
        L_0x0193:
            r11 = move-exception
            r2 = r1
            goto L_0x019f
        L_0x0196:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x019e }
            throw r11     // Catch:{ all -> 0x019e }
        L_0x019e:
            r11 = move-exception
        L_0x019f:
            if (r2 == 0) goto L_0x01aa
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            r0.afterHandshake(r2)
        L_0x01aa:
            if (r2 == 0) goto L_0x01b1
            java.net.Socket r2 = (java.net.Socket) r2
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r2)
        L_0x01b1:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        boolean z = true;
        sb.append(Util.toHostHeader(httpUrl, true));
        sb.append(" HTTP/1.1");
        String obj = sb.toString();
        while (true) {
            NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity = this.source;
            if (nsipPartnerPaymentOtpActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.sink;
            if (nsipPartnerPaymentReviewActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec((OkHttpClient) null, (RealConnection) null, nsipPartnerPaymentOtpActivity, nsipPartnerPaymentReviewActivity);
            nsipPartnerPaymentOtpActivity.timeout().timeout((long) i, TimeUnit.MILLISECONDS);
            nsipPartnerPaymentReviewActivity.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            http1ExchangeCodec.writeRequest(request.headers(), obj);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            if (readResponseHeaders == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code == 200) {
                if (nsipPartnerPaymentOtpActivity.MediaMetadataCompat().read == 0) {
                    if (nsipPartnerPaymentReviewActivity.MediaMetadataCompat().read != 0) {
                        z = false;
                    }
                    if (z) {
                        return null;
                    }
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (code == 407) {
                Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                if (authenticate == null) {
                    throw new IOException("Failed to authenticate with proxy");
                } else if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("close", Response.header$default(build, "Connection", (String) null, 2, (Object) null), true)) {
                    return authenticate;
                } else {
                    request = authenticate;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected response code for CONNECT: ");
                sb2.append(build.code());
                throw new IOException(sb2.toString());
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", (RequestBody) null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return authenticate != null ? authenticate : build;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        onGetStartedClick.write((Object) address, "address");
        if (this.transmitters.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) address.url().host(), (Object) route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            if (certificatePinner == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            String host = address.url().host();
            Handshake handshake2 = handshake();
            if (handshake2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            certificatePinner.check(host, (List<? extends Certificate>) handshake2.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z;
        Iterable<Route> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Route route2 : iterable) {
            if (route2.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.route.socketAddress(), (Object) route2.socketAddress())) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean supportsUrl(HttpUrl httpUrl) {
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) httpUrl.host(), (Object) url.host())) {
            return true;
        }
        if (this.handshake == null) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
        String host = httpUrl.host();
        Handshake handshake2 = this.handshake;
        if (handshake2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Certificate certificate = handshake2.peerCertificates().get(0);
        if (certificate == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } else if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
            return true;
        } else {
            return false;
        }
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, Interceptor.Chain chain) throws SocketException {
        onGetStartedClick.write((Object) okHttpClient, "client");
        onGetStartedClick.write((Object) chain, "chain");
        Socket socket2 = this.socket;
        if (socket2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity = this.source;
        if (nsipPartnerPaymentOtpActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.sink;
        if (nsipPartnerPaymentReviewActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Http2Connection http2Connection2 = this.http2Connection;
        if (http2Connection2 != null) {
            return new Http2ExchangeCodec(okHttpClient, this, chain, http2Connection2);
        }
        socket2.setSoTimeout(chain.readTimeoutMillis());
        nsipPartnerPaymentOtpActivity.timeout().timeout((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        nsipPartnerPaymentReviewActivity.timeout().timeout((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1ExchangeCodec(okHttpClient, this, nsipPartnerPaymentOtpActivity, nsipPartnerPaymentReviewActivity);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(Exchange exchange) throws SocketException {
        onGetStartedClick.write((Object) exchange, "exchange");
        Socket socket2 = this.socket;
        if (socket2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity = this.source;
        if (nsipPartnerPaymentOtpActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.sink;
        if (nsipPartnerPaymentReviewActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        socket2.setSoTimeout(0);
        noNewExchanges();
        return new RealConnection$newWebSocketStreams$1(exchange, nsipPartnerPaymentOtpActivity, nsipPartnerPaymentReviewActivity, true, nsipPartnerPaymentOtpActivity, nsipPartnerPaymentReviewActivity);
    }

    public final Route route() {
        return this.route;
    }

    public final void cancel() {
        Socket socket2 = this.rawSocket;
        if (socket2 != null) {
            Util.closeQuietly(socket2);
        }
    }

    public final Socket socket() {
        Socket socket2 = this.socket;
        if (socket2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return socket2;
    }

    public final boolean isHealthy(boolean z) {
        int soTimeout;
        Socket socket2 = this.socket;
        if (socket2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity = this.source;
        if (nsipPartnerPaymentOtpActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        if (socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection2 = this.http2Connection;
        if (http2Connection2 != null) {
            return !http2Connection2.isShutdown();
        }
        if (z) {
            try {
                soTimeout = socket2.getSoTimeout();
                socket2.setSoTimeout(1);
                boolean MediaBrowserCompat$CustomActionResultReceiver = nsipPartnerPaymentOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                socket2.setSoTimeout(soTimeout);
                return !MediaBrowserCompat$CustomActionResultReceiver;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public final void onStream(Http2Stream http2Stream) throws IOException {
        onGetStartedClick.write((Object) http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    public final void onSettings(Http2Connection http2Connection2) {
        onGetStartedClick.write((Object) http2Connection2, "connection");
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection2.maxConcurrentStreams();
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final void trackFailure$okhttp(IOException iOException) {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            synchronized (this.connectionPool) {
                if (iOException instanceof StreamResetException) {
                    int i = WhenMappings.$EnumSwitchMapping$1[((StreamResetException) iOException).errorCode.ordinal()];
                    if (i == 1) {
                        int i2 = this.refusedStreamCount + 1;
                        this.refusedStreamCount = i2;
                        if (i2 > 1) {
                            this.noNewExchanges = true;
                            this.routeFailureCount++;
                        }
                    } else if (i != 2) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (!isMultiplexed() || (iOException instanceof ConnectionShutdownException)) {
                    this.noNewExchanges = true;
                    if (this.successCount == 0) {
                        if (iOException != null) {
                            this.connectionPool.connectFailed(this.route, iOException);
                        }
                        this.routeFailureCount++;
                    }
                }
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final Protocol protocol() {
        Protocol protocol2 = this.protocol;
        if (protocol2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return protocol2;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake2 = this.handshake;
        if (handshake2 == null || (obj = handshake2.cipherSuite()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
            onGetStartedClick.write((Object) realConnectionPool, "connectionPool");
            onGetStartedClick.write((Object) route, "route");
            onGetStartedClick.write((Object) socket, "socket");
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNanos$okhttp(j);
            return realConnection;
        }
    }
}
