package com.kofax.mobile.sdk.extract.server;

public class ExtractionServerException extends RuntimeException {
    private final int afP;

    /* renamed from: tC */
    private final String f4895tC;

    public ExtractionServerException(int i, String str) {
        this.afP = i;
        this.f4895tC = str;
    }

    public String getMessage() {
        return this.f4895tC;
    }

    public int getCode() {
        return this.afP;
    }
}
