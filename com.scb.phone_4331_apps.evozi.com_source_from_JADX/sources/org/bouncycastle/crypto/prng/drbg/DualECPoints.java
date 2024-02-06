package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.p099ec.ECPoint;

public class DualECPoints {
    private final int cofactor;

    /* renamed from: p */
    private final ECPoint f6086p;

    /* renamed from: q */
    private final ECPoint f6087q;
    private final int securityStrength;

    public DualECPoints(int i, ECPoint eCPoint, ECPoint eCPoint2, int i2) {
        if (eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            this.securityStrength = i;
            this.f6086p = eCPoint;
            this.f6087q = eCPoint2;
            this.cofactor = i2;
            return;
        }
        throw new IllegalArgumentException("points need to be on the same curve");
    }

    private static int log2(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f6086p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) << 3;
    }

    public ECPoint getP() {
        return this.f6086p;
    }

    public ECPoint getQ() {
        return this.f6087q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f6086p.getCurve().getFieldSize();
    }
}
