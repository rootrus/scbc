package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* renamed from: x */
    private BigInteger f6040x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f6040x = bigInteger;
    }

    public BigInteger getX() {
        return this.f6040x;
    }
}
