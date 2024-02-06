package org.bouncycastle.crypto.digests;

import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

public class KeccakDigest implements ExtendedDigest {
    private static int[] KeccakRhoOffsets = keccakInitializeRhoOffsets();
    private static long[] KeccakRoundConstants = keccakInitializeRoundConstants();

    /* renamed from: C */
    long[] f5694C;
    protected int bitsAvailableForSqueezing;
    protected int bitsInQueue;
    long[] chiC;
    protected byte[] chunk;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected byte[] oneByte;
    protected int rate;
    protected boolean squeezing;
    protected byte[] state;
    long[] tempA;

    public KeccakDigest() {
        this(288);
    }

    public KeccakDigest(int i) {
        this.state = new byte[DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE];
        this.dataQueue = new byte[192];
        this.f5694C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        init(i);
    }

    public KeccakDigest(KeccakDigest keccakDigest) {
        byte[] bArr = new byte[DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE];
        this.state = bArr;
        this.dataQueue = new byte[192];
        this.f5694C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        byte[] bArr2 = keccakDigest.state;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = keccakDigest.dataQueue;
        System.arraycopy(bArr3, 0, this.dataQueue, 0, bArr3.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        this.bitsAvailableForSqueezing = keccakDigest.bitsAvailableForSqueezing;
        this.chunk = Arrays.clone(keccakDigest.chunk);
        this.oneByte = Arrays.clone(keccakDigest.oneByte);
    }

    private void KeccakAbsorb(byte[] bArr, byte[] bArr2, int i) {
        keccakPermutationAfterXor(bArr, bArr2, i);
    }

    private void KeccakExtract(byte[] bArr, byte[] bArr2, int i) {
        System.arraycopy(bArr, 0, bArr2, 0, i << 3);
    }

    private void KeccakExtract1024bits(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 128);
    }

    private static boolean LFSR86540(byte[] bArr) {
        boolean z = (bArr[0] & 1) != 0;
        if ((bArr[0] & ISOFileInfo.DATA_BYTES1) != 0) {
            bArr[0] = (byte) ((bArr[0] << 1) ^ 113);
        } else {
            bArr[0] = (byte) (bArr[0] << 1);
        }
        return z;
    }

    private void absorbQueue() {
        KeccakAbsorb(this.state, this.dataQueue, this.rate / 8);
        this.bitsInQueue = 0;
    }

    private void chi(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            int i2 = 0;
            while (i2 < 5) {
                int i3 = i * 5;
                int i4 = i2 + 1;
                this.chiC[i2] = jArr[i2 + i3] ^ ((~jArr[(i4 % 5) + i3]) & jArr[((i2 + 2) % 5) + i3]);
                i2 = i4;
            }
            for (int i5 = 0; i5 < 5; i5++) {
                jArr[(i * 5) + i5] = this.chiC[i5];
            }
        }
    }

    private void clearDataQueueSection(int i, int i2) {
        for (int i3 = i; i3 != i + i2; i3++) {
            this.dataQueue[i3] = 0;
        }
    }

    private void fromBytesToWords(long[] jArr, byte[] bArr) {
        for (int i = 0; i < 25; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                jArr[i] = jArr[i] | ((((long) bArr[(i << 3) + i2]) & 255) << (i2 << 3));
            }
        }
    }

    private void fromWordsToBytes(byte[] bArr, long[] jArr) {
        for (int i = 0; i < 25; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[(i << 3) + i2] = (byte) ((int) ((jArr[i] >>> (i2 << 3)) & 255));
            }
        }
    }

    private void init(int i) {
        int i2;
        if (i != 128) {
            int i3 = 512;
            if (i == 224) {
                i2 = 1152;
                i3 = 448;
            } else if (i == 256) {
                i2 = 1088;
            } else if (i == 288) {
                initSponge(1024, 576);
                return;
            } else if (i == 384) {
                i2 = 832;
                i3 = 768;
            } else if (i == 512) {
                initSponge(576, 1024);
                return;
            } else {
                throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
            }
            initSponge(i2, i3);
            return;
        }
        initSponge(1344, 256);
    }

    private void initSponge(int i, int i2) {
        if (i + i2 != 1600) {
            throw new IllegalStateException("rate + capacity != 1600");
        } else if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        } else {
            this.rate = i;
            Arrays.fill(this.state, (byte) 0);
            Arrays.fill(this.dataQueue, (byte) 0);
            this.bitsInQueue = 0;
            this.squeezing = false;
            this.bitsAvailableForSqueezing = 0;
            this.fixedOutputLength = i2 / 2;
            this.chunk = new byte[(i / 8)];
            this.oneByte = new byte[1];
        }
    }

    private void iota(long[] jArr, int i) {
        jArr[0] = jArr[0] ^ KeccakRoundConstants[i];
    }

    private static int[] keccakInitializeRhoOffsets() {
        int[] iArr = new int[25];
        iArr[0] = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i2 < 24) {
            int i4 = i2 + 1;
            iArr[(i3 % 5) + ((i % 5) * 5)] = (((i2 + 2) * i4) / 2) % 64;
            i3 = (i + 0) % 5;
            i = ((i3 << 1) + (i * 3)) % 5;
            i2 = i4;
        }
        return iArr;
    }

    private static long[] keccakInitializeRoundConstants() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i = 0; i < 24; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                if (LFSR86540(bArr)) {
                    jArr[i] = jArr[i] ^ (1 << ((1 << i2) - 1));
                }
            }
        }
        return jArr;
    }

    private void keccakPermutation(byte[] bArr) {
        long[] jArr = new long[(bArr.length / 8)];
        fromBytesToWords(jArr, bArr);
        keccakPermutationOnWords(jArr);
        fromWordsToBytes(bArr, jArr);
    }

    private void keccakPermutationAfterXor(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        keccakPermutation(bArr);
    }

    private void keccakPermutationOnWords(long[] jArr) {
        for (int i = 0; i < 24; i++) {
            theta(jArr);
            rho(jArr);
            m6193pi(jArr);
            chi(jArr);
            iota(jArr, i);
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        int i = this.bitsInQueue;
        int i2 = this.rate;
        if (i + 1 == i2) {
            byte[] bArr = this.dataQueue;
            int i3 = i / 8;
            bArr[i3] = (byte) ((1 << (i % 8)) | bArr[i3]);
            absorbQueue();
            clearDataQueueSection(0, this.rate / 8);
        } else {
            int i4 = (i + 7) / 8;
            clearDataQueueSection(i4, (i2 / 8) - i4);
            byte[] bArr2 = this.dataQueue;
            int i5 = this.bitsInQueue;
            int i6 = i5 / 8;
            bArr2[i6] = (byte) ((1 << (i5 % 8)) | bArr2[i6]);
        }
        byte[] bArr3 = this.dataQueue;
        int i7 = this.rate - 1;
        int i8 = i7 / 8;
        bArr3[i8] = (byte) ((1 << (i7 % 8)) | bArr3[i8]);
        absorbQueue();
        int i9 = this.rate;
        if (i9 == 1024) {
            KeccakExtract1024bits(this.state, this.dataQueue);
            this.bitsAvailableForSqueezing = 1024;
        } else {
            KeccakExtract(this.state, this.dataQueue, i9 / 64);
            this.bitsAvailableForSqueezing = this.rate;
        }
        this.squeezing = true;
    }

    /* renamed from: pi */
    private void m6193pi(long[] jArr) {
        long[] jArr2 = this.tempA;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                jArr[((((i << 1) + (i2 * 3)) % 5) * 5) + i2] = this.tempA[(i2 * 5) + i];
            }
        }
    }

    private void rho(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = (i2 * 5) + i;
                int[] iArr = KeccakRhoOffsets;
                jArr[i3] = iArr[i3] != 0 ? (jArr[i3] << iArr[i3]) ^ (jArr[i3] >>> (64 - iArr[i3])) : jArr[i3];
            }
        }
    }

    private void theta(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            this.f5694C[i] = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                long[] jArr2 = this.f5694C;
                jArr2[i] = jArr2[i] ^ jArr[(i2 * 5) + i];
            }
        }
        int i3 = 0;
        while (i3 < 5) {
            long[] jArr3 = this.f5694C;
            int i4 = i3 + 1;
            int i5 = i4 % 5;
            long j = jArr3[i5];
            long j2 = jArr3[i5];
            long j3 = jArr3[(i3 + 4) % 5];
            for (int i6 = 0; i6 < 5; i6++) {
                int i7 = (i6 * 5) + i3;
                jArr[i7] = jArr[i7] ^ (((j << 1) ^ (j2 >>> 63)) ^ j3);
            }
            i3 = i4;
        }
    }

    /* access modifiers changed from: protected */
    public void absorb(byte[] bArr, int i, long j) {
        byte[] bArr2 = bArr;
        int i2 = i;
        if (this.bitsInQueue % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        } else if (!this.squeezing) {
            long j2 = 0;
            while (j2 < j) {
                if (this.bitsInQueue == 0) {
                    long j3 = (long) this.rate;
                    if (j >= j3 && j2 <= j - j3) {
                        long j4 = (j - j2) / j3;
                        for (long j5 = 0; j5 < j4; j5++) {
                            byte[] bArr3 = this.chunk;
                            System.arraycopy(bArr2, (int) (((long) i2) + (j2 / 8) + (((long) bArr3.length) * j5)), bArr3, 0, bArr3.length);
                            byte[] bArr4 = this.state;
                            byte[] bArr5 = this.chunk;
                            KeccakAbsorb(bArr4, bArr5, bArr5.length);
                        }
                        j2 += j4 * ((long) this.rate);
                    }
                }
                int i3 = (int) (j - j2);
                int i4 = this.bitsInQueue;
                int i5 = this.rate;
                if (i3 + i4 > i5) {
                    i3 = i5 - i4;
                }
                int i6 = i3 % 8;
                int i7 = i3 - i6;
                System.arraycopy(bArr2, ((int) (j2 / 8)) + i2, this.dataQueue, this.bitsInQueue / 8, i7 / 8);
                int i8 = this.bitsInQueue + i7;
                this.bitsInQueue = i8;
                j2 += (long) i7;
                if (i8 == this.rate) {
                    absorbQueue();
                }
                if (i6 > 0) {
                    byte[] bArr6 = this.dataQueue;
                    int i9 = this.bitsInQueue;
                    bArr6[i9 / 8] = (byte) (bArr2[((int) (j2 / 8)) + i2] & ((1 << i6) - 1));
                    this.bitsInQueue = i9 + i6;
                    j2 += (long) i6;
                }
            }
        } else {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    public int doFinal(byte[] bArr, int i) {
        squeeze(bArr, i, (long) this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    /* access modifiers changed from: protected */
    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 > 0) {
            byte[] bArr2 = this.oneByte;
            bArr2[0] = b;
            absorb(bArr2, 0, (long) i2);
        }
        squeeze(bArr, i, (long) this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    public String getAlgorithmName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keccak-");
        sb.append(this.fixedOutputLength);
        return sb.toString();
    }

    public int getByteLength() {
        return this.rate / 8;
    }

    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    public void reset() {
        init(this.fixedOutputLength);
    }

    /* access modifiers changed from: protected */
    public void squeeze(byte[] bArr, int i, long j) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j2 = 0;
        if (j % 8 == 0) {
            while (j2 < j) {
                if (this.bitsAvailableForSqueezing == 0) {
                    keccakPermutation(this.state);
                    int i2 = this.rate;
                    if (i2 == 1024) {
                        KeccakExtract1024bits(this.state, this.dataQueue);
                        this.bitsAvailableForSqueezing = 1024;
                    } else {
                        KeccakExtract(this.state, this.dataQueue, i2 / 64);
                        this.bitsAvailableForSqueezing = this.rate;
                    }
                }
                int i3 = this.bitsAvailableForSqueezing;
                long j3 = j - j2;
                if (((long) i3) > j3) {
                    i3 = (int) j3;
                }
                System.arraycopy(this.dataQueue, (this.rate - this.bitsAvailableForSqueezing) / 8, bArr, ((int) (j2 / 8)) + i, i3 / 8);
                this.bitsAvailableForSqueezing -= i3;
                j2 += (long) i3;
            }
            return;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }

    public void update(byte b) {
        byte[] bArr = this.oneByte;
        bArr[0] = b;
        absorb(bArr, 0, 8);
    }

    public void update(byte[] bArr, int i, int i2) {
        absorb(bArr, i, ((long) i2) << 3);
    }
}
