package com.google.firebase.crashlytics.internal.settings.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.settings.model.SettingsRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class DefaultSettingsSpiCall extends AbstractSpiCall implements SettingsSpiCall {
    private Logger logger;

    /* access modifiers changed from: package-private */
    public boolean requestWasSuccessful(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public DefaultSettingsSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory) {
        this(str, str2, httpRequestFactory, HttpMethod.GET, Logger.getLogger());
    }

    DefaultSettingsSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod, Logger logger2) {
        super(str, str2, httpRequestFactory, httpMethod);
        this.logger = logger2;
    }

    public JSONObject invoke(SettingsRequest settingsRequest, boolean z) {
        if (z) {
            try {
                Map<String, String> queryParamsFor = getQueryParamsFor(settingsRequest);
                HttpRequest applyHeadersTo = applyHeadersTo(getHttpRequest(queryParamsFor), settingsRequest);
                Logger logger2 = this.logger;
                StringBuilder sb = new StringBuilder();
                sb.append("Requesting settings from ");
                sb.append(getUrl());
                logger2.mo8866d(sb.toString());
                Logger logger3 = this.logger;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Settings query params were: ");
                sb2.append(queryParamsFor);
                logger3.mo8866d(sb2.toString());
                HttpResponse execute = applyHeadersTo.execute();
                Logger logger4 = this.logger;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Settings request ID: ");
                sb3.append(execute.header("X-REQUEST-ID"));
                logger4.mo8866d(sb3.toString());
                return handleResponse(execute);
            } catch (IOException e) {
                this.logger.mo8869e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject handleResponse(HttpResponse httpResponse) {
        int code = httpResponse.code();
        Logger logger2 = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append("Settings result was: ");
        sb.append(code);
        logger2.mo8866d(sb.toString());
        if (requestWasSuccessful(code)) {
            return getJsonObjectFrom(httpResponse.body());
        }
        Logger logger3 = this.logger;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to retrieve settings from ");
        sb2.append(getUrl());
        logger3.mo8868e(sb2.toString());
        return null;
    }

    private JSONObject getJsonObjectFrom(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger logger2 = this.logger;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(getUrl());
            logger2.mo8867d(sb.toString(), e);
            Logger logger3 = this.logger;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings response ");
            sb2.append(str);
            logger3.mo8866d(sb2.toString());
            return null;
        }
    }

    private Map<String, String> getQueryParamsFor(SettingsRequest settingsRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", settingsRequest.buildVersion);
        hashMap.put("display_version", settingsRequest.displayVersion);
        hashMap.put("source", Integer.toString(settingsRequest.source));
        String str = settingsRequest.instanceId;
        if (!CommonUtils.isNullOrEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, SettingsRequest settingsRequest) {
        applyNonNullHeader(httpRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", settingsRequest.googleAppId);
        applyNonNullHeader(httpRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        applyNonNullHeader(httpRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        applyNonNullHeader(httpRequest, "Accept", "application/json");
        applyNonNullHeader(httpRequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.deviceModel);
        applyNonNullHeader(httpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsRequest.osBuildVersion);
        applyNonNullHeader(httpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsRequest.osDisplayVersion);
        applyNonNullHeader(httpRequest, "X-CRASHLYTICS-INSTALLATION-ID", settingsRequest.installIdProvider.getCrashlyticsInstallId());
        return httpRequest;
    }

    private void applyNonNullHeader(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.header(str, str2);
        }
    }
}
