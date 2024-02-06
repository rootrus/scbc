package org.apache.http.client;

public class CircularRedirectException extends RedirectException {
    public CircularRedirectException() {
    }

    public CircularRedirectException(String str) {
        super(str);
    }
}
