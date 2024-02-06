package org.bouncycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;

public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* renamed from: w */
    private int f6298w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i) {
        this.f6298w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d = (double) i;
        int ceil = (int) Math.ceil(((double) (digestSize << 3)) / d);
        this.messagesize = ceil;
        int log = getLog((ceil << i) + 1);
        this.checksumsize = log;
        int ceil2 = this.messagesize + ((int) Math.ceil(((double) log) / d));
        this.keysize = ceil2;
        int[] iArr = new int[2];
        iArr[1] = this.mdsize;
        iArr[0] = ceil2;
        this.privateKeyOTS = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i2 = this.mdsize;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        for (int i3 = 0; i3 < this.keysize; i3++) {
            this.privateKeyOTS[i3] = this.gmssRandom.nextSeed(bArr2);
        }
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

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i = this.keysize * this.mdsize;
        byte[] bArr = new byte[i];
        int i2 = this.f6298w;
        for (int i3 = 0; i3 < this.keysize; i3++) {
            Digest digest = this.messDigestOTS;
            byte[][] bArr2 = this.privateKeyOTS;
            digest.update(bArr2[i3], 0, bArr2[i3].length);
            byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
            this.messDigestOTS.doFinal(bArr3, 0);
            for (int i4 = 2; i4 < (1 << i2); i4++) {
                this.messDigestOTS.update(bArr3, 0, bArr3.length);
                bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(bArr3, 0);
            }
            int i5 = this.mdsize;
            System.arraycopy(bArr3, 0, bArr, i5 * i3, i5);
        }
        this.messDigestOTS.update(bArr, 0, i);
        byte[] bArr4 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr4, 0);
        return bArr4;
    }

    public byte[] getSignature(byte[] bArr) {
        int i;
        byte[] bArr2 = bArr;
        byte[] bArr3 = new byte[(this.keysize * this.mdsize)];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i2 = this.f6298w;
        int i3 = 8;
        if (8 % i2 == 0) {
            int i4 = 8 / i2;
            int i5 = (1 << i2) - 1;
            byte[] bArr5 = new byte[this.mdsize];
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < digestSize; i8++) {
                for (int i9 = 0; i9 < i4; i9++) {
                    int i10 = bArr4[i8] & i5;
                    i6 += i10;
                    System.arraycopy(this.privateKeyOTS[i7], 0, bArr5, 0, this.mdsize);
                    while (i10 > 0) {
                        this.messDigestOTS.update(bArr5, 0, bArr5.length);
                        bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr5, 0);
                        i10--;
                    }
                    int i11 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr3, i7 * i11, i11);
                    bArr4[i8] = (byte) (bArr4[i8] >>> this.f6298w);
                    i7++;
                }
            }
            int i12 = (this.messagesize << this.f6298w) - i6;
            int i13 = 0;
            while (i13 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i7], 0, bArr5, 0, this.mdsize);
                for (int i14 = i12 & i5; i14 > 0; i14--) {
                    this.messDigestOTS.update(bArr5, 0, bArr5.length);
                    bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                int i15 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr3, i7 * i15, i15);
                int i16 = this.f6298w;
                i12 >>>= i16;
                i7++;
                i13 += i16;
            }
        } else if (i2 < 8) {
            int i17 = this.mdsize;
            int i18 = i17 / i2;
            int i19 = (1 << i2) - 1;
            byte[] bArr6 = new byte[i17];
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i20 < i18) {
                long j = 0;
                for (int i24 = 0; i24 < this.f6298w; i24++) {
                    j ^= (long) ((bArr4[i21] & 255) << (i24 << 3));
                    i21++;
                }
                int i25 = 0;
                while (true) {
                    int i26 = i18;
                    if (i25 >= i3) {
                        break;
                    }
                    int i27 = (int) (j & ((long) i19));
                    i22 += i27;
                    System.arraycopy(this.privateKeyOTS[i23], 0, bArr6, 0, this.mdsize);
                    while (i27 > 0) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i27--;
                    }
                    int i28 = this.mdsize;
                    System.arraycopy(bArr6, 0, bArr3, i23 * i28, i28);
                    j >>>= this.f6298w;
                    i23++;
                    i25++;
                    i18 = i26;
                    i3 = 8;
                }
                i20++;
                i3 = 8;
            }
            int i29 = this.mdsize % this.f6298w;
            int i30 = 0;
            long j2 = 0;
            while (i30 < i29) {
                j2 ^= (long) ((bArr4[i21] & 255) << (i30 << 3));
                i21++;
                i30++;
                i29 = i29;
            }
            int i31 = i29;
            int i32 = 0;
            while (i32 < (i31 << 3)) {
                int i33 = (int) (((long) i19) & j2);
                i22 += i33;
                System.arraycopy(this.privateKeyOTS[i23], 0, bArr6, 0, this.mdsize);
                while (i33 > 0) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                    i33--;
                }
                int i34 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr3, i23 * i34, i34);
                int i35 = this.f6298w;
                j2 >>>= i35;
                i23++;
                i32 += i35;
            }
            int i36 = (this.messagesize << this.f6298w) - i22;
            int i37 = 0;
            while (i37 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i23], 0, bArr6, 0, this.mdsize);
                for (int i38 = i36 & i19; i38 > 0; i38--) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                int i39 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr3, i23 * i39, i39);
                int i40 = this.f6298w;
                i36 >>>= i40;
                i23++;
                i37 += i40;
            }
        } else if (i2 < 57) {
            int i41 = this.mdsize;
            int i42 = (1 << i2) - 1;
            byte[] bArr7 = new byte[i41];
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            while (i45 <= (i41 << 3) - i2) {
                int i46 = this.f6298w + i45;
                int i47 = 0;
                long j3 = 0;
                for (int i48 = i45 >>> 3; i48 < ((i46 + 7) >>> 3); i48++) {
                    j3 ^= (long) ((bArr4[i48] & 255) << (i47 << 3));
                    i47++;
                }
                long j4 = (j3 >>> (i45 % 8)) & ((long) i42);
                i43 = (int) (((long) i43) + j4);
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr7, 0, this.mdsize);
                while (j4 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j4--;
                }
                int i49 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr3, i44 * i49, i49);
                i44++;
                i45 = i46;
            }
            int i50 = i45 >>> 3;
            if (i50 < this.mdsize) {
                int i51 = 0;
                long j5 = 0;
                while (true) {
                    i = this.mdsize;
                    if (i50 >= i) {
                        break;
                    }
                    j5 ^= (long) ((bArr4[i50] & 255) << (i51 << 3));
                    i51++;
                    i50++;
                }
                long j6 = (j5 >>> (i45 % 8)) & ((long) i42);
                i43 = (int) (((long) i43) + j6);
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr7, 0, i);
                while (j6 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j6--;
                }
                int i52 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr3, i44 * i52, i52);
                i44++;
            }
            int i53 = (this.messagesize << this.f6298w) - i43;
            int i54 = 0;
            while (i54 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr7, 0, this.mdsize);
                for (long j7 = (long) (i53 & i42); j7 > 0; j7--) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                int i55 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr3, i44 * i55, i55);
                int i56 = this.f6298w;
                i53 >>>= i56;
                i44++;
                i54 += i56;
            }
        }
        return bArr3;
    }
}
