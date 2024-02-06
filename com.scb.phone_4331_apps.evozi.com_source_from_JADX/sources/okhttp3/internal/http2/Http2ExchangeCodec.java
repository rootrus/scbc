package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p040o.HowToAddAccountStep2Activity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeActivity;
import p040o.onGetStartedClick;

public final class Http2ExchangeCodec implements ExchangeCodec {
    private static final String CONNECTION = "connection";
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final String ENCODING = "encoding";
    private static final String HOST = "host";
    /* access modifiers changed from: private */
    public static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f3181TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    /* access modifiers changed from: private */
    public static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f3181TE, TRANSFER_ENCODING, ENCODING, UPGRADE);
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";

    /* renamed from: TE */
    private static final String f3181TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final Interceptor.Chain chain;
    private final Http2Connection connection;
    private final Protocol protocol;
    private final RealConnection realConnection;
    private volatile Http2Stream stream;

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection2, Interceptor.Chain chain2, Http2Connection http2Connection) {
        Protocol protocol2;
        onGetStartedClick.write((Object) okHttpClient, "client");
        onGetStartedClick.write((Object) realConnection2, "realConnection");
        onGetStartedClick.write((Object) chain2, "chain");
        onGetStartedClick.write((Object) http2Connection, CONNECTION);
        this.realConnection = realConnection2;
        this.chain = chain2;
        this.connection = http2Connection;
        if (okHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
        } else {
            protocol2 = Protocol.HTTP_2;
        }
        this.protocol = protocol2;
    }

    public final RealConnection connection() {
        return this.realConnection;
    }

    public final PinChangeActivity createRequestBody(Request request, long j) {
        onGetStartedClick.write((Object) request, "request");
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return http2Stream.getSink();
    }

    public final void writeRequestHeaders(Request request) {
        onGetStartedClick.write((Object) request, "request");
        if (this.stream == null) {
            this.stream = this.connection.newStream(Companion.http2HeadersList(request), request.body() != null);
            if (this.canceled) {
                Http2Stream http2Stream = this.stream;
                if (http2Stream == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                http2Stream.closeLater(ErrorCode.CANCEL);
                throw new IOException("Canceled");
            }
            Http2Stream http2Stream2 = this.stream;
            if (http2Stream2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            http2Stream2.readTimeout().timeout((long) this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
            Http2Stream http2Stream3 = this.stream;
            if (http2Stream3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            http2Stream3.writeTimeout().timeout((long) this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public final void flushRequest() {
        this.connection.flush();
    }

    public final void finishRequest() {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        http2Stream.getSink().close();
    }

    public final Response.Builder readResponseHeaders(boolean z) {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Response.Builder readHttp2HeadersList = Companion.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (!z || readHttp2HeadersList.getCode$okhttp() != 100) {
            return readHttp2HeadersList;
        }
        return null;
    }

    public final long reportedContentLength(Response response) {
        onGetStartedClick.write((Object) response, "response");
        return Util.headersContentLength(response);
    }

    public final HowToAddAccountStep2Activity openResponseBodySource(Response response) {
        onGetStartedClick.write((Object) response, "response");
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return http2Stream.getSource$okhttp();
    }

    public final Headers trailers() {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return http2Stream.trailers();
    }

    public final void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final List<Header> http2HeadersList(Request request) {
            onGetStartedClick.write((Object) request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String header = request.header("Host");
            if (header != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int i = 0;
            int size = headers.size();
            while (i < size) {
                String name = headers.name(i);
                Locale locale = Locale.US;
                onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.US");
                if (name != null) {
                    String lowerCase = name.toLowerCase(locale);
                    onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) lowerCase, (Object) Http2ExchangeCodec.f3181TE) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) headers.value(i), (Object) "trailers"))) {
                        arrayList.add(new Header(lowerCase, headers.value(i)));
                    }
                    i++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) {
            onGetStartedClick.write((Object) headers, "headerBlock");
            onGetStartedClick.write((Object) protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLine = null;
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) Header.RESPONSE_STATUS_UTF8)) {
                    StatusLine.Companion companion = StatusLine.Companion;
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP/1.1 ");
                    sb.append(value);
                    statusLine = companion.parse(sb.toString());
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }
}
