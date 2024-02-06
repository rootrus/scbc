package org.apache.http.cookie;

public class CookieRestrictionViolationException extends MalformedCookieException {
    public CookieRestrictionViolationException() {
    }

    public CookieRestrictionViolationException(String str) {
        super(str);
    }
}
