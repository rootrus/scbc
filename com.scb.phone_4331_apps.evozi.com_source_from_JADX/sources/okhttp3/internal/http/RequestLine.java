package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;
import p040o.onGetStartedClick;

public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    public final String get(Request request, Proxy.Type type) {
        onGetStartedClick.write((Object) request, "request");
        onGetStartedClick.write((Object) type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (INSTANCE.includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(INSTANCE.requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String requestPath(HttpUrl httpUrl) {
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
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
