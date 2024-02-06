package org.spongycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException {
    private Throwable read;

    public ASN1Exception(String str) {
        super(str);
    }

    public ASN1Exception(String str, Throwable th) {
        super(str);
        this.read = th;
    }

    public Throwable getCause() {
        return this.read;
    }
}
