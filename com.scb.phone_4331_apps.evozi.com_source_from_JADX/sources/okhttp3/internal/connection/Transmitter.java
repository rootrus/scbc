package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.platform.Platform;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class Transmitter {
    private final Call call;
    private Object callStackTrace;
    private boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener = this.client.eventListenerFactory().create(this.call);
    private Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private boolean exchangeRequestDone;
    private boolean exchangeResponseDone;
    private boolean noMoreExchanges;
    private Request request;
    private final Transmitter$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    public Transmitter(OkHttpClient okHttpClient, Call call2) {
        onGetStartedClick.write((Object) okHttpClient, "client");
        onGetStartedClick.write((Object) call2, "call");
        this.client = okHttpClient;
        this.call = call2;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        Transmitter$timeout$1 transmitter$timeout$1 = new Transmitter$timeout$1(this);
        transmitter$timeout$1.timeout((long) this.client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = transmitter$timeout$1;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(RealConnection realConnection) {
        this.connection = realConnection;
    }

    public final boolean isCanceled() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.canceled;
        }
        return z;
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.timeout;
    }

    public final void timeoutEnter() {
        this.timeout.enter();
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            this.timeout.exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final <E extends IOException> E timeoutExit(E e) {
        if (this.timeoutEarlyExit || !this.timeout.exit()) {
            return e;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause((Throwable) e);
        }
        return (IOException) interruptedIOException;
    }

    public final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this.call);
    }

    public final void prepareToConnect(Request request2) {
        onGetStartedClick.write((Object) request2, "request");
        Request request3 = this.request;
        if (request3 != null) {
            if (request3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (Util.canReuseConnectionFor(request3.url(), request2.url())) {
                ExchangeFinder exchangeFinder2 = this.exchangeFinder;
                if (exchangeFinder2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (exchangeFinder2.hasRouteToTry()) {
                    return;
                }
            }
            if (!(this.exchange == null)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (this.exchangeFinder != null) {
                maybeReleaseConnection((IOException) null, true);
                this.exchangeFinder = null;
            }
        }
        this.request = request2;
        this.exchangeFinder = new ExchangeFinder(this, this.connectionPool, createAddress(request2.url()), this.call, this.eventListener);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    public final Exchange newExchange$okhttp(Interceptor.Chain chain, boolean z) {
        onGetStartedClick.write((Object) chain, "chain");
        synchronized (this.connectionPool) {
            boolean z2 = true;
            if (!this.noMoreExchanges) {
                if (this.exchange != null) {
                    z2 = false;
                }
                if (z2) {
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        if (exchangeFinder2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        ExchangeCodec find = exchangeFinder2.find(this.client, chain, z);
        Call call2 = this.call;
        EventListener eventListener2 = this.eventListener;
        ExchangeFinder exchangeFinder3 = this.exchangeFinder;
        if (exchangeFinder3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Exchange exchange2 = new Exchange(this, call2, eventListener2, exchangeFinder3, find);
        synchronized (this.connectionPool) {
            this.exchange = exchange2;
            this.exchangeRequestDone = false;
            this.exchangeResponseDone = false;
        }
        return exchange2;
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        onGetStartedClick.write((Object) realConnection, "connection");
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
            if (this.connection == null) {
                this.connection = realConnection;
                realConnection.getTransmitters().add(new TransmitterReference(this, this.callStackTrace));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Assertion failed");
    }

    public final Socket releaseConnectionNoEvents() {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
            RealConnection realConnection = this.connection;
            if (realConnection == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Iterator<Reference<Transmitter>> it = realConnection.getTransmitters().iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Transmitter) it.next().get(), (Object) this)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                RealConnection realConnection2 = this.connection;
                if (realConnection2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                realConnection2.getTransmitters().remove(i);
                this.connection = null;
                if (realConnection2.getTransmitters().isEmpty()) {
                    realConnection2.setIdleAtNanos$okhttp(System.nanoTime());
                    if (this.connectionPool.connectionBecameIdle(realConnection2)) {
                        return realConnection2.socket();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Assertion failed");
    }

    public final void exchangeDoneDueToException() {
        synchronized (this.connectionPool) {
            if (!this.noMoreExchanges) {
                this.exchange = null;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0051, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return maybeReleaseConnection(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E exchangeMessageDone$okhttp(okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            okhttp3.internal.connection.Exchange r1 = r2.exchange     // Catch:{ all -> 0x0058 }
            boolean r3 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ all -> 0x0058 }
            r1 = 1
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x0014
            monitor-exit(r0)
            return r6
        L_0x0014:
            r3 = 0
            if (r4 == 0) goto L_0x001d
            boolean r4 = r2.exchangeRequestDone     // Catch:{ all -> 0x0058 }
            r4 = r4 ^ r1
            r2.exchangeRequestDone = r1     // Catch:{ all -> 0x0058 }
            goto L_0x001e
        L_0x001d:
            r4 = r3
        L_0x001e:
            if (r5 == 0) goto L_0x0027
            boolean r5 = r2.exchangeResponseDone     // Catch:{ all -> 0x0058 }
            if (r5 != 0) goto L_0x0025
            r4 = r1
        L_0x0025:
            r2.exchangeResponseDone = r1     // Catch:{ all -> 0x0058 }
        L_0x0027:
            boolean r5 = r2.exchangeRequestDone     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x004d
            boolean r5 = r2.exchangeResponseDone     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x004d
            if (r4 == 0) goto L_0x004d
            okhttp3.internal.connection.Exchange r4 = r2.exchange     // Catch:{ all -> 0x0058 }
            if (r4 != 0) goto L_0x0038
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0058 }
        L_0x0038:
            okhttp3.internal.connection.RealConnection r4 = r4.connection()     // Catch:{ all -> 0x0058 }
            if (r4 != 0) goto L_0x0041
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0058 }
        L_0x0041:
            int r5 = r4.getSuccessCount$okhttp()     // Catch:{ all -> 0x0058 }
            int r5 = r5 + r1
            r4.setSuccessCount$okhttp(r5)     // Catch:{ all -> 0x0058 }
            r4 = 0
            r2.exchange = r4     // Catch:{ all -> 0x0058 }
            goto L_0x004e
        L_0x004d:
            r1 = r3
        L_0x004e:
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0057
            java.io.IOException r6 = r2.maybeReleaseConnection(r6, r3)
        L_0x0057:
            return r6
        L_0x0058:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.Transmitter.exchangeMessageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException noMoreExchanges(IOException iOException) {
        synchronized (this.connectionPool) {
            this.noMoreExchanges = true;
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        return maybeReleaseConnection(iOException, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0083 A[SYNTHETIC, Splitter:B:52:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <E extends java.io.IOException> E maybeReleaseConnection(E r7, boolean r8) {
        /*
            r6 = this;
            o.onNotNowClick$read r0 = new o.onNotNowClick$read
            r0.<init>()
            okhttp3.internal.connection.RealConnectionPool r1 = r6.connectionPool
            monitor-enter(r1)
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0016
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r4 = r2
            goto L_0x0017
        L_0x0013:
            r7 = move-exception
            goto L_0x0091
        L_0x0016:
            r4 = r3
        L_0x0017:
            if (r4 == 0) goto L_0x0083
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch:{ all -> 0x0013 }
            okhttp3.Connection r4 = (okhttp3.Connection) r4     // Catch:{ all -> 0x0013 }
            r0.MediaBrowserCompat$ItemReceiver = r4     // Catch:{ all -> 0x0013 }
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch:{ all -> 0x0013 }
            r5 = 0
            if (r4 == 0) goto L_0x0033
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0033
            if (r8 != 0) goto L_0x002e
            boolean r8 = r6.noMoreExchanges     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x0033
        L_0x002e:
            java.net.Socket r8 = r6.releaseConnectionNoEvents()     // Catch:{ all -> 0x0013 }
            goto L_0x0034
        L_0x0033:
            r8 = r5
        L_0x0034:
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x003a
            r0.MediaBrowserCompat$ItemReceiver = r5     // Catch:{ all -> 0x0013 }
        L_0x003a:
            boolean r4 = r6.noMoreExchanges     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0044
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0044
            r4 = r3
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            o.HmlVerifyPhoneValidateOtpActivity r5 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            if (r8 == 0) goto L_0x004d
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r8)
        L_0x004d:
            T r8 = r0.MediaBrowserCompat$ItemReceiver
            okhttp3.Connection r8 = (okhttp3.Connection) r8
            if (r8 == 0) goto L_0x0063
            okhttp3.EventListener r8 = r6.eventListener
            okhttp3.Call r1 = r6.call
            T r0 = r0.MediaBrowserCompat$ItemReceiver
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            if (r0 != 0) goto L_0x0060
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0060:
            r8.connectionReleased(r1, r0)
        L_0x0063:
            if (r4 == 0) goto L_0x0082
            if (r7 == 0) goto L_0x0068
            r2 = r3
        L_0x0068:
            java.io.IOException r7 = r6.timeoutExit(r7)
            if (r2 == 0) goto L_0x007b
            okhttp3.EventListener r8 = r6.eventListener
            okhttp3.Call r0 = r6.call
            if (r7 != 0) goto L_0x0077
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0077:
            r8.callFailed(r0, r7)
            goto L_0x0082
        L_0x007b:
            okhttp3.EventListener r8 = r6.eventListener
            okhttp3.Call r0 = r6.call
            r8.callEnd(r0)
        L_0x0082:
            return r7
        L_0x0083:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r8 = "cannot release connection while it is in use"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0013 }
            r7.<init>(r8)     // Catch:{ all -> 0x0013 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x0013 }
            throw r7     // Catch:{ all -> 0x0013 }
        L_0x0091:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.Transmitter.maybeReleaseConnection(java.io.IOException, boolean):java.io.IOException");
    }

    public final boolean canRetry() {
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        if (exchangeFinder2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        if (exchangeFinder2.hasStreamFailure()) {
            ExchangeFinder exchangeFinder3 = this.exchangeFinder;
            if (exchangeFinder3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (exchangeFinder3.hasRouteToTry()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasExchange() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.exchange != null;
        }
        return z;
    }

    public final void cancel() {
        Exchange exchange2;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            exchange2 = this.exchange;
            ExchangeFinder exchangeFinder2 = this.exchangeFinder;
            if (exchangeFinder2 == null || (realConnection = exchangeFinder2.connectingConnection()) == null) {
                realConnection = this.connection;
            }
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        if (exchange2 != null) {
            exchange2.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public static final class TransmitterReference extends WeakReference<Transmitter> {
        private final Object callStackTrace;

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TransmitterReference(Transmitter transmitter, Object obj) {
            super(transmitter);
            onGetStartedClick.write((Object) transmitter, "referent");
            this.callStackTrace = obj;
        }
    }
}
