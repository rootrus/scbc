package org.apache.http.cookie;

import org.apache.http.ProtocolException;

public class MalformedCookieException extends ProtocolException {
    public MalformedCookieException() {
    }

    public MalformedCookieException(String str) {
        super(str);
    }
}
