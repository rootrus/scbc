package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.bouncycastle.util.Memoable;

public class RIPEMD320Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 40;

    /* renamed from: H0 */
    private int f5739H0;

    /* renamed from: H1 */
    private int f5740H1;

    /* renamed from: H2 */
    private int f5741H2;

    /* renamed from: H3 */
    private int f5742H3;

    /* renamed from: H4 */
    private int f5743H4;

    /* renamed from: H5 */
    private int f5744H5;

    /* renamed from: H6 */
    private int f5745H6;

    /* renamed from: H7 */
    private int f5746H7;

    /* renamed from: H8 */
    private int f5747H8;

    /* renamed from: H9 */
    private int f5748H9;

    /* renamed from: X */
    private int[] f5749X = new int[16];
    private int xOff;

    public RIPEMD320Digest() {
        reset();
    }

    public RIPEMD320Digest(RIPEMD320Digest rIPEMD320Digest) {
        super((GeneralDigest) rIPEMD320Digest);
        doCopy(rIPEMD320Digest);
    }

    /* renamed from: RL */
    private int m6226RL(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void doCopy(RIPEMD320Digest rIPEMD320Digest) {
        super.copyIn(rIPEMD320Digest);
        this.f5739H0 = rIPEMD320Digest.f5739H0;
        this.f5740H1 = rIPEMD320Digest.f5740H1;
        this.f5741H2 = rIPEMD320Digest.f5741H2;
        this.f5742H3 = rIPEMD320Digest.f5742H3;
        this.f5743H4 = rIPEMD320Digest.f5743H4;
        this.f5744H5 = rIPEMD320Digest.f5744H5;
        this.f5745H6 = rIPEMD320Digest.f5745H6;
        this.f5746H7 = rIPEMD320Digest.f5746H7;
        this.f5747H8 = rIPEMD320Digest.f5747H8;
        this.f5748H9 = rIPEMD320Digest.f5748H9;
        int[] iArr = rIPEMD320Digest.f5749X;
        System.arraycopy(iArr, 0, this.f5749X, 0, iArr.length);
        this.xOff = rIPEMD320Digest.xOff;
    }

    /* renamed from: f1 */
    private int m6227f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m6228f2(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    /* renamed from: f3 */
    private int m6229f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m6230f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    /* renamed from: f5 */
    private int m6231f5(int i, int i2, int i3) {
        return i ^ (i2 | (~i3));
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public Memoable copy() {
        return new RIPEMD320Digest(this);
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f5739H0, bArr, i);
        unpackWord(this.f5740H1, bArr, i + 4);
        unpackWord(this.f5741H2, bArr, i + 8);
        unpackWord(this.f5742H3, bArr, i + 12);
        unpackWord(this.f5743H4, bArr, i + 16);
        unpackWord(this.f5744H5, bArr, i + 20);
        unpackWord(this.f5745H6, bArr, i + 24);
        unpackWord(this.f5746H7, bArr, i + 28);
        unpackWord(this.f5747H8, bArr, i + 32);
        unpackWord(this.f5748H9, bArr, i + 36);
        reset();
        return 40;
    }

    public String getAlgorithmName() {
        return "RIPEMD320";
    }

    public int getDigestSize() {
        return 40;
    }

    /* access modifiers changed from: protected */
    public void processBlock() {
        int i = this.f5739H0;
        int i2 = this.f5740H1;
        int i3 = this.f5741H2;
        int i4 = this.f5742H3;
        int i5 = this.f5743H4;
        int i6 = this.f5744H5;
        int i7 = this.f5745H6;
        int i8 = this.f5746H7;
        int i9 = this.f5747H8;
        int i10 = this.f5748H9;
        int RL = m6226RL(i + m6227f1(i2, i3, i4) + this.f5749X[0], 11) + i5;
        int RL2 = m6226RL(i3, 10);
        int RL3 = m6226RL(i5 + m6227f1(RL, i2, RL2) + this.f5749X[1], 14) + i4;
        int RL4 = m6226RL(i2, 10);
        int RL5 = m6226RL(i4 + m6227f1(RL3, RL, RL4) + this.f5749X[2], 15) + RL2;
        int RL6 = m6226RL(RL, 10);
        int RL7 = m6226RL(RL2 + m6227f1(RL5, RL3, RL6) + this.f5749X[3], 12) + RL4;
        int RL8 = m6226RL(RL3, 10);
        int RL9 = m6226RL(RL4 + m6227f1(RL7, RL5, RL8) + this.f5749X[4], 5) + RL6;
        int RL10 = m6226RL(RL5, 10);
        int RL11 = m6226RL(RL6 + m6227f1(RL9, RL7, RL10) + this.f5749X[5], 8) + RL8;
        int RL12 = m6226RL(RL7, 10);
        int RL13 = m6226RL(RL8 + m6227f1(RL11, RL9, RL12) + this.f5749X[6], 7) + RL10;
        int RL14 = m6226RL(RL9, 10);
        int RL15 = m6226RL(RL10 + m6227f1(RL13, RL11, RL14) + this.f5749X[7], 9) + RL12;
        int RL16 = m6226RL(RL11, 10);
        int RL17 = m6226RL(RL12 + m6227f1(RL15, RL13, RL16) + this.f5749X[8], 11) + RL14;
        int RL18 = m6226RL(RL13, 10);
        int RL19 = m6226RL(RL14 + m6227f1(RL17, RL15, RL18) + this.f5749X[9], 13) + RL16;
        int RL20 = m6226RL(RL15, 10);
        int RL21 = m6226RL(RL16 + m6227f1(RL19, RL17, RL20) + this.f5749X[10], 14) + RL18;
        int RL22 = m6226RL(RL17, 10);
        int RL23 = m6226RL(RL18 + m6227f1(RL21, RL19, RL22) + this.f5749X[11], 15) + RL20;
        int RL24 = m6226RL(RL19, 10);
        int RL25 = m6226RL(RL20 + m6227f1(RL23, RL21, RL24) + this.f5749X[12], 6) + RL22;
        int RL26 = m6226RL(RL21, 10);
        int RL27 = m6226RL(RL22 + m6227f1(RL25, RL23, RL26) + this.f5749X[13], 7) + RL24;
        int RL28 = m6226RL(RL23, 10);
        int RL29 = m6226RL(RL24 + m6227f1(RL27, RL25, RL28) + this.f5749X[14], 9) + RL26;
        int RL30 = m6226RL(RL25, 10);
        int RL31 = m6226RL(RL26 + m6227f1(RL29, RL27, RL30) + this.f5749X[15], 8) + RL28;
        int RL32 = m6226RL(RL27, 10);
        int RL33 = m6226RL(i6 + m6231f5(i7, i8, i9) + this.f5749X[5] + 1352829926, 8) + i10;
        int RL34 = m6226RL(i8, 10);
        int RL35 = m6226RL(i10 + m6231f5(RL33, i7, RL34) + this.f5749X[14] + 1352829926, 9) + i9;
        int RL36 = m6226RL(i7, 10);
        int RL37 = m6226RL(i9 + m6231f5(RL35, RL33, RL36) + this.f5749X[7] + 1352829926, 9) + RL34;
        int RL38 = m6226RL(RL33, 10);
        int RL39 = m6226RL(RL34 + m6231f5(RL37, RL35, RL38) + this.f5749X[0] + 1352829926, 11) + RL36;
        int RL40 = m6226RL(RL35, 10);
        int RL41 = m6226RL(RL36 + m6231f5(RL39, RL37, RL40) + this.f5749X[9] + 1352829926, 13) + RL38;
        int RL42 = m6226RL(RL37, 10);
        int RL43 = m6226RL(RL38 + m6231f5(RL41, RL39, RL42) + this.f5749X[2] + 1352829926, 15) + RL40;
        int RL44 = m6226RL(RL39, 10);
        int RL45 = m6226RL(RL40 + m6231f5(RL43, RL41, RL44) + this.f5749X[11] + 1352829926, 15) + RL42;
        int RL46 = m6226RL(RL41, 10);
        int RL47 = m6226RL(RL42 + m6231f5(RL45, RL43, RL46) + this.f5749X[4] + 1352829926, 5) + RL44;
        int RL48 = m6226RL(RL43, 10);
        int RL49 = m6226RL(RL44 + m6231f5(RL47, RL45, RL48) + this.f5749X[13] + 1352829926, 7) + RL46;
        int RL50 = m6226RL(RL45, 10);
        int RL51 = m6226RL(RL46 + m6231f5(RL49, RL47, RL50) + this.f5749X[6] + 1352829926, 7) + RL48;
        int RL52 = m6226RL(RL47, 10);
        int RL53 = m6226RL(RL48 + m6231f5(RL51, RL49, RL52) + this.f5749X[15] + 1352829926, 8) + RL50;
        int RL54 = m6226RL(RL49, 10);
        int RL55 = m6226RL(RL50 + m6231f5(RL53, RL51, RL54) + this.f5749X[8] + 1352829926, 11) + RL52;
        int RL56 = m6226RL(RL51, 10);
        int RL57 = m6226RL(RL52 + m6231f5(RL55, RL53, RL56) + this.f5749X[1] + 1352829926, 14) + RL54;
        int RL58 = m6226RL(RL53, 10);
        int RL59 = m6226RL(RL54 + m6231f5(RL57, RL55, RL58) + this.f5749X[10] + 1352829926, 14) + RL56;
        int RL60 = m6226RL(RL55, 10);
        int RL61 = m6226RL(RL56 + m6231f5(RL59, RL57, RL60) + this.f5749X[3] + 1352829926, 12) + RL58;
        int RL62 = m6226RL(RL57, 10);
        int RL63 = m6226RL(RL58 + m6231f5(RL61, RL59, RL62) + this.f5749X[12] + 1352829926, 6) + RL60;
        int RL64 = m6226RL(RL59, 10);
        int RL65 = m6226RL(RL28 + m6228f2(RL63, RL29, RL32) + this.f5749X[7] + 1518500249, 7) + RL30;
        int RL66 = m6226RL(RL29, 10);
        int RL67 = m6226RL(RL30 + m6228f2(RL65, RL63, RL66) + this.f5749X[4] + 1518500249, 6) + RL32;
        int RL68 = m6226RL(RL63, 10);
        int RL69 = m6226RL(RL32 + m6228f2(RL67, RL65, RL68) + this.f5749X[13] + 1518500249, 8) + RL66;
        int RL70 = m6226RL(RL65, 10);
        int RL71 = m6226RL(RL66 + m6228f2(RL69, RL67, RL70) + this.f5749X[1] + 1518500249, 13) + RL68;
        int RL72 = m6226RL(RL67, 10);
        int RL73 = m6226RL(RL68 + m6228f2(RL71, RL69, RL72) + this.f5749X[10] + 1518500249, 11) + RL70;
        int RL74 = m6226RL(RL69, 10);
        int RL75 = m6226RL(RL70 + m6228f2(RL73, RL71, RL74) + this.f5749X[6] + 1518500249, 9) + RL72;
        int RL76 = m6226RL(RL71, 10);
        int RL77 = m6226RL(RL72 + m6228f2(RL75, RL73, RL76) + this.f5749X[15] + 1518500249, 7) + RL74;
        int RL78 = m6226RL(RL73, 10);
        int RL79 = m6226RL(RL74 + m6228f2(RL77, RL75, RL78) + this.f5749X[3] + 1518500249, 15) + RL76;
        int RL80 = m6226RL(RL75, 10);
        int RL81 = m6226RL(RL76 + m6228f2(RL79, RL77, RL80) + this.f5749X[12] + 1518500249, 7) + RL78;
        int RL82 = m6226RL(RL77, 10);
        int RL83 = m6226RL(RL78 + m6228f2(RL81, RL79, RL82) + this.f5749X[0] + 1518500249, 12) + RL80;
        int RL84 = m6226RL(RL79, 10);
        int RL85 = m6226RL(RL80 + m6228f2(RL83, RL81, RL84) + this.f5749X[9] + 1518500249, 15) + RL82;
        int RL86 = m6226RL(RL81, 10);
        int RL87 = m6226RL(RL82 + m6228f2(RL85, RL83, RL86) + this.f5749X[5] + 1518500249, 9) + RL84;
        int RL88 = m6226RL(RL83, 10);
        int RL89 = m6226RL(RL84 + m6228f2(RL87, RL85, RL88) + this.f5749X[2] + 1518500249, 11) + RL86;
        int RL90 = m6226RL(RL85, 10);
        int RL91 = m6226RL(RL86 + m6228f2(RL89, RL87, RL90) + this.f5749X[14] + 1518500249, 7) + RL88;
        int RL92 = m6226RL(RL87, 10);
        int RL93 = m6226RL(RL88 + m6228f2(RL91, RL89, RL92) + this.f5749X[11] + 1518500249, 13) + RL90;
        int RL94 = m6226RL(RL89, 10);
        int RL95 = m6226RL(RL90 + m6228f2(RL93, RL91, RL94) + this.f5749X[8] + 1518500249, 12) + RL92;
        int RL96 = m6226RL(RL91, 10);
        int RL97 = m6226RL(RL60 + m6230f4(RL31, RL61, RL64) + this.f5749X[6] + 1548603684, 9) + RL62;
        int RL98 = m6226RL(RL61, 10);
        int RL99 = m6226RL(RL62 + m6230f4(RL97, RL31, RL98) + this.f5749X[11] + 1548603684, 13) + RL64;
        int RL100 = m6226RL(RL31, 10);
        int RL101 = m6226RL(RL64 + m6230f4(RL99, RL97, RL100) + this.f5749X[3] + 1548603684, 15) + RL98;
        int RL102 = m6226RL(RL97, 10);
        int RL103 = m6226RL(RL98 + m6230f4(RL101, RL99, RL102) + this.f5749X[7] + 1548603684, 7) + RL100;
        int RL104 = m6226RL(RL99, 10);
        int RL105 = m6226RL(RL100 + m6230f4(RL103, RL101, RL104) + this.f5749X[0] + 1548603684, 12) + RL102;
        int RL106 = m6226RL(RL101, 10);
        int RL107 = m6226RL(RL102 + m6230f4(RL105, RL103, RL106) + this.f5749X[13] + 1548603684, 8) + RL104;
        int RL108 = m6226RL(RL103, 10);
        int RL109 = m6226RL(RL104 + m6230f4(RL107, RL105, RL108) + this.f5749X[5] + 1548603684, 9) + RL106;
        int RL110 = m6226RL(RL105, 10);
        int RL111 = m6226RL(RL106 + m6230f4(RL109, RL107, RL110) + this.f5749X[10] + 1548603684, 11) + RL108;
        int RL112 = m6226RL(RL107, 10);
        int RL113 = m6226RL(RL108 + m6230f4(RL111, RL109, RL112) + this.f5749X[14] + 1548603684, 7) + RL110;
        int RL114 = m6226RL(RL109, 10);
        int RL115 = m6226RL(RL110 + m6230f4(RL113, RL111, RL114) + this.f5749X[15] + 1548603684, 7) + RL112;
        int RL116 = m6226RL(RL111, 10);
        int RL117 = m6226RL(RL112 + m6230f4(RL115, RL113, RL116) + this.f5749X[8] + 1548603684, 12) + RL114;
        int RL118 = m6226RL(RL113, 10);
        int RL119 = m6226RL(RL114 + m6230f4(RL117, RL115, RL118) + this.f5749X[12] + 1548603684, 7) + RL116;
        int RL120 = m6226RL(RL115, 10);
        int RL121 = m6226RL(RL116 + m6230f4(RL119, RL117, RL120) + this.f5749X[4] + 1548603684, 6) + RL118;
        int RL122 = m6226RL(RL117, 10);
        int RL123 = m6226RL(RL118 + m6230f4(RL121, RL119, RL122) + this.f5749X[9] + 1548603684, 15) + RL120;
        int RL124 = m6226RL(RL119, 10);
        int RL125 = m6226RL(RL120 + m6230f4(RL123, RL121, RL124) + this.f5749X[1] + 1548603684, 13) + RL122;
        int RL126 = m6226RL(RL121, 10);
        int RL127 = m6226RL(RL122 + m6230f4(RL125, RL123, RL126) + this.f5749X[2] + 1548603684, 11) + RL124;
        int RL128 = m6226RL(RL123, 10);
        int RL129 = m6226RL(RL92 + m6229f3(RL95, RL93, RL128) + this.f5749X[3] + 1859775393, 11) + RL94;
        int RL130 = m6226RL(RL93, 10);
        int RL131 = m6226RL(RL94 + m6229f3(RL129, RL95, RL130) + this.f5749X[10] + 1859775393, 13) + RL128;
        int RL132 = m6226RL(RL95, 10);
        int RL133 = m6226RL(RL128 + m6229f3(RL131, RL129, RL132) + this.f5749X[14] + 1859775393, 6) + RL130;
        int RL134 = m6226RL(RL129, 10);
        int RL135 = m6226RL(RL130 + m6229f3(RL133, RL131, RL134) + this.f5749X[4] + 1859775393, 7) + RL132;
        int RL136 = m6226RL(RL131, 10);
        int RL137 = m6226RL(RL132 + m6229f3(RL135, RL133, RL136) + this.f5749X[9] + 1859775393, 14) + RL134;
        int RL138 = m6226RL(RL133, 10);
        int RL139 = m6226RL(RL134 + m6229f3(RL137, RL135, RL138) + this.f5749X[15] + 1859775393, 9) + RL136;
        int RL140 = m6226RL(RL135, 10);
        int RL141 = m6226RL(RL136 + m6229f3(RL139, RL137, RL140) + this.f5749X[8] + 1859775393, 13) + RL138;
        int RL142 = m6226RL(RL137, 10);
        int RL143 = m6226RL(RL138 + m6229f3(RL141, RL139, RL142) + this.f5749X[1] + 1859775393, 15) + RL140;
        int RL144 = m6226RL(RL139, 10);
        int RL145 = m6226RL(RL140 + m6229f3(RL143, RL141, RL144) + this.f5749X[2] + 1859775393, 14) + RL142;
        int RL146 = m6226RL(RL141, 10);
        int RL147 = m6226RL(RL142 + m6229f3(RL145, RL143, RL146) + this.f5749X[7] + 1859775393, 8) + RL144;
        int RL148 = m6226RL(RL143, 10);
        int RL149 = m6226RL(RL144 + m6229f3(RL147, RL145, RL148) + this.f5749X[0] + 1859775393, 13) + RL146;
        int RL150 = m6226RL(RL145, 10);
        int RL151 = m6226RL(RL146 + m6229f3(RL149, RL147, RL150) + this.f5749X[6] + 1859775393, 6) + RL148;
        int RL152 = m6226RL(RL147, 10);
        int RL153 = m6226RL(RL148 + m6229f3(RL151, RL149, RL152) + this.f5749X[13] + 1859775393, 5) + RL150;
        int RL154 = m6226RL(RL149, 10);
        int RL155 = m6226RL(RL150 + m6229f3(RL153, RL151, RL154) + this.f5749X[11] + 1859775393, 12) + RL152;
        int RL156 = m6226RL(RL151, 10);
        int RL157 = m6226RL(RL152 + m6229f3(RL155, RL153, RL156) + this.f5749X[5] + 1859775393, 7) + RL154;
        int RL158 = m6226RL(RL153, 10);
        int RL159 = m6226RL(RL154 + m6229f3(RL157, RL155, RL158) + this.f5749X[12] + 1859775393, 5) + RL156;
        int RL160 = m6226RL(RL155, 10);
        int RL161 = m6226RL(RL124 + m6229f3(RL127, RL125, RL96) + this.f5749X[15] + 1836072691, 9) + RL126;
        int RL162 = m6226RL(RL125, 10);
        int RL163 = m6226RL(RL126 + m6229f3(RL161, RL127, RL162) + this.f5749X[5] + 1836072691, 7) + RL96;
        int RL164 = m6226RL(RL127, 10);
        int RL165 = m6226RL(RL96 + m6229f3(RL163, RL161, RL164) + this.f5749X[1] + 1836072691, 15) + RL162;
        int RL166 = m6226RL(RL161, 10);
        int RL167 = m6226RL(RL162 + m6229f3(RL165, RL163, RL166) + this.f5749X[3] + 1836072691, 11) + RL164;
        int RL168 = m6226RL(RL163, 10);
        int RL169 = m6226RL(RL164 + m6229f3(RL167, RL165, RL168) + this.f5749X[7] + 1836072691, 8) + RL166;
        int RL170 = m6226RL(RL165, 10);
        int RL171 = m6226RL(RL166 + m6229f3(RL169, RL167, RL170) + this.f5749X[14] + 1836072691, 6) + RL168;
        int RL172 = m6226RL(RL167, 10);
        int RL173 = m6226RL(RL168 + m6229f3(RL171, RL169, RL172) + this.f5749X[6] + 1836072691, 6) + RL170;
        int RL174 = m6226RL(RL169, 10);
        int RL175 = m6226RL(RL170 + m6229f3(RL173, RL171, RL174) + this.f5749X[9] + 1836072691, 14) + RL172;
        int RL176 = m6226RL(RL171, 10);
        int RL177 = m6226RL(RL172 + m6229f3(RL175, RL173, RL176) + this.f5749X[11] + 1836072691, 12) + RL174;
        int RL178 = m6226RL(RL173, 10);
        int RL179 = m6226RL(RL174 + m6229f3(RL177, RL175, RL178) + this.f5749X[8] + 1836072691, 13) + RL176;
        int RL180 = m6226RL(RL175, 10);
        int RL181 = m6226RL(RL176 + m6229f3(RL179, RL177, RL180) + this.f5749X[12] + 1836072691, 5) + RL178;
        int RL182 = m6226RL(RL177, 10);
        int RL183 = m6226RL(RL178 + m6229f3(RL181, RL179, RL182) + this.f5749X[2] + 1836072691, 14) + RL180;
        int RL184 = m6226RL(RL179, 10);
        int RL185 = m6226RL(RL180 + m6229f3(RL183, RL181, RL184) + this.f5749X[10] + 1836072691, 13) + RL182;
        int RL186 = m6226RL(RL181, 10);
        int RL187 = m6226RL(RL182 + m6229f3(RL185, RL183, RL186) + this.f5749X[0] + 1836072691, 13) + RL184;
        int RL188 = m6226RL(RL183, 10);
        int RL189 = m6226RL(RL184 + m6229f3(RL187, RL185, RL188) + this.f5749X[4] + 1836072691, 7) + RL186;
        int RL190 = m6226RL(RL185, 10);
        int RL191 = m6226RL(RL186 + m6229f3(RL189, RL187, RL190) + this.f5749X[13] + 1836072691, 5) + RL188;
        int RL192 = m6226RL(RL187, 10);
        int RL193 = m6226RL(((RL188 + m6230f4(RL159, RL157, RL160)) + this.f5749X[1]) - 1894007588, 11) + RL158;
        int RL194 = m6226RL(RL157, 10);
        int RL195 = m6226RL(((RL158 + m6230f4(RL193, RL159, RL194)) + this.f5749X[9]) - 1894007588, 12) + RL160;
        int RL196 = m6226RL(RL159, 10);
        int RL197 = m6226RL(((RL160 + m6230f4(RL195, RL193, RL196)) + this.f5749X[11]) - 1894007588, 14) + RL194;
        int RL198 = m6226RL(RL193, 10);
        int RL199 = m6226RL(((RL194 + m6230f4(RL197, RL195, RL198)) + this.f5749X[10]) - 1894007588, 15) + RL196;
        int RL200 = m6226RL(RL195, 10);
        int RL201 = m6226RL(((RL196 + m6230f4(RL199, RL197, RL200)) + this.f5749X[0]) - 1894007588, 14) + RL198;
        int RL202 = m6226RL(RL197, 10);
        int RL203 = m6226RL(((RL198 + m6230f4(RL201, RL199, RL202)) + this.f5749X[8]) - 1894007588, 15) + RL200;
        int RL204 = m6226RL(RL199, 10);
        int RL205 = m6226RL(((RL200 + m6230f4(RL203, RL201, RL204)) + this.f5749X[12]) - 1894007588, 9) + RL202;
        int RL206 = m6226RL(RL201, 10);
        int RL207 = m6226RL(((RL202 + m6230f4(RL205, RL203, RL206)) + this.f5749X[4]) - 1894007588, 8) + RL204;
        int RL208 = m6226RL(RL203, 10);
        int RL209 = m6226RL(((RL204 + m6230f4(RL207, RL205, RL208)) + this.f5749X[13]) - 1894007588, 9) + RL206;
        int RL210 = m6226RL(RL205, 10);
        int RL211 = m6226RL(((RL206 + m6230f4(RL209, RL207, RL210)) + this.f5749X[3]) - 1894007588, 14) + RL208;
        int RL212 = m6226RL(RL207, 10);
        int RL213 = m6226RL(((RL208 + m6230f4(RL211, RL209, RL212)) + this.f5749X[7]) - 1894007588, 5) + RL210;
        int RL214 = m6226RL(RL209, 10);
        int RL215 = m6226RL(((RL210 + m6230f4(RL213, RL211, RL214)) + this.f5749X[15]) - 1894007588, 6) + RL212;
        int RL216 = m6226RL(RL211, 10);
        int RL217 = m6226RL(((RL212 + m6230f4(RL215, RL213, RL216)) + this.f5749X[14]) - 1894007588, 8) + RL214;
        int RL218 = m6226RL(RL213, 10);
        int RL219 = m6226RL(((RL214 + m6230f4(RL217, RL215, RL218)) + this.f5749X[5]) - 1894007588, 6) + RL216;
        int RL220 = m6226RL(RL215, 10);
        int RL221 = m6226RL(((RL216 + m6230f4(RL219, RL217, RL220)) + this.f5749X[6]) - 1894007588, 5) + RL218;
        int RL222 = m6226RL(RL217, 10);
        int RL223 = m6226RL(((RL218 + m6230f4(RL221, RL219, RL222)) + this.f5749X[2]) - 1894007588, 12) + RL220;
        int RL224 = m6226RL(RL219, 10);
        int RL225 = m6226RL(RL156 + m6228f2(RL191, RL189, RL192) + this.f5749X[8] + 2053994217, 15) + RL190;
        int RL226 = m6226RL(RL189, 10);
        int RL227 = m6226RL(RL190 + m6228f2(RL225, RL191, RL226) + this.f5749X[6] + 2053994217, 5) + RL192;
        int RL228 = m6226RL(RL191, 10);
        int RL229 = m6226RL(RL192 + m6228f2(RL227, RL225, RL228) + this.f5749X[4] + 2053994217, 8) + RL226;
        int RL230 = m6226RL(RL225, 10);
        int RL231 = m6226RL(RL226 + m6228f2(RL229, RL227, RL230) + this.f5749X[1] + 2053994217, 11) + RL228;
        int RL232 = m6226RL(RL227, 10);
        int RL233 = m6226RL(RL228 + m6228f2(RL231, RL229, RL232) + this.f5749X[3] + 2053994217, 14) + RL230;
        int RL234 = m6226RL(RL229, 10);
        int RL235 = m6226RL(RL230 + m6228f2(RL233, RL231, RL234) + this.f5749X[11] + 2053994217, 14) + RL232;
        int RL236 = m6226RL(RL231, 10);
        int RL237 = m6226RL(RL232 + m6228f2(RL235, RL233, RL236) + this.f5749X[15] + 2053994217, 6) + RL234;
        int RL238 = m6226RL(RL233, 10);
        int RL239 = m6226RL(RL234 + m6228f2(RL237, RL235, RL238) + this.f5749X[0] + 2053994217, 14) + RL236;
        int RL240 = m6226RL(RL235, 10);
        int RL241 = m6226RL(RL236 + m6228f2(RL239, RL237, RL240) + this.f5749X[5] + 2053994217, 6) + RL238;
        int RL242 = m6226RL(RL237, 10);
        int RL243 = m6226RL(RL238 + m6228f2(RL241, RL239, RL242) + this.f5749X[12] + 2053994217, 9) + RL240;
        int RL244 = m6226RL(RL239, 10);
        int RL245 = m6226RL(RL240 + m6228f2(RL243, RL241, RL244) + this.f5749X[2] + 2053994217, 12) + RL242;
        int RL246 = m6226RL(RL241, 10);
        int RL247 = m6226RL(RL242 + m6228f2(RL245, RL243, RL246) + this.f5749X[13] + 2053994217, 9) + RL244;
        int RL248 = m6226RL(RL243, 10);
        int RL249 = m6226RL(RL244 + m6228f2(RL247, RL245, RL248) + this.f5749X[9] + 2053994217, 12) + RL246;
        int RL250 = m6226RL(RL245, 10);
        int RL251 = m6226RL(RL246 + m6228f2(RL249, RL247, RL250) + this.f5749X[7] + 2053994217, 5) + RL248;
        int RL252 = m6226RL(RL247, 10);
        int RL253 = m6226RL(RL248 + m6228f2(RL251, RL249, RL252) + this.f5749X[10] + 2053994217, 15) + RL250;
        int RL254 = m6226RL(RL249, 10);
        int RL255 = m6226RL(RL250 + m6228f2(RL253, RL251, RL254) + this.f5749X[14] + 2053994217, 8) + RL252;
        int RL256 = m6226RL(RL251, 10);
        int RL257 = m6226RL(((RL220 + m6231f5(RL223, RL253, RL224)) + this.f5749X[4]) - 1454113458, 9) + RL222;
        int RL258 = m6226RL(RL253, 10);
        int RL259 = m6226RL(((RL222 + m6231f5(RL257, RL223, RL258)) + this.f5749X[0]) - 1454113458, 15) + RL224;
        int RL260 = m6226RL(RL223, 10);
        int RL261 = m6226RL(((RL224 + m6231f5(RL259, RL257, RL260)) + this.f5749X[5]) - 1454113458, 5) + RL258;
        int RL262 = m6226RL(RL257, 10);
        int RL263 = m6226RL(((RL258 + m6231f5(RL261, RL259, RL262)) + this.f5749X[9]) - 1454113458, 11) + RL260;
        int RL264 = m6226RL(RL259, 10);
        int RL265 = m6226RL(((RL260 + m6231f5(RL263, RL261, RL264)) + this.f5749X[7]) - 1454113458, 6) + RL262;
        int RL266 = m6226RL(RL261, 10);
        int RL267 = m6226RL(((RL262 + m6231f5(RL265, RL263, RL266)) + this.f5749X[12]) - 1454113458, 8) + RL264;
        int RL268 = m6226RL(RL263, 10);
        int RL269 = m6226RL(((RL264 + m6231f5(RL267, RL265, RL268)) + this.f5749X[2]) - 1454113458, 13) + RL266;
        int RL270 = m6226RL(RL265, 10);
        int RL271 = m6226RL(((RL266 + m6231f5(RL269, RL267, RL270)) + this.f5749X[10]) - 1454113458, 12) + RL268;
        int RL272 = m6226RL(RL267, 10);
        int RL273 = m6226RL(((RL268 + m6231f5(RL271, RL269, RL272)) + this.f5749X[14]) - 1454113458, 5) + RL270;
        int RL274 = m6226RL(RL269, 10);
        int RL275 = m6226RL(((RL270 + m6231f5(RL273, RL271, RL274)) + this.f5749X[1]) - 1454113458, 12) + RL272;
        int RL276 = m6226RL(RL271, 10);
        int RL277 = m6226RL(((RL272 + m6231f5(RL275, RL273, RL276)) + this.f5749X[3]) - 1454113458, 13) + RL274;
        int RL278 = m6226RL(RL273, 10);
        int RL279 = m6226RL(((RL274 + m6231f5(RL277, RL275, RL278)) + this.f5749X[8]) - 1454113458, 14) + RL276;
        int RL280 = m6226RL(RL275, 10);
        int RL281 = m6226RL(((RL276 + m6231f5(RL279, RL277, RL280)) + this.f5749X[11]) - 1454113458, 11) + RL278;
        int RL282 = m6226RL(RL277, 10);
        int RL283 = m6226RL(((RL278 + m6231f5(RL281, RL279, RL282)) + this.f5749X[6]) - 1454113458, 8) + RL280;
        int RL284 = m6226RL(RL279, 10);
        int RL285 = m6226RL(((RL280 + m6231f5(RL283, RL281, RL284)) + this.f5749X[15]) - 1454113458, 5) + RL282;
        int RL286 = m6226RL(RL281, 10);
        int RL287 = m6226RL(((RL282 + m6231f5(RL285, RL283, RL286)) + this.f5749X[13]) - 1454113458, 6);
        int RL288 = m6226RL(RL283, 10);
        int RL289 = m6226RL(RL252 + m6227f1(RL255, RL221, RL256) + this.f5749X[12], 8) + RL254;
        int RL290 = m6226RL(RL221, 10);
        int RL291 = m6226RL(RL254 + m6227f1(RL289, RL255, RL290) + this.f5749X[15], 5) + RL256;
        int RL292 = m6226RL(RL255, 10);
        int RL293 = m6226RL(RL256 + m6227f1(RL291, RL289, RL292) + this.f5749X[10], 12) + RL290;
        int RL294 = m6226RL(RL289, 10);
        int RL295 = m6226RL(RL290 + m6227f1(RL293, RL291, RL294) + this.f5749X[4], 9) + RL292;
        int RL296 = m6226RL(RL291, 10);
        int RL297 = m6226RL(RL292 + m6227f1(RL295, RL293, RL296) + this.f5749X[1], 12) + RL294;
        int RL298 = m6226RL(RL293, 10);
        int RL299 = m6226RL(RL294 + m6227f1(RL297, RL295, RL298) + this.f5749X[5], 5) + RL296;
        int RL300 = m6226RL(RL295, 10);
        int RL301 = m6226RL(RL296 + m6227f1(RL299, RL297, RL300) + this.f5749X[8], 14) + RL298;
        int RL302 = m6226RL(RL297, 10);
        int RL303 = m6226RL(RL298 + m6227f1(RL301, RL299, RL302) + this.f5749X[7], 6) + RL300;
        int RL304 = m6226RL(RL299, 10);
        int RL305 = m6226RL(RL300 + m6227f1(RL303, RL301, RL304) + this.f5749X[6], 8) + RL302;
        int RL306 = m6226RL(RL301, 10);
        int RL307 = m6226RL(RL302 + m6227f1(RL305, RL303, RL306) + this.f5749X[2], 13) + RL304;
        int RL308 = m6226RL(RL303, 10);
        int RL309 = m6226RL(RL304 + m6227f1(RL307, RL305, RL308) + this.f5749X[13], 6) + RL306;
        int RL310 = m6226RL(RL305, 10);
        int RL311 = m6226RL(RL306 + m6227f1(RL309, RL307, RL310) + this.f5749X[14], 5) + RL308;
        int RL312 = m6226RL(RL307, 10);
        int RL313 = m6226RL(RL308 + m6227f1(RL311, RL309, RL312) + this.f5749X[0], 15) + RL310;
        int RL314 = m6226RL(RL309, 10);
        int RL315 = m6226RL(RL310 + m6227f1(RL313, RL311, RL314) + this.f5749X[3], 13) + RL312;
        int RL316 = m6226RL(RL311, 10);
        int RL317 = m6226RL(RL312 + m6227f1(RL315, RL313, RL316) + this.f5749X[9], 11) + RL314;
        int RL318 = m6226RL(RL313, 10);
        int RL319 = m6226RL(RL314 + m6227f1(RL317, RL315, RL318) + this.f5749X[11], 11);
        int RL320 = m6226RL(RL315, 10);
        this.f5739H0 += RL284;
        this.f5740H1 += RL287 + RL284;
        this.f5741H2 += RL285;
        this.f5742H3 += RL288;
        this.f5743H4 += RL318;
        this.f5744H5 += RL316;
        this.f5745H6 += RL319 + RL316;
        this.f5746H7 += RL317;
        this.f5747H8 += RL320;
        this.f5748H9 += RL286;
        this.xOff = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f5749X;
            if (i11 != iArr.length) {
                iArr[i11] = 0;
                i11++;
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
        int[] iArr = this.f5749X;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    /* access modifiers changed from: protected */
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f5749X;
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
        this.f5739H0 = 1732584193;
        this.f5740H1 = -271733879;
        this.f5741H2 = -1732584194;
        this.f5742H3 = 271733878;
        this.f5743H4 = -1009589776;
        this.f5744H5 = 1985229328;
        this.f5745H6 = -19088744;
        this.f5746H7 = -1985229329;
        this.f5747H8 = 19088743;
        this.f5748H9 = 1009589775;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f5749X;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void reset(Memoable memoable) {
        doCopy((RIPEMD320Digest) memoable);
    }
}
