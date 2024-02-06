package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP224R1Curve */
public class SecP224R1Curve extends ECCurve.AbstractFp {
    private static final int SecP224R1_DEFAULT_COORDS = 2;

    /* renamed from: q */
    public static final BigInteger f6223q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    protected SecP224R1Point infinity = new SecP224R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecP224R1Curve() {
        super(f6223q);
        this.f6163a = fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f6164b = fromBigInteger(new BigInteger(1, Hex.decode("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.order = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.cofactor = BigInteger.valueOf(1);
        this.coord = 2;
    }

    public ECCurve cloneCurve() {
        return new SecP224R1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP224R1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP224R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP224R1FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return f6223q.bitLength();
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f6223q;
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }
}
