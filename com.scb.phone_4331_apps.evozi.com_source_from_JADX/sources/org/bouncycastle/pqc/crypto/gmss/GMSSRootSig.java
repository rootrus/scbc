package org.bouncycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;

public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;

    /* renamed from: ii */
    private int f6293ii;

    /* renamed from: k */
    private int f6294k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* renamed from: r */
    private int f6295r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* renamed from: w */
    private int f6296w;

    public GMSSRootSig(Digest digest, int i, int i2) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        this.f6296w = i;
        this.height = i2;
        this.f6294k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i));
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.f6293ii = iArr[2];
        this.f6295r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f6296w = iArr[7];
        this.checksum = iArr[8];
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i = this.f6296w;
        this.f6294k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i));
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        this.test8 = (((long) (bArr[4][1] & 255)) << 8) | ((long) (bArr[4][0] & 255)) | (((long) (bArr[4][2] & 255)) << 16) | (((long) (bArr[4][3] & 255)) << 24) | (((long) (bArr[4][4] & 255)) << 32) | (((long) (bArr[4][5] & 255)) << 40) | (((long) (bArr[4][6] & 255)) << 48) | (((long) (bArr[4][7] & 255)) << 56);
        this.big8 = ((long) (bArr[4][8] & 255)) | (((long) (bArr[4][9] & 255)) << 8) | (((long) (bArr[4][10] & 255)) << 16) | (((long) (bArr[4][11] & 255)) << 24) | (((long) (bArr[4][12] & 255)) << 32) | (((long) (bArr[4][13] & 255)) << 40) | (((long) (bArr[4][14] & 255)) << 48) | (((long) (bArr[4][15] & 255)) << 56);
    }

    private void oneStep() {
        long j;
        int i;
        int i2 = this.f6296w;
        if (8 % i2 == 0) {
            int i3 = this.test;
            if (i3 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i4 = this.f6293ii;
                if (i4 < this.mdsize) {
                    byte[] bArr = this.hash;
                    this.test = bArr[i4] & this.f6294k;
                    bArr[i4] = (byte) (bArr[i4] >>> this.f6296w);
                } else {
                    int i5 = this.checksum;
                    this.test = this.f6294k & i5;
                    this.checksum = i5 >>> this.f6296w;
                }
            } else if (i3 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i6 = this.counter;
                int i7 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i6 * i7, i7);
                int i8 = this.counter + 1;
                this.counter = i8;
                if (i8 % (8 / this.f6296w) == 0) {
                    this.f6293ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 < 8) {
            int i9 = this.test;
            if (i9 == 0) {
                int i10 = this.counter;
                if (i10 % 8 == 0 && this.f6293ii < (i = this.mdsize)) {
                    this.big8 = 0;
                    if (i10 < ((i / i2) << 3)) {
                        for (int i11 = 0; i11 < this.f6296w; i11++) {
                            long j2 = this.big8;
                            byte[] bArr6 = this.hash;
                            int i12 = this.f6293ii;
                            this.big8 = j2 ^ ((long) ((bArr6[i12] & 255) << (i11 << 3)));
                            this.f6293ii = i12 + 1;
                        }
                    } else {
                        for (int i13 = 0; i13 < this.mdsize % this.f6296w; i13++) {
                            long j3 = this.big8;
                            byte[] bArr7 = this.hash;
                            int i14 = this.f6293ii;
                            this.big8 = j3 ^ ((long) ((bArr7[i14] & 255) << (i13 << 3)));
                            this.f6293ii = i14 + 1;
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = (long) this.checksum;
                }
                this.test = (int) (this.big8 & ((long) this.f6294k));
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i9 > 0) {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr8 = this.privateKeyOTS;
                digest2.update(bArr8, 0, bArr8.length);
                byte[] bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr9;
                this.messDigestOTS.doFinal(bArr9, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr10 = this.privateKeyOTS;
                byte[] bArr11 = this.sign;
                int i15 = this.counter;
                int i16 = this.mdsize;
                System.arraycopy(bArr10, 0, bArr11, i15 * i16, i16);
                this.big8 >>>= this.f6296w;
            } else {
                return;
            }
        } else if (i2 < 57) {
            int i17 = (this.test8 > 0 ? 1 : (this.test8 == 0 ? 0 : -1));
            if (i17 == 0) {
                this.big8 = 0;
                this.f6293ii = 0;
                int i18 = this.f6295r;
                int i19 = i18 >>> 3;
                int i20 = this.mdsize;
                if (i19 < i20) {
                    int i21 = (i20 << 3) - i2;
                    int i22 = i2 + i18;
                    this.f6295r = i22;
                    if (i18 <= i21) {
                        i20 = (i22 + 7) >>> 3;
                    }
                    while (true) {
                        j = this.big8;
                        if (i19 >= i20) {
                            break;
                        }
                        byte b = this.hash[i19];
                        int i23 = this.f6293ii;
                        this.big8 = j ^ ((long) ((b & 255) << (i23 << 3)));
                        this.f6293ii = i23 + 1;
                        i19++;
                    }
                    long j4 = j >>> (i18 % 8);
                    this.big8 = j4;
                    this.test8 = j4 & ((long) this.f6294k);
                } else {
                    int i24 = this.checksum;
                    this.test8 = (long) (this.f6294k & i24);
                    this.checksum = i24 >>> i2;
                }
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i17 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test8--;
            }
            if (this.test8 == 0) {
                byte[] bArr14 = this.privateKeyOTS;
                byte[] bArr15 = this.sign;
                int i25 = this.counter;
                int i26 = this.mdsize;
                System.arraycopy(bArr14, 0, bArr15, i25 * i26, i26);
            } else {
                return;
            }
        } else {
            return;
        }
        this.counter++;
    }

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public byte[] getSig() {
        return this.sign;
    }

    public byte[][] getStatByte() {
        int[] iArr = new int[2];
        iArr[1] = this.mdsize;
        iArr[0] = 5;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.f6293ii, this.f6295r, this.steps, this.keysize, this.height, this.f6296w, this.checksum};
    }

    public byte[] getStatLong() {
        long j = this.test8;
        long j2 = this.big8;
        return new byte[]{(byte) ((int) (j & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 24) & 255)), (byte) ((int) ((j >> 32) & 255)), (byte) ((int) ((j >> 40) & 255)), (byte) ((int) ((j >> 48) & 255)), (byte) ((int) ((j >> 56) & 255)), (byte) ((int) (j2 & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), (byte) ((int) ((j2 >> 32) & 255)), (byte) ((int) ((j2 >> 40) & 255)), (byte) ((int) ((j2 >> 48) & 255)), (byte) ((int) ((j2 >> 56) & 255))};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        byte[] bArr3 = bArr2;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr3, 0, bArr3.length);
        byte[] bArr4 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr4;
        this.messDigestOTS.doFinal(bArr4, 0);
        int i3 = this.mdsize;
        byte[] bArr5 = new byte[i3];
        System.arraycopy(this.hash, 0, bArr5, 0, i3);
        int log = getLog((this.messagesize << this.f6296w) + 1);
        int i4 = this.f6296w;
        int i5 = 8;
        if (8 % i4 == 0) {
            int i6 = 8 / i4;
            i = 0;
            for (int i7 = 0; i7 < this.mdsize; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    i += bArr5[i7] & this.f6294k;
                    bArr5[i7] = (byte) (bArr5[i7] >>> this.f6296w);
                }
            }
            int i9 = (this.messagesize << this.f6296w) - i;
            this.checksum = i9;
            int i10 = 0;
            while (i10 < log) {
                i += this.f6294k & i9;
                int i11 = this.f6296w;
                i9 >>>= i11;
                i10 += i11;
            }
        } else if (i4 < 8) {
            int i12 = this.mdsize / i4;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < i12) {
                long j = 0;
                for (int i16 = 0; i16 < this.f6296w; i16++) {
                    j ^= (long) ((bArr5[i14] & 255) << (i16 << 3));
                    i14++;
                }
                int i17 = 0;
                while (i17 < i5) {
                    i15 += (int) (((long) this.f6294k) & j);
                    j >>>= this.f6296w;
                    i17++;
                    i12 = i12;
                    i5 = 8;
                }
                int i18 = i12;
                i13++;
                i5 = 8;
            }
            int i19 = this.mdsize % this.f6296w;
            long j2 = 0;
            for (int i20 = 0; i20 < i19; i20++) {
                j2 ^= (long) ((bArr5[i14] & 255) << (i20 << 3));
                i14++;
            }
            int i21 = 0;
            while (i21 < (i19 << 3)) {
                i15 += (int) (((long) this.f6294k) & j2);
                int i22 = this.f6296w;
                j2 >>>= i22;
                i21 += i22;
            }
            int i23 = (this.messagesize << this.f6296w) - i15;
            this.checksum = i23;
            int i24 = 0;
            int i25 = i15;
            while (i24 < log) {
                i25 = i + (this.f6294k & i23);
                int i26 = this.f6296w;
                i23 >>>= i26;
                i24 += i26;
            }
        } else if (i4 < 57) {
            int i27 = 0;
            int i28 = 0;
            while (true) {
                i2 = this.mdsize;
                int i29 = this.f6296w;
                if (i27 > (i2 << 3) - i29) {
                    break;
                }
                int i30 = i29 + i27;
                int i31 = 0;
                long j3 = 0;
                for (int i32 = i27 >>> 3; i32 < ((i30 + 7) >>> 3); i32++) {
                    j3 ^= (long) ((bArr5[i32] & 255) << (i31 << 3));
                    i31++;
                }
                i28 = (int) (((long) i28) + ((j3 >>> (i27 % 8)) & ((long) this.f6294k)));
                i27 = i30;
            }
            int i33 = i27 >>> 3;
            if (i33 < i2) {
                int i34 = 0;
                long j4 = 0;
                while (i33 < this.mdsize) {
                    j4 ^= (long) ((bArr5[i33] & 255) << (i34 << 3));
                    i34++;
                    i33++;
                }
                i28 = (int) (((long) i28) + ((j4 >>> (i27 % 8)) & ((long) this.f6294k)));
            }
            int i35 = (this.messagesize << this.f6296w) - i28;
            this.checksum = i35;
            int i36 = 0;
            int i37 = i28;
            while (i36 < log) {
                i37 = i + (this.f6294k & i35);
                int i38 = this.f6296w;
                i35 >>>= i38;
                i36 += i38;
            }
        } else {
            i = 0;
        }
        int ceil = this.messagesize + ((int) Math.ceil(((double) log) / ((double) this.f6296w)));
        this.keysize = ceil;
        this.steps = (int) Math.ceil(((double) (ceil + i)) / ((double) (1 << this.height)));
        int i39 = this.keysize;
        int i40 = this.mdsize;
        this.sign = new byte[(i39 * i40)];
        this.counter = 0;
        this.test = 0;
        this.f6293ii = 0;
        this.test8 = 0;
        this.f6295r = 0;
        this.privateKeyOTS = new byte[i40];
        byte[] bArr6 = new byte[i40];
        this.seed = bArr6;
        System.arraycopy(bArr, 0, bArr6, 0, i40);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.big8);
        sb.append("  ");
        String obj = sb.toString();
        int[] statInt = getStatInt();
        int[] iArr = new int[2];
        iArr[1] = this.mdsize;
        iArr[0] = 5;
        Array.newInstance(Byte.TYPE, iArr);
        byte[][] statByte = getStatByte();
        for (int i = 0; i < 9; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(statInt[i]);
            sb2.append(" ");
            obj = sb2.toString();
        }
        for (int i2 = 0; i2 < 5; i2++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(new String(Hex.encode(statByte[i2])));
            sb3.append(" ");
            obj = sb3.toString();
        }
        return obj;
    }

    public boolean updateSign() {
        for (int i = 0; i < this.steps; i++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }
}
