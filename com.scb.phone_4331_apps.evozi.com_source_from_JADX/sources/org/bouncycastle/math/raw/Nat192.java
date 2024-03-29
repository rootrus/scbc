package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;

public abstract class Nat192 {

    /* renamed from: M */
    private static final long f6266M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6266M) + (((long) iArr2[0]) & f6266M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6266M) + (((long) iArr2[1]) & f6266M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6266M) + (((long) iArr2[2]) & f6266M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6266M) + (((long) iArr2[3]) & f6266M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6266M) + (((long) iArr2[4]) & f6266M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f6266M) + (((long) iArr2[5]) & f6266M);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6266M) + (((long) iArr2[0]) & f6266M) + (((long) iArr3[0]) & f6266M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6266M) + (((long) iArr2[1]) & f6266M) + (((long) iArr3[1]) & f6266M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6266M) + (((long) iArr2[2]) & f6266M) + (((long) iArr3[2]) & f6266M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6266M) + (((long) iArr2[3]) & f6266M) + (((long) iArr3[3]) & f6266M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6266M) + (((long) iArr2[4]) & f6266M) + (((long) iArr3[4]) & f6266M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f6266M) + (((long) iArr2[5]) & f6266M) + (((long) iArr3[5]) & f6266M);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & f6266M) + (((long) iArr[i]) & f6266M) + (((long) iArr2[i2]) & f6266M);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & f6266M) + (((long) iArr2[i4]) & f6266M);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & f6266M) + (((long) iArr2[i5]) & f6266M);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & f6266M) + (((long) iArr2[i6]) & f6266M);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & f6266M) + (((long) iArr2[i7]) & f6266M);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & f6266M) + (((long) iArr2[i8]) & f6266M);
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & f6266M) + (((long) iArr2[0]) & f6266M);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & f6266M) + (((long) iArr2[1]) & f6266M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & f6266M) + (((long) iArr2[2]) & f6266M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & f6266M) + (((long) iArr2[3]) & f6266M);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & f6266M) + (((long) iArr2[4]) & f6266M);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & f6266M) + (f6266M & ((long) iArr2[5]));
        iArr2[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & f6266M) + (((long) iArr2[i2]) & f6266M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i4]) & f6266M) + (((long) iArr2[i5]) & f6266M);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i7]) & f6266M) + (((long) iArr2[i8]) & f6266M);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i10]) & f6266M) + (((long) iArr2[i11]) & f6266M);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i13]) & f6266M) + (((long) iArr2[i14]) & f6266M);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i16]) & f6266M) + (f6266M & ((long) iArr2[i17]));
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        return (int) (j6 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
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
    public static boolean m6287eq(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
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
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
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
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
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
        for (int i = 5; i >= 0; i--) {
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
        for (int i = 1; i < 6; i++) {
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
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f6266M;
        long j2 = ((long) iArr2[i2 + 1]) & f6266M;
        long j3 = ((long) iArr2[i2 + 2]) & f6266M;
        long j4 = ((long) iArr2[i2 + 3]) & f6266M;
        long j5 = ((long) iArr2[i2 + 4]) & f6266M;
        long j6 = ((long) iArr2[i2 + 5]) & f6266M;
        long j7 = ((long) iArr[i]) & f6266M;
        long j8 = j7 * j;
        long j9 = j;
        iArr3[i3] = (int) j8;
        long j10 = (j8 >>> 32) + (j7 * j2);
        long j11 = j2;
        iArr3[i3 + 1] = (int) j10;
        long j12 = (j10 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j15;
        iArr3[i3 + 6] = (int) (j15 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 6) {
            i5 += i4;
            long j16 = ((long) iArr[i + i6]) & f6266M;
            long j17 = (j16 * j9) + (((long) iArr3[i5]) & f6266M);
            iArr3[i5] = (int) j17;
            int i7 = i5 + 1;
            long j18 = j6;
            long j19 = (j17 >>> 32) + (j16 * j11) + (((long) iArr3[i7]) & f6266M);
            iArr3[i7] = (int) j19;
            int i8 = i5 + 2;
            long j20 = (j19 >>> 32) + (j16 * j3) + (((long) iArr3[i8]) & f6266M);
            iArr3[i8] = (int) j20;
            int i9 = i5 + 3;
            long j21 = (j20 >>> 32) + (j16 * j4) + (((long) iArr3[i9]) & f6266M);
            iArr3[i9] = (int) j21;
            int i10 = i5 + 4;
            long j22 = (j21 >>> 32) + (j16 * j5) + (((long) iArr3[i10]) & f6266M);
            iArr3[i10] = (int) j22;
            int i11 = i5 + 5;
            long j23 = (j22 >>> 32) + (j16 * j18) + (((long) iArr3[i11]) & f6266M);
            iArr3[i11] = (int) j23;
            iArr3[i5 + 6] = (int) (j23 >>> 32);
            i6++;
            j6 = j18;
            i4 = 1;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & f6266M;
        long j2 = ((long) iArr2[1]) & f6266M;
        long j3 = ((long) iArr2[2]) & f6266M;
        long j4 = ((long) iArr2[3]) & f6266M;
        long j5 = ((long) iArr2[4]) & f6266M;
        long j6 = j3;
        long j7 = ((long) iArr2[5]) & f6266M;
        long j8 = ((long) iArr[0]) & f6266M;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j6);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j7);
        iArr3[5] = (int) j14;
        iArr3[6] = (int) (j14 >>> 32);
        int i = 1;
        for (int i2 = 6; i < i2; i2 = 6) {
            long j15 = ((long) iArr[i]) & f6266M;
            long j16 = (j15 * j) + (((long) iArr3[i]) & f6266M);
            iArr3[i] = (int) j16;
            int i3 = i + 1;
            long j17 = (j16 >>> 32) + (j15 * j2) + (((long) iArr3[i3]) & f6266M);
            iArr3[i3] = (int) j17;
            int i4 = i + 2;
            long j18 = (j17 >>> 32) + (j15 * j6) + (((long) iArr3[i4]) & f6266M);
            iArr3[i4] = (int) j18;
            int i5 = i + 3;
            long j19 = (j18 >>> 32) + (j15 * j4) + (((long) iArr3[i5]) & f6266M);
            iArr3[i5] = (int) j19;
            int i6 = i + 4;
            long j20 = (j19 >>> 32) + (j15 * j5) + (((long) iArr3[i6]) & f6266M);
            iArr3[i6] = (int) j20;
            int i7 = i + 5;
            long j21 = (j20 >>> 32) + (j15 * j7) + (((long) iArr3[i7]) & f6266M);
            iArr3[i7] = (int) j21;
            iArr3[i + 6] = (int) (j21 >>> 32);
            i = i3;
            j4 = j4;
            j = j;
            j2 = j2;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & f6266M;
        long j2 = ((long) iArr[i2]) & f6266M;
        long j3 = (j * j2) + (((long) iArr2[i3]) & f6266M);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & f6266M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & f6266M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = ((long) iArr[i2 + 2]) & f6266M;
        long j7 = (j5 >>> 32) + (j * j6) + j4 + (((long) iArr2[i3 + 2]) & f6266M);
        iArr3[i4 + 2] = (int) j7;
        long j8 = ((long) iArr[i2 + 3]) & f6266M;
        long j9 = (j7 >>> 32) + (j * j8) + j6 + (((long) iArr2[i3 + 3]) & f6266M);
        iArr3[i4 + 3] = (int) j9;
        long j10 = ((long) iArr[i2 + 4]) & f6266M;
        long j11 = (j9 >>> 32) + (j * j10) + j8 + (((long) iArr2[i3 + 4]) & f6266M);
        iArr3[i4 + 4] = (int) j11;
        long j12 = ((long) iArr[i2 + 5]) & f6266M;
        long j13 = (j11 >>> 32) + (j * j12) + j10 + (f6266M & ((long) iArr2[i3 + 5]));
        iArr3[i4 + 5] = (int) j13;
        return (j13 >>> 32) + j12;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6266M;
        long j3 = j & f6266M;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & f6266M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        int i3 = i2 + 1;
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (((long) iArr[i3]) & f6266M);
        iArr[i3] = (int) j6;
        int i4 = i2 + 2;
        long j7 = (j6 >>> 32) + j5 + (((long) iArr[i4]) & f6266M);
        iArr[i4] = (int) j7;
        int i5 = i2 + 3;
        long j8 = (j7 >>> 32) + (f6266M & ((long) iArr[i5]));
        iArr[i5] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = (long) i;
        long j2 = ((long) i2) & f6266M;
        long j3 = ((j & f6266M) * j2) + (((long) iArr[i3]) & f6266M);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & f6266M);
        iArr[i4] = (int) j4;
        int i5 = i3 + 2;
        long j5 = (j4 >>> 32) + (f6266M & ((long) iArr[i5]));
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & f6266M;
        long j2 = ((long) iArr2[i2 + 1]) & f6266M;
        long j3 = ((long) iArr2[i2 + 2]) & f6266M;
        long j4 = (long) iArr2[i2 + 3];
        long j5 = (long) iArr2[i2 + 4];
        long j6 = (long) iArr2[i2 + 5];
        long j7 = 0;
        int i4 = 0;
        int i5 = i3;
        while (i4 < 6) {
            long j8 = ((long) iArr[i + i4]) & f6266M;
            long j9 = j;
            long j10 = (j8 * j) + (((long) iArr3[i5]) & f6266M);
            int i6 = i4;
            iArr3[i5] = (int) j10;
            int i7 = i5 + 1;
            long j11 = j2;
            long j12 = (j10 >>> 32) + (j8 * j2) + (((long) iArr3[i7]) & f6266M);
            iArr3[i7] = (int) j12;
            int i8 = i5 + 2;
            long j13 = (j12 >>> 32) + (j8 * j3) + (((long) iArr3[i8]) & f6266M);
            iArr3[i8] = (int) j13;
            int i9 = i5 + 3;
            long j14 = (j13 >>> 32) + ((j4 & f6266M) * j8) + (((long) iArr3[i9]) & f6266M);
            iArr3[i9] = (int) j14;
            int i10 = i5 + 4;
            long j15 = (j14 >>> 32) + ((j5 & f6266M) * j8) + (((long) iArr3[i10]) & f6266M);
            iArr3[i10] = (int) j15;
            int i11 = i5 + 5;
            long j16 = (j15 >>> 32) + (j8 * (j6 & f6266M)) + (((long) iArr3[i11]) & f6266M);
            iArr3[i11] = (int) j16;
            int i12 = i5 + 6;
            long j17 = (j16 >>> 32) + j7 + (((long) iArr3[i12]) & f6266M);
            iArr3[i12] = (int) j17;
            j7 = j17 >>> 32;
            i5 = i7;
            j4 = j4;
            j2 = j11;
            j3 = j3;
            i4 = i6 + 1;
            j = j9;
        }
        return (int) j7;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & f6266M;
        long j2 = ((long) iArr2[1]) & f6266M;
        long j3 = ((long) iArr2[2]) & f6266M;
        long j4 = (long) iArr2[3];
        long j5 = (long) iArr2[4];
        long j6 = ((long) iArr2[5]) & f6266M;
        long j7 = 0;
        while (i < 6) {
            long j8 = j6;
            long j9 = ((long) iArr[i]) & f6266M;
            long j10 = j;
            long j11 = (((long) iArr3[i]) & f6266M) + (j9 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = j2;
            long j13 = (j11 >>> 32) + (j9 * j2) + (((long) iArr3[i2]) & f6266M);
            iArr3[i2] = (int) j13;
            int i3 = i + 2;
            long j14 = (j13 >>> 32) + (j9 * j3) + (((long) iArr3[i3]) & f6266M);
            iArr3[i3] = (int) j14;
            int i4 = i + 3;
            long j15 = (j14 >>> 32) + ((j4 & f6266M) * j9) + (((long) iArr3[i4]) & f6266M);
            iArr3[i4] = (int) j15;
            int i5 = i + 4;
            long j16 = (j15 >>> 32) + ((j5 & f6266M) * j9) + (((long) iArr3[i5]) & f6266M);
            iArr3[i5] = (int) j16;
            int i6 = i + 5;
            long j17 = (j16 >>> 32) + (j9 * j8) + (((long) iArr3[i6]) & f6266M);
            iArr3[i6] = (int) j17;
            int i7 = i + 6;
            long j18 = (j17 >>> 32) + j7 + (((long) iArr3[i7]) & f6266M);
            iArr3[i7] = (int) j18;
            j7 = j18 >>> 32;
            i = i2;
            j6 = j8;
            j = j10;
            j4 = j4;
            j2 = j12;
            j3 = j3;
        }
        return (int) j7;
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = (long) i;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & f6266M) * (f6266M & j));
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 6);
        return (int) j2;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & f6266M;
        long j2 = ((((long) iArr[i2]) & f6266M) * j) + (((long) iArr2[i3]) & f6266M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & f6266M) * j) + (((long) iArr2[i4]) & f6266M);
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & f6266M) * j) + (((long) iArr2[i5]) & f6266M);
        iArr2[i5] = (int) j4;
        int i6 = i3 + 3;
        long j5 = (j4 >>> 32) + ((((long) iArr[i2 + 3]) & f6266M) * j) + (((long) iArr2[i6]) & f6266M);
        iArr2[i6] = (int) j5;
        int i7 = i3 + 4;
        long j6 = (j5 >>> 32) + ((((long) iArr[i2 + 4]) & f6266M) * j) + (((long) iArr2[i7]) & f6266M);
        iArr2[i7] = (int) j6;
        int i8 = i3 + 5;
        long j7 = (j6 >>> 32) + (j * (((long) iArr[i2 + 5]) & f6266M)) + (((long) iArr2[i8]) & f6266M);
        iArr2[i8] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & f6266M;
        long j3 = ((j & f6266M) * j2) + (((long) iArr[i2]) & f6266M);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j4 = (j3 >>> 32) + (j2 * (j >>> 32)) + (((long) iArr[i3]) & f6266M);
        iArr[i3] = (int) j4;
        int i4 = i2 + 2;
        long j5 = (j4 >>> 32) + (((long) iArr[i4]) & f6266M);
        iArr[i4] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & f6266M;
        int i3 = 0;
        int i4 = 12;
        int i5 = 5;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & f6266M;
            long j3 = j2 * j2;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr2[i2] = (int) j4;
                long j5 = ((long) iArr[i + 1]) & f6266M;
                int i8 = i2 + 2;
                long j6 = (long) iArr2[i8];
                long j7 = ((((long) (i3 << 31)) & f6266M) | (j4 >>> 33)) + (j5 * j);
                int i9 = (int) j7;
                iArr2[i2 + 1] = (i9 << 1) | (((int) (j4 >>> 32)) & 1);
                long j8 = ((long) iArr[i + 2]) & f6266M;
                int i10 = i2 + 3;
                long j9 = (long) iArr2[i10];
                int i11 = i2 + 4;
                long j10 = j5;
                long j11 = (j6 & f6266M) + (j7 >>> 32) + (j8 * j);
                int i12 = (int) j11;
                iArr2[i8] = (i12 << 1) | (i9 >>> 31);
                long j12 = (j9 & f6266M) + (j11 >>> 32) + (j8 * j10);
                long j13 = ((long) iArr[i + 3]) & f6266M;
                int i13 = i2 + 5;
                long j14 = (long) iArr2[i13];
                int i14 = i2 + 6;
                int i15 = i13;
                long j15 = (long) iArr2[i14];
                long j16 = (j12 & f6266M) + (j13 * j);
                int i16 = i11;
                int i17 = (int) j16;
                iArr2[i10] = (i17 << 1) | (i12 >>> 31);
                long j17 = (((long) iArr2[i11]) & f6266M) + (j12 >>> 32) + (j16 >>> 32) + (j13 * j10);
                long j18 = (j14 & f6266M) + (j17 >>> 32) + (j13 * j8);
                long j19 = ((long) iArr[i + 4]) & f6266M;
                int i18 = i2 + 7;
                int i19 = i2 + 8;
                int i20 = i18;
                long j20 = j13;
                long j21 = (j17 & f6266M) + (j19 * j);
                int i21 = (int) j21;
                iArr2[i16] = (i17 >>> 31) | (i21 << 1);
                long j22 = (j18 & f6266M) + (j21 >>> 32) + (j19 * j10);
                long j23 = (j15 & f6266M) + (j18 >>> 32) + (j22 >>> 32) + (j19 * j8);
                long j24 = (((long) iArr2[i18]) & f6266M) + (j23 >>> 32) + (j19 * j20);
                long j25 = ((long) iArr[i + 5]) & f6266M;
                int i22 = i2 + 9;
                long j26 = j19;
                int i23 = i2 + 10;
                int i24 = i22;
                long j27 = (long) iArr2[i22];
                long j28 = (long) iArr2[i23];
                long j29 = (j22 & f6266M) + (j * j25);
                int i25 = (int) j29;
                iArr2[i15] = (i25 << 1) | (i21 >>> 31);
                long j30 = (j23 & f6266M) + (j29 >>> 32) + (j10 * j25);
                long j31 = (j24 & f6266M) + (j30 >>> 32) + (j8 * j25);
                long j32 = (((long) iArr2[i19]) & f6266M) + (j24 >>> 32) + (j31 >>> 32) + (j25 * j20);
                long j33 = (j27 & f6266M) + (j32 >>> 32) + (j25 * j26);
                long j34 = (j28 & f6266M) + (j33 >>> 32);
                int i26 = (int) j30;
                iArr2[i14] = (i25 >>> 31) | (i26 << 1);
                int i27 = (int) j31;
                iArr2[i20] = (i26 >>> 31) | (i27 << 1);
                int i28 = (int) j32;
                iArr2[i19] = (i27 >>> 31) | (i28 << 1);
                int i29 = (int) j33;
                iArr2[i24] = (i28 >>> 31) | (i29 << 1);
                int i30 = (int) j34;
                iArr2[i23] = (i29 >>> 31) | (i30 << 1);
                int i31 = i2 + 11;
                iArr2[i31] = (i30 >>> 31) | ((iArr2[i31] + ((int) (j34 >> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & f6266M;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & f6266M;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & f6266M;
                long j6 = j;
                long j7 = (long) iArr2[2];
                long j8 = ((j4 >>> 33) | (((long) (i2 << 31)) & f6266M)) + (j5 * j6);
                int i6 = (int) j8;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                long j9 = ((long) iArr[2]) & f6266M;
                long j10 = j5;
                long j11 = (long) iArr2[3];
                long j12 = (long) iArr2[4];
                long j13 = (j7 & f6266M) + (j8 >>> 32) + (j9 * j6);
                int i7 = (int) j13;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long j14 = (j11 & f6266M) + (j13 >>> 32) + (j9 * j10);
                long j15 = ((long) iArr[3]) & f6266M;
                long j16 = (long) iArr2[5];
                long j17 = (long) iArr2[6];
                long j18 = (j14 & f6266M) + (j15 * j6);
                int i8 = (int) j18;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j19 = (j12 & f6266M) + (j14 >>> 32) + (j18 >>> 32) + (j15 * j10);
                long j20 = j16 & f6266M;
                int i9 = i8;
                long j21 = j20 + (j19 >>> 32) + (j15 * j9);
                long j22 = ((long) iArr[4]) & f6266M;
                long j23 = j15;
                long j24 = (long) iArr2[8];
                long j25 = (j19 & f6266M) + (j22 * j6);
                int i10 = (int) j25;
                iArr2[4] = (i10 << 1) | (i9 >>> 31);
                long j26 = (j21 & f6266M) + (j25 >>> 32) + (j22 * j10);
                long j27 = (j26 >>> 32) + (j22 * j9) + (j17 & f6266M) + (j21 >>> 32);
                int i11 = i10;
                long j28 = (((long) iArr2[7]) & f6266M) + (j27 >>> 32) + (j22 * j23);
                long j29 = ((long) iArr[5]) & f6266M;
                long j30 = (long) iArr2[9];
                long j31 = j22;
                long j32 = (long) iArr2[10];
                long j33 = (j26 & f6266M) + (j6 * j29);
                int i12 = (int) j33;
                iArr2[5] = (i11 >>> 31) | (i12 << 1);
                long j34 = (j27 & f6266M) + (j33 >>> 32) + (j10 * j29);
                long j35 = (j28 & f6266M) + (j34 >>> 32) + (j9 * j29);
                long j36 = (j24 & f6266M) + (j28 >>> 32) + (j35 >>> 32) + (j29 * j23);
                long j37 = (j30 & f6266M) + (j36 >>> 32) + (j29 * j31);
                long j38 = (j32 & f6266M) + (j37 >>> 32);
                int i13 = (int) j34;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j35;
                iArr2[7] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j36;
                iArr2[8] = (i14 >>> 31) | (i15 << 1);
                int i16 = (int) j37;
                iArr2[9] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) j38;
                iArr2[10] = (i16 >>> 31) | (i17 << 1);
                iArr2[11] = (i17 >>> 31) | ((iArr2[11] + ((int) (j38 >> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & f6266M) - (((long) iArr2[i2]) & f6266M);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & f6266M) - (((long) iArr2[i2 + 1]) & f6266M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & f6266M) - (((long) iArr2[i2 + 2]) & f6266M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & f6266M) - (((long) iArr2[i2 + 3]) & f6266M));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & f6266M) - (((long) iArr2[i2 + 4]) & f6266M));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & f6266M) - (((long) iArr2[i2 + 5]) & f6266M));
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & f6266M) - (((long) iArr2[0]) & f6266M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & f6266M) - (((long) iArr2[1]) & f6266M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & f6266M) - (((long) iArr2[2]) & f6266M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & f6266M) - (((long) iArr2[3]) & f6266M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & f6266M) - (((long) iArr2[4]) & f6266M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & f6266M) - (((long) iArr2[5]) & f6266M));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr3[0]) & f6266M) - (((long) iArr[0]) & f6266M)) - (((long) iArr2[0]) & f6266M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & f6266M) - (((long) iArr[1]) & f6266M)) - (((long) iArr2[1]) & f6266M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & f6266M) - (((long) iArr[2]) & f6266M)) - (((long) iArr2[2]) & f6266M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & f6266M) - (((long) iArr[3]) & f6266M)) - (((long) iArr2[3]) & f6266M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((((long) iArr3[4]) & f6266M) - (((long) iArr[4]) & f6266M)) - (((long) iArr2[4]) & f6266M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((((long) iArr3[5]) & f6266M) - (((long) iArr[5]) & f6266M)) - (((long) iArr2[5]) & f6266M));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr2[i2]) & f6266M) - (((long) iArr[i]) & f6266M);
        iArr2[i2] = (int) j;
        int i3 = i2 + 1;
        long j2 = (j >> 32) + ((((long) iArr2[i3]) & f6266M) - (((long) iArr[i + 1]) & f6266M));
        iArr2[i3] = (int) j2;
        int i4 = i2 + 2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i4]) & f6266M) - (((long) iArr[i + 2]) & f6266M));
        iArr2[i4] = (int) j3;
        int i5 = i2 + 3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i5]) & f6266M) - (((long) iArr[i + 3]) & f6266M));
        iArr2[i5] = (int) j4;
        int i6 = i2 + 4;
        long j5 = (j4 >> 32) + ((((long) iArr2[i6]) & f6266M) - (((long) iArr[i + 4]) & f6266M));
        iArr2[i6] = (int) j5;
        int i7 = i2 + 5;
        long j6 = (j5 >> 32) + ((((long) iArr2[i7]) & f6266M) - (((long) iArr[i + 5]) & f6266M));
        iArr2[i7] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & f6266M) - (((long) iArr[0]) & f6266M);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & f6266M) - (((long) iArr[1]) & f6266M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & f6266M) - (((long) iArr[2]) & f6266M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & f6266M) - (((long) iArr[3]) & f6266M));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & f6266M) - (((long) iArr[4]) & f6266M));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & f6266M) - (f6266M & ((long) iArr[5])));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (2 - i) << 3);
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
    }
}
