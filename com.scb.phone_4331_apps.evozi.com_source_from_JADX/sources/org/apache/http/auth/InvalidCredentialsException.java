package org.apache.http.auth;

public class InvalidCredentialsException extends AuthenticationException {
    public InvalidCredentialsException() {
    }

    public InvalidCredentialsException(String str, Throwable th) {
        super(str, th);
    }
}
