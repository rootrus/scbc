package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecT113R1Curve */
public class SecT113R1Curve extends ECCurve.AbstractF2m {
    private static final int SecT113R1_DEFAULT_COORDS = 6;
    protected SecT113R1Point infinity = new SecT113R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecT113R1Curve() {
        super(113, 9, 0, 0);
        this.f6163a = fromBigInteger(new BigInteger(1, Hex.decode("003088250CA6E7C7FE649CE85820F7")));
        this.f6164b = fromBigInteger(new BigInteger(1, Hex.decode("00E8BEE4D3E2260744188BE0E9C723")));
        this.order = new BigInteger(1, Hex.decode("0100000000000000D9CCEC8A39E56F"));
        this.cofactor = BigInteger.valueOf(2);
        this.coord = 6;
    }

    public ECCurve cloneCurve() {
        return new SecT113R1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT113R1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT113R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT113FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return 113;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return true;
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }
}
