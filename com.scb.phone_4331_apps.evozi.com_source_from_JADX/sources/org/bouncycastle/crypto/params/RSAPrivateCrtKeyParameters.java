package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* renamed from: dP */
    private BigInteger f6071dP;

    /* renamed from: dQ */
    private BigInteger f6072dQ;

    /* renamed from: e */
    private BigInteger f6073e;

    /* renamed from: p */
    private BigInteger f6074p;

    /* renamed from: q */
    private BigInteger f6075q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f6073e = bigInteger2;
        this.f6074p = bigInteger4;
        this.f6075q = bigInteger5;
        this.f6071dP = bigInteger6;
        this.f6072dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f6071dP;
    }

    public BigInteger getDQ() {
        return this.f6072dQ;
    }

    public BigInteger getP() {
        return this.f6074p;
    }

    public BigInteger getPublicExponent() {
        return this.f6073e;
    }

    public BigInteger getQ() {
        return this.f6075q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
