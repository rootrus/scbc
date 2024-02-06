package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f6159a;

    /* renamed from: p */
    private BigInteger f6160p;

    /* renamed from: q */
    private BigInteger f6161q;

    /* renamed from: y */
    private BigInteger f6162y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f6162y = bigInteger;
        this.f6160p = bigInteger2;
        this.f6161q = bigInteger3;
        this.f6159a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f6159a;
    }

    public BigInteger getP() {
        return this.f6160p;
    }

    public BigInteger getQ() {
        return this.f6161q;
    }

    public BigInteger getY() {
        return this.f6162y;
    }
}
