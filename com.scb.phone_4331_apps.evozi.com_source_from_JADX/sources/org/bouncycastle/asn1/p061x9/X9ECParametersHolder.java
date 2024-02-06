package org.bouncycastle.asn1.p061x9;

/* renamed from: org.bouncycastle.asn1.x9.X9ECParametersHolder */
public abstract class X9ECParametersHolder {
    private X9ECParameters params;

    /* access modifiers changed from: protected */
    public abstract X9ECParameters createParameters();

    public X9ECParameters getParameters() {
        X9ECParameters x9ECParameters;
        synchronized (this) {
            if (this.params == null) {
                this.params = createParameters();
            }
            x9ECParameters = this.params;
        }
        return x9ECParameters;
    }
}
