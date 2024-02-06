package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecT239FieldElement */
public class SecT239FieldElement extends ECFieldElement {

    /* renamed from: x */
    protected long[] f6254x;

    public SecT239FieldElement() {
        this.f6254x = Nat256.create64();
    }

    public SecT239FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f6254x = SecT239Field.fromBigInteger(bigInteger);
    }

    protected SecT239FieldElement(long[] jArr) {
        this.f6254x = jArr;
    }

    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] create64 = Nat256.create64();
        SecT239Field.add(this.f6254x, ((SecT239FieldElement) eCFieldElement).f6254x, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement addOne() {
        long[] create64 = Nat256.create64();
        SecT239Field.addOne(this.f6254x, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SecT239FieldElement)) {
            return false;
        }
        return Nat256.eq64(this.f6254x, ((SecT239FieldElement) obj).f6254x);
    }

    public String getFieldName() {
        return "SecT239Field";
    }

    public int getFieldSize() {
        return 239;
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

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6254x, 0, 4) ^ 23900158;
    }

    public ECFieldElement invert() {
        long[] create64 = Nat256.create64();
        SecT239Field.invert(this.f6254x, create64);
        return new SecT239FieldElement(create64);
    }

    public boolean isOne() {
        return Nat256.isOne64(this.f6254x);
    }

    public boolean isZero() {
        return Nat256.isZero64(this.f6254x);
    }

    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] create64 = Nat256.create64();
        SecT239Field.multiply(this.f6254x, ((SecT239FieldElement) eCFieldElement).f6254x, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f6254x;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f6254x;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f6254x;
        long[] jArr4 = ((SecT239FieldElement) eCFieldElement3).f6254x;
        long[] createExt64 = Nat256.createExt64();
        SecT239Field.multiplyAddToExt(jArr, jArr2, createExt64);
        SecT239Field.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = Nat256.create64();
        SecT239Field.reduce(createExt64, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement negate() {
        return this;
    }

    public ECFieldElement sqrt() {
        long[] create64 = Nat256.create64();
        SecT239Field.sqrt(this.f6254x, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement square() {
        long[] create64 = Nat256.create64();
        SecT239Field.square(this.f6254x, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f6254x;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f6254x;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f6254x;
        long[] createExt64 = Nat256.createExt64();
        SecT239Field.squareAddToExt(jArr, createExt64);
        SecT239Field.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = Nat256.create64();
        SecT239Field.reduce(createExt64, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement squarePow(int i) {
        if (i <= 0) {
            return this;
        }
        long[] create64 = Nat256.create64();
        SecT239Field.squareN(this.f6254x, i, create64);
        return new SecT239FieldElement(create64);
    }

    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    public boolean testBitZero() {
        return (this.f6254x[0] & 1) != 0;
    }

    public BigInteger toBigInteger() {
        return Nat256.toBigInteger64(this.f6254x);
    }
}
