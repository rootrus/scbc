package org.bouncycastle.jce.spec;

import java.math.BigInteger;

public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* renamed from: y */
    private BigInteger f6151y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f6151y = bigInteger;
    }

    public BigInteger getY() {
        return this.f6151y;
    }
}
