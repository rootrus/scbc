package org.apache.http.conn;

import java.io.InterruptedIOException;

public class ConnectTimeoutException extends InterruptedIOException {
    public ConnectTimeoutException() {
    }

    public ConnectTimeoutException(String str) {
        super(str);
    }
}
