package okhttp3.internal;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import p040o.onGetStartedClick;

public final class Internal {
    public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        onGetStartedClick.write((Object) str, "setCookie");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        onGetStartedClick.write((Object) cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        onGetStartedClick.write((Object) builder, "builder");
        onGetStartedClick.write((Object) str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        onGetStartedClick.write((Object) builder, "builder");
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return builder.addLenient$okhttp(str, str2);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        onGetStartedClick.write((Object) cache, "cache");
        onGetStartedClick.write((Object) request, "request");
        return cache.get$okhttp(request);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
        onGetStartedClick.write((Object) connectionSpec, "connectionSpec");
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }
}
