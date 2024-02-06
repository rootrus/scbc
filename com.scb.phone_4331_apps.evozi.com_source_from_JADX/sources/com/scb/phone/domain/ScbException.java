package com.scb.phone.domain;

public class ScbException extends RuntimeException {
    public ScbException() {
    }

    public ScbException(String str, Throwable th) {
        super(str, th);
    }
}
