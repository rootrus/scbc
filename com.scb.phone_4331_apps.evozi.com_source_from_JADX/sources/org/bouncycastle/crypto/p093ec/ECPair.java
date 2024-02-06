package org.bouncycastle.crypto.p093ec;

import org.bouncycastle.math.p099ec.ECPoint;

/* renamed from: org.bouncycastle.crypto.ec.ECPair */
public class ECPair {

    /* renamed from: x */
    private final ECPoint f5803x;

    /* renamed from: y */
    private final ECPoint f5804y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f5803x = eCPoint;
        this.f5804y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f5803x;
    }

    public ECPoint getY() {
        return this.f5804y;
    }

    public int hashCode() {
        return this.f5803x.hashCode() + (this.f5804y.hashCode() * 37);
    }
}
