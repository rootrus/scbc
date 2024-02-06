package com.squareup.okhttp.internal.http;

public final class RouteException extends Exception {
    static {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
    }
}
