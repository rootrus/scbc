package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p040o.DeejungTransferInstallmentsReviewActivity;
import p040o.setTextAppearance;

abstract class AbstractDesignTimeRequestInterceptor implements Interceptor {
    /* access modifiers changed from: protected */
    public abstract setTextAppearance<String, String> provideQueryURLPathParameters();

    AbstractDesignTimeRequestInterceptor() {
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        if (request.headers().get("Content-Type") == null || request.headers().get("Content-Type").isEmpty()) {
            newBuilder.addHeader("Content-Type", "application/json; charset=utf-8");
        } else {
            String str = request.headers().get("Content-Type");
            newBuilder.removeHeader("Content-Type");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("; charset=utf-8");
            newBuilder.addHeader("Content-Type", sb.toString());
        }
        List<String> pathSegments = request.url().pathSegments();
        setTextAppearance<String, String> provideQueryURLPathParameters = provideQueryURLPathParameters();
        if (provideQueryURLPathParameters != null && provideQueryURLPathParameters.size() > 0) {
            HttpUrl.Builder newBuilder2 = request.url().newBuilder();
            for (int i = 0; i < provideQueryURLPathParameters.size(); i++) {
                int i2 = 0;
                while (true) {
                    if (i2 >= pathSegments.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((String) provideQueryURLPathParameters.read[i << 1]).equals(pathSegments.get(i2))) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    newBuilder2.setPathSegment(i2, (String) provideQueryURLPathParameters.read[(i << 1) + 1]);
                }
            }
            newBuilder.url(newBuilder2.build());
        }
        Iterator it = ((HashSet) DeejungTransferInstallmentsReviewActivity.write().MediaBrowserCompat$ItemReceiver).iterator();
        while (it.hasNext()) {
            newBuilder.addHeader(ServiceConstants.HEADER_COOKIE, (String) it.next());
        }
        return chain.proceed(newBuilder.build());
    }
}
