package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* renamed from: y */
    private BigInteger f6051y;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f6051y = bigInteger;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj).getY().equals(this.f6051y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f6051y;
    }

    public int hashCode() {
        return this.f6051y.hashCode() ^ super.hashCode();
    }
}
