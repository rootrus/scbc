package org.spongycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

public class ExtCertPathValidatorException extends CertPathValidatorException {
    private Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public ExtCertPathValidatorException(String str, Throwable th) {
        super(str);
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public ExtCertPathValidatorException(String str, Throwable th, CertPath certPath, int i) {
        super(str, th, certPath, i);
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public Throwable getCause() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
