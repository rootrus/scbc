package org.bouncycastle.math.p099ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP192R1Field */
public class SecP192R1Field {

    /* renamed from: M */
    private static final long f6213M = 4294967295L;

    /* renamed from: P */
    static final int[] f6214P = {-1, -1, -2, -1, -1, -1};

    /* renamed from: P5 */
    private static final int f6215P5 = -1;
    static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int PExt11 = -1;
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Nat192.gte(iArr3, f6214P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, PExtInv.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, f6214P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (((long) iArr[0]) & f6213M) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f6213M);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (f6213M & ((long) iArr[2])) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            Nat.incAt(6, iArr, 3);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat192.fromBigInteger(bigInteger);
        if (fromBigInteger[5] == -1 && Nat192.gte(fromBigInteger, f6214P)) {
            Nat192.subFrom(f6214P, fromBigInteger);
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(6, iArr2, Nat192.add(iArr, f6214P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat192.createExt();
        Nat192.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, PExtInv.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat192.isZero(iArr)) {
            Nat192.zero(iArr2);
        } else {
            Nat192.sub(f6214P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[6]) & f6213M;
        long j2 = ((long) iArr[7]) & f6213M;
        long j3 = (((long) iArr[10]) & f6213M) + j;
        long j4 = (((long) iArr[11]) & f6213M) + j2;
        long j5 = j2;
        long j6 = (((long) iArr[0]) & f6213M) + j3;
        int i = (int) j6;
        long j7 = (j6 >> 32) + (((long) iArr[1]) & f6213M) + j4;
        iArr3[1] = (int) j7;
        long j8 = j3 + (((long) iArr[8]) & f6213M);
        long j9 = j4 + (((long) iArr[9]) & f6213M);
        long j10 = (j7 >> 32) + (((long) iArr[2]) & f6213M) + j8;
        long j11 = (j10 >> 32) + (((long) iArr[3]) & f6213M) + j9;
        iArr3[3] = (int) j11;
        long j12 = (j11 >> 32) + (((long) iArr[4]) & f6213M) + (j8 - j);
        iArr3[4] = (int) j12;
        long j13 = (j12 >> 32) + (((long) iArr[5]) & f6213M) + (j9 - j5);
        iArr3[5] = (int) j13;
        long j14 = j13 >> 32;
        long j15 = (j10 & f6213M) + j14;
        long j16 = j14 + (((long) i) & f6213M);
        iArr3[0] = (int) j16;
        long j17 = j16 >> 32;
        if (j17 != 0) {
            long j18 = j17 + (f6213M & ((long) iArr3[1]));
            iArr3[1] = (int) j18;
            j15 += j18 >> 32;
        }
        iArr3[2] = (int) j15;
        if (((j15 >> 32) != 0 && Nat.incAt(6, iArr3, 3) != 0) || (iArr3[5] == -1 && Nat192.gte(iArr3, f6214P))) {
            addPInvTo(iArr2);
        }
    }

    public static void reduce32(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & f6213M;
            long j3 = (((long) iArr[0]) & f6213M) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & f6213M);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + (f6213M & ((long) iArr[2])) + j2;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && Nat.incAt(6, iArr, 3) != 0) || (iArr[5] == -1 && Nat192.gte(iArr, f6214P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat192.createExt();
        Nat192.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = Nat192.createExt();
        Nat192.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i > 0) {
                Nat192.square(iArr2, createExt);
            } else {
                return;
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (((long) iArr[0]) & f6213M) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & f6213M);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((f6213M & ((long) iArr[2])) - 1);
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            Nat.decAt(6, iArr, 3);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(12, iArr3, PExtInv.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, f6214P))) {
            addPInvTo(iArr2);
        }
    }
}
