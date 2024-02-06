package com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import com.kofax.mobile.sdk._internal.extraction.C7905h;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.d */
public class C8015d {

    /* renamed from: JI */
    private CertificateValidatorListener f3846JI;

    /* renamed from: KT */
    private String f3847KT;

    public C8015d(String str, CertificateValidatorListener certificateValidatorListener) {
        if (str.endsWith("/")) {
            this.f3847KT = str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            this.f3847KT = sb.toString();
        }
        this.f3846JI = certificateValidatorListener;
    }

    public String execute(String str, JSONObject jSONObject) throws IOException, JSONException, C7899a {
        RequestBody create = RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
        ResponseBody responseBody = null;
        try {
            Response execute = m4004a(60000, TimeUnit.MILLISECONDS, this.f3847KT.concat(str), this.f3846JI).newCall(m4005a(m4006aq(this.f3847KT.concat(str)), create)).execute();
            responseBody = execute.body();
            int code = execute.code();
            if (code == 200) {
                return responseBody.string();
            }
            throw new C7899a(new C7905h(code, execute.message()));
        } finally {
            IOUtils.closeQuietly(responseBody);
        }
    }

    /* renamed from: a */
    private OkHttpClient m4004a(long j, TimeUnit timeUnit, String str, CertificateValidatorListener certificateValidatorListener) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(j, timeUnit);
        builder.writeTimeout(j, timeUnit);
        builder.readTimeout(j, timeUnit);
        if (certificateValidatorListener != null) {
            builder.sslSocketFactory(certificateValidatorListener.getSSLSocketFactory(str));
        }
        return builder.build();
    }

    /* renamed from: aq */
    private HttpUrl m4006aq(String str) {
        return HttpUrl.parse(str).newBuilder().build();
    }

    /* renamed from: a */
    private Request m4005a(HttpUrl httpUrl, RequestBody requestBody) throws IOException {
        return new Request.Builder().url(httpUrl).addHeader("Content-Type", " application/json").addHeader("Accept", " application/json").post(requestBody).build();
    }
}
