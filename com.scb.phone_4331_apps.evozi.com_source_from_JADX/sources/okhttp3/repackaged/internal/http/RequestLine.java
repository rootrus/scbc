package okhttp3.repackaged.internal.http;

import java.net.Proxy;
import okhttp3.repackaged.HttpUrl;
import okhttp3.repackaged.Request;

public final class RequestLine {
    private RequestLine() {
    }

    /* renamed from: a */
    static String m6145a(Request request, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (m6146b(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m6146b(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public static String requestPath(HttpUrl httpUrl) {
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery == null) {
            return encodedPath;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(encodedPath);
        sb.append('?');
        sb.append(encodedQuery);
        return sb.toString();
    }
}
