package org.apache.http;

public class ParseException extends RuntimeException {
    public ParseException() {
    }

    public ParseException(String str) {
        super(str);
    }
}
