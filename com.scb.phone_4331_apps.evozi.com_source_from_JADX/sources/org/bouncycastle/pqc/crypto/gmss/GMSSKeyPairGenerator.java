package org.bouncycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;

public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";

    /* renamed from: K */
    private int[] f6286K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i;
        int i2;
        if (!this.initialized) {
            initializeDefault();
        }
        int i3 = this.numLayer;
        byte[][][] bArr = new byte[i3][][];
        int i4 = i3 - 1;
        byte[][][] bArr2 = new byte[i4][][];
        Treehash[][] treehashArr = new Treehash[i3][];
        Treehash[][] treehashArr2 = new Treehash[i4][];
        Vector[] vectorArr = new Vector[i3];
        Vector[] vectorArr2 = new Vector[i4];
        Vector[][] vectorArr3 = new Vector[i3][];
        Vector[][] vectorArr4 = new Vector[i4][];
        int i5 = 0;
        while (true) {
            i = this.numLayer;
            if (i5 >= i) {
                break;
            }
            int i6 = this.heightOfTrees[i5];
            int[] iArr = new int[2];
            iArr[1] = this.mdLength;
            iArr[0] = i6;
            bArr[i5] = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
            int[] iArr2 = this.heightOfTrees;
            treehashArr[i5] = new Treehash[(iArr2[i5] - this.f6286K[i5])];
            if (i5 > 0) {
                int i7 = i5 - 1;
                int i8 = iArr2[i5];
                int[] iArr3 = new int[2];
                iArr3[1] = this.mdLength;
                iArr3[0] = i8;
                bArr2[i7] = (byte[][]) Array.newInstance(Byte.TYPE, iArr3);
                treehashArr2[i7] = new Treehash[(this.heightOfTrees[i5] - this.f6286K[i5])];
            }
            vectorArr[i5] = new Vector();
            if (i5 > 0) {
                vectorArr2[i5 - 1] = new Vector();
            }
            i5++;
        }
        int[] iArr4 = new int[2];
        iArr4[1] = this.mdLength;
        iArr4[0] = i;
        byte[][] bArr3 = (byte[][]) Array.newInstance(Byte.TYPE, iArr4);
        int i9 = this.numLayer;
        int[] iArr5 = new int[2];
        iArr5[1] = this.mdLength;
        iArr5[0] = i9 - 1;
        int i10 = this.numLayer;
        byte[][] bArr4 = (byte[][]) Array.newInstance(Byte.TYPE, iArr5);
        int[] iArr6 = new int[2];
        iArr6[1] = this.mdLength;
        iArr6[0] = i10;
        byte[][] bArr5 = (byte[][]) Array.newInstance(Byte.TYPE, iArr6);
        int i11 = 0;
        while (true) {
            i2 = this.numLayer;
            if (i11 >= i2) {
                break;
            }
            System.arraycopy(this.currentSeeds[i11], 0, bArr5[i11], 0, this.mdLength);
            i11++;
        }
        int[] iArr7 = new int[2];
        iArr7[1] = this.mdLength;
        iArr7[0] = i2 - 1;
        this.currentRootSigs = (byte[][]) Array.newInstance(Byte.TYPE, iArr7);
        int i12 = this.numLayer - 1;
        while (i12 >= 0) {
            GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i12], this.f6286K[i12], this.digestProvider);
            try {
                gMSSRootCalc = i12 == this.numLayer - 1 ? generateCurrentAuthpathAndRoot((byte[]) null, vectorArr[i12], bArr5[i12], i12) : generateCurrentAuthpathAndRoot(bArr3[i12 + 1], vectorArr[i12], bArr5[i12], i12);
            } catch (Exception e) {
                e.printStackTrace();
            }
            int i13 = 0;
            while (i13 < this.heightOfTrees[i12]) {
                System.arraycopy(gMSSRootCalc.getAuthPath()[i13], 0, bArr[i12][i13], 0, this.mdLength);
                i13++;
                vectorArr = vectorArr;
                bArr = bArr;
            }
            vectorArr3[i12] = gMSSRootCalc.getRetain();
            treehashArr[i12] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr3[i12], 0, this.mdLength);
            i12--;
            vectorArr = vectorArr;
            bArr = bArr;
        }
        byte[][][] bArr6 = bArr;
        Vector[] vectorArr5 = vectorArr;
        int i14 = this.numLayer - 2;
        while (i14 >= 0) {
            int i15 = i14 + 1;
            GMSSRootCalc generateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i14], bArr5[i15], i15);
            int i16 = 0;
            while (i16 < this.heightOfTrees[i15]) {
                System.arraycopy(generateNextAuthpathAndRoot.getAuthPath()[i16], 0, bArr2[i14][i16], 0, this.mdLength);
                i16++;
                vectorArr3 = vectorArr3;
            }
            vectorArr4[i14] = generateNextAuthpathAndRoot.getRetain();
            treehashArr2[i14] = generateNextAuthpathAndRoot.getTreehash();
            System.arraycopy(generateNextAuthpathAndRoot.getRoot(), 0, bArr4[i14], 0, this.mdLength);
            System.arraycopy(bArr5[i15], 0, this.nextNextSeeds[i14], 0, this.mdLength);
            i14--;
            vectorArr3 = vectorArr3;
        }
        Vector[][] vectorArr6 = vectorArr3;
        GMSSPublicKeyParameters gMSSPublicKeyParameters = new GMSSPublicKeyParameters(bArr3[0], this.gmssPS);
        byte[][] bArr7 = this.currentSeeds;
        byte[][] bArr8 = this.nextNextSeeds;
        byte[][] bArr9 = this.currentRootSigs;
        GMSSParameters gMSSParameters = this.gmssPS;
        GMSSDigestProvider gMSSDigestProvider = this.digestProvider;
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = r2;
        GMSSPublicKeyParameters gMSSPublicKeyParameters2 = gMSSPublicKeyParameters;
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters2 = new GMSSPrivateKeyParameters(bArr7, bArr8, bArr6, bArr2, treehashArr, treehashArr2, vectorArr5, vectorArr2, vectorArr6, vectorArr4, bArr4, bArr9, gMSSParameters, gMSSDigestProvider);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) gMSSPublicKeyParameters2, (AsymmetricKeyParameter) gMSSPrivateKeyParameters);
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i) {
        byte[] bArr3;
        byte[] nextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.f6286K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        if (i == this.numLayer - 1) {
            bArr3 = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey();
        } else {
            this.currentRootSigs[i] = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getSignature(bArr);
            bArr3 = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i]).Verify(bArr, this.currentRootSigs[i]);
        }
        gMSSRootCalc.update(bArr3);
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        while (true) {
            int[] iArr = this.heightOfTrees;
            if (i4 >= (1 << iArr[i])) {
                break;
            }
            if (i4 == i2 && i3 < iArr[i] - this.f6286K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i3);
                i2 <<= 1;
                i3++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i4++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i) {
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.f6286K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i2 = 0;
        int i3 = 3;
        int i4 = 0;
        while (true) {
            int[] iArr = this.heightOfTrees;
            if (i2 >= (1 << iArr[i])) {
                break;
            }
            if (i2 == i3 && i4 < iArr[i] - this.f6286K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i4);
                i3 <<= 1;
                i4++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i2++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(new SecureRandom(), new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(int i, SecureRandom secureRandom) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters;
        if (i <= 10) {
            gMSSKeyGenerationParameters = new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2}));
        } else {
            gMSSKeyGenerationParameters = i <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2}));
        }
        initialize(gMSSKeyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.f6286K = this.gmssPS.getK();
        int i = this.numLayer;
        int[] iArr = new int[2];
        iArr[1] = this.mdLength;
        iArr[0] = i;
        this.currentSeeds = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i2 = this.numLayer;
        int[] iArr2 = new int[2];
        iArr2[1] = this.mdLength;
        iArr2[0] = i2 - 1;
        this.nextNextSeeds = (byte[][]) Array.newInstance(Byte.TYPE, iArr2);
        SecureRandom secureRandom = new SecureRandom();
        for (int i3 = 0; i3 < this.numLayer; i3++) {
            secureRandom.nextBytes(this.currentSeeds[i3]);
            this.gmssRandom.nextSeed(this.currentSeeds[i3]);
        }
        this.initialized = true;
    }
}
