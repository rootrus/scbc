package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g */
    private BigInteger f6148g;

    /* renamed from: p */
    private BigInteger f6149p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f6149p = bigInteger;
        this.f6148g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f6148g;
    }

    public BigInteger getP() {
        return this.f6149p;
    }
}
