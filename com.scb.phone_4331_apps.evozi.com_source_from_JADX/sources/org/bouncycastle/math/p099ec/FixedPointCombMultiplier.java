package org.bouncycastle.math.p099ec;

import java.math.BigInteger;

/* renamed from: org.bouncycastle.math.ec.FixedPointCombMultiplier */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    /* access modifiers changed from: protected */
    public int getWidthForCombSize(int i) {
        return i > 257 ? 6 : 5;
    }

    /* access modifiers changed from: protected */
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() <= combSize) {
            FixedPointPreCompInfo precompute = FixedPointUtil.precompute(eCPoint, getWidthForCombSize(combSize));
            ECPoint[] preComp = precompute.getPreComp();
            int width = precompute.getWidth();
            int i = ((combSize + width) - 1) / width;
            ECPoint infinity = curve.getInfinity();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = 0;
                for (int i4 = ((width * i) - 1) - i2; i4 >= 0; i4 -= i) {
                    i3 <<= 1;
                    if (bigInteger.testBit(i4)) {
                        i3 |= 1;
                    }
                }
                infinity = infinity.twicePlus(preComp[i3]);
            }
            return infinity;
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
