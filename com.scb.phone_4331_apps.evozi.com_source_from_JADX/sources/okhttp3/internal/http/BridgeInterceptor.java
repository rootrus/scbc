package okhttp3.internal.http;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.io.IOException;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import p040o.GoodToKnowActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPaymentLandingActivity;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar2) {
        onGetStartedClick.write((Object) cookieJar2, "cookieJar");
        this.cookieJar = cookieJar2;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody body;
        onGetStartedClick.write((Object) chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body2 = request.body();
        if (body2 != null) {
            MediaType contentType = body2.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", String.valueOf(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
        }
        boolean z = false;
        if (request.header("Host") == null) {
            newBuilder.header("Host", Util.toHostHeader$default(request.url(), false, 1, (Object) null));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            newBuilder.header("Accept-Encoding", "gzip");
            z = true;
        }
        List<Cookie> loadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header(ServiceConstants.HEADER_COOKIE, cookieHeader(loadForRequest));
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", Version.userAgent);
        }
        Response proceed = chain.proceed(newBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z && GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("gzip", Response.header$default(proceed, "Content-Encoding", (String) null, 2, (Object) null), true) && HttpHeaders.promisesBody(proceed) && (body = proceed.body()) != null) {
            NsipPaymentLandingActivity nsipPaymentLandingActivity = new NsipPaymentLandingActivity(body.source());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(Response.header$default(proceed, "Content-Type", (String) null, 2, (Object) null), -1, onSubmit.read((HowToAddAccountStep2Activity) nsipPaymentLandingActivity)));
        }
        return request2.build();
    }

    private final String cookieHeader(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : list) {
            if (i >= 0) {
                Cookie cookie = (Cookie) next;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(cookie.name());
                sb.append('=');
                sb.append(cookie.value());
                i++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }
}
