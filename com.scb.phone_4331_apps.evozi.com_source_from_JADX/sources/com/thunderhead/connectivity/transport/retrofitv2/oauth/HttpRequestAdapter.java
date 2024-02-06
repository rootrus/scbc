package com.thunderhead.connectivity.transport.retrofitv2.oauth;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Request;
import p040o.PartnerLandingActivity;
import p040o.SCBUniversalWebViewActivity;

public class HttpRequestAdapter implements PartnerLandingActivity {
    private static final String DEFAULT_CONTENT_TYPE = "application/json";
    private Request request;

    public HttpRequestAdapter(Request request2) {
        this.request = request2;
    }

    public HttpRequestAdapter(Request request2, String str) {
        this.request = request2;
    }

    public Map<String, String> getAllHeaders() {
        HashMap hashMap = new HashMap();
        for (String next : this.request.headers().names()) {
            hashMap.put(next, this.request.headers().get(next));
        }
        return hashMap;
    }

    public String getContentType() {
        if (this.request.body() == null || this.request.body().contentType() == null) {
            return null;
        }
        return this.request.body().contentType().toString();
    }

    public String getHeader(String str) {
        return this.request.header(str);
    }

    public InputStream getMessagePayload() throws IOException {
        if (this.request.body() == null) {
            return null;
        }
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        this.request.body().writeTo(sCBUniversalWebViewActivity);
        return new SCBUniversalWebViewActivity.read(sCBUniversalWebViewActivity);
    }

    public String getMethod() {
        return this.request.method();
    }

    public String getRequestUrl() {
        return this.request.url().toString();
    }

    public void setHeader(String str, String str2) {
        this.request = this.request.newBuilder().header(str, str2).build();
    }

    public void setRequestUrl(String str) {
        this.request = this.request.newBuilder().url(str).build();
    }

    public Object unwrap() {
        return this.request;
    }
}
