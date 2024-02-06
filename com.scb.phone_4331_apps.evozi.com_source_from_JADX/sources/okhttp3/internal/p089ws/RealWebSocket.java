package okhttp3.internal.p089ws;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.RealCall;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p089ws.WebSocketReader;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p040o.C7043xa484e06c;
import p040o.GoodToKnowActivity;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

/* renamed from: okhttp3.internal.ws.RealWebSocket */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1;
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<SCBUniversalWebViewActivity_ViewBinding> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random2, long j) {
        onGetStartedClick.write((Object) request, "originalRequest");
        onGetStartedClick.write((Object) webSocketListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        onGetStartedClick.write((Object) random2, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random2;
        this.pingIntervalMillis = j;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "GET", (Object) this.originalRequest.method())) {
            C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
            byte[] bArr = new byte[16];
            this.random.nextBytes(bArr);
            this.key = C7043xa484e06c.MediaBrowserCompat$CustomActionResultReceiver(bArr, 0, 16).MediaBrowserCompat$ItemReceiver();
            this.writerRunnable = new Runnable(this) {
                final /* synthetic */ RealWebSocket this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            this.this$0.failWebSocket(e, (Response) null);
                            return;
                        }
                    } while (this.this$0.writeOneFrame$okhttp());
                }
            };
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request must be GET: ");
        sb.append(this.originalRequest.method());
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final Request request() {
        return this.originalRequest;
    }

    public final long queueSize() {
        long j;
        synchronized (this) {
            j = this.queueSize;
        }
        return j;
    }

    public final void cancel() {
        Call call2 = this.call;
        if (call2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        call2.cancel();
    }

    public final void connect(OkHttpClient okHttpClient) {
        onGetStartedClick.write((Object) okHttpClient, "client");
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        Call newRealCall = RealCall.Companion.newRealCall(build, build2, true);
        this.call = newRealCall;
        if (newRealCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        newRealCall.enqueue(new RealWebSocket$connect$1(this, build2));
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        onGetStartedClick.write((Object) response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", (String) null, 2, (Object) null);
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Upgrade", header$default, true)) {
                String header$default2 = Response.header$default(response, "Upgrade", (String) null, 2, (Object) null);
                if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("websocket", header$default2, true)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.key);
                    sb.append(WebSocketProtocol.ACCEPT_MAGIC);
                    String obj = sb.toString();
                    onGetStartedClick.write((Object) obj, "$receiver");
                    String MediaBrowserCompat$ItemReceiver = PinChangeSuccessActivity.read(obj).IconCompatParcelizer(McElieceCCA2KeyGenParameterSpec.SHA1).MediaBrowserCompat$ItemReceiver();
                    if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$ItemReceiver, (Object) header$default3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected 'Sec-WebSocket-Accept' header value '");
                        sb2.append(MediaBrowserCompat$ItemReceiver);
                        sb2.append("' but was '");
                        sb2.append(header$default3);
                        sb2.append('\'');
                        throw new ProtocolException(sb2.toString());
                    } else if (exchange == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Expected 'Upgrade' header value 'websocket' but was '");
                    sb3.append(header$default2);
                    sb3.append('\'');
                    throw new ProtocolException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Expected 'Connection' header value 'Upgrade' but was '");
                sb4.append(header$default);
                sb4.append('\'');
                throw new ProtocolException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Expected HTTP 101 response but was '");
            sb5.append(response.code());
            sb5.append(' ');
            sb5.append(response.message());
            sb5.append('\'');
            throw new ProtocolException(sb5.toString());
        }
    }

    public final void initReaderAndWriter(String str, Streams streams2) throws IOException {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) streams2, "streams");
        synchronized (this) {
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.getClient(), streams2.getSink(), this.random);
            ScheduledExecutorService scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            this.executor = scheduledThreadPoolExecutor;
            if (this.pingIntervalMillis != 0) {
                scheduledThreadPoolExecutor.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        this.reader = new WebSocketReader(streams2.getClient(), streams2.getSource(), this);
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            webSocketReader.processNextFrame();
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            failWebSocket(e, (Response) null);
        }
    }

    public final void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        onGetStartedClick.write((Object) timeUnit, "timeUnit");
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        scheduledExecutorService.awaitTermination((long) i, timeUnit);
    }

    public final void tearDown() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            if (scheduledFuture == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            scheduledFuture.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        scheduledExecutorService.shutdown();
        ScheduledExecutorService scheduledExecutorService2 = this.executor;
        if (scheduledExecutorService2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        scheduledExecutorService2.awaitTermination(10, TimeUnit.SECONDS);
    }

    public final int sentPingCount() {
        int i;
        synchronized (this) {
            i = this.sentPingCount;
        }
        return i;
    }

    public final int receivedPingCount() {
        int i;
        synchronized (this) {
            i = this.receivedPingCount;
        }
        return i;
    }

    public final int receivedPongCount() {
        int i;
        synchronized (this) {
            i = this.receivedPongCount;
        }
        return i;
    }

    public final void onReadMessage(String str) throws IOException {
        onGetStartedClick.write((Object) str, "text");
        this.listener.onMessage((WebSocket) this, str);
    }

    public final void onReadMessage(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        this.listener.onMessage((WebSocket) this, sCBUniversalWebViewActivity_ViewBinding);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReadPing(p040o.SCBUniversalWebViewActivity_ViewBinding r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = r1.failed     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0027
        L_0x0017:
            java.util.ArrayDeque<o.SCBUniversalWebViewActivity_ViewBinding> r0 = r1.pongQueue     // Catch:{ all -> 0x0029 }
            r0.add(r2)     // Catch:{ all -> 0x0029 }
            r1.runWriter()     // Catch:{ all -> 0x0029 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0029 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p089ws.RealWebSocket.onReadPing(o.SCBUniversalWebViewActivity_ViewBinding):void");
    }

    public final void onReadPong(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        synchronized (this) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "payload");
            this.receivedPongCount++;
            this.awaitingPong = false;
        }
    }

    public final void onReadClose(int i, String str) {
        Streams streams2;
        onGetStartedClick.write((Object) str, "reason");
        boolean z = true;
        if (i != -1) {
            synchronized (this) {
                if (this.receivedCloseCode != -1) {
                    z = false;
                }
                if (z) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    streams2 = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        Streams streams3 = this.streams;
                        this.streams = streams2;
                        if (this.cancelFuture != null) {
                            ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                            if (scheduledFuture == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            scheduledFuture.cancel(false);
                        }
                        ScheduledExecutorService scheduledExecutorService = this.executor;
                        if (scheduledExecutorService == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        scheduledExecutorService.shutdown();
                        streams2 = streams3;
                    }
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams2 != null) {
                    this.listener.onClosed(this, i, str);
                }
            } finally {
                if (streams2 != null) {
                    Util.closeQuietly((Closeable) streams2);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final boolean send(String str) {
        onGetStartedClick.write((Object) str, "text");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) str, "$receiver");
        return send(PinChangeSuccessActivity.read(str), 1);
    }

    public final boolean send(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        return send(sCBUniversalWebViewActivity_ViewBinding, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean send(p040o.SCBUniversalWebViewActivity_ViewBinding r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.write()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.write()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p089ws.RealWebSocket.send(o.SCBUniversalWebViewActivity_ViewBinding, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean pong(p040o.SCBUniversalWebViewActivity_ViewBinding r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0025 }
            boolean r0 = r1.failed     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0022
        L_0x0017:
            java.util.ArrayDeque<o.SCBUniversalWebViewActivity_ViewBinding> r0 = r1.pongQueue     // Catch:{ all -> 0x0025 }
            r0.add(r2)     // Catch:{ all -> 0x0025 }
            r1.runWriter()     // Catch:{ all -> 0x0025 }
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x0022:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p089ws.RealWebSocket.pong(o.SCBUniversalWebViewActivity_ViewBinding):boolean");
    }

    public final boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean close(int r8, java.lang.String r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p089ws.WebSocketProtocol.INSTANCE     // Catch:{ all -> 0x0060 }
            r0.validateCloseCode(r8)     // Catch:{ all -> 0x0060 }
            r0 = 0
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0044
            o.SCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver r0 = p040o.SCBUniversalWebViewActivity_ViewBinding.write     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "$receiver"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)     // Catch:{ all -> 0x0060 }
            o.SCBUniversalWebViewActivity_ViewBinding r0 = p040o.PinChangeSuccessActivity.read((java.lang.String) r9)     // Catch:{ all -> 0x0060 }
            int r3 = r0.write()     // Catch:{ all -> 0x0060 }
            long r3 = (long) r3     // Catch:{ all -> 0x0060 }
            r5 = 123(0x7b, double:6.1E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0023
            r3 = r2
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            if (r3 == 0) goto L_0x0027
            goto L_0x0044
        L_0x0027:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r8.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r10 = "reason.size() > 123: "
            r8.append(r10)     // Catch:{ all -> 0x0060 }
            r8.append(r9)     // Catch:{ all -> 0x0060 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0060 }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0060 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0060 }
            r9.<init>(r8)     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0060 }
            throw r9     // Catch:{ all -> 0x0060 }
        L_0x0044:
            boolean r9 = r7.failed     // Catch:{ all -> 0x0060 }
            if (r9 != 0) goto L_0x005e
            boolean r9 = r7.enqueuedClose     // Catch:{ all -> 0x0060 }
            if (r9 == 0) goto L_0x004d
            goto L_0x005e
        L_0x004d:
            r7.enqueuedClose = r2     // Catch:{ all -> 0x0060 }
            java.util.ArrayDeque<java.lang.Object> r9 = r7.messageAndCloseQueue     // Catch:{ all -> 0x0060 }
            okhttp3.internal.ws.RealWebSocket$Close r1 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch:{ all -> 0x0060 }
            r1.<init>(r8, r0, r10)     // Catch:{ all -> 0x0060 }
            r9.add(r1)     // Catch:{ all -> 0x0060 }
            r7.runWriter()     // Catch:{ all -> 0x0060 }
            monitor-exit(r7)
            return r2
        L_0x005e:
            monitor-exit(r7)
            return r1
        L_0x0060:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p089ws.RealWebSocket.close(int, java.lang.String, long):boolean");
    }

    private final void runWriter() {
        boolean holdsLock = Thread.holdsLock(this);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
            ScheduledExecutorService scheduledExecutorService = this.executor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(this.writerRunnable);
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: okhttp3.internal.ws.RealWebSocket$Streams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: okhttp3.internal.ws.RealWebSocket$Streams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: okhttp3.internal.ws.RealWebSocket$Streams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: okhttp3.internal.ws.RealWebSocket$Streams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: okhttp3.internal.ws.RealWebSocket$Streams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: okhttp3.internal.ws.RealWebSocket$Streams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: okhttp3.internal.ws.RealWebSocket$Close} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        if (r3 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r2 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        r2.writePong(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        if ((r4 instanceof okhttp3.internal.p089ws.RealWebSocket.Message) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0 = ((okhttp3.internal.p089ws.RealWebSocket.Message) r4).getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0079, code lost:
        if (r2 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007b, code lost:
        p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007e, code lost:
        r2 = p040o.onSubmit.read(r2.newMessageSink(((okhttp3.internal.p089ws.RealWebSocket.Message) r4).getFormatOpcode(), (long) r0.write()));
        r2.IconCompatParcelizer(r0);
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0097, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r12.queueSize -= (long) r0.write();
        r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ad, code lost:
        if ((r4 instanceof okhttp3.internal.p089ws.RealWebSocket.Close) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r4 = (okhttp3.internal.p089ws.RealWebSocket.Close) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b1, code lost:
        if (r2 != null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b3, code lost:
        p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b6, code lost:
        r2.writeClose(r4.getCode(), r4.getReason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c1, code lost:
        if (r1 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c3, code lost:
        r2 = r12.listener;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c8, code lost:
        if (r5 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ca, code lost:
        p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00cd, code lost:
        r2.onClosed(r3, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d0, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d2, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e0, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e1, code lost:
        if (r1 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e3, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.failed     // Catch:{ all -> 0x00e9 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)
            return r1
        L_0x0008:
            okhttp3.internal.ws.WebSocketWriter r2 = r12.writer     // Catch:{ all -> 0x00e9 }
            java.util.ArrayDeque<o.SCBUniversalWebViewActivity_ViewBinding> r3 = r12.pongQueue     // Catch:{ all -> 0x00e9 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x00e9 }
            o.SCBUniversalWebViewActivity_ViewBinding r3 = (p040o.SCBUniversalWebViewActivity_ViewBinding) r3     // Catch:{ all -> 0x00e9 }
            r4 = 0
            if (r3 != 0) goto L_0x005e
            java.util.ArrayDeque<java.lang.Object> r5 = r12.messageAndCloseQueue     // Catch:{ all -> 0x00e9 }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x00e9 }
            boolean r6 = r5 instanceof okhttp3.internal.p089ws.RealWebSocket.Close
            if (r6 == 0) goto L_0x0054
            int r0 = r12.receivedCloseCode     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = r12.receivedCloseReason     // Catch:{ all -> 0x00e9 }
            r6 = -1
            if (r0 == r6) goto L_0x0036
            okhttp3.internal.ws.RealWebSocket$Streams r6 = r12.streams     // Catch:{ all -> 0x00e9 }
            r12.streams = r4     // Catch:{ all -> 0x00e9 }
            java.util.concurrent.ScheduledExecutorService r4 = r12.executor     // Catch:{ all -> 0x00e9 }
            if (r4 != 0) goto L_0x0031
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00e9 }
        L_0x0031:
            r4.shutdown()     // Catch:{ all -> 0x00e9 }
            r4 = r6
            goto L_0x0059
        L_0x0036:
            java.util.concurrent.ScheduledExecutorService r6 = r12.executor     // Catch:{ all -> 0x00e9 }
            if (r6 != 0) goto L_0x003d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00e9 }
        L_0x003d:
            okhttp3.internal.ws.RealWebSocket$CancelRunnable r7 = new okhttp3.internal.ws.RealWebSocket$CancelRunnable     // Catch:{ all -> 0x00e9 }
            r7.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x00e9 }
            r8 = r5
            okhttp3.internal.ws.RealWebSocket$Close r8 = (okhttp3.internal.p089ws.RealWebSocket.Close) r8     // Catch:{ all -> 0x00e9 }
            long r8 = r8.getCancelAfterCloseMillis()     // Catch:{ all -> 0x00e9 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00e9 }
            java.util.concurrent.ScheduledFuture r6 = r6.schedule(r7, r8, r10)     // Catch:{ all -> 0x00e9 }
            r12.cancelFuture = r6     // Catch:{ all -> 0x00e9 }
            goto L_0x0059
        L_0x0054:
            if (r5 != 0) goto L_0x0058
            monitor-exit(r12)
            return r1
        L_0x0058:
            r1 = r4
        L_0x0059:
            r11 = r5
            r5 = r1
            r1 = r4
            r4 = r11
            goto L_0x0060
        L_0x005e:
            r1 = r4
            r5 = r1
        L_0x0060:
            o.HmlVerifyPhoneValidateOtpActivity r6 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00e9 }
            monitor-exit(r12)
            if (r3 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x006a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00a9 }
        L_0x006a:
            r2.writePong(r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00d0
        L_0x006e:
            boolean r3 = r4 instanceof okhttp3.internal.p089ws.RealWebSocket.Message
            if (r3 == 0) goto L_0x00ab
            r0 = r4
            okhttp3.internal.ws.RealWebSocket$Message r0 = (okhttp3.internal.p089ws.RealWebSocket.Message) r0     // Catch:{ all -> 0x00a9 }
            o.SCBUniversalWebViewActivity_ViewBinding r0 = r0.getData()     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x007e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00a9 }
        L_0x007e:
            okhttp3.internal.ws.RealWebSocket$Message r4 = (okhttp3.internal.p089ws.RealWebSocket.Message) r4     // Catch:{ all -> 0x00a9 }
            int r3 = r4.getFormatOpcode()     // Catch:{ all -> 0x00a9 }
            int r4 = r0.write()     // Catch:{ all -> 0x00a9 }
            long r4 = (long) r4     // Catch:{ all -> 0x00a9 }
            o.PinChangeActivity r2 = r2.newMessageSink(r3, r4)     // Catch:{ all -> 0x00a9 }
            o.NsipPartnerPaymentReviewActivity r2 = p040o.onSubmit.read((p040o.PinChangeActivity) r2)     // Catch:{ all -> 0x00a9 }
            r2.IconCompatParcelizer((p040o.SCBUniversalWebViewActivity_ViewBinding) r0)     // Catch:{ all -> 0x00a9 }
            r2.close()     // Catch:{ all -> 0x00a9 }
            monitor-enter(r12)     // Catch:{ all -> 0x00a9 }
            long r2 = r12.queueSize     // Catch:{ all -> 0x00a6 }
            int r0 = r0.write()     // Catch:{ all -> 0x00a6 }
            long r4 = (long) r0     // Catch:{ all -> 0x00a6 }
            long r2 = r2 - r4
            r12.queueSize = r2     // Catch:{ all -> 0x00a6 }
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00a6 }
            monitor-exit(r12)
            goto L_0x00d0
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            goto L_0x00e1
        L_0x00ab:
            boolean r3 = r4 instanceof okhttp3.internal.p089ws.RealWebSocket.Close
            if (r3 == 0) goto L_0x00d9
            okhttp3.internal.ws.RealWebSocket$Close r4 = (okhttp3.internal.p089ws.RealWebSocket.Close) r4     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x00b6
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00a9 }
        L_0x00b6:
            int r3 = r4.getCode()     // Catch:{ all -> 0x00a9 }
            o.SCBUniversalWebViewActivity_ViewBinding r4 = r4.getReason()     // Catch:{ all -> 0x00a9 }
            r2.writeClose(r3, r4)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x00d0
            okhttp3.WebSocketListener r2 = r12.listener     // Catch:{ all -> 0x00a9 }
            r3 = r12
            okhttp3.WebSocket r3 = (okhttp3.WebSocket) r3     // Catch:{ all -> 0x00a9 }
            if (r5 != 0) goto L_0x00cd
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00a9 }
        L_0x00cd:
            r2.onClosed(r3, r0, r5)     // Catch:{ all -> 0x00a9 }
        L_0x00d0:
            if (r1 == 0) goto L_0x00d7
            java.io.Closeable r1 = (java.io.Closeable) r1
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x00d7:
            r0 = 1
            return r0
        L_0x00d9:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00e1:
            if (r1 == 0) goto L_0x00e8
            java.io.Closeable r1 = (java.io.Closeable) r1
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x00e8:
            throw r0
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p089ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$PingRunnable */
    final class PingRunnable implements Runnable {
        public PingRunnable() {
        }

        public final void run() {
            RealWebSocket.this.writePingFrame$okhttp();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r1 == -1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("sent ping but didn't receive pong within ");
        r0.append(r7.pingIntervalMillis);
        r0.append("ms (after ");
        r0.append(r1 - 1);
        r0.append(" successful ping/pongs)");
        failWebSocket(new java.net.SocketTimeoutException(r0.toString()), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r0 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r0.writePing(p040o.SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        failWebSocket(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch:{ all -> 0x005e }
            boolean r1 = r7.awaitingPong     // Catch:{ all -> 0x005e }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.sentPingCount     // Catch:{ all -> 0x005e }
            goto L_0x0012
        L_0x0011:
            r1 = r2
        L_0x0012:
            int r3 = r7.sentPingCount     // Catch:{ all -> 0x005e }
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch:{ all -> 0x005e }
            r7.awaitingPong = r4     // Catch:{ all -> 0x005e }
            o.HmlVerifyPhoneValidateOtpActivity r3 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x005e }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sent ping but didn't receive pong within "
            r0.append(r2)
            long r5 = r7.pingIntervalMillis
            r0.append(r5)
            java.lang.String r2 = "ms (after "
            r0.append(r2)
            int r1 = r1 - r4
            r0.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
            r1.<init>(r0)
            java.lang.Exception r1 = (java.lang.Exception) r1
            r7.failWebSocket(r1, r3)
            return
        L_0x004c:
            if (r0 != 0) goto L_0x0051
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x0057 }
        L_0x0051:
            o.SCBUniversalWebViewActivity_ViewBinding r1 = p040o.SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x0057 }
            r0.writePing(r1)     // Catch:{ IOException -> 0x0057 }
            return
        L_0x0057:
            r0 = move-exception
            java.lang.Exception r0 = (java.lang.Exception) r0
            r7.failWebSocket(r0, r3)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p089ws.RealWebSocket.writePingFrame$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.listener.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r0 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void failWebSocket(java.lang.Exception r4, okhttp3.Response r5) {
        /*
            r3 = this;
            java.lang.String r0 = "e"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            monitor-enter(r3)
            boolean r0 = r3.failed     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)
            return
        L_0x000c:
            r0 = 1
            r3.failed = r0     // Catch:{ all -> 0x0041 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch:{ all -> 0x0041 }
            r1 = 0
            r3.streams = r1     // Catch:{ all -> 0x0041 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x001c
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0025
            r1.shutdown()     // Catch:{ all -> 0x0041 }
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0041 }
        L_0x0025:
            monitor-exit(r3)
            okhttp3.WebSocketListener r1 = r3.listener     // Catch:{ all -> 0x0038 }
            r2 = r3
            okhttp3.WebSocket r2 = (okhttp3.WebSocket) r2     // Catch:{ all -> 0x0038 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0038 }
            r1.onFailure(r2, r4, r5)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0037:
            return
        L_0x0038:
            r4 = move-exception
            if (r0 == 0) goto L_0x0040
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0040:
            throw r4
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p089ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    public static final class Message {
        private final SCBUniversalWebViewActivity_ViewBinding data;
        private final int formatOpcode;

        public Message(int i, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "data");
            this.formatOpcode = i;
            this.data = sCBUniversalWebViewActivity_ViewBinding;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final SCBUniversalWebViewActivity_ViewBinding getData() {
            return this.data;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final SCBUniversalWebViewActivity_ViewBinding reason;

        public Close(int i, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, long j) {
            this.code = i;
            this.reason = sCBUniversalWebViewActivity_ViewBinding;
            this.cancelAfterCloseMillis = j;
        }

        public final int getCode() {
            return this.code;
        }

        public final SCBUniversalWebViewActivity_ViewBinding getReason() {
            return this.reason;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final NsipPartnerPaymentReviewActivity sink;
        private final NsipPartnerPaymentOtpActivity source;

        public Streams(boolean z, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
            onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
            this.client = z;
            this.source = nsipPartnerPaymentOtpActivity;
            this.sink = nsipPartnerPaymentReviewActivity;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final NsipPartnerPaymentOtpActivity getSource() {
            return this.source;
        }

        public final NsipPartnerPaymentReviewActivity getSink() {
            return this.sink;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$CancelRunnable */
    public final class CancelRunnable implements Runnable {
        public CancelRunnable() {
        }

        public final void run() {
            RealWebSocket.this.cancel();
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }

    static {
        List<Protocol> singletonList = Collections.singletonList(Protocol.HTTP_1_1);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        ONLY_HTTP1 = singletonList;
    }
}
