package okhttp3.repackaged.internal.http;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.ResponseBody;
import okhttp3.repackaged.internal.Internal;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.p090io.RealConnection;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.ModifyQuickPromptPayActivity;
import p040o.PinLoginActivity;
import p040o.QuickOperationSuccessActivity;
import p040o.QuickPromptPayActivity;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;

public final class Http1xStream implements HttpStream {
    private static final int STATE_IDLE = 0;
    private static final int alA = 1;
    private static final int alB = 2;
    private static final int alC = 3;
    private static final int alD = 4;
    private static final int alE = 5;
    private static final int alF = 6;
    private HttpEngine httpEngine;
    /* access modifiers changed from: private */
    public final onLoginButtonClick sink;
    /* access modifiers changed from: private */
    public final PinLoginActivity source;
    /* access modifiers changed from: private */
    public int state = 0;
    /* access modifiers changed from: private */
    public final StreamAllocation streamAllocation;

    public Http1xStream(StreamAllocation streamAllocation2, PinLoginActivity pinLoginActivity, onLoginButtonClick onloginbuttonclick) {
        this.streamAllocation = streamAllocation2;
        this.source = pinLoginActivity;
        this.sink = onloginbuttonclick;
    }

    public final void setHttpEngine(HttpEngine httpEngine2) {
        this.httpEngine = httpEngine2;
    }

    public final QuickPromptPayActivity createRequestBody(Request request, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        this.httpEngine.writingRequestHeaders();
        writeRequest(request.headers(), RequestLine.m6145a(request, this.httpEngine.getConnection().route().proxy().type()));
    }

    public final Response.Builder readResponseHeaders() throws IOException {
        return readResponse();
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        return new RealResponseBody(response.headers(), ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(m6122l(response)));
    }

    /* renamed from: l */
    private HowToAddAccountActivity m6122l(Response response) throws IOException {
        if (!HttpEngine.hasBody(response)) {
            return newFixedLengthSource(0);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return newChunkedSource(this.httpEngine);
        }
        long contentLength = OkHeaders.contentLength(response);
        if (contentLength != -1) {
            return newFixedLengthSource(contentLength);
        }
        return newUnknownLengthSource();
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    public final void finishRequest() throws IOException {
        this.sink.flush();
    }

    public final void writeRequest(Headers headers, String str) throws IOException {
        if (this.state == 0) {
            this.sink.IconCompatParcelizer(str).IconCompatParcelizer("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.IconCompatParcelizer(headers.name(i)).IconCompatParcelizer(": ").IconCompatParcelizer(headers.value(i)).IconCompatParcelizer("\r\n");
            }
            this.sink.IconCompatParcelizer("\r\n");
            this.state = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final Response.Builder readResponse() throws IOException {
        StatusLine parse;
        Response.Builder headers;
        int i = this.state;
        if (i == 1 || i == 3) {
            do {
                try {
                    parse = StatusLine.parse(this.source.PlaybackStateCompat$CustomAction());
                    headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                } catch (EOFException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected end of stream on ");
                    sb.append(this.streamAllocation);
                    IOException iOException = new IOException(sb.toString());
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (parse.code == 100);
            this.state = 4;
            return headers;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("state: ");
        sb2.append(this.state);
        throw new IllegalStateException(sb2.toString());
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String PlaybackStateCompat$CustomAction = this.source.PlaybackStateCompat$CustomAction();
            if (PlaybackStateCompat$CustomAction.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, PlaybackStateCompat$CustomAction);
        }
    }

    public final QuickPromptPayActivity newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new C10268b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final QuickPromptPayActivity newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new C10270d(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final void writeRequestBody(RetryableSink retryableSink) throws IOException {
        if (this.state == 1) {
            this.state = 3;
            retryableSink.writeToSocket(this.sink);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final HowToAddAccountActivity newFixedLengthSource(long j) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new C10271e(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final HowToAddAccountActivity newChunkedSource(HttpEngine httpEngine2) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new C10269c(httpEngine2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final HowToAddAccountActivity newUnknownLengthSource() throws IOException {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new C10272f();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: okhttp3.repackaged.internal.http.Http1xStream$d */
    final class C10270d implements QuickPromptPayActivity {
        private final QuickOperationSuccessActivity alG;
        private long alL;
        private boolean closed;

        private C10270d(long j) {
            this.alG = new QuickOperationSuccessActivity(Http1xStream.this.sink.timeout());
            this.alL = j;
        }

        public final ModifyQuickPromptPayActivity timeout() {
            return this.alG;
        }

        public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            if (!this.closed) {
                Util.checkOffsetAndCount(onmenupromptpayclick.IconCompatParcelizer, 0, j);
                if (j <= this.alL) {
                    Http1xStream.this.sink.write(onmenupromptpayclick, j);
                    this.alL -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expected ");
                sb.append(this.alL);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }

        public final void flush() throws IOException {
            if (!this.closed) {
                Http1xStream.this.sink.flush();
            }
        }

        public final void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                if (this.alL <= 0) {
                    Http1xStream.this.m6117a(this.alG);
                    int unused = Http1xStream.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.http.Http1xStream$b */
    final class C10268b implements QuickPromptPayActivity {
        private final QuickOperationSuccessActivity alG;
        private boolean closed;

        private C10268b() {
            this.alG = new QuickOperationSuccessActivity(Http1xStream.this.sink.timeout());
        }

        public final ModifyQuickPromptPayActivity timeout() {
            return this.alG;
        }

        public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1xStream.this.sink.ParcelableVolumeInfo(j);
                Http1xStream.this.sink.IconCompatParcelizer("\r\n");
                Http1xStream.this.sink.write(onmenupromptpayclick, j);
                Http1xStream.this.sink.IconCompatParcelizer("\r\n");
            }
        }

        public final void flush() throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    Http1xStream.this.sink.flush();
                }
            }
        }

        public final void close() throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    this.closed = true;
                    Http1xStream.this.sink.IconCompatParcelizer("0\r\n\r\n");
                    Http1xStream.this.m6117a(this.alG);
                    int unused = Http1xStream.this.state = 3;
                }
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.http.Http1xStream$a */
    abstract class C10267a implements HowToAddAccountActivity {
        protected final QuickOperationSuccessActivity alG;
        protected boolean closed;

        private C10267a() {
            this.alG = new QuickOperationSuccessActivity(Http1xStream.this.source.timeout());
        }

        public ModifyQuickPromptPayActivity timeout() {
            return this.alG;
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public final void mo58839B(boolean z) throws IOException {
            if (Http1xStream.this.state != 6) {
                if (Http1xStream.this.state == 5) {
                    Http1xStream.this.m6117a(this.alG);
                    int unused = Http1xStream.this.state = 6;
                    if (Http1xStream.this.streamAllocation != null) {
                        Http1xStream.this.streamAllocation.streamFinished(!z, Http1xStream.this);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(Http1xStream.this.state);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.http.Http1xStream$e */
    class C10271e extends C10267a {
        private long alL;

        public C10271e(long j) throws IOException {
            super();
            this.alL = j;
            if (j == 0) {
                mo58839B(true);
            }
        }

        public long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.alL == 0) {
                return -1;
            } else {
                long read = Http1xStream.this.source.read(onmenupromptpayclick, Math.min(this.alL, j));
                if (read != -1) {
                    long j2 = this.alL - read;
                    this.alL = j2;
                    if (j2 == 0) {
                        mo58839B(true);
                    }
                    return read;
                }
                mo58839B(false);
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() throws IOException {
            if (!this.closed) {
                if (this.alL != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    mo58839B(false);
                }
                this.closed = true;
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.http.Http1xStream$c */
    class C10269c extends C10267a {
        private static final long alI = -1;
        private long alJ = -1;
        private boolean alK = true;
        private final HttpEngine httpEngine;

        C10269c(HttpEngine httpEngine2) throws IOException {
            super();
            this.httpEngine = httpEngine2;
        }

        public long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.alK) {
                return -1;
            } else {
                long j2 = this.alJ;
                if (j2 == 0 || j2 == -1) {
                    m6124uX();
                    if (!this.alK) {
                        return -1;
                    }
                }
                long read = Http1xStream.this.source.read(onmenupromptpayclick, Math.min(j, this.alJ));
                if (read != -1) {
                    this.alJ -= read;
                    return read;
                }
                mo58839B(false);
                throw new ProtocolException("unexpected end of stream");
            }
        }

        /* renamed from: uX */
        private void m6124uX() throws IOException {
            if (this.alJ != -1) {
                Http1xStream.this.source.PlaybackStateCompat$CustomAction();
            }
            try {
                this.alJ = Http1xStream.this.source.MediaSessionCompat$ResultReceiverWrapper();
                String trim = Http1xStream.this.source.PlaybackStateCompat$CustomAction().trim();
                if (this.alJ < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions but was \"");
                    sb.append(this.alJ);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.alJ == 0) {
                    this.alK = false;
                    this.httpEngine.receiveHeaders(Http1xStream.this.readHeaders());
                    mo58839B(true);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.closed) {
                if (this.alK && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    mo58839B(false);
                }
                this.closed = true;
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.http.Http1xStream$f */
    class C10272f extends C10267a {
        private boolean alM;

        private C10272f() {
            super();
        }

        public long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.alM) {
                return -1;
            } else {
                long read = Http1xStream.this.source.read(onmenupromptpayclick, j);
                if (read != -1) {
                    return read;
                }
                this.alM = true;
                mo58839B(true);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.closed) {
                if (!this.alM) {
                    mo58839B(false);
                }
                this.closed = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6117a(QuickOperationSuccessActivity quickOperationSuccessActivity) {
        ModifyQuickPromptPayActivity modifyQuickPromptPayActivity = quickOperationSuccessActivity.write;
        ModifyQuickPromptPayActivity modifyQuickPromptPayActivity2 = ModifyQuickPromptPayActivity.NONE;
        if (modifyQuickPromptPayActivity2 != null) {
            quickOperationSuccessActivity.write = modifyQuickPromptPayActivity2;
            modifyQuickPromptPayActivity.clearDeadline();
            modifyQuickPromptPayActivity.clearTimeout();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
