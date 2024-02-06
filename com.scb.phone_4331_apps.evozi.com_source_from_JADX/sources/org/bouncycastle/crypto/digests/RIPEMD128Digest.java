package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.bouncycastle.util.Memoable;

public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: H0 */
    private int f5719H0;

    /* renamed from: H1 */
    private int f5720H1;

    /* renamed from: H2 */
    private int f5721H2;

    /* renamed from: H3 */
    private int f5722H3;

    /* renamed from: X */
    private int[] f5723X = new int[16];
    private int xOff;

    public RIPEMD128Digest() {
        reset();
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super((GeneralDigest) rIPEMD128Digest);
        copyIn(rIPEMD128Digest);
    }

    /* renamed from: F1 */
    private int m6202F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(i + m6207f1(i2, i3, i4) + i5, i6);
    }

    /* renamed from: F2 */
    private int m6203F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(i + m6208f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* renamed from: F3 */
    private int m6204F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(i + m6209f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* renamed from: F4 */
    private int m6205F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(((i + m6210f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(i + m6207f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(i + m6208f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(i + m6209f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m6206RL(i + m6210f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* renamed from: RL */
    private int m6206RL(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn(rIPEMD128Digest);
        this.f5719H0 = rIPEMD128Digest.f5719H0;
        this.f5720H1 = rIPEMD128Digest.f5720H1;
        this.f5721H2 = rIPEMD128Digest.f5721H2;
        this.f5722H3 = rIPEMD128Digest.f5722H3;
        int[] iArr = rIPEMD128Digest.f5723X;
        System.arraycopy(iArr, 0, this.f5723X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    /* renamed from: f1 */
    private int m6207f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m6208f2(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    /* renamed from: f3 */
    private int m6209f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m6210f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f5719H0, bArr, i);
        unpackWord(this.f5720H1, bArr, i + 4);
        unpackWord(this.f5721H2, bArr, i + 8);
        unpackWord(this.f5722H3, bArr, i + 12);
        reset();
        return 16;
    }

    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    public int getDigestSize() {
        return 16;
    }

    /* access modifiers changed from: protected */
    public void processBlock() {
        int i = this.f5719H0;
        int i2 = this.f5720H1;
        int i3 = this.f5721H2;
        int i4 = this.f5722H3;
        int F1 = m6202F1(i, i2, i3, i4, this.f5723X[0], 11);
        int F12 = m6202F1(i4, F1, i2, i3, this.f5723X[1], 14);
        int F13 = m6202F1(i3, F12, F1, i2, this.f5723X[2], 15);
        int F14 = m6202F1(i2, F13, F12, F1, this.f5723X[3], 12);
        int F15 = m6202F1(F1, F14, F13, F12, this.f5723X[4], 5);
        int F16 = m6202F1(F12, F15, F14, F13, this.f5723X[5], 8);
        int F17 = m6202F1(F13, F16, F15, F14, this.f5723X[6], 7);
        int F18 = m6202F1(F14, F17, F16, F15, this.f5723X[7], 9);
        int F19 = m6202F1(F15, F18, F17, F16, this.f5723X[8], 11);
        int F110 = m6202F1(F16, F19, F18, F17, this.f5723X[9], 13);
        int F111 = m6202F1(F17, F110, F19, F18, this.f5723X[10], 14);
        int F112 = m6202F1(F18, F111, F110, F19, this.f5723X[11], 15);
        int F113 = m6202F1(F19, F112, F111, F110, this.f5723X[12], 6);
        int F114 = m6202F1(F110, F113, F112, F111, this.f5723X[13], 7);
        int F115 = m6202F1(F111, F114, F113, F112, this.f5723X[14], 9);
        int F116 = m6202F1(F112, F115, F114, F113, this.f5723X[15], 8);
        int F2 = m6203F2(F113, F116, F115, F114, this.f5723X[7], 7);
        int F22 = m6203F2(F114, F2, F116, F115, this.f5723X[4], 6);
        int F23 = m6203F2(F115, F22, F2, F116, this.f5723X[13], 8);
        int F24 = m6203F2(F116, F23, F22, F2, this.f5723X[1], 13);
        int F25 = m6203F2(F2, F24, F23, F22, this.f5723X[10], 11);
        int F26 = m6203F2(F22, F25, F24, F23, this.f5723X[6], 9);
        int F27 = m6203F2(F23, F26, F25, F24, this.f5723X[15], 7);
        int F28 = m6203F2(F24, F27, F26, F25, this.f5723X[3], 15);
        int F29 = m6203F2(F25, F28, F27, F26, this.f5723X[12], 7);
        int F210 = m6203F2(F26, F29, F28, F27, this.f5723X[0], 12);
        int F211 = m6203F2(F27, F210, F29, F28, this.f5723X[9], 15);
        int F212 = m6203F2(F28, F211, F210, F29, this.f5723X[5], 9);
        int F213 = m6203F2(F29, F212, F211, F210, this.f5723X[2], 11);
        int F214 = m6203F2(F210, F213, F212, F211, this.f5723X[14], 7);
        int F215 = m6203F2(F211, F214, F213, F212, this.f5723X[11], 13);
        int F216 = m6203F2(F212, F215, F214, F213, this.f5723X[8], 12);
        int F3 = m6204F3(F213, F216, F215, F214, this.f5723X[3], 11);
        int F32 = m6204F3(F214, F3, F216, F215, this.f5723X[10], 13);
        int F33 = m6204F3(F215, F32, F3, F216, this.f5723X[14], 6);
        int F34 = m6204F3(F216, F33, F32, F3, this.f5723X[4], 7);
        int F35 = m6204F3(F3, F34, F33, F32, this.f5723X[9], 14);
        int F36 = m6204F3(F32, F35, F34, F33, this.f5723X[15], 9);
        int F37 = m6204F3(F33, F36, F35, F34, this.f5723X[8], 13);
        int F38 = m6204F3(F34, F37, F36, F35, this.f5723X[1], 15);
        int F39 = m6204F3(F35, F38, F37, F36, this.f5723X[2], 14);
        int F310 = m6204F3(F36, F39, F38, F37, this.f5723X[7], 8);
        int F311 = m6204F3(F37, F310, F39, F38, this.f5723X[0], 13);
        int F312 = m6204F3(F38, F311, F310, F39, this.f5723X[6], 6);
        int F313 = m6204F3(F39, F312, F311, F310, this.f5723X[13], 5);
        int F314 = m6204F3(F310, F313, F312, F311, this.f5723X[11], 12);
        int F315 = m6204F3(F311, F314, F313, F312, this.f5723X[5], 7);
        int F316 = m6204F3(F312, F315, F314, F313, this.f5723X[12], 5);
        int F4 = m6205F4(F313, F316, F315, F314, this.f5723X[1], 11);
        int F42 = m6205F4(F314, F4, F316, F315, this.f5723X[9], 12);
        int F43 = m6205F4(F315, F42, F4, F316, this.f5723X[11], 14);
        int F44 = m6205F4(F316, F43, F42, F4, this.f5723X[10], 15);
        int F45 = m6205F4(F4, F44, F43, F42, this.f5723X[0], 14);
        int F46 = m6205F4(F42, F45, F44, F43, this.f5723X[8], 15);
        int F47 = m6205F4(F43, F46, F45, F44, this.f5723X[12], 9);
        int F48 = m6205F4(F44, F47, F46, F45, this.f5723X[4], 8);
        int F49 = m6205F4(F45, F48, F47, F46, this.f5723X[13], 9);
        int F410 = m6205F4(F46, F49, F48, F47, this.f5723X[3], 14);
        int F411 = m6205F4(F47, F410, F49, F48, this.f5723X[7], 5);
        int F412 = m6205F4(F48, F411, F410, F49, this.f5723X[15], 6);
        int F413 = m6205F4(F49, F412, F411, F410, this.f5723X[14], 8);
        int F414 = m6205F4(F410, F413, F412, F411, this.f5723X[5], 6);
        int F415 = m6205F4(F411, F414, F413, F412, this.f5723X[6], 5);
        int F416 = m6205F4(F412, F415, F414, F413, this.f5723X[2], 12);
        int FF4 = FF4(i, i2, i3, i4, this.f5723X[5], 8);
        int FF42 = FF4(i4, FF4, i2, i3, this.f5723X[14], 9);
        int FF43 = FF4(i3, FF42, FF4, i2, this.f5723X[7], 9);
        int FF44 = FF4(i2, FF43, FF42, FF4, this.f5723X[0], 11);
        int FF45 = FF4(FF4, FF44, FF43, FF42, this.f5723X[9], 13);
        int FF46 = FF4(FF42, FF45, FF44, FF43, this.f5723X[2], 15);
        int FF47 = FF4(FF43, FF46, FF45, FF44, this.f5723X[11], 15);
        int FF48 = FF4(FF44, FF47, FF46, FF45, this.f5723X[4], 5);
        int FF49 = FF4(FF45, FF48, FF47, FF46, this.f5723X[13], 7);
        int FF410 = FF4(FF46, FF49, FF48, FF47, this.f5723X[6], 7);
        int FF411 = FF4(FF47, FF410, FF49, FF48, this.f5723X[15], 8);
        int FF412 = FF4(FF48, FF411, FF410, FF49, this.f5723X[8], 11);
        int FF413 = FF4(FF49, FF412, FF411, FF410, this.f5723X[1], 14);
        int FF414 = FF4(FF410, FF413, FF412, FF411, this.f5723X[10], 14);
        int FF415 = FF4(FF411, FF414, FF413, FF412, this.f5723X[3], 12);
        int FF416 = FF4(FF412, FF415, FF414, FF413, this.f5723X[12], 6);
        int FF3 = FF3(FF413, FF416, FF415, FF414, this.f5723X[6], 9);
        int FF32 = FF3(FF414, FF3, FF416, FF415, this.f5723X[11], 13);
        int FF33 = FF3(FF415, FF32, FF3, FF416, this.f5723X[3], 15);
        int FF34 = FF3(FF416, FF33, FF32, FF3, this.f5723X[7], 7);
        int FF35 = FF3(FF3, FF34, FF33, FF32, this.f5723X[0], 12);
        int FF36 = FF3(FF32, FF35, FF34, FF33, this.f5723X[13], 8);
        int FF37 = FF3(FF33, FF36, FF35, FF34, this.f5723X[5], 9);
        int FF38 = FF3(FF34, FF37, FF36, FF35, this.f5723X[10], 11);
        int FF39 = FF3(FF35, FF38, FF37, FF36, this.f5723X[14], 7);
        int FF310 = FF3(FF36, FF39, FF38, FF37, this.f5723X[15], 7);
        int FF311 = FF3(FF37, FF310, FF39, FF38, this.f5723X[8], 12);
        int FF312 = FF3(FF38, FF311, FF310, FF39, this.f5723X[12], 7);
        int FF313 = FF3(FF39, FF312, FF311, FF310, this.f5723X[4], 6);
        int FF314 = FF3(FF310, FF313, FF312, FF311, this.f5723X[9], 15);
        int FF315 = FF3(FF311, FF314, FF313, FF312, this.f5723X[1], 13);
        int FF316 = FF3(FF312, FF315, FF314, FF313, this.f5723X[2], 11);
        int FF2 = FF2(FF313, FF316, FF315, FF314, this.f5723X[15], 9);
        int FF22 = FF2(FF314, FF2, FF316, FF315, this.f5723X[5], 7);
        int FF23 = FF2(FF315, FF22, FF2, FF316, this.f5723X[1], 15);
        int FF24 = FF2(FF316, FF23, FF22, FF2, this.f5723X[3], 11);
        int FF25 = FF2(FF2, FF24, FF23, FF22, this.f5723X[7], 8);
        int FF26 = FF2(FF22, FF25, FF24, FF23, this.f5723X[14], 6);
        int FF27 = FF2(FF23, FF26, FF25, FF24, this.f5723X[6], 6);
        int FF28 = FF2(FF24, FF27, FF26, FF25, this.f5723X[9], 14);
        int FF29 = FF2(FF25, FF28, FF27, FF26, this.f5723X[11], 12);
        int FF210 = FF2(FF26, FF29, FF28, FF27, this.f5723X[8], 13);
        int FF211 = FF2(FF27, FF210, FF29, FF28, this.f5723X[12], 5);
        int FF212 = FF2(FF28, FF211, FF210, FF29, this.f5723X[2], 14);
        int FF213 = FF2(FF29, FF212, FF211, FF210, this.f5723X[10], 13);
        int FF214 = FF2(FF210, FF213, FF212, FF211, this.f5723X[0], 13);
        int FF215 = FF2(FF211, FF214, FF213, FF212, this.f5723X[4], 7);
        int FF216 = FF2(FF212, FF215, FF214, FF213, this.f5723X[13], 5);
        int FF1 = FF1(FF213, FF216, FF215, FF214, this.f5723X[8], 15);
        int FF12 = FF1(FF214, FF1, FF216, FF215, this.f5723X[6], 5);
        int FF13 = FF1(FF215, FF12, FF1, FF216, this.f5723X[4], 8);
        int FF14 = FF1(FF216, FF13, FF12, FF1, this.f5723X[1], 11);
        int FF15 = FF1(FF1, FF14, FF13, FF12, this.f5723X[3], 14);
        int FF16 = FF1(FF12, FF15, FF14, FF13, this.f5723X[11], 14);
        int FF17 = FF1(FF13, FF16, FF15, FF14, this.f5723X[15], 6);
        int FF18 = FF1(FF14, FF17, FF16, FF15, this.f5723X[0], 14);
        int FF19 = FF1(FF15, FF18, FF17, FF16, this.f5723X[5], 6);
        int FF110 = FF1(FF16, FF19, FF18, FF17, this.f5723X[12], 9);
        int FF111 = FF1(FF17, FF110, FF19, FF18, this.f5723X[2], 12);
        int FF112 = FF1(FF18, FF111, FF110, FF19, this.f5723X[13], 9);
        int FF113 = FF1(FF19, FF112, FF111, FF110, this.f5723X[9], 12);
        int FF114 = FF1(FF110, FF113, FF112, FF111, this.f5723X[7], 5);
        int FF115 = FF1(FF111, FF114, FF113, FF112, this.f5723X[10], 15);
        int FF116 = FF1(FF112, FF115, FF114, FF113, this.f5723X[14], 8);
        int i5 = this.f5720H1;
        this.f5720H1 = this.f5721H2 + F414 + FF113;
        this.f5721H2 = this.f5722H3 + F413 + FF116;
        this.f5722H3 = this.f5719H0 + F416 + FF115;
        this.f5719H0 = FF114 + F415 + i5;
        this.xOff = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f5723X;
            if (i6 != iArr.length) {
                iArr[i6] = 0;
                i6++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f5723X;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    /* access modifiers changed from: protected */
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f5723X;
        int i2 = this.xOff;
        int i3 = i2 + 1;
        this.xOff = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    public void reset() {
        super.reset();
        this.f5719H0 = 1732584193;
        this.f5720H1 = -271733879;
        this.f5721H2 = -1732584194;
        this.f5722H3 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f5723X;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }
}
