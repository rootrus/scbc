package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;

    /* renamed from: Y1 */
    private static final int f5750Y1 = 1518500249;

    /* renamed from: Y2 */
    private static final int f5751Y2 = 1859775393;

    /* renamed from: Y3 */
    private static final int f5752Y3 = -1894007588;

    /* renamed from: Y4 */
    private static final int f5753Y4 = -899497514;

    /* renamed from: H1 */
    private int f5754H1;

    /* renamed from: H2 */
    private int f5755H2;

    /* renamed from: H3 */
    private int f5756H3;

    /* renamed from: H4 */
    private int f5757H4;

    /* renamed from: H5 */
    private int f5758H5;

    /* renamed from: X */
    private int[] f5759X = new int[80];
    private int xOff;

    public SHA1Digest() {
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f5754H1 = Pack.bigEndianToInt(bArr, 16);
        this.f5755H2 = Pack.bigEndianToInt(bArr, 20);
        this.f5756H3 = Pack.bigEndianToInt(bArr, 24);
        this.f5757H4 = Pack.bigEndianToInt(bArr, 28);
        this.f5758H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.f5759X[i] = Pack.bigEndianToInt(bArr, (i << 2) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.f5754H1 = sHA1Digest.f5754H1;
        this.f5755H2 = sHA1Digest.f5755H2;
        this.f5756H3 = sHA1Digest.f5756H3;
        this.f5757H4 = sHA1Digest.f5757H4;
        this.f5758H5 = sHA1Digest.f5758H5;
        int[] iArr = sHA1Digest.f5759X;
        System.arraycopy(iArr, 0, this.f5759X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    /* renamed from: f */
    private int m6232f(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    /* renamed from: g */
    private int m6233g(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    /* renamed from: h */
    private int m6234h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public Memoable copy() {
        return new SHA1Digest(this);
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f5754H1, bArr, i);
        Pack.intToBigEndian(this.f5755H2, bArr, i + 4);
        Pack.intToBigEndian(this.f5756H3, bArr, i + 8);
        Pack.intToBigEndian(this.f5757H4, bArr, i + 12);
        Pack.intToBigEndian(this.f5758H5, bArr, i + 16);
        reset();
        return 20;
    }

    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    public int getDigestSize() {
        return 20;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[((this.xOff << 2) + 40)];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f5754H1, bArr, 16);
        Pack.intToBigEndian(this.f5755H2, bArr, 20);
        Pack.intToBigEndian(this.f5756H3, bArr, 24);
        Pack.intToBigEndian(this.f5757H4, bArr, 28);
        Pack.intToBigEndian(this.f5758H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.f5759X[i], bArr, (i << 2) + 40);
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f5759X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 << 1) | (i2 >>> 31);
        }
        int i3 = this.f5754H1;
        int i4 = this.f5755H2;
        int i5 = this.f5756H3;
        int i6 = this.f5757H4;
        int i7 = this.f5758H5;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int i10 = i9 + 1;
            int f = i7 + ((i3 << 5) | (i3 >>> 27)) + m6232f(i4, i5, i6) + this.f5759X[i9] + f5750Y1;
            int i11 = (i4 << 30) | (i4 >>> 2);
            int i12 = i10 + 1;
            int f2 = i6 + ((f << 5) | (f >>> 27)) + m6232f(i3, i11, i5) + this.f5759X[i10] + f5750Y1;
            int i13 = (i3 << 30) | (i3 >>> 2);
            int i14 = i12 + 1;
            int f3 = i5 + ((f2 << 5) | (f2 >>> 27)) + m6232f(f, i13, i11) + this.f5759X[i12] + f5750Y1;
            i7 = (f << 30) | (f >>> 2);
            int i15 = i14 + 1;
            i4 = i11 + ((f3 << 5) | (f3 >>> 27)) + m6232f(f2, i7, i13) + this.f5759X[i14] + f5750Y1;
            i6 = (f2 << 30) | (f2 >>> 2);
            i3 = i13 + ((i4 << 5) | (i4 >>> 27)) + m6232f(f3, i6, i7) + this.f5759X[i15] + f5750Y1;
            i5 = (f3 << 30) | (f3 >>> 2);
            i8++;
            i9 = i15 + 1;
        }
        int i16 = 0;
        while (i16 < 4) {
            int i17 = i9 + 1;
            int h = i7 + ((i3 << 5) | (i3 >>> 27)) + m6234h(i4, i5, i6) + this.f5759X[i9] + f5751Y2;
            int i18 = (i4 << 30) | (i4 >>> 2);
            int i19 = i17 + 1;
            int h2 = i6 + ((h << 5) | (h >>> 27)) + m6234h(i3, i18, i5) + this.f5759X[i17] + f5751Y2;
            int i20 = (i3 << 30) | (i3 >>> 2);
            int i21 = i19 + 1;
            int h3 = i5 + ((h2 << 5) | (h2 >>> 27)) + m6234h(h, i20, i18) + this.f5759X[i19] + f5751Y2;
            i7 = (h << 30) | (h >>> 2);
            int i22 = i21 + 1;
            i4 = i18 + ((h3 << 5) | (h3 >>> 27)) + m6234h(h2, i7, i20) + this.f5759X[i21] + f5751Y2;
            i6 = (h2 << 30) | (h2 >>> 2);
            i3 = i20 + ((i4 << 5) | (i4 >>> 27)) + m6234h(h3, i6, i7) + this.f5759X[i22] + f5751Y2;
            i5 = (h3 << 30) | (h3 >>> 2);
            i16++;
            i9 = i22 + 1;
        }
        int i23 = 0;
        while (i23 < 4) {
            int i24 = i9 + 1;
            int g = i7 + (((((i3 << 5) | (i3 >>> 27)) + m6233g(i4, i5, i6)) + this.f5759X[i9]) - 1894007588);
            int i25 = (i4 << 30) | (i4 >>> 2);
            int i26 = i24 + 1;
            int g2 = i6 + (((((g << 5) | (g >>> 27)) + m6233g(i3, i25, i5)) + this.f5759X[i24]) - 1894007588);
            int i27 = (i3 << 30) | (i3 >>> 2);
            int i28 = i26 + 1;
            int g3 = i5 + (((((g2 << 5) | (g2 >>> 27)) + m6233g(g, i27, i25)) + this.f5759X[i26]) - 1894007588);
            i7 = (g << 30) | (g >>> 2);
            int i29 = i28 + 1;
            i4 = i25 + (((((g3 << 5) | (g3 >>> 27)) + m6233g(g2, i7, i27)) + this.f5759X[i28]) - 1894007588);
            i6 = (g2 << 30) | (g2 >>> 2);
            i3 = i27 + (((((i4 << 5) | (i4 >>> 27)) + m6233g(g3, i6, i7)) + this.f5759X[i29]) - 1894007588);
            i5 = (g3 << 30) | (g3 >>> 2);
            i23++;
            i9 = i29 + 1;
        }
        int i30 = 60;
        int i31 = 0;
        while (i31 <= 3) {
            int i32 = i30 + 1;
            int h4 = i7 + (((((i3 << 5) | (i3 >>> 27)) + m6234h(i4, i5, i6)) + this.f5759X[i30]) - 899497514);
            int i33 = (i4 << 30) | (i4 >>> 2);
            int i34 = i32 + 1;
            int h5 = i6 + (((((h4 << 5) | (h4 >>> 27)) + m6234h(i3, i33, i5)) + this.f5759X[i32]) - 899497514);
            int i35 = (i3 << 30) | (i3 >>> 2);
            int i36 = i34 + 1;
            int h6 = i5 + (((((h5 << 5) | (h5 >>> 27)) + m6234h(h4, i35, i33)) + this.f5759X[i34]) - 899497514);
            i7 = (h4 << 30) | (h4 >>> 2);
            int i37 = i36 + 1;
            i4 = i33 + (((((h6 << 5) | (h6 >>> 27)) + m6234h(h5, i7, i35)) + this.f5759X[i36]) - 899497514);
            i6 = (h5 << 30) | (h5 >>> 2);
            i3 = i35 + (((((i4 << 5) | (i4 >>> 27)) + m6234h(h6, i6, i7)) + this.f5759X[i37]) - 899497514);
            i5 = (h6 << 30) | (h6 >>> 2);
            i31++;
            i30 = i37 + 1;
        }
        this.f5754H1 += i3;
        this.f5755H2 += i4;
        this.f5756H3 += i5;
        this.f5757H4 += i6;
        this.f5758H5 += i7;
        this.xOff = 0;
        for (int i38 = 0; i38 < 16; i38++) {
            this.f5759X[i38] = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f5759X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    /* access modifiers changed from: protected */
    public void processWord(byte[] bArr, int i) {
        byte b = bArr[i];
        int i2 = i + 1;
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        byte b3 = bArr[i3];
        byte b4 = bArr[i3 + 1];
        int[] iArr = this.f5759X;
        int i4 = this.xOff;
        iArr[i4] = (b4 & 255) | (b << Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i5 = i4 + 1;
        this.xOff = i5;
        if (i5 == 16) {
            processBlock();
        }
    }

    public void reset() {
        super.reset();
        this.f5754H1 = 1732584193;
        this.f5755H2 = -271733879;
        this.f5756H3 = -1732584194;
        this.f5757H4 = 271733878;
        this.f5758H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f5759X;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn(sHA1Digest);
        copyIn(sHA1Digest);
    }
}
