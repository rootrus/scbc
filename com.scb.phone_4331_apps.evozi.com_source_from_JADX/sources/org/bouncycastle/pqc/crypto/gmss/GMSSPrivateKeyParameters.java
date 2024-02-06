package org.bouncycastle.pqc.crypto.gmss;

import java.io.PrintStream;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

public class GMSSPrivateKeyParameters extends GMSSKeyParameters {

    /* renamed from: K */
    private int[] f6291K;
    private byte[][][] currentAuthPaths;
    private Vector[][] currentRetain;
    private byte[][] currentRootSig;
    private byte[][] currentSeeds;
    private Vector[] currentStack;
    private Treehash[][] currentTreehash;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private int[] index;
    private byte[][][] keep;
    private int mdLength;
    private Digest messDigestTrees;
    private int[] minTreehash;
    private byte[][][] nextAuthPaths;
    private GMSSLeaf[] nextNextLeaf;
    private GMSSRootCalc[] nextNextRoot;
    private byte[][] nextNextSeeds;
    private Vector[][] nextRetain;
    private byte[][] nextRoot;
    private GMSSRootSig[] nextRootSig;
    private Vector[] nextStack;
    private Treehash[][] nextTreehash;
    private int numLayer;
    private int[] numLeafs;
    private int[] otsIndex;
    private GMSSLeaf[] upperLeaf;
    private GMSSLeaf[] upperTreehashLeaf;
    private boolean used;

    private GMSSPrivateKeyParameters(GMSSPrivateKeyParameters gMSSPrivateKeyParameters) {
        super(true, gMSSPrivateKeyParameters.getParameters());
        this.used = false;
        this.index = Arrays.clone(gMSSPrivateKeyParameters.index);
        this.currentSeeds = Arrays.clone(gMSSPrivateKeyParameters.currentSeeds);
        this.nextNextSeeds = Arrays.clone(gMSSPrivateKeyParameters.nextNextSeeds);
        this.currentAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.currentAuthPaths);
        this.nextAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.nextAuthPaths);
        this.currentTreehash = gMSSPrivateKeyParameters.currentTreehash;
        this.nextTreehash = gMSSPrivateKeyParameters.nextTreehash;
        this.currentStack = gMSSPrivateKeyParameters.currentStack;
        this.nextStack = gMSSPrivateKeyParameters.nextStack;
        this.currentRetain = gMSSPrivateKeyParameters.currentRetain;
        this.nextRetain = gMSSPrivateKeyParameters.nextRetain;
        this.keep = Arrays.clone(gMSSPrivateKeyParameters.keep);
        this.nextNextLeaf = gMSSPrivateKeyParameters.nextNextLeaf;
        this.upperLeaf = gMSSPrivateKeyParameters.upperLeaf;
        this.upperTreehashLeaf = gMSSPrivateKeyParameters.upperTreehashLeaf;
        this.minTreehash = gMSSPrivateKeyParameters.minTreehash;
        this.gmssPS = gMSSPrivateKeyParameters.gmssPS;
        this.nextRoot = Arrays.clone(gMSSPrivateKeyParameters.nextRoot);
        this.nextNextRoot = gMSSPrivateKeyParameters.nextNextRoot;
        this.currentRootSig = gMSSPrivateKeyParameters.currentRootSig;
        this.nextRootSig = gMSSPrivateKeyParameters.nextRootSig;
        this.digestProvider = gMSSPrivateKeyParameters.digestProvider;
        this.heightOfTrees = gMSSPrivateKeyParameters.heightOfTrees;
        this.otsIndex = gMSSPrivateKeyParameters.otsIndex;
        this.f6291K = gMSSPrivateKeyParameters.f6291K;
        this.numLayer = gMSSPrivateKeyParameters.numLayer;
        this.messDigestTrees = gMSSPrivateKeyParameters.messDigestTrees;
        this.mdLength = gMSSPrivateKeyParameters.mdLength;
        this.gmssRandom = gMSSPrivateKeyParameters.gmssRandom;
        this.numLeafs = gMSSPrivateKeyParameters.numLeafs;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GMSSPrivateKeyParameters(int[] r18, byte[][] r19, byte[][] r20, byte[][][] r21, byte[][][] r22, byte[][][] r23, org.bouncycastle.pqc.crypto.gmss.Treehash[][] r24, org.bouncycastle.pqc.crypto.gmss.Treehash[][] r25, java.util.Vector[] r26, java.util.Vector[] r27, java.util.Vector[][] r28, java.util.Vector[][] r29, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r30, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r31, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r32, int[] r33, byte[][] r34, org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[] r35, byte[][] r36, org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[] r37, org.bouncycastle.pqc.crypto.gmss.GMSSParameters r38, org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider r39) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r23
            r4 = r26
            r5 = r27
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r37
            r13 = r38
            r14 = 1
            r0.<init>(r14, r13)
            r15 = 0
            r0.used = r15
            org.bouncycastle.crypto.Digest r14 = r39.get()
            r0.messDigestTrees = r14
            int r14 = r14.getDigestSize()
            r0.mdLength = r14
            r0.gmssPS = r13
            int[] r14 = r38.getWinternitzParameter()
            r0.otsIndex = r14
            int[] r14 = r38.getK()
            r0.f6291K = r14
            int[] r13 = r38.getHeightOfTrees()
            r0.heightOfTrees = r13
            org.bouncycastle.pqc.crypto.gmss.GMSSParameters r13 = r0.gmssPS
            int r13 = r13.getNumOfLayers()
            r0.numLayer = r13
            if (r1 != 0) goto L_0x005d
            int[] r1 = new int[r13]
            r0.index = r1
            r1 = r15
        L_0x0052:
            int r13 = r0.numLayer
            if (r1 >= r13) goto L_0x005f
            int[] r13 = r0.index
            r13[r1] = r15
            int r1 = r1 + 1
            goto L_0x0052
        L_0x005d:
            r0.index = r1
        L_0x005f:
            r0.currentSeeds = r2
            r1 = r20
            r0.nextNextSeeds = r1
            r1 = r21
            r0.currentAuthPaths = r1
            r1 = r22
            r0.nextAuthPaths = r1
            r1 = 2
            if (r3 != 0) goto L_0x009d
            int r3 = r0.numLayer
            byte[][][] r3 = new byte[r3][][]
            r0.keep = r3
            r3 = r15
        L_0x0077:
            int r13 = r0.numLayer
            if (r3 >= r13) goto L_0x009f
            byte[][][] r13 = r0.keep
            int[] r14 = r0.heightOfTrees
            r14 = r14[r3]
            int r14 = r14 / r1
            int r15 = r0.mdLength
            int[] r2 = new int[r1]
            r16 = 1
            r2[r16] = r15
            r15 = 0
            r2[r15] = r14
            java.lang.Class r14 = java.lang.Byte.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r14, r2)
            byte[][] r2 = (byte[][]) r2
            r13[r3] = r2
            int r3 = r3 + 1
            r2 = r19
            r15 = 0
            goto L_0x0077
        L_0x009d:
            r0.keep = r3
        L_0x009f:
            if (r4 != 0) goto L_0x00b8
            int r2 = r0.numLayer
            java.util.Vector[] r2 = new java.util.Vector[r2]
            r0.currentStack = r2
            r2 = 0
        L_0x00a8:
            int r3 = r0.numLayer
            if (r2 >= r3) goto L_0x00ba
            java.util.Vector[] r3 = r0.currentStack
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r3[r2] = r4
            int r2 = r2 + 1
            goto L_0x00a8
        L_0x00b8:
            r0.currentStack = r4
        L_0x00ba:
            if (r5 != 0) goto L_0x00d7
            int r2 = r0.numLayer
            r3 = 1
            int r2 = r2 - r3
            java.util.Vector[] r2 = new java.util.Vector[r2]
            r0.nextStack = r2
            r2 = 0
        L_0x00c5:
            int r4 = r0.numLayer
            int r4 = r4 - r3
            if (r2 >= r4) goto L_0x00d9
            java.util.Vector[] r3 = r0.nextStack
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r3[r2] = r4
            int r2 = r2 + 1
            r3 = 1
            goto L_0x00c5
        L_0x00d7:
            r0.nextStack = r5
        L_0x00d9:
            r2 = r24
            r0.currentTreehash = r2
            r2 = r25
            r0.nextTreehash = r2
            r2 = r28
            r0.currentRetain = r2
            r2 = r29
            r0.nextRetain = r2
            r0.nextRoot = r10
            r2 = r39
            r0.digestProvider = r2
            if (r11 != 0) goto L_0x0117
            int r3 = r0.numLayer
            r4 = 1
            int r3 = r3 - r4
            org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[] r3 = new org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[r3]
            r0.nextNextRoot = r3
            r3 = 0
        L_0x00fa:
            int r5 = r0.numLayer
            int r5 = r5 - r4
            if (r3 >= r5) goto L_0x0119
            org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[] r4 = r0.nextNextRoot
            int[] r5 = r0.heightOfTrees
            int r11 = r3 + 1
            org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc r13 = new org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc
            r5 = r5[r11]
            int[] r14 = r0.f6291K
            r14 = r14[r11]
            org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider r15 = r0.digestProvider
            r13.<init>(r5, r14, r15)
            r4[r3] = r13
            r3 = r11
            r4 = 1
            goto L_0x00fa
        L_0x0117:
            r0.nextNextRoot = r11
        L_0x0119:
            r3 = r36
            r0.currentRootSig = r3
            int r3 = r0.numLayer
            int[] r3 = new int[r3]
            r0.numLeafs = r3
            r3 = 0
        L_0x0124:
            int r4 = r0.numLayer
            if (r3 >= r4) goto L_0x0136
            int[] r4 = r0.numLeafs
            int[] r5 = r0.heightOfTrees
            r5 = r5[r3]
            r11 = 1
            int r5 = r11 << r5
            r4[r3] = r5
            int r3 = r3 + 1
            goto L_0x0124
        L_0x0136:
            r11 = 1
            org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom r3 = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom
            org.bouncycastle.crypto.Digest r4 = r0.messDigestTrees
            r3.<init>(r4)
            r0.gmssRandom = r3
            int r3 = r0.numLayer
            if (r3 <= r11) goto L_0x0173
            if (r6 != 0) goto L_0x0170
            int r3 = r3 - r1
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r3 = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[r3]
            r0.nextNextLeaf = r3
            r3 = 0
        L_0x014c:
            int r4 = r0.numLayer
            int r4 = r4 - r1
            if (r3 >= r4) goto L_0x0178
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r4 = r0.nextNextLeaf
            org.bouncycastle.crypto.Digest r5 = r39.get()
            int[] r6 = r0.otsIndex
            int r11 = r3 + 1
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf r13 = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf
            r6 = r6[r11]
            int[] r14 = r0.numLeafs
            int r15 = r3 + 2
            r14 = r14[r15]
            byte[][] r15 = r0.nextNextSeeds
            r15 = r15[r3]
            r13.<init>(r5, r6, r14, r15)
            r4[r3] = r13
            r3 = r11
            goto L_0x014c
        L_0x0170:
            r0.nextNextLeaf = r6
            goto L_0x0178
        L_0x0173:
            r1 = 0
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r3 = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[r1]
            r0.nextNextLeaf = r3
        L_0x0178:
            if (r7 != 0) goto L_0x01a6
            int r1 = r0.numLayer
            r3 = 1
            int r1 = r1 - r3
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r1 = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[r1]
            r0.upperLeaf = r1
            r15 = 0
        L_0x0183:
            int r1 = r0.numLayer
            int r1 = r1 - r3
            if (r15 >= r1) goto L_0x01a8
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r1 = r0.upperLeaf
            org.bouncycastle.crypto.Digest r3 = r39.get()
            int[] r4 = r0.otsIndex
            r4 = r4[r15]
            int[] r5 = r0.numLeafs
            int r6 = r15 + 1
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf r7 = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf
            r5 = r5[r6]
            byte[][] r11 = r0.currentSeeds
            r11 = r11[r15]
            r7.<init>(r3, r4, r5, r11)
            r1[r15] = r7
            r15 = r6
            r3 = 1
            goto L_0x0183
        L_0x01a6:
            r0.upperLeaf = r7
        L_0x01a8:
            if (r8 != 0) goto L_0x01d2
            int r1 = r0.numLayer
            r3 = 1
            int r1 = r1 - r3
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r1 = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[r1]
            r0.upperTreehashLeaf = r1
            r15 = 0
        L_0x01b3:
            int r1 = r0.numLayer
            int r1 = r1 - r3
            if (r15 >= r1) goto L_0x01d4
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] r1 = r0.upperTreehashLeaf
            org.bouncycastle.crypto.Digest r3 = r39.get()
            int[] r4 = r0.otsIndex
            r4 = r4[r15]
            int[] r5 = r0.numLeafs
            int r6 = r15 + 1
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf r7 = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf
            r5 = r5[r6]
            r7.<init>((org.bouncycastle.crypto.Digest) r3, (int) r4, (int) r5)
            r1[r15] = r7
            r15 = r6
            r3 = 1
            goto L_0x01b3
        L_0x01d2:
            r0.upperTreehashLeaf = r8
        L_0x01d4:
            if (r9 != 0) goto L_0x01ed
            int r1 = r0.numLayer
            r3 = 1
            int r1 = r1 - r3
            int[] r1 = new int[r1]
            r0.minTreehash = r1
            r15 = 0
        L_0x01df:
            int r1 = r0.numLayer
            int r1 = r1 - r3
            if (r15 >= r1) goto L_0x01ef
            int[] r1 = r0.minTreehash
            r3 = -1
            r1[r15] = r3
            int r15 = r15 + 1
            r3 = 1
            goto L_0x01df
        L_0x01ed:
            r0.minTreehash = r9
        L_0x01ef:
            int r1 = r0.mdLength
            byte[] r1 = new byte[r1]
            if (r12 != 0) goto L_0x0238
            int r3 = r0.numLayer
            r4 = 1
            int r3 = r3 - r4
            org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[] r3 = new org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[r3]
            r0.nextRootSig = r3
            r15 = 0
        L_0x01fe:
            int r3 = r0.numLayer
            int r3 = r3 - r4
            if (r15 >= r3) goto L_0x023a
            r3 = r19[r15]
            int r5 = r0.mdLength
            r6 = 0
            java.lang.System.arraycopy(r3, r6, r1, r6, r5)
            org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom r3 = r0.gmssRandom
            r3.nextSeed(r1)
            org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom r3 = r0.gmssRandom
            byte[] r3 = r3.nextSeed(r1)
            org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[] r5 = r0.nextRootSig
            org.bouncycastle.crypto.Digest r7 = r39.get()
            int[] r8 = r0.otsIndex
            r8 = r8[r15]
            int[] r9 = r0.heightOfTrees
            int r11 = r15 + 1
            org.bouncycastle.pqc.crypto.gmss.GMSSRootSig r12 = new org.bouncycastle.pqc.crypto.gmss.GMSSRootSig
            r9 = r9[r11]
            r12.<init>((org.bouncycastle.crypto.Digest) r7, (int) r8, (int) r9)
            r5[r15] = r12
            org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[] r5 = r0.nextRootSig
            r5 = r5[r15]
            r7 = r10[r15]
            r5.initSign(r3, r7)
            r15 = r11
            goto L_0x01fe
        L_0x0238:
            r0.nextRootSig = r12
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters.<init>(int[], byte[][], byte[][], byte[][][], byte[][][], byte[][][], org.bouncycastle.pqc.crypto.gmss.Treehash[][], org.bouncycastle.pqc.crypto.gmss.Treehash[][], java.util.Vector[], java.util.Vector[], java.util.Vector[][], java.util.Vector[][], org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[], org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[], org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[], int[], byte[][], org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[], byte[][], org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[], org.bouncycastle.pqc.crypto.gmss.GMSSParameters, org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider):void");
    }

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        this((int[]) null, bArr, bArr2, bArr3, bArr4, (byte[][][]) null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, (GMSSLeaf[]) null, (GMSSLeaf[]) null, (GMSSLeaf[]) null, (int[]) null, bArr5, (GMSSRootCalc[]) null, bArr6, (GMSSRootSig[]) null, gMSSParameters, gMSSDigestProvider);
    }

    private void computeAuthPaths(int i) {
        int i2;
        byte[] bArr;
        int i3 = this.index[i];
        int i4 = this.heightOfTrees[i];
        int i5 = this.f6291K[i];
        int i6 = 0;
        while (true) {
            i2 = i4 - i5;
            if (i6 >= i2) {
                break;
            }
            this.currentTreehash[i][i6].updateNextSeed(this.gmssRandom);
            i6++;
        }
        int heightOfPhi = heightOfPhi(i3);
        byte[] nextSeed = this.gmssRandom.nextSeed(this.currentSeeds[i]);
        int i7 = (i3 >>> (heightOfPhi + 1)) & 1;
        int i8 = this.mdLength;
        byte[] bArr2 = new byte[i8];
        int i9 = i4 - 1;
        if (heightOfPhi < i9 && i7 == 0) {
            System.arraycopy(this.currentAuthPaths[i][heightOfPhi], 0, bArr2, 0, i8);
        }
        int i10 = this.mdLength;
        if (heightOfPhi == 0) {
            if (i == this.numLayer - 1) {
                bArr = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey();
            } else {
                byte[] bArr3 = new byte[i10];
                System.arraycopy(this.currentSeeds[i], 0, bArr3, 0, i10);
                this.gmssRandom.nextSeed(bArr3);
                byte[] leaf = this.upperLeaf[i].getLeaf();
                this.upperLeaf[i].initLeafCalc(bArr3);
                bArr = leaf;
            }
            System.arraycopy(bArr, 0, this.currentAuthPaths[i][0], 0, this.mdLength);
        } else {
            int i11 = i10 << 1;
            byte[] bArr4 = new byte[i11];
            int i12 = heightOfPhi - 1;
            System.arraycopy(this.currentAuthPaths[i][i12], 0, bArr4, 0, i10);
            byte[] bArr5 = this.keep[i][i12 / 2];
            int i13 = this.mdLength;
            System.arraycopy(bArr5, 0, bArr4, i13, i13);
            this.messDigestTrees.update(bArr4, 0, i11);
            this.currentAuthPaths[i][heightOfPhi] = new byte[this.messDigestTrees.getDigestSize()];
            this.messDigestTrees.doFinal(this.currentAuthPaths[i][heightOfPhi], 0);
            for (int i14 = 0; i14 < heightOfPhi; i14++) {
                if (i14 < i2) {
                    if (this.currentTreehash[i][i14].wasFinished()) {
                        System.arraycopy(this.currentTreehash[i][i14].getFirstNode(), 0, this.currentAuthPaths[i][i14], 0, this.mdLength);
                        this.currentTreehash[i][i14].destroy();
                    } else {
                        PrintStream printStream = System.err;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Treehash (");
                        sb.append(i);
                        sb.append(",");
                        sb.append(i14);
                        sb.append(") not finished when needed in AuthPathComputation");
                        printStream.println(sb.toString());
                    }
                }
                if (i14 < i9 && i14 >= i2) {
                    int i15 = i14 - i2;
                    if (this.currentRetain[i][i15].size() > 0) {
                        System.arraycopy(this.currentRetain[i][i15].lastElement(), 0, this.currentAuthPaths[i][i14], 0, this.mdLength);
                        Vector[][] vectorArr = this.currentRetain;
                        vectorArr[i][i15].removeElementAt(vectorArr[i][i15].size() - 1);
                    }
                }
                if (i14 < i2 && ((1 << i14) * 3) + i3 < this.numLeafs[i]) {
                    this.currentTreehash[i][i14].initialize();
                }
            }
        }
        if (heightOfPhi < i9 && i7 == 0) {
            System.arraycopy(bArr2, 0, this.keep[i][heightOfPhi / 2], 0, this.mdLength);
        }
        if (i == this.numLayer - 1) {
            for (int i16 = 1; i16 <= i2 / 2; i16++) {
                int minTreehashIndex = getMinTreehashIndex(i);
                if (minTreehashIndex >= 0) {
                    try {
                        byte[] bArr6 = new byte[this.mdLength];
                        System.arraycopy(this.currentTreehash[i][minTreehashIndex].getSeedActive(), 0, bArr6, 0, this.mdLength);
                        this.currentTreehash[i][minTreehashIndex].update(this.gmssRandom, new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr6), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
            return;
        }
        this.minTreehash[i] = getMinTreehashIndex(i);
    }

    private int getMinTreehashIndex(int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.heightOfTrees[i] - this.f6291K[i]; i3++) {
            if (this.currentTreehash[i][i3].wasInitialized() && !this.currentTreehash[i][i3].wasFinished() && (i2 == -1 || this.currentTreehash[i][i3].getLowestNodeHeight() < this.currentTreehash[i][i2].getLowestNodeHeight())) {
                i2 = i3;
            }
        }
        return i2;
    }

    private int heightOfPhi(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        int i3 = 1;
        while (i % i3 == 0) {
            i3 <<= 1;
            i2++;
        }
        return i2 - 1;
    }

    private void nextKey(int i) {
        if (i == this.numLayer - 1) {
            int[] iArr = this.index;
            iArr[i] = iArr[i] + 1;
        }
        if (this.index[i] != this.numLeafs[i]) {
            updateKey(i);
        } else if (this.numLayer != 1) {
            nextTree(i);
            this.index[i] = 0;
        }
    }

    private void nextTree(int i) {
        if (i > 0) {
            int[] iArr = this.index;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            int i3 = i;
            boolean z = true;
            do {
                i3--;
                if (this.index[i3] < this.numLeafs[i3]) {
                    z = false;
                }
                if (!z) {
                    break;
                }
            } while (i3 > 0);
            if (!z) {
                this.gmssRandom.nextSeed(this.currentSeeds[i]);
                this.nextRootSig[i2].updateSign();
                if (i > 1) {
                    GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                    int i4 = i2 - 1;
                    gMSSLeafArr[i4] = gMSSLeafArr[i4].nextLeaf();
                }
                GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
                gMSSLeafArr2[i2] = gMSSLeafArr2[i2].nextLeaf();
                if (this.minTreehash[i2] >= 0) {
                    GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                    gMSSLeafArr3[i2] = gMSSLeafArr3[i2].nextLeaf();
                    try {
                        this.currentTreehash[i2][this.minTreehash[i2]].update(this.gmssRandom, this.upperTreehashLeaf[i2].getLeaf());
                        this.currentTreehash[i2][this.minTreehash[i2]].wasFinished();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                updateNextNextAuthRoot(i);
                this.currentRootSig[i2] = this.nextRootSig[i2].getSig();
                for (int i5 = 0; i5 < this.heightOfTrees[i] - this.f6291K[i]; i5++) {
                    Treehash[] treehashArr = this.currentTreehash[i];
                    Treehash[][] treehashArr2 = this.nextTreehash;
                    treehashArr[i5] = treehashArr2[i2][i5];
                    treehashArr2[i2][i5] = this.nextNextRoot[i2].getTreehash()[i5];
                }
                for (int i6 = 0; i6 < this.heightOfTrees[i]; i6++) {
                    System.arraycopy(this.nextAuthPaths[i2][i6], 0, this.currentAuthPaths[i][i6], 0, this.mdLength);
                    System.arraycopy(this.nextNextRoot[i2].getAuthPath()[i6], 0, this.nextAuthPaths[i2][i6], 0, this.mdLength);
                }
                for (int i7 = 0; i7 < this.f6291K[i] - 1; i7++) {
                    Vector[] vectorArr = this.currentRetain[i];
                    Vector[][] vectorArr2 = this.nextRetain;
                    vectorArr[i7] = vectorArr2[i2][i7];
                    vectorArr2[i2][i7] = this.nextNextRoot[i2].getRetain()[i7];
                }
                Vector[] vectorArr3 = this.currentStack;
                Vector[] vectorArr4 = this.nextStack;
                vectorArr3[i] = vectorArr4[i2];
                vectorArr4[i2] = this.nextNextRoot[i2].getStack();
                this.nextRoot[i2] = this.nextNextRoot[i2].getRoot();
                int i8 = this.mdLength;
                byte[] bArr = new byte[i8];
                System.arraycopy(this.currentSeeds[i2], 0, bArr, 0, i8);
                this.gmssRandom.nextSeed(bArr);
                this.gmssRandom.nextSeed(bArr);
                this.nextRootSig[i2].initSign(this.gmssRandom.nextSeed(bArr), this.nextRoot[i2]);
                nextKey(i2);
            }
        }
    }

    private void updateKey(int i) {
        computeAuthPaths(i);
        if (i > 0) {
            if (i > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i2 = (i - 1) - 1;
                gMSSLeafArr[i2] = gMSSLeafArr[i2].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            int i3 = i - 1;
            gMSSLeafArr2[i3] = gMSSLeafArr2[i3].nextLeaf();
            int floor = (int) Math.floor(((double) (getNumLeafs(i) << 1)) / ((double) (this.heightOfTrees[i3] - this.f6291K[i3])));
            int[] iArr = this.index;
            if (iArr[i] % floor == 1) {
                if (iArr[i] > 1 && this.minTreehash[i3] >= 0) {
                    try {
                        this.currentTreehash[i3][this.minTreehash[i3]].update(this.gmssRandom, this.upperTreehashLeaf[i3].getLeaf());
                        this.currentTreehash[i3][this.minTreehash[i3]].wasFinished();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                this.minTreehash[i3] = getMinTreehashIndex(i3);
                int[] iArr2 = this.minTreehash;
                if (iArr2[i3] >= 0) {
                    this.upperTreehashLeaf[i3] = new GMSSLeaf(this.digestProvider.get(), this.otsIndex[i3], floor, this.currentTreehash[i3][iArr2[i3]].getSeedActive());
                    GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                    gMSSLeafArr3[i3] = gMSSLeafArr3[i3].nextLeaf();
                }
            } else if (this.minTreehash[i3] >= 0) {
                GMSSLeaf[] gMSSLeafArr4 = this.upperTreehashLeaf;
                gMSSLeafArr4[i3] = gMSSLeafArr4[i3].nextLeaf();
            }
            this.nextRootSig[i3].updateSign();
            if (this.index[i] == 1) {
                this.nextNextRoot[i3].initialize(new Vector());
            }
            updateNextNextAuthRoot(i);
        }
    }

    private void updateNextNextAuthRoot(int i) {
        int i2 = i - 1;
        byte[] nextSeed = this.gmssRandom.nextSeed(this.nextNextSeeds[i2]);
        if (i == this.numLayer - 1) {
            this.nextNextRoot[i2].update(this.nextNextSeeds[i2], new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            return;
        }
        this.nextNextRoot[i2].update(this.nextNextSeeds[i2], this.nextNextLeaf[i2].getLeaf());
        this.nextNextLeaf[i2].initLeafCalc(this.nextNextSeeds[i2]);
    }

    public byte[][][] getCurrentAuthPaths() {
        return Arrays.clone(this.currentAuthPaths);
    }

    public byte[][] getCurrentSeeds() {
        return Arrays.clone(this.currentSeeds);
    }

    public int getIndex(int i) {
        return this.index[i];
    }

    public int[] getIndex() {
        return this.index;
    }

    public GMSSDigestProvider getName() {
        return this.digestProvider;
    }

    public int getNumLeafs(int i) {
        return this.numLeafs[i];
    }

    public byte[] getSubtreeRootSig(int i) {
        return this.currentRootSig[i];
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public GMSSPrivateKeyParameters nextKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new GMSSPrivateKeyParameters(this);
        gMSSPrivateKeyParameters.nextKey(this.gmssPS.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }
}
