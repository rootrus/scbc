package org.apache.http;

import java.io.IOException;

public class MalformedChunkCodingException extends IOException {
    public MalformedChunkCodingException() {
    }

    public MalformedChunkCodingException(String str) {
        super(str);
    }
}
