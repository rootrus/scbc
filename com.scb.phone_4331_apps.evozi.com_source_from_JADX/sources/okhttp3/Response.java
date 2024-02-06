package okhttp3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import p040o.HmlNationalIdActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public final String header(String str) {
        return header$default(this, str, (String) null, 2, (Object) null);
    }

    public Response(Request request2, Protocol protocol2, String str, int i, Handshake handshake2, Headers headers2, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange2) {
        onGetStartedClick.write((Object) request2, "request");
        onGetStartedClick.write((Object) protocol2, "protocol");
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        onGetStartedClick.write((Object) headers2, "headers");
        this.request = request2;
        this.protocol = protocol2;
        this.message = str;
        this.code = i;
        this.handshake = handshake2;
        this.headers = headers2;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange2;
    }

    public final Request request() {
        return this.request;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final String message() {
        return this.message;
    }

    public final int code() {
        return this.code;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    /* renamed from: -deprecated_request  reason: not valid java name */
    public final Request m6421deprecated_request() {
        return this.request;
    }

    /* renamed from: -deprecated_protocol  reason: not valid java name */
    public final Protocol m6419deprecated_protocol() {
        return this.protocol;
    }

    /* renamed from: -deprecated_code  reason: not valid java name */
    public final int m6413deprecated_code() {
        return this.code;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && 299 >= i;
    }

    /* renamed from: -deprecated_message  reason: not valid java name */
    public final String m6416deprecated_message() {
        return this.message;
    }

    /* renamed from: -deprecated_handshake  reason: not valid java name */
    public final Handshake m6414deprecated_handshake() {
        return this.handshake;
    }

    public final List<String> headers(String str) {
        onGetStartedClick.write((Object) str, "name");
        return this.headers.values(str);
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    public final String header(String str, String str2) {
        onGetStartedClick.write((Object) str, "name");
        String str3 = this.headers.get(str);
        return str3 != null ? str3 : str2;
    }

    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m6415deprecated_headers() {
        return this.headers;
    }

    public final Headers trailers() throws IOException {
        Exchange exchange2 = this.exchange;
        if (exchange2 != null) {
            return exchange2.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    public final ResponseBody peekBody(long j) throws IOException {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        NsipPartnerPaymentOtpActivity MediaBrowserCompat$MediaItem = responseBody.source().MediaBrowserCompat$MediaItem();
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        MediaBrowserCompat$MediaItem.MediaBrowserCompat$SearchResultReceiver(j);
        HowToAddAccountStep2Activity howToAddAccountStep2Activity = MediaBrowserCompat$MediaItem;
        long min = Math.min(j, MediaBrowserCompat$MediaItem.MediaMetadataCompat().read);
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "source");
        while (min > 0) {
            long read = howToAddAccountStep2Activity.read(sCBUniversalWebViewActivity, min);
            if (read != -1) {
                min -= read;
            } else {
                throw new EOFException();
            }
        }
        return ResponseBody.Companion.create((NsipPartnerPaymentOtpActivity) sCBUniversalWebViewActivity, this.body.contentType(), sCBUniversalWebViewActivity.read);
    }

    /* renamed from: -deprecated_body  reason: not valid java name */
    public final ResponseBody m6410deprecated_body() {
        return this.body;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: -deprecated_networkResponse  reason: not valid java name */
    public final Response m6417deprecated_networkResponse() {
        return this.networkResponse;
    }

    /* renamed from: -deprecated_cacheResponse  reason: not valid java name */
    public final Response m6412deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: -deprecated_priorResponse  reason: not valid java name */
    public final Response m6418deprecated_priorResponse() {
        return this.priorResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers2 = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers2, str);
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m6411deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_sentRequestAtMillis  reason: not valid java name */
    public final long m6422deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* renamed from: -deprecated_receivedResponseAtMillis  reason: not valid java name */
    public final long m6420deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.protocol);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", url=");
        sb.append(this.request.url());
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final void setRequest$okhttp(Request request2) {
            this.request = request2;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final void setProtocol$okhttp(Protocol protocol2) {
            this.protocol = protocol2;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final void setHandshake$okhttp(Handshake handshake2) {
            this.handshake = handshake2;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            onGetStartedClick.write((Object) builder, "<set-?>");
            this.headers = builder;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final void setExchange$okhttp(Exchange exchange2) {
            this.exchange = exchange2;
        }

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Builder(Response response) {
            onGetStartedClick.write((Object) response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }

        public Builder request(Request request2) {
            onGetStartedClick.write((Object) request2, "request");
            Builder builder = this;
            builder.request = request2;
            return builder;
        }

        public Builder protocol(Protocol protocol2) {
            onGetStartedClick.write((Object) protocol2, "protocol");
            Builder builder = this;
            builder.protocol = protocol2;
            return builder;
        }

        public Builder code(int i) {
            Builder builder = this;
            builder.code = i;
            return builder;
        }

        public Builder message(String str) {
            onGetStartedClick.write((Object) str, C8183f.f4230JO);
            Builder builder = this;
            builder.message = str;
            return builder;
        }

        public Builder handshake(Handshake handshake2) {
            Builder builder = this;
            builder.handshake = handshake2;
            return builder;
        }

        public Builder header(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.headers.set(str, str2);
            return builder;
        }

        public Builder addHeader(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.headers.add(str, str2);
            return builder;
        }

        public Builder removeHeader(String str) {
            onGetStartedClick.write((Object) str, "name");
            Builder builder = this;
            builder.headers.removeAll(str);
            return builder;
        }

        public Builder headers(Headers headers2) {
            onGetStartedClick.write((Object) headers2, "headers");
            Builder builder = this;
            builder.headers = headers2.newBuilder();
            return builder;
        }

        public Builder body(ResponseBody responseBody) {
            Builder builder = this;
            builder.body = responseBody;
            return builder;
        }

        public Builder networkResponse(Response response) {
            Builder builder = this;
            builder.checkSupportResponse("networkResponse", response);
            builder.networkResponse = response;
            return builder;
        }

        public Builder cacheResponse(Response response) {
            Builder builder = this;
            builder.checkSupportResponse("cacheResponse", response);
            builder.cacheResponse = response;
            return builder;
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                boolean z = true;
                if (response.body() == null) {
                    if (response.networkResponse() == null) {
                        if (response.cacheResponse() == null) {
                            if (response.priorResponse() != null) {
                                z = false;
                            }
                            if (!z) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(".priorResponse != null");
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(".cacheResponse != null");
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(".networkResponse != null");
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".body != null");
                throw new IllegalArgumentException(sb4.toString().toString());
            }
        }

        public Builder priorResponse(Response response) {
            Builder builder = this;
            builder.checkPriorResponse(response);
            builder.priorResponse = response;
            return builder;
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public Builder sentRequestAtMillis(long j) {
            Builder builder = this;
            builder.sentRequestAtMillis = j;
            return builder;
        }

        public Builder receivedResponseAtMillis(long j) {
            Builder builder = this;
            builder.receivedResponseAtMillis = j;
            return builder;
        }

        public final void initExchange$okhttp(Exchange exchange2) {
            onGetStartedClick.write((Object) exchange2, "deferredTrailers");
            this.exchange = exchange2;
        }

        public Response build() {
            if (this.code >= 0) {
                Request request2 = this.request;
                if (request2 != null) {
                    Protocol protocol2 = this.protocol;
                    if (protocol2 != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request2, protocol2, str, this.code, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("code < 0: ");
            sb.append(this.code);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
