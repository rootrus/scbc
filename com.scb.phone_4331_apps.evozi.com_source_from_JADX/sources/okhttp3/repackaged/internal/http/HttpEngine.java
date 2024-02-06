package okhttp3.repackaged.internal.http;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.repackaged.Address;
import okhttp3.repackaged.CertificatePinner;
import okhttp3.repackaged.Connection;
import okhttp3.repackaged.Cookie;
import okhttp3.repackaged.CookieJar;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.HttpUrl;
import okhttp3.repackaged.Interceptor;
import okhttp3.repackaged.MediaType;
import okhttp3.repackaged.OkHttpClient;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.RequestBody;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.ResponseBody;
import okhttp3.repackaged.Route;
import okhttp3.repackaged.internal.Internal;
import okhttp3.repackaged.internal.InternalCache;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.Version;
import okhttp3.repackaged.internal.http.CacheStrategy;
import okhttp3.repackaged.internal.p090io.RealConnection;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.ModifyQuickPromptPayActivity;
import p040o.PinLoginActivity;
import p040o.QuickPromptPayActivity;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;
import p040o.onMenuQuickBalanceClick;

public final class HttpEngine {
    public static final int MAX_FOLLOW_UPS = 20;
    private static final ResponseBody ame = new ResponseBody() {
        public final long contentLength() {
            return 0;
        }

        public final MediaType contentType() {
            return null;
        }

        public final PinLoginActivity source() {
            return new onMenuPromptPayClick();
        }
    };
    private final Response aiH;
    long alw = -1;
    /* access modifiers changed from: private */
    public HttpStream amf;
    private boolean amg;
    private final Request amh;
    private Response ami;
    private QuickPromptPayActivity amj;
    private onLoginButtonClick amk;
    private final boolean aml;
    private CacheRequest amm;
    private CacheStrategy amn;
    public final boolean bufferRequestBody;
    private Response cacheResponse;
    final OkHttpClient client;
    private final boolean forWebSocket;
    /* access modifiers changed from: private */
    public Request networkRequest;
    public final StreamAllocation streamAllocation;

    public HttpEngine(OkHttpClient okHttpClient, Request request, boolean z, boolean z2, boolean z3, StreamAllocation streamAllocation2, RetryableSink retryableSink, Response response) {
        this.client = okHttpClient;
        this.amh = request;
        this.bufferRequestBody = z;
        this.aml = z2;
        this.forWebSocket = z3;
        this.streamAllocation = streamAllocation2 == null ? new StreamAllocation(okHttpClient.connectionPool(), m6127a(okHttpClient, request)) : streamAllocation2;
        this.amj = retryableSink;
        this.aiH = response;
    }

    public final void sendRequest() throws RequestException, RouteException, IOException {
        if (this.amn == null) {
            if (this.amf == null) {
                Request i = m6134i(this.amh);
                InternalCache internalCache = Internal.instance.internalCache(this.client);
                Response response = internalCache != null ? internalCache.get(i) : null;
                CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), i, response).get();
                this.amn = cacheStrategy;
                this.networkRequest = cacheStrategy.networkRequest;
                this.cacheResponse = this.amn.cacheResponse;
                if (internalCache != null) {
                    internalCache.trackResponse(this.amn);
                }
                if (response != null && this.cacheResponse == null) {
                    Util.closeQuietly((Closeable) response.body());
                }
                if (this.networkRequest == null && this.cacheResponse == null) {
                    this.ami = new Response.Builder().request(this.amh).priorResponse(m6135m(this.aiH)).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(ame).build();
                } else if (this.networkRequest == null) {
                    Response build = this.cacheResponse.newBuilder().request(this.amh).priorResponse(m6135m(this.aiH)).cacheResponse(m6135m(this.cacheResponse)).build();
                    this.ami = build;
                    this.ami = m6136n(build);
                } else {
                    try {
                        HttpStream uZ = m6138uZ();
                        this.amf = uZ;
                        uZ.setHttpEngine(this);
                        if (m6137uY()) {
                            long contentLength = OkHeaders.contentLength(i);
                            if (!this.bufferRequestBody) {
                                this.amf.writeRequestHeaders(this.networkRequest);
                                this.amj = this.amf.createRequestBody(this.networkRequest, contentLength);
                            } else if (contentLength > 2147483647L) {
                                throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                            } else if (contentLength != -1) {
                                this.amf.writeRequestHeaders(this.networkRequest);
                                this.amj = new RetryableSink((int) contentLength);
                            } else {
                                this.amj = new RetryableSink();
                            }
                        }
                    } catch (Throwable th) {
                        if (response != null) {
                            Util.closeQuietly((Closeable) response.body());
                        }
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: uY */
    private boolean m6137uY() {
        return this.aml && mo58849h(this.networkRequest) && this.amj == null;
    }

    /* renamed from: uZ */
    private HttpStream m6138uZ() throws RouteException, RequestException, IOException {
        return this.streamAllocation.newStream(this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis(), this.client.retryOnConnectionFailure(), !this.networkRequest.method().equals("GET"));
    }

    /* renamed from: m */
    private static Response m6135m(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body((ResponseBody) null).build();
    }

    public final void writingRequestHeaders() {
        if (this.alw == -1) {
            this.alw = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo58849h(Request request) {
        return HttpMethod.permitsRequestBody(request.method());
    }

    public final QuickPromptPayActivity getRequestBody() {
        if (this.amn != null) {
            return this.amj;
        }
        throw new IllegalStateException();
    }

    public final onLoginButtonClick getBufferedRequestBody() {
        onLoginButtonClick onloginbuttonclick = this.amk;
        if (onloginbuttonclick != null) {
            return onloginbuttonclick;
        }
        QuickPromptPayActivity requestBody = getRequestBody();
        if (requestBody == null) {
            return null;
        }
        onLoginButtonClick read = ModifyQuickBalanceActivity.read(requestBody);
        this.amk = read;
        return read;
    }

    public final boolean hasResponse() {
        return this.ami != null;
    }

    public final Request getRequest() {
        return this.amh;
    }

    public final Response getResponse() {
        Response response = this.ami;
        if (response != null) {
            return response;
        }
        throw new IllegalStateException();
    }

    public final Connection getConnection() {
        return this.streamAllocation.connection();
    }

    public final HttpEngine recover(IOException iOException, QuickPromptPayActivity quickPromptPayActivity) {
        if (!this.streamAllocation.recover(iOException, quickPromptPayActivity) || !this.client.retryOnConnectionFailure()) {
            return null;
        }
        return new HttpEngine(this.client, this.amh, this.bufferRequestBody, this.aml, this.forWebSocket, close(), (RetryableSink) quickPromptPayActivity, this.aiH);
    }

    public final HttpEngine recover(IOException iOException) {
        return recover(iOException, this.amj);
    }

    /* renamed from: va */
    private void m6139va() throws IOException {
        InternalCache internalCache = Internal.instance.internalCache(this.client);
        if (internalCache != null) {
            if (CacheStrategy.isCacheable(this.ami, this.networkRequest)) {
                this.amm = internalCache.put(m6135m(this.ami));
            } else if (HttpMethod.invalidatesCache(this.networkRequest.method())) {
                try {
                    internalCache.remove(this.networkRequest);
                } catch (IOException unused) {
                }
            }
        }
    }

    public final void releaseStreamAllocation() throws IOException {
        this.streamAllocation.release();
    }

    public final void cancel() {
        this.streamAllocation.cancel();
    }

    public final StreamAllocation close() {
        onLoginButtonClick onloginbuttonclick = this.amk;
        if (onloginbuttonclick != null) {
            Util.closeQuietly((Closeable) onloginbuttonclick);
        } else {
            QuickPromptPayActivity quickPromptPayActivity = this.amj;
            if (quickPromptPayActivity != null) {
                Util.closeQuietly((Closeable) quickPromptPayActivity);
            }
        }
        Response response = this.ami;
        if (response != null) {
            Util.closeQuietly((Closeable) response.body());
        } else {
            this.streamAllocation.connectionFailed((IOException) null);
        }
        return this.streamAllocation;
    }

    /* renamed from: n */
    private Response m6136n(Response response) throws IOException {
        if (!this.amg || !"gzip".equalsIgnoreCase(this.ami.header("Content-Encoding")) || response.body() == null) {
            return response;
        }
        onMenuQuickBalanceClick onmenuquickbalanceclick = new onMenuQuickBalanceClick(response.body().source());
        Headers build = response.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build();
        return response.newBuilder().headers(build).body(new RealResponseBody(build, ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountActivity) onmenuquickbalanceclick))).build();
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && OkHeaders.contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private Request m6134i(Request request) throws IOException {
        Request.Builder newBuilder = request.newBuilder();
        if (request.header("Host") == null) {
            newBuilder.header("Host", Util.hostHeader(request.url(), false));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null) {
            this.amg = true;
            newBuilder.header("Accept-Encoding", "gzip");
        }
        List<Cookie> loadForRequest = this.client.cookieJar().loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header(ServiceConstants.HEADER_COOKIE, m6141y(loadForRequest));
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", Version.userAgent());
        }
        return newBuilder.build();
    }

    /* renamed from: y */
    private String m6141y(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            Cookie cookie = list.get(i);
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void readResponse() throws java.io.IOException {
        /*
            r4 = this;
            okhttp3.repackaged.Response r0 = r4.ami
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            okhttp3.repackaged.Request r0 = r4.networkRequest
            if (r0 != 0) goto L_0x0016
            okhttp3.repackaged.Response r0 = r4.cacheResponse
            if (r0 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call sendRequest() first!"
            r0.<init>(r1)
            throw r0
        L_0x0016:
            okhttp3.repackaged.Request r0 = r4.networkRequest
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            boolean r1 = r4.forWebSocket
            if (r1 == 0) goto L_0x0026
            okhttp3.repackaged.internal.http.HttpStream r1 = r4.amf
            r1.writeRequestHeaders(r0)
            goto L_0x00a3
        L_0x0026:
            boolean r1 = r4.aml
            if (r1 != 0) goto L_0x0037
            okhttp3.repackaged.internal.http.HttpEngine$a r1 = new okhttp3.repackaged.internal.http.HttpEngine$a
            r2 = 0
            r1.<init>(r2, r0)
            okhttp3.repackaged.Request r0 = r4.networkRequest
            okhttp3.repackaged.Response r0 = r1.proceed(r0)
            goto L_0x00a7
        L_0x0037:
            o.onLoginButtonClick r0 = r4.amk
            if (r0 == 0) goto L_0x004c
            o.onMenuPromptPayClick r0 = r0.MediaBrowserCompat$ItemReceiver()
            long r0 = r0.IconCompatParcelizer
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            o.onLoginButtonClick r0 = r4.amk
            r0.write()
        L_0x004c:
            long r0 = r4.alw
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0087
            okhttp3.repackaged.Request r0 = r4.networkRequest
            long r0 = okhttp3.repackaged.internal.http.OkHeaders.contentLength((okhttp3.repackaged.Request) r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            o.QuickPromptPayActivity r0 = r4.amj
            boolean r1 = r0 instanceof okhttp3.repackaged.internal.http.RetryableSink
            if (r1 == 0) goto L_0x0080
            okhttp3.repackaged.internal.http.RetryableSink r0 = (okhttp3.repackaged.internal.http.RetryableSink) r0
            long r0 = r0.contentLength()
            okhttp3.repackaged.Request r2 = r4.networkRequest
            okhttp3.repackaged.Request$Builder r2 = r2.newBuilder()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r1 = "Content-Length"
            okhttp3.repackaged.Request$Builder r0 = r2.header(r1, r0)
            okhttp3.repackaged.Request r0 = r0.build()
            r4.networkRequest = r0
        L_0x0080:
            okhttp3.repackaged.internal.http.HttpStream r0 = r4.amf
            okhttp3.repackaged.Request r1 = r4.networkRequest
            r0.writeRequestHeaders(r1)
        L_0x0087:
            o.QuickPromptPayActivity r0 = r4.amj
            if (r0 == 0) goto L_0x00a3
            o.onLoginButtonClick r1 = r4.amk
            if (r1 == 0) goto L_0x0093
            r1.close()
            goto L_0x0096
        L_0x0093:
            r0.close()
        L_0x0096:
            o.QuickPromptPayActivity r0 = r4.amj
            boolean r1 = r0 instanceof okhttp3.repackaged.internal.http.RetryableSink
            if (r1 == 0) goto L_0x00a3
            okhttp3.repackaged.internal.http.HttpStream r1 = r4.amf
            okhttp3.repackaged.internal.http.RetryableSink r0 = (okhttp3.repackaged.internal.http.RetryableSink) r0
            r1.writeRequestBody(r0)
        L_0x00a3:
            okhttp3.repackaged.Response r0 = r4.m6140vb()
        L_0x00a7:
            okhttp3.repackaged.Headers r1 = r0.headers()
            r4.receiveHeaders(r1)
            okhttp3.repackaged.Response r1 = r4.cacheResponse
            if (r1 == 0) goto L_0x012a
            boolean r1 = m6132a((okhttp3.repackaged.Response) r1, (okhttp3.repackaged.Response) r0)
            if (r1 == 0) goto L_0x0121
            okhttp3.repackaged.Response r1 = r4.cacheResponse
            okhttp3.repackaged.Response$Builder r1 = r1.newBuilder()
            okhttp3.repackaged.Request r2 = r4.amh
            okhttp3.repackaged.Response$Builder r1 = r1.request(r2)
            okhttp3.repackaged.Response r2 = r4.aiH
            okhttp3.repackaged.Response r2 = m6135m(r2)
            okhttp3.repackaged.Response$Builder r1 = r1.priorResponse(r2)
            okhttp3.repackaged.Response r2 = r4.cacheResponse
            okhttp3.repackaged.Headers r2 = r2.headers()
            okhttp3.repackaged.Headers r3 = r0.headers()
            okhttp3.repackaged.Headers r2 = m6128a((okhttp3.repackaged.Headers) r2, (okhttp3.repackaged.Headers) r3)
            okhttp3.repackaged.Response$Builder r1 = r1.headers(r2)
            okhttp3.repackaged.Response r2 = r4.cacheResponse
            okhttp3.repackaged.Response r2 = m6135m(r2)
            okhttp3.repackaged.Response$Builder r1 = r1.cacheResponse(r2)
            okhttp3.repackaged.Response r2 = m6135m(r0)
            okhttp3.repackaged.Response$Builder r1 = r1.networkResponse(r2)
            okhttp3.repackaged.Response r1 = r1.build()
            r4.ami = r1
            okhttp3.repackaged.ResponseBody r0 = r0.body()
            r0.close()
            r4.releaseStreamAllocation()
            okhttp3.repackaged.internal.Internal r0 = okhttp3.repackaged.internal.Internal.instance
            okhttp3.repackaged.OkHttpClient r1 = r4.client
            okhttp3.repackaged.internal.InternalCache r0 = r0.internalCache(r1)
            r0.trackConditionalCacheHit()
            okhttp3.repackaged.Response r1 = r4.cacheResponse
            okhttp3.repackaged.Response r2 = r4.ami
            okhttp3.repackaged.Response r2 = m6135m(r2)
            r0.update(r1, r2)
            okhttp3.repackaged.Response r0 = r4.ami
            okhttp3.repackaged.Response r0 = r4.m6136n(r0)
            r4.ami = r0
            return
        L_0x0121:
            okhttp3.repackaged.Response r1 = r4.cacheResponse
            okhttp3.repackaged.ResponseBody r1 = r1.body()
            okhttp3.repackaged.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x012a:
            okhttp3.repackaged.Response$Builder r1 = r0.newBuilder()
            okhttp3.repackaged.Request r2 = r4.amh
            okhttp3.repackaged.Response$Builder r1 = r1.request(r2)
            okhttp3.repackaged.Response r2 = r4.aiH
            okhttp3.repackaged.Response r2 = m6135m(r2)
            okhttp3.repackaged.Response$Builder r1 = r1.priorResponse(r2)
            okhttp3.repackaged.Response r2 = r4.cacheResponse
            okhttp3.repackaged.Response r2 = m6135m(r2)
            okhttp3.repackaged.Response$Builder r1 = r1.cacheResponse(r2)
            okhttp3.repackaged.Response r0 = m6135m(r0)
            okhttp3.repackaged.Response$Builder r0 = r1.networkResponse(r0)
            okhttp3.repackaged.Response r0 = r0.build()
            r4.ami = r0
            boolean r0 = hasBody(r0)
            if (r0 == 0) goto L_0x016d
            r4.m6139va()
            okhttp3.repackaged.internal.http.CacheRequest r0 = r4.amm
            okhttp3.repackaged.Response r1 = r4.ami
            okhttp3.repackaged.Response r0 = r4.m6130a((okhttp3.repackaged.internal.http.CacheRequest) r0, (okhttp3.repackaged.Response) r1)
            okhttp3.repackaged.Response r0 = r4.m6136n(r0)
            r4.ami = r0
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.http.HttpEngine.readResponse():void");
    }

    /* renamed from: okhttp3.repackaged.internal.http.HttpEngine$a */
    class C10277a implements Interceptor.Chain {
        private final Request aix;
        private int ams;
        private final int index;

        C10277a(int i, Request request) {
            this.index = i;
            this.aix = request;
        }

        public Connection connection() {
            return HttpEngine.this.streamAllocation.connection();
        }

        public Request request() {
            return this.aix;
        }

        public Response proceed(Request request) throws IOException {
            this.ams++;
            if (this.index > 0) {
                Interceptor interceptor = HttpEngine.this.client.networkInterceptors().get(this.index - 1);
                Address address = connection().route().address();
                if (!request.url().host().equals(address.url().host()) || request.url().port() != address.url().port()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("network interceptor ");
                    sb.append(interceptor);
                    sb.append(" must retain the same host and port");
                    throw new IllegalStateException(sb.toString());
                } else if (this.ams > 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("network interceptor ");
                    sb2.append(interceptor);
                    sb2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            if (this.index < HttpEngine.this.client.networkInterceptors().size()) {
                C10277a aVar = new C10277a(this.index + 1, request);
                Interceptor interceptor2 = HttpEngine.this.client.networkInterceptors().get(this.index);
                Response intercept = interceptor2.intercept(aVar);
                if (aVar.ams != 1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("network interceptor ");
                    sb3.append(interceptor2);
                    sb3.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb3.toString());
                } else if (intercept != null) {
                    return intercept;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("network interceptor ");
                    sb4.append(interceptor2);
                    sb4.append(" returned null");
                    throw new NullPointerException(sb4.toString());
                }
            } else {
                HttpEngine.this.amf.writeRequestHeaders(request);
                Request unused = HttpEngine.this.networkRequest = request;
                if (HttpEngine.this.mo58849h(request) && request.body() != null) {
                    onLoginButtonClick read = ModifyQuickBalanceActivity.read(HttpEngine.this.amf.createRequestBody(request, request.body().contentLength()));
                    request.body().writeTo(read);
                    read.close();
                }
                Response b = HttpEngine.this.m6140vb();
                int code = b.code();
                if ((code != 204 && code != 205) || b.body().contentLength() <= 0) {
                    return b;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("HTTP ");
                sb5.append(code);
                sb5.append(" had non-zero Content-Length: ");
                sb5.append(b.body().contentLength());
                throw new ProtocolException(sb5.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: vb */
    public Response m6140vb() throws IOException {
        this.amf.finishRequest();
        Response build = this.amf.readResponseHeaders().request(this.networkRequest).handshake(this.streamAllocation.connection().handshake()).header(OkHeaders.SENT_MILLIS, Long.toString(this.alw)).header(OkHeaders.RECEIVED_MILLIS, Long.toString(System.currentTimeMillis())).build();
        if (!this.forWebSocket) {
            build = build.newBuilder().body(this.amf.openResponseBody(build)).build();
        }
        if ("close".equalsIgnoreCase(build.request().header("Connection")) || "close".equalsIgnoreCase(build.header("Connection"))) {
            this.streamAllocation.noNewStreams();
        }
        return build;
    }

    /* renamed from: a */
    private Response m6130a(final CacheRequest cacheRequest, Response response) throws IOException {
        QuickPromptPayActivity body;
        if (cacheRequest == null || (body = cacheRequest.body()) == null) {
            return response;
        }
        final PinLoginActivity source = response.body().source();
        final onLoginButtonClick read = ModifyQuickBalanceActivity.read(body);
        return response.newBuilder().body(new RealResponseBody(response.headers(), ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountActivity) new HowToAddAccountActivity() {
            boolean cacheRequestClosed;

            public long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                try {
                    long read = source.read(onmenupromptpayclick, j);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            read.close();
                        }
                        return -1;
                    }
                    onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(read.MediaBrowserCompat$ItemReceiver(), onmenupromptpayclick.IconCompatParcelizer - read, read);
                    read.IconCompatParcelizer();
                    return read;
                } catch (IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e;
                }
            }

            public ModifyQuickPromptPayActivity timeout() {
                return source.timeout();
            }

            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }
        }))).build();
    }

    /* renamed from: a */
    private static boolean m6132a(Response response, Response response2) {
        Date date;
        if (response2.code() == 304) {
            return true;
        }
        Date date2 = response.headers().getDate("Last-Modified");
        if (date2 == null || (date = response2.headers().getDate("Last-Modified")) == null || date.getTime() >= date2.getTime()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Headers m6128a(Headers headers, Headers headers2) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith(DiskLruCache.VERSION_1)) && (!OkHeaders.isEndToEnd(name) || headers2.get(name) == null)) {
                builder.add(name, value);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String name2 = headers2.name(i2);
            if (!"Content-Length".equalsIgnoreCase(name2) && OkHeaders.isEndToEnd(name2)) {
                builder.add(name2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    public final void receiveHeaders(Headers headers) throws IOException {
        if (this.client.cookieJar() != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.parseAll(this.amh.url(), headers);
            if (!parseAll.isEmpty()) {
                this.client.cookieJar().saveFromResponse(this.amh.url(), parseAll);
            }
        }
    }

    public final Request followUpRequest() throws IOException {
        String header;
        HttpUrl resolve;
        Proxy proxy;
        if (this.ami != null) {
            RealConnection connection = this.streamAllocation.connection();
            Route route = connection != null ? connection.route() : null;
            int code = this.ami.code();
            String method = this.amh.method();
            if (code != 307 && code != 308) {
                if (code != 401) {
                    if (code == 407) {
                        if (route != null) {
                            proxy = route.proxy();
                        } else {
                            proxy = this.client.proxy();
                        }
                        if (proxy.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else if (code != 408) {
                        switch (code) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else {
                        QuickPromptPayActivity quickPromptPayActivity = this.amj;
                        boolean z = quickPromptPayActivity == null || (quickPromptPayActivity instanceof RetryableSink);
                        if (!this.aml || z) {
                            return this.amh;
                        }
                        return null;
                    }
                }
                return this.client.authenticator().authenticate(route, this.ami);
            } else if (!method.equals("GET") && !method.equals("HEAD")) {
                return null;
            }
            if (!this.client.followRedirects() || (header = this.ami.header("Location")) == null || (resolve = this.amh.url().resolve(header)) == null) {
                return null;
            }
            if (!resolve.scheme().equals(this.amh.url().scheme()) && !this.client.followSslRedirects()) {
                return null;
            }
            Request.Builder newBuilder = this.amh.newBuilder();
            if (HttpMethod.permitsRequestBody(method)) {
                if (HttpMethod.redirectsToGet(method)) {
                    newBuilder.method("GET", (RequestBody) null);
                } else {
                    newBuilder.method(method, (RequestBody) null);
                }
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
            if (!sameConnection(resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        throw new IllegalStateException();
    }

    public final boolean sameConnection(HttpUrl httpUrl) {
        HttpUrl url = this.amh.url();
        return url.host().equals(httpUrl.host()) && url.port() == httpUrl.port() && url.scheme().equals(httpUrl.scheme());
    }

    /* renamed from: a */
    private static Address m6127a(OkHttpClient okHttpClient, Request request) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (request.isHttps()) {
            SSLSocketFactory sslSocketFactory = okHttpClient.sslSocketFactory();
            hostnameVerifier = okHttpClient.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = okHttpClient.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(request.url().host(), request.url().port(), okHttpClient.dns(), okHttpClient.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.proxyAuthenticator(), okHttpClient.proxy(), okHttpClient.protocols(), okHttpClient.connectionSpecs(), okHttpClient.proxySelector());
    }
}
