package com.kofax.mobile.sdk._internal.impl.extraction;

import com.google.gson.Gson;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk.extract.server.ExtractionServerException;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.io.IOUtils;

public class NetworkClient {

    public static class Error {
        public String Message;
        public String message;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo54369a(OkHttpClient okHttpClient, Request request) throws IOException {
        String str;
        ResponseBody responseBody = null;
        try {
            Response execute = okHttpClient.newCall(request).execute();
            responseBody = execute.body();
            if (execute.code() == 200) {
                return responseBody.string();
            }
            Error fromJson = new Gson().getAdapter(Error.class).fromJson(responseBody.string());
            String str2 = fromJson.message;
            boolean z = false;
            if (str2 == null || str2.length() == 0) {
                String str3 = fromJson.Message;
                if (str3 == null || str3.length() == 0) {
                    z = true;
                }
                if (!z) {
                    str = fromJson.Message;
                } else {
                    str = execute.message();
                }
            } else {
                str = fromJson.message;
            }
            throw new ExtractionServerException(execute.code(), str);
        } finally {
            IOUtils.closeQuietly(responseBody);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public OkHttpClient mo54370a(long j, TimeUnit timeUnit, String str, CertificateValidatorListener certificateValidatorListener) {
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(j, timeUnit);
            builder.writeTimeout(j, timeUnit);
            builder.readTimeout(j, timeUnit);
            if (certificateValidatorListener != null) {
                URL url = new URL(str);
                if (url.getProtocol().equalsIgnoreCase("https")) {
                    builder.sslSocketFactory(certificateValidatorListener.getSSLSocketFactory(url.getHost()));
                }
            }
            return builder.build();
        } catch (Exception e) {
            throw new ExtractionServerException(0, e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public HttpUrl mo54371am(String str) {
        return HttpUrl.parse(str).newBuilder().build();
    }
}
