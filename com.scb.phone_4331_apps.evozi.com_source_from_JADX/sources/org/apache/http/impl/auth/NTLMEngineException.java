package org.apache.http.impl.auth;

import org.apache.http.auth.AuthenticationException;

public class NTLMEngineException extends AuthenticationException {
    public NTLMEngineException() {
    }

    public NTLMEngineException(String str) {
        super(str);
    }

    public NTLMEngineException(String str, Throwable th) {
        super(str, th);
    }
}
