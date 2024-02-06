package org.apache.http.conn.ssl;

public class SSLInitializationException extends IllegalStateException {
    public SSLInitializationException(String str, Throwable th) {
        super(str, th);
    }
}
