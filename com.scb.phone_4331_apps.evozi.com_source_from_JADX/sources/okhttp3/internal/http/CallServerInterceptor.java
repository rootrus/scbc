package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import p040o.GoodToKnowActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Response response;
        onGetStartedClick.write((Object) chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.exchange();
        Request request = realInterceptorChain.request();
        RequestBody body = request.body();
        long currentTimeMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        Long l = null;
        if (!HttpMethod.permitsRequestBody(request.method()) || body == null) {
            exchange.noRequestBody();
            z = false;
            builder = null;
        } else {
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("100-continue", request.header("Expect"), true)) {
                exchange.flushRequest();
                exchange.responseHeadersStart();
                builder = exchange.readResponseHeaders(true);
                z = true;
            } else {
                z = false;
                builder = null;
            }
            if (builder != null) {
                exchange.noRequestBody();
                RealConnection connection = exchange.connection();
                if (connection == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (!connection.isMultiplexed()) {
                    exchange.noNewExchangesOnConnection();
                }
                z = true;
            } else if (body.isDuplex()) {
                exchange.flushRequest();
                body.writeTo(onSubmit.read(exchange.createRequestBody(request, true)));
            } else {
                NsipPartnerPaymentReviewActivity read = onSubmit.read(exchange.createRequestBody(request, false));
                body.writeTo(read);
                read.close();
            }
        }
        if (body == null || !body.isDuplex()) {
            exchange.finishRequest();
        }
        if (!z) {
            exchange.responseHeadersStart();
        }
        if (builder == null && (builder = exchange.readResponseHeaders(false)) == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Response.Builder request2 = builder.request(request);
        RealConnection connection2 = exchange.connection();
        if (connection2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Response build = request2.handshake(connection2.handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        if (code == 100) {
            Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
            if (readResponseHeaders == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Response.Builder request3 = readResponseHeaders.request(request);
            RealConnection connection3 = exchange.connection();
            if (connection3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            build = request3.handshake(connection3.handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange.responseHeadersEnd(build);
        if (!this.forWebSocket || code != 101) {
            response = build.newBuilder().body(exchange.openResponseBody(build)).build();
        } else {
            response = build.newBuilder().body(Util.EMPTY_RESPONSE).build();
        }
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("close", response.request().header("Connection"), true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("close", Response.header$default(response, "Connection", (String) null, 2, (Object) null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (code == 204 || code == 205) {
            ResponseBody body2 = response.body();
            if ((body2 != null ? body2.contentLength() : -1) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(code);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody body3 = response.body();
                if (body3 != null) {
                    l = Long.valueOf(body3.contentLength());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return response;
    }
}
