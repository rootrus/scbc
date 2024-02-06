package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: T */
    private static final int[] f5780T = new int[64];

    /* renamed from: V */
    private int[] f5781V = new int[8];

    /* renamed from: W */
    private int[] f5782W = new int[68];

    /* renamed from: W1 */
    private int[] f5783W1 = new int[64];
    private int[] inwords = new int[16];
    private int xOff;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            f5780T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            f5780T[i] = (2055708042 << i3) | (2055708042 >>> (32 - i3));
        }
    }

    public SM3Digest() {
        reset();
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    /* renamed from: P0 */
    private int m6237P0(int i) {
        return ((i >>> 15) | (i << 17)) ^ (((i << 9) | (i >>> 23)) ^ i);
    }

    /* renamed from: P1 */
    private int m6238P1(int i) {
        return ((i >>> 9) | (i << 23)) ^ (((i << 15) | (i >>> 17)) ^ i);
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.f5781V;
        int[] iArr2 = this.f5781V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    public Memoable copy() {
        return new SM3Digest(this);
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f5781V[0], bArr, i);
        Pack.intToBigEndian(this.f5781V[1], bArr, i + 4);
        Pack.intToBigEndian(this.f5781V[2], bArr, i + 8);
        Pack.intToBigEndian(this.f5781V[3], bArr, i + 12);
        Pack.intToBigEndian(this.f5781V[4], bArr, i + 16);
        Pack.intToBigEndian(this.f5781V[5], bArr, i + 20);
        Pack.intToBigEndian(this.f5781V[6], bArr, i + 24);
        Pack.intToBigEndian(this.f5781V[7], bArr, i + 28);
        reset();
        return 32;
    }

    public String getAlgorithmName() {
        return "SM3";
    }

    public int getDigestSize() {
        return 32;
    }

    /* access modifiers changed from: protected */
    public void processBlock() {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = 16;
            if (i3 >= 16) {
                break;
            }
            this.f5782W[i3] = this.inwords[i3];
            i3++;
        }
        for (int i4 = 16; i4 < 68; i4++) {
            int[] iArr = this.f5782W;
            int i5 = iArr[i4 - 3];
            int i6 = iArr[i4 - 13];
            iArr[i4] = (((i6 << 7) | (i6 >>> 25)) ^ m6238P1(((i5 << 15) | (i5 >>> 17)) ^ (iArr[i4 - 16] ^ iArr[i4 - 9]))) ^ this.f5782W[i4 - 6];
        }
        int i7 = 0;
        while (true) {
            i2 = 64;
            if (i7 >= 64) {
                break;
            }
            int[] iArr2 = this.f5783W1;
            int[] iArr3 = this.f5782W;
            iArr2[i7] = iArr3[i7 + 4] ^ iArr3[i7];
            i7++;
        }
        int[] iArr4 = this.f5781V;
        int i8 = iArr4[0];
        int i9 = iArr4[1];
        int i10 = iArr4[2];
        int i11 = iArr4[3];
        int i12 = iArr4[4];
        int i13 = iArr4[5];
        int i14 = iArr4[6];
        int i15 = iArr4[7];
        int i16 = 0;
        int i17 = i13;
        int i18 = i14;
        while (i16 < i) {
            int i19 = (i8 << 12) | (i8 >>> 20);
            int i20 = i19 + i12 + f5780T[i16];
            int i21 = (i20 << 7) | (i20 >>> 25);
            int FF0 = FF0(i8, i9, i10);
            int i22 = this.f5783W1[i16];
            i16++;
            i11 = i10;
            i10 = (i9 >>> 23) | (i9 << 9);
            i9 = i8;
            i8 = FF0 + i11 + (i21 ^ i19) + i22;
            i = 16;
            int i23 = i12;
            i12 = m6237P0(GG0(i12, i17, i18) + i15 + i21 + this.f5782W[i16]);
            i15 = i18;
            i18 = (i17 << 19) | (i17 >>> 13);
            i17 = i23;
        }
        int i24 = i15;
        int i25 = i11;
        int i26 = i18;
        int i27 = i10;
        int i28 = i9;
        int i29 = i8;
        int i30 = i17;
        int i31 = 16;
        while (i31 < i2) {
            int i32 = (i29 << 12) | (i29 >>> 20);
            int i33 = i32 + i12 + f5780T[i31];
            int i34 = (i33 << 7) | (i33 >>> 25);
            int FF1 = FF1(i29, i28, i27);
            int i35 = this.f5783W1[i31];
            i31++;
            i25 = i27;
            i27 = (i28 << 9) | (i28 >>> 23);
            i28 = i29;
            i29 = FF1 + i25 + (i34 ^ i32) + i35;
            i2 = 64;
            int P0 = m6237P0(GG1(i12, i30, i26) + i24 + i34 + this.f5782W[i31]);
            i24 = i26;
            i26 = (i30 << 19) | (i30 >>> 13);
            i30 = i12;
            i12 = P0;
        }
        int[] iArr5 = this.f5781V;
        iArr5[0] = iArr5[0] ^ i29;
        iArr5[1] = iArr5[1] ^ i28;
        iArr5[2] = iArr5[2] ^ i27;
        iArr5[3] = iArr5[3] ^ i25;
        iArr5[4] = iArr5[4] ^ i12;
        iArr5[5] = i30 ^ iArr5[5];
        iArr5[6] = i26 ^ iArr5[6];
        iArr5[7] = i24 ^ iArr5[7];
        this.xOff = 0;
    }

    /* access modifiers changed from: protected */
    public void processLength(long j) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.xOff;
            if (i2 < 14) {
                this.inwords[i2] = 0;
                this.xOff = i2 + 1;
            } else {
                int[] iArr = this.inwords;
                int i3 = i2 + 1;
                this.xOff = i3;
                iArr[i2] = (int) (j >>> 32);
                this.xOff = i3 + 1;
                iArr[i3] = (int) j;
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void processWord(byte[] bArr, int i) {
        byte b = bArr[i];
        int i2 = i + 1;
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        byte b3 = bArr[i3];
        byte b4 = bArr[i3 + 1];
        int[] iArr = this.inwords;
        int i4 = this.xOff;
        iArr[i4] = (b4 & 255) | ((b & 255) << Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i5 = i4 + 1;
        this.xOff = i5;
        if (i5 >= 16) {
            processBlock();
        }
    }

    public void reset() {
        super.reset();
        int[] iArr = this.f5781V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn(sM3Digest);
        copyIn(sM3Digest);
    }
}
