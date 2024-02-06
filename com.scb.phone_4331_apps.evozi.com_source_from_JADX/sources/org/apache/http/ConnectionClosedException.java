package org.apache.http;

import java.io.IOException;

public class ConnectionClosedException extends IOException {
    public ConnectionClosedException() {
        super("Connection is closed");
    }

    public ConnectionClosedException(String str) {
        super(HttpException.read(str));
    }

    public ConnectionClosedException(String str, Object... objArr) {
        super(HttpException.read(String.format(str, objArr)));
    }
}
