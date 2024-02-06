package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECMultiplier;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.math.p099ec.WTauNafMultiplier;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecT233K1Curve */
public class SecT233K1Curve extends ECCurve.AbstractF2m {
    private static final int SecT233K1_DEFAULT_COORDS = 6;
    protected SecT233K1Point infinity = new SecT233K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecT233K1Curve() {
        super(233, 74, 0, 0);
        this.f6163a = fromBigInteger(BigInteger.valueOf(0));
        this.f6164b = fromBigInteger(BigInteger.valueOf(1));
        this.order = new BigInteger(1, Hex.decode("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.cofactor = BigInteger.valueOf(4);
        this.coord = 6;
    }

    public ECCurve cloneCurve() {
        return new SecT233K1Curve();
    }

    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT233K1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT233K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT233FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return 233;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 74;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 233;
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
