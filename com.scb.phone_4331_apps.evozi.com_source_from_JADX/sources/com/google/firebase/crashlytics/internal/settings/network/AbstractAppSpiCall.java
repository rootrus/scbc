package com.google.firebase.crashlytics.internal.settings.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.ResponseParser;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.settings.model.AppRequestData;
import java.io.IOException;

abstract class AbstractAppSpiCall extends AbstractSpiCall {
    private final String version;

    public AbstractAppSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod, String str3) {
        super(str, str2, httpRequestFactory, httpMethod);
        this.version = str3;
    }

    public boolean invoke(AppRequestData appRequestData, boolean z) {
        if (z) {
            HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), appRequestData), appRequestData);
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Sending app info to ");
            sb.append(getUrl());
            logger.mo8866d(sb.toString());
            try {
                HttpResponse execute = applyMultipartDataTo.execute();
                int code = execute.code();
                String str = "POST".equalsIgnoreCase(applyMultipartDataTo.method()) ? "Create" : "Update";
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" app request ID: ");
                sb2.append(execute.header("X-REQUEST-ID"));
                logger2.mo8866d(sb2.toString());
                Logger logger3 = Logger.getLogger();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Result was ");
                sb3.append(code);
                logger3.mo8866d(sb3.toString());
                return ResponseParser.parse(code) == 0;
            } catch (IOException e) {
                Logger.getLogger().mo8869e("HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, AppRequestData appRequestData) {
        return httpRequest.header("X-CRASHLYTICS-ORG-ID", appRequestData.organizationId).header("X-CRASHLYTICS-GOOGLE-APP-ID", appRequestData.googleAppId).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", this.version);
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, AppRequestData appRequestData) {
        HttpRequest part = httpRequest.part("org_id", appRequestData.organizationId).part("app[identifier]", appRequestData.appId).part("app[name]", appRequestData.name).part("app[display_version]", appRequestData.displayVersion).part("app[build_version]", appRequestData.buildVersion).part("app[source]", Integer.toString(appRequestData.source)).part("app[minimum_sdk_version]", appRequestData.minSdkVersion).part("app[built_sdk_version]", appRequestData.builtSdkVersion);
        if (!CommonUtils.isNullOrEmpty(appRequestData.instanceIdentifier)) {
            part.part("app[instance_identifier]", appRequestData.instanceIdentifier);
        }
        return part;
    }
}
