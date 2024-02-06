package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class ElGamalPrivateKeyParameters extends ElGamalKeyParameters {

    /* renamed from: x */
    private BigInteger f6050x;

    public ElGamalPrivateKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(true, elGamalParameters);
        this.f6050x = bigInteger;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ElGamalPrivateKeyParameters) && ((ElGamalPrivateKeyParameters) obj).getX().equals(this.f6050x)) {
            return super.equals(obj);
        }
        return false;
    }

    public BigInteger getX() {
        return this.f6050x;
    }

    public int hashCode() {
        return getX().hashCode();
    }
}
