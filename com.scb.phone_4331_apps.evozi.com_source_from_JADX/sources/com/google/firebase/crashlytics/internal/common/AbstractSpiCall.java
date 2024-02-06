package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class AbstractSpiCall {
    private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final HttpMethod method;
    private final String protocolAndHostOverride;
    private final HttpRequestFactory requestFactory;
    private final String url;

    public AbstractSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (httpRequestFactory != null) {
            this.protocolAndHostOverride = str;
            this.url = overrideProtocolAndHost(str2);
            this.requestFactory = httpRequestFactory;
            this.method = httpMethod;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: protected */
    public HttpRequest getHttpRequest() {
        return getHttpRequest(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public HttpRequest getHttpRequest(Map<String, String> map) {
        HttpRequest buildHttpRequest = this.requestFactory.buildHttpRequest(this.method, getUrl(), map);
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(CrashlyticsCore.getVersion());
        return buildHttpRequest.header("User-Agent", sb.toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    private String overrideProtocolAndHost(String str) {
        return !CommonUtils.isNullOrEmpty(this.protocolAndHostOverride) ? PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride) : str;
    }
}
