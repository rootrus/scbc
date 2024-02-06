package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;

public abstract class Nat128 {

    /* renamed from: M */
    private static final long f6264M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6264M) + (((long) iArr2[0]) & f6264M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6264M) + (((long) iArr2[1]) & f6264M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6264M) + (((long) iArr2[2]) & f6264M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6264M) + (((long) iArr2[3]) & f6264M);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6264M) + (((long) iArr2[0]) & f6264M) + (((long) iArr3[0]) & f6264M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6264M) + (((long) iArr2[1]) & f6264M) + (((long) iArr3[1]) & f6264M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6264M) + (((long) iArr2[2]) & f6264M) + (((long) iArr3[2]) & f6264M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6264M) + (((long) iArr2[3]) & f6264M) + (((long) iArr3[3]) & f6264M);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & f6264M) + (((long) iArr[i]) & f6264M) + (((long) iArr2[i2]) & f6264M);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f6264M) + (((long) iArr2[i4]) & f6264M);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f6264M) + (((long) iArr2[i5]) & f6264M);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f6264M) + (((long) iArr2[i6]) & f6264M);
        iArr2[i6] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & f6264M) + (((long) iArr2[0]) & f6264M);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6264M) + (((long) iArr2[1]) & f6264M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6264M) + (((long) iArr2[2]) & f6264M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6264M) + (f6264M & ((long) iArr2[3]));
        iArr2[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & f6264M) + (((long) iArr2[i2]) & f6264M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i4]) & f6264M) + (((long) iArr2[i5]) & f6264M);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i7]) & f6264M) + (((long) iArr2[i8]) & f6264M);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i10]) & f6264M) + (f6264M & ((long) iArr2[i11]));
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        return (int) (j4 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
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
    public static boolean m6285eq(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
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

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        int i = 0;
        while (bigInteger.signum() != 0) {
            create64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 3; i3 >= 0; i3--) {
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
        for (int i = 3; i >= 0; i--) {
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
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[1] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f6264M;
        long j2 = ((long) iArr2[i2 + 1]) & f6264M;
        long j3 = ((long) iArr2[i2 + 2]) & f6264M;
        long j4 = ((long) iArr2[i2 + 3]) & f6264M;
        long j5 = ((long) iArr[i]) & f6264M;
        long j6 = j5 * j;
        iArr3[i3] = (int) j6;
        char c = ' ';
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[i3 + 1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[i3 + 2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[i3 + 3] = (int) j9;
        iArr3[i3 + 4] = (int) (j9 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 4) {
            int i7 = i5 + i4;
            long j10 = ((long) iArr[i + i6]) & f6264M;
            int i8 = i7;
            long j11 = (j10 * j) + (((long) iArr3[i7]) & f6264M);
            iArr3[i8] = (int) j11;
            int i9 = i8 + 1;
            long j12 = j;
            long j13 = (j11 >>> c) + (j10 * j2) + (((long) iArr3[i9]) & f6264M);
            iArr3[i9] = (int) j13;
            int i10 = i8 + 2;
            long j14 = (j13 >>> 32) + (j10 * j3) + (((long) iArr3[i10]) & f6264M);
            iArr3[i10] = (int) j14;
            int i11 = i8 + 3;
            long j15 = (j14 >>> 32) + (j10 * j4) + (((long) iArr3[i11]) & f6264M);
            iArr3[i11] = (int) j15;
            iArr3[i8 + 4] = (int) (j15 >>> 32);
            i6++;
            i5 = i8;
            c = ' ';
            j2 = j2;
            j = j12;
            i4 = 1;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & f6264M;
        int i = 1;
        long j2 = ((long) iArr2[1]) & f6264M;
        long j3 = ((long) iArr2[2]) & f6264M;
        long j4 = ((long) iArr2[3]) & f6264M;
        long j5 = ((long) iArr[0]) & f6264M;
        long j6 = j5 * j;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j10 = ((long) iArr[i]) & f6264M;
            long j11 = (j10 * j) + (((long) iArr3[i]) & f6264M);
            iArr3[i] = (int) j11;
            int i3 = i + 1;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i3]) & f6264M);
            iArr3[i3] = (int) j12;
            int i4 = i + 2;
            int i5 = i;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i4]) & f6264M);
            iArr3[i4] = (int) j13;
            int i6 = i5 + 3;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i6]) & f6264M);
            iArr3[i6] = (int) j14;
            iArr3[i5 + 4] = (int) (j14 >>> 32);
            i = i3;
            j = j;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & f6264M;
        long j2 = ((long) iArr[i2]) & f6264M;
        long j3 = (j * j2) + (((long) iArr2[i3]) & f6264M);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & f6264M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & f6264M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = ((long) iArr[i2 + 2]) & f6264M;
        long j7 = (j5 >>> 32) + (j * j6) + j4 + (((long) iArr2[i3 + 2]) & f6264M);
        iArr3[i4 + 2] = (int) j7;
        long j8 = ((long) iArr[i2 + 3]) & f6264M;
        long j9 = (j7 >>> 32) + (j * j8) + j6 + (f6264M & ((long) iArr2[i3 + 3]));
        iArr3[i4 + 3] = (int) j9;
        return (j9 >>> 32) + j8;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6264M;
        long j3 = j & f6264M;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & f6264M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        int i3 = i2 + 1;
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (((long) iArr[i3]) & f6264M);
        iArr[i3] = (int) j6;
        int i4 = i2 + 2;
        long j7 = (j6 >>> 32) + j5 + (((long) iArr[i4]) & f6264M);
        iArr[i4] = (int) j7;
        int i5 = i2 + 3;
        long j8 = (j7 >>> 32) + (((long) iArr[i5]) & f6264M);
        iArr[i5] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = (long) i;
        long j2 = ((long) i2) & f6264M;
        long j3 = ((j & f6264M) * j2) + (((long) iArr[i3]) & f6264M);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & f6264M);
        iArr[i4] = (int) j4;
        int i5 = i3 + 2;
        long j5 = (j4 >>> 32) + (f6264M & ((long) iArr[i5]));
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = f6264M;
        long j2 = ((long) iArr2[i2]) & f6264M;
        long j3 = ((long) iArr2[i2 + 1]) & f6264M;
        long j4 = ((long) iArr2[i2 + 2]) & f6264M;
        long j5 = (long) iArr2[i2 + 3];
        long j6 = 0;
        int i4 = 0;
        int i5 = i3;
        while (i4 < 4) {
            long j7 = ((long) iArr[i + i4]) & j;
            long j8 = j2;
            long j9 = (j7 * j2) + (((long) iArr3[i5]) & j);
            iArr3[i5] = (int) j9;
            int i6 = i5 + 1;
            long j10 = (j9 >>> 32) + (j7 * j3) + (((long) iArr3[i6]) & f6264M);
            iArr3[i6] = (int) j10;
            int i7 = i5 + 2;
            long j11 = (j10 >>> 32) + (j7 * j4) + (((long) iArr3[i7]) & f6264M);
            iArr3[i7] = (int) j11;
            int i8 = i5 + 3;
            long j12 = (j11 >>> 32) + (j7 * (j5 & f6264M)) + (((long) iArr3[i8]) & f6264M);
            iArr3[i8] = (int) j12;
            int i9 = i5 + 4;
            long j13 = (j12 >>> 32) + j6 + (((long) iArr3[i9]) & f6264M);
            iArr3[i9] = (int) j13;
            j6 = j13 >>> 32;
            i4++;
            i5 = i6;
            j = 4294967295L;
            j2 = j8;
            j3 = j3;
        }
        return (int) j6;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & f6264M;
        long j2 = ((long) iArr2[1]) & f6264M;
        long j3 = (long) iArr2[2];
        long j4 = (long) iArr2[3];
        long j5 = 0;
        while (i < 4) {
            long j6 = ((long) iArr[i]) & f6264M;
            long j7 = j;
            long j8 = (((long) iArr3[i]) & f6264M) + (j6 * j);
            iArr3[i] = (int) j8;
            int i2 = i + 1;
            long j9 = j2;
            long j10 = (j8 >>> 32) + (j6 * j2) + (((long) iArr3[i2]) & f6264M);
            iArr3[i2] = (int) j10;
            int i3 = i + 2;
            long j11 = (j10 >>> 32) + ((j3 & f6264M) * j6) + (((long) iArr3[i3]) & f6264M);
            iArr3[i3] = (int) j11;
            int i4 = i + 3;
            long j12 = (j11 >>> 32) + (j6 * (j4 & f6264M)) + (((long) iArr3[i4]) & f6264M);
            iArr3[i4] = (int) j12;
            int i5 = i + 4;
            long j13 = (j12 >>> 32) + j5 + (((long) iArr3[i5]) & f6264M);
            iArr3[i5] = (int) j13;
            j5 = j13 >>> 32;
            i = i2;
            j = j7;
            j2 = j9;
            j3 = j3;
        }
        return (int) j5;
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = (long) i;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & f6264M) * (f6264M & j));
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 4);
        return (int) j2;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & f6264M;
        long j2 = ((((long) iArr[i2]) & f6264M) * j) + (((long) iArr2[i3]) & f6264M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & f6264M) * j) + (((long) iArr2[i4]) & f6264M);
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & f6264M) * j) + (((long) iArr2[i5]) & f6264M);
        iArr2[i5] = (int) j4;
        int i6 = i3 + 3;
        long j5 = (j4 >>> 32) + (j * (((long) iArr[i2 + 3]) & f6264M)) + (((long) iArr2[i6]) & f6264M);
        iArr2[i6] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6264M;
        long j3 = ((j & f6264M) * j2) + (((long) iArr[i2]) & f6264M);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j4 = (j3 >>> 32) + (j2 * (j >>> 32)) + (((long) iArr[i3]) & f6264M);
        iArr[i3] = (int) j4;
        int i4 = i2 + 2;
        long j5 = (j4 >>> 32) + (((long) iArr[i4]) & f6264M);
        iArr[i4] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i2, 3);
    }

    public static int mulWordsAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((((long) i2) & f6264M) * (((long) i) & f6264M)) + (((long) iArr[i3]) & f6264M);
        iArr[i3] = (int) j;
        int i4 = i3 + 1;
        long j2 = (j >>> 32) + (f6264M & ((long) iArr[i4]));
        iArr[i4] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i3, 2);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & f6264M;
        int i3 = 0;
        int i4 = 8;
        int i5 = 3;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & f6264M;
            long j3 = j2 * j2;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr2[i2] = (int) j4;
                long j5 = ((long) iArr[i + 1]) & f6264M;
                int i8 = i2 + 2;
                long j6 = (long) iArr2[i8];
                long j7 = ((((long) (i3 << 31)) & f6264M) | (j4 >>> 33)) + (j5 * j);
                int i9 = (int) j7;
                iArr2[i2 + 1] = (i9 << 1) | (((int) (j4 >>> 32)) & 1);
                long j8 = ((long) iArr[i + 2]) & f6264M;
                int i10 = i2 + 3;
                long j9 = (long) iArr2[i10];
                int i11 = i2 + 4;
                long j10 = j5;
                long j11 = (j6 & f6264M) + (j7 >>> 32) + (j8 * j);
                int i12 = (int) j11;
                iArr2[i8] = (i12 << 1) | (i9 >>> 31);
                long j12 = (j9 & f6264M) + (j11 >>> 32) + (j8 * j10);
                long j13 = ((long) iArr[i + 3]) & f6264M;
                int i13 = i2 + 5;
                long j14 = (long) iArr2[i13];
                int i14 = i2 + 6;
                long j15 = (j12 & f6264M) + (j * j13);
                int i15 = i11;
                int i16 = (int) j15;
                iArr2[i10] = (i16 << 1) | (i12 >>> 31);
                long j16 = (((long) iArr2[i11]) & f6264M) + (j12 >>> 32) + (j15 >>> 32) + (j13 * j10);
                long j17 = (j14 & f6264M) + (j16 >>> 32) + (j13 * j8);
                long j18 = (((long) iArr2[i14]) & f6264M) + (j17 >>> 32);
                int i17 = (int) j16;
                iArr2[i15] = (i16 >>> 31) | (i17 << 1);
                int i18 = (int) j17;
                iArr2[i13] = (i17 >>> 31) | (i18 << 1);
                int i19 = (int) j18;
                iArr2[i14] = (i18 >>> 31) | (i19 << 1);
                int i20 = i2 + 7;
                iArr2[i20] = (i19 >>> 31) | ((iArr2[i20] + ((int) (j18 >> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & f6264M;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & f6264M;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & f6264M;
                long j6 = j;
                long j7 = (long) iArr2[2];
                long j8 = ((j4 >>> 33) | (((long) (i2 << 31)) & f6264M)) + (j5 * j6);
                int i6 = (int) j8;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                long j9 = ((long) iArr[2]) & f6264M;
                long j10 = (long) iArr2[3];
                long j11 = j5;
                long j12 = (long) iArr2[4];
                long j13 = (j7 & f6264M) + (j8 >>> 32) + (j9 * j6);
                int i7 = (int) j13;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long j14 = (j13 >>> 32) + (j9 * j11) + (j10 & f6264M);
                long j15 = ((long) iArr[3]) & f6264M;
                long j16 = (long) iArr2[5];
                long j17 = (long) iArr2[6];
                long j18 = (j14 & f6264M) + (j6 * j15);
                int i8 = (int) j18;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j19 = (j12 & f6264M) + (j14 >>> 32) + (j18 >>> 32) + (j11 * j15);
                long j20 = (j16 & f6264M) + (j19 >>> 32) + (j15 * j9);
                long j21 = (j17 & f6264M) + (j20 >>> 32);
                int i9 = (int) j19;
                iArr2[4] = (i8 >>> 31) | (i9 << 1);
                int i10 = (int) j20;
                iArr2[5] = (i9 >>> 31) | (i10 << 1);
                int i11 = (int) j21;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                iArr2[7] = (i11 >>> 31) | ((iArr2[7] + ((int) (j21 >> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f6264M) - (((long) iArr2[i2]) & f6264M);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & f6264M) - (((long) iArr2[i2 + 1]) & f6264M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & f6264M) - (((long) iArr2[i2 + 2]) & f6264M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & f6264M) - (((long) iArr2[i2 + 3]) & f6264M));
        iArr3[i3 + 3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6264M) - (((long) iArr2[0]) & f6264M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & f6264M) - (((long) iArr2[1]) & f6264M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & f6264M) - (((long) iArr2[2]) & f6264M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & f6264M) - (((long) iArr2[3]) & f6264M));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr3[0]) & f6264M) - (((long) iArr[0]) & f6264M)) - (((long) iArr2[0]) & f6264M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & f6264M) - (((long) iArr[1]) & f6264M)) - (((long) iArr2[1]) & f6264M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & f6264M) - (((long) iArr[2]) & f6264M)) - (((long) iArr2[2]) & f6264M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & f6264M) - (((long) iArr[3]) & f6264M)) - (((long) iArr2[3]) & f6264M));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr2[i2]) & f6264M) - (((long) iArr[i]) & f6264M);
        iArr2[i2] = (int) j;
        int i3 = i2 + 1;
        long j2 = (j >> 32) + ((((long) iArr2[i3]) & f6264M) - (((long) iArr[i + 1]) & f6264M));
        iArr2[i3] = (int) j2;
        int i4 = i2 + 2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i4]) & f6264M) - (((long) iArr[i + 2]) & f6264M));
        iArr2[i4] = (int) j3;
        int i5 = i2 + 3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i5]) & f6264M) - (((long) iArr[i + 3]) & f6264M));
        iArr2[i5] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & f6264M) - (((long) iArr[0]) & f6264M);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & f6264M) - (((long) iArr[1]) & f6264M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & f6264M) - (((long) iArr[2]) & f6264M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & f6264M) - (f6264M & ((long) iArr[3])));
        iArr2[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }
}
