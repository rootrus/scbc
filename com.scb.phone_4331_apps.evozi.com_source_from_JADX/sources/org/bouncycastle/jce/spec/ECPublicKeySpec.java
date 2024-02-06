package org.bouncycastle.jce.spec;

import org.bouncycastle.math.p099ec.ECPoint;

public class ECPublicKeySpec extends ECKeySpec {

    /* renamed from: q */
    private ECPoint f6147q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f6147q = eCPoint.getCurve() != null ? eCPoint.normalize() : eCPoint;
    }

    public ECPoint getQ() {
        return this.f6147q;
    }
}
