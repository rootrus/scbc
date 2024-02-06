package com.kony.sdk.common;

public class IntegrationServiceException extends KonyException {
    private String IconCompatParcelizer = null;
    private String write = null;

    public IntegrationServiceException(String str) {
        super(str);
        this.write = str;
    }

    public IntegrationServiceException(String str, String str2) {
        super(str2);
        this.IconCompatParcelizer = str;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public String getMessage() {
        return this.write;
    }
}
