package okhttp3.repackaged.internal.framed;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Settings;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.internal.NamedRunnable;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.framed.FrameReader;
import p040o.ModifyQuickBalanceActivity;
import p040o.PinLoginActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;

public final class FramedConnection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ajJ = 16777216;
    /* access modifiers changed from: private */

    /* renamed from: gt */
    public static final ExecutorService f5565gt = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp FramedConnection", true));
    /* access modifiers changed from: private */
    public final Listener ajC;
    private long ajD;
    private final ExecutorService ajE;
    private Map<Integer, Ping> ajF;
    /* access modifiers changed from: private */
    public final PushObserver ajG;
    private int ajH;
    Settings ajI;
    final Settings ajK;
    final Variant ajL;
    final FrameWriter ajM;
    final C10242a ajN;
    long bytesLeftInWriteWindow;
    final boolean client;
    /* access modifiers changed from: private */
    public final Set<Integer> currentPushRequests;
    /* access modifiers changed from: private */
    public final String hostname;
    /* access modifiers changed from: private */
    public int lastGoodStreamId;
    /* access modifiers changed from: private */
    public int nextStreamId;
    final Protocol protocol;
    /* access modifiers changed from: private */
    public boolean receivedInitialPeerSettings;
    /* access modifiers changed from: private */
    public boolean shutdown;
    final Socket socket;
    /* access modifiers changed from: private */
    public final Map<Integer, FramedStream> streams;
    long unacknowledgedBytesRead;

    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() {
            public final void onStream(FramedStream framedStream) throws IOException {
                framedStream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(FramedConnection framedConnection) {
        }

        public abstract void onStream(FramedStream framedStream) throws IOException;
    }

    private FramedConnection(Builder builder) throws IOException {
        this.streams = new HashMap();
        this.ajD = System.nanoTime();
        this.unacknowledgedBytesRead = 0;
        this.ajI = new Settings();
        this.ajK = new Settings();
        this.receivedInitialPeerSettings = false;
        this.currentPushRequests = new LinkedHashSet();
        this.protocol = builder.protocol;
        this.ajG = builder.ajG;
        this.client = builder.client;
        this.ajC = builder.ajC;
        int i = 2;
        this.nextStreamId = builder.client ? 1 : 2;
        if (builder.client && this.protocol == Protocol.HTTP_2) {
            this.nextStreamId += 2;
        }
        this.ajH = builder.client ? 1 : i;
        if (builder.client) {
            this.ajI.mo58793d(7, 0, 16777216);
        }
        this.hostname = builder.hostname;
        if (this.protocol == Protocol.HTTP_2) {
            this.ajL = new Http2();
            this.ajE = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(String.format("OkHttp %s Push Observer", new Object[]{this.hostname}), true));
            this.ajK.mo58793d(7, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.ajK.mo58793d(5, 0, 16384);
        } else if (this.protocol == Protocol.SPDY_3) {
            this.ajL = new Spdy3();
            this.ajE = null;
        } else {
            throw new AssertionError(this.protocol);
        }
        this.bytesLeftInWriteWindow = (long) this.ajK.mo58787M(65536);
        this.socket = builder.socket;
        this.ajM = this.ajL.newWriter(builder.sink, this.client);
        this.ajN = new C10242a(this.ajL.newReader(builder.source, this.client));
        new Thread(this.ajN).start();
    }

    public final Protocol getProtocol() {
        return this.protocol;
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final FramedStream mo58723u(int i) {
        FramedStream framedStream;
        synchronized (this) {
            framedStream = this.streams.get(Integer.valueOf(i));
        }
        return framedStream;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final FramedStream mo58724v(int i) {
        FramedStream remove;
        synchronized (this) {
            remove = this.streams.remove(Integer.valueOf(i));
            if (remove != null && this.streams.isEmpty()) {
                m5994z(true);
            }
            notifyAll();
        }
        return remove;
    }

    /* renamed from: z */
    private void m5994z(boolean z) {
        long j;
        synchronized (this) {
            if (z) {
                try {
                    j = System.nanoTime();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                j = Long.MAX_VALUE;
            }
            this.ajD = j;
        }
    }

    public final boolean isIdle() {
        boolean z;
        synchronized (this) {
            z = this.ajD != Long.MAX_VALUE;
        }
        return z;
    }

    public final int maxConcurrentStreams() {
        int maxConcurrentStreams;
        synchronized (this) {
            maxConcurrentStreams = this.ajK.getMaxConcurrentStreams(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        return maxConcurrentStreams;
    }

    public final long getIdleStartTimeNs() {
        long j;
        synchronized (this) {
            j = this.ajD;
        }
        return j;
    }

    public final FramedStream pushStream(int i, List<Header> list, boolean z) throws IOException {
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        } else if (this.protocol == Protocol.HTTP_2) {
            return m5966a(i, list, z, false);
        } else {
            throw new IllegalStateException("protocol != HTTP_2");
        }
    }

    public final FramedStream newStream(List<Header> list, boolean z, boolean z2) throws IOException {
        return m5966a(0, list, z, z2);
    }

    /* renamed from: a */
    private FramedStream m5966a(int i, List<Header> list, boolean z, boolean z2) throws IOException {
        int i2;
        FramedStream framedStream;
        boolean z3 = !z;
        boolean z4 = !z2;
        synchronized (this.ajM) {
            synchronized (this) {
                if (!this.shutdown) {
                    i2 = this.nextStreamId;
                    this.nextStreamId += 2;
                    framedStream = new FramedStream(i2, this, z3, z4, list);
                    if (framedStream.isOpen()) {
                        this.streams.put(Integer.valueOf(i2), framedStream);
                        m5994z(false);
                    }
                } else {
                    throw new IOException("shutdown");
                }
            }
            if (i == 0) {
                this.ajM.synStream(z3, z4, i2, i, list);
            } else if (!this.client) {
                this.ajM.pushPromise(i, i2, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (!z) {
            this.ajM.flush();
        }
        return framedStream;
    }

    /* access modifiers changed from: package-private */
    public final void writeSynReply(int i, boolean z, List<Header> list) throws IOException {
        this.ajM.synReply(z, i, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.bytesLeftInWriteWindow), r8.ajM.maxDataLength());
        r6 = (long) r2;
        r8.bytesLeftInWriteWindow -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeData(int r9, boolean r10, p040o.onMenuPromptPayClick r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            okhttp3.repackaged.internal.framed.FrameWriter r12 = r8.ajM
            r12.data(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0062
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.bytesLeftInWriteWindow     // Catch:{ InterruptedException -> 0x005a }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.repackaged.internal.framed.FramedStream> r2 = r8.streams     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r2 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r4 = r8.bytesLeftInWriteWindow     // Catch:{ all -> 0x0058 }
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0058 }
            int r2 = (int) r4     // Catch:{ all -> 0x0058 }
            okhttp3.repackaged.internal.framed.FrameWriter r4 = r8.ajM     // Catch:{ all -> 0x0058 }
            int r4 = r4.maxDataLength()     // Catch:{ all -> 0x0058 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0058 }
            long r4 = r8.bytesLeftInWriteWindow     // Catch:{ all -> 0x0058 }
            long r6 = (long) r2     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.bytesLeftInWriteWindow = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.repackaged.internal.framed.FrameWriter r4 = r8.ajM
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = r3
        L_0x0054:
            r4.data(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0060
        L_0x005a:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0060:
            monitor-exit(r8)
            throw r9
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedConnection.writeData(int, boolean, o.onMenuPromptPayClick, long):void");
    }

    /* access modifiers changed from: package-private */
    public final void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58707a(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        f5565gt.submit(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) {
            public void execute() {
                try {
                    FramedConnection.this.mo58709b(i2, errorCode2);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58709b(int i, ErrorCode errorCode) throws IOException {
        this.ajM.rstStream(i, errorCode);
    }

    /* access modifiers changed from: package-private */
    public final void writeWindowUpdateLater(int i, long j) {
        final int i2 = i;
        final long j2 = j;
        f5565gt.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) {
            public void execute() {
                try {
                    FramedConnection.this.ajM.windowUpdate(i2, j2);
                } catch (IOException unused) {
                }
            }
        });
    }

    public final Ping ping() throws IOException {
        int i;
        Ping ping = new Ping();
        synchronized (this) {
            if (!this.shutdown) {
                i = this.ajH;
                this.ajH += 2;
                if (this.ajF == null) {
                    this.ajF = new HashMap();
                }
                this.ajF.put(Integer.valueOf(i), ping);
            } else {
                throw new IOException("shutdown");
            }
        }
        m5980b(false, i, 1330343787, ping);
        return ping;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5975a(boolean z, int i, int i2, Ping ping) {
        final boolean z2 = z;
        final int i3 = i;
        final int i4 = i2;
        final Ping ping2 = ping;
        f5565gt.execute(new NamedRunnable("OkHttp %s ping %08x%08x", new Object[]{this.hostname, Integer.valueOf(i), Integer.valueOf(i2)}) {
            public void execute() {
                try {
                    FramedConnection.this.m5980b(z2, i3, i4, ping2);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5980b(boolean z, int i, int i2, Ping ping) throws IOException {
        synchronized (this.ajM) {
            if (ping != null) {
                ping.send();
            }
            this.ajM.ping(z, i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public Ping m5993w(int i) {
        Ping remove;
        synchronized (this) {
            remove = this.ajF != null ? this.ajF.remove(Integer.valueOf(i)) : null;
        }
        return remove;
    }

    public final void flush() throws IOException {
        this.ajM.flush();
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.ajM) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.shutdown = true;
                    int i = this.lastGoodStreamId;
                    this.ajM.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
                }
            }
        }
    }

    public final void close() throws IOException {
        m5968a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5968a(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        int i;
        FramedStream[] framedStreamArr;
        Ping[] pingArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                framedStreamArr = (FramedStream[]) this.streams.values().toArray(new FramedStream[this.streams.size()]);
                this.streams.clear();
                m5994z(false);
            } else {
                framedStreamArr = null;
            }
            if (this.ajF != null) {
                Ping[] pingArr2 = (Ping[]) this.ajF.values().toArray(new Ping[this.ajF.size()]);
                this.ajF = null;
                pingArr = pingArr2;
            }
        }
        if (framedStreamArr != null) {
            for (FramedStream close : framedStreamArr) {
                try {
                    close.close(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        if (pingArr != null) {
            for (Ping cancel : pingArr) {
                cancel.cancel();
            }
        }
        try {
            this.ajM.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    public final void sendConnectionPreface() throws IOException {
        this.ajM.connectionPreface();
        this.ajM.settings(this.ajI);
        int M = this.ajI.mo58787M(65536);
        if (M != 65536) {
            this.ajM.windowUpdate(0, (long) (M - 65536));
        }
    }

    public final void setSettings(Settings settings) throws IOException {
        synchronized (this.ajM) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.ajI.mo58791b(settings);
                    this.ajM.settings(settings);
                } else {
                    throw new IOException("shutdown");
                }
            }
        }
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public Listener ajC = Listener.REFUSE_INCOMING_STREAMS;
        /* access modifiers changed from: private */
        public PushObserver ajG = PushObserver.CANCEL;
        /* access modifiers changed from: private */
        public boolean client;
        /* access modifiers changed from: private */
        public String hostname;
        /* access modifiers changed from: private */
        public Protocol protocol = Protocol.SPDY_3;
        /* access modifiers changed from: private */
        public onLoginButtonClick sink;
        /* access modifiers changed from: private */
        public Socket socket;
        /* access modifiers changed from: private */
        public PinLoginActivity source;

        public Builder(boolean z) throws IOException {
            this.client = z;
        }

        public Builder socket(Socket socket2) throws IOException {
            return socket(socket2, ((InetSocketAddress) socket2.getRemoteSocketAddress()).getHostName(), ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(socket2)), ModifyQuickBalanceActivity.read(ModifyQuickBalanceActivity.read(socket2)));
        }

        public Builder socket(Socket socket2, String str, PinLoginActivity pinLoginActivity, onLoginButtonClick onloginbuttonclick) {
            this.socket = socket2;
            this.hostname = str;
            this.source = pinLoginActivity;
            this.sink = onloginbuttonclick;
            return this;
        }

        public Builder listener(Listener listener) {
            this.ajC = listener;
            return this;
        }

        public Builder protocol(Protocol protocol2) {
            this.protocol = protocol2;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver) {
            this.ajG = pushObserver;
            return this;
        }

        public FramedConnection build() throws IOException {
            return new FramedConnection(this);
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.FramedConnection$a */
    class C10242a extends NamedRunnable implements FrameReader.Handler {
        final FrameReader ajV;

        public void ackSettings() {
        }

        public void alternateService(int i, String str, PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding, String str2, int i2, long j) {
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }

        private C10242a(FrameReader frameReader) {
            super("OkHttp %s", FramedConnection.this.hostname);
            this.ajV = frameReader;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r0 = okhttp3.repackaged.internal.framed.ErrorCode.PROTOCOL_ERROR;
            r1 = okhttp3.repackaged.internal.framed.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            okhttp3.repackaged.internal.framed.FramedConnection.m5973a(r4.ajP, r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            okhttp3.repackaged.internal.Util.closeQuietly((java.io.Closeable) r4.ajV);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0021 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void execute() {
            /*
                r4 = this;
                okhttp3.repackaged.internal.framed.ErrorCode r0 = okhttp3.repackaged.internal.framed.ErrorCode.INTERNAL_ERROR
                okhttp3.repackaged.internal.framed.ErrorCode r1 = okhttp3.repackaged.internal.framed.ErrorCode.INTERNAL_ERROR
                okhttp3.repackaged.internal.framed.FramedConnection r2 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ IOException -> 0x0021 }
                boolean r2 = r2.client     // Catch:{ IOException -> 0x0021 }
                if (r2 != 0) goto L_0x000f
                okhttp3.repackaged.internal.framed.FrameReader r2 = r4.ajV     // Catch:{ IOException -> 0x0021 }
                r2.readConnectionPreface()     // Catch:{ IOException -> 0x0021 }
            L_0x000f:
                okhttp3.repackaged.internal.framed.FrameReader r2 = r4.ajV     // Catch:{ IOException -> 0x0021 }
                boolean r2 = r2.nextFrame(r4)     // Catch:{ IOException -> 0x0021 }
                if (r2 == 0) goto L_0x0018
                goto L_0x000f
            L_0x0018:
                okhttp3.repackaged.internal.framed.ErrorCode r0 = okhttp3.repackaged.internal.framed.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0021 }
                okhttp3.repackaged.internal.framed.ErrorCode r1 = okhttp3.repackaged.internal.framed.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0021 }
            L_0x001c:
                okhttp3.repackaged.internal.framed.FramedConnection r2 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ IOException -> 0x0029 }
                goto L_0x0026
            L_0x001f:
                r2 = move-exception
                goto L_0x002f
            L_0x0021:
                okhttp3.repackaged.internal.framed.ErrorCode r0 = okhttp3.repackaged.internal.framed.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x001f }
                okhttp3.repackaged.internal.framed.ErrorCode r1 = okhttp3.repackaged.internal.framed.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x001f }
                goto L_0x001c
            L_0x0026:
                r2.m5968a((okhttp3.repackaged.internal.framed.ErrorCode) r0, (okhttp3.repackaged.internal.framed.ErrorCode) r1)     // Catch:{ IOException -> 0x0029 }
            L_0x0029:
                okhttp3.repackaged.internal.framed.FrameReader r0 = r4.ajV
                okhttp3.repackaged.internal.Util.closeQuietly((java.io.Closeable) r0)
                return
            L_0x002f:
                okhttp3.repackaged.internal.framed.FramedConnection r3 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ IOException -> 0x0034 }
                r3.m5968a((okhttp3.repackaged.internal.framed.ErrorCode) r0, (okhttp3.repackaged.internal.framed.ErrorCode) r1)     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                okhttp3.repackaged.internal.framed.FrameReader r0 = r4.ajV
                okhttp3.repackaged.internal.Util.closeQuietly((java.io.Closeable) r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedConnection.C10242a.execute():void");
        }

        public void data(boolean z, int i, PinLoginActivity pinLoginActivity, int i2) throws IOException {
            if (FramedConnection.this.pushedStream(i)) {
                FramedConnection.this.m5967a(i, pinLoginActivity, i2, z);
                return;
            }
            FramedStream u = FramedConnection.this.mo58723u(i);
            if (u == null) {
                FramedConnection.this.mo58707a(i, ErrorCode.INVALID_STREAM);
                pinLoginActivity.MediaMetadataCompat((long) i2);
                return;
            }
            u.mo58737a(pinLoginActivity, i2);
            if (z) {
                u.receiveFin();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
            if (r14.failIfStreamPresent() == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
            r0.closeLater(okhttp3.repackaged.internal.framed.ErrorCode.PROTOCOL_ERROR);
            r8.ajP.mo58724v(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
            r0.mo58736a(r13, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
            r0.receiveFin();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void headers(boolean r9, boolean r10, int r11, int r12, java.util.List<okhttp3.repackaged.internal.framed.Header> r13, okhttp3.repackaged.internal.framed.HeadersMode r14) {
            /*
                r8 = this;
                okhttp3.repackaged.internal.framed.FramedConnection r12 = okhttp3.repackaged.internal.framed.FramedConnection.this
                boolean r12 = r12.pushedStream(r11)
                if (r12 == 0) goto L_0x000e
                okhttp3.repackaged.internal.framed.FramedConnection r9 = okhttp3.repackaged.internal.framed.FramedConnection.this
                r9.pushHeadersLater(r11, r13, r10)
                return
            L_0x000e:
                okhttp3.repackaged.internal.framed.FramedConnection r12 = okhttp3.repackaged.internal.framed.FramedConnection.this
                monitor-enter(r12)
                okhttp3.repackaged.internal.framed.FramedConnection r0 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                boolean r0 = r0.shutdown     // Catch:{ all -> 0x00a5 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x001b:
                okhttp3.repackaged.internal.framed.FramedConnection r0 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                okhttp3.repackaged.internal.framed.FramedStream r0 = r0.mo58723u(r11)     // Catch:{ all -> 0x00a5 }
                if (r0 != 0) goto L_0x008a
                boolean r14 = r14.failIfStreamAbsent()     // Catch:{ all -> 0x00a5 }
                if (r14 == 0) goto L_0x0032
                okhttp3.repackaged.internal.framed.FramedConnection r9 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                okhttp3.repackaged.internal.framed.ErrorCode r10 = okhttp3.repackaged.internal.framed.ErrorCode.INVALID_STREAM     // Catch:{ all -> 0x00a5 }
                r9.mo58707a((int) r11, (okhttp3.repackaged.internal.framed.ErrorCode) r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)
                return
            L_0x0032:
                okhttp3.repackaged.internal.framed.FramedConnection r14 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                int r14 = r14.lastGoodStreamId     // Catch:{ all -> 0x00a5 }
                if (r11 > r14) goto L_0x003c
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x003c:
                int r14 = r11 % 2
                okhttp3.repackaged.internal.framed.FramedConnection r0 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                int r0 = r0.nextStreamId     // Catch:{ all -> 0x00a5 }
                r1 = 2
                int r0 = r0 % r1
                if (r14 != r0) goto L_0x004a
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x004a:
                okhttp3.repackaged.internal.framed.FramedStream r14 = new okhttp3.repackaged.internal.framed.FramedStream     // Catch:{ all -> 0x00a5 }
                okhttp3.repackaged.internal.framed.FramedConnection r4 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                r2 = r14
                r3 = r11
                r5 = r9
                r6 = r10
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a5 }
                okhttp3.repackaged.internal.framed.FramedConnection r9 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                int unused = r9.lastGoodStreamId = r11     // Catch:{ all -> 0x00a5 }
                okhttp3.repackaged.internal.framed.FramedConnection r9 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                java.util.Map r9 = r9.streams     // Catch:{ all -> 0x00a5 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r9.put(r10, r14)     // Catch:{ all -> 0x00a5 }
                java.util.concurrent.ExecutorService r9 = okhttp3.repackaged.internal.framed.FramedConnection.f5565gt     // Catch:{ all -> 0x00a5 }
                okhttp3.repackaged.internal.framed.FramedConnection$a$1 r10 = new okhttp3.repackaged.internal.framed.FramedConnection$a$1     // Catch:{ all -> 0x00a5 }
                java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
                r0 = 0
                okhttp3.repackaged.internal.framed.FramedConnection r1 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00a5 }
                java.lang.String r1 = r1.hostname     // Catch:{ all -> 0x00a5 }
                r13[r0] = r1     // Catch:{ all -> 0x00a5 }
                r0 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r13[r0] = r11     // Catch:{ all -> 0x00a5 }
                java.lang.String r11 = "OkHttp %s stream %d"
                r10.<init>(r11, r13, r14)     // Catch:{ all -> 0x00a5 }
                r9.execute(r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)
                return
            L_0x008a:
                monitor-exit(r12)
                boolean r9 = r14.failIfStreamPresent()
                if (r9 == 0) goto L_0x009c
                okhttp3.repackaged.internal.framed.ErrorCode r9 = okhttp3.repackaged.internal.framed.ErrorCode.PROTOCOL_ERROR
                r0.closeLater(r9)
                okhttp3.repackaged.internal.framed.FramedConnection r9 = okhttp3.repackaged.internal.framed.FramedConnection.this
                r9.mo58724v(r11)
                return
            L_0x009c:
                r0.mo58736a((java.util.List<okhttp3.repackaged.internal.framed.Header>) r13, (okhttp3.repackaged.internal.framed.HeadersMode) r14)
                if (r10 == 0) goto L_0x00a4
                r0.receiveFin()
            L_0x00a4:
                return
            L_0x00a5:
                r9 = move-exception
                monitor-exit(r12)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedConnection.C10242a.headers(boolean, boolean, int, int, java.util.List, okhttp3.repackaged.internal.framed.HeadersMode):void");
        }

        public void rstStream(int i, ErrorCode errorCode) {
            if (FramedConnection.this.pushedStream(i)) {
                FramedConnection.this.m5985c(i, errorCode);
                return;
            }
            FramedStream v = FramedConnection.this.mo58724v(i);
            if (v != null) {
                v.mo58739b(errorCode);
            }
        }

        /* JADX WARNING: type inference failed for: r10v22, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void settings(boolean r10, okhttp3.repackaged.internal.framed.Settings r11) {
            /*
                r9 = this;
                okhttp3.repackaged.internal.framed.FramedConnection r0 = okhttp3.repackaged.internal.framed.FramedConnection.this
                monitor-enter(r0)
                okhttp3.repackaged.internal.framed.FramedConnection r1 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.Settings r1 = r1.ajK     // Catch:{ all -> 0x00ab }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.mo58787M(r2)     // Catch:{ all -> 0x00ab }
                if (r10 == 0) goto L_0x0016
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.Settings r10 = r10.ajK     // Catch:{ all -> 0x00ab }
                r10.clear()     // Catch:{ all -> 0x00ab }
            L_0x0016:
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.Settings r10 = r10.ajK     // Catch:{ all -> 0x00ab }
                r10.mo58791b(r11)     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.Protocol r10 = r10.getProtocol()     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.Protocol r3 = okhttp3.repackaged.Protocol.HTTP_2     // Catch:{ all -> 0x00ab }
                if (r10 != r3) goto L_0x002a
                r9.m6007a(r11)     // Catch:{ all -> 0x00ab }
            L_0x002a:
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.Settings r10 = r10.ajK     // Catch:{ all -> 0x00ab }
                int r10 = r10.mo58787M(r2)     // Catch:{ all -> 0x00ab }
                r11 = 0
                r2 = -1
                r3 = 0
                r5 = 1
                if (r10 == r2) goto L_0x0079
                if (r10 == r1) goto L_0x0079
                int r10 = r10 - r1
                long r1 = (long) r10     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                boolean r10 = r10.receivedInitialPeerSettings     // Catch:{ all -> 0x00ab }
                if (r10 != 0) goto L_0x004f
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                r10.addBytesToWriteWindow(r1)     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                boolean unused = r10.receivedInitialPeerSettings = r5     // Catch:{ all -> 0x00ab }
            L_0x004f:
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.util.Map r10 = r10.streams     // Catch:{ all -> 0x00ab }
                boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x00ab }
                if (r10 != 0) goto L_0x007a
                okhttp3.repackaged.internal.framed.FramedConnection r10 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.util.Map r10 = r10.streams     // Catch:{ all -> 0x00ab }
                java.util.Collection r10 = r10.values()     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.FramedConnection r11 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.util.Map r11 = r11.streams     // Catch:{ all -> 0x00ab }
                int r11 = r11.size()     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.FramedStream[] r11 = new okhttp3.repackaged.internal.framed.FramedStream[r11]     // Catch:{ all -> 0x00ab }
                java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ all -> 0x00ab }
                r11 = r10
                okhttp3.repackaged.internal.framed.FramedStream[] r11 = (okhttp3.repackaged.internal.framed.FramedStream[]) r11     // Catch:{ all -> 0x00ab }
                goto L_0x007a
            L_0x0079:
                r1 = r3
            L_0x007a:
                java.util.concurrent.ExecutorService r10 = okhttp3.repackaged.internal.framed.FramedConnection.f5565gt     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.FramedConnection$a$2 r6 = new okhttp3.repackaged.internal.framed.FramedConnection$a$2     // Catch:{ all -> 0x00ab }
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ab }
                okhttp3.repackaged.internal.framed.FramedConnection r7 = okhttp3.repackaged.internal.framed.FramedConnection.this     // Catch:{ all -> 0x00ab }
                java.lang.String r7 = r7.hostname     // Catch:{ all -> 0x00ab }
                r8 = 0
                r5[r8] = r7     // Catch:{ all -> 0x00ab }
                java.lang.String r7 = "OkHttp %s settings"
                r6.<init>(r7, r5)     // Catch:{ all -> 0x00ab }
                r10.execute(r6)     // Catch:{ all -> 0x00ab }
                monitor-exit(r0)
                if (r11 == 0) goto L_0x00aa
                int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r10 == 0) goto L_0x00aa
                int r10 = r11.length
            L_0x009b:
                if (r8 >= r10) goto L_0x00aa
                r0 = r11[r8]
                monitor-enter(r0)
                r0.addBytesToWriteWindow(r1)     // Catch:{ all -> 0x00a7 }
                monitor-exit(r0)
                int r8 = r8 + 1
                goto L_0x009b
            L_0x00a7:
                r10 = move-exception
                monitor-exit(r0)
                throw r10
            L_0x00aa:
                return
            L_0x00ab:
                r10 = move-exception
                monitor-exit(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedConnection.C10242a.settings(boolean, okhttp3.repackaged.internal.framed.Settings):void");
        }

        /* renamed from: a */
        private void m6007a(final Settings settings) {
            FramedConnection.f5565gt.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{FramedConnection.this.hostname}) {
                public void execute() {
                    try {
                        FramedConnection.this.ajM.ackSettings(settings);
                    } catch (IOException unused) {
                    }
                }
            });
        }

        public void ping(boolean z, int i, int i2) {
            if (z) {
                Ping c = FramedConnection.this.m5993w(i);
                if (c != null) {
                    c.mo58776uR();
                    return;
                }
                return;
            }
            FramedConnection.this.m5975a(true, i, i2, (Ping) null);
        }

        public void goAway(int i, ErrorCode errorCode, PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) {
            FramedStream[] framedStreamArr;
            synchronized (FramedConnection.this) {
                framedStreamArr = (FramedStream[]) FramedConnection.this.streams.values().toArray(new FramedStream[FramedConnection.this.streams.size()]);
                boolean unused = FramedConnection.this.shutdown = true;
            }
            for (FramedStream framedStream : framedStreamArr) {
                if (framedStream.getId() > i && framedStream.isLocallyInitiated()) {
                    framedStream.mo58739b(ErrorCode.REFUSED_STREAM);
                    FramedConnection.this.mo58724v(framedStream.getId());
                }
            }
        }

        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (FramedConnection.this) {
                    FramedConnection.this.bytesLeftInWriteWindow += j;
                    FramedConnection.this.notifyAll();
                }
                return;
            }
            FramedStream u = FramedConnection.this.mo58723u(i);
            if (u != null) {
                synchronized (u) {
                    u.addBytesToWriteWindow(j);
                }
            }
        }

        public void pushPromise(int i, int i2, List<Header> list) {
            FramedConnection.this.pushRequestLater(i2, list);
        }
    }

    /* access modifiers changed from: private */
    public boolean pushedStream(int i) {
        return this.protocol == Protocol.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: private */
    public void pushRequestLater(int i, List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                mo58707a(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            final int i2 = i;
            final List<Header> list2 = list;
            this.ajE.execute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
                public void execute() {
                    if (FramedConnection.this.ajG.onRequest(i2, list2)) {
                        try {
                            FramedConnection.this.ajM.rstStream(i2, ErrorCode.CANCEL);
                            synchronized (FramedConnection.this) {
                                FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i2));
                            }
                        } catch (IOException unused) {
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void pushHeadersLater(int i, List<Header> list, boolean z) {
        final int i2 = i;
        final List<Header> list2 = list;
        final boolean z2 = z;
        this.ajE.execute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
            public void execute() {
                boolean onHeaders = FramedConnection.this.ajG.onHeaders(i2, list2, z2);
                if (onHeaders) {
                    try {
                        FramedConnection.this.ajM.rstStream(i2, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (!onHeaders) {
                    if (!z2) {
                        return;
                    }
                }
                synchronized (FramedConnection.this) {
                    FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i2));
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5967a(int i, PinLoginActivity pinLoginActivity, int i2, boolean z) throws IOException {
        final onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
        long j = (long) i2;
        pinLoginActivity.MediaDescriptionCompat(j);
        pinLoginActivity.read(onmenupromptpayclick, j);
        if (onmenupromptpayclick.IconCompatParcelizer == j) {
            final int i3 = i;
            final int i4 = i2;
            final boolean z2 = z;
            this.ajE.execute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
                public void execute() {
                    try {
                        boolean onData = FramedConnection.this.ajG.onData(i3, onmenupromptpayclick, i4, z2);
                        if (onData) {
                            FramedConnection.this.ajM.rstStream(i3, ErrorCode.CANCEL);
                        }
                        if (!onData) {
                            if (!z2) {
                                return;
                            }
                        }
                        synchronized (FramedConnection.this) {
                            FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i3));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(onmenupromptpayclick.IconCompatParcelizer);
        sb.append(" != ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5985c(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        this.ajE.execute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
            public void execute() {
                FramedConnection.this.ajG.onReset(i2, errorCode2);
                synchronized (FramedConnection.this) {
                    FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i2));
                }
            }
        });
    }
}
