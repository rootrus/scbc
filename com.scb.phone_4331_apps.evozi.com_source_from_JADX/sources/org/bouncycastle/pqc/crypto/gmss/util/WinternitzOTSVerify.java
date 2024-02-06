package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

public class WinternitzOTSVerify {
    private Digest messDigestOTS;

    /* renamed from: w */
    private int f6297w;

    public WinternitzOTSVerify(Digest digest, int i) {
        this.f6297w = i;
        this.messDigestOTS = digest;
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int digestSize = this.messDigestOTS.getDigestSize();
        int i3 = 0;
        this.messDigestOTS.update(bArr3, 0, bArr3.length);
        int digestSize2 = this.messDigestOTS.getDigestSize();
        byte[] bArr5 = new byte[digestSize2];
        this.messDigestOTS.doFinal(bArr5, 0);
        int i4 = digestSize << 3;
        int i5 = this.f6297w;
        int i6 = ((i5 - 1) + i4) / i5;
        int log = getLog((i6 << i5) + 1);
        int i7 = this.f6297w;
        int i8 = ((((log + i7) - 1) / i7) + i6) * digestSize;
        if (i8 != bArr4.length) {
            return null;
        }
        byte[] bArr6 = new byte[i8];
        int i9 = 8;
        if (8 % i7 == 0) {
            int i10 = 8 / i7;
            int i11 = (1 << i7) - 1;
            byte[] bArr7 = new byte[digestSize];
            int i12 = 0;
            byte b = 0;
            int i13 = 0;
            while (i12 < digestSize2) {
                while (i3 < i10) {
                    byte b2 = bArr5[i12] & i11;
                    b += b2;
                    int i14 = digestSize2;
                    int i15 = i13 * digestSize;
                    int i16 = i10;
                    System.arraycopy(bArr4, i15, bArr7, 0, digestSize);
                    int i17 = b2;
                    while (i17 < i11) {
                        this.messDigestOTS.update(bArr7, 0, bArr7.length);
                        bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr7, 0);
                        i17++;
                        byte[] bArr8 = bArr2;
                        b = b;
                        i8 = i8;
                    }
                    int i18 = i8;
                    int i19 = b;
                    System.arraycopy(bArr7, 0, bArr6, i15, digestSize);
                    bArr5[i12] = (byte) (bArr5[i12] >>> this.f6297w);
                    i13++;
                    i3++;
                    digestSize2 = i14;
                    bArr4 = bArr2;
                    i10 = i16;
                }
                int i20 = digestSize2;
                int i21 = i8;
                int i22 = i10;
                i12++;
                bArr4 = bArr2;
                i3 = 0;
            }
            i = i8;
            int i23 = (i6 << this.f6297w) - b;
            int i24 = 0;
            while (i24 < log) {
                int i25 = i13 * digestSize;
                System.arraycopy(bArr2, i25, bArr7, 0, digestSize);
                for (int i26 = i23 & i11; i26 < i11; i26++) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                System.arraycopy(bArr7, 0, bArr6, i25, digestSize);
                int i27 = this.f6297w;
                i23 >>>= i27;
                i13++;
                i24 += i27;
            }
        } else {
            i = i8;
            byte[] bArr9 = bArr4;
            if (i7 < 8) {
                int i28 = digestSize / i7;
                int i29 = (1 << i7) - 1;
                byte[] bArr10 = new byte[digestSize];
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i30 < i28) {
                    int i34 = 0;
                    long j = 0;
                    while (i34 < this.f6297w) {
                        j ^= (long) ((bArr5[i31] & 255) << (i34 << 3));
                        i31++;
                        i34++;
                        bArr10 = bArr10;
                    }
                    byte[] bArr11 = bArr10;
                    int i35 = 0;
                    while (i35 < i9) {
                        int i36 = i30;
                        int i37 = (int) (j & ((long) i29));
                        i32 += i37;
                        int i38 = i33 * digestSize;
                        System.arraycopy(bArr9, i38, bArr10, 0, digestSize);
                        while (true) {
                            int i39 = i28;
                            if (i37 >= i29) {
                                break;
                            }
                            this.messDigestOTS.update(bArr10, 0, bArr10.length);
                            bArr10 = new byte[this.messDigestOTS.getDigestSize()];
                            this.messDigestOTS.doFinal(bArr10, 0);
                            i37++;
                            i28 = i39;
                            i31 = i31;
                        }
                        int i40 = i31;
                        System.arraycopy(bArr10, 0, bArr6, i38, digestSize);
                        j >>>= this.f6297w;
                        i33++;
                        i35++;
                        i30 = i36;
                        i9 = 8;
                    }
                    int i41 = i28;
                    int i42 = i31;
                    i30++;
                    i9 = 8;
                }
                byte[] bArr12 = bArr10;
                int i43 = digestSize % this.f6297w;
                long j2 = 0;
                for (int i44 = 0; i44 < i43; i44++) {
                    j2 ^= (long) ((bArr5[i31] & 255) << (i44 << 3));
                    i31++;
                }
                byte[] bArr13 = bArr12;
                int i45 = 0;
                while (i45 < (i43 << 3)) {
                    int i46 = (int) (j2 & ((long) i29));
                    i32 += i46;
                    int i47 = i33 * digestSize;
                    System.arraycopy(bArr9, i47, bArr13, 0, digestSize);
                    while (i46 < i29) {
                        this.messDigestOTS.update(bArr13, 0, bArr13.length);
                        bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr13, 0);
                        i46++;
                    }
                    System.arraycopy(bArr13, 0, bArr6, i47, digestSize);
                    int i48 = this.f6297w;
                    j2 >>>= i48;
                    i33++;
                    i45 += i48;
                }
                int i49 = (i6 << this.f6297w) - i32;
                int i50 = 0;
                while (i50 < log) {
                    int i51 = i33 * digestSize;
                    System.arraycopy(bArr9, i51, bArr13, 0, digestSize);
                    for (int i52 = i49 & i29; i52 < i29; i52++) {
                        this.messDigestOTS.update(bArr13, 0, bArr13.length);
                        bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr13, 0);
                    }
                    System.arraycopy(bArr13, 0, bArr6, i51, digestSize);
                    int i53 = this.f6297w;
                    i49 >>>= i53;
                    i33++;
                    i50 += i53;
                }
            } else if (i7 < 57) {
                int i54 = i4 - i7;
                int i55 = (1 << i7) - 1;
                byte[] bArr14 = new byte[digestSize];
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                while (i57 <= i54) {
                    int i59 = i57 >>> 3;
                    int i60 = this.f6297w + i57;
                    int i61 = 0;
                    long j3 = 0;
                    while (true) {
                        i2 = i54;
                        if (i59 >= ((i60 + 7) >>> 3)) {
                            break;
                        }
                        j3 ^= (long) ((bArr5[i59] & 255) << (i61 << 3));
                        i61++;
                        i59++;
                        log = log;
                        i54 = i2;
                        i6 = i6;
                    }
                    int i62 = log;
                    int i63 = i6;
                    long j4 = (long) i55;
                    long j5 = (j3 >>> (i57 % 8)) & j4;
                    i56 = (int) (((long) i56) + j5);
                    int i64 = i58 * digestSize;
                    System.arraycopy(bArr9, i64, bArr14, 0, digestSize);
                    while (true) {
                        int i65 = i56;
                        if (j5 >= j4) {
                            break;
                        }
                        this.messDigestOTS.update(bArr14, 0, bArr14.length);
                        bArr14 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr14, 0);
                        j5++;
                        i56 = i65;
                        j4 = j4;
                    }
                    System.arraycopy(bArr14, 0, bArr6, i64, digestSize);
                    i58++;
                    i57 = i60;
                    log = i62;
                    i54 = i2;
                    i6 = i63;
                }
                int i66 = log;
                int i67 = i6;
                int i68 = i57 >>> 3;
                if (i68 < digestSize) {
                    int i69 = 0;
                    long j6 = 0;
                    while (i68 < digestSize) {
                        j6 ^= (long) ((bArr5[i68] & 255) << (i69 << 3));
                        i69++;
                        i68++;
                    }
                    long j7 = (long) i55;
                    long j8 = (j6 >>> (i57 % 8)) & j7;
                    i56 = (int) (((long) i56) + j8);
                    int i70 = i58 * digestSize;
                    System.arraycopy(bArr9, i70, bArr14, 0, digestSize);
                    while (j8 < j7) {
                        this.messDigestOTS.update(bArr14, 0, bArr14.length);
                        bArr14 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr14, 0);
                        j8++;
                    }
                    System.arraycopy(bArr14, 0, bArr6, i70, digestSize);
                    i58++;
                }
                int i71 = (i67 << this.f6297w) - i56;
                int i72 = i58;
                int i73 = i66;
                int i74 = 0;
                while (i74 < i73) {
                    int i75 = i72 * digestSize;
                    System.arraycopy(bArr9, i75, bArr14, 0, digestSize);
                    for (long j9 = (long) (i71 & i55); j9 < ((long) i55); j9++) {
                        this.messDigestOTS.update(bArr14, 0, bArr14.length);
                        bArr14 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr14, 0);
                    }
                    System.arraycopy(bArr14, 0, bArr6, i75, digestSize);
                    int i76 = this.f6297w;
                    i71 >>>= i76;
                    i72++;
                    i74 += i76;
                }
            }
        }
        this.messDigestOTS.update(bArr6, 0, i);
        byte[] bArr15 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr15, 0);
        return bArr15;
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

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = this.f6297w;
        int i2 = ((digestSize << 3) + (i - 1)) / i;
        int log = getLog((i2 << i) + 1);
        int i3 = this.f6297w;
        return digestSize * (i2 + (((log + i3) - 1) / i3));
    }
}
