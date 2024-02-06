package org.spongycastle.asn1;

public class ASN1ParsingException extends IllegalStateException {
    private Throwable IconCompatParcelizer;

    public ASN1ParsingException(String str) {
        super(str);
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.IconCompatParcelizer = th;
    }

    public Throwable getCause() {
        return this.IconCompatParcelizer;
    }
}
