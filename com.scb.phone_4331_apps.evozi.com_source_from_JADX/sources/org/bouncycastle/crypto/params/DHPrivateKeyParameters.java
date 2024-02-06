package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPrivateKeyParameters extends DHKeyParameters {

    /* renamed from: x */
    private BigInteger f6033x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f6033x = bigInteger;
    }

    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f6033x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f6033x;
    }

    public int hashCode() {
        return this.f6033x.hashCode() ^ super.hashCode();
    }
}
