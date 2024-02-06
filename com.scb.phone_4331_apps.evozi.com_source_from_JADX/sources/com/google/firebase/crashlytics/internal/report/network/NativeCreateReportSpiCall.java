package com.google.firebase.crashlytics.internal.report.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.ResponseParser;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.report.model.CreateReportRequest;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.io.IOException;

public class NativeCreateReportSpiCall extends AbstractSpiCall implements CreateReportSpiCall {
    private final String version;

    public NativeCreateReportSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        super(str, str2, httpRequestFactory, HttpMethod.POST);
        this.version = str3;
    }

    public boolean invoke(CreateReportRequest createReportRequest, boolean z) {
        if (z) {
            HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest.googleAppId), createReportRequest.organizationId, createReportRequest.report);
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Sending report to: ");
            sb.append(getUrl());
            logger.mo8866d(sb.toString());
            try {
                int code = applyMultipartDataTo.execute().code();
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Result was: ");
                sb2.append(code);
                logger2.mo8866d(sb2.toString());
                return ResponseParser.parse(code) == 0;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(CrashlyticsCore.getVersion());
        httpRequest.header("User-Agent", sb.toString()).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", this.version).header("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        return httpRequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, String str, Report report) {
        if (str != null) {
            httpRequest.part("org_id", str);
        }
        httpRequest.part("report_id", report.getIdentifier());
        for (File file : report.getFiles()) {
            if (file.getName().equals("minidump")) {
                httpRequest.part("minidump_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.part("crash_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.part("binary_images_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("session")) {
                httpRequest.part("session_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("app")) {
                httpRequest.part("app_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("device")) {
                httpRequest.part("device_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("os")) {
                httpRequest.part("os_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("user")) {
                httpRequest.part("user_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("logs")) {
                httpRequest.part("logs_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("keys")) {
                httpRequest.part("keys_file", file.getName(), "application/octet-stream", file);
            }
        }
        return httpRequest;
    }
}
