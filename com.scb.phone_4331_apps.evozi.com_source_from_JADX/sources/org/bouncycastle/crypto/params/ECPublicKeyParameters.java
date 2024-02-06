package org.bouncycastle.crypto.params;

import org.bouncycastle.math.p099ec.ECPoint;

public class ECPublicKeyParameters extends ECKeyParameters {

    /* renamed from: Q */
    ECPoint f6046Q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f6046Q = eCPoint.normalize();
    }

    public ECPoint getQ() {
        return this.f6046Q;
    }
}
