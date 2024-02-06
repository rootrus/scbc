package org.apache.http;

import java.io.IOException;

public class NoHttpResponseException extends IOException {
    public NoHttpResponseException(String str) {
        super(HttpException.read(str));
    }
}
