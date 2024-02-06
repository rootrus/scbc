package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;

public abstract class Nat160 {

    /* renamed from: M */
    private static final long f6265M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6265M) + (((long) iArr2[0]) & f6265M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6265M) + (((long) iArr2[1]) & f6265M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6265M) + (((long) iArr2[2]) & f6265M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6265M) + (((long) iArr2[3]) & f6265M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6265M) + (((long) iArr2[4]) & f6265M);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6265M) + (((long) iArr2[0]) & f6265M) + (((long) iArr3[0]) & f6265M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6265M) + (((long) iArr2[1]) & f6265M) + (((long) iArr3[1]) & f6265M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6265M) + (((long) iArr2[2]) & f6265M) + (((long) iArr3[2]) & f6265M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6265M) + (((long) iArr2[3]) & f6265M) + (((long) iArr3[3]) & f6265M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6265M) + (((long) iArr2[4]) & f6265M) + (((long) iArr3[4]) & f6265M);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & f6265M) + (((long) iArr[i]) & f6265M) + (((long) iArr2[i2]) & f6265M);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f6265M) + (((long) iArr2[i4]) & f6265M);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f6265M) + (((long) iArr2[i5]) & f6265M);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f6265M) + (((long) iArr2[i6]) & f6265M);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f6265M) + (((long) iArr2[i7]) & f6265M);
        iArr2[i7] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & f6265M) + (((long) iArr2[0]) & f6265M);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6265M) + (((long) iArr2[1]) & f6265M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6265M) + (((long) iArr2[2]) & f6265M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6265M) + (((long) iArr2[3]) & f6265M);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6265M) + (f6265M & ((long) iArr2[4]));
        iArr2[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & f6265M) + (((long) iArr2[i2]) & f6265M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i4]) & f6265M) + (((long) iArr2[i5]) & f6265M);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i7]) & f6265M) + (((long) iArr2[i8]) & f6265M);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i10]) & f6265M) + (((long) iArr2[i11]) & f6265M);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i13]) & f6265M) + (f6265M & ((long) iArr2[i14]));
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        return (int) (j5 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
    }

    public static int[] create() {
        return new int[5];
    }

    public static int[] createExt() {
        return new int[10];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean gte = gte(iArr, i, iArr2, i2);
        if (gte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            sub(iArr2, i2, iArr, i, iArr3, i3);
        }
        return gte;
    }

    /* renamed from: eq */
    public static boolean m6286eq(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        int i = 0;
        while (bigInteger.signum() != 0) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return create;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 5) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 4; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ PKIFailureInfo.systemUnavail;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            int i2 = iArr[i] ^ PKIFailureInfo.systemUnavail;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f6265M;
        long j2 = ((long) iArr2[i2 + 1]) & f6265M;
        long j3 = ((long) iArr2[i2 + 2]) & f6265M;
        long j4 = ((long) iArr2[i2 + 3]) & f6265M;
        long j5 = ((long) iArr2[i2 + 4]) & f6265M;
        long j6 = ((long) iArr[i]) & f6265M;
        long j7 = j6 * j;
        iArr3[i3] = (int) j7;
        long j8 = (j7 >>> 32) + (j6 * j2);
        long j9 = j2;
        iArr3[i3 + 1] = (int) j8;
        long j10 = (j8 >>> 32) + (j6 * j3);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (j6 * j4);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (j6 * j5);
        iArr3[i3 + 4] = (int) j12;
        iArr3[i3 + 5] = (int) (j12 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 5) {
            i5 += i4;
            long j13 = ((long) iArr[i + i6]) & f6265M;
            long j14 = (j13 * j) + (((long) iArr3[i5]) & f6265M);
            iArr3[i5] = (int) j14;
            int i7 = i5 + 1;
            long j15 = j;
            long j16 = (j14 >>> 32) + (j13 * j9) + (((long) iArr3[i7]) & f6265M);
            iArr3[i7] = (int) j16;
            int i8 = i5 + 2;
            long j17 = (j16 >>> 32) + (j13 * j3) + (((long) iArr3[i8]) & f6265M);
            iArr3[i8] = (int) j17;
            int i9 = i5 + 3;
            long j18 = (j17 >>> 32) + (j13 * j4) + (((long) iArr3[i9]) & f6265M);
            iArr3[i9] = (int) j18;
            int i10 = i5 + 4;
            long j19 = (j18 >>> 32) + (j13 * j5) + (((long) iArr3[i10]) & f6265M);
            iArr3[i10] = (int) j19;
            iArr3[i5 + 5] = (int) (j19 >>> 32);
            i6++;
            j = j15;
            i4 = 1;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & f6265M;
        int i = 1;
        long j2 = ((long) iArr2[1]) & f6265M;
        long j3 = ((long) iArr2[2]) & f6265M;
        long j4 = ((long) iArr2[3]) & f6265M;
        long j5 = ((long) iArr2[4]) & f6265M;
        long j6 = j3;
        long j7 = ((long) iArr[0]) & f6265M;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j6);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[4] = (int) j12;
        iArr3[5] = (int) (j12 >>> 32);
        for (int i2 = 5; i < i2; i2 = 5) {
            long j13 = ((long) iArr[i]) & f6265M;
            long j14 = (j13 * j) + (((long) iArr3[i]) & f6265M);
            iArr3[i] = (int) j14;
            int i3 = i + 1;
            long j15 = (j14 >>> 32) + (j13 * j2) + (((long) iArr3[i3]) & f6265M);
            iArr3[i3] = (int) j15;
            int i4 = i + 2;
            long j16 = (j15 >>> 32) + (j13 * j6) + (((long) iArr3[i4]) & f6265M);
            iArr3[i4] = (int) j16;
            int i5 = i + 3;
            long j17 = (j16 >>> 32) + (j13 * j4) + (((long) iArr3[i5]) & f6265M);
            iArr3[i5] = (int) j17;
            int i6 = i + 4;
            long j18 = (j17 >>> 32) + (j13 * j5) + (((long) iArr3[i6]) & f6265M);
            iArr3[i6] = (int) j18;
            iArr3[i + 5] = (int) (j18 >>> 32);
            i = i3;
            j4 = j4;
            j = j;
            j2 = j2;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & f6265M;
        long j2 = ((long) iArr[i2]) & f6265M;
        long j3 = (j * j2) + (((long) iArr2[i3]) & f6265M);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & f6265M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & f6265M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = ((long) iArr[i2 + 2]) & f6265M;
        long j7 = (j5 >>> 32) + (j * j6) + j4 + (((long) iArr2[i3 + 2]) & f6265M);
        iArr3[i4 + 2] = (int) j7;
        long j8 = ((long) iArr[i2 + 3]) & f6265M;
        long j9 = (j7 >>> 32) + (j * j8) + j6 + (((long) iArr2[i3 + 3]) & f6265M);
        iArr3[i4 + 3] = (int) j9;
        long j10 = ((long) iArr[i2 + 4]) & f6265M;
        long j11 = (j9 >>> 32) + (j * j10) + j8 + (f6265M & ((long) iArr2[i3 + 4]));
        iArr3[i4 + 4] = (int) j11;
        return (j11 >>> 32) + j10;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6265M;
        long j3 = j & f6265M;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & f6265M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        int i3 = i2 + 1;
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (((long) iArr[i3]) & f6265M);
        iArr[i3] = (int) j6;
        int i4 = i2 + 2;
        long j7 = (j6 >>> 32) + j5 + (((long) iArr[i4]) & f6265M);
        iArr[i4] = (int) j7;
        int i5 = i2 + 3;
        long j8 = (j7 >>> 32) + (f6265M & ((long) iArr[i5]));
        iArr[i5] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = (long) i;
        long j2 = ((long) i2) & f6265M;
        long j3 = ((j & f6265M) * j2) + (((long) iArr[i3]) & f6265M);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & f6265M);
        iArr[i4] = (int) j4;
        int i5 = i3 + 2;
        long j5 = (j4 >>> 32) + (f6265M & ((long) iArr[i5]));
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f6265M;
        long j2 = ((long) iArr2[i2 + 1]) & f6265M;
        long j3 = ((long) iArr2[i2 + 2]) & f6265M;
        long j4 = (long) iArr2[i2 + 3];
        long j5 = (long) iArr2[i2 + 4];
        long j6 = 0;
        int i4 = 0;
        int i5 = i3;
        while (i4 < 5) {
            long j7 = ((long) iArr[i + i4]) & f6265M;
            long j8 = j;
            long j9 = (j7 * j) + (((long) iArr3[i5]) & f6265M);
            int i6 = i4;
            iArr3[i5] = (int) j9;
            int i7 = i5 + 1;
            long j10 = j2;
            long j11 = (j9 >>> 32) + (j7 * j2) + (((long) iArr3[i7]) & f6265M);
            iArr3[i7] = (int) j11;
            int i8 = i5 + 2;
            long j12 = (j11 >>> 32) + (j7 * j3) + (((long) iArr3[i8]) & f6265M);
            iArr3[i8] = (int) j12;
            int i9 = i5 + 3;
            long j13 = (j12 >>> 32) + ((j4 & f6265M) * j7) + (((long) iArr3[i9]) & f6265M);
            iArr3[i9] = (int) j13;
            int i10 = i5 + 4;
            long j14 = (j13 >>> 32) + (j7 * (j5 & f6265M)) + (((long) iArr3[i10]) & f6265M);
            iArr3[i10] = (int) j14;
            int i11 = i5 + 5;
            long j15 = (j14 >>> 32) + j6 + (((long) iArr3[i11]) & f6265M);
            iArr3[i11] = (int) j15;
            j6 = j15 >>> 32;
            i5 = i7;
            j4 = j4;
            j2 = j10;
            j3 = j3;
            i4 = i6 + 1;
            j = j8;
        }
        return (int) j6;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & f6265M;
        long j2 = ((long) iArr2[1]) & f6265M;
        long j3 = ((long) iArr2[2]) & f6265M;
        long j4 = (long) iArr2[3];
        long j5 = (long) iArr2[4];
        long j6 = 0;
        while (i < 5) {
            long j7 = j6;
            long j8 = ((long) iArr[i]) & f6265M;
            long j9 = j;
            long j10 = (j8 * j) + (((long) iArr3[i]) & f6265M);
            iArr3[i] = (int) j10;
            int i2 = i + 1;
            long j11 = j2;
            long j12 = (j10 >>> 32) + (j8 * j2) + (((long) iArr3[i2]) & f6265M);
            iArr3[i2] = (int) j12;
            int i3 = i + 2;
            long j13 = (j12 >>> 32) + (j8 * j3) + (((long) iArr3[i3]) & f6265M);
            iArr3[i3] = (int) j13;
            int i4 = i + 3;
            long j14 = (j13 >>> 32) + ((j4 & f6265M) * j8) + (((long) iArr3[i4]) & f6265M);
            iArr3[i4] = (int) j14;
            int i5 = i + 4;
            long j15 = (j14 >>> 32) + (j8 * (j5 & f6265M)) + (((long) iArr3[i5]) & f6265M);
            iArr3[i5] = (int) j15;
            int i6 = i + 5;
            long j16 = (j15 >>> 32) + j7 + (((long) iArr3[i6]) & f6265M);
            iArr3[i6] = (int) j16;
            j6 = j16 >>> 32;
            i = i2;
            j = j9;
            j4 = j4;
            j2 = j11;
            j3 = j3;
        }
        return (int) j6;
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = (long) i;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & f6265M) * (f6265M & j));
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 5);
        return (int) j2;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & f6265M;
        long j2 = ((((long) iArr[i2]) & f6265M) * j) + (((long) iArr2[i3]) & f6265M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & f6265M) * j) + (((long) iArr2[i4]) & f6265M);
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & f6265M) * j) + (((long) iArr2[i5]) & f6265M);
        iArr2[i5] = (int) j4;
        int i6 = i3 + 3;
        long j5 = (j4 >>> 32) + ((((long) iArr[i2 + 3]) & f6265M) * j) + (((long) iArr2[i6]) & f6265M);
        iArr2[i6] = (int) j5;
        int i7 = i3 + 4;
        long j6 = (j5 >>> 32) + (j * (((long) iArr[i2 + 4]) & f6265M)) + (((long) iArr2[i7]) & f6265M);
        iArr2[i7] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6265M;
        long j3 = ((j & f6265M) * j2) + (((long) iArr[i2]) & f6265M);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j4 = (j3 >>> 32) + (j2 * (j >>> 32)) + (((long) iArr[i3]) & f6265M);
        iArr[i3] = (int) j4;
        int i4 = i2 + 2;
        long j5 = (j4 >>> 32) + (((long) iArr[i4]) & f6265M);
        iArr[i4] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i2, 3);
    }

    public static int mulWordsAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((((long) i2) & f6265M) * (((long) i) & f6265M)) + (((long) iArr[i3]) & f6265M);
        iArr[i3] = (int) j;
        int i4 = i3 + 1;
        long j2 = (j >>> 32) + (f6265M & ((long) iArr[i4]));
        iArr[i4] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i3, 2);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & f6265M;
        int i3 = 0;
        int i4 = 10;
        int i5 = 4;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & f6265M;
            long j3 = j2 * j2;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr2[i2] = (int) j4;
                long j5 = ((long) iArr[i + 1]) & f6265M;
                int i8 = i2 + 2;
                long j6 = (long) iArr2[i8];
                long j7 = ((((long) (i3 << 31)) & f6265M) | (j4 >>> 33)) + (j5 * j);
                int i9 = (int) j7;
                iArr2[i2 + 1] = (i9 << 1) | (((int) (j4 >>> 32)) & 1);
                long j8 = ((long) iArr[i + 2]) & f6265M;
                int i10 = i2 + 3;
                long j9 = (long) iArr2[i10];
                int i11 = i2 + 4;
                long j10 = j5;
                long j11 = (j6 & f6265M) + (j7 >>> 32) + (j8 * j);
                int i12 = (int) j11;
                iArr2[i8] = (i12 << 1) | (i9 >>> 31);
                long j12 = (j9 & f6265M) + (j11 >>> 32) + (j8 * j10);
                long j13 = ((long) iArr[i + 3]) & f6265M;
                int i13 = i2 + 5;
                long j14 = (long) iArr2[i13];
                int i14 = i2 + 6;
                int i15 = i13;
                long j15 = (long) iArr2[i14];
                long j16 = (j12 & f6265M) + (j13 * j);
                int i16 = i11;
                int i17 = (int) j16;
                iArr2[i10] = (i17 << 1) | (i12 >>> 31);
                long j17 = (((long) iArr2[i11]) & f6265M) + (j12 >>> 32) + (j16 >>> 32) + (j13 * j10);
                long j18 = (j14 & f6265M) + (j17 >>> 32) + (j13 * j8);
                long j19 = ((long) iArr[i + 4]) & f6265M;
                int i18 = i2 + 7;
                int i19 = i2 + 8;
                int i20 = i18;
                long j20 = (j17 & f6265M) + (j * j19);
                int i21 = (int) j20;
                iArr2[i16] = (i21 << 1) | (i17 >>> 31);
                long j21 = (j18 & f6265M) + (j20 >>> 32) + (j19 * j10);
                long j22 = (j15 & f6265M) + (j18 >>> 32) + (j21 >>> 32) + (j8 * j19);
                long j23 = (((long) iArr2[i18]) & f6265M) + (j22 >>> 32) + (j19 * j13);
                long j24 = (((long) iArr2[i19]) & f6265M) + (j23 >>> 32);
                int i22 = (int) j21;
                iArr2[i15] = (i21 >>> 31) | (i22 << 1);
                int i23 = (int) j22;
                iArr2[i14] = (i22 >>> 31) | (i23 << 1);
                int i24 = (int) j23;
                iArr2[i20] = (i23 >>> 31) | (i24 << 1);
                int i25 = (int) j24;
                iArr2[i19] = (i24 >>> 31) | (i25 << 1);
                int i26 = i2 + 9;
                iArr2[i26] = (i25 >>> 31) | ((iArr2[i26] + ((int) (j24 >> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & f6265M;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & f6265M;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & f6265M;
                long j6 = j;
                long j7 = (long) iArr2[2];
                long j8 = ((j4 >>> 33) | (((long) (i2 << 31)) & f6265M)) + (j5 * j6);
                int i6 = (int) j8;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                long j9 = ((long) iArr[2]) & f6265M;
                long j10 = j5;
                long j11 = (long) iArr2[4];
                long j12 = (j7 & f6265M) + (j8 >>> 32) + (j9 * j6);
                int i7 = (int) j12;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long j13 = (((long) iArr2[3]) & f6265M) + (j12 >>> 32) + (j9 * j10);
                long j14 = ((long) iArr[3]) & f6265M;
                long j15 = (long) iArr2[6];
                long j16 = (j13 & f6265M) + (j14 * j6);
                int i8 = (int) j16;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j17 = (j11 & f6265M) + (j13 >>> 32) + (j16 >>> 32) + (j14 * j10);
                long j18 = (((long) iArr2[5]) & f6265M) + (j17 >>> 32) + (j14 * j9);
                long j19 = ((long) iArr[4]) & f6265M;
                long j20 = (long) iArr2[7];
                long j21 = (long) iArr2[8];
                long j22 = (j17 & f6265M) + (j6 * j19);
                int i9 = (int) j22;
                iArr2[4] = (i8 >>> 31) | (i9 << 1);
                long j23 = (j22 >>> 32) + (j10 * j19) + (j18 & f6265M);
                long j24 = (j23 >>> 32) + (j9 * j19) + (j15 & f6265M) + (j18 >>> 32);
                long j25 = (j20 & f6265M) + (j24 >>> 32) + (j19 * j14);
                long j26 = (j21 & f6265M) + (j25 >>> 32);
                int i10 = (int) j23;
                iArr2[5] = (i10 << 1) | (i9 >>> 31);
                int i11 = (int) j24;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) j25;
                iArr2[7] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j26;
                iArr2[8] = (i12 >>> 31) | (i13 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j26 >> 32))) << 1) | (i13 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f6265M) - (((long) iArr2[i2]) & f6265M);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & f6265M) - (((long) iArr2[i2 + 1]) & f6265M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & f6265M) - (((long) iArr2[i2 + 2]) & f6265M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & f6265M) - (((long) iArr2[i2 + 3]) & f6265M));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & f6265M) - (((long) iArr2[i2 + 4]) & f6265M));
        iArr3[i3 + 4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6265M) - (((long) iArr2[0]) & f6265M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & f6265M) - (((long) iArr2[1]) & f6265M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & f6265M) - (((long) iArr2[2]) & f6265M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & f6265M) - (((long) iArr2[3]) & f6265M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & f6265M) - (((long) iArr2[4]) & f6265M));
        iArr3[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr3[0]) & f6265M) - (((long) iArr[0]) & f6265M)) - (((long) iArr2[0]) & f6265M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & f6265M) - (((long) iArr[1]) & f6265M)) - (((long) iArr2[1]) & f6265M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & f6265M) - (((long) iArr[2]) & f6265M)) - (((long) iArr2[2]) & f6265M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & f6265M) - (((long) iArr[3]) & f6265M)) - (((long) iArr2[3]) & f6265M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((((long) iArr3[4]) & f6265M) - (((long) iArr[4]) & f6265M)) - (((long) iArr2[4]) & f6265M));
        iArr3[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr2[i2]) & f6265M) - (((long) iArr[i]) & f6265M);
        iArr2[i2] = (int) j;
        int i3 = i2 + 1;
        long j2 = (j >> 32) + ((((long) iArr2[i3]) & f6265M) - (((long) iArr[i + 1]) & f6265M));
        iArr2[i3] = (int) j2;
        int i4 = i2 + 2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i4]) & f6265M) - (((long) iArr[i + 2]) & f6265M));
        iArr2[i4] = (int) j3;
        int i5 = i2 + 3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i5]) & f6265M) - (((long) iArr[i + 3]) & f6265M));
        iArr2[i5] = (int) j4;
        int i6 = i2 + 4;
        long j5 = (j4 >> 32) + ((((long) iArr2[i6]) & f6265M) - (((long) iArr[i + 4]) & f6265M));
        iArr2[i6] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & f6265M) - (((long) iArr[0]) & f6265M);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & f6265M) - (((long) iArr[1]) & f6265M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & f6265M) - (((long) iArr[2]) & f6265M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & f6265M) - (((long) iArr[3]) & f6265M));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & f6265M) - (f6265M & ((long) iArr[4])));
        iArr2[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
    }
}
