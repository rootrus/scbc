package org.apache.http.auth;

import org.apache.http.ProtocolException;

public class AuthenticationException extends ProtocolException {
    public AuthenticationException() {
    }

    public AuthenticationException(String str) {
        super(str);
    }

    public AuthenticationException(String str, Throwable th) {
        super(str, th);
    }
}
