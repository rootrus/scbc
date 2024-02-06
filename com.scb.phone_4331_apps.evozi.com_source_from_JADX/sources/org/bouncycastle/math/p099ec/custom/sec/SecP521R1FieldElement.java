package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement */
public class SecP521R1FieldElement extends ECFieldElement {

    /* renamed from: Q */
    public static final BigInteger f6247Q = SecP521R1Curve.f6245q;

    /* renamed from: x */
    protected int[] f6248x;

    public SecP521R1FieldElement() {
        this.f6248x = Nat.create(17);
    }

    public SecP521R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f6247Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f6248x = SecP521R1Field.fromBigInteger(bigInteger);
    }

    protected SecP521R1FieldElement(int[] iArr) {
        this.f6248x = iArr;
    }

    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        SecP521R1Field.add(this.f6248x, ((SecP521R1FieldElement) eCFieldElement).f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public ECFieldElement addOne() {
        int[] create = Nat.create(17);
        SecP521R1Field.addOne(this.f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        Mod.invert(SecP521R1Field.f6246P, ((SecP521R1FieldElement) eCFieldElement).f6248x, create);
        SecP521R1Field.multiply(create, this.f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SecP521R1FieldElement)) {
            return false;
        }
        return Nat.m6284eq(17, this.f6248x, ((SecP521R1FieldElement) obj).f6248x);
    }

    public String getFieldName() {
        return "SecP521R1Field";
    }

    public int getFieldSize() {
        return f6247Q.bitLength();
    }

    public int hashCode() {
        return f6247Q.hashCode() ^ Arrays.hashCode(this.f6248x, 0, 17);
    }

    public ECFieldElement invert() {
        int[] create = Nat.create(17);
        Mod.invert(SecP521R1Field.f6246P, this.f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public boolean isOne() {
        return Nat.isOne(17, this.f6248x);
    }

    public boolean isZero() {
        return Nat.isZero(17, this.f6248x);
    }

    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        SecP521R1Field.multiply(this.f6248x, ((SecP521R1FieldElement) eCFieldElement).f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public ECFieldElement negate() {
        int[] create = Nat.create(17);
        SecP521R1Field.negate(this.f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public ECFieldElement sqrt() {
        int[] iArr = this.f6248x;
        if (Nat.isZero(17, iArr) || Nat.isOne(17, iArr)) {
            return this;
        }
        int[] create = Nat.create(17);
        int[] create2 = Nat.create(17);
        SecP521R1Field.squareN(iArr, 519, create);
        SecP521R1Field.square(create, create2);
        if (Nat.m6284eq(17, iArr, create2)) {
            return new SecP521R1FieldElement(create);
        }
        return null;
    }

    public ECFieldElement square() {
        int[] create = Nat.create(17);
        SecP521R1Field.square(this.f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        SecP521R1Field.subtract(this.f6248x, ((SecP521R1FieldElement) eCFieldElement).f6248x, create);
        return new SecP521R1FieldElement(create);
    }

    public boolean testBitZero() {
        return Nat.getBit(this.f6248x, 0) == 1;
    }

    public BigInteger toBigInteger() {
        return Nat.toBigInteger(17, this.f6248x);
    }
}
