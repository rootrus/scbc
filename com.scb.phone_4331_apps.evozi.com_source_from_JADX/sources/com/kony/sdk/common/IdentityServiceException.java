package com.kony.sdk.common;

public class IdentityServiceException extends KonyException {
    private String MediaBrowserCompat$CustomActionResultReceiver = null;
    public String write = null;

    public IdentityServiceException(String str) {
        super(str);
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public IdentityServiceException(String str, byte b) {
        super(str);
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public String getMessage() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
