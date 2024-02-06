package org.bouncycastle.math.p099ec;

import java.math.BigInteger;

/* renamed from: org.bouncycastle.math.ec.AbstractECMultiplier */
public abstract class AbstractECMultiplier implements ECMultiplier {
    public ECPoint multiply(ECPoint eCPoint, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || eCPoint.isInfinity()) {
            return eCPoint.getCurve().getInfinity();
        }
        ECPoint multiplyPositive = multiplyPositive(eCPoint, bigInteger.abs());
        if (signum <= 0) {
            multiplyPositive = multiplyPositive.negate();
        }
        return ECAlgorithms.validatePoint(multiplyPositive);
    }

    /* access modifiers changed from: protected */
    public abstract ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger);
}
