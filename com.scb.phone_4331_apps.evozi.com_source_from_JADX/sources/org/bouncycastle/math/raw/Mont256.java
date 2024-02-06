package org.bouncycastle.math.raw;

public abstract class Mont256 {

    /* renamed from: M */
    private static final long f6262M = 4294967295L;

    public static int inverse32(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c = 0;
        long j = ((long) iArr2[0]) & f6262M;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            long j2 = ((long) iArr[i2]) & f6262M;
            long j3 = j2 * j;
            long j4 = (j3 & f6262M) + (((long) iArr5[c]) & f6262M);
            long j5 = j;
            long j6 = ((long) (((int) j4) * i)) & f6262M;
            int i4 = i2;
            int i5 = i3;
            long j7 = (((long) iArr6[c]) & f6262M) * j6;
            char c2 = ' ';
            long j8 = ((j4 + (j7 & f6262M)) >>> 32) + (j3 >>> 32) + (j7 >>> 32);
            int i6 = 1;
            while (i6 < 8) {
                long j9 = (((long) iArr2[i6]) & f6262M) * j2;
                long j10 = (((long) iArr6[i6]) & f6262M) * j6;
                long j11 = j8 + (j9 & f6262M) + (j10 & f6262M) + (((long) iArr5[i6]) & f6262M);
                iArr5[i6 - 1] = (int) j11;
                j8 = (j11 >>> 32) + (j9 >>> 32) + (j10 >>> 32);
                i6++;
                c2 = ' ';
                j6 = j6;
            }
            long j12 = j8 + (((long) i5) & f6262M);
            iArr5[7] = (int) j12;
            i3 = (int) (j12 >>> c2);
            i2 = i4 + 1;
            j = j5;
            c = 0;
        }
        if (i3 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr5, iArr6, iArr5);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c = 0;
        long j = ((long) iArr2[0]) & f6262M;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= 8) {
                break;
            }
            long j2 = ((long) iArr[i]) & f6262M;
            long j3 = (j2 * j) + (((long) iArr5[c]) & f6262M);
            long j4 = j3 & f6262M;
            long j5 = (j3 >>> 32) + j4;
            int i3 = 1;
            for (int i4 = 8; i3 < i4; i4 = 8) {
                long j6 = j;
                long j7 = (((long) iArr2[i3]) & f6262M) * j2;
                long j8 = (((long) iArr6[i3]) & f6262M) * j4;
                long j9 = j5 + (j7 & f6262M) + (j8 & f6262M) + (((long) iArr5[i3]) & f6262M);
                iArr5[i3 - 1] = (int) j9;
                j5 = (j9 >>> 32) + (j7 >>> 32) + (j8 >>> 32);
                i3++;
                j = j6;
                j2 = j2;
                j4 = j4;
            }
            long j10 = j5 + (((long) i2) & f6262M);
            iArr5[7] = (int) j10;
            i2 = (int) (j10 >>> 32);
            i++;
            j = j;
            c = 0;
        }
        if (i2 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr5, iArr6, iArr5);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        char c = 0;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = iArr3[c];
            long j = ((long) (i3 * i)) & f6262M;
            long j2 = (((((long) iArr4[c]) & f6262M) * j) + (((long) i3) & f6262M)) >>> 32;
            int i4 = 1;
            while (i4 < 8) {
                long j3 = j2 + ((((long) iArr4[i4]) & f6262M) * j) + (((long) iArr3[i4]) & f6262M);
                iArr3[i4 - 1] = (int) j3;
                j2 = j3 >>> 32;
                i4++;
                i2 = i2;
            }
            iArr3[7] = (int) j2;
            i2++;
            c = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 8; i++) {
            long j = ((long) iArr[0]) & f6262M;
            long j2 = j;
            for (int i2 = 1; i2 < 8; i2++) {
                long j3 = j2 + ((((long) iArr2[i2]) & f6262M) * j) + (((long) iArr[i2]) & f6262M);
                iArr[i2 - 1] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr[7] = (int) j2;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
