package okhttp3.repackaged;

import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.internal.http.OkHeaders;
import p040o.PinLoginActivity;
import p040o.onMenuPromptPayClick;

public final class Response {
    /* access modifiers changed from: private */
    public final Handshake agZ;
    private volatile CacheControl aiB;
    /* access modifiers changed from: private */
    public final ResponseBody aiF;
    /* access modifiers changed from: private */
    public Response aiG;
    /* access modifiers changed from: private */
    public final Response aiH;
    /* access modifiers changed from: private */
    public final Headers aii;
    /* access modifiers changed from: private */
    public final Request aix;
    /* access modifiers changed from: private */
    public Response cacheResponse;
    /* access modifiers changed from: private */
    public final int code;
    /* access modifiers changed from: private */
    public final String message;
    /* access modifiers changed from: private */
    public final Protocol protocol;

    private Response(Builder builder) {
        this.aix = builder.aix;
        this.protocol = builder.protocol;
        this.code = builder.code;
        this.message = builder.message;
        this.agZ = builder.agZ;
        this.aii = builder.aiC.build();
        this.aiF = builder.aiF;
        this.aiG = builder.aiG;
        this.cacheResponse = builder.cacheResponse;
        this.aiH = builder.aiH;
    }

    public final Request request() {
        return this.aix;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final int code() {
        return this.code;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return i >= 200 && i < 300;
    }

    public final String message() {
        return this.message;
    }

    public final Handshake handshake() {
        return this.agZ;
    }

    public final List<String> headers(String str) {
        return this.aii.values(str);
    }

    public final String header(String str) {
        return header(str, (String) null);
    }

    public final String header(String str, String str2) {
        String str3 = this.aii.get(str);
        return str3 != null ? str3 : str2;
    }

    public final Headers headers() {
        return this.aii;
    }

    public final ResponseBody peekBody(long j) throws IOException {
        PinLoginActivity source = this.aiF.source();
        source.MediaBrowserCompat$CustomActionResultReceiver(j);
        onMenuPromptPayClick MediaBrowserCompat$CustomActionResultReceiver = source.MediaBrowserCompat$ItemReceiver().clone();
        if (MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer > j) {
            onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
            onmenupromptpayclick.write(MediaBrowserCompat$CustomActionResultReceiver, j);
            try {
                MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat(MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
                MediaBrowserCompat$CustomActionResultReceiver = onmenupromptpayclick;
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
        return ResponseBody.create(this.aiF.contentType(), MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final ResponseBody body() {
        return this.aiF;
    }

    public final Builder newBuilder() {
        return new Builder();
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final Response networkResponse() {
        return this.aiG;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final Response priorResponse() {
        return this.aiH;
    }

    public final List<Challenge> challenges() {
        String str;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return OkHeaders.parseChallenges(headers(), str);
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.aiB;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.parse(this.aii);
        this.aiB = parse;
        return parse;
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
        sb.append(this.aix.url());
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public Handshake agZ;
        /* access modifiers changed from: private */
        public Headers.Builder aiC;
        /* access modifiers changed from: private */
        public ResponseBody aiF;
        /* access modifiers changed from: private */
        public Response aiG;
        /* access modifiers changed from: private */
        public Response aiH;
        /* access modifiers changed from: private */
        public Request aix;
        /* access modifiers changed from: private */
        public Response cacheResponse;
        /* access modifiers changed from: private */
        public int code;
        /* access modifiers changed from: private */
        public String message;
        /* access modifiers changed from: private */
        public Protocol protocol;

        public Builder() {
            this.code = -1;
            this.aiC = new Headers.Builder();
        }

        private Builder(Response response) {
            this.code = -1;
            this.aix = response.aix;
            this.protocol = response.protocol;
            this.code = response.code;
            this.message = response.message;
            this.agZ = response.agZ;
            this.aiC = response.aii.newBuilder();
            this.aiF = response.aiF;
            this.aiG = response.aiG;
            this.cacheResponse = response.cacheResponse;
            this.aiH = response.aiH;
        }

        public Builder request(Request request) {
            this.aix = request;
            return this;
        }

        public Builder protocol(Protocol protocol2) {
            this.protocol = protocol2;
            return this;
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder handshake(Handshake handshake) {
            this.agZ = handshake;
            return this;
        }

        public Builder header(String str, String str2) {
            this.aiC.set(str, str2);
            return this;
        }

        public Builder addHeader(String str, String str2) {
            this.aiC.add(str, str2);
            return this;
        }

        public Builder removeHeader(String str) {
            this.aiC.removeAll(str);
            return this;
        }

        public Builder headers(Headers headers) {
            this.aiC = headers.newBuilder();
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.aiF = responseBody;
            return this;
        }

        public Builder networkResponse(Response response) {
            if (response != null) {
                m5896a("networkResponse", response);
            }
            this.aiG = response;
            return this;
        }

        public Builder cacheResponse(Response response) {
            if (response != null) {
                m5896a("cacheResponse", response);
            }
            this.cacheResponse = response;
            return this;
        }

        /* renamed from: a */
        private void m5896a(String str, Response response) {
            if (response.aiF != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (response.aiG != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (response.cacheResponse != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (response.aiH != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        public Builder priorResponse(Response response) {
            if (response != null) {
                m5906k(response);
            }
            this.aiH = response;
            return this;
        }

        /* renamed from: k */
        private void m5906k(Response response) {
            if (response.aiF != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public Response build() {
            if (this.aix == null) {
                throw new IllegalStateException("request == null");
            } else if (this.protocol == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.code >= 0) {
                return new Response(this);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("code < 0: ");
                sb.append(this.code);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
