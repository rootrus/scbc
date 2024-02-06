package org.bouncycastle.jce.spec;

import java.math.BigInteger;

public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* renamed from: x */
    private BigInteger f6150x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f6150x = bigInteger;
    }

    public BigInteger getX() {
        return this.f6150x;
    }
}
