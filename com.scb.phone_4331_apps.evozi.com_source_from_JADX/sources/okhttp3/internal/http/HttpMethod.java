package okhttp3.internal.http;

import p040o.onGetStartedClick;

public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public final boolean invalidatesCache(String str) {
        onGetStartedClick.write((Object) str, "method");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "POST") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PATCH") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PUT") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "DELETE") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "MOVE");
    }

    public static final boolean requiresRequestBody(String str) {
        onGetStartedClick.write((Object) str, "method");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "POST") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PUT") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PATCH") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PROPPATCH") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "REPORT");
    }

    public static final boolean permitsRequestBody(String str) {
        onGetStartedClick.write((Object) str, "method");
        return !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "GET") && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "HEAD");
    }

    public final boolean redirectsWithBody(String str) {
        onGetStartedClick.write((Object) str, "method");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PROPFIND");
    }

    public final boolean redirectsToGet(String str) {
        onGetStartedClick.write((Object) str, "method");
        return !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PROPFIND");
    }
}
