package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
    /* access modifiers changed from: protected */
    public String write() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        String write = write();
        if (write == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (write != null) {
            sb.append(write);
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getMessage());
        return sb.toString();
    }
}
