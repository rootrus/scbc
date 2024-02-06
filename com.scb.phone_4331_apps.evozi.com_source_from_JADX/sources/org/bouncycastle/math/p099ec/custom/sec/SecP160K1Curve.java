package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECConstants;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP160K1Curve */
public class SecP160K1Curve extends ECCurve.AbstractFp {
    private static final int SECP160K1_DEFAULT_COORDS = 2;

    /* renamed from: q */
    public static final BigInteger f6195q = SecP160R2Curve.f6202q;
    protected SecP160K1Point infinity = new SecP160K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecP160K1Curve() {
        super(f6195q);
        this.f6163a = fromBigInteger(ECConstants.ZERO);
        this.f6164b = fromBigInteger(BigInteger.valueOf(7));
        this.order = new BigInteger(1, Hex.decode("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.cofactor = BigInteger.valueOf(1);
        this.coord = 2;
    }

    public ECCurve cloneCurve() {
        return new SecP160K1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP160K1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP160K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R2FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return f6195q.bitLength();
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f6195q;
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }
}
