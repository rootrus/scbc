package com.thunderhead.connectivity.transport.retrofitv2.oauth;

import com.thunderhead.connectivity.transport.OkClientFactory;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class OAuthSignInterceptor implements Interceptor {
    Retrofit2HttpOAuthConsumer consumer;

    public OAuthSignInterceptor(Retrofit2HttpOAuthConsumer retrofit2HttpOAuthConsumer) {
        this.consumer = retrofit2HttpOAuthConsumer;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (request.headers().get("Content-Type") == null || request.headers().get("Content-Type") == null) {
            request = chain.request().newBuilder().addHeader("Content-Type", "application/json; charset=utf-8").build();
        } else if (!request.headers().get("Content-Type").contains("charset=utf-8")) {
            String str = request.headers().get("Content-Type");
            Request.Builder newBuilder = chain.request().newBuilder();
            newBuilder.removeHeader("Content-Type");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("; charset=utf-8");
            newBuilder.addHeader("Content-Type", sb.toString());
            request = newBuilder.build();
        }
        try {
            return chain.proceed((Request) this.consumer.sign((Object) request).unwrap());
        } catch (Exception e) {
            if (e instanceof SocketTimeoutException) {
                OkClientFactory.createRuntimeHttpClient(this.consumer);
            }
            e.printStackTrace();
            throw new IOException(e);
        }
    }
}
