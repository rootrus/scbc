package okhttp3.repackaged.internal.http;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.repackaged.Challenge;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.internal.Platform;
import okhttp3.repackaged.internal.Util;

public final class OkHeaders {
    static final String PREFIX = Platform.get().getPrefix();
    public static final String RECEIVED_MILLIS;
    public static final String RESPONSE_SOURCE;
    public static final String SELECTED_PROTOCOL;
    public static final String SENT_MILLIS;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX);
        sb.append("-Sent-Millis");
        SENT_MILLIS = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(PREFIX);
        sb2.append("-Received-Millis");
        RECEIVED_MILLIS = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(PREFIX);
        sb3.append("-Selected-Protocol");
        SELECTED_PROTOCOL = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(PREFIX);
        sb4.append("-Response-Source");
        RESPONSE_SOURCE = sb4.toString();
    }

    private OkHeaders() {
    }

    public static long contentLength(Request request) {
        return contentLength(request.headers());
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static long contentLength(Headers headers) {
        return m6143bb(headers.get("Content-Length"));
    }

    /* renamed from: bb */
    private static long m6143bb(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String next : m6144o(response)) {
            if (!Util.equal(headers.values(next), request.headers(next))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    /* renamed from: o */
    private static Set<String> m6144o(Response response) {
        return varyFields(response.headers());
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : value.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }

    static boolean isEndToEnd(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                int i2 = 0;
                while (i2 < value.length()) {
                    int skipUntil = HeaderParser.skipUntil(value, i2, " ");
                    String trim = value.substring(i2, skipUntil).trim();
                    int skipWhitespace = HeaderParser.skipWhitespace(value, skipUntil);
                    if (!value.regionMatches(true, skipWhitespace, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = skipWhitespace + 7;
                    int skipUntil2 = HeaderParser.skipUntil(value, i3, "\"");
                    String substring = value.substring(i3, skipUntil2);
                    i2 = HeaderParser.skipWhitespace(value, HeaderParser.skipUntil(value, skipUntil2 + 1, ",") + 1);
                    arrayList.add(new Challenge(trim, substring));
                }
            }
        }
        return arrayList;
    }
}
