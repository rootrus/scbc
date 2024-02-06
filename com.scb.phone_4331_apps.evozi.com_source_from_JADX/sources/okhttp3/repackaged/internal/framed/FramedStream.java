package okhttp3.repackaged.internal.framed;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickPromptPayActivity;
import p040o.PinChangeSuccessActivity_ViewBinding;
import p040o.PinLoginActivity;
import p040o.QuickPromptPayActivity;
import p040o.onMenuPromptPayClick;

public final class FramedStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    /* access modifiers changed from: private */
    public final FramedConnection ajZ;
    private final List<Header> aka;
    private List<Header> akb;
    private final C10248b akc;
    final C10247a akd;
    /* access modifiers changed from: private */
    public final C10249c ake = new C10249c();
    /* access modifiers changed from: private */
    public final C10249c akf = new C10249c();
    /* access modifiers changed from: private */
    public ErrorCode akg = null;
    long bytesLeftInWriteWindow;
    /* access modifiers changed from: private */

    /* renamed from: id */
    public final int f5566id;
    long unacknowledgedBytesRead = 0;

    FramedStream(int i, FramedConnection framedConnection, boolean z, boolean z2, List<Header> list) {
        if (framedConnection == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f5566id = i;
            this.ajZ = framedConnection;
            this.bytesLeftInWriteWindow = (long) framedConnection.ajK.mo58787M(65536);
            this.akc = new C10248b((long) framedConnection.ajI.mo58787M(65536));
            this.akd = new C10247a();
            boolean unused = this.akc.finished = z2;
            boolean unused2 = this.akd.finished = z;
            this.aka = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    public final int getId() {
        return this.f5566id;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isOpen() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.repackaged.internal.framed.ErrorCode r0 = r2.akg     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            okhttp3.repackaged.internal.framed.FramedStream$b r0 = r2.akc     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.finished     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0018
            okhttp3.repackaged.internal.framed.FramedStream$b r0 = r2.akc     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.closed     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0018:
            okhttp3.repackaged.internal.framed.FramedStream$a r0 = r2.akd     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.finished     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0028
            okhttp3.repackaged.internal.framed.FramedStream$a r0 = r2.akd     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.closed     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0028:
            java.util.List<okhttp3.repackaged.internal.framed.Header> r0 = r2.akb     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedStream.isOpen():boolean");
    }

    public final boolean isLocallyInitiated() {
        if (this.ajZ.client == ((this.f5566id & 1) == 1)) {
            return true;
        }
        return false;
    }

    public final FramedConnection getConnection() {
        return this.ajZ;
    }

    public final List<Header> getRequestHeaders() {
        return this.aka;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r3.ake.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<okhttp3.repackaged.internal.framed.Header> getResponseHeaders() throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            okhttp3.repackaged.internal.framed.FramedStream$c r0 = r3.ake     // Catch:{ all -> 0x003f }
            r0.enter()     // Catch:{ all -> 0x003f }
        L_0x0006:
            java.util.List<okhttp3.repackaged.internal.framed.Header> r0 = r3.akb     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0012
            okhttp3.repackaged.internal.framed.ErrorCode r0 = r3.akg     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0012
            r3.waitForIo()     // Catch:{ all -> 0x0038 }
            goto L_0x0006
        L_0x0012:
            okhttp3.repackaged.internal.framed.FramedStream$c r0 = r3.ake     // Catch:{ all -> 0x003f }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x003f }
            java.util.List<okhttp3.repackaged.internal.framed.Header> r0 = r3.akb     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x001f
            java.util.List<okhttp3.repackaged.internal.framed.Header> r0 = r3.akb     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return r0
        L_0x001f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x003f }
            okhttp3.repackaged.internal.framed.ErrorCode r2 = r3.akg     // Catch:{ all -> 0x003f }
            r1.append(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003f }
            r0.<init>(r1)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x0038:
            r0 = move-exception
            okhttp3.repackaged.internal.framed.FramedStream$c r1 = r3.ake     // Catch:{ all -> 0x003f }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedStream.getResponseHeaders():java.util.List");
    }

    public final ErrorCode getErrorCode() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.akg;
        }
        return errorCode;
    }

    public final void reply(List<Header> list, boolean z) throws IOException {
        boolean z2;
        synchronized (this) {
            if (list == null) {
                throw new NullPointerException("responseHeaders == null");
            } else if (this.akb == null) {
                this.akb = list;
                z2 = true;
                if (!z) {
                    boolean unused = this.akd.finished = true;
                } else {
                    z2 = false;
                }
            } else {
                throw new IllegalStateException("reply already sent");
            }
        }
        this.ajZ.writeSynReply(this.f5566id, z2, list);
        if (z2) {
            this.ajZ.flush();
        }
    }

    public final ModifyQuickPromptPayActivity readTimeout() {
        return this.ake;
    }

    public final ModifyQuickPromptPayActivity writeTimeout() {
        return this.akf;
    }

    public final HowToAddAccountActivity getSource() {
        return this.akc;
    }

    public final QuickPromptPayActivity getSink() {
        synchronized (this) {
            if (this.akb == null) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.akd;
    }

    public final void close(ErrorCode errorCode) throws IOException {
        if (m6009a(errorCode)) {
            this.ajZ.mo58709b(this.f5566id, errorCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        if (m6009a(errorCode)) {
            this.ajZ.mo58707a(this.f5566id, errorCode);
        }
    }

    /* renamed from: a */
    private boolean m6009a(ErrorCode errorCode) {
        synchronized (this) {
            if (this.akg != null) {
                return false;
            }
            if (this.akc.finished && this.akd.finished) {
                return false;
            }
            this.akg = errorCode;
            notifyAll();
            this.ajZ.mo58724v(this.f5566id);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58736a(List<Header> list, HeadersMode headersMode) {
        ErrorCode errorCode;
        boolean z;
        synchronized (this) {
            errorCode = null;
            z = true;
            if (this.akb == null) {
                if (headersMode.failIfHeadersAbsent()) {
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                } else {
                    this.akb = list;
                    z = isOpen();
                    notifyAll();
                }
            } else if (headersMode.failIfHeadersPresent()) {
                errorCode = ErrorCode.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.akb);
                arrayList.addAll(list);
                this.akb = arrayList;
            }
        }
        if (errorCode != null) {
            closeLater(errorCode);
        } else if (!z) {
            this.ajZ.mo58724v(this.f5566id);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58737a(PinLoginActivity pinLoginActivity, int i) throws IOException {
        this.akc.mo58755a(pinLoginActivity, (long) i);
    }

    /* access modifiers changed from: package-private */
    public final void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            boolean unused = this.akc.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.ajZ.mo58724v(this.f5566id);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58739b(ErrorCode errorCode) {
        synchronized (this) {
            if (this.akg == null) {
                this.akg = errorCode;
                notifyAll();
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.FramedStream$b */
    final class C10248b implements HowToAddAccountActivity {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final onMenuPromptPayClick akk;
        private final onMenuPromptPayClick akl;
        private final long akm;
        /* access modifiers changed from: private */
        public boolean closed;
        /* access modifiers changed from: private */
        public boolean finished;

        private C10248b(long j) {
            this.akk = new onMenuPromptPayClick();
            this.akl = new onMenuPromptPayClick();
            this.akm = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
            r11 = okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).unacknowledgedBytesRead += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
            if (okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).unacknowledgedBytesRead < ((long) (okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).ajI.mo58787M(65536) / 2))) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
            okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).writeWindowUpdateLater(0, okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).unacknowledgedBytesRead);
            okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).unacknowledgedBytesRead = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a8, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
            return r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long read(p040o.onMenuPromptPayClick r9, long r10) throws java.io.IOException {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00b0
                okhttp3.repackaged.internal.framed.FramedStream r2 = okhttp3.repackaged.internal.framed.FramedStream.this
                monitor-enter(r2)
                r8.m6027uC()     // Catch:{ all -> 0x00ad }
                r8.m6028uw()     // Catch:{ all -> 0x00ad }
                o.onMenuPromptPayClick r3 = r8.akl     // Catch:{ all -> 0x00ad }
                long r3 = r3.IconCompatParcelizer     // Catch:{ all -> 0x00ad }
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L_0x001b
                monitor-exit(r2)     // Catch:{ all -> 0x00ad }
                r9 = -1
                return r9
            L_0x001b:
                o.onMenuPromptPayClick r3 = r8.akl     // Catch:{ all -> 0x00ad }
                o.onMenuPromptPayClick r4 = r8.akl     // Catch:{ all -> 0x00ad }
                long r4 = r4.IconCompatParcelizer     // Catch:{ all -> 0x00ad }
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x00ad }
                long r9 = r3.read(r9, r10)     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedStream r11 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00ad }
                long r3 = r11.unacknowledgedBytesRead     // Catch:{ all -> 0x00ad }
                long r3 = r3 + r9
                r11.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedStream r11 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00ad }
                long r3 = r11.unacknowledgedBytesRead     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedStream r11 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedConnection r11 = r11.ajZ     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.Settings r11 = r11.ajI     // Catch:{ all -> 0x00ad }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.mo58787M(r5)     // Catch:{ all -> 0x00ad }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x00ad }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x0060
                okhttp3.repackaged.internal.framed.FramedStream r11 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedConnection r11 = r11.ajZ     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedStream r3 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00ad }
                int r3 = r3.f5566id     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedStream r4 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00ad }
                long r6 = r4.unacknowledgedBytesRead     // Catch:{ all -> 0x00ad }
                r11.writeWindowUpdateLater(r3, r6)     // Catch:{ all -> 0x00ad }
                okhttp3.repackaged.internal.framed.FramedStream r11 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00ad }
                r11.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x00ad }
            L_0x0060:
                monitor-exit(r2)
                okhttp3.repackaged.internal.framed.FramedStream r11 = okhttp3.repackaged.internal.framed.FramedStream.this
                okhttp3.repackaged.internal.framed.FramedConnection r11 = r11.ajZ
                monitor-enter(r11)
                okhttp3.repackaged.internal.framed.FramedStream r2 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedConnection r2 = r2.ajZ     // Catch:{ all -> 0x00aa }
                long r3 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x00aa }
                long r3 = r3 + r9
                r2.unacknowledgedBytesRead = r3     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedStream r2 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedConnection r2 = r2.ajZ     // Catch:{ all -> 0x00aa }
                long r2 = r2.unacknowledgedBytesRead     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedStream r4 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedConnection r4 = r4.ajZ     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.Settings r4 = r4.ajI     // Catch:{ all -> 0x00aa }
                int r4 = r4.mo58787M(r5)     // Catch:{ all -> 0x00aa }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00aa }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x00a8
                okhttp3.repackaged.internal.framed.FramedStream r2 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedConnection r2 = r2.ajZ     // Catch:{ all -> 0x00aa }
                r3 = 0
                okhttp3.repackaged.internal.framed.FramedStream r4 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedConnection r4 = r4.ajZ     // Catch:{ all -> 0x00aa }
                long r4 = r4.unacknowledgedBytesRead     // Catch:{ all -> 0x00aa }
                r2.writeWindowUpdateLater(r3, r4)     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedStream r2 = okhttp3.repackaged.internal.framed.FramedStream.this     // Catch:{ all -> 0x00aa }
                okhttp3.repackaged.internal.framed.FramedConnection r2 = r2.ajZ     // Catch:{ all -> 0x00aa }
                r2.unacknowledgedBytesRead = r0     // Catch:{ all -> 0x00aa }
            L_0x00a8:
                monitor-exit(r11)
                return r9
            L_0x00aa:
                r9 = move-exception
                monitor-exit(r11)
                throw r9
            L_0x00ad:
                r9 = move-exception
                monitor-exit(r2)
                throw r9
            L_0x00b0:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "byteCount < 0: "
                r9.append(r0)
                r9.append(r10)
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r10.<init>(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedStream.C10248b.read(o.onMenuPromptPayClick, long):long");
        }

        /* renamed from: uC */
        private void m6027uC() throws IOException {
            FramedStream.this.ake.enter();
            while (this.akl.IconCompatParcelizer == 0 && !this.finished && !this.closed && FramedStream.this.akg == null) {
                try {
                    FramedStream.this.waitForIo();
                } finally {
                    FramedStream.this.ake.exitAndThrowIfTimedOut();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo58755a(PinLoginActivity pinLoginActivity, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (FramedStream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.akl.IconCompatParcelizer + j > this.akm;
                }
                if (z3) {
                    pinLoginActivity.MediaMetadataCompat(j);
                    FramedStream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    pinLoginActivity.MediaMetadataCompat(j);
                    return;
                } else {
                    long read = pinLoginActivity.read(this.akk, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (FramedStream.this) {
                            if (this.akl.IconCompatParcelizer != 0) {
                                z2 = false;
                            }
                            this.akl.MediaBrowserCompat$ItemReceiver((HowToAddAccountActivity) this.akk);
                            if (z2) {
                                FramedStream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public final ModifyQuickPromptPayActivity timeout() {
            return FramedStream.this.ake;
        }

        public final void close() throws IOException {
            synchronized (FramedStream.this) {
                this.closed = true;
                onMenuPromptPayClick onmenupromptpayclick = this.akl;
                try {
                    onmenupromptpayclick.MediaMetadataCompat(onmenupromptpayclick.IconCompatParcelizer);
                    FramedStream.this.notifyAll();
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
            FramedStream.this.cancelStreamIfNecessary();
        }

        /* renamed from: uw */
        private void m6028uw() throws IOException {
            if (this.closed) {
                throw new IOException("stream closed");
            } else if (FramedStream.this.akg != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("stream was reset: ");
                sb.append(FramedStream.this.akg);
                throw new IOException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public void cancelStreamIfNecessary() throws IOException {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            z = !this.akc.finished && this.akc.closed && (this.akd.finished || this.akd.closed);
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.ajZ.mo58724v(this.f5566id);
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.FramedStream$a */
    final class C10247a implements QuickPromptPayActivity {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long akh = 16384;
        private final onMenuPromptPayClick aki = new onMenuPromptPayClick();
        /* access modifiers changed from: private */
        public boolean closed;
        /* access modifiers changed from: private */
        public boolean finished;

        C10247a() {
        }

        public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            this.aki.write(onmenupromptpayclick, j);
            while (this.aki.IconCompatParcelizer >= 16384) {
                m6020A(false);
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: A */
        private void m6020A(boolean z) throws IOException {
            long min;
            synchronized (FramedStream.this) {
                FramedStream.this.akf.enter();
                while (FramedStream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && FramedStream.this.akg == null) {
                    try {
                        FramedStream.this.waitForIo();
                    } catch (Throwable th) {
                        FramedStream.this.akf.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                FramedStream.this.akf.exitAndThrowIfTimedOut();
                FramedStream.this.checkOutNotClosed();
                min = Math.min(FramedStream.this.bytesLeftInWriteWindow, this.aki.IconCompatParcelizer);
                FramedStream.this.bytesLeftInWriteWindow -= min;
            }
            FramedStream.this.akf.enter();
            try {
                FramedStream.this.ajZ.writeData(FramedStream.this.f5566id, z && min == this.aki.IconCompatParcelizer, this.aki, min);
            } finally {
                FramedStream.this.akf.exitAndThrowIfTimedOut();
            }
        }

        public final void flush() throws IOException {
            synchronized (FramedStream.this) {
                FramedStream.this.checkOutNotClosed();
            }
            while (this.aki.IconCompatParcelizer > 0) {
                m6020A(false);
                FramedStream.this.ajZ.flush();
            }
        }

        public final ModifyQuickPromptPayActivity timeout() {
            return FramedStream.this.akf;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r8.aki.IconCompatParcelizer <= 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            if (r8.aki.IconCompatParcelizer <= 0) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            m6020A(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).writeData(okhttp3.repackaged.internal.framed.FramedStream.m6010b(r8.akj), true, (p040o.onMenuPromptPayClick) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
            r0 = r8.akj;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.closed = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            okhttp3.repackaged.internal.framed.FramedStream.m6008a(r8.akj).flush();
            okhttp3.repackaged.internal.framed.FramedStream.m6014f(r8.akj);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.akj.akd.finished != false) goto L_0x003c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.repackaged.internal.framed.FramedStream r0 = okhttp3.repackaged.internal.framed.FramedStream.this
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch:{ all -> 0x0054 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0054 }
                return
            L_0x0009:
                monitor-exit(r0)
                okhttp3.repackaged.internal.framed.FramedStream r0 = okhttp3.repackaged.internal.framed.FramedStream.this
                okhttp3.repackaged.internal.framed.FramedStream$a r0 = r0.akd
                boolean r0 = r0.finished
                r1 = 1
                if (r0 != 0) goto L_0x003c
                o.onMenuPromptPayClick r0 = r8.aki
                long r2 = r0.IconCompatParcelizer
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0029
            L_0x001d:
                o.onMenuPromptPayClick r0 = r8.aki
                long r2 = r0.IconCompatParcelizer
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003c
                r8.m6020A(r1)
                goto L_0x001d
            L_0x0029:
                okhttp3.repackaged.internal.framed.FramedStream r0 = okhttp3.repackaged.internal.framed.FramedStream.this
                okhttp3.repackaged.internal.framed.FramedConnection r2 = r0.ajZ
                okhttp3.repackaged.internal.framed.FramedStream r0 = okhttp3.repackaged.internal.framed.FramedStream.this
                int r3 = r0.f5566id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x003c:
                okhttp3.repackaged.internal.framed.FramedStream r0 = okhttp3.repackaged.internal.framed.FramedStream.this
                monitor-enter(r0)
                r8.closed = r1     // Catch:{ all -> 0x0051 }
                monitor-exit(r0)
                okhttp3.repackaged.internal.framed.FramedStream r0 = okhttp3.repackaged.internal.framed.FramedStream.this
                okhttp3.repackaged.internal.framed.FramedConnection r0 = r0.ajZ
                r0.flush()
                okhttp3.repackaged.internal.framed.FramedStream r0 = okhttp3.repackaged.internal.framed.FramedStream.this
                r0.cancelStreamIfNecessary()
                return
            L_0x0051:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0054:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.framed.FramedStream.C10247a.close():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: private */
    public void checkOutNotClosed() throws IOException {
        if (this.akd.closed) {
            throw new IOException("stream closed");
        } else if (this.akd.finished) {
            throw new IOException("stream finished");
        } else if (this.akg != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("stream was reset: ");
            sb.append(this.akg);
            throw new IOException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.FramedStream$c */
    class C10249c extends PinChangeSuccessActivity_ViewBinding {
        C10249c() {
        }

        public void timedOut() {
            FramedStream.this.closeLater(ErrorCode.CANCEL);
        }

        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }
    }
}
