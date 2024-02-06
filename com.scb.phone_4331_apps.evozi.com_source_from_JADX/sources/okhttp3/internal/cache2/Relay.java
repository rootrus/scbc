package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;
import p040o.C7043xa484e06c;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class Relay {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final SCBUniversalWebViewActivity_ViewBinding PREFIX_CLEAN = PinChangeSuccessActivity.read("OkHttp cache v1\n");
    public static final SCBUniversalWebViewActivity_ViewBinding PREFIX_DIRTY = PinChangeSuccessActivity.read("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final SCBUniversalWebViewActivity buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final SCBUniversalWebViewActivity_ViewBinding metadata;
    private int sourceCount;
    private HowToAddAccountStep2Activity upstream;
    private final SCBUniversalWebViewActivity upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    private Relay(RandomAccessFile randomAccessFile, HowToAddAccountStep2Activity howToAddAccountStep2Activity, long j, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, long j2) {
        this.file = randomAccessFile;
        this.upstream = howToAddAccountStep2Activity;
        this.upstreamPos = j;
        this.metadata = sCBUniversalWebViewActivity_ViewBinding;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new SCBUniversalWebViewActivity();
        this.complete = this.upstream == null;
        this.buffer = new SCBUniversalWebViewActivity();
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, HowToAddAccountStep2Activity howToAddAccountStep2Activity, long j, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, long j2, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(randomAccessFile, howToAddAccountStep2Activity, j, sCBUniversalWebViewActivity_ViewBinding, j2);
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final HowToAddAccountStep2Activity getUpstream() {
        return this.upstream;
    }

    public final void setUpstream(HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        this.upstream = howToAddAccountStep2Activity;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public final SCBUniversalWebViewActivity getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final SCBUniversalWebViewActivity getBuffer() {
        return this.buffer;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* access modifiers changed from: private */
    public final void writeHeader(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, long j, long j2) throws IOException {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
        sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity);
        sCBUniversalWebViewActivity.MediaSessionCompat$QueueItem(j);
        sCBUniversalWebViewActivity.MediaSessionCompat$QueueItem(j2);
        if (sCBUniversalWebViewActivity.read == FILE_HEADER_SIZE) {
            RandomAccessFile randomAccessFile = this.file;
            if (randomAccessFile == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            FileChannel channel = randomAccessFile.getChannel();
            onGetStartedClick.IconCompatParcelizer((Object) channel, "file!!.channel");
            new FileOperator(channel).write(0, sCBUniversalWebViewActivity, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) throws IOException {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = this.metadata;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
        sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity);
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        FileChannel channel = randomAccessFile.getChannel();
        onGetStartedClick.IconCompatParcelizer((Object) channel, "file!!.channel");
        new FileOperator(channel).write(j + FILE_HEADER_SIZE, sCBUniversalWebViewActivity, (long) this.metadata.write());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.write());
        RandomAccessFile randomAccessFile2 = this.file;
        if (randomAccessFile2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        HowToAddAccountStep2Activity howToAddAccountStep2Activity = this.upstream;
        if (howToAddAccountStep2Activity != null) {
            Util.closeQuietly((Closeable) howToAddAccountStep2Activity);
        }
        this.upstream = null;
    }

    public final SCBUniversalWebViewActivity_ViewBinding metadata() {
        return this.metadata;
    }

    public final HowToAddAccountStep2Activity newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final class RelaySource implements HowToAddAccountStep2Activity {
        private FileOperator fileOperator;
        private long sourcePos;
        private final PinChangeActivity_ViewBinding timeout = new PinChangeActivity_ViewBinding();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            if (file == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            FileChannel channel = file.getChannel();
            onGetStartedClick.IconCompatParcelizer((Object) channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
            if (r4 != true) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
            r8 = java.lang.Math.min(r2, r1.this$0.getUpstreamPos() - r1.sourcePos);
            r2 = r1.fileOperator;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
            if (r2 != null) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
            r2.read(r1.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r8);
            r1.sourcePos += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r0 = r1.this$0.getUpstream();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b5, code lost:
            if (r0 != null) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
            r14 = r0.read(r1.this$0.getUpstreamBuffer(), r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
            if (r14 != -1) goto L_0x00f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
            r1.this$0.commit(r1.this$0.getUpstreamPos());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
            if (r0 == null) goto L_0x00ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e5, code lost:
            r0.notifyAll();
            r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r9 = java.lang.Math.min(r14, r2);
            r1.this$0.getUpstreamBuffer().MediaBrowserCompat$ItemReceiver(r20, 0, r9);
            r1.sourcePos += r9;
            r13 = r1.fileOperator;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0113, code lost:
            if (r13 != null) goto L_0x0118;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0115, code lost:
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0118, code lost:
            r4 = r14;
            r13.write(r1.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r1.this$0.getUpstreamBuffer().clone(), r4);
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            r1.this$0.getBuffer().write(r1.this$0.getUpstreamBuffer(), r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0152, code lost:
            if (r1.this$0.getBuffer().read <= r1.this$0.getBufferMaxSize()) goto L_0x016c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0154, code lost:
            r1.this$0.getBuffer().MediaBrowserCompat$MediaItem(r1.this$0.getBuffer().read - r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x016c, code lost:
            r0 = r1.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r4);
            r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0179, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x017b, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0183, code lost:
            if (r0 == null) goto L_0x018e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0185, code lost:
            r0.notifyAll();
            r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x018c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x018d, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0195, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x019c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x019f, code lost:
            monitor-enter(r1.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r3 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a7, code lost:
            if (r3 == null) goto L_0x01a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b0, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b1, code lost:
            r3.notifyAll();
            r3 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b9, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long read(p040o.SCBUniversalWebViewActivity r20, long r21) throws java.io.IOException {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                java.lang.String r0 = "sink"
                r5 = r20
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L_0x0012
                r0 = r4
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 == 0) goto L_0x01c0
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r8)
            L_0x0018:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01bd }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01bd }
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                r6 = 2
                r9 = -1
                if (r0 == 0) goto L_0x0063
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                long r11 = r0.getUpstreamPos()     // Catch:{ all -> 0x01bd }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                o.SCBUniversalWebViewActivity r0 = r0.getBuffer()     // Catch:{ all -> 0x01bd }
                long r13 = r0.read     // Catch:{ all -> 0x01bd }
                long r11 = r11 - r13
                long r13 = r1.sourcePos     // Catch:{ all -> 0x01bd }
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x003e
                r4 = r6
                goto L_0x0086
            L_0x003e:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01bd }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01bd }
                long r6 = r6 - r9
                long r9 = java.lang.Math.min(r2, r6)     // Catch:{ all -> 0x01bd }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                o.SCBUniversalWebViewActivity r2 = r0.getBuffer()     // Catch:{ all -> 0x01bd }
                long r3 = r1.sourcePos     // Catch:{ all -> 0x01bd }
                long r6 = r3 - r11
                r3 = r20
                r4 = r6
                r6 = r9
                r2.MediaBrowserCompat$ItemReceiver(r3, r4, r6)     // Catch:{ all -> 0x01bd }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x01bd }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x01bd }
                monitor-exit(r8)
                return r9
            L_0x0063:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                boolean r0 = r0.getComplete()     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x006d
                monitor-exit(r8)
                return r9
            L_0x006d:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                java.lang.Thread r0 = r0.getUpstreamReader()     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x007d
                o.PinChangeActivity_ViewBinding r0 = r1.timeout     // Catch:{ all -> 0x01bd }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                r0.waitUntilNotified(r6)     // Catch:{ all -> 0x01bd }
                goto L_0x0018
            L_0x007d:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01bd }
                r0.setUpstreamReader(r7)     // Catch:{ all -> 0x01bd }
            L_0x0086:
                monitor-exit(r8)
                r11 = 32
                if (r4 != r6) goto L_0x00ae
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this
                long r6 = r0.getUpstreamPos()
                long r8 = r1.sourcePos
                long r6 = r6 - r8
                long r8 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.fileOperator
                if (r2 != 0) goto L_0x009f
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x009f:
                long r3 = r1.sourcePos
                long r3 = r3 + r11
                r5 = r20
                r6 = r8
                r2.read(r3, r5, r6)
                long r2 = r1.sourcePos
                long r2 = r2 + r8
                r1.sourcePos = r2
                return r8
            L_0x00ae:
                r8 = 0
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                o.HowToAddAccountStep2Activity r0 = r0.getUpstream()     // Catch:{ all -> 0x019c }
                if (r0 != 0) goto L_0x00ba
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x019c }
            L_0x00ba:
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                o.SCBUniversalWebViewActivity r4 = r4.getUpstreamBuffer()     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                long r6 = r6.getBufferMaxSize()     // Catch:{ all -> 0x019c }
                long r14 = r0.read(r4, r6)     // Catch:{ all -> 0x019c }
                int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x00f9
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                long r2 = r2.getUpstreamPos()     // Catch:{ all -> 0x019c }
                r0.commit(r2)     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f6 }
                r0.setUpstreamReader(r8)     // Catch:{ all -> 0x00f6 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f6 }
                if (r0 == 0) goto L_0x00ee
                java.lang.Object r0 = (java.lang.Object) r0     // Catch:{ all -> 0x00f6 }
                r0.notifyAll()     // Catch:{ all -> 0x00f6 }
                o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00f6 }
                monitor-exit(r2)
                return r9
            L_0x00ee:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x00f6 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x00f6 }
                throw r0     // Catch:{ all -> 0x00f6 }
            L_0x00f6:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00f9:
                long r9 = java.lang.Math.min(r14, r2)     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                o.SCBUniversalWebViewActivity r2 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x019c }
                r6 = 0
                r3 = r20
                r4 = r6
                r6 = r9
                r2.MediaBrowserCompat$ItemReceiver(r3, r4, r6)     // Catch:{ all -> 0x019c }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x019c }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch:{ all -> 0x019c }
                if (r13 != 0) goto L_0x0118
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x019c }
            L_0x0118:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                o.SCBUniversalWebViewActivity r0 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x019c }
                o.SCBUniversalWebViewActivity r16 = r0.clone()     // Catch:{ all -> 0x019c }
                long r2 = r2 + r11
                r4 = r14
                r14 = r2
                r17 = r4
                r13.write(r14, r16, r17)     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x019c }
                monitor-enter(r2)     // Catch:{ all -> 0x019c }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                o.SCBUniversalWebViewActivity r0 = r0.getBuffer()     // Catch:{ all -> 0x0199 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                o.SCBUniversalWebViewActivity r3 = r3.getUpstreamBuffer()     // Catch:{ all -> 0x0199 }
                r0.write((p040o.SCBUniversalWebViewActivity) r3, (long) r4)     // Catch:{ all -> 0x0199 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                o.SCBUniversalWebViewActivity r0 = r0.getBuffer()     // Catch:{ all -> 0x0199 }
                long r6 = r0.read     // Catch:{ all -> 0x0199 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                long r11 = r0.getBufferMaxSize()     // Catch:{ all -> 0x0199 }
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x016c
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                o.SCBUniversalWebViewActivity r0 = r0.getBuffer()     // Catch:{ all -> 0x0199 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                o.SCBUniversalWebViewActivity r3 = r3.getBuffer()     // Catch:{ all -> 0x0199 }
                long r6 = r3.read     // Catch:{ all -> 0x0199 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                long r11 = r3.getBufferMaxSize()     // Catch:{ all -> 0x0199 }
                long r6 = r6 - r11
                r0.MediaBrowserCompat$MediaItem((long) r6)     // Catch:{ all -> 0x0199 }
            L_0x016c:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0199 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x0199 }
                long r6 = r6 + r4
                r0.setUpstreamPos(r6)     // Catch:{ all -> 0x0199 }
                o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0199 }
                monitor-exit(r2)
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                r0.setUpstreamReader(r8)     // Catch:{ all -> 0x0196 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                if (r0 == 0) goto L_0x018e
                java.lang.Object r0 = (java.lang.Object) r0     // Catch:{ all -> 0x0196 }
                r0.notifyAll()     // Catch:{ all -> 0x0196 }
                o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0196 }
                monitor-exit(r2)
                return r9
            L_0x018e:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x0196 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x0196 }
                throw r0     // Catch:{ all -> 0x0196 }
            L_0x0196:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0199:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x019c }
                throw r0     // Catch:{ all -> 0x019c }
            L_0x019c:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01ba }
                r3.setUpstreamReader(r8)     // Catch:{ all -> 0x01ba }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01ba }
                if (r3 != 0) goto L_0x01b1
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x01ba }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x01ba }
                throw r0     // Catch:{ all -> 0x01ba }
            L_0x01b1:
                java.lang.Object r3 = (java.lang.Object) r3     // Catch:{ all -> 0x01ba }
                r3.notifyAll()     // Catch:{ all -> 0x01ba }
                o.HmlVerifyPhoneValidateOtpActivity r3 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01ba }
                monitor-exit(r2)
                throw r0
            L_0x01ba:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x01bd:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            L_0x01c0:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "Check failed."
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(o.SCBUniversalWebViewActivity, long):long");
        }

        public final PinChangeActivity_ViewBinding timeout() {
            return this.timeout;
        }

        public final void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (Relay.this.getSourceCount() == 0) {
                        RandomAccessFile file = Relay.this.getFile();
                        Relay.this.setFile((RandomAccessFile) null);
                        randomAccessFile = file;
                    }
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Relay edit(File file, HowToAddAccountStep2Activity howToAddAccountStep2Activity, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, long j) throws IOException {
            onGetStartedClick.write((Object) file, "file");
            onGetStartedClick.write((Object) howToAddAccountStep2Activity, "upstream");
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, howToAddAccountStep2Activity, 0, sCBUniversalWebViewActivity_ViewBinding, j, (NtbDiscoverFundFilterActivity) null);
            randomAccessFile.setLength(0);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            onGetStartedClick.write((Object) file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            onGetStartedClick.IconCompatParcelizer((Object) channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            fileOperator.read(0, sCBUniversalWebViewActivity, Relay.FILE_HEADER_SIZE);
            if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) new SCBUniversalWebViewActivity_ViewBinding(sCBUniversalWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver((long) Relay.PREFIX_CLEAN.write())), (Object) Relay.PREFIX_CLEAN))) {
                long AlertController$RecycleListView = sCBUniversalWebViewActivity.AlertController$RecycleListView();
                long AlertController$RecycleListView2 = sCBUniversalWebViewActivity.AlertController$RecycleListView();
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = new SCBUniversalWebViewActivity();
                fileOperator.read(AlertController$RecycleListView + Relay.FILE_HEADER_SIZE, sCBUniversalWebViewActivity2, AlertController$RecycleListView2);
                return new Relay(randomAccessFile, (HowToAddAccountStep2Activity) null, AlertController$RecycleListView, sCBUniversalWebViewActivity2.ParcelableVolumeInfo(), 0, (NtbDiscoverFundFilterActivity) null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    static {
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "OkHttp cache v1\n", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "OkHttp DIRTY :(\n", "$receiver");
    }
}
