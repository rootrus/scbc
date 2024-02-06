package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.JsonMappingException;

public abstract class PropertyBindingException extends JsonMappingException {
    public final String write() {
        return null;
    }
}
