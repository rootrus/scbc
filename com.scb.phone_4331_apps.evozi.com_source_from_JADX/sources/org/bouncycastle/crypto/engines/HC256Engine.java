package org.bouncycastle.crypto.engines;

import com.google.android.gms.location.places.Place;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class HC256Engine implements StreamCipher {
    private byte[] buf = new byte[4];
    private int cnt = 0;
    private int idx = 0;
    private boolean initialised;

    /* renamed from: iv */
    private byte[] f5888iv;
    private byte[] key;

    /* renamed from: p */
    private int[] f5889p = new int[1024];

    /* renamed from: q */
    private int[] f5890q = new int[1024];

    private byte getByte() {
        if (this.idx == 0) {
            int step = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) step;
            int i = step >> 8;
            bArr[1] = (byte) i;
            int i2 = i >> 8;
            bArr[2] = (byte) i2;
            bArr[3] = (byte) (i2 >> 8);
        }
        byte[] bArr2 = this.buf;
        int i3 = this.idx;
        byte b = bArr2[i3];
        this.idx = (i3 + 1) & 3;
        return b;
    }

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        } else if (this.f5888iv.length >= 16) {
            byte[] bArr2 = this.key;
            if (bArr2.length != 32) {
                byte[] bArr3 = new byte[32];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                byte[] bArr4 = this.key;
                System.arraycopy(bArr4, 0, bArr3, 16, bArr4.length);
                this.key = bArr3;
            }
            byte[] bArr5 = this.f5888iv;
            if (bArr5.length < 32) {
                byte[] bArr6 = new byte[32];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                byte[] bArr7 = this.f5888iv;
                System.arraycopy(bArr7, 0, bArr6, bArr7.length, 32 - bArr7.length);
                this.f5888iv = bArr6;
            }
            this.idx = 0;
            this.cnt = 0;
            int[] iArr = new int[2560];
            for (int i = 0; i < 32; i++) {
                int i2 = i >> 2;
                iArr[i2] = iArr[i2] | ((this.key[i] & 255) << ((i & 3) << 3));
            }
            for (int i3 = 0; i3 < 32; i3++) {
                int i4 = (i3 >> 2) + 8;
                iArr[i4] = iArr[i4] | ((this.f5888iv[i3] & 255) << ((i3 & 3) << 3));
            }
            for (int i5 = 16; i5 < 2560; i5++) {
                int i6 = iArr[i5 - 2];
                int i7 = iArr[i5 - 15];
                iArr[i5] = ((rotateRight(i6, 19) ^ rotateRight(i6, 17)) ^ (i6 >>> 10)) + iArr[i5 - 7] + ((rotateRight(i7, 18) ^ rotateRight(i7, 7)) ^ (i7 >>> 3)) + iArr[i5 - 16] + i5;
            }
            System.arraycopy(iArr, 512, this.f5889p, 0, 1024);
            System.arraycopy(iArr, 1536, this.f5890q, 0, 1024);
            for (int i8 = 0; i8 < 4096; i8++) {
                step();
            }
            this.cnt = 0;
        } else {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
    }

    private static int rotateRight(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private int step() {
        int i;
        int i2;
        int i3 = this.cnt;
        int i4 = i3 & Place.TYPE_SUBLOCALITY_LEVEL_1;
        if (i3 < 1024) {
            int[] iArr = this.f5889p;
            int i5 = iArr[(i4 - 3) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int i6 = iArr[(i4 - 1023) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int i7 = iArr[i4];
            int i8 = iArr[(i4 - 10) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int rotateRight = rotateRight(i5, 10);
            int rotateRight2 = rotateRight(i6, 23);
            int[] iArr2 = this.f5890q;
            iArr[i4] = i7 + i8 + (rotateRight2 ^ rotateRight) + iArr2[(i5 ^ i6) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int[] iArr3 = this.f5889p;
            int i9 = iArr3[(i4 - 12) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            i = iArr2[i9 & 255] + iArr2[((i9 >> 8) & 255) + 256] + iArr2[((i9 >> 16) & 255) + 512] + iArr2[(i9 >>> 24) + 768];
            i2 = iArr3[i4];
        } else {
            int[] iArr4 = this.f5890q;
            int i10 = iArr4[(i4 - 3) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int i11 = iArr4[(i4 - 1023) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int i12 = iArr4[i4];
            int i13 = iArr4[(i4 - 10) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int rotateRight3 = rotateRight(i10, 10);
            int rotateRight4 = rotateRight(i11, 23);
            int[] iArr5 = this.f5889p;
            iArr4[i4] = i12 + i13 + (rotateRight4 ^ rotateRight3) + iArr5[(i10 ^ i11) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            int[] iArr6 = this.f5890q;
            int i14 = iArr6[(i4 - 12) & Place.TYPE_SUBLOCALITY_LEVEL_1];
            i = iArr5[i14 & 255] + iArr5[((i14 >> 8) & 255) + 256] + iArr5[((i14 >> 16) & 255) + 512] + iArr5[(i14 >>> 24) + 768];
            i2 = iArr6[i4];
        }
        this.cnt = (this.cnt + 1) & 2047;
        return i2 ^ i;
    }

    public String getAlgorithmName() {
        return "HC-256";
    }

    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters cipherParameters2;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f5888iv = parametersWithIV.getIV();
            cipherParameters2 = parametersWithIV.getParameters();
        } else {
            this.f5888iv = new byte[0];
            cipherParameters2 = cipherParameters;
        }
        if (cipherParameters2 instanceof KeyParameter) {
            this.key = ((KeyParameter) cipherParameters2).getKey();
            init();
            this.initialised = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid parameter passed to HC256 init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.initialised) {
            StringBuilder sb = new StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new IllegalStateException(sb.toString());
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getByte());
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
        init();
    }

    public byte returnByte(byte b) {
        return (byte) (b ^ getByte());
    }
}
