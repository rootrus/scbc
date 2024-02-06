package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.p089ws.RealWebSocket;
import p040o.HowToAddAccountStep2Activity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PartnerLoginActivity;
import p040o.PayNowSuccessActivity;
import p040o.PinChangeActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class Exchange {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final Call call;
    private final ExchangeCodec codec;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean isDuplex;
    private final Transmitter transmitter;

    public Exchange(Transmitter transmitter2, Call call2, EventListener eventListener2, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        onGetStartedClick.write((Object) transmitter2, "transmitter");
        onGetStartedClick.write((Object) call2, "call");
        onGetStartedClick.write((Object) eventListener2, "eventListener");
        onGetStartedClick.write((Object) exchangeFinder, "finder");
        onGetStartedClick.write((Object) exchangeCodec, "codec");
        this.transmitter = transmitter2;
        this.call = call2;
        this.eventListener = eventListener2;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
    }

    public final Transmitter getTransmitter$okhttp() {
        return this.transmitter;
    }

    public final Call getCall$okhttp() {
        return this.call;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean isDuplex() {
        return this.isDuplex;
    }

    public final RealConnection connection() {
        return this.codec.connection();
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        onGetStartedClick.write((Object) request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final PinChangeActivity createRequestBody(Request request, boolean z) throws IOException {
        onGetStartedClick.write((Object) request, "request");
        this.isDuplex = z;
        RequestBody body = request.body();
        if (body == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        long contentLength = body.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength);
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Response.Builder readResponseHeaders(boolean z) throws IOException {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(z);
            if (readResponseHeaders != null) {
                readResponseHeaders.initExchange$okhttp(this);
            }
            return readResponseHeaders;
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersEnd(Response response) {
        onGetStartedClick.write((Object) response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        onGetStartedClick.write((Object) response, "response");
        try {
            this.eventListener.responseBodyStart(this.call);
            String header$default = Response.header$default(response, "Content-Type", (String) null, 2, (Object) null);
            long reportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(header$default, reportedContentLength, onSubmit.read((HowToAddAccountStep2Activity) new ResponseBodySource(this, this.codec.openResponseBodySource(response), reportedContentLength)));
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void timeoutEarlyExit() {
        this.transmitter.timeoutEarlyExit();
    }

    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.transmitter.timeoutEarlyExit();
        RealConnection connection = this.codec.connection();
        if (connection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return connection.newWebSocketStreams$okhttp(this);
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1, true, true, (IOException) null);
    }

    public final void noNewExchangesOnConnection() {
        RealConnection connection = this.codec.connection();
        if (connection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        connection.noNewExchanges();
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.transmitter.exchangeMessageDone$okhttp(this, true, true, null);
    }

    private final void trackFailure(IOException iOException) {
        this.finder.trackFailure();
        RealConnection connection = this.codec.connection();
        if (connection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        connection.trackFailure$okhttp(iOException);
    }

    public final <E extends IOException> E bodyComplete(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            trackFailure(e);
        }
        if (z2) {
            if (e != null) {
                this.eventListener.requestFailed(this.call, e);
            } else {
                this.eventListener.requestBodyEnd(this.call, j);
            }
        }
        if (z) {
            if (e != null) {
                this.eventListener.responseFailed(this.call, e);
            } else {
                this.eventListener.responseBodyEnd(this.call, j);
            }
        }
        return this.transmitter.exchangeMessageDone$okhttp(this, z2, z, e);
    }

    public final void noRequestBody() {
        this.transmitter.exchangeMessageDone$okhttp(this, true, false, null);
    }

    final class RequestBodySink extends PartnerLoginActivity {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, PinChangeActivity pinChangeActivity, long j) {
            super(pinChangeActivity);
            onGetStartedClick.write((Object) pinChangeActivity, "delegate");
            this.this$0 = exchange;
            this.contentLength = j;
        }

        public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
            if (!this.closed) {
                long j2 = this.contentLength;
                if (j2 == -1 || this.bytesReceived + j <= j2) {
                    try {
                        super.write(sCBUniversalWebViewActivity, j);
                        this.bytesReceived += j;
                    } catch (IOException e) {
                        throw complete(e);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected ");
                    sb.append(this.contentLength);
                    sb.append(" bytes but received ");
                    sb.append(this.bytesReceived + j);
                    throw new ProtocolException(sb.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw complete(e);
            }
        }

        public final void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                long j = this.contentLength;
                if (j == -1 || this.bytesReceived == j) {
                    try {
                        super.close();
                        complete((IOException) null);
                    } catch (IOException e) {
                        throw complete(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        private final <E extends IOException> E complete(E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return this.this$0.bodyComplete(this.bytesReceived, false, true, e);
        }
    }

    public final class ResponseBodySource extends PayNowSuccessActivity {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, HowToAddAccountStep2Activity howToAddAccountStep2Activity, long j) {
            super(howToAddAccountStep2Activity);
            onGetStartedClick.write((Object) howToAddAccountStep2Activity, "delegate");
            this.this$0 = exchange;
            this.contentLength = j;
            if (j == 0) {
                complete((IOException) null);
            }
        }

        public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
            if (!this.closed) {
                try {
                    long read = delegate().read(sCBUniversalWebViewActivity, j);
                    if (read == -1) {
                        complete((IOException) null);
                        return -1;
                    }
                    long j2 = this.bytesReceived + read;
                    if (this.contentLength != -1) {
                        if (j2 > this.contentLength) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected ");
                            sb.append(this.contentLength);
                            sb.append(" bytes but received ");
                            sb.append(j2);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.bytesReceived = j2;
                    if (j2 == this.contentLength) {
                        complete((IOException) null);
                    }
                    return read;
                } catch (IOException e) {
                    throw complete(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                try {
                    super.close();
                    complete((IOException) null);
                } catch (IOException e) {
                    throw complete(e);
                }
            }
        }

        public final <E extends IOException> E complete(E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return this.this$0.bodyComplete(this.bytesReceived, true, false, e);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Exchange get(Response response) {
            onGetStartedClick.write((Object) response, "response");
            return response.exchange();
        }
    }
}
