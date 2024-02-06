package com.google.firebase.crashlytics.internal.network;

import java.util.Map;

public class HttpRequestFactory {
    public HttpRequest buildHttpRequest(HttpMethod httpMethod, String str, Map<String, String> map) {
        return new HttpRequest(httpMethod, str, map);
    }
}
