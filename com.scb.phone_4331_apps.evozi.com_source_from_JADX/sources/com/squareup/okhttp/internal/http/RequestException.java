package com.squareup.okhttp.internal.http;

import java.io.IOException;

public final class RequestException extends Exception {
    public final /* bridge */ /* synthetic */ Throwable getCause() {
        return (IOException) super.getCause();
    }
}
