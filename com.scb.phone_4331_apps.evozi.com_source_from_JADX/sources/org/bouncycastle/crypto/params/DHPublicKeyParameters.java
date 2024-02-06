package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPublicKeyParameters extends DHKeyParameters {

    /* renamed from: y */
    private BigInteger f6034y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f6034y = bigInteger;
    }

    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f6034y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f6034y;
    }

    public int hashCode() {
        return this.f6034y.hashCode() ^ super.hashCode();
    }
}
