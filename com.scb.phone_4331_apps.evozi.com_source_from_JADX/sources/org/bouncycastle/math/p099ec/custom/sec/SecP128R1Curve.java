package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP128R1Curve */
public class SecP128R1Curve extends ECCurve.AbstractFp {
    private static final int SecP128R1_DEFAULT_COORDS = 2;

    /* renamed from: q */
    public static final BigInteger f6189q = new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    protected SecP128R1Point infinity = new SecP128R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public SecP128R1Curve() {
        super(f6189q);
        this.f6163a = fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f6164b = fromBigInteger(new BigInteger(1, Hex.decode("E87579C11079F43DD824993C2CEE5ED3")));
        this.order = new BigInteger(1, Hex.decode("FFFFFFFE0000000075A30D1B9038A115"));
        this.cofactor = BigInteger.valueOf(1);
        this.coord = 2;
    }

    public ECCurve cloneCurve() {
        return new SecP128R1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, z);
    }

    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP128R1FieldElement(bigInteger);
    }

    public int getFieldSize() {
        return f6189q.bitLength();
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f6189q;
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }
}
