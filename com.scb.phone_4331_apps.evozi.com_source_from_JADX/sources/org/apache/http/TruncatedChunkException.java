package org.apache.http;

public class TruncatedChunkException extends MalformedChunkCodingException {
    public TruncatedChunkException(String str, Object... objArr) {
        super(HttpException.read(String.format(str, objArr)));
    }
}
