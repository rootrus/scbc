package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class SRP6GroupParameters {

    /* renamed from: N */
    private BigInteger f6076N;

    /* renamed from: g */
    private BigInteger f6077g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f6076N = bigInteger;
        this.f6077g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f6077g;
    }

    public BigInteger getN() {
        return this.f6076N;
    }
}
