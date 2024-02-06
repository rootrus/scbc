package okhttp3.repackaged;

import java.net.URI;
import java.net.URL;
import java.util.List;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.internal.http.HttpMethod;

public final class Request {
    /* access modifiers changed from: private */
    public final HttpUrl agw;
    private volatile URI aiA;
    private volatile CacheControl aiB;
    /* access modifiers changed from: private */
    public final Headers aii;
    /* access modifiers changed from: private */
    public final RequestBody aij;
    /* access modifiers changed from: private */
    public final String method;
    /* access modifiers changed from: private */
    public final Object tag;

    private Request(Builder builder) {
        this.agw = builder.agw;
        this.method = builder.method;
        this.aii = builder.aiC.build();
        this.aij = builder.aij;
        this.tag = builder.tag != null ? builder.tag : this;
    }

    public final HttpUrl url() {
        return this.agw;
    }

    public final String method() {
        return this.method;
    }

    public final Headers headers() {
        return this.aii;
    }

    public final String header(String str) {
        return this.aii.get(str);
    }

    public final List<String> headers(String str) {
        return this.aii.values(str);
    }

    public final RequestBody body() {
        return this.aij;
    }

    public final Object tag() {
        return this.tag;
    }

    public final Builder newBuilder() {
        return new Builder();
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

    public final boolean isHttps() {
        return this.agw.isHttps();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.agw);
        sb.append(", tag=");
        Object obj = this.tag;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public HttpUrl agw;
        /* access modifiers changed from: private */
        public Headers.Builder aiC;
        /* access modifiers changed from: private */
        public RequestBody aij;
        /* access modifiers changed from: private */
        public String method;
        /* access modifiers changed from: private */
        public Object tag;

        public Builder() {
            this.method = "GET";
            this.aiC = new Headers.Builder();
        }

        private Builder(Request request) {
            this.agw = request.agw;
            this.method = request.method;
            this.aij = request.aij;
            this.tag = request.tag;
            this.aiC = request.aii.newBuilder();
        }

        public Builder url(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.agw = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        public Builder url(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https:");
                    sb2.append(str.substring(4));
                    str = sb2.toString();
                }
                HttpUrl parse = HttpUrl.parse(str);
                if (parse != null) {
                    return url(parse);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unexpected url: ");
                sb3.append(str);
                throw new IllegalArgumentException(sb3.toString());
            }
            throw new IllegalArgumentException("url == null");
        }

        public Builder url(URL url) {
            if (url != null) {
                HttpUrl httpUrl = HttpUrl.get(url);
                if (httpUrl != null) {
                    return url(httpUrl);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected url: ");
                sb.append(url);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("url == null");
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

        public Builder cacheControl(CacheControl cacheControl) {
            String obj = cacheControl.toString();
            if (obj.isEmpty()) {
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
            return method("POST", requestBody);
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public Builder delete() {
            return delete(RequestBody.create((MediaType) null, new byte[0]));
        }

        public Builder put(RequestBody requestBody) {
            return method("PUT", requestBody);
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder method(String str, RequestBody requestBody) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (requestBody != null && !HttpMethod.permitsRequestBody(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("method ");
                sb.append(str);
                sb.append(" must not have a request body.");
                throw new IllegalArgumentException(sb.toString());
            } else if (requestBody != null || !HttpMethod.requiresRequestBody(str)) {
                this.method = str;
                this.aij = requestBody;
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("method ");
                sb2.append(str);
                sb2.append(" must have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public Builder tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Request build() {
            if (this.agw != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }
    }
}
