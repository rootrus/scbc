package okhttp3.repackaged;

import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.repackaged.Call;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.internal.Internal;
import okhttp3.repackaged.internal.InternalCache;
import okhttp3.repackaged.internal.Platform;
import okhttp3.repackaged.internal.RouteDatabase;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.http.StreamAllocation;
import okhttp3.repackaged.internal.p090io.RealConnection;
import okhttp3.repackaged.internal.tls.OkHostnameVerifier;
import okhttp3.repackaged.internal.tls.TrustRootIndex;

public class OkHttpClient implements Cloneable, Call.Factory {
    /* access modifiers changed from: private */
    public static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableList((T[]) new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS, ConnectionSpec.CLEARTEXT});
    /* access modifiers changed from: private */
    public static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableList((T[]) new Protocol[]{Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1});
    final InternalCache agE;
    final Dns agx;
    final Authenticator agy;
    final CertificatePinner agz;
    final TrustRootIndex ahf;
    final Dispatcher aik;
    final CookieJar ail;
    final Cache aim;
    final Authenticator ain;
    final ConnectionPool aio;
    final int connectTimeout;
    final List<ConnectionSpec> connectionSpecs;
    final boolean followRedirects;
    final boolean followSslRedirects;
    final HostnameVerifier hostnameVerifier;
    final List<Interceptor> interceptors;
    final List<Interceptor> networkInterceptors;
    final List<Protocol> protocols;
    final Proxy proxy;
    final ProxySelector proxySelector;
    final int readTimeout;
    final boolean retryOnConnectionFailure;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final int writeTimeout;

    static {
        Internal.instance = new Internal() {
            public final void addLenient(Headers.Builder builder, String str) {
                builder.mo58373aT(str);
            }

            public final void addLenient(Headers.Builder builder, String str, String str2) {
                builder.mo58372U(str, str2);
            }

            public final void setCache(Builder builder, InternalCache internalCache) {
                builder.mo58500a(internalCache);
            }

            public final InternalCache internalCache(OkHttpClient okHttpClient) {
                return okHttpClient.mo58486uq();
            }

            public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
                return connectionPool.mo58281b(realConnection);
            }

            public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                return connectionPool.mo58279a(address, streamAllocation);
            }

            public final void put(ConnectionPool connectionPool, RealConnection realConnection) {
                connectionPool.mo58280a(realConnection);
            }

            public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
                return connectionPool.aho;
            }

            public final void callEnqueue(Call call, Callback callback, boolean z) {
                ((C10217a) call).mo58614a(callback, z);
            }

            public final StreamAllocation callEngineGetStreamAllocation(Call call) {
                return ((C10217a) call).aiw.streamAllocation;
            }

            public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
                connectionSpec.apply(sSLSocket, z);
            }

            public final HttpUrl getHttpUrlChecked(String str) throws MalformedURLException, UnknownHostException {
                return HttpUrl.m5845aU(str);
            }
        };
    }

    public OkHttpClient() {
        this(new Builder());
    }

    private OkHttpClient(Builder builder) {
        boolean z;
        this.aik = builder.aik;
        this.proxy = builder.proxy;
        this.protocols = builder.protocols;
        this.connectionSpecs = builder.connectionSpecs;
        this.interceptors = Util.immutableList(builder.interceptors);
        this.networkInterceptors = Util.immutableList(builder.networkInterceptors);
        this.proxySelector = builder.proxySelector;
        this.ail = builder.ail;
        this.aim = builder.aim;
        this.agE = builder.agE;
        this.socketFactory = builder.socketFactory;
        Iterator<ConnectionSpec> it = this.connectionSpecs.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ConnectionSpec next = it.next();
                if (z || next.isTls()) {
                    z = true;
                }
            }
        }
        if (builder.sslSocketFactory != null || !z) {
            this.sslSocketFactory = builder.sslSocketFactory;
        } else {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                this.sslSocketFactory = instance.getSocketFactory();
            } catch (GeneralSecurityException unused) {
                throw new AssertionError();
            }
        }
        if (this.sslSocketFactory == null || builder.ahf != null) {
            this.ahf = builder.ahf;
            this.agz = builder.agz;
        } else {
            X509TrustManager trustManager = Platform.get().trustManager(this.sslSocketFactory);
            if (trustManager != null) {
                this.ahf = Platform.get().trustRootIndex(trustManager);
                this.agz = builder.agz.mo58261um().trustRootIndex(this.ahf).build();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to extract the trust manager on ");
                sb.append(Platform.get());
                sb.append(", sslSocketFactory is ");
                sb.append(this.sslSocketFactory.getClass());
                throw new IllegalStateException(sb.toString());
            }
        }
        this.hostnameVerifier = builder.hostnameVerifier;
        this.agy = builder.agy;
        this.ain = builder.ain;
        this.aio = builder.aio;
        this.agx = builder.agx;
        this.followSslRedirects = builder.followSslRedirects;
        this.followRedirects = builder.followRedirects;
        this.retryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.writeTimeout = builder.writeTimeout;
    }

    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    public int readTimeoutMillis() {
        return this.readTimeout;
    }

    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    public Proxy proxy() {
        return this.proxy;
    }

    public ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public CookieJar cookieJar() {
        return this.ail;
    }

    public Cache cache() {
        return this.aim;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: uq */
    public InternalCache mo58486uq() {
        Cache cache = this.aim;
        return cache != null ? cache.agE : this.agE;
    }

    public Dns dns() {
        return this.agx;
    }

    public SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public CertificatePinner certificatePinner() {
        return this.agz;
    }

    public Authenticator authenticator() {
        return this.ain;
    }

    public Authenticator proxyAuthenticator() {
        return this.agy;
    }

    public ConnectionPool connectionPool() {
        return this.aio;
    }

    public boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public boolean followRedirects() {
        return this.followRedirects;
    }

    public boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public Dispatcher dispatcher() {
        return this.aik;
    }

    public List<Protocol> protocols() {
        return this.protocols;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Call newCall(Request request) {
        return new C10217a(this, request);
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static final class Builder {
        InternalCache agE;
        Dns agx;
        Authenticator agy;
        CertificatePinner agz;
        TrustRootIndex ahf;
        Dispatcher aik;
        CookieJar ail;
        Cache aim;
        Authenticator ain;
        ConnectionPool aio;
        int connectTimeout;
        List<ConnectionSpec> connectionSpecs;
        boolean followRedirects;
        boolean followSslRedirects;
        HostnameVerifier hostnameVerifier;
        final List<Interceptor> interceptors;
        final List<Interceptor> networkInterceptors;
        List<Protocol> protocols;
        Proxy proxy;
        ProxySelector proxySelector;
        int readTimeout;
        boolean retryOnConnectionFailure;
        SocketFactory socketFactory;
        SSLSocketFactory sslSocketFactory;
        int writeTimeout;

        public Builder() {
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.aik = new Dispatcher();
            this.protocols = OkHttpClient.DEFAULT_PROTOCOLS;
            this.connectionSpecs = OkHttpClient.DEFAULT_CONNECTION_SPECS;
            this.proxySelector = ProxySelector.getDefault();
            this.ail = CookieJar.NO_COOKIES;
            this.socketFactory = SocketFactory.getDefault();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.agz = CertificatePinner.DEFAULT;
            this.agy = Authenticator.NONE;
            this.ain = Authenticator.NONE;
            this.aio = new ConnectionPool();
            this.agx = Dns.SYSTEM;
            this.followSslRedirects = true;
            this.followRedirects = true;
            this.retryOnConnectionFailure = true;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
        }

        Builder(OkHttpClient okHttpClient) {
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.aik = okHttpClient.aik;
            this.proxy = okHttpClient.proxy;
            this.protocols = okHttpClient.protocols;
            this.connectionSpecs = okHttpClient.connectionSpecs;
            this.interceptors.addAll(okHttpClient.interceptors);
            this.networkInterceptors.addAll(okHttpClient.networkInterceptors);
            this.proxySelector = okHttpClient.proxySelector;
            this.ail = okHttpClient.ail;
            this.agE = okHttpClient.agE;
            this.aim = okHttpClient.aim;
            this.socketFactory = okHttpClient.socketFactory;
            this.sslSocketFactory = okHttpClient.sslSocketFactory;
            this.ahf = okHttpClient.ahf;
            this.hostnameVerifier = okHttpClient.hostnameVerifier;
            this.agz = okHttpClient.agz;
            this.agy = okHttpClient.agy;
            this.ain = okHttpClient.ain;
            this.aio = okHttpClient.aio;
            this.agx = okHttpClient.agx;
            this.followSslRedirects = okHttpClient.followSslRedirects;
            this.followRedirects = okHttpClient.followRedirects;
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure;
            this.connectTimeout = okHttpClient.connectTimeout;
            this.readTimeout = okHttpClient.readTimeout;
            this.writeTimeout = okHttpClient.writeTimeout;
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("timeout < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException("Timeout too large.");
                } else if (millis != 0 || i <= 0) {
                    this.connectTimeout = (int) millis;
                    return this;
                } else {
                    throw new IllegalArgumentException("Timeout too small.");
                }
            } else {
                throw new IllegalArgumentException("unit == null");
            }
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("timeout < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException("Timeout too large.");
                } else if (millis != 0 || i <= 0) {
                    this.readTimeout = (int) millis;
                    return this;
                } else {
                    throw new IllegalArgumentException("Timeout too small.");
                }
            } else {
                throw new IllegalArgumentException("unit == null");
            }
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("timeout < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException("Timeout too large.");
                } else if (millis != 0 || i <= 0) {
                    this.writeTimeout = (int) millis;
                    return this;
                } else {
                    throw new IllegalArgumentException("Timeout too small.");
                }
            } else {
                throw new IllegalArgumentException("unit == null");
            }
        }

        public final Builder proxy(Proxy proxy2) {
            this.proxy = proxy2;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector2) {
            this.proxySelector = proxySelector2;
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            if (cookieJar != null) {
                this.ail = cookieJar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo58500a(InternalCache internalCache) {
            this.agE = internalCache;
            this.aim = null;
        }

        public final Builder cache(Cache cache) {
            this.aim = cache;
            this.agE = null;
            return this;
        }

        public final Builder dns(Dns dns) {
            if (dns != null) {
                this.agx = dns;
                return this;
            }
            throw new NullPointerException("dns == null");
        }

        public final Builder socketFactory(SocketFactory socketFactory2) {
            if (socketFactory2 != null) {
                this.socketFactory = socketFactory2;
                return this;
            }
            throw new NullPointerException("socketFactory == null");
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.sslSocketFactory = sSLSocketFactory;
                this.ahf = null;
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier2) {
            if (hostnameVerifier2 != null) {
                this.hostnameVerifier = hostnameVerifier2;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            if (certificatePinner != null) {
                this.agz = certificatePinner;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        public final Builder authenticator(Authenticator authenticator) {
            if (authenticator != null) {
                this.ain = authenticator;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public final Builder proxyAuthenticator(Authenticator authenticator) {
            if (authenticator != null) {
                this.agy = authenticator;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            if (connectionPool != null) {
                this.aio = connectionPool;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            if (dispatcher != null) {
                this.aik = dispatcher;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public final Builder protocols(List<Protocol> list) {
            List<T> immutableList = Util.immutableList(list);
            if (!immutableList.contains(Protocol.HTTP_1_1)) {
                StringBuilder sb = new StringBuilder();
                sb.append("protocols doesn't contain http/1.1: ");
                sb.append(immutableList);
                throw new IllegalArgumentException(sb.toString());
            } else if (immutableList.contains(Protocol.HTTP_1_0)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("protocols must not contain http/1.0: ");
                sb2.append(immutableList);
                throw new IllegalArgumentException(sb2.toString());
            } else if (!immutableList.contains((Object) null)) {
                this.protocols = Util.immutableList(immutableList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            this.connectionSpecs = Util.immutableList(list);
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }
    }
}
