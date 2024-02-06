package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.util.Arrays;

class ErrorCorrection {
    ErrorCorrection() {
    }

    static short LDDecode(int i, int i2, int i3, int i4) {
        return (short) (((((m6291g(i) + m6291g(i2)) + m6291g(i3)) + m6291g(i4)) - 98312) >>> 31);
    }

    static int abs(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    /* renamed from: f */
    static int m6290f(int[] iArr, int i, int i2, int i3) {
        int i4 = (i3 * 2730) >> 25;
        int i5 = i4 - ((12288 - (i3 - (i4 * 12289))) >> 31);
        iArr[i] = (i5 >> 1) + (i5 & 1);
        int i6 = i5 - 1;
        iArr[i2] = (i6 >> 1) + (i6 & 1);
        return abs(i3 - ((iArr[i] << 1) * 12289));
    }

    /* renamed from: g */
    static int m6291g(int i) {
        int i2 = (i * 2730) >> 27;
        int i3 = i2 - ((CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA - (i - (CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA * i2))) >> 31);
        return abs((((i3 >> 1) + (i3 & 1)) * 98312) - i);
    }

    static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        for (int i = 0; i < 256; i++) {
            int i2 = ((bArr3[i >>> 3] >>> (i & 7)) & 1) << 2;
            int i3 = i + 256;
            int i4 = i + 512;
            int i5 = i + 768;
            int f = (24577 - (((m6290f(iArr, 0, 4, (sArr2[i] << 3) + i2) + m6290f(iArr, 1, 5, (sArr2[i3] << 3) + i2)) + m6290f(iArr, 2, 6, (sArr2[i4] << 3) + i2)) + m6290f(iArr, 3, 7, (sArr2[i5] << 3) + i2))) >> 31;
            int i6 = ~f;
            iArr2[0] = (iArr[0] & i6) ^ (f & iArr[4]);
            iArr2[1] = (iArr[1] & i6) ^ (f & iArr[5]);
            iArr2[2] = (iArr[2] & i6) ^ (f & iArr[6]);
            iArr2[3] = (iArr[7] & f) ^ (i6 & iArr[3]);
            sArr[i] = (short) ((iArr2[0] - iArr2[3]) & 3);
            sArr[i3] = (short) ((iArr2[1] - iArr2[3]) & 3);
            sArr[i4] = (short) ((iArr2[2] - iArr2[3]) & 3);
            sArr[i5] = (short) (((-f) + (iArr2[3] << 1)) & 3);
        }
    }

    static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        int[] iArr = new int[4];
        for (int i = 0; i < 256; i++) {
            int i2 = i + 768;
            iArr[0] = ((sArr[i] << 3) + 196624) - (((sArr2[i] << 1) + sArr2[i2]) * 12289);
            int i3 = i + 256;
            iArr[1] = ((sArr[i3] << 3) + 196624) - (((sArr2[i3] << 1) + sArr2[i2]) * 12289);
            int i4 = i + 512;
            iArr[2] = ((sArr[i4] << 3) + 196624) - (((sArr2[i4] << 1) + sArr2[i2]) * 12289);
            iArr[3] = ((sArr[i2] << 3) + 196624) - (sArr2[i2] * 12289);
            int i5 = i >>> 3;
            bArr[i5] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << (i & 7)) | bArr[i5]);
        }
    }
}
