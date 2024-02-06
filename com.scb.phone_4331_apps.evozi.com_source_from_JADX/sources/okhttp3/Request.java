package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import p040o.GoodToKnowActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.onGetStartedClick;

public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    public Request(HttpUrl httpUrl, String str, Headers headers2, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        onGetStartedClick.write((Object) str, "method");
        onGetStartedClick.write((Object) headers2, "headers");
        onGetStartedClick.write((Object) map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers2;
        this.body = requestBody;
        this.tags = map;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final String method() {
        return this.method;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String header(String str) {
        onGetStartedClick.write((Object) str, "name");
        return this.headers.get(str);
    }

    public final List<String> headers(String str) {
        onGetStartedClick.write((Object) str, "name");
        return this.headers.values(str);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public final <T> T tag(Class<? extends T> cls) {
        onGetStartedClick.write((Object) cls, "type");
        return cls.cast(this.tags.get(cls));
    }

    public final Builder newBuilder() {
        return new Builder(this);
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

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m6409deprecated_url() {
        return this.url;
    }

    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m6408deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m6407deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m6405deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m6406deprecated_cacheControl() {
        return cacheControl();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : this.headers) {
                if (i >= 0) {
                    HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) next;
                    String str = (String) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    String str2 = (String) hmlVerifyEmailSuccessfulActivity.write;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }

    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder delete() {
            return delete$default(this, (RequestBody) null, 1, (Object) null);
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final void setMethod$okhttp(String str) {
            onGetStartedClick.write((Object) str, "<set-?>");
            this.method = str;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            onGetStartedClick.write((Object) builder, "<set-?>");
            this.headers = builder;
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            onGetStartedClick.write((Object) map, "<set-?>");
            this.tags = map;
        }

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Builder(Request request) {
            Map<Class<?>, Object> map;
            onGetStartedClick.write((Object) request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                Map<Class<?>, Object> tags$okhttp = request.getTags$okhttp();
                onGetStartedClick.write((Object) tags$okhttp, "$this$toMutableMap");
                map = new LinkedHashMap<>(tags$okhttp);
            }
            this.tags = map;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(HttpUrl httpUrl) {
            onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
            Builder builder = this;
            builder.url = httpUrl;
            return builder;
        }

        public Builder url(String str) {
            onGetStartedClick.write((Object) str, ImagesContract.URL);
            if (GoodToKnowActivity.read(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (GoodToKnowActivity.read(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder url(URL url2) {
            onGetStartedClick.write((Object) url2, ImagesContract.URL);
            HttpUrl.Companion companion = HttpUrl.Companion;
            String obj = url2.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "url.toString()");
            return url(companion.get(obj));
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

        public Builder cacheControl(CacheControl cacheControl) {
            onGetStartedClick.write((Object) cacheControl, "cacheControl");
            String obj = cacheControl.toString();
            if (obj.length() == 0) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", obj);
        }

        public Builder get() {
            return method("GET", (RequestBody) null);
        }

        public Builder head() {
            return method("HEAD", (RequestBody) null);
        }

        public Builder post(RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "body");
            return method("POST", requestBody);
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "body");
            return method("PUT", requestBody);
        }

        public Builder patch(RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "body");
            return method("PATCH", requestBody);
        }

        public Builder method(String str, RequestBody requestBody) {
            onGetStartedClick.write((Object) str, "method");
            Builder builder = this;
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("method ");
                        sb.append(str);
                        sb.append(" must have a request body.");
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("method ");
                    sb2.append(str);
                    sb2.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                builder.method = str;
                builder.body = requestBody;
                return builder;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            onGetStartedClick.write((Object) cls, "type");
            Builder builder = this;
            if (t == null) {
                builder.tags.remove(cls);
            } else {
                if (builder.tags.isEmpty()) {
                    builder.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = builder.tags;
                Object cast = cls.cast(t);
                if (cast == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                map.put(cls, cast);
            }
            return builder;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }
    }
}
