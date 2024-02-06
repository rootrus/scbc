package okhttp3;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.p089ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import p040o.FundFactSheetActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.QuickAccountSelectAdapter$SelectedHolder_ViewBinding;
import p040o.onGetStartedClick;

public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    /* access modifiers changed from: private */
    public static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final SocketFactory socketFactory;
    /* access modifiers changed from: private */
    public final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x006e, code lost:
        if (r0 == null) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OkHttpClient(okhttp3.OkHttpClient.Builder r4) {
        /*
            r3 = this;
            java.lang.String r0 = "builder"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            r3.<init>()
            okhttp3.Dispatcher r0 = r4.getDispatcher$okhttp()
            r3.dispatcher = r0
            okhttp3.ConnectionPool r0 = r4.getConnectionPool$okhttp()
            r3.connectionPool = r0
            java.util.List r0 = r4.getInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal.Util.toImmutableList(r0)
            r3.interceptors = r0
            java.util.List r0 = r4.getNetworkInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal.Util.toImmutableList(r0)
            r3.networkInterceptors = r0
            okhttp3.EventListener$Factory r0 = r4.getEventListenerFactory$okhttp()
            r3.eventListenerFactory = r0
            boolean r0 = r4.getRetryOnConnectionFailure$okhttp()
            r3.retryOnConnectionFailure = r0
            okhttp3.Authenticator r0 = r4.getAuthenticator$okhttp()
            r3.authenticator = r0
            boolean r0 = r4.getFollowRedirects$okhttp()
            r3.followRedirects = r0
            boolean r0 = r4.getFollowSslRedirects$okhttp()
            r3.followSslRedirects = r0
            okhttp3.CookieJar r0 = r4.getCookieJar$okhttp()
            r3.cookieJar = r0
            okhttp3.Cache r0 = r4.getCache$okhttp()
            r3.cache = r0
            okhttp3.Dns r0 = r4.getDns$okhttp()
            r3.dns = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            r3.proxy = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            if (r0 != 0) goto L_0x0070
            java.net.ProxySelector r0 = r4.getProxySelector$okhttp()
            if (r0 != 0) goto L_0x006e
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x006e:
            if (r0 != 0) goto L_0x0074
        L_0x0070:
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.INSTANCE
            java.net.ProxySelector r0 = (java.net.ProxySelector) r0
        L_0x0074:
            r3.proxySelector = r0
            okhttp3.Authenticator r0 = r4.getProxyAuthenticator$okhttp()
            r3.proxyAuthenticator = r0
            javax.net.SocketFactory r0 = r4.getSocketFactory$okhttp()
            r3.socketFactory = r0
            java.util.List r0 = r4.getConnectionSpecs$okhttp()
            r3.connectionSpecs = r0
            java.util.List r0 = r4.getProtocols$okhttp()
            r3.protocols = r0
            javax.net.ssl.HostnameVerifier r0 = r4.getHostnameVerifier$okhttp()
            r3.hostnameVerifier = r0
            int r0 = r4.getCallTimeout$okhttp()
            r3.callTimeoutMillis = r0
            int r0 = r4.getConnectTimeout$okhttp()
            r3.connectTimeoutMillis = r0
            int r0 = r4.getReadTimeout$okhttp()
            r3.readTimeoutMillis = r0
            int r0 = r4.getWriteTimeout$okhttp()
            r3.writeTimeoutMillis = r0
            int r0 = r4.getPingInterval$okhttp()
            r3.pingIntervalMillis = r0
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            r1 = 1
            if (r0 != 0) goto L_0x011c
            java.util.List<okhttp3.ConnectionSpec> r0 = r3.connectionSpecs
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00cb
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00cb
            goto L_0x00e3
        L_0x00cb:
            java.util.Iterator r0 = r0.iterator()
        L_0x00cf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r0.next()
            okhttp3.ConnectionSpec r2 = (okhttp3.ConnectionSpec) r2
            boolean r2 = r2.isTls()
            if (r2 == 0) goto L_0x00cf
            r0 = 0
            goto L_0x00e4
        L_0x00e3:
            r0 = r1
        L_0x00e4:
            if (r0 != 0) goto L_0x011c
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            javax.net.ssl.X509TrustManager r0 = r0.platformTrustManager()
            r3.x509TrustManager = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            javax.net.ssl.X509TrustManager r2 = r3.x509TrustManager
            r0.configureTrustManager(r2)
            okhttp3.OkHttpClient$Companion r0 = Companion
            javax.net.ssl.X509TrustManager r2 = r3.x509TrustManager
            if (r2 != 0) goto L_0x0106
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0106:
            javax.net.ssl.SSLSocketFactory r0 = r0.newSslSocketFactory(r2)
            r3.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner$Companion r0 = okhttp3.internal.tls.CertificateChainCleaner.Companion
            javax.net.ssl.X509TrustManager r2 = r3.x509TrustManager
            if (r2 != 0) goto L_0x0115
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0115:
            okhttp3.internal.tls.CertificateChainCleaner r0 = r0.get((javax.net.ssl.X509TrustManager) r2)
            r3.certificateChainCleaner = r0
            goto L_0x012e
        L_0x011c:
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            r3.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.getCertificateChainCleaner$okhttp()
            r3.certificateChainCleaner = r0
            javax.net.ssl.X509TrustManager r0 = r4.getX509TrustManagerOrNull$okhttp()
            r3.x509TrustManager = r0
        L_0x012e:
            javax.net.ssl.SSLSocketFactory r0 = r3.sslSocketFactoryOrNull
            if (r0 == 0) goto L_0x013d
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            javax.net.ssl.SSLSocketFactory r2 = r3.sslSocketFactoryOrNull
            r0.configureSslSocketFactory(r2)
        L_0x013d:
            okhttp3.CertificatePinner r4 = r4.getCertificatePinner$okhttp()
            okhttp3.internal.tls.CertificateChainCleaner r0 = r3.certificateChainCleaner
            okhttp3.CertificatePinner r4 = r4.withCertificateChainCleaner$okhttp(r0)
            r3.certificatePinner = r4
            java.util.List<okhttp3.Interceptor> r4 = r3.interceptors
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r4 == 0) goto L_0x01a7
            r2 = 0
            boolean r4 = r4.contains(r2)
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x0188
            java.util.List<okhttp3.Interceptor> r4 = r3.networkInterceptors
            if (r4 == 0) goto L_0x0182
            boolean r4 = r4.contains(r2)
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x0163
            return
        L_0x0163:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Null network interceptor: "
            r4.append(r0)
            java.util.List<okhttp3.Interceptor> r0 = r3.networkInterceptors
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0182:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            r4.<init>(r0)
            throw r4
        L_0x0188:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Null interceptor: "
            r4.append(r0)
            java.util.List<okhttp3.Interceptor> r0 = r3.interceptors
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x01a7:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.<init>(okhttp3.OkHttpClient$Builder):void");
    }

    public Object clone() {
        return super.clone();
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public Call newCall(Request request) {
        onGetStartedClick.write((Object) request, "request");
        return RealCall.Companion.newRealCall(this, request, false);
    }

    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        onGetStartedClick.write((Object) request, "request");
        onGetStartedClick.write((Object) webSocketListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random(), (long) this.pingIntervalMillis);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m6305deprecated_dispatcher() {
        return this.dispatcher;
    }

    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m6302deprecated_connectionPool() {
        return this.connectionPool;
    }

    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m6311deprecated_interceptors() {
        return this.interceptors;
    }

    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m6312deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m6307deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m6319deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m6297deprecated_authenticator() {
        return this.authenticator;
    }

    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m6308deprecated_followRedirects() {
        return this.followRedirects;
    }

    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m6309deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m6304deprecated_cookieJar() {
        return this.cookieJar;
    }

    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m6298deprecated_cache() {
        return this.cache;
    }

    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m6306deprecated_dns() {
        return this.dns;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m6315deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m6317deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m6316deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m6320deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m6321deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m6303deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m6314deprecated_protocols() {
        return this.protocols;
    }

    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m6310deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m6300deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m6299deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m6301deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m6318deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m6322deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m6313deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.authenticator = Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = Authenticator.NONE;
            SocketFactory socketFactory2 = SocketFactory.getDefault();
            onGetStartedClick.IconCompatParcelizer((Object) socketFactory2, "SocketFactory.getDefault()");
            this.socketFactory = socketFactory2;
            this.connectionSpecs = OkHttpClient.Companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = OkHttpClient.Companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher2) {
            onGetStartedClick.write((Object) dispatcher2, "<set-?>");
            this.dispatcher = dispatcher2;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool2) {
            onGetStartedClick.write((Object) connectionPool2, "<set-?>");
            this.connectionPool = connectionPool2;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            onGetStartedClick.write((Object) factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator2) {
            onGetStartedClick.write((Object) authenticator2, "<set-?>");
            this.authenticator = authenticator2;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar2) {
            onGetStartedClick.write((Object) cookieJar2, "<set-?>");
            this.cookieJar = cookieJar2;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final void setCache$okhttp(Cache cache2) {
            this.cache = cache2;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final void setDns$okhttp(Dns dns2) {
            onGetStartedClick.write((Object) dns2, "<set-?>");
            this.dns = dns2;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final void setProxy$okhttp(Proxy proxy2) {
            this.proxy = proxy2;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector2) {
            this.proxySelector = proxySelector2;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator2) {
            onGetStartedClick.write((Object) authenticator2, "<set-?>");
            this.proxyAuthenticator = authenticator2;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory2) {
            onGetStartedClick.write((Object) socketFactory2, "<set-?>");
            this.socketFactory = socketFactory2;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            onGetStartedClick.write((Object) list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            onGetStartedClick.write((Object) list, "<set-?>");
            this.protocols = list;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier2) {
            onGetStartedClick.write((Object) hostnameVerifier2, "<set-?>");
            this.hostnameVerifier = hostnameVerifier2;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner2) {
            onGetStartedClick.write((Object) certificatePinner2, "<set-?>");
            this.certificatePinner = certificatePinner2;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
            this.certificateChainCleaner = certificateChainCleaner2;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            onGetStartedClick.write((Object) okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.interceptors, okHttpClient.interceptors());
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
        }

        public final Builder dispatcher(Dispatcher dispatcher2) {
            onGetStartedClick.write((Object) dispatcher2, "dispatcher");
            Builder builder = this;
            builder.dispatcher = dispatcher2;
            return builder;
        }

        public final Builder connectionPool(ConnectionPool connectionPool2) {
            onGetStartedClick.write((Object) connectionPool2, "connectionPool");
            Builder builder = this;
            builder.connectionPool = connectionPool2;
            return builder;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            onGetStartedClick.write((Object) interceptor, "interceptor");
            Builder builder = this;
            builder.interceptors.add(interceptor);
            return builder;
        }

        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m6323addInterceptor(FundFactSheetActivity<? super Interceptor.Chain, Response> fundFactSheetActivity) {
            onGetStartedClick.write((Object) fundFactSheetActivity, "block");
            Interceptor.Companion companion = Interceptor.Companion;
            return addInterceptor(new OkHttpClient$Builder$addInterceptor$$inlined$invoke$1(fundFactSheetActivity));
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            onGetStartedClick.write((Object) interceptor, "interceptor");
            Builder builder = this;
            builder.networkInterceptors.add(interceptor);
            return builder;
        }

        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m6324addNetworkInterceptor(FundFactSheetActivity<? super Interceptor.Chain, Response> fundFactSheetActivity) {
            onGetStartedClick.write((Object) fundFactSheetActivity, "block");
            Interceptor.Companion companion = Interceptor.Companion;
            return addNetworkInterceptor(new OkHttpClient$Builder$addNetworkInterceptor$$inlined$invoke$1(fundFactSheetActivity));
        }

        public final Builder eventListener(EventListener eventListener) {
            onGetStartedClick.write((Object) eventListener, "eventListener");
            Builder builder = this;
            builder.eventListenerFactory = Util.asFactory(eventListener);
            return builder;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            onGetStartedClick.write((Object) factory, "eventListenerFactory");
            Builder builder = this;
            builder.eventListenerFactory = factory;
            return builder;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            Builder builder = this;
            builder.retryOnConnectionFailure = z;
            return builder;
        }

        public final Builder authenticator(Authenticator authenticator2) {
            onGetStartedClick.write((Object) authenticator2, "authenticator");
            Builder builder = this;
            builder.authenticator = authenticator2;
            return builder;
        }

        public final Builder followRedirects(boolean z) {
            Builder builder = this;
            builder.followRedirects = z;
            return builder;
        }

        public final Builder followSslRedirects(boolean z) {
            Builder builder = this;
            builder.followSslRedirects = z;
            return builder;
        }

        public final Builder cookieJar(CookieJar cookieJar2) {
            onGetStartedClick.write((Object) cookieJar2, "cookieJar");
            Builder builder = this;
            builder.cookieJar = cookieJar2;
            return builder;
        }

        public final Builder cache(Cache cache2) {
            Builder builder = this;
            builder.cache = cache2;
            return builder;
        }

        public final Builder dns(Dns dns2) {
            onGetStartedClick.write((Object) dns2, "dns");
            Builder builder = this;
            builder.dns = dns2;
            return builder;
        }

        public final Builder proxy(Proxy proxy2) {
            Builder builder = this;
            builder.proxy = proxy2;
            return builder;
        }

        public final Builder proxySelector(ProxySelector proxySelector2) {
            onGetStartedClick.write((Object) proxySelector2, "proxySelector");
            Builder builder = this;
            builder.proxySelector = proxySelector2;
            return builder;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator2) {
            onGetStartedClick.write((Object) authenticator2, "proxyAuthenticator");
            Builder builder = this;
            builder.proxyAuthenticator = authenticator2;
            return builder;
        }

        public final Builder socketFactory(SocketFactory socketFactory2) {
            onGetStartedClick.write((Object) socketFactory2, "socketFactory");
            Builder builder = this;
            if (!(socketFactory2 instanceof SSLSocketFactory)) {
                builder.socketFactory = socketFactory2;
                return builder;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
            Builder builder = this;
            builder.sslSocketFactoryOrNull = sSLSocketFactory;
            builder.certificateChainCleaner = Platform.Companion.get().buildCertificateChainCleaner(sSLSocketFactory);
            return builder;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
            onGetStartedClick.write((Object) x509TrustManager, "trustManager");
            Builder builder = this;
            builder.sslSocketFactoryOrNull = sSLSocketFactory;
            builder.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
            builder.x509TrustManagerOrNull = x509TrustManager;
            return builder;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            onGetStartedClick.write((Object) list, "connectionSpecs");
            Builder builder = this;
            builder.connectionSpecs = Util.toImmutableList(list);
            return builder;
        }

        public final Builder protocols(List<? extends Protocol> list) {
            onGetStartedClick.write((Object) list, "protocols");
            Builder builder = this;
            Collection collection = list;
            onGetStartedClick.write((Object) collection, "$this$toMutableList");
            List arrayList = new ArrayList(collection);
            boolean z = false;
            if (arrayList.contains(Protocol.H2_PRIOR_KNOWLEDGE) || arrayList.contains(Protocol.HTTP_1_1)) {
                if (!arrayList.contains(Protocol.H2_PRIOR_KNOWLEDGE) || arrayList.size() <= 1) {
                    z = true;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("protocols containing h2_prior_knowledge cannot use other protocols: ");
                    sb.append(arrayList);
                    throw new IllegalArgumentException(sb.toString().toString());
                } else if (!(!arrayList.contains(Protocol.HTTP_1_0))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("protocols must not contain http/1.0: ");
                    sb2.append(arrayList);
                    throw new IllegalArgumentException(sb2.toString().toString());
                } else if (!arrayList.contains((Object) null)) {
                    arrayList.remove(Protocol.SPDY_3);
                    List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(list);
                    onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiableList(protocols)");
                    builder.protocols = unmodifiableList;
                    return builder;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("protocols must contain h2_prior_knowledge or http/1.1: ");
                sb3.append(arrayList);
                throw new IllegalArgumentException(sb3.toString().toString());
            }
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier2) {
            onGetStartedClick.write((Object) hostnameVerifier2, "hostnameVerifier");
            Builder builder = this;
            builder.hostnameVerifier = hostnameVerifier2;
            return builder;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner2) {
            onGetStartedClick.write((Object) certificatePinner2, "certificatePinner");
            Builder builder = this;
            builder.certificatePinner = certificatePinner2;
            return builder;
        }

        public final Builder callTimeout(long j, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "unit");
            Builder builder = this;
            builder.callTimeout = Util.checkDuration("timeout", j, timeUnit);
            return builder;
        }

        public final Builder callTimeout(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
            onGetStartedClick.write((Object) quickAccountSelectAdapter$SelectedHolder_ViewBinding, "duration");
            Builder builder = this;
            builder.callTimeout = Util.checkDuration("timeout", quickAccountSelectAdapter$SelectedHolder_ViewBinding.toMillis(), TimeUnit.MILLISECONDS);
            return builder;
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "unit");
            Builder builder = this;
            builder.connectTimeout = Util.checkDuration("timeout", j, timeUnit);
            return builder;
        }

        public final Builder connectTimeout(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
            onGetStartedClick.write((Object) quickAccountSelectAdapter$SelectedHolder_ViewBinding, "duration");
            Builder builder = this;
            builder.connectTimeout = Util.checkDuration("timeout", quickAccountSelectAdapter$SelectedHolder_ViewBinding.toMillis(), TimeUnit.MILLISECONDS);
            return builder;
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "unit");
            Builder builder = this;
            builder.readTimeout = Util.checkDuration("timeout", j, timeUnit);
            return builder;
        }

        public final Builder readTimeout(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
            onGetStartedClick.write((Object) quickAccountSelectAdapter$SelectedHolder_ViewBinding, "duration");
            Builder builder = this;
            builder.readTimeout = Util.checkDuration("timeout", quickAccountSelectAdapter$SelectedHolder_ViewBinding.toMillis(), TimeUnit.MILLISECONDS);
            return builder;
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "unit");
            Builder builder = this;
            builder.writeTimeout = Util.checkDuration("timeout", j, timeUnit);
            return builder;
        }

        public final Builder writeTimeout(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
            onGetStartedClick.write((Object) quickAccountSelectAdapter$SelectedHolder_ViewBinding, "duration");
            Builder builder = this;
            builder.writeTimeout = Util.checkDuration("timeout", quickAccountSelectAdapter$SelectedHolder_ViewBinding.toMillis(), TimeUnit.MILLISECONDS);
            return builder;
        }

        public final Builder pingInterval(long j, TimeUnit timeUnit) {
            onGetStartedClick.write((Object) timeUnit, "unit");
            Builder builder = this;
            builder.pingInterval = Util.checkDuration("interval", j, timeUnit);
            return builder;
        }

        public final Builder pingInterval(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
            onGetStartedClick.write((Object) quickAccountSelectAdapter$SelectedHolder_ViewBinding, "duration");
            Builder builder = this;
            builder.pingInterval = Util.checkDuration("timeout", quickAccountSelectAdapter$SelectedHolder_ViewBinding.toMillis(), TimeUnit.MILLISECONDS);
            return builder;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        /* access modifiers changed from: private */
        public final SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) {
            try {
                SSLContext newSSLContext = Platform.Companion.get().newSSLContext();
                newSSLContext.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
                onGetStartedClick.IconCompatParcelizer((Object) socketFactory, "sslContext.socketFactory");
                return socketFactory;
            } catch (GeneralSecurityException e) {
                throw new AssertionError("No System TLS", e);
            }
        }
    }
}
