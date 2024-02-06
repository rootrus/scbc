package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f6152a;

    /* renamed from: p */
    private BigInteger f6153p;

    /* renamed from: q */
    private BigInteger f6154q;

    /* renamed from: x */
    private BigInteger f6155x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f6155x = bigInteger;
        this.f6153p = bigInteger2;
        this.f6154q = bigInteger3;
        this.f6152a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f6152a;
    }

    public BigInteger getP() {
        return this.f6153p;
    }

    public BigInteger getQ() {
        return this.f6154q;
    }

    public BigInteger getX() {
        return this.f6155x;
    }
}
