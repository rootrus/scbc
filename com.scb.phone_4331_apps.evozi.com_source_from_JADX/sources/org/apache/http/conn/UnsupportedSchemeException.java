package org.apache.http.conn;

import java.io.IOException;

public class UnsupportedSchemeException extends IOException {
    public UnsupportedSchemeException(String str) {
        super(str);
    }
}
