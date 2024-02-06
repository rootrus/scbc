package org.apache.http.auth;

import org.apache.http.ProtocolException;

public class MalformedChallengeException extends ProtocolException {
    public MalformedChallengeException() {
    }

    public MalformedChallengeException(String str) {
        super(str);
    }
}
