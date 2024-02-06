package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP160R1Curve */
public class SecP160R1Curve extends ECCurve.AbstractFp {
    private static final int SecP160R1_DEFAULT_COORDS = 2;

    /* renamed from: q */
    public static final BigInteger f6196q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    protected SecP160R1Point infinity = new SecP160R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecP160R1Curve() {
        super(f6196q);
        this.f6163a = fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f6164b = fromBigInteger(new BigInteger(1, Hex.decode("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.order = new BigInteger(1, Hex.decode("0100000000000000000001F4C8F927AED3CA752257"));
        this.cofactor = BigInteger.valueOf(1);
        this.coord = 2;
    }

    public ECCurve cloneCurve() {
        return new SecP160R1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R1FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return f6196q.bitLength();
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f6196q;
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }
}
