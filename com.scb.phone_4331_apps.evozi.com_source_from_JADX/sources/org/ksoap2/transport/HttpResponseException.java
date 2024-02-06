package org.ksoap2.transport;

import java.io.IOException;

public class HttpResponseException extends IOException {
    public HttpResponseException(String str) {
        super(str);
    }
}
