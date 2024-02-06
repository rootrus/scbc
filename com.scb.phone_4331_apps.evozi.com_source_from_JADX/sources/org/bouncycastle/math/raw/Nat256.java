package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;

public abstract class Nat256 {

    /* renamed from: M */
    private static final long f6268M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f6268M) + (((long) iArr2[i2]) & f6268M);
        iArr3[i3] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f6268M) + (((long) iArr2[i2 + 1]) & f6268M);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f6268M) + (((long) iArr2[i2 + 2]) & f6268M);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f6268M) + (((long) iArr2[i2 + 3]) & f6268M);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f6268M) + (((long) iArr2[i2 + 4]) & f6268M);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f6268M) + (((long) iArr2[i2 + 5]) & f6268M);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & f6268M) + (((long) iArr2[i2 + 6]) & f6268M);
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & f6268M) + (((long) iArr2[i2 + 7]) & f6268M);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6268M) + (((long) iArr2[0]) & f6268M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6268M) + (((long) iArr2[1]) & f6268M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6268M) + (((long) iArr2[2]) & f6268M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6268M) + (((long) iArr2[3]) & f6268M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6268M) + (((long) iArr2[4]) & f6268M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f6268M) + (((long) iArr2[5]) & f6268M);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & f6268M) + (((long) iArr2[6]) & f6268M);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & f6268M) + (((long) iArr2[7]) & f6268M);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f6268M) + (((long) iArr2[i2]) & f6268M) + (((long) iArr3[i3]) & f6268M);
        iArr3[i3] = (int) j;
        int i4 = i3 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f6268M) + (((long) iArr2[i2 + 1]) & f6268M) + (((long) iArr3[i4]) & f6268M);
        iArr3[i4] = (int) j2;
        int i5 = i3 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f6268M) + (((long) iArr2[i2 + 2]) & f6268M) + (((long) iArr3[i5]) & f6268M);
        iArr3[i5] = (int) j3;
        int i6 = i3 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f6268M) + (((long) iArr2[i2 + 3]) & f6268M) + (((long) iArr3[i6]) & f6268M);
        iArr3[i6] = (int) j4;
        int i7 = i3 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f6268M) + (((long) iArr2[i2 + 4]) & f6268M) + (((long) iArr3[i7]) & f6268M);
        iArr3[i7] = (int) j5;
        int i8 = i3 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f6268M) + (((long) iArr2[i2 + 5]) & f6268M) + (((long) iArr3[i8]) & f6268M);
        iArr3[i8] = (int) j6;
        int i9 = i3 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & f6268M) + (((long) iArr2[i2 + 6]) & f6268M) + (((long) iArr3[i9]) & f6268M);
        iArr3[i9] = (int) j7;
        int i10 = i3 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & f6268M) + (((long) iArr2[i2 + 7]) & f6268M) + (((long) iArr3[i10]) & f6268M);
        iArr3[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6268M) + (((long) iArr2[0]) & f6268M) + (((long) iArr3[0]) & f6268M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6268M) + (((long) iArr2[1]) & f6268M) + (((long) iArr3[1]) & f6268M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6268M) + (((long) iArr2[2]) & f6268M) + (((long) iArr3[2]) & f6268M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6268M) + (((long) iArr2[3]) & f6268M) + (((long) iArr3[3]) & f6268M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6268M) + (((long) iArr2[4]) & f6268M) + (((long) iArr3[4]) & f6268M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f6268M) + (((long) iArr2[5]) & f6268M) + (((long) iArr3[5]) & f6268M);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & f6268M) + (((long) iArr2[6]) & f6268M) + (((long) iArr3[6]) & f6268M);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & f6268M) + (((long) iArr2[7]) & f6268M) + (((long) iArr3[7]) & f6268M);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & f6268M) + (((long) iArr[i]) & f6268M) + (((long) iArr2[i2]) & f6268M);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f6268M) + (((long) iArr2[i4]) & f6268M);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f6268M) + (((long) iArr2[i5]) & f6268M);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f6268M) + (((long) iArr2[i6]) & f6268M);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f6268M) + (((long) iArr2[i7]) & f6268M);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f6268M) + (((long) iArr2[i8]) & f6268M);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & f6268M) + (((long) iArr2[i9]) & f6268M);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & f6268M) + (((long) iArr2[i10]) & f6268M);
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & f6268M) + (((long) iArr2[0]) & f6268M);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6268M) + (((long) iArr2[1]) & f6268M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6268M) + (((long) iArr2[2]) & f6268M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6268M) + (((long) iArr2[3]) & f6268M);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6268M) + (((long) iArr2[4]) & f6268M);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f6268M) + (((long) iArr2[5]) & f6268M);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & f6268M) + (((long) iArr2[6]) & f6268M);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & f6268M) + (f6268M & ((long) iArr2[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & f6268M) + (((long) iArr2[i2]) & f6268M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i4]) & f6268M) + (((long) iArr2[i5]) & f6268M);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i7]) & f6268M) + (((long) iArr2[i8]) & f6268M);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i10]) & f6268M) + (((long) iArr2[i11]) & f6268M);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i13]) & f6268M) + (((long) iArr2[i14]) & f6268M);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i16]) & f6268M) + (((long) iArr2[i17]) & f6268M);
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i + 6;
        int i20 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i19]) & f6268M) + (((long) iArr2[i20]) & f6268M);
        int i21 = (int) j7;
        iArr[i19] = i21;
        iArr2[i20] = i21;
        int i22 = i + 7;
        int i23 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i22]) & f6268M) + (f6268M & ((long) iArr2[i23]));
        int i24 = (int) j8;
        iArr[i22] = i24;
        iArr2[i23] = i24;
        return (int) (j8 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
    public static boolean m6289eq(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
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
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
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
        } else if ((i & 255) != i) {
            return 0;
        } else {
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
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
        for (int i = 7; i >= 0; i--) {
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
        for (int i = 1; i < 8; i++) {
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
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f6268M;
        long j2 = ((long) iArr2[i2 + 1]) & f6268M;
        long j3 = ((long) iArr2[i2 + 2]) & f6268M;
        long j4 = ((long) iArr2[i2 + 3]) & f6268M;
        long j5 = ((long) iArr2[i2 + 4]) & f6268M;
        long j6 = ((long) iArr2[i2 + 5]) & f6268M;
        long j7 = ((long) iArr2[i2 + 6]) & f6268M;
        long j8 = ((long) iArr2[i2 + 7]) & f6268M;
        long j9 = ((long) iArr[i]) & f6268M;
        long j10 = j9 * j;
        long j11 = j;
        iArr3[i3] = (int) j10;
        long j12 = (j10 >>> 32) + (j9 * j2);
        long j13 = j2;
        iArr3[i3 + 1] = (int) j12;
        long j14 = (j12 >>> 32) + (j9 * j3);
        iArr3[i3 + 2] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j4);
        iArr3[i3 + 3] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j5);
        iArr3[i3 + 4] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j6);
        iArr3[i3 + 5] = (int) j17;
        long j18 = (j17 >>> 32) + (j9 * j7);
        iArr3[i3 + 6] = (int) j18;
        long j19 = (j18 >>> 32) + (j9 * j8);
        iArr3[i3 + 7] = (int) j19;
        iArr3[i3 + 8] = (int) (j19 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 8) {
            i5 += i4;
            long j20 = ((long) iArr[i + i6]) & f6268M;
            long j21 = (j20 * j11) + (((long) iArr3[i5]) & f6268M);
            iArr3[i5] = (int) j21;
            int i7 = i5 + 1;
            long j22 = j6;
            long j23 = (j21 >>> 32) + (j20 * j13) + (((long) iArr3[i7]) & f6268M);
            iArr3[i7] = (int) j23;
            int i8 = i5 + 2;
            long j24 = j3;
            long j25 = (j23 >>> 32) + (j20 * j3) + (((long) iArr3[i8]) & f6268M);
            iArr3[i8] = (int) j25;
            int i9 = i5 + 3;
            long j26 = (j25 >>> 32) + (j20 * j4) + (((long) iArr3[i9]) & f6268M);
            iArr3[i9] = (int) j26;
            int i10 = i5 + 4;
            long j27 = (j26 >>> 32) + (j20 * j5) + (((long) iArr3[i10]) & f6268M);
            iArr3[i10] = (int) j27;
            int i11 = i5 + 5;
            long j28 = (j27 >>> 32) + (j20 * j22) + (((long) iArr3[i11]) & f6268M);
            iArr3[i11] = (int) j28;
            int i12 = i5 + 6;
            long j29 = (j28 >>> 32) + (j20 * j7) + (((long) iArr3[i12]) & f6268M);
            iArr3[i12] = (int) j29;
            int i13 = i5 + 7;
            long j30 = (j29 >>> 32) + (j20 * j8) + (((long) iArr3[i13]) & f6268M);
            iArr3[i13] = (int) j30;
            iArr3[i5 + 8] = (int) (j30 >>> 32);
            i6++;
            j6 = j22;
            j3 = j24;
            i4 = 1;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & f6268M;
        long j2 = ((long) iArr2[1]) & f6268M;
        long j3 = ((long) iArr2[2]) & f6268M;
        long j4 = ((long) iArr2[3]) & f6268M;
        long j5 = ((long) iArr2[4]) & f6268M;
        long j6 = j3;
        long j7 = ((long) iArr2[5]) & f6268M;
        long j8 = ((long) iArr2[6]) & f6268M;
        long j9 = ((long) iArr2[7]) & f6268M;
        long j10 = ((long) iArr[0]) & f6268M;
        long j11 = j10 * j;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (j10 * j2);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (j10 * j6);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (j10 * j4);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (j10 * j5);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (j10 * j7);
        iArr3[5] = (int) j16;
        long j17 = (j16 >>> 32) + (j10 * j8);
        iArr3[6] = (int) j17;
        long j18 = (j17 >>> 32) + (j10 * j9);
        iArr3[7] = (int) j18;
        iArr3[8] = (int) (j18 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j19 = ((long) iArr[i]) & f6268M;
            long j20 = (j19 * j) + (((long) iArr3[i]) & f6268M);
            iArr3[i] = (int) j20;
            int i3 = i + 1;
            long j21 = (j20 >>> 32) + (j19 * j2) + (((long) iArr3[i3]) & f6268M);
            iArr3[i3] = (int) j21;
            int i4 = i + 2;
            long j22 = (j21 >>> 32) + (j19 * j6) + (((long) iArr3[i4]) & f6268M);
            iArr3[i4] = (int) j22;
            int i5 = i + 3;
            long j23 = (j22 >>> 32) + (j19 * j4) + (((long) iArr3[i5]) & f6268M);
            iArr3[i5] = (int) j23;
            int i6 = i + 4;
            long j24 = (j23 >>> 32) + (j19 * j5) + (((long) iArr3[i6]) & f6268M);
            iArr3[i6] = (int) j24;
            int i7 = i + 5;
            long j25 = (j24 >>> 32) + (j19 * j7) + (((long) iArr3[i7]) & f6268M);
            iArr3[i7] = (int) j25;
            int i8 = i + 6;
            long j26 = (j25 >>> 32) + (j19 * j8) + (((long) iArr3[i8]) & f6268M);
            iArr3[i8] = (int) j26;
            int i9 = i + 7;
            long j27 = (j26 >>> 32) + (j19 * j9) + (((long) iArr3[i9]) & f6268M);
            iArr3[i9] = (int) j27;
            iArr3[i + 8] = (int) (j27 >>> 32);
            i = i3;
            j4 = j4;
            j = j;
            j2 = j2;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & f6268M;
        long j2 = ((long) iArr[i2]) & f6268M;
        long j3 = (j * j2) + (((long) iArr2[i3]) & f6268M);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & f6268M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & f6268M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = ((long) iArr[i2 + 2]) & f6268M;
        long j7 = (j5 >>> 32) + (j * j6) + j4 + (((long) iArr2[i3 + 2]) & f6268M);
        iArr3[i4 + 2] = (int) j7;
        long j8 = ((long) iArr[i2 + 3]) & f6268M;
        long j9 = (j7 >>> 32) + (j * j8) + j6 + (((long) iArr2[i3 + 3]) & f6268M);
        iArr3[i4 + 3] = (int) j9;
        long j10 = ((long) iArr[i2 + 4]) & f6268M;
        long j11 = (j9 >>> 32) + (j * j10) + j8 + (((long) iArr2[i3 + 4]) & f6268M);
        iArr3[i4 + 4] = (int) j11;
        long j12 = ((long) iArr[i2 + 5]) & f6268M;
        long j13 = (j11 >>> 32) + (j * j12) + j10 + (((long) iArr2[i3 + 5]) & f6268M);
        iArr3[i4 + 5] = (int) j13;
        long j14 = ((long) iArr[i2 + 6]) & f6268M;
        long j15 = (j13 >>> 32) + (j * j14) + j12 + (((long) iArr2[i3 + 6]) & f6268M);
        iArr3[i4 + 6] = (int) j15;
        long j16 = ((long) iArr[i2 + 7]) & f6268M;
        long j17 = (j15 >>> 32) + (j * j16) + j14 + (f6268M & ((long) iArr2[i3 + 7]));
        iArr3[i4 + 7] = (int) j17;
        return (j17 >>> 32) + j16;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6268M;
        long j3 = j & f6268M;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & f6268M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        int i3 = i2 + 1;
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (((long) iArr[i3]) & f6268M);
        iArr[i3] = (int) j6;
        int i4 = i2 + 2;
        long j7 = (j6 >>> 32) + j5 + (((long) iArr[i4]) & f6268M);
        iArr[i4] = (int) j7;
        int i5 = i2 + 3;
        long j8 = (j7 >>> 32) + (f6268M & ((long) iArr[i5]));
        iArr[i5] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = (long) i;
        long j2 = ((long) i2) & f6268M;
        long j3 = ((j & f6268M) * j2) + (((long) iArr[i3]) & f6268M);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & f6268M);
        iArr[i4] = (int) j4;
        int i5 = i3 + 2;
        long j5 = (j4 >>> 32) + (f6268M & ((long) iArr[i5]));
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f6268M;
        long j2 = ((long) iArr2[i2 + 1]) & f6268M;
        long j3 = ((long) iArr2[i2 + 2]) & f6268M;
        long j4 = (long) iArr2[i2 + 3];
        long j5 = (long) iArr2[i2 + 4];
        long j6 = (long) iArr2[i2 + 5];
        long j7 = (long) iArr2[i2 + 6];
        long j8 = ((long) iArr2[i2 + 7]) & f6268M;
        int i4 = 0;
        long j9 = 0;
        int i5 = i3;
        while (i4 < 8) {
            int i6 = i4;
            long j10 = ((long) iArr[i + i4]) & f6268M;
            long j11 = j;
            long j12 = (j10 * j) + (((long) iArr3[i5]) & f6268M);
            long j13 = j8;
            iArr3[i5] = (int) j12;
            int i7 = i5 + 1;
            long j14 = j2;
            long j15 = (j12 >>> 32) + (j10 * j2) + (((long) iArr3[i7]) & f6268M);
            iArr3[i7] = (int) j15;
            int i8 = i5 + 2;
            long j16 = (j15 >>> 32) + (j10 * j3) + (((long) iArr3[i8]) & f6268M);
            iArr3[i8] = (int) j16;
            int i9 = i5 + 3;
            long j17 = (j16 >>> 32) + ((j4 & f6268M) * j10) + (((long) iArr3[i9]) & f6268M);
            iArr3[i9] = (int) j17;
            int i10 = i5 + 4;
            long j18 = (j17 >>> 32) + ((j5 & f6268M) * j10) + (((long) iArr3[i10]) & f6268M);
            iArr3[i10] = (int) j18;
            int i11 = i5 + 5;
            long j19 = (j18 >>> 32) + ((j6 & f6268M) * j10) + (((long) iArr3[i11]) & f6268M);
            iArr3[i11] = (int) j19;
            int i12 = i5 + 6;
            long j20 = (j19 >>> 32) + ((j7 & f6268M) * j10) + (((long) iArr3[i12]) & f6268M);
            iArr3[i12] = (int) j20;
            int i13 = i5 + 7;
            long j21 = (j20 >>> 32) + (j10 * j13) + (((long) iArr3[i13]) & f6268M);
            iArr3[i13] = (int) j21;
            int i14 = i5 + 8;
            long j22 = (j21 >>> 32) + j9 + (((long) iArr3[i14]) & f6268M);
            iArr3[i14] = (int) j22;
            j9 = j22 >>> 32;
            i4 = i6 + 1;
            i5 = i7;
            j8 = j13;
            j = j11;
            j4 = j4;
            j2 = j14;
            j3 = j3;
        }
        return (int) j9;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[1]) & f6268M;
        long j2 = (long) iArr2[2];
        long j3 = (long) iArr2[3];
        long j4 = (long) iArr2[4];
        long j5 = ((long) iArr2[5]) & f6268M;
        long j6 = (long) iArr2[0];
        long j7 = (long) iArr2[6];
        long j8 = ((long) iArr2[7]) & f6268M;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = j8;
            long j11 = ((long) iArr[i]) & f6268M;
            long j12 = j5;
            long j13 = (((long) iArr3[i]) & f6268M) + ((j6 & f6268M) * j11);
            iArr3[i] = (int) j13;
            int i2 = i + 1;
            long j14 = j;
            long j15 = (j13 >>> 32) + (j11 * j) + (((long) iArr3[i2]) & f6268M);
            iArr3[i2] = (int) j15;
            int i3 = i + 2;
            long j16 = j2;
            long j17 = (j15 >>> 32) + ((j2 & f6268M) * j11) + (((long) iArr3[i3]) & f6268M);
            iArr3[i3] = (int) j17;
            int i4 = i + 3;
            long j18 = (j17 >>> 32) + ((j3 & f6268M) * j11) + (((long) iArr3[i4]) & f6268M);
            iArr3[i4] = (int) j18;
            int i5 = i + 4;
            long j19 = (j18 >>> 32) + ((j4 & f6268M) * j11) + (((long) iArr3[i5]) & f6268M);
            iArr3[i5] = (int) j19;
            int i6 = i + 5;
            long j20 = (j19 >>> 32) + (j11 * j12) + (((long) iArr3[i6]) & f6268M);
            iArr3[i6] = (int) j20;
            int i7 = i + 6;
            long j21 = (j20 >>> 32) + ((j7 & f6268M) * j11) + (((long) iArr3[i7]) & f6268M);
            iArr3[i7] = (int) j21;
            int i8 = i + 7;
            long j22 = (j21 >>> 32) + (j11 * j10) + (((long) iArr3[i8]) & f6268M);
            iArr3[i8] = (int) j22;
            int i9 = i + 8;
            long j23 = (j22 >>> 32) + j9 + (((long) iArr3[i9]) & f6268M);
            iArr3[i9] = (int) j23;
            j9 = j23 >>> 32;
            i = i2;
            j8 = j10;
            j5 = j12;
            j3 = j3;
            j = j14;
            j2 = j16;
        }
        return (int) j9;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j = ((long) i) & f6268M;
        long j2 = (((long) iArr[0]) & f6268M) * j;
        iArr[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr[1]) & f6268M) * j);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr[2]) & f6268M) * j);
        iArr[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr[3]) & f6268M) * j);
        iArr[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr[4]) & f6268M) * j);
        iArr[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr[5]) & f6268M) * j);
        iArr[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr[6]) & f6268M) * j);
        iArr[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (f6268M & ((long) iArr[7])));
        iArr[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & f6268M;
        long j2 = ((((long) iArr2[0]) & f6268M) * j) + (((long) iArr[0]) & f6268M);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[1]) & f6268M) * j) + (((long) iArr[1]) & f6268M);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[2]) & f6268M) * j) + (((long) iArr[2]) & f6268M);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[3]) & f6268M) * j) + (((long) iArr[3]) & f6268M);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[4]) & f6268M) * j) + (((long) iArr[4]) & f6268M);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[5]) & f6268M) * j) + (((long) iArr[5]) & f6268M);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[6]) & f6268M) * j) + (((long) iArr[6]) & f6268M);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (((long) iArr2[7]) & f6268M)) + (f6268M & ((long) iArr[7]));
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = (long) i;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & f6268M) * (f6268M & j));
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 8);
        return (int) j2;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & f6268M;
        long j2 = ((((long) iArr[i2]) & f6268M) * j) + (((long) iArr2[i3]) & f6268M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & f6268M) * j) + (((long) iArr2[i4]) & f6268M);
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & f6268M) * j) + (((long) iArr2[i5]) & f6268M);
        iArr2[i5] = (int) j4;
        int i6 = i3 + 3;
        long j5 = (j4 >>> 32) + ((((long) iArr[i2 + 3]) & f6268M) * j) + (((long) iArr2[i6]) & f6268M);
        iArr2[i6] = (int) j5;
        int i7 = i3 + 4;
        long j6 = (j5 >>> 32) + ((((long) iArr[i2 + 4]) & f6268M) * j) + (((long) iArr2[i7]) & f6268M);
        iArr2[i7] = (int) j6;
        int i8 = i3 + 5;
        long j7 = (j6 >>> 32) + ((((long) iArr[i2 + 5]) & f6268M) * j) + (((long) iArr2[i8]) & f6268M);
        iArr2[i8] = (int) j7;
        int i9 = i3 + 6;
        long j8 = (j7 >>> 32) + ((((long) iArr[i2 + 6]) & f6268M) * j) + (((long) iArr2[i9]) & f6268M);
        iArr2[i9] = (int) j8;
        int i10 = i3 + 7;
        long j9 = (j8 >>> 32) + (j * (((long) iArr[i2 + 7]) & f6268M)) + (((long) iArr2[i10]) & f6268M);
        iArr2[i10] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6268M;
        long j3 = ((j & f6268M) * j2) + (((long) iArr[i2]) & f6268M);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j4 = (j3 >>> 32) + (j2 * (j >>> 32)) + (((long) iArr[i3]) & f6268M);
        iArr[i3] = (int) j4;
        int i4 = i2 + 2;
        long j5 = (j4 >>> 32) + (((long) iArr[i4]) & f6268M);
        iArr[i4] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & f6268M;
        int i3 = 0;
        int i4 = 16;
        int i5 = 7;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & f6268M;
            long j3 = j2 * j2;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr2[i2] = (int) j4;
                long j5 = ((long) iArr[i + 1]) & f6268M;
                int i8 = i2 + 2;
                long j6 = (long) iArr2[i8];
                long j7 = ((((long) (i3 << 31)) & f6268M) | (j4 >>> 33)) + (j5 * j);
                int i9 = (int) j7;
                iArr2[i2 + 1] = (i9 << 1) | (((int) (j4 >>> 32)) & 1);
                long j8 = ((long) iArr[i + 2]) & f6268M;
                int i10 = i2 + 3;
                long j9 = (long) iArr2[i10];
                int i11 = i2 + 4;
                long j10 = j5;
                long j11 = (j6 & f6268M) + (j7 >>> 32) + (j8 * j);
                int i12 = (int) j11;
                iArr2[i8] = (i12 << 1) | (i9 >>> 31);
                long j12 = (j9 & f6268M) + (j11 >>> 32) + (j8 * j10);
                long j13 = ((long) iArr[i + 3]) & f6268M;
                int i13 = i2 + 5;
                long j14 = (long) iArr2[i13];
                int i14 = i2 + 6;
                int i15 = i13;
                long j15 = (long) iArr2[i14];
                long j16 = (j12 & f6268M) + (j13 * j);
                int i16 = i11;
                int i17 = (int) j16;
                iArr2[i10] = (i17 << 1) | (i12 >>> 31);
                long j17 = (((long) iArr2[i11]) & f6268M) + (j12 >>> 32) + (j16 >>> 32) + (j13 * j10);
                long j18 = (j14 & f6268M) + (j17 >>> 32) + (j13 * j8);
                long j19 = ((long) iArr[i + 4]) & f6268M;
                int i18 = i2 + 7;
                int i19 = i2 + 8;
                int i20 = i18;
                long j20 = j13;
                long j21 = (j17 & f6268M) + (j19 * j);
                int i21 = (int) j21;
                iArr2[i16] = (i17 >>> 31) | (i21 << 1);
                long j22 = (j18 & f6268M) + (j21 >>> 32) + (j19 * j10);
                long j23 = (j15 & f6268M) + (j18 >>> 32) + (j22 >>> 32) + (j19 * j8);
                long j24 = (((long) iArr2[i18]) & f6268M) + (j23 >>> 32) + (j19 * j20);
                long j25 = ((long) iArr[i + 5]) & f6268M;
                int i22 = i2 + 9;
                long j26 = j19;
                int i23 = i2 + 10;
                int i24 = i22;
                long j27 = (long) iArr2[i22];
                long j28 = (long) iArr2[i23];
                long j29 = (j22 & f6268M) + (j25 * j);
                int i25 = (int) j29;
                iArr2[i15] = (i21 >>> 31) | (i25 << 1);
                long j30 = (j23 & f6268M) + (j29 >>> 32) + (j25 * j10);
                long j31 = (j24 & f6268M) + (j30 >>> 32) + (j25 * j8);
                long j32 = (((long) iArr2[i19]) & f6268M) + (j24 >>> 32) + (j31 >>> 32) + (j25 * j20);
                long j33 = (j27 & f6268M) + (j32 >>> 32) + (j25 * j26);
                long j34 = j25;
                long j35 = ((long) iArr[i + 6]) & f6268M;
                int i26 = i2 + 11;
                long j36 = j33;
                int i27 = i2 + 12;
                int i28 = i26;
                long j37 = (long) iArr2[i26];
                long j38 = (long) iArr2[i27];
                long j39 = (j30 & f6268M) + (j35 * j);
                int i29 = (int) j39;
                iArr2[i14] = (i25 >>> 31) | (i29 << 1);
                long j40 = (j31 & f6268M) + (j39 >>> 32) + (j35 * j10);
                long j41 = (j32 & f6268M) + (j40 >>> 32) + (j35 * j8);
                long j42 = (j36 & f6268M) + (j41 >>> 32) + (j35 * j20);
                long j43 = (j28 & f6268M) + (j36 >>> 32) + (j42 >>> 32) + (j35 * j26);
                long j44 = (j37 & f6268M) + (j43 >>> 32) + (j35 * j34);
                long j45 = j35;
                long j46 = ((long) iArr[i + 7]) & f6268M;
                int i30 = i2 + 13;
                int i31 = i2 + 14;
                long j47 = (long) iArr2[i30];
                long j48 = (j40 & f6268M) + (j * j46);
                int i32 = (int) j48;
                iArr2[i20] = (i32 << 1) | (i29 >>> 31);
                long j49 = (j41 & f6268M) + (j48 >>> 32) + (j46 * j10);
                long j50 = (j42 & f6268M) + (j49 >>> 32) + (j8 * j46);
                long j51 = (j43 & f6268M) + (j50 >>> 32) + (j46 * j20);
                long j52 = (j44 & f6268M) + (j51 >>> 32) + (j46 * j26);
                long j53 = (j38 & f6268M) + (j44 >>> 32) + (j52 >>> 32) + (j46 * j34);
                long j54 = (j47 & f6268M) + (j53 >>> 32) + (j46 * j45);
                long j55 = (((long) iArr2[i31]) & f6268M) + (j54 >>> 32);
                int i33 = (int) j49;
                iArr2[i19] = (i32 >>> 31) | (i33 << 1);
                int i34 = (int) j50;
                iArr2[i24] = (i33 >>> 31) | (i34 << 1);
                int i35 = (int) j51;
                iArr2[i23] = (i34 >>> 31) | (i35 << 1);
                int i36 = (int) j52;
                iArr2[i28] = (i35 >>> 31) | (i36 << 1);
                int i37 = (int) j53;
                iArr2[i27] = (i36 >>> 31) | (i37 << 1);
                int i38 = (int) j54;
                iArr2[i30] = (i37 >>> 31) | (i38 << 1);
                int i39 = (int) j55;
                iArr2[i31] = (i38 >>> 31) | (i39 << 1);
                int i40 = i2 + 15;
                iArr2[i40] = (i39 >>> 31) | ((iArr2[i40] + ((int) (j55 >> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & f6268M;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & f6268M;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & f6268M;
                long j6 = j;
                long j7 = (long) iArr2[2];
                long j8 = ((j4 >>> 33) | (((long) (i2 << 31)) & f6268M)) + (j5 * j6);
                int i6 = (int) j8;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                long j9 = ((long) iArr[2]) & f6268M;
                long j10 = j5;
                long j11 = (long) iArr2[3];
                long j12 = (long) iArr2[4];
                long j13 = (j7 & f6268M) + (j8 >>> 32) + (j9 * j6);
                int i7 = (int) j13;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long j14 = (j11 & f6268M) + (j13 >>> 32) + (j9 * j10);
                long j15 = ((long) iArr[3]) & f6268M;
                long j16 = (long) iArr2[6];
                long j17 = (j14 & f6268M) + (j15 * j6);
                int i8 = (int) j17;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j18 = (j12 & f6268M) + (j14 >>> 32) + (j17 >>> 32) + (j15 * j10);
                long j19 = (((long) iArr2[5]) & f6268M) + (j18 >>> 32) + (j15 * j9);
                long j20 = ((long) iArr[4]) & f6268M;
                long j21 = j9;
                long j22 = (long) iArr2[8];
                long j23 = (j18 & f6268M) + (j20 * j6);
                int i9 = (int) j23;
                iArr2[4] = (i9 << 1) | (i8 >>> 31);
                long j24 = (j19 & f6268M) + (j23 >>> 32) + (j20 * j10);
                long j25 = (j16 & f6268M) + (j19 >>> 32) + (j24 >>> 32) + (j20 * j21);
                long j26 = (((long) iArr2[7]) & f6268M) + (j25 >>> 32) + (j20 * j15);
                long j27 = ((long) iArr[5]) & f6268M;
                long j28 = (long) iArr2[9];
                long j29 = (long) iArr2[10];
                long j30 = (j24 & f6268M) + (j27 * j6);
                int i10 = (int) j30;
                iArr2[5] = (i10 << 1) | (i9 >>> 31);
                long j31 = (j25 & f6268M) + (j30 >>> 32) + (j27 * j10);
                long j32 = (j26 & f6268M) + (j31 >>> 32) + (j27 * j21);
                long j33 = (j22 & f6268M) + (j26 >>> 32) + (j32 >>> 32) + (j27 * j15);
                int i11 = i10;
                long j34 = (j28 & f6268M) + (j33 >>> 32) + (j27 * j20);
                long j35 = ((long) iArr[6]) & f6268M;
                long j36 = j27;
                long j37 = (long) iArr2[11];
                long j38 = (long) iArr2[12];
                long j39 = (j31 & f6268M) + (j35 * j6);
                int i12 = (int) j39;
                iArr2[6] = (i12 << 1) | (i11 >>> 31);
                long j40 = (j39 >>> 32) + (j35 * j10) + (j32 & f6268M);
                long j41 = (j33 & f6268M) + (j40 >>> 32) + (j35 * j21);
                long j42 = (j34 & f6268M) + (j41 >>> 32) + (j35 * j15);
                long j43 = (j42 >>> 32) + (j35 * j20) + (j29 & f6268M) + (j34 >>> 32);
                int i13 = i12;
                long j44 = (j37 & f6268M) + (j43 >>> 32) + (j35 * j36);
                long j45 = ((long) iArr[7]) & f6268M;
                long j46 = j35;
                long j47 = (long) iArr2[13];
                long j48 = (long) iArr2[14];
                long j49 = (j40 & f6268M) + (j6 * j45);
                int i14 = (int) j49;
                iArr2[7] = (i13 >>> 31) | (i14 << 1);
                long j50 = (j49 >>> 32) + (j10 * j45) + (j41 & f6268M);
                long j51 = (j50 >>> 32) + (j21 * j45);
                long j52 = j50;
                long j53 = (j42 & f6268M) + j51;
                long j54 = (j43 & f6268M) + (j53 >>> 32) + (j15 * j45);
                long j55 = (j44 & f6268M) + (j54 >>> 32) + (j20 * j45);
                long j56 = (j38 & f6268M) + (j44 >>> 32) + (j55 >>> 32) + (j45 * j36);
                long j57 = (j47 & f6268M) + (j56 >>> 32) + (j45 * j46);
                long j58 = (j48 & f6268M) + (j57 >>> 32);
                int i15 = (int) j52;
                iArr2[8] = (i14 >>> 31) | (i15 << 1);
                int i16 = (int) j53;
                iArr2[9] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) j54;
                iArr2[10] = (i16 >>> 31) | (i17 << 1);
                int i18 = (int) j55;
                iArr2[11] = (i17 >>> 31) | (i18 << 1);
                int i19 = (int) j56;
                iArr2[12] = (i18 >>> 31) | (i19 << 1);
                int i20 = (int) j57;
                iArr2[13] = (i19 >>> 31) | (i20 << 1);
                int i21 = (int) j58;
                iArr2[14] = (i20 >>> 31) | (i21 << 1);
                iArr2[15] = (i21 >>> 31) | ((iArr2[15] + ((int) (j58 >> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f6268M) - (((long) iArr2[i2]) & f6268M);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & f6268M) - (((long) iArr2[i2 + 1]) & f6268M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & f6268M) - (((long) iArr2[i2 + 2]) & f6268M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & f6268M) - (((long) iArr2[i2 + 3]) & f6268M));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & f6268M) - (((long) iArr2[i2 + 4]) & f6268M));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & f6268M) - (((long) iArr2[i2 + 5]) & f6268M));
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & f6268M) - (((long) iArr2[i2 + 6]) & f6268M));
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 7]) & f6268M) - (((long) iArr2[i2 + 7]) & f6268M));
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6268M) - (((long) iArr2[0]) & f6268M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & f6268M) - (((long) iArr2[1]) & f6268M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & f6268M) - (((long) iArr2[2]) & f6268M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & f6268M) - (((long) iArr2[3]) & f6268M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & f6268M) - (((long) iArr2[4]) & f6268M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & f6268M) - (((long) iArr2[5]) & f6268M));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & f6268M) - (((long) iArr2[6]) & f6268M));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[7]) & f6268M) - (((long) iArr2[7]) & f6268M));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr3[0]) & f6268M) - (((long) iArr[0]) & f6268M)) - (((long) iArr2[0]) & f6268M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & f6268M) - (((long) iArr[1]) & f6268M)) - (((long) iArr2[1]) & f6268M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & f6268M) - (((long) iArr[2]) & f6268M)) - (((long) iArr2[2]) & f6268M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & f6268M) - (((long) iArr[3]) & f6268M)) - (((long) iArr2[3]) & f6268M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((((long) iArr3[4]) & f6268M) - (((long) iArr[4]) & f6268M)) - (((long) iArr2[4]) & f6268M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((((long) iArr3[5]) & f6268M) - (((long) iArr[5]) & f6268M)) - (((long) iArr2[5]) & f6268M));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + (((((long) iArr3[6]) & f6268M) - (((long) iArr[6]) & f6268M)) - (((long) iArr2[6]) & f6268M));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + (((((long) iArr3[7]) & f6268M) - (((long) iArr[7]) & f6268M)) - (((long) iArr2[7]) & f6268M));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr2[i2]) & f6268M) - (((long) iArr[i]) & f6268M);
        iArr2[i2] = (int) j;
        int i3 = i2 + 1;
        long j2 = (j >> 32) + ((((long) iArr2[i3]) & f6268M) - (((long) iArr[i + 1]) & f6268M));
        iArr2[i3] = (int) j2;
        int i4 = i2 + 2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i4]) & f6268M) - (((long) iArr[i + 2]) & f6268M));
        iArr2[i4] = (int) j3;
        int i5 = i2 + 3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i5]) & f6268M) - (((long) iArr[i + 3]) & f6268M));
        iArr2[i5] = (int) j4;
        int i6 = i2 + 4;
        long j5 = (j4 >> 32) + ((((long) iArr2[i6]) & f6268M) - (((long) iArr[i + 4]) & f6268M));
        iArr2[i6] = (int) j5;
        int i7 = i2 + 5;
        long j6 = (j5 >> 32) + ((((long) iArr2[i7]) & f6268M) - (((long) iArr[i + 5]) & f6268M));
        iArr2[i7] = (int) j6;
        int i8 = i2 + 6;
        long j7 = (j6 >> 32) + ((((long) iArr2[i8]) & f6268M) - (((long) iArr[i + 6]) & f6268M));
        iArr2[i8] = (int) j7;
        int i9 = i2 + 7;
        long j8 = (j7 >> 32) + ((((long) iArr2[i9]) & f6268M) - (((long) iArr[i + 7]) & f6268M));
        iArr2[i9] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & f6268M) - (((long) iArr[0]) & f6268M);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & f6268M) - (((long) iArr[1]) & f6268M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & f6268M) - (((long) iArr[2]) & f6268M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & f6268M) - (((long) iArr[3]) & f6268M));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & f6268M) - (((long) iArr[4]) & f6268M));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & f6268M) - (((long) iArr[5]) & f6268M));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & f6268M) - (((long) iArr[6]) & f6268M));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[7]) & f6268M) - (f6268M & ((long) iArr[7])));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (3 - i) << 3);
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
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }
}
