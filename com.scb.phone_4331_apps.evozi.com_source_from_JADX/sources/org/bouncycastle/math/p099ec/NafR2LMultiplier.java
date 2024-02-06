package org.bouncycastle.math.p099ec;

import java.math.BigInteger;

/* renamed from: org.bouncycastle.math.ec.NafR2LMultiplier */
public class NafR2LMultiplier extends AbstractECMultiplier {
    /* access modifiers changed from: protected */
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        int[] generateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int i = 0;
        int i2 = 0;
        while (i < generateCompactNaf.length) {
            int i3 = generateCompactNaf[i];
            eCPoint = eCPoint.timesPow2(i2 + (65535 & i3));
            infinity = infinity.add((i3 >> 16) < 0 ? eCPoint.negate() : eCPoint);
            i++;
            i2 = 1;
        }
        return infinity;
    }
}
