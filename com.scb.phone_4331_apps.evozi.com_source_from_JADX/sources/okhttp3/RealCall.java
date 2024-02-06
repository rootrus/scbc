package okhttp3;

import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.connection.Transmitter;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class RealCall implements Call {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final OkHttpClient client;
    private boolean executed;
    private final boolean forWebSocket;
    private final Request originalRequest;
    /* access modifiers changed from: private */
    public Transmitter transmitter;

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
    }

    public /* synthetic */ RealCall(OkHttpClient okHttpClient, Request request, boolean z, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(okHttpClient, request, z);
    }

    public static final /* synthetic */ Transmitter access$getTransmitter$p(RealCall realCall) {
        Transmitter transmitter2 = realCall.transmitter;
        if (transmitter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transmitter");
        }
        return transmitter2;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final boolean getExecuted() {
        return this.executed;
    }

    public final void setExecuted(boolean z) {
        this.executed = z;
    }

    public final boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.executed;
        }
        return z;
    }

    public final boolean isCanceled() {
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transmitter");
        }
        return transmitter2.isCanceled();
    }

    public final Request request() {
        return this.originalRequest;
    }

    public final Response execute() {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transmitter");
        }
        transmitter2.timeoutEnter();
        Transmitter transmitter3 = this.transmitter;
        if (transmitter3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transmitter");
        }
        transmitter3.callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void enqueue(Callback callback) {
        onGetStartedClick.write((Object) callback, "responseCallback");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transmitter");
        }
        transmitter2.callStart();
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
    }

    public final void cancel() {
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transmitter");
        }
        transmitter2.cancel();
    }

    public final PinChangeActivity_ViewBinding timeout() {
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transmitter");
        }
        return transmitter2.timeout();
    }

    public final RealCall clone() {
        return Companion.newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost = new AtomicInteger(0);
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            onGetStartedClick.write((Object) callback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = callback;
        }

        public final AtomicInteger callsPerHost() {
            return this.callsPerHost;
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            onGetStartedClick.write((Object) asyncCall, "other");
            this.callsPerHost = asyncCall.callsPerHost;
        }

        public final String host() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request request() {
            return this.this$0.getOriginalRequest();
        }

        public final RealCall get() {
            return this.this$0;
        }

        public final void executeOn(ExecutorService executorService) {
            onGetStartedClick.write((Object) executorService, "executorService");
            boolean holdsLock = Thread.holdsLock(this.this$0.getClient().dispatcher());
            if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    RealCall.access$getTransmitter$p(this.this$0).noMoreExchanges(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                } catch (Throwable th) {
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                    throw th;
                }
            } else {
                throw new AssertionError("Assertion failed");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[SYNTHETIC, Splitter:B:16:0x0053] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0077 A[Catch:{ all -> 0x004d, all -> 0x009c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.RealCall r1 = r6.this$0
                java.lang.String r1 = r1.redactedUrl()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                okhttp3.RealCall r0 = r6.this$0     // Catch:{ all -> 0x009c }
                okhttp3.internal.connection.Transmitter r0 = okhttp3.RealCall.access$getTransmitter$p(r0)     // Catch:{ all -> 0x009c }
                r0.timeoutEnter()     // Catch:{ all -> 0x009c }
                okhttp3.RealCall r0 = r6.this$0     // Catch:{ IOException -> 0x004f }
                okhttp3.Response r0 = r0.getResponseWithInterceptorChain()     // Catch:{ IOException -> 0x004f }
                r3 = 1
                okhttp3.Callback r4 = r6.responseCallback     // Catch:{ IOException -> 0x004b }
                okhttp3.RealCall r5 = r6.this$0     // Catch:{ IOException -> 0x004b }
                okhttp3.Call r5 = (okhttp3.Call) r5     // Catch:{ IOException -> 0x004b }
                r4.onResponse(r5, r0)     // Catch:{ IOException -> 0x004b }
                okhttp3.RealCall r0 = r6.this$0     // Catch:{ all -> 0x009c }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x009c }
            L_0x0046:
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x009c }
                goto L_0x0087
            L_0x004b:
                r0 = move-exception
                goto L_0x0051
            L_0x004d:
                r0 = move-exception
                goto L_0x008e
            L_0x004f:
                r0 = move-exception
                r3 = 0
            L_0x0051:
                if (r3 == 0) goto L_0x0077
                okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x004d }
                okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x004d }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
                r4.<init>()     // Catch:{ all -> 0x004d }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x004d }
                okhttp3.RealCall r5 = r6.this$0     // Catch:{ all -> 0x004d }
                java.lang.String r5 = r5.toLoggableString()     // Catch:{ all -> 0x004d }
                r4.append(r5)     // Catch:{ all -> 0x004d }
                r5 = 4
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x004d }
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x004d }
                r3.log(r5, r4, r0)     // Catch:{ all -> 0x004d }
                goto L_0x0080
            L_0x0077:
                okhttp3.Callback r3 = r6.responseCallback     // Catch:{ all -> 0x004d }
                okhttp3.RealCall r4 = r6.this$0     // Catch:{ all -> 0x004d }
                okhttp3.Call r4 = (okhttp3.Call) r4     // Catch:{ all -> 0x004d }
                r3.onFailure(r4, r0)     // Catch:{ all -> 0x004d }
            L_0x0080:
                okhttp3.RealCall r0 = r6.this$0     // Catch:{ all -> 0x009c }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x009c }
                goto L_0x0046
            L_0x0087:
                r0.finished$okhttp((okhttp3.RealCall.AsyncCall) r6)     // Catch:{ all -> 0x009c }
                r1.setName(r2)
                return
            L_0x008e:
                okhttp3.RealCall r3 = r6.this$0     // Catch:{ all -> 0x009c }
                okhttp3.OkHttpClient r3 = r3.getClient()     // Catch:{ all -> 0x009c }
                okhttp3.Dispatcher r3 = r3.dispatcher()     // Catch:{ all -> 0x009c }
                r3.finished$okhttp((okhttp3.RealCall.AsyncCall) r6)     // Catch:{ all -> 0x009c }
                throw r0     // Catch:{ all -> 0x009c }
            L_0x009c:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.AsyncCall.run():void");
        }
    }

    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl());
        return sb.toString();
    }

    public final String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response getResponseWithInterceptorChain() throws java.io.IOException {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            okhttp3.OkHttpClient r1 = r13.client
            java.util.List r1 = r1.interceptors()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            p040o.HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r1 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r3 = r13.client
            r1.<init>(r3)
            r0.add(r1)
            okhttp3.internal.http.BridgeInterceptor r1 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r3 = r13.client
            okhttp3.CookieJar r3 = r3.cookieJar()
            r1.<init>(r3)
            r0.add(r1)
            okhttp3.internal.cache.CacheInterceptor r1 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r3 = r13.client
            okhttp3.Cache r3 = r3.cache()
            r1.<init>(r3)
            r0.add(r1)
            okhttp3.internal.connection.ConnectInterceptor r1 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r0.add(r1)
            boolean r1 = r13.forWebSocket
            if (r1 != 0) goto L_0x0050
            okhttp3.OkHttpClient r1 = r13.client
            java.util.List r1 = r1.networkInterceptors()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            p040o.HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)
        L_0x0050:
            okhttp3.internal.http.CallServerInterceptor r1 = new okhttp3.internal.http.CallServerInterceptor
            boolean r3 = r13.forWebSocket
            r1.<init>(r3)
            r0.add(r1)
            okhttp3.internal.connection.Transmitter r3 = r13.transmitter
            java.lang.String r0 = "transmitter"
            if (r3 != 0) goto L_0x0063
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0063:
            okhttp3.Request r6 = r13.originalRequest
            r7 = r13
            okhttp3.Call r7 = (okhttp3.Call) r7
            okhttp3.OkHttpClient r1 = r13.client
            int r8 = r1.connectTimeoutMillis()
            okhttp3.OkHttpClient r1 = r13.client
            int r9 = r1.readTimeoutMillis()
            okhttp3.OkHttpClient r1 = r13.client
            int r10 = r1.writeTimeoutMillis()
            okhttp3.internal.http.RealInterceptorChain r11 = new okhttp3.internal.http.RealInterceptorChain
            r4 = 0
            r5 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r2 = 1
            r3 = 0
            okhttp3.Request r4 = r13.originalRequest     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            okhttp3.Response r4 = r11.proceed(r4)     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            okhttp3.internal.connection.Transmitter r5 = r13.transmitter     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            if (r5 != 0) goto L_0x0092
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
        L_0x0092:
            boolean r5 = r5.isCanceled()     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            if (r5 != 0) goto L_0x00a3
            okhttp3.internal.connection.Transmitter r2 = r13.transmitter
            if (r2 != 0) goto L_0x009f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x009f:
            r2.noMoreExchanges(r1)
            return r4
        L_0x00a3:
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r4)     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            java.lang.String r5 = "Canceled"
            r4.<init>(r5)     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
            throw r4     // Catch:{ IOException -> 0x00b4, all -> 0x00b2 }
        L_0x00b2:
            r2 = move-exception
            goto L_0x00d1
        L_0x00b4:
            r3 = move-exception
            okhttp3.internal.connection.Transmitter r4 = r13.transmitter     // Catch:{ all -> 0x00cd }
            if (r4 != 0) goto L_0x00bc
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)     // Catch:{ all -> 0x00cd }
        L_0x00bc:
            java.io.IOException r3 = r4.noMoreExchanges(r3)     // Catch:{ all -> 0x00cd }
            if (r3 != 0) goto L_0x00ca
            kotlin.TypeCastException r3 = new kotlin.TypeCastException     // Catch:{ all -> 0x00cd }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Throwable"
            r3.<init>(r4)     // Catch:{ all -> 0x00cd }
            throw r3     // Catch:{ all -> 0x00cd }
        L_0x00ca:
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x00cd }
            throw r3     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r3 = move-exception
            r12 = r3
            r3 = r2
            r2 = r12
        L_0x00d1:
            if (r3 != 0) goto L_0x00dd
            okhttp3.internal.connection.Transmitter r3 = r13.transmitter
            if (r3 != 0) goto L_0x00da
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x00da:
            r3.noMoreExchanges(r1)
        L_0x00dd:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.getResponseWithInterceptorChain():okhttp3.Response");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
            onGetStartedClick.write((Object) okHttpClient, "client");
            onGetStartedClick.write((Object) request, "originalRequest");
            RealCall realCall = new RealCall(okHttpClient, request, z, (NtbDiscoverFundFilterActivity) null);
            realCall.transmitter = new Transmitter(okHttpClient, realCall);
            return realCall;
        }
    }
}
