package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECMultiplier;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.math.p099ec.WTauNafMultiplier;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecT239K1Curve */
public class SecT239K1Curve extends ECCurve.AbstractF2m {
    private static final int SecT239K1_DEFAULT_COORDS = 6;
    protected SecT239K1Point infinity = new SecT239K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecT239K1Curve() {
        super(239, 158, 0, 0);
        this.f6163a = fromBigInteger(BigInteger.valueOf(0));
        this.f6164b = fromBigInteger(BigInteger.valueOf(1));
        this.order = new BigInteger(1, Hex.decode("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4);
        this.coord = 6;
    }

    public ECCurve cloneCurve() {
        return new SecT239K1Curve();
    }

    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT239FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return 239;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }
}
