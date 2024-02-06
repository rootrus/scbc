package org.spongycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

public class ExtCertPathBuilderException extends CertPathBuilderException {
    private Throwable write;

    public ExtCertPathBuilderException(String str, Throwable th) {
        super(str);
        this.write = th;
    }

    public Throwable getCause() {
        return this.write;
    }
}
