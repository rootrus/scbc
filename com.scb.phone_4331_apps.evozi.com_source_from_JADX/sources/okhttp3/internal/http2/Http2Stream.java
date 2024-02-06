package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.TypeCastException;
import okhttp3.Headers;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding;
import p040o.PinChangeActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class Http2Stream {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue = new ArrayDeque<>();

    /* renamed from: id */
    private final int f3182id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        onGetStartedClick.write((Object) http2Connection, "connection");
        this.f3182id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = (long) http2Connection.getPeerSettings().getInitialWindowSize();
        this.source = new FramingSource((long) this.connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                this.headersQueue.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final int getId() {
        return this.f3182id;
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final ErrorCode getErrorCode$okhttp() {
        ErrorCode errorCode2;
        synchronized (this) {
            errorCode2 = this.errorCode;
        }
        return errorCode2;
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode2) {
        this.errorCode = errorCode2;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isOpen() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getFinished$okhttp()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0018
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getClosed$okhttp()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0018:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getFinished()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0028
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.getClosed()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0028:
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x0031 }
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.isOpen():boolean");
    }

    public final boolean isLocallyInitiated() {
        if (this.connection.getClient$okhttp() == ((this.f3182id & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        r2.readTimeout.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Headers takeHeaders() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x0050 }
            r0.enter()     // Catch:{ all -> 0x0050 }
        L_0x0006:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0016
            r2.waitForIo$okhttp()     // Catch:{ all -> 0x0049 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x0050 }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x0050 }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0050 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0050 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0036
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "headersQueue.removeFirst()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0050 }
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)
            return r0
        L_0x0036:
            java.io.IOException r0 = r2.errorException     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0046
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0050 }
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0043
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0050 }
        L_0x0043:
            r0.<init>(r1)     // Catch:{ all -> 0x0050 }
        L_0x0046:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0049:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch:{ all -> 0x0050 }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders():okhttp3.Headers");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0056 A[SYNTHETIC, Splitter:B:32:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Headers trailers() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            okhttp3.internal.http2.ErrorCode r0 = r7.errorCode     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0018
            java.io.IOException r0 = r7.errorException     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0015
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0064 }
            okhttp3.internal.http2.ErrorCode r1 = r7.errorCode     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0012
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0064 }
        L_0x0012:
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
        L_0x0015:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0018:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r7.source     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.getFinished$okhttp()     // Catch:{ all -> 0x0064 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0047
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r7.source     // Catch:{ all -> 0x0064 }
            o.SCBUniversalWebViewActivity r0 = r0.getReceiveBuffer()     // Catch:{ all -> 0x0064 }
            long r3 = r0.read     // Catch:{ all -> 0x0064 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            r0 = r1
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r0 == 0) goto L_0x0047
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r7.source     // Catch:{ all -> 0x0064 }
            o.SCBUniversalWebViewActivity r0 = r0.getReadBuffer()     // Catch:{ all -> 0x0064 }
            long r3 = r0.read     // Catch:{ all -> 0x0064 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            r0 = r1
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = r2
        L_0x0048:
            if (r1 == 0) goto L_0x0056
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r7.source     // Catch:{ all -> 0x0064 }
            okhttp3.Headers r0 = r0.getTrailers()     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0054
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS     // Catch:{ all -> 0x0064 }
        L_0x0054:
            monitor-exit(r7)
            return r0
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "too early; can't read the trailers yet"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0064 }
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.trailers():okhttp3.Headers");
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        onGetStartedClick.write((Object) list, "responseHeaders");
        boolean holdsLock = Thread.holdsLock(this);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            synchronized (this) {
                this.hasResponseHeaders = true;
                if (z) {
                    this.sink.setFinished(true);
                }
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            if (!z2) {
                synchronized (this.connection) {
                    z3 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
                z2 = z3;
            }
            this.connection.writeHeaders$okhttp(this.f3182id, z, list);
            if (z2) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void enqueueTrailers(Headers headers) {
        onGetStartedClick.write((Object) headers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!this.sink.getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    this.sink.setTrailers(headers);
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    public final PinChangeActivity_ViewBinding readTimeout() {
        return this.readTimeout;
    }

    public final PinChangeActivity_ViewBinding writeTimeout() {
        return this.writeTimeout;
    }

    public final HowToAddAccountStep2Activity getSource() {
        return this.source;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0019 A[SYNTHETIC, Splitter:B:14:0x0019] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.PinChangeActivity getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.isLocallyInitiated()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0019
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            o.PinChangeActivity r0 = (p040o.PinChangeActivity) r0
            return r0
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "reply before requesting the sink"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():o.PinChangeActivity");
    }

    public final void close(ErrorCode errorCode2, IOException iOException) throws IOException {
        onGetStartedClick.write((Object) errorCode2, "rstStatusCode");
        if (closeInternal(errorCode2, iOException)) {
            this.connection.writeSynReset$okhttp(this.f3182id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        onGetStartedClick.write((Object) errorCode2, "errorCode");
        if (closeInternal(errorCode2, (IOException) null)) {
            this.connection.writeSynResetLater$okhttp(this.f3182id, errorCode2);
        }
    }

    private final boolean closeInternal(ErrorCode errorCode2, IOException iOException) {
        boolean holdsLock = Thread.holdsLock(this);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            synchronized (this) {
                if (this.errorCode != null) {
                    return false;
                }
                if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                    return false;
                }
                this.errorCode = errorCode2;
                this.errorException = iOException;
                notifyAll();
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                this.connection.removeStream$okhttp(this.f3182id);
                return true;
            }
        }
        throw new AssertionError("Assertion failed");
    }

    public final void receiveData(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, int i) throws IOException {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        boolean holdsLock = Thread.holdsLock(this);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            this.source.receive$okhttp(nsipPartnerPaymentOtpActivity, (long) i);
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void receiveHeaders(Headers headers, boolean z) {
        boolean isOpen;
        onGetStartedClick.write((Object) headers, "headers");
        boolean holdsLock = Thread.holdsLock(this);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            synchronized (this) {
                if (!this.hasResponseHeaders || !z) {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                } else {
                    this.source.setTrailers(headers);
                }
                if (z) {
                    this.source.setFinished$okhttp(true);
                }
                isOpen = isOpen();
                notifyAll();
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            if (!isOpen) {
                this.connection.removeStream$okhttp(this.f3182id);
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void receiveRstStream(ErrorCode errorCode2) {
        synchronized (this) {
            onGetStartedClick.write((Object) errorCode2, "errorCode");
            if (this.errorCode == null) {
                this.errorCode = errorCode2;
                notifyAll();
            }
        }
    }

    public final class FramingSource implements HowToAddAccountStep2Activity {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final SCBUniversalWebViewActivity readBuffer = new SCBUniversalWebViewActivity();
        private final SCBUniversalWebViewActivity receiveBuffer = new SCBUniversalWebViewActivity();
        private Headers trailers;

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final SCBUniversalWebViewActivity getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final SCBUniversalWebViewActivity getReadBuffer() {
            return this.readBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        /* JADX INFO: finally extract failed */
        public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
            long j2;
            boolean z;
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = sCBUniversalWebViewActivity;
            long j3 = j;
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity2, "sink");
            long j4 = 0;
            if (j3 >= 0) {
                while (true) {
                    IOException iOException = null;
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.getReadTimeout$okhttp().enter();
                        try {
                            if (Http2Stream.this.getErrorCode$okhttp() != null && (iOException = Http2Stream.this.getErrorException$okhttp()) == null) {
                                ErrorCode errorCode$okhttp = Http2Stream.this.getErrorCode$okhttp();
                                if (errorCode$okhttp == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                }
                                iOException = new StreamResetException(errorCode$okhttp);
                            }
                            if (!this.closed) {
                                if (this.readBuffer.read > j4) {
                                    j2 = this.readBuffer.read(sCBUniversalWebViewActivity2, Math.min(j3, this.readBuffer.read));
                                    Http2Stream http2Stream = Http2Stream.this;
                                    http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
                                    long readBytesTotal = Http2Stream.this.getReadBytesTotal() - Http2Stream.this.getReadBytesAcknowledged();
                                    if (iOException == null && readBytesTotal >= ((long) (Http2Stream.this.getConnection().getOkHttpSettings().getInitialWindowSize() / 2))) {
                                        Http2Stream.this.getConnection().writeWindowUpdateLater$okhttp(Http2Stream.this.getId(), readBytesTotal);
                                        Http2Stream.this.setReadBytesAcknowledged$okhttp(Http2Stream.this.getReadBytesTotal());
                                    }
                                } else if (this.finished || iOException != null) {
                                    j2 = -1;
                                } else {
                                    Http2Stream.this.waitForIo$okhttp();
                                    j2 = -1;
                                    z = true;
                                    Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                                }
                                z = false;
                                Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th) {
                            Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                            throw th;
                        }
                    }
                    if (z) {
                        j4 = 0;
                    } else if (j2 != -1) {
                        updateConnectionFlowControl(j2);
                        return j2;
                    } else if (iOException == null) {
                        return -1;
                    } else {
                        if (iOException == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        throw iOException;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j3);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }

        private final void updateConnectionFlowControl(long j) {
            boolean holdsLock = Thread.holdsLock(Http2Stream.this);
            if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        public final void receive$okhttp(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
            boolean holdsLock = Thread.holdsLock(Http2Stream.this);
            if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
                while (j > 0) {
                    synchronized (Http2Stream.this) {
                        z = this.finished;
                        z2 = false;
                        z3 = this.readBuffer.read + j > this.maxByteCount;
                        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                    if (z3) {
                        nsipPartnerPaymentOtpActivity.MediaBrowserCompat$MediaItem(j);
                        Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        nsipPartnerPaymentOtpActivity.MediaBrowserCompat$MediaItem(j);
                        return;
                    } else {
                        long read = nsipPartnerPaymentOtpActivity.read(this.receiveBuffer, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (Http2Stream.this) {
                                if (this.closed) {
                                    j2 = this.receiveBuffer.read;
                                    SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.receiveBuffer;
                                    sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(sCBUniversalWebViewActivity.read);
                                } else {
                                    if (this.readBuffer.read == 0) {
                                        z2 = true;
                                    }
                                    this.readBuffer.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountStep2Activity) this.receiveBuffer);
                                    if (z2) {
                                        Http2Stream http2Stream = Http2Stream.this;
                                        if (http2Stream != null) {
                                            http2Stream.notifyAll();
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                            }
                            if (j2 > 0) {
                                updateConnectionFlowControl(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        public final PinChangeActivity_ViewBinding timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }

        public final void close() throws IOException {
            long j;
            synchronized (Http2Stream.this) {
                this.closed = true;
                j = this.readBuffer.read;
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.readBuffer;
                sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(sCBUniversalWebViewActivity.read);
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream != null) {
                    http2Stream.notifyAll();
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean isOpen;
        boolean holdsLock = Thread.holdsLock(this);
        boolean z = true;
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
            synchronized (this) {
                if (!this.source.getFinished$okhttp() && this.source.getClosed$okhttp()) {
                    if (!this.sink.getFinished()) {
                        if (this.sink.getClosed()) {
                        }
                    }
                    isOpen = isOpen();
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
                z = false;
                isOpen = isOpen();
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            if (z) {
                close(ErrorCode.CANCEL, (IOException) null);
            } else if (!isOpen) {
                this.connection.removeStream$okhttp(this.f3182id);
            }
        } else {
            throw new AssertionError("Assertion failed");
        }
    }

    public final class FramingSink implements PinChangeActivity {
        private boolean closed;
        private boolean finished;
        private final SCBUniversalWebViewActivity sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new SCBUniversalWebViewActivity();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
            boolean holdsLock = Thread.holdsLock(Http2Stream.this);
            if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
                this.sendBuffer.write(sCBUniversalWebViewActivity, j);
                while (this.sendBuffer.read >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        /* JADX INFO: finally extract failed */
        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.getWriteTimeout$okhttp().enter();
                while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                    try {
                        Http2Stream.this.waitForIo$okhttp();
                    } catch (Throwable th) {
                        Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed$okhttp();
                min = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.read);
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z2 = z && min == this.sendBuffer.read && Http2Stream.this.getErrorCode$okhttp() == null;
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        public final void flush() throws IOException {
            boolean holdsLock = Thread.holdsLock(Http2Stream.this);
            if (!HmlBusinessOwnerDocumentSubmissionActivity.write || (!holdsLock)) {
                synchronized (Http2Stream.this) {
                    Http2Stream.this.checkOutNotClosed$okhttp();
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
                while (this.sendBuffer.read > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        public final PinChangeActivity_ViewBinding timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
            if (r9.this$0.getSink$okhttp().finished != false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
            if (r9.sendBuffer.read <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
            if (r9.trailers == null) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
            if (r4 == false) goto L_0x0078;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0057, code lost:
            if (r9.sendBuffer.read <= 0) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
            emitFrame(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
            r0 = r9.this$0.getConnection();
            r3 = r9.this$0.getId();
            r4 = r9.trailers;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
            if (r4 != null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
            r0.writeHeaders$okhttp(r3, r1, okhttp3.internal.Util.toHeaderList(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0078, code lost:
            if (r0 == false) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
            if (r9.sendBuffer.read <= 0) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
            if (r1 == false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
            r9.this$0.getConnection().writeData(r9.this$0.getId(), true, (p040o.SCBUniversalWebViewActivity) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
            r0 = r9.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            r9.closed = true;
            r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
            r9.this$0.getConnection().flush();
            r9.this$0.cancelStreamIfNecessary$okhttp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b1, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r9 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                boolean r1 = p040o.HmlBusinessOwnerDocumentSubmissionActivity.write
                r2 = 1
                if (r1 == 0) goto L_0x0019
                r0 = r0 ^ r2
                if (r0 == 0) goto L_0x000f
                goto L_0x0019
            L_0x000f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Assertion failed"
                r0.<init>(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x0019:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r9.closed     // Catch:{ all -> 0x00b5 }
                if (r1 == 0) goto L_0x0022
                monitor-exit(r0)
                return
            L_0x0022:
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x00b5 }
                okhttp3.internal.http2.ErrorCode r1 = r1.getErrorCode$okhttp()     // Catch:{ all -> 0x00b5 }
                r3 = 0
                if (r1 != 0) goto L_0x002d
                r1 = r2
                goto L_0x002e
            L_0x002d:
                r1 = r3
            L_0x002e:
                o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00b5 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink$okhttp()
                boolean r0 = r0.finished
                if (r0 != 0) goto L_0x009b
                o.SCBUniversalWebViewActivity r0 = r9.sendBuffer
                long r4 = r0.read
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r0 = r2
                goto L_0x0048
            L_0x0047:
                r0 = r3
            L_0x0048:
                okhttp3.Headers r4 = r9.trailers
                if (r4 == 0) goto L_0x004e
                r4 = r2
                goto L_0x004f
            L_0x004e:
                r4 = r3
            L_0x004f:
                if (r4 == 0) goto L_0x0078
            L_0x0051:
                o.SCBUniversalWebViewActivity r0 = r9.sendBuffer
                long r4 = r0.read
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x005d
                r9.emitFrame(r3)
                goto L_0x0051
            L_0x005d:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this
                int r3 = r3.getId()
                okhttp3.Headers r4 = r9.trailers
                if (r4 != 0) goto L_0x0070
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x0070:
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r0.writeHeaders$okhttp(r3, r1, r4)
                goto L_0x009b
            L_0x0078:
                if (r0 == 0) goto L_0x0086
            L_0x007a:
                o.SCBUniversalWebViewActivity r0 = r9.sendBuffer
                long r0 = r0.read
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x009b
                r9.emitFrame(r2)
                goto L_0x007a
            L_0x0086:
                if (r1 == 0) goto L_0x009b
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r3 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r4 = r0.getId()
                r5 = 1
                r6 = 0
                r7 = 0
                r3.writeData(r4, r5, r6, r7)
            L_0x009b:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r9.closed = r2     // Catch:{ all -> 0x00b2 }
                o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00b2 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary$okhttp()
                return
            L_0x00b2:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00b5:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        } else if (!this.sink.getFinished()) {
            ErrorCode errorCode2 = this.errorCode;
            if (errorCode2 != null) {
                Throwable th = this.errorException;
                if (th == null) {
                    if (errorCode2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    th = new StreamResetException(errorCode2);
                }
                throw th;
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    public final class StreamTimeout extends PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding {
        public StreamTimeout() {
        }

        public final void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }

        public final IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
