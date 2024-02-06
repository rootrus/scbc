package org.apache.http;

import java.nio.charset.CharacterCodingException;

public class MessageConstraintException extends CharacterCodingException {
    private final String MediaBrowserCompat$ItemReceiver;

    public MessageConstraintException(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public String getMessage() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
