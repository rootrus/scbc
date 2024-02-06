package com.kofax.mobile.sdk.extract.p018id;

/* renamed from: com.kofax.mobile.sdk.extract.id.AggregateException */
public class AggregateException extends RuntimeException {
    private final Exception adE;
    private final Exception adF;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateException(Exception exc, Exception exc2) {
        super(exc != null ? exc.getMessage() : exc2.getMessage(), exc != null ? exc : exc2);
        this.adE = exc;
        this.adF = exc2;
    }

    public Exception getFrontException() {
        return this.adE;
    }

    public Exception getBackException() {
        return this.adF;
    }
}
