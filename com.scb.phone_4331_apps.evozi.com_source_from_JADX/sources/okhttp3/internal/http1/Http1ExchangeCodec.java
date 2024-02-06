package okhttp3.internal.http1;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import okhttp3.Address;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p040o.BasePersonalInfoActivity;
import p040o.GoodToKnowActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeActivity;
import p040o.PinChangeActivity_ViewBinding;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final int HEADER_LIMIT = 262144;
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    /* access modifiers changed from: private */
    public final OkHttpClient client;
    private long headerLimit = 262144;
    /* access modifiers changed from: private */
    public final RealConnection realConnection;
    /* access modifiers changed from: private */
    public final NsipPartnerPaymentReviewActivity sink;
    /* access modifiers changed from: private */
    public final NsipPartnerPaymentOtpActivity source;
    /* access modifiers changed from: private */
    public int state;
    /* access modifiers changed from: private */
    public Headers trailers;

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection2, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        this.client = okHttpClient;
        this.realConnection = realConnection2;
        this.source = nsipPartnerPaymentOtpActivity;
        this.sink = nsipPartnerPaymentReviewActivity;
    }

    private final boolean isChunked(Response response) {
        return GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final boolean isChunked(Request request) {
        return GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("chunked", request.header("Transfer-Encoding"), true);
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    public final RealConnection connection() {
        return this.realConnection;
    }

    public final PinChangeActivity createRequestBody(Request request, long j) {
        onGetStartedClick.write((Object) request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (isChunked(request)) {
            return newChunkedSink();
        } else {
            if (j != -1) {
                return newKnownLengthSink();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final void cancel() {
        RealConnection realConnection2 = this.realConnection;
        if (realConnection2 != null) {
            realConnection2.cancel();
        }
    }

    public final void writeRequestHeaders(Request request) {
        onGetStartedClick.write((Object) request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        RealConnection realConnection2 = this.realConnection;
        if (realConnection2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Proxy.Type type = realConnection2.route().proxy().type();
        onGetStartedClick.IconCompatParcelizer((Object) type, "realConnection!!.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    public final long reportedContentLength(Response response) {
        onGetStartedClick.write((Object) response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0;
        }
        if (isChunked(response)) {
            return -1;
        }
        return Util.headersContentLength(response);
    }

    public final HowToAddAccountStep2Activity openResponseBodySource(Response response) {
        onGetStartedClick.write((Object) response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    public final Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            return headers == null ? Util.EMPTY_HEADERS : headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void flushRequest() {
        this.sink.flush();
    }

    public final void finishRequest() {
        this.sink.flush();
    }

    public final void writeRequest(Headers headers, String str) {
        onGetStartedClick.write((Object) headers, "headers");
        onGetStartedClick.write((Object) str, "requestLine");
        if (this.state == 0) {
            this.sink.MediaBrowserCompat$CustomActionResultReceiver(str).MediaBrowserCompat$CustomActionResultReceiver("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.MediaBrowserCompat$CustomActionResultReceiver(headers.name(i)).MediaBrowserCompat$CustomActionResultReceiver(": ").MediaBrowserCompat$CustomActionResultReceiver(headers.value(i)).MediaBrowserCompat$CustomActionResultReceiver("\r\n");
            }
            this.sink.MediaBrowserCompat$CustomActionResultReceiver("\r\n");
            this.state = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final Response.Builder readResponseHeaders(boolean z) {
        String str;
        Route route;
        Address address;
        HttpUrl url;
        int i = this.state;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine parse = StatusLine.Companion.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                RealConnection realConnection2 = this.realConnection;
                if (realConnection2 == null || (route = realConnection2.route()) == null || (address = route.address()) == null || (url = address.url()) == null || (str = url.redact()) == null) {
                    str = "unknown";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(str);
                throw new IOException(sb.toString(), e);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.state);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    private final String readHeaderLine() {
        String IconCompatParcelizer = this.source.IconCompatParcelizer(this.headerLimit);
        this.headerLimit -= (long) IconCompatParcelizer.length();
        return IconCompatParcelizer;
    }

    /* access modifiers changed from: private */
    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        String readHeaderLine = readHeaderLine();
        while (true) {
            if (!(readHeaderLine.length() > 0)) {
                return builder.build();
            }
            builder.addLenient$okhttp(readHeaderLine);
            readHeaderLine = readHeaderLine();
        }
    }

    private final PinChangeActivity newChunkedSink() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new ChunkedSink();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString().toString());
    }

    private final PinChangeActivity newKnownLengthSink() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new KnownLengthSink();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString().toString());
    }

    private final HowToAddAccountStep2Activity newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString().toString());
    }

    private final HowToAddAccountStep2Activity newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString().toString());
    }

    private final HowToAddAccountStep2Activity newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            RealConnection realConnection2 = this.realConnection;
            if (realConnection2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            realConnection2.noNewExchanges();
            return new UnknownLengthSource();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final void skipConnectBody(Response response) {
        onGetStartedClick.write((Object) response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            HowToAddAccountStep2Activity newFixedLengthSource = newFixedLengthSource(headersContentLength);
            Util.skipAll(newFixedLengthSource, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
        }
    }

    final class KnownLengthSink implements PinChangeActivity {
        private boolean closed;
        private final BasePersonalInfoActivity timeout;

        public KnownLengthSink() {
            this.timeout = new BasePersonalInfoActivity(Http1ExchangeCodec.this.sink.timeout());
        }

        public final PinChangeActivity_ViewBinding timeout() {
            return this.timeout;
        }

        public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
            if (!this.closed) {
                Util.checkOffsetAndCount(sCBUniversalWebViewActivity.read, 0, j);
                Http1ExchangeCodec.this.sink.write(sCBUniversalWebViewActivity, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final void flush() {
            if (!this.closed) {
                Http1ExchangeCodec.this.sink.flush();
            }
        }

        public final void close() {
            if (!this.closed) {
                this.closed = true;
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 3;
            }
        }
    }

    final class ChunkedSink implements PinChangeActivity {
        private boolean closed;
        private final BasePersonalInfoActivity timeout;

        public ChunkedSink() {
            this.timeout = new BasePersonalInfoActivity(Http1ExchangeCodec.this.sink.timeout());
        }

        public final PinChangeActivity_ViewBinding timeout() {
            return this.timeout;
        }

        public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                Http1ExchangeCodec.this.sink.MediaSessionCompat$ResultReceiverWrapper(j);
                Http1ExchangeCodec.this.sink.MediaBrowserCompat$CustomActionResultReceiver("\r\n");
                Http1ExchangeCodec.this.sink.write(sCBUniversalWebViewActivity, j);
                Http1ExchangeCodec.this.sink.MediaBrowserCompat$CustomActionResultReceiver("\r\n");
            }
        }

        public final void flush() {
            synchronized (this) {
                if (!this.closed) {
                    Http1ExchangeCodec.this.sink.flush();
                }
            }
        }

        public final void close() {
            synchronized (this) {
                if (!this.closed) {
                    this.closed = true;
                    Http1ExchangeCodec.this.sink.MediaBrowserCompat$CustomActionResultReceiver("0\r\n\r\n");
                    Http1ExchangeCodec.this.detachTimeout(this.timeout);
                    Http1ExchangeCodec.this.state = 3;
                }
            }
        }
    }

    abstract class AbstractSource implements HowToAddAccountStep2Activity {
        private boolean closed;
        private final BasePersonalInfoActivity timeout;

        public AbstractSource() {
            this.timeout = new BasePersonalInfoActivity(Http1ExchangeCodec.this.source.timeout());
        }

        /* access modifiers changed from: protected */
        public final BasePersonalInfoActivity getTimeout() {
            return this.timeout;
        }

        /* access modifiers changed from: protected */
        public final boolean getClosed() {
            return this.closed;
        }

        /* access modifiers changed from: protected */
        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public PinChangeActivity_ViewBinding timeout() {
            return this.timeout;
        }

        public long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(sCBUniversalWebViewActivity, j);
            } catch (IOException e) {
                RealConnection access$getRealConnection$p = Http1ExchangeCodec.this.realConnection;
                if (access$getRealConnection$p == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                access$getRealConnection$p.noNewExchanges();
                responseBodyComplete$okhttp();
                throw e;
            }
        }

        public final void responseBodyComplete$okhttp() {
            if (Http1ExchangeCodec.this.state != 6) {
                if (Http1ExchangeCodec.this.state == 5) {
                    Http1ExchangeCodec.this.detachTimeout(this.timeout);
                    Http1ExchangeCodec.this.state = 6;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(Http1ExchangeCodec.this.state);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete$okhttp();
            }
        }

        public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (!getClosed()) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(sCBUniversalWebViewActivity, Math.min(j2, j));
                if (read == -1) {
                    RealConnection access$getRealConnection$p = Http1ExchangeCodec.this.realConnection;
                    if (access$getRealConnection$p == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    access$getRealConnection$p.noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete$okhttp();
                    throw protocolException;
                }
                long j3 = this.bytesRemaining - read;
                this.bytesRemaining = j3;
                if (j3 == 0) {
                    responseBodyComplete$okhttp();
                }
                return read;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void close() {
            if (!getClosed()) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    RealConnection access$getRealConnection$p = Http1ExchangeCodec.this.realConnection;
                    if (access$getRealConnection$p == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    access$getRealConnection$p.noNewExchanges();
                    responseBodyComplete$okhttp();
                }
                setClosed(true);
            }
        }
    }

    final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
        }

        public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(sCBUniversalWebViewActivity, Math.min(j, this.bytesRemainingInChunk));
                if (read == -1) {
                    RealConnection access$getRealConnection$p = this.this$0.realConnection;
                    if (access$getRealConnection$p == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    access$getRealConnection$p.noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete$okhttp();
                    throw protocolException;
                }
                this.bytesRemainingInChunk -= read;
                return read;
            }
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.Keep();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.MediaSessionCompat$QueueItem();
                String Keep = this.this$0.source.Keep();
                if (Keep != null) {
                    String obj = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(Keep).toString();
                    if (this.bytesRemainingInChunk >= 0) {
                        if (!(obj.length() > 0) || GoodToKnowActivity.read(obj, ";", false)) {
                            if (this.bytesRemainingInChunk == 0) {
                                this.hasMoreChunks = false;
                                Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                                http1ExchangeCodec.trailers = http1ExchangeCodec.readHeaders();
                                OkHttpClient access$getClient$p = this.this$0.client;
                                if (access$getClient$p == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                }
                                CookieJar cookieJar = access$getClient$p.cookieJar();
                                HttpUrl httpUrl = this.url;
                                Headers access$getTrailers$p = this.this$0.trailers;
                                if (access$getTrailers$p == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                }
                                HttpHeaders.receiveHeaders(cookieJar, httpUrl, access$getTrailers$p);
                                responseBodyComplete$okhttp();
                                return;
                            }
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions");
                    sb.append(" but was \"");
                    sb.append(this.bytesRemainingInChunk);
                    sb.append(obj);
                    sb.append('\"');
                    throw new ProtocolException(sb.toString());
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public final void close() {
            if (!getClosed()) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    RealConnection access$getRealConnection$p = this.this$0.realConnection;
                    if (access$getRealConnection$p == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    access$getRealConnection$p.noNewExchanges();
                    responseBodyComplete$okhttp();
                }
                setClosed(true);
            }
        }
    }

    final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(sCBUniversalWebViewActivity, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                responseBodyComplete$okhttp();
                return -1;
            }
        }

        public final void close() {
            if (!getClosed()) {
                if (!this.inputExhausted) {
                    responseBodyComplete$okhttp();
                }
                setClosed(true);
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

    /* access modifiers changed from: private */
    public final void detachTimeout(BasePersonalInfoActivity basePersonalInfoActivity) {
        PinChangeActivity_ViewBinding pinChangeActivity_ViewBinding = basePersonalInfoActivity.IconCompatParcelizer;
        PinChangeActivity_ViewBinding pinChangeActivity_ViewBinding2 = PinChangeActivity_ViewBinding.NONE;
        onGetStartedClick.write((Object) pinChangeActivity_ViewBinding2, "delegate");
        basePersonalInfoActivity.IconCompatParcelizer = pinChangeActivity_ViewBinding2;
        pinChangeActivity_ViewBinding.clearDeadline();
        pinChangeActivity_ViewBinding.clearTimeout();
    }
}
