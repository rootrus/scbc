package com.google.firebase.crashlytics.internal.report.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.crashlytics.internal.common.ResponseParser;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.report.model.CreateReportRequest;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DefaultCreateReportSpiCall extends AbstractSpiCall implements CreateReportSpiCall {
    private final String version;

    public DefaultCreateReportSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        this(str, str2, httpRequestFactory, HttpMethod.POST, str3);
    }

    DefaultCreateReportSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod, String str3) {
        super(str, str2, httpRequestFactory, httpMethod);
        this.version = str3;
    }

    public boolean invoke(CreateReportRequest createReportRequest, boolean z) {
        if (z) {
            HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Sending report to: ");
            sb.append(getUrl());
            logger.mo8866d(sb.toString());
            try {
                HttpResponse execute = applyMultipartDataTo.execute();
                int code = execute.code();
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Create report request ID: ");
                sb2.append(execute.header("X-REQUEST-ID"));
                logger2.mo8866d(sb2.toString());
                Logger logger3 = Logger.getLogger();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Result was: ");
                sb3.append(code);
                logger3.mo8866d(sb3.toString());
                return ResponseParser.parse(code) == 0;
            } catch (IOException e) {
                Logger.getLogger().mo8869e("Create report HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, CreateReportRequest createReportRequest) {
        HttpRequest header = httpRequest.header("X-CRASHLYTICS-GOOGLE-APP-ID", createReportRequest.googleAppId).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android").header("X-CRASHLYTICS-API-CLIENT-VERSION", this.version);
        for (Map.Entry<String, String> header2 : createReportRequest.report.getCustomHeaders().entrySet()) {
            header = header.header(header2);
        }
        return header;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        HttpRequest part = httpRequest.part("report[identifier]", report.getIdentifier());
        if (report.getFiles().length == 1) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Adding single file ");
            sb.append(report.getFileName());
            sb.append(" to report ");
            sb.append(report.getIdentifier());
            logger.mo8866d(sb.toString());
            return part.part("report[file]", report.getFileName(), "application/octet-stream", report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            Logger logger2 = Logger.getLogger();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding file ");
            sb2.append(file.getName());
            sb2.append(" to report ");
            sb2.append(report.getIdentifier());
            logger2.mo8866d(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("report[file");
            sb3.append(i);
            sb3.append("]");
            part = part.part(sb3.toString(), file.getName(), "application/octet-stream", file);
            i++;
        }
        return part;
    }
}
