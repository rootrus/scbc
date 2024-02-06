package com.thunderhead.connectivity.transport.retrofitv2;

import okhttp3.Interceptor;

public class RequestInterceptorsFactory {
    public static Interceptor getDesignTimeRequestInterceptor() {
        return new DesignTimeRequestInterceptor();
    }
}
