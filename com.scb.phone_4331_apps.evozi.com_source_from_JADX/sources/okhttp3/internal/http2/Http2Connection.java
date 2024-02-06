package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class Http2Connection implements Closeable {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    /* access modifiers changed from: private */
    public static final ThreadPoolExecutor listenerExecutor = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    /* access modifiers changed from: private */
    public boolean awaitingPong;
    private final boolean client;
    private final String connectionName;
    /* access modifiers changed from: private */
    public final Set<Integer> currentPushRequests;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private final Settings peerSettings;
    private final ThreadPoolExecutor pushExecutor;
    /* access modifiers changed from: private */
    public final PushObserver pushObserver;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    /* access modifiers changed from: private */
    public long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    /* access modifiers changed from: private */
    public final ScheduledThreadPoolExecutor writerExecutor;

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final void start() throws IOException {
        start$default(this, false, 1, (Object) null);
    }

    public Http2Connection(Builder builder) {
        onGetStartedClick.write((Object) builder, "builder");
        this.client = builder.getClient$okhttp();
        this.listener = builder.getListener$okhttp();
        this.connectionName = builder.getConnectionName$okhttp();
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        this.writerExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", this.connectionName), false));
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", this.connectionName), true));
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        Settings settings2 = new Settings();
        settings2.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings2.set(5, 16384);
        this.peerSettings = settings2;
        this.writeBytesMaximum = (long) settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), this.client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), this.client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            this.writerExecutor.scheduleAtFixedRate(new Runnable(this) {
                final /* synthetic */ Http2Connection this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OkHttp ");
                    sb.append(this.this$0.getConnectionName$okhttp());
                    sb.append(" ping");
                    String obj = sb.toString();
                    Thread currentThread = Thread.currentThread();
                    onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
                    String name = currentThread.getName();
                    currentThread.setName(obj);
                    try {
                        this.this$0.writePing(false, 0, 0);
                    } finally {
                        currentThread.setName(name);
                    }
                }
            }, (long) builder.getPingIntervalMillis$okhttp(), (long) builder.getPingIntervalMillis$okhttp(), TimeUnit.MILLISECONDS);
        }
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final boolean isShutdown() {
        boolean z;
        synchronized (this) {
            z = this.isShutdown;
        }
        return z;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.isShutdown = z;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    public final Http2Stream getStream(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(Integer.valueOf(i));
        }
        return http2Stream;
    }

    public final Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        synchronized (this) {
            remove = this.streams.remove(Integer.valueOf(i));
            notifyAll();
        }
        return remove;
    }

    public final int maxConcurrentStreams() {
        int maxConcurrentStreams;
        synchronized (this) {
            maxConcurrentStreams = this.peerSettings.getMaxConcurrentStreams(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        return maxConcurrentStreams;
    }

    public final void updateConnectionFlowControl$okhttp(long j) {
        synchronized (this) {
            long j2 = this.readBytesTotal + j;
            this.readBytesTotal = j2;
            long j3 = j2 - this.readBytesAcknowledged;
            if (j3 >= ((long) (this.okHttpSettings.getInitialWindowSize() / 2))) {
                writeWindowUpdateLater$okhttp(0, j3);
                this.readBytesAcknowledged += j3;
            }
        }
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) throws IOException {
        onGetStartedClick.write((Object) list, "requestHeaders");
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final Http2Stream newStream(List<Header> list, boolean z) throws IOException {
        onGetStartedClick.write((Object) list, "requestHeaders");
        return newStream(0, list, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x008c }
            int r0 = r10.nextStreamId     // Catch:{ all -> 0x0089 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0012
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0089 }
            r10.shutdown(r0)     // Catch:{ all -> 0x0089 }
        L_0x0012:
            boolean r0 = r10.isShutdown     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0081
            int r8 = r10.nextStreamId     // Catch:{ all -> 0x0089 }
            int r0 = r10.nextStreamId     // Catch:{ all -> 0x0089 }
            int r0 = r0 + 2
            r10.nextStreamId = r0     // Catch:{ all -> 0x0089 }
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x0089 }
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0089 }
            r0 = 1
            if (r13 == 0) goto L_0x0043
            long r1 = r10.writeBytesTotal     // Catch:{ all -> 0x0089 }
            long r3 = r10.writeBytesMaximum     // Catch:{ all -> 0x0089 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0043
            long r1 = r9.getWriteBytesTotal()     // Catch:{ all -> 0x0089 }
            long r3 = r9.getWriteBytesMaximum()     // Catch:{ all -> 0x0089 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r13 = 0
            goto L_0x0044
        L_0x0043:
            r13 = r0
        L_0x0044:
            boolean r1 = r9.isOpen()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r10.streams     // Catch:{ all -> 0x0089 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0089 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0089 }
        L_0x0053:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0089 }
            monitor-exit(r10)
            if (r11 != 0) goto L_0x005e
            okhttp3.internal.http2.Http2Writer r11 = r10.writer     // Catch:{ all -> 0x008c }
            r11.headers(r6, r8, r12)     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x005e:
            boolean r1 = r10.client     // Catch:{ all -> 0x008c }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0073
            okhttp3.internal.http2.Http2Writer r0 = r10.writer     // Catch:{ all -> 0x008c }
            r0.pushPromise(r11, r8, r12)     // Catch:{ all -> 0x008c }
        L_0x0068:
            o.HmlVerifyPhoneValidateOtpActivity r11 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x008c }
            monitor-exit(r7)
            if (r13 == 0) goto L_0x0072
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L_0x0072:
            return r9
        L_0x0073:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008c }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x008c }
            r11.<init>(r12)     // Catch:{ all -> 0x008c }
            java.lang.Throwable r11 = (java.lang.Throwable) r11     // Catch:{ all -> 0x008c }
            throw r11     // Catch:{ all -> 0x008c }
        L_0x0081:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0089 }
            r11.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.Throwable r11 = (java.lang.Throwable) r11     // Catch:{ all -> 0x0089 }
            throw r11     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008c }
            throw r11     // Catch:{ all -> 0x008c }
        L_0x008c:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final void writeHeaders$okhttp(int i, boolean z, List<Header> list) throws IOException {
        onGetStartedClick.write((Object) list, "alternating");
        this.writer.headers(z, i, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.MediaBrowserCompat$CustomActionResultReceiver = (int) java.lang.Math.min(r12, r8.writeBytesMaximum - r8.writeBytesTotal);
        r2.MediaBrowserCompat$CustomActionResultReceiver = java.lang.Math.min(r2.MediaBrowserCompat$CustomActionResultReceiver, r8.writer.maxDataLength());
        r8.writeBytesTotal += (long) r2.MediaBrowserCompat$CustomActionResultReceiver;
        r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeData(int r9, boolean r10, p040o.SCBUniversalWebViewActivity r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0089
            o.onNotNowClick$write r2 = new o.onNotNowClick$write
            r2.<init>()
            monitor-enter(r8)
        L_0x0017:
            long r4 = r8.writeBytesTotal     // Catch:{ InterruptedException -> 0x0078 }
            long r6 = r8.writeBytesMaximum     // Catch:{ InterruptedException -> 0x0078 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x003c
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r8.streams     // Catch:{ InterruptedException -> 0x0078 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0078 }
            boolean r4 = r4.containsKey(r5)     // Catch:{ InterruptedException -> 0x0078 }
            if (r4 == 0) goto L_0x0032
            r4 = r8
            java.lang.Object r4 = (java.lang.Object) r4     // Catch:{ InterruptedException -> 0x0078 }
            r4.wait()     // Catch:{ InterruptedException -> 0x0078 }
            goto L_0x0017
        L_0x0032:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0078 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0078 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ InterruptedException -> 0x0078 }
            throw r9     // Catch:{ InterruptedException -> 0x0078 }
        L_0x003c:
            long r4 = r8.writeBytesMaximum     // Catch:{ all -> 0x0076 }
            long r6 = r8.writeBytesTotal     // Catch:{ all -> 0x0076 }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0076 }
            int r4 = (int) r4     // Catch:{ all -> 0x0076 }
            r2.MediaBrowserCompat$CustomActionResultReceiver = r4     // Catch:{ all -> 0x0076 }
            int r4 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0076 }
            okhttp3.internal.http2.Http2Writer r5 = r8.writer     // Catch:{ all -> 0x0076 }
            int r5 = r5.maxDataLength()     // Catch:{ all -> 0x0076 }
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0076 }
            r2.MediaBrowserCompat$CustomActionResultReceiver = r4     // Catch:{ all -> 0x0076 }
            long r4 = r8.writeBytesTotal     // Catch:{ all -> 0x0076 }
            int r6 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0076 }
            long r6 = (long) r6     // Catch:{ all -> 0x0076 }
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch:{ all -> 0x0076 }
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0076 }
            monitor-exit(r8)
            int r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            long r4 = (long) r4
            long r12 = r12 - r4
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L_0x006f
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x006f
            r5 = 1
            goto L_0x0070
        L_0x006f:
            r5 = r3
        L_0x0070:
            int r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r4.data(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0076:
            r9 = move-exception
            goto L_0x0087
        L_0x0078:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0076 }
            r9.interrupt()     // Catch:{ all -> 0x0076 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0076 }
            r9.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0076 }
            throw r9     // Catch:{ all -> 0x0076 }
        L_0x0087:
            monitor-exit(r8)
            throw r9
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, o.SCBUniversalWebViewActivity, long):void");
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
        onGetStartedClick.write((Object) errorCode, "errorCode");
        Executor executor = this.writerExecutor;
        StringBuilder sb = new StringBuilder();
        sb.append("OkHttp ");
        sb.append(this.connectionName);
        sb.append(" stream ");
        sb.append(i);
        try {
            executor.execute(new Http2Connection$writeSynResetLater$$inlined$tryExecute$1(sb.toString(), this, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) throws IOException {
        onGetStartedClick.write((Object) errorCode, "statusCode");
        this.writer.rstStream(i, errorCode);
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
        Executor executor = this.writerExecutor;
        StringBuilder sb = new StringBuilder();
        sb.append("OkHttp Window Update ");
        sb.append(this.connectionName);
        sb.append(" stream ");
        sb.append(i);
        try {
            executor.execute(new Http2Connection$writeWindowUpdateLater$$inlined$tryExecute$1(sb.toString(), this, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void writePing(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.awaitingPong;
                this.awaitingPong = true;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            if (z2) {
                failConnection((IOException) null);
                return;
            }
        }
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing(false, 1330343787, -257978967);
        awaitPong();
    }

    public final void awaitPong() throws InterruptedException {
        synchronized (this) {
            while (this.awaitingPong) {
                wait();
            }
        }
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        onGetStartedClick.write((Object) errorCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.isShutdown = true;
                    int i = this.lastGoodStreamId;
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    this.writer.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
        }
    }

    public final void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|25|(2:22|(5:24|25|26|39|27))|29|30|31|32|33|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close$okhttp(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "streamCode"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            boolean r0 = java.lang.Thread.holdsLock(r3)
            boolean r1 = p040o.HmlBusinessOwnerDocumentSubmissionActivity.write
            if (r1 == 0) goto L_0x0021
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0017
            goto L_0x0021
        L_0x0017:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Assertion failed"
            r4.<init>(r5)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        L_0x0021:
            r3.shutdown(r4)     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x0074 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0074 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x004f
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch:{ all -> 0x0074 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0074 }
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r1]     // Catch:{ all -> 0x0074 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0047
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4     // Catch:{ all -> 0x0074 }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x0074 }
            r0.clear()     // Catch:{ all -> 0x0074 }
            goto L_0x004f
        L_0x0047:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0074 }
            throw r4     // Catch:{ all -> 0x0074 }
        L_0x004f:
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0074 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x005f
            int r0 = r4.length
        L_0x0055:
            if (r1 >= r0) goto L_0x005f
            r2 = r4[r1]
            r2.close(r5, r6)     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x005f:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch:{ IOException -> 0x0064 }
            r4.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            java.net.Socket r4 = r3.socket     // Catch:{ IOException -> 0x0069 }
            r4.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.writerExecutor
            r4.shutdown()
            java.util.concurrent.ThreadPoolExecutor r4 = r3.pushExecutor
            r4.shutdown()
            return
        L_0x0074:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.close$okhttp(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    /* access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        http2Connection.start(z);
    }

    public final void start(boolean z) throws IOException {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, (long) (initialWindowSize - Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("OkHttp ");
        sb.append(this.connectionName);
        new Thread(this.readerRunnable, sb.toString()).start();
    }

    public final void setSettings(Settings settings) throws IOException {
        onGetStartedClick.write((Object) settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        private int pingIntervalMillis;
        private PushObserver pushObserver = PushObserver.CANCEL;
        public NsipPartnerPaymentReviewActivity sink;
        public Socket socket;
        public NsipPartnerPaymentOtpActivity source;

        public final Builder socket(Socket socket2) throws IOException {
            return socket$default(this, socket2, (String) null, (NsipPartnerPaymentOtpActivity) null, (NsipPartnerPaymentReviewActivity) null, 14, (Object) null);
        }

        public final Builder socket(Socket socket2, String str) throws IOException {
            return socket$default(this, socket2, str, (NsipPartnerPaymentOtpActivity) null, (NsipPartnerPaymentReviewActivity) null, 12, (Object) null);
        }

        public final Builder socket(Socket socket2, String str, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) throws IOException {
            return socket$default(this, socket2, str, nsipPartnerPaymentOtpActivity, (NsipPartnerPaymentReviewActivity) null, 8, (Object) null);
        }

        public Builder(boolean z) {
            this.client = z;
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final Socket getSocket$okhttp() {
            Socket socket2 = this.socket;
            if (socket2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("socket");
            }
            return socket2;
        }

        public final void setSocket$okhttp(Socket socket2) {
            onGetStartedClick.write((Object) socket2, "<set-?>");
            this.socket = socket2;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("connectionName");
            }
            return str;
        }

        public final void setConnectionName$okhttp(String str) {
            onGetStartedClick.write((Object) str, "<set-?>");
            this.connectionName = str;
        }

        public final NsipPartnerPaymentOtpActivity getSource$okhttp() {
            NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity = this.source;
            if (nsipPartnerPaymentOtpActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("source");
            }
            return nsipPartnerPaymentOtpActivity;
        }

        public final void setSource$okhttp(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "<set-?>");
            this.source = nsipPartnerPaymentOtpActivity;
        }

        public final NsipPartnerPaymentReviewActivity getSink$okhttp() {
            NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity = this.sink;
            if (nsipPartnerPaymentReviewActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("sink");
            }
            return nsipPartnerPaymentReviewActivity;
        }

        public final void setSink$okhttp(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) {
            onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "<set-?>");
            this.sink = nsipPartnerPaymentReviewActivity;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final void setListener$okhttp(Listener listener2) {
            onGetStartedClick.write((Object) listener2, "<set-?>");
            this.listener = listener2;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver2) {
            onGetStartedClick.write((Object) pushObserver2, "<set-?>");
            this.pushObserver = pushObserver2;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket2, String str, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = Util.connectionName(socket2);
            }
            if ((i & 4) != 0) {
                nsipPartnerPaymentOtpActivity = onSubmit.read(onSubmit.read(socket2));
            }
            if ((i & 8) != 0) {
                nsipPartnerPaymentReviewActivity = onSubmit.read(onSubmit.write(socket2));
            }
            return builder.socket(socket2, str, nsipPartnerPaymentOtpActivity, nsipPartnerPaymentReviewActivity);
        }

        public final Builder socket(Socket socket2, String str, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) throws IOException {
            onGetStartedClick.write((Object) socket2, "socket");
            onGetStartedClick.write((Object) str, "connectionName");
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
            onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
            Builder builder = this;
            builder.socket = socket2;
            builder.connectionName = str;
            builder.source = nsipPartnerPaymentOtpActivity;
            builder.sink = nsipPartnerPaymentReviewActivity;
            return builder;
        }

        public final Builder listener(Listener listener2) {
            onGetStartedClick.write((Object) listener2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            Builder builder = this;
            builder.listener = listener2;
            return builder;
        }

        public final Builder pushObserver(PushObserver pushObserver2) {
            onGetStartedClick.write((Object) pushObserver2, "pushObserver");
            Builder builder = this;
            builder.pushObserver = pushObserver2;
            return builder;
        }

        public final Builder pingIntervalMillis(int i) {
            Builder builder = this;
            builder.pingIntervalMillis = i;
            return builder;
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }
    }

    public final class ReaderRunnable implements Runnable, Http2Reader.Handler {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public final void ackSettings() {
        }

        public final void alternateService(int i, String str, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, String str2, int i2, long j) {
            onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "protocol");
            onGetStartedClick.write((Object) str2, "host");
        }

        public final void priority(int i, int i2, int i3, boolean z) {
        }

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            onGetStartedClick.write((Object) http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        public final void run() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                this.reader.readConnectionPreface(this);
                while (this.reader.nextFrame(false, this)) {
                }
                errorCode2 = ErrorCode.NO_ERROR;
                errorCode = ErrorCode.CANCEL;
            } catch (IOException e2) {
                e = e2;
                errorCode2 = ErrorCode.PROTOCOL_ERROR;
                errorCode = ErrorCode.PROTOCOL_ERROR;
            } catch (Throwable th) {
                this.this$0.close$okhttp(errorCode2, errorCode3, e);
                Util.closeQuietly((Closeable) this.reader);
                throw th;
            }
            this.this$0.close$okhttp(errorCode2, errorCode, e);
            Util.closeQuietly((Closeable) this.reader);
        }

        public final void data(boolean z, int i, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, int i2) throws IOException {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, nsipPartnerPaymentOtpActivity, i2, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = (long) i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                nsipPartnerPaymentOtpActivity.MediaBrowserCompat$MediaItem(j);
                return;
            }
            stream.receiveData(nsipPartnerPaymentOtpActivity, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final void headers(boolean z, int i, int i2, List<Header> list) {
            boolean z2 = z;
            int i3 = i;
            List<Header> list2 = list;
            onGetStartedClick.write((Object) list2, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i3)) {
                this.this$0.pushHeadersLater$okhttp(i3, list2, z2);
                return;
            }
            synchronized (this.this$0) {
                Http2Stream stream = this.this$0.getStream(i3);
                if (stream != null) {
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    stream.receiveHeaders(Util.toHeaders(list), z2);
                } else if (!this.this$0.isShutdown()) {
                    if (i3 > this.this$0.getLastGoodStreamId$okhttp()) {
                        if (i3 % 2 != this.this$0.getNextStreamId$okhttp() % 2) {
                            int i4 = i;
                            Http2Stream http2Stream = new Http2Stream(i4, this.this$0, false, z, Util.toHeaders(list));
                            this.this$0.setLastGoodStreamId$okhttp(i3);
                            this.this$0.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                            StringBuilder sb = new StringBuilder();
                            sb.append("OkHttp ");
                            sb.append(this.this$0.getConnectionName$okhttp());
                            sb.append(" stream ");
                            sb.append(i3);
                            Http2Connection.listenerExecutor.execute(new C7551xe89ff7cd(sb.toString(), http2Stream, this, stream, i, list, z));
                        }
                    }
                }
            }
        }

        public final void rstStream(int i, ErrorCode errorCode) {
            onGetStartedClick.write((Object) errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        public final void settings(boolean z, Settings settings) {
            onGetStartedClick.write((Object) settings, "settings");
            Executor access$getWriterExecutor$p = this.this$0.writerExecutor;
            StringBuilder sb = new StringBuilder();
            sb.append("OkHttp ");
            sb.append(this.this$0.getConnectionName$okhttp());
            sb.append(" ACK Settings");
            try {
                access$getWriterExecutor$p.execute(new Http2Connection$ReaderRunnable$settings$$inlined$tryExecute$1(sb.toString(), this, z, settings));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* JADX WARNING: type inference failed for: r2v15, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void applyAndAckSettings(boolean r6, okhttp3.internal.http2.Settings r7) {
            /*
                r5 = this;
                java.lang.String r0 = "settings"
                p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                okhttp3.internal.http2.Http2Writer r0 = r0.getWriter()
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch:{ all -> 0x00d3 }
                monitor-enter(r1)     // Catch:{ all -> 0x00d3 }
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch:{ all -> 0x00d0 }
                okhttp3.internal.http2.Settings r2 = r2.getPeerSettings()     // Catch:{ all -> 0x00d0 }
                int r2 = r2.getInitialWindowSize()     // Catch:{ all -> 0x00d0 }
                if (r6 == 0) goto L_0x0024
                okhttp3.internal.http2.Http2Connection r6 = r5.this$0     // Catch:{ all -> 0x00d0 }
                okhttp3.internal.http2.Settings r6 = r6.getPeerSettings()     // Catch:{ all -> 0x00d0 }
                r6.clear()     // Catch:{ all -> 0x00d0 }
            L_0x0024:
                okhttp3.internal.http2.Http2Connection r6 = r5.this$0     // Catch:{ all -> 0x00d0 }
                okhttp3.internal.http2.Settings r6 = r6.getPeerSettings()     // Catch:{ all -> 0x00d0 }
                r6.merge(r7)     // Catch:{ all -> 0x00d0 }
                okhttp3.internal.http2.Http2Connection r6 = r5.this$0     // Catch:{ all -> 0x00d0 }
                okhttp3.internal.http2.Settings r6 = r6.getPeerSettings()     // Catch:{ all -> 0x00d0 }
                int r6 = r6.getInitialWindowSize()     // Catch:{ all -> 0x00d0 }
                r7 = -1
                r3 = 0
                r4 = 0
                if (r6 == r7) goto L_0x006c
                if (r6 == r2) goto L_0x006c
                int r6 = r6 - r2
                long r6 = (long) r6     // Catch:{ all -> 0x00d0 }
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch:{ all -> 0x00d0 }
                java.util.Map r2 = r2.getStreams$okhttp()     // Catch:{ all -> 0x00d0 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00d0 }
                r2 = r2 ^ 1
                if (r2 == 0) goto L_0x006e
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch:{ all -> 0x00d0 }
                java.util.Map r2 = r2.getStreams$okhttp()     // Catch:{ all -> 0x00d0 }
                java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00d0 }
                okhttp3.internal.http2.Http2Stream[] r3 = new okhttp3.internal.http2.Http2Stream[r4]     // Catch:{ all -> 0x00d0 }
                java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x00d0 }
                if (r2 == 0) goto L_0x0064
                r3 = r2
                okhttp3.internal.http2.Http2Stream[] r3 = (okhttp3.internal.http2.Http2Stream[]) r3     // Catch:{ all -> 0x00d0 }
                goto L_0x006e
            L_0x0064:
                kotlin.TypeCastException r6 = new kotlin.TypeCastException     // Catch:{ all -> 0x00d0 }
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)     // Catch:{ all -> 0x00d0 }
                throw r6     // Catch:{ all -> 0x00d0 }
            L_0x006c:
                r6 = 0
            L_0x006e:
                o.HmlVerifyPhoneValidateOtpActivity r2 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00d0 }
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch:{ IOException -> 0x0081 }
                okhttp3.internal.http2.Http2Writer r1 = r1.getWriter()     // Catch:{ IOException -> 0x0081 }
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch:{ IOException -> 0x0081 }
                okhttp3.internal.http2.Settings r2 = r2.getPeerSettings()     // Catch:{ IOException -> 0x0081 }
                r1.applyAndAckSettings(r2)     // Catch:{ IOException -> 0x0081 }
                goto L_0x0087
            L_0x0081:
                r1 = move-exception
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0     // Catch:{ all -> 0x00d3 }
                r2.failConnection(r1)     // Catch:{ all -> 0x00d3 }
            L_0x0087:
                o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00d3 }
                monitor-exit(r0)
                if (r3 == 0) goto L_0x00a3
                if (r3 != 0) goto L_0x0091
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x0091:
                int r0 = r3.length
            L_0x0092:
                if (r4 >= r0) goto L_0x00a3
                r1 = r3[r4]
                monitor-enter(r1)
                r1.addBytesToWriteWindow(r6)     // Catch:{ all -> 0x00a0 }
                o.HmlVerifyPhoneValidateOtpActivity r2 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00a0 }
                monitor-exit(r1)
                int r4 = r4 + 1
                goto L_0x0092
            L_0x00a0:
                r6 = move-exception
                monitor-exit(r1)
                throw r6
            L_0x00a3:
                java.util.concurrent.ThreadPoolExecutor r6 = okhttp3.internal.http2.Http2Connection.listenerExecutor
                java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "OkHttp "
                r7.append(r0)
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                java.lang.String r0 = r0.getConnectionName$okhttp()
                r7.append(r0)
                java.lang.String r0 = " settings"
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$execute$1 r0 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$execute$1
                r0.<init>(r7, r5)
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                r6.execute(r0)
                return
            L_0x00d0:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00d3 }
                throw r6     // Catch:{ all -> 0x00d3 }
            L_0x00d3:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.applyAndAckSettings(boolean, okhttp3.internal.http2.Settings):void");
        }

        public final void ping(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.this$0) {
                    this.this$0.awaitingPong = false;
                    Http2Connection http2Connection = this.this$0;
                    if (http2Connection != null) {
                        http2Connection.notifyAll();
                        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            Executor access$getWriterExecutor$p = this.this$0.writerExecutor;
            StringBuilder sb = new StringBuilder();
            sb.append("OkHttp ");
            sb.append(this.this$0.getConnectionName$okhttp());
            sb.append(" ping");
            try {
                access$getWriterExecutor$p.execute(new Http2Connection$ReaderRunnable$ping$$inlined$tryExecute$1(sb.toString(), this, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public final void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (this.this$0) {
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    Http2Connection http2Connection2 = this.this$0;
                    if (http2Connection2 != null) {
                        http2Connection2.notifyAll();
                        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
        }

        public final void pushPromise(int i, int i2, List<Header> list) {
            onGetStartedClick.write((Object) list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i2, list);
        }

        public final void goAway(int i, ErrorCode errorCode, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
            int i2;
            Http2Stream[] http2StreamArr;
            onGetStartedClick.write((Object) errorCode, "errorCode");
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "debugData");
            sCBUniversalWebViewActivity_ViewBinding.write();
            synchronized (this.this$0) {
                Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2StreamArr = (Http2Stream[]) array;
                    this.this$0.setShutdown$okhttp(true);
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r3.isShutdown != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r0 = r3.pushExecutor;
        r1 = new java.lang.StringBuilder();
        r1.append("OkHttp ");
        r1.append(r3.connectionName);
        r1.append(" Push Request[");
        r1.append(r4);
        r1.append(']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.execute(new okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$tryExecute$1(r1.toString(), r3, r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void pushRequestLater$okhttp(int r4, java.util.List<okhttp3.internal.http2.Header> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "requestHeaders"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            monitor-enter(r3)
            java.util.Set<java.lang.Integer> r0 = r3.currentPushRequests     // Catch:{ all -> 0x0057 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0057 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0019
            okhttp3.internal.http2.ErrorCode r5 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0057 }
            r3.writeSynResetLater$okhttp(r4, r5)     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            return
        L_0x0019:
            java.util.Set<java.lang.Integer> r0 = r3.currentPushRequests     // Catch:{ all -> 0x0057 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0057 }
            r0.add(r1)     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            boolean r0 = r3.isShutdown
            if (r0 != 0) goto L_0x0056
            java.util.concurrent.ThreadPoolExecutor r0 = r3.pushExecutor
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OkHttp "
            r1.append(r2)
            java.lang.String r2 = r3.connectionName
            r1.append(r2)
            java.lang.String r2 = " Push Request["
            r1.append(r2)
            r1.append(r4)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$tryExecute$1 r2 = new okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$tryExecute$1     // Catch:{ RejectedExecutionException -> 0x0056 }
            r2.<init>(r1, r3, r4, r5)     // Catch:{ RejectedExecutionException -> 0x0056 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ RejectedExecutionException -> 0x0056 }
            r0.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0056 }
        L_0x0056:
            return
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.pushRequestLater$okhttp(int, java.util.List):void");
    }

    public final void pushHeadersLater$okhttp(int i, List<Header> list, boolean z) {
        onGetStartedClick.write((Object) list, "requestHeaders");
        if (!this.isShutdown) {
            Executor executor = this.pushExecutor;
            StringBuilder sb = new StringBuilder();
            sb.append("OkHttp ");
            sb.append(this.connectionName);
            sb.append(" Push Headers[");
            sb.append(i);
            sb.append(']');
            try {
                executor.execute(new Http2Connection$pushHeadersLater$$inlined$tryExecute$1(sb.toString(), this, i, list, z));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void pushDataLater$okhttp(int i, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, int i2, boolean z) throws IOException {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        long j = (long) i2;
        nsipPartnerPaymentOtpActivity.MediaDescriptionCompat(j);
        nsipPartnerPaymentOtpActivity.read(sCBUniversalWebViewActivity, j);
        if (!this.isShutdown) {
            StringBuilder sb = new StringBuilder();
            sb.append("OkHttp ");
            sb.append(this.connectionName);
            sb.append(" Push Data[");
            sb.append(i);
            sb.append(']');
            this.pushExecutor.execute(new Http2Connection$pushDataLater$$inlined$execute$1(sb.toString(), this, i, sCBUniversalWebViewActivity, i2, z));
        }
    }

    public final void pushResetLater$okhttp(int i, ErrorCode errorCode) {
        onGetStartedClick.write((Object) errorCode, "errorCode");
        if (!this.isShutdown) {
            StringBuilder sb = new StringBuilder();
            sb.append("OkHttp ");
            sb.append(this.connectionName);
            sb.append(" Push Reset[");
            sb.append(i);
            sb.append(']');
            this.pushExecutor.execute(new Http2Connection$pushResetLater$$inlined$execute$1(sb.toString(), this, i, errorCode));
        }
    }

    public static abstract class Listener {
        public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        public void onSettings(Http2Connection http2Connection) {
            onGetStartedClick.write((Object) http2Connection, "connection");
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
                this();
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
