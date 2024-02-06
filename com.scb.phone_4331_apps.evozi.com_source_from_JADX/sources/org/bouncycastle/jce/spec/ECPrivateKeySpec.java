package org.bouncycastle.jce.spec;

import java.math.BigInteger;

public class ECPrivateKeySpec extends ECKeySpec {

    /* renamed from: d */
    private BigInteger f6146d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f6146d = bigInteger;
    }

    public BigInteger getD() {
        return this.f6146d;
    }
}
