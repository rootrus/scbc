package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.math.raw.Nat256;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP128R1Field */
public class SecP128R1Field {

    /* renamed from: M */
    private static final long f6190M = 4294967295L;

    /* renamed from: P */
    static final int[] f6191P = {-1, -1, -1, -3};

    /* renamed from: P3 */
    private static final int f6192P3 = -3;
    static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int PExt7 = -4;
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.add(iArr, iArr2, iArr3) != 0 || (iArr3[3] == -3 && Nat128.gte(iArr3, f6191P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(4, iArr, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, f6191P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (((long) iArr[0]) & f6190M) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f6190M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f6190M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (f6190M & ((long) iArr[3])) + 2);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat128.fromBigInteger(bigInteger);
        if (fromBigInteger[3] == -3 && Nat128.gte(fromBigInteger, f6191P)) {
            Nat128.subFrom(f6191P, fromBigInteger);
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(4, iArr2, Nat128.add(iArr, f6191P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat128.createExt();
        Nat128.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat128.isZero(iArr)) {
            Nat128.zero(iArr2);
        } else {
            Nat128.sub(f6191P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = (long) iArr[3];
        long j2 = ((long) iArr[7]) & f6190M;
        long j3 = (((long) iArr[6]) & f6190M) + (j2 << 1);
        long j4 = (((long) iArr[5]) & f6190M) + (j3 << 1);
        long j5 = (((long) iArr[4]) & f6190M) + (j4 << 1);
        long j6 = (((long) iArr[0]) & f6190M) + j5;
        iArr3[0] = (int) j6;
        long j7 = (((long) iArr[1]) & f6190M) + j4 + (j6 >>> 32);
        iArr3[1] = (int) j7;
        long j8 = (((long) iArr[2]) & f6190M) + j3 + (j7 >>> 32);
        iArr3[2] = (int) j8;
        long j9 = (j & f6190M) + j2 + (j5 << 1) + (j8 >>> 32);
        iArr3[3] = (int) j9;
        reduce32((int) (j9 >>> 32), iArr3);
    }

    public static void reduce32(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & f6190M;
            long j2 = (((long) iArr[0]) & f6190M) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & f6190M);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & f6190M);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (f6190M & ((long) iArr[3])) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat128.createExt();
        Nat128.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = Nat128.createExt();
        Nat128.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i > 0) {
                Nat128.square(iArr2, createExt);
            } else {
                return;
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (((long) iArr[0]) & f6190M) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f6190M);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & f6190M);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + ((f6190M & ((long) iArr[3])) - 2));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            Nat.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, f6191P))) {
            addPInvTo(iArr2);
        }
    }
}
