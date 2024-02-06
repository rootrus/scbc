package org.bouncycastle.math.p099ec.endo;

import java.math.BigInteger;

/* renamed from: org.bouncycastle.math.ec.endo.GLVTypeBParameters */
public class GLVTypeBParameters {
    protected final BigInteger beta;
    protected final int bits;

    /* renamed from: g1 */
    protected final BigInteger f6259g1;

    /* renamed from: g2 */
    protected final BigInteger f6260g2;
    protected final BigInteger lambda;
    protected final BigInteger v1A;
    protected final BigInteger v1B;
    protected final BigInteger v2A;
    protected final BigInteger v2B;

    public GLVTypeBParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        checkVector(bigIntegerArr, "v1");
        checkVector(bigIntegerArr2, "v2");
        this.beta = bigInteger;
        this.lambda = bigInteger2;
        this.v1A = bigIntegerArr[0];
        this.v1B = bigIntegerArr[1];
        this.v2A = bigIntegerArr2[0];
        this.v2B = bigIntegerArr2[1];
        this.f6259g1 = bigInteger3;
        this.f6260g2 = bigInteger4;
        this.bits = i;
    }

    private static void checkVector(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(str);
            sb.append("' must consist of exactly 2 (non-null) values");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public BigInteger getBeta() {
        return this.beta;
    }

    public int getBits() {
        return this.bits;
    }

    public BigInteger getG1() {
        return this.f6259g1;
    }

    public BigInteger getG2() {
        return this.f6260g2;
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public BigInteger[] getV1() {
        return new BigInteger[]{this.v1A, this.v1B};
    }

    public BigInteger getV1A() {
        return this.v1A;
    }

    public BigInteger getV1B() {
        return this.v1B;
    }

    public BigInteger[] getV2() {
        return new BigInteger[]{this.v2A, this.v2B};
    }

    public BigInteger getV2A() {
        return this.v2A;
    }

    public BigInteger getV2B() {
        return this.v2B;
    }
}
