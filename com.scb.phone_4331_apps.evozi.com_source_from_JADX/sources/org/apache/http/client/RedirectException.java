package org.apache.http.client;

import org.apache.http.ProtocolException;

public class RedirectException extends ProtocolException {
    public RedirectException() {
    }

    public RedirectException(String str) {
        super(str);
    }
}
