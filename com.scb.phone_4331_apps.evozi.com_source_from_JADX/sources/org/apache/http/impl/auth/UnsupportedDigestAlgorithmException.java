package org.apache.http.impl.auth;

public class UnsupportedDigestAlgorithmException extends RuntimeException {
    public UnsupportedDigestAlgorithmException() {
    }

    public UnsupportedDigestAlgorithmException(String str) {
        super(str);
    }
}
