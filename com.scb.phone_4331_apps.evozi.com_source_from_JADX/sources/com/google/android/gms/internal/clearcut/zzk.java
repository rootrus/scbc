package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzk {
    private static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long zza(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public static long zza(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i = 37;
        long j = -5435081209227447693L;
        char c = 0;
        if (length <= 32) {
            if (length > 16) {
                long j2 = ((long) (length << 1)) - 7286425919675154353L;
                long zzb = zzb(bArr2, 0) * -5435081209227447693L;
                long zzb2 = zzb(bArr2, 8);
                int i2 = length + 0;
                long zzb3 = zzb(bArr2, i2 - 8) * j2;
                return zza(Long.rotateRight(zzb + zzb2, 43) + Long.rotateRight(zzb3, 30) + (zzb(bArr2, i2 - 16) * -7286425919675154353L), zzb + Long.rotateRight(zzb2 - 7286425919675154353L, 18) + zzb3, j2);
            } else if (length >= 8) {
                long j3 = ((long) (length << 1)) - 7286425919675154353L;
                long zzb4 = zzb(bArr2, 0) - 7286425919675154353L;
                long zzb5 = zzb(bArr2, (length + 0) - 8);
                return zza((Long.rotateRight(zzb5, 37) * j3) + zzb4, (Long.rotateRight(zzb4, 25) + zzb5) * j3, j3);
            } else if (length >= 4) {
                return zza(((long) length) + ((((long) zza(bArr2, 0)) & 4294967295L) << 3), ((long) zza(bArr2, (length + 0) - 4)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            } else {
                if (length <= 0) {
                    return -7286425919675154353L;
                }
                long j4 = (((long) (length + ((bArr2[(length - 1) + 0] & 255) << 2))) * -4348849565147123417L) ^ (((long) ((bArr2[0] & 255) + ((bArr2[(length >> 1) + 0] & 255) << 8))) * -7286425919675154353L);
                return (j4 ^ (j4 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j5 = ((long) (length << 1)) - 7286425919675154353L;
            long zzb6 = zzb(bArr2, 0) * -7286425919675154353L;
            long zzb7 = zzb(bArr2, 8);
            int i3 = length + 0;
            long zzb8 = zzb(bArr2, i3 - 8) * j5;
            int i4 = i3;
            long rotateRight = Long.rotateRight(zzb6 + zzb7, 43) + Long.rotateRight(zzb8, 30) + (zzb(bArr2, i3 - 16) * -7286425919675154353L);
            long j6 = j5;
            long zza = zza(rotateRight, Long.rotateRight(zzb7 - 7286425919675154353L, 18) + zzb6 + zzb8, j6);
            long zzb9 = zzb(bArr2, 16) * j5;
            long zzb10 = zzb(bArr2, 24);
            long zzb11 = (rotateRight + zzb(bArr2, i4 - 32)) * j5;
            return zza(Long.rotateRight(zzb9 + zzb10, 43) + Long.rotateRight(zzb11, 30) + ((zza + zzb(bArr2, i4 - 24)) * j5), zzb9 + Long.rotateRight(zzb10 + zzb6, 18) + zzb11, j6);
        } else {
            long j7 = 2480279821605975764L;
            long j8 = 1390051526045402406L;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long zzb12 = zzb(bArr2, 0) + 95310865018149119L;
            int i5 = length - 1;
            int i6 = ((i5 / 64) << 6) + 0;
            int i7 = i5 & 63;
            int i8 = (i6 + i7) - 63;
            int i9 = 0;
            while (true) {
                long rotateRight2 = Long.rotateRight(zzb12 + j7 + jArr[c] + zzb(bArr2, i9 + 8), i);
                long rotateRight3 = Long.rotateRight(j7 + jArr[1] + zzb(bArr2, i9 + 48), 42);
                long j9 = (rotateRight2 * j) ^ jArr2[1];
                long zzb13 = (rotateRight3 * j) + jArr[c] + zzb(bArr2, i9 + 40);
                long rotateRight4 = Long.rotateRight(j8 + jArr2[c], 33) * j;
                long j10 = jArr[1] * j;
                int i10 = i7;
                char c2 = c;
                int i11 = i6;
                zza(bArr, i9, j10, jArr2[c] + j9, jArr);
                zza(bArr, i9 + 32, rotateRight4 + jArr2[1], zzb13 + zzb(bArr2, i9 + 16), jArr2);
                int i12 = i9 + 64;
                if (i12 == i11) {
                    long j11 = ((255 & j9) << 1) - 5435081209227447693L;
                    jArr2[c2] = jArr2[c2] + ((long) i10);
                    jArr[c2] = jArr[c2] + jArr2[c2];
                    jArr2[c2] = jArr2[c2] + jArr[c2];
                    long rotateRight5 = Long.rotateRight(rotateRight4 + zzb13 + jArr[c2] + zzb(bArr2, i8 + 8), 37);
                    long rotateRight6 = Long.rotateRight(zzb13 + jArr[1] + zzb(bArr2, i8 + 48), 42);
                    long j12 = (rotateRight5 * j11) ^ (jArr2[1] * 9);
                    long zzb14 = (rotateRight6 * j11) + (jArr[c2] * 9) + zzb(bArr2, i8 + 40);
                    long rotateRight7 = Long.rotateRight(j9 + jArr2[c2], 33) * j11;
                    zza(bArr, i8, jArr[1] * j11, j12 + jArr2[c2], jArr);
                    zza(bArr, i8 + 32, jArr2[1] + rotateRight7, zzb(bArr2, i8 + 16) + zzb14, jArr2);
                    long j13 = j11;
                    return zza(zza(jArr[c2], jArr2[c2], j13) + (((zzb14 >>> 47) ^ zzb14) * -4348849565147123417L) + j12, zza(jArr[1], jArr2[1], j13) + rotateRight7, j13);
                }
                i9 = i12;
                i6 = i11;
                i7 = i10;
                j8 = j9;
                j7 = zzb13;
                zzb12 = rotateRight4;
                i = 37;
                c = c2;
                j = -5435081209227447693L;
            }
        }
    }

    private static void zza(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long zzb = zzb(bArr, i);
        long zzb2 = zzb(bArr, i + 8);
        long zzb3 = zzb(bArr, i + 16);
        long zzb4 = zzb(bArr, i + 24);
        long j3 = j + zzb;
        long rotateRight = Long.rotateRight(j2 + j3 + zzb4, 21);
        long j4 = zzb2 + j3 + zzb3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + zzb4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    private static long zzb(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
