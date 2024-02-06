package okhttp3.repackaged.internal.huc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.repackaged.Cache;
import okhttp3.repackaged.Handshake;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.HttpUrl;
import okhttp3.repackaged.MediaType;
import okhttp3.repackaged.OkHttpClient;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.RequestBody;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.Route;
import okhttp3.repackaged.internal.Internal;
import okhttp3.repackaged.internal.JavaNetHeaders;
import okhttp3.repackaged.internal.Platform;
import okhttp3.repackaged.internal.URLFilter;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.Version;
import okhttp3.repackaged.internal.http.HttpDate;
import okhttp3.repackaged.internal.http.HttpEngine;
import okhttp3.repackaged.internal.http.HttpMethod;
import okhttp3.repackaged.internal.http.OkHeaders;
import okhttp3.repackaged.internal.http.RetryableSink;
import okhttp3.repackaged.internal.http.StatusLine;
import okhttp3.repackaged.internal.http.StreamAllocation;
import p040o.QuickPromptPayActivity;
import p040o.onLoginButtonClick;

public class HttpURLConnectionImpl extends HttpURLConnection {
    private static final Set<String> amJ = new LinkedHashSet(Arrays.asList(new String[]{"OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"}));
    private static final RequestBody amK = RequestBody.create((MediaType) null, new byte[0]);
    private Headers agY;
    Handshake agZ;
    private URLFilter aip;
    private Route amD;
    private Headers.Builder amL;
    private long amM;
    private int amN;
    OkHttpClient client;
    protected HttpEngine httpEngine;
    protected IOException httpEngineFailure;

    public HttpURLConnectionImpl(URL url, OkHttpClient okHttpClient) {
        super(url);
        this.amL = new Headers.Builder();
        this.amM = -1;
        this.client = okHttpClient;
    }

    public HttpURLConnectionImpl(URL url, OkHttpClient okHttpClient, URLFilter uRLFilter) {
        this(url, okHttpClient);
        this.aip = uRLFilter;
    }

    public final void connect() throws IOException {
        m6167vk();
        do {
        } while (!m6162C(false));
    }

    public final void disconnect() {
        HttpEngine httpEngine2 = this.httpEngine;
        if (httpEngine2 != null) {
            httpEngine2.cancel();
        }
    }

    public final InputStream getErrorStream() {
        try {
            HttpEngine vm = m6169vm();
            if (!HttpEngine.hasBody(vm.getResponse()) || vm.getResponse().code() < 400) {
                return null;
            }
            return vm.getResponse().body().byteStream();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: vj */
    private Headers m6166vj() throws IOException {
        if (this.agY == null) {
            Response response = m6169vm().getResponse();
            this.agY = response.headers().newBuilder().add(OkHeaders.SELECTED_PROTOCOL, response.protocol().toString()).add(OkHeaders.RESPONSE_SOURCE, m6165p(response)).build();
        }
        return this.agY;
    }

    /* renamed from: p */
    private static String m6165p(Response response) {
        if (response.networkResponse() == null) {
            if (response.cacheResponse() == null) {
                return "NONE";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CACHE ");
            sb.append(response.code());
            return sb.toString();
        } else if (response.cacheResponse() == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NETWORK ");
            sb2.append(response.code());
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CONDITIONAL_CACHE ");
            sb3.append(response.networkResponse().code());
            return sb3.toString();
        }
    }

    public final String getHeaderField(int i) {
        try {
            Headers vj = m6166vj();
            if (i < 0) {
                return null;
            }
            if (i >= vj.size()) {
                return null;
            }
            return vj.value(i);
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getHeaderField(String str) {
        if (str != null) {
            return m6166vj().get(str);
        }
        try {
            return StatusLine.get(m6169vm().getResponse()).toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getHeaderFieldKey(int i) {
        try {
            Headers vj = m6166vj();
            if (i < 0) {
                return null;
            }
            if (i >= vj.size()) {
                return null;
            }
            return vj.name(i);
        } catch (IOException unused) {
            return null;
        }
    }

    public final Map<String, List<String>> getHeaderFields() {
        try {
            return JavaNetHeaders.toMultimap(m6166vj(), StatusLine.get(m6169vm().getResponse()).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public final Map<String, List<String>> getRequestProperties() {
        if (!this.connected) {
            return JavaNetHeaders.toMultimap(this.amL.build(), (String) null);
        }
        throw new IllegalStateException("Cannot access request header fields after connection is set");
    }

    public final InputStream getInputStream() throws IOException {
        if (this.doInput) {
            HttpEngine vm = m6169vm();
            if (getResponseCode() < 400) {
                return vm.getResponse().body().byteStream();
            }
            throw new FileNotFoundException(this.url.toString());
        }
        throw new ProtocolException("This protocol does not support input");
    }

    public final OutputStream getOutputStream() throws IOException {
        connect();
        onLoginButtonClick bufferedRequestBody = this.httpEngine.getBufferedRequestBody();
        if (bufferedRequestBody == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("method does not support a request body: ");
            sb.append(this.method);
            throw new ProtocolException(sb.toString());
        } else if (!this.httpEngine.hasResponse()) {
            return bufferedRequestBody.RatingCompat();
        } else {
            throw new ProtocolException("cannot write request body after response has been read");
        }
    }

    public final Permission getPermission() throws IOException {
        int i;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            i = url.getPort();
        } else {
            i = HttpUrl.defaultPort(url.getProtocol());
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.client.proxy().address();
            host = inetSocketAddress.getHostName();
            i = inetSocketAddress.getPort();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(host);
        sb.append(":");
        sb.append(i);
        return new SocketPermission(sb.toString(), "connect, resolve");
    }

    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.amL.get(str);
    }

    public void setConnectTimeout(int i) {
        this.client = this.client.newBuilder().connectTimeout((long) i, TimeUnit.MILLISECONDS).build();
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.client = this.client.newBuilder().followRedirects(z).build();
    }

    public boolean getInstanceFollowRedirects() {
        return this.client.followRedirects();
    }

    public int getConnectTimeout() {
        return this.client.connectTimeoutMillis();
    }

    public void setReadTimeout(int i) {
        this.client = this.client.newBuilder().readTimeout((long) i, TimeUnit.MILLISECONDS).build();
    }

    public int getReadTimeout() {
        return this.client.readTimeoutMillis();
    }

    /* renamed from: vk */
    private void m6167vk() throws IOException {
        IOException iOException = this.httpEngineFailure;
        if (iOException != null) {
            throw iOException;
        } else if (this.httpEngine == null) {
            this.connected = true;
            try {
                if (this.doOutput) {
                    if (this.method.equals("GET")) {
                        this.method = "POST";
                    } else if (!HttpMethod.permitsRequestBody(this.method)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.method);
                        sb.append(" does not support writing");
                        throw new ProtocolException(sb.toString());
                    }
                }
                this.httpEngine = m6163a(this.method, (StreamAllocation) null, (RetryableSink) null, (Response) null);
            } catch (IOException e) {
                this.httpEngineFailure = e;
                throw e;
            }
        }
    }

    /* renamed from: a */
    private HttpEngine m6163a(String str, StreamAllocation streamAllocation, RetryableSink retryableSink, Response response) throws MalformedURLException, UnknownHostException {
        Request.Builder method = new Request.Builder().url(Internal.instance.getHttpUrlChecked(getURL().toString())).method(str, HttpMethod.requiresRequestBody(str) ? amK : null);
        Headers build = this.amL.build();
        int size = build.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            method.addHeader(build.name(i), build.value(i));
        }
        if (HttpMethod.permitsRequestBody(str)) {
            long j = this.amM;
            if (j != -1) {
                method.header("Content-Length", Long.toString(j));
            } else if (this.chunkLength > 0) {
                method.header("Transfer-Encoding", "chunked");
            } else {
                z = true;
            }
            if (build.get("Content-Type") == null) {
                method.header("Content-Type", "application/x-www-form-urlencoded");
            }
        }
        boolean z2 = z;
        if (build.get("User-Agent") == null) {
            method.header("User-Agent", m6168vl());
        }
        Request build2 = method.build();
        OkHttpClient okHttpClient = this.client;
        if (Internal.instance.internalCache(okHttpClient) != null && !getUseCaches()) {
            okHttpClient = this.client.newBuilder().cache((Cache) null).build();
        }
        return new HttpEngine(okHttpClient, build2, z2, true, false, streamAllocation, retryableSink, response);
    }

    /* renamed from: vl */
    private String m6168vl() {
        String property = System.getProperty("http.agent");
        return property != null ? Util.toHumanReadableAscii(property) : Version.userAgent();
    }

    /* renamed from: vm */
    private HttpEngine m6169vm() throws IOException {
        m6167vk();
        if (this.httpEngine.hasResponse()) {
            return this.httpEngine;
        }
        while (true) {
            if (m6162C(true)) {
                Response response = this.httpEngine.getResponse();
                Request followUpRequest = this.httpEngine.followUpRequest();
                if (followUpRequest == null) {
                    this.httpEngine.releaseStreamAllocation();
                    return this.httpEngine;
                }
                int i = this.amN + 1;
                this.amN = i;
                if (i <= 20) {
                    this.url = followUpRequest.url().url();
                    this.amL = followUpRequest.headers().newBuilder();
                    QuickPromptPayActivity requestBody = this.httpEngine.getRequestBody();
                    StreamAllocation streamAllocation = null;
                    if (!followUpRequest.method().equals(this.method)) {
                        requestBody = null;
                    }
                    if (requestBody == null || (requestBody instanceof RetryableSink)) {
                        StreamAllocation close = this.httpEngine.close();
                        if (!this.httpEngine.sameConnection(followUpRequest.url())) {
                            close.release();
                        } else {
                            streamAllocation = close;
                        }
                        this.httpEngine = m6163a(followUpRequest.method(), streamAllocation, (RetryableSink) requestBody, response);
                    } else {
                        throw new HttpRetryException("Cannot retry streamed HTTP body", this.responseCode);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Too many follow-up requests: ");
                    sb.append(this.amN);
                    throw new ProtocolException(sb.toString());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m6162C(boolean r5) throws java.io.IOException {
        /*
            r4 = this;
            okhttp3.repackaged.internal.URLFilter r0 = r4.aip
            if (r0 == 0) goto L_0x0015
            okhttp3.repackaged.internal.http.HttpEngine r1 = r4.httpEngine
            okhttp3.repackaged.Request r1 = r1.getRequest()
            okhttp3.repackaged.HttpUrl r1 = r1.url()
            java.net.URL r1 = r1.url()
            r0.checkURLPermitted(r1)
        L_0x0015:
            r0 = 1
            r1 = 0
            okhttp3.repackaged.internal.http.HttpEngine r2 = r4.httpEngine     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            r2.sendRequest()     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            okhttp3.repackaged.internal.http.HttpEngine r2 = r4.httpEngine     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            okhttp3.repackaged.Connection r2 = r2.getConnection()     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            if (r2 == 0) goto L_0x0031
            okhttp3.repackaged.Route r3 = r2.route()     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            r4.amD = r3     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            okhttp3.repackaged.Handshake r2 = r2.handshake()     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            r4.agZ = r2     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            goto L_0x0036
        L_0x0031:
            r2 = 0
            r4.amD = r2     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            r4.agZ = r2     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
        L_0x0036:
            if (r5 == 0) goto L_0x003d
            okhttp3.repackaged.internal.http.HttpEngine r5 = r4.httpEngine     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
            r5.readResponse()     // Catch:{ RequestException -> 0x006a, RouteException -> 0x0051, IOException -> 0x0040 }
        L_0x003d:
            return r0
        L_0x003e:
            r5 = move-exception
            goto L_0x0072
        L_0x0040:
            r5 = move-exception
            okhttp3.repackaged.internal.http.HttpEngine r2 = r4.httpEngine     // Catch:{ all -> 0x003e }
            okhttp3.repackaged.internal.http.HttpEngine r2 = r2.recover(r5)     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x004e
            r4.httpEngine = r2     // Catch:{ all -> 0x004c }
            return r1
        L_0x004c:
            r5 = move-exception
            goto L_0x0061
        L_0x004e:
            r4.httpEngineFailure = r5     // Catch:{ all -> 0x003e }
            throw r5     // Catch:{ all -> 0x003e }
        L_0x0051:
            r5 = move-exception
            okhttp3.repackaged.internal.http.HttpEngine r2 = r4.httpEngine     // Catch:{ all -> 0x003e }
            java.io.IOException r3 = r5.getLastConnectException()     // Catch:{ all -> 0x003e }
            okhttp3.repackaged.internal.http.HttpEngine r2 = r2.recover(r3)     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0063
            r4.httpEngine = r2     // Catch:{ all -> 0x004c }
            return r1
        L_0x0061:
            r0 = r1
            goto L_0x0072
        L_0x0063:
            java.io.IOException r5 = r5.getLastConnectException()     // Catch:{ all -> 0x003e }
            r4.httpEngineFailure = r5     // Catch:{ all -> 0x003e }
            throw r5     // Catch:{ all -> 0x003e }
        L_0x006a:
            r5 = move-exception
            java.io.IOException r5 = r5.getCause()     // Catch:{ all -> 0x003e }
            r4.httpEngineFailure = r5     // Catch:{ all -> 0x003e }
            throw r5     // Catch:{ all -> 0x003e }
        L_0x0072:
            if (r0 == 0) goto L_0x007d
            okhttp3.repackaged.internal.http.HttpEngine r0 = r4.httpEngine
            okhttp3.repackaged.internal.http.StreamAllocation r0 = r0.close()
            r0.release()
        L_0x007d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.huc.HttpURLConnectionImpl.m6162C(boolean):boolean");
    }

    public final boolean usingProxy() {
        Proxy proxy;
        Route route = this.amD;
        if (route != null) {
            proxy = route.proxy();
        } else {
            proxy = this.client.proxy();
        }
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    public String getResponseMessage() throws IOException {
        return m6169vm().getResponse().message();
    }

    public final int getResponseCode() throws IOException {
        return m6169vm().getResponse().code();
    }

    public final void setRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            Platform platform = Platform.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            platform.logW(sb.toString());
        } else if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
            m6164f(str2, false);
        } else {
            this.amL.set(str, str2);
        }
    }

    public void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        if (this.ifModifiedSince != 0) {
            this.amL.set("If-Modified-Since", HttpDate.format(new Date(this.ifModifiedSince)));
        } else {
            this.amL.removeAll("If-Modified-Since");
        }
    }

    public final void addRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            Platform platform = Platform.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            platform.logW(sb.toString());
        } else if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
            m6164f(str2, true);
        } else {
            this.amL.add(str, str2);
        }
    }

    /* renamed from: f */
    private void m6164f(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(this.client.protocols());
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        int i = 0;
        while (i < length) {
            try {
                arrayList.add(Protocol.get(split[i]));
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.client = this.client.newBuilder().protocols(arrayList).build();
    }

    public void setRequestMethod(String str) throws ProtocolException {
        if (amJ.contains(str)) {
            this.method = str;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected one of ");
        sb.append(amJ);
        sb.append(" but was ");
        sb.append(str);
        throw new ProtocolException(sb.toString());
    }

    public void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode((long) i);
    }

    public void setFixedLengthStreamingMode(long j) {
        if (this.connected) {
            throw new IllegalStateException("Already connected");
        } else if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        } else if (j >= 0) {
            this.amM = j;
            this.fixedContentLength = (int) Math.min(j, 2147483647L);
        } else {
            throw new IllegalArgumentException("contentLength < 0");
        }
    }
}
