package okhttp3.internal.http;

import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Transmitter;
import p040o.LifestyleCustomizationActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        onGetStartedClick.write((Object) okHttpClient, "client");
        this.client = okHttpClient;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        r1.exchangeDoneDueToException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r6 = r0.connection();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "chain"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            okhttp3.Request r0 = r9.request()
            okhttp3.internal.http.RealInterceptorChain r9 = (okhttp3.internal.http.RealInterceptorChain) r9
            okhttp3.internal.connection.Transmitter r1 = r9.transmitter()
            r2 = 0
            r3 = 0
            r5 = r2
            r4 = r3
        L_0x0013:
            r1.prepareToConnect(r0)
            boolean r6 = r1.isCanceled()
            if (r6 != 0) goto L_0x00cf
            okhttp3.Response r0 = r9.proceed(r0, r1, r3)     // Catch:{ RouteException -> 0x00b4, IOException -> 0x00a5 }
            if (r4 == 0) goto L_0x003a
            okhttp3.Response$Builder r0 = r0.newBuilder()
            okhttp3.Response$Builder r4 = r4.newBuilder()
            okhttp3.Response$Builder r4 = r4.body(r3)
            okhttp3.Response r4 = r4.build()
            okhttp3.Response$Builder r0 = r0.priorResponse(r4)
            okhttp3.Response r0 = r0.build()
        L_0x003a:
            r4 = r0
            okhttp3.internal.connection.Exchange r0 = r4.exchange()
            if (r0 == 0) goto L_0x004c
            okhttp3.internal.connection.RealConnection r6 = r0.connection()
            if (r6 == 0) goto L_0x004c
            okhttp3.Route r6 = r6.route()
            goto L_0x004d
        L_0x004c:
            r6 = r3
        L_0x004d:
            okhttp3.Request r6 = r8.followUpRequest(r4, r6)
            if (r6 != 0) goto L_0x005f
            if (r0 == 0) goto L_0x005e
            boolean r9 = r0.isDuplex()
            if (r9 == 0) goto L_0x005e
            r1.timeoutEarlyExit()
        L_0x005e:
            return r4
        L_0x005f:
            okhttp3.RequestBody r7 = r6.body()
            if (r7 == 0) goto L_0x006c
            boolean r7 = r7.isOneShot()
            if (r7 == 0) goto L_0x006c
            return r4
        L_0x006c:
            okhttp3.ResponseBody r7 = r4.body()
            if (r7 == 0) goto L_0x0077
            java.io.Closeable r7 = (java.io.Closeable) r7
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r7)
        L_0x0077:
            boolean r7 = r1.hasExchange()
            if (r7 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
            r0.detachWithViolence()
        L_0x0082:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x008a
            r0 = r6
            goto L_0x0013
        L_0x008a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Too many follow-up requests: "
            r9.append(r0)
            r9.append(r5)
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00a3:
            r9 = move-exception
            goto L_0x00cb
        L_0x00a5:
            r6 = move-exception
            boolean r7 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException
            r7 = r7 ^ 1
            boolean r7 = r8.recover(r6, r1, r7, r0)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x00b1
            goto L_0x00bf
        L_0x00b1:
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00a3 }
            throw r6     // Catch:{ all -> 0x00a3 }
        L_0x00b4:
            r6 = move-exception
            java.io.IOException r7 = r6.getLastConnectException()     // Catch:{ all -> 0x00a3 }
            boolean r7 = r8.recover(r7, r1, r2, r0)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x00c4
        L_0x00bf:
            r1.exchangeDoneDueToException()
            goto L_0x0013
        L_0x00c4:
            java.io.IOException r9 = r6.getFirstConnectException()     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x00a3 }
            throw r9     // Catch:{ all -> 0x00a3 }
        L_0x00cb:
            r1.exchangeDoneDueToException()
            throw r9
        L_0x00cf:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private final boolean recover(IOException iOException, Transmitter transmitter, boolean z, Request request) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((!z || !requestIsOneShot(iOException, request)) && isRecoverable(iOException, z) && transmitter.canRetry()) {
            return true;
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        return (body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private final Request followUpRequest(Response response, Route route) throws IOException {
        int code = response.code();
        String method = response.request().method();
        if (code == 307 || code == 308) {
            if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) method, (Object) "GET")) || !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) method, (Object) "HEAD"))) {
                return buildRedirectRequest(response, method);
            }
            return null;
        } else if (code == 401) {
            return this.client.authenticator().authenticate(route, response);
        } else {
            if (code == 503) {
                Response priorResponse = response.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(response, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                    return response.request();
                }
                return null;
            } else if (code == 407) {
                if (route == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return this.client.proxyAuthenticator().authenticate(route, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } else if (code != 408) {
                switch (code) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        return buildRedirectRequest(response, method);
                    default:
                        return null;
                }
            } else if (!this.client.retryOnConnectionFailure()) {
                return null;
            } else {
                RequestBody body = response.request().body();
                if (body != null && body.isOneShot()) {
                    return null;
                }
                Response priorResponse2 = response.priorResponse();
                if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(response, 0) <= 0) {
                    return response.request();
                }
                return null;
            }
        }
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, "Location", (String) null, 2, (Object) null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) resolve.scheme(), (Object) response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            boolean redirectsWithBody = HttpMethod.INSTANCE.redirectsWithBody(str);
            if (HttpMethod.INSTANCE.redirectsToGet(str)) {
                newBuilder.method("GET", (RequestBody) null);
            } else {
                if (redirectsWithBody) {
                    requestBody = response.request().body();
                }
                newBuilder.method(str, requestBody);
            }
            if (!redirectsWithBody) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final int retryAfter(Response response, int i) {
        String header$default = Response.header$default(response, "Retry-After", (String) null, 2, (Object) null);
        if (header$default == null) {
            return i;
        }
        CharSequence charSequence = header$default;
        LifestyleCustomizationActivity lifestyleCustomizationActivity = new LifestyleCustomizationActivity("\\d+");
        onGetStartedClick.write((Object) charSequence, "input");
        if (!lifestyleCustomizationActivity.write.matcher(charSequence).matches()) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(header$default);
        onGetStartedClick.IconCompatParcelizer((Object) valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
