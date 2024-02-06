package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecT131R1Curve */
public class SecT131R1Curve extends ECCurve.AbstractF2m {
    private static final int SecT131R1_DEFAULT_COORDS = 6;
    protected SecT131R1Point infinity = new SecT131R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecT131R1Curve() {
        super(131, 2, 3, 8);
        this.f6163a = fromBigInteger(new BigInteger(1, Hex.decode("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f6164b = fromBigInteger(new BigInteger(1, Hex.decode("0217C05610884B63B9C6C7291678F9D341")));
        this.order = new BigInteger(1, Hex.decode("0400000000000000023123953A9464B54D"));
        this.cofactor = BigInteger.valueOf(2);
        this.coord = 6;
    }

    public ECCurve cloneCurve() {
        return new SecT131R1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT131R1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT131R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT131FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return 131;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 3;
    }

    public int getK3() {
        return 8;
    }

    public int getM() {
        return 131;
    }

    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return false;
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }
}
