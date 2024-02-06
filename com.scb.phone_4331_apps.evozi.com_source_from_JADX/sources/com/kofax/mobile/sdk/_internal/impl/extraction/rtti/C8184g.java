package com.kofax.mobile.sdk._internal.impl.extraction.rtti;

import android.webkit.MimeTypeMap;
import com.kofax.mobile.sdk._internal.impl.extraction.C7992j;
import com.kofax.mobile.sdk._internal.impl.extraction.NetworkClient;
import com.kofax.mobile.sdk.extract.server.ExtractionServerException;
import com.kofax.mobile.sdk.extract.server.ServerExtractionParameters;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.g */
public class C8184g extends NetworkClient implements C8174a {
    /* renamed from: b */
    public String mo54583b(ServerExtractionParameters serverExtractionParameters) {
        try {
            return mo54369a(mo54370a(serverExtractionParameters.getTimeOutParameters().getTimeOut(), serverExtractionParameters.getTimeOutParameters().getUnit(), serverExtractionParameters.getServerUrl(), serverExtractionParameters.getCertificateValidationListener()), m4447a(mo54371am(serverExtractionParameters.getServerUrl()), m4448a(serverExtractionParameters.getImageBytes(), (Map<String, String>) serverExtractionParameters.getParameters())));
        } catch (ExtractionServerException e) {
            throw e;
        } catch (Exception e2) {
            throw new ExtractionServerException(0, e2.toString());
        }
    }

    /* renamed from: a */
    private RequestBody m4448a(List<byte[]> list, Map<String, String> map) {
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        int i = 0;
        for (byte[] next : list) {
            String a = C7992j.m3944a(next[0]);
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(a);
            StringBuilder sb = new StringBuilder();
            sb.append("file");
            sb.append(i);
            sb.append(".");
            sb.append(extensionFromMimeType);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image");
            sb2.append(i);
            type.addFormDataPart(sb2.toString(), obj, RequestBody.create(MediaType.parse(a), next));
            i++;
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry next2 : map.entrySet()) {
                if (next2.getValue() != null) {
                    type.addFormDataPart((String) next2.getKey(), new String((String) next2.getValue()));
                }
            }
        }
        return type.build();
    }

    /* renamed from: a */
    private Request m4447a(HttpUrl httpUrl, RequestBody requestBody) throws IOException {
        Request.Builder addHeader = new Request.Builder().url(httpUrl).addHeader("Connection", "Keep-Alive");
        StringBuilder sb = new StringBuilder();
        sb.append(requestBody.contentLength());
        return addHeader.addHeader("Content-length", sb.toString()).post(requestBody).build();
    }
}
