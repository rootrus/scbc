package org.apache.http.client;

import java.io.IOException;

public class ClientProtocolException extends IOException {
    public ClientProtocolException() {
    }

    public ClientProtocolException(String str) {
        super(str);
    }

    public ClientProtocolException(Throwable th) {
        initCause(th);
    }
}
