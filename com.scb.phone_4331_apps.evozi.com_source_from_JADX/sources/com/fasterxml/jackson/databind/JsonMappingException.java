package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonMappingException extends JsonProcessingException {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getMessage());
        return sb.toString();
    }

    public String getLocalizedMessage() {
        return super.getMessage();
    }

    public String getMessage() {
        return super.getMessage();
    }
}
