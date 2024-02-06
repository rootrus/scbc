package org.bouncycastle.jce.spec;

import java.math.BigInteger;

public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a */
    private BigInteger f6156a;

    /* renamed from: p */
    private BigInteger f6157p;

    /* renamed from: q */
    private BigInteger f6158q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f6157p = bigInteger;
        this.f6158q = bigInteger2;
        this.f6156a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PublicKeyParameterSetSpec)) {
            return false;
        }
        GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
        return this.f6156a.equals(gOST3410PublicKeyParameterSetSpec.f6156a) && this.f6157p.equals(gOST3410PublicKeyParameterSetSpec.f6157p) && this.f6158q.equals(gOST3410PublicKeyParameterSetSpec.f6158q);
    }

    public BigInteger getA() {
        return this.f6156a;
    }

    public BigInteger getP() {
        return this.f6157p;
    }

    public BigInteger getQ() {
        return this.f6158q;
    }

    public int hashCode() {
        return (this.f6156a.hashCode() ^ this.f6157p.hashCode()) ^ this.f6158q.hashCode();
    }
}
