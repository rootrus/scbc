package org.bouncycastle.math.p099ec.custom.sec;

import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP160R1Field */
public class SecP160R1Field {

    /* renamed from: M */
    private static final long f6197M = 4294967295L;

    /* renamed from: P */
    static final int[] f6198P = {Api.BaseClientBuilder.API_PRIORITY_OTHER, -1, -1, -1, -1};

    /* renamed from: P4 */
    private static final int f6199P4 = -1;
    static final int[] PExt = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int PExt9 = -1;
    private static final int[] PExtInv = {-1, -1073741826, -1, -1, -1, 1, 1};
    private static final int PInv = -2147483647;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Nat160.gte(iArr3, f6198P))) {
            Nat.addWordTo(5, PInv, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(10, iArr3, PExtInv.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f6198P))) {
            Nat.addWordTo(5, PInv, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat160.fromBigInteger(bigInteger);
        if (fromBigInteger[4] == -1 && Nat160.gte(fromBigInteger, f6198P)) {
            Nat160.subFrom(f6198P, fromBigInteger);
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(5, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(5, iArr2, Nat160.add(iArr, f6198P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat160.createExt();
        Nat160.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(10, iArr3, PExtInv.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat160.isZero(iArr)) {
            Nat160.zero(iArr2);
        } else {
            Nat160.sub(f6198P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[5]) & f6197M;
        long j2 = ((long) iArr[6]) & f6197M;
        long j3 = ((long) iArr[7]) & f6197M;
        long j4 = ((long) iArr[8]) & f6197M;
        long j5 = ((long) iArr[9]) & f6197M;
        long j6 = (((long) iArr[0]) & f6197M) + j + (j << 31);
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[1]) & f6197M) + j2 + (j2 << 31);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & f6197M) + j3 + (j3 << 31);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & f6197M) + j4 + (j4 << 31);
        iArr3[3] = (int) j9;
        long j10 = (j9 >>> 32) + (f6197M & ((long) iArr[4])) + j5 + (j5 << 31);
        iArr3[4] = (int) j10;
        reduce32((int) (j10 >>> 32), iArr3);
    }

    public static void reduce32(int i, int[] iArr) {
        if ((i != 0 && Nat160.mulWordsAdd(PInv, i, iArr, 0) != 0) || (iArr[4] == -1 && Nat160.gte(iArr, f6198P))) {
            Nat.addWordTo(5, PInv, iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat160.createExt();
        Nat160.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = Nat160.createExt();
        Nat160.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i > 0) {
                Nat160.square(iArr2, createExt);
            } else {
                return;
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.sub(iArr, iArr2, iArr3) != 0) {
            Nat.subWordFrom(5, PInv, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(10, iArr3, PExtInv.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, f6198P))) {
            Nat.addWordTo(5, PInv, iArr2);
        }
    }
}
