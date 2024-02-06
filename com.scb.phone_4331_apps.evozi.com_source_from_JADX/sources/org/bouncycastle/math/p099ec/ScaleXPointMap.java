package org.bouncycastle.math.p099ec;

/* renamed from: org.bouncycastle.math.ec.ScaleXPointMap */
public class ScaleXPointMap implements ECPointMap {
    protected final ECFieldElement scale;

    public ScaleXPointMap(ECFieldElement eCFieldElement) {
        this.scale = eCFieldElement;
    }

    public ECPoint map(ECPoint eCPoint) {
        return eCPoint.scaleX(this.scale);
    }
}
