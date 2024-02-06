package org.bouncycastle.crypto.macs;

import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* renamed from: h0 */
    private int f5954h0;

    /* renamed from: h1 */
    private int f5955h1;

    /* renamed from: h2 */
    private int f5956h2;

    /* renamed from: h3 */
    private int f5957h3;

    /* renamed from: h4 */
    private int f5958h4;

    /* renamed from: k0 */
    private int f5959k0;

    /* renamed from: k1 */
    private int f5960k1;

    /* renamed from: k2 */
    private int f5961k2;

    /* renamed from: k3 */
    private int f5962k3;

    /* renamed from: r0 */
    private int f5963r0;

    /* renamed from: r1 */
    private int f5964r1;

    /* renamed from: r2 */
    private int f5965r2;

    /* renamed from: r3 */
    private int f5966r3;

    /* renamed from: r4 */
    private int f5967r4;

    /* renamed from: s1 */
    private int f5968s1;

    /* renamed from: s2 */
    private int f5969s2;

    /* renamed from: s3 */
    private int f5970s3;

    /* renamed from: s4 */
    private int f5971s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() == 16) {
            this.cipher = blockCipher;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }

    private static final long mul32x32_64(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.currentBlock[i2] = 0;
            }
        }
        long littleEndianToInt = ((long) Pack.littleEndianToInt(this.currentBlock, 0)) & 4294967295L;
        long littleEndianToInt2 = ((long) Pack.littleEndianToInt(this.currentBlock, 4)) & 4294967295L;
        long littleEndianToInt3 = ((long) Pack.littleEndianToInt(this.currentBlock, 8)) & 4294967295L;
        long littleEndianToInt4 = 4294967295L & ((long) Pack.littleEndianToInt(this.currentBlock, 12));
        this.f5954h0 = (int) (((long) this.f5954h0) + (littleEndianToInt & 67108863));
        this.f5955h1 = (int) (((long) this.f5955h1) + ((((littleEndianToInt2 << 32) | littleEndianToInt) >>> 26) & 67108863));
        this.f5956h2 = (int) (((long) this.f5956h2) + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f5957h3 = (int) (((long) this.f5957h3) + ((((littleEndianToInt4 << 32) | littleEndianToInt3) >>> 14) & 67108863));
        int i3 = (int) (((long) this.f5958h4) + (littleEndianToInt4 >>> 8));
        this.f5958h4 = i3;
        if (this.currentBlockOffset == 16) {
            this.f5958h4 = i3 + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        long mul32x32_64 = mul32x32_64(this.f5954h0, this.f5963r0) + mul32x32_64(this.f5955h1, this.f5971s4) + mul32x32_64(this.f5956h2, this.f5970s3) + mul32x32_64(this.f5957h3, this.f5969s2) + mul32x32_64(this.f5958h4, this.f5968s1);
        long mul32x32_642 = mul32x32_64(this.f5954h0, this.f5964r1);
        long mul32x32_643 = mul32x32_64(this.f5955h1, this.f5963r0);
        long mul32x32_644 = mul32x32_64(this.f5956h2, this.f5971s4);
        long mul32x32_645 = mul32x32_64(this.f5957h3, this.f5970s3);
        long mul32x32_646 = mul32x32_64(this.f5958h4, this.f5969s2);
        long mul32x32_647 = mul32x32_64(this.f5954h0, this.f5965r2);
        long mul32x32_648 = mul32x32_64(this.f5955h1, this.f5964r1);
        long mul32x32_649 = mul32x32_64(this.f5956h2, this.f5963r0);
        long mul32x32_6410 = mul32x32_64(this.f5957h3, this.f5971s4);
        long mul32x32_6411 = mul32x32_64(this.f5958h4, this.f5970s3);
        long mul32x32_6412 = mul32x32_64(this.f5954h0, this.f5966r3);
        long mul32x32_6413 = mul32x32_64(this.f5955h1, this.f5965r2);
        long mul32x32_6414 = mul32x32_64(this.f5956h2, this.f5964r1);
        long mul32x32_6415 = mul32x32_64(this.f5957h3, this.f5963r0);
        long mul32x32_6416 = mul32x32_64(this.f5958h4, this.f5971s4);
        long mul32x32_6417 = mul32x32_64(this.f5954h0, this.f5967r4);
        long mul32x32_6418 = mul32x32_64(this.f5955h1, this.f5966r3);
        long mul32x32_6419 = mul32x32_64(this.f5956h2, this.f5965r2);
        long mul32x32_6420 = mul32x32_64(this.f5957h3, this.f5964r1);
        long mul32x32_6421 = mul32x32_64(this.f5958h4, this.f5963r0);
        int i4 = ((int) mul32x32_64) & 67108863;
        this.f5954h0 = i4;
        long j = mul32x32_642 + mul32x32_643 + mul32x32_644 + mul32x32_645 + mul32x32_646 + (mul32x32_64 >>> 26);
        int i5 = ((int) j) & 67108863;
        this.f5955h1 = i5;
        long j2 = mul32x32_647 + mul32x32_648 + mul32x32_649 + mul32x32_6410 + mul32x32_6411 + (j >>> 26);
        this.f5956h2 = ((int) j2) & 67108863;
        long j3 = mul32x32_6412 + mul32x32_6413 + mul32x32_6414 + mul32x32_6415 + mul32x32_6416 + (j2 >>> 26);
        this.f5957h3 = ((int) j3) & 67108863;
        long j4 = mul32x32_6417 + mul32x32_6418 + mul32x32_6419 + mul32x32_6420 + mul32x32_6421 + (j3 >>> 26);
        this.f5958h4 = ((int) j4) & 67108863;
        int i6 = i4 + (((int) (j4 >>> 26)) * 5);
        this.f5954h0 = i6;
        this.f5955h1 = i5 + (i6 >>> 26);
        this.f5954h0 = i6 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i = 16;
            if (this.cipher == null || (bArr2 != null && bArr2.length == 16)) {
                int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
                int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
                int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
                int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
                this.f5963r0 = 67108863 & littleEndianToInt;
                int i2 = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
                this.f5964r1 = i2;
                int i3 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
                this.f5965r2 = i3;
                int i4 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
                this.f5966r3 = i4;
                int i5 = (littleEndianToInt4 >>> 8) & 1048575;
                this.f5967r4 = i5;
                this.f5968s1 = i2 * 5;
                this.f5969s2 = i3 * 5;
                this.f5970s3 = i4 * 5;
                this.f5971s4 = i5 * 5;
                BlockCipher blockCipher = this.cipher;
                if (blockCipher != null) {
                    byte[] bArr3 = new byte[16];
                    blockCipher.init(true, new KeyParameter(bArr, 16, 16));
                    this.cipher.processBlock(bArr2, 0, bArr3, 0);
                    i = 0;
                    bArr = bArr3;
                }
                this.f5959k0 = Pack.littleEndianToInt(bArr, i);
                this.f5960k1 = Pack.littleEndianToInt(bArr, i + 4);
                this.f5961k2 = Pack.littleEndianToInt(bArr, i + 8);
                this.f5962k3 = Pack.littleEndianToInt(bArr, i + 12);
                return;
            }
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        byte[] bArr2 = bArr;
        int i2 = i;
        if (i2 + 16 <= bArr2.length) {
            if (this.currentBlockOffset > 0) {
                processBlock();
            }
            int i3 = this.f5955h1;
            int i4 = this.f5954h0;
            int i5 = i3 + (i4 >>> 26);
            this.f5955h1 = i5;
            int i6 = i4 & 67108863;
            this.f5954h0 = i6;
            int i7 = this.f5956h2 + (i5 >>> 26);
            this.f5956h2 = i7;
            int i8 = i5 & 67108863;
            this.f5955h1 = i8;
            int i9 = this.f5957h3 + (i7 >>> 26);
            this.f5957h3 = i9;
            int i10 = i7 & 67108863;
            this.f5956h2 = i10;
            int i11 = this.f5958h4 + (i9 >>> 26);
            this.f5958h4 = i11;
            int i12 = i9 & 67108863;
            this.f5957h3 = i12;
            int i13 = i6 + ((i11 >>> 26) * 5);
            this.f5954h0 = i13;
            int i14 = i11 & 67108863;
            this.f5958h4 = i14;
            int i15 = i8 + (i13 >>> 26);
            this.f5955h1 = i15;
            int i16 = i13 & 67108863;
            this.f5954h0 = i16;
            int i17 = i16 + 5;
            int i18 = (i17 >>> 26) + i15;
            int i19 = (i18 >>> 26) + i10;
            int i20 = (i19 >>> 26) + i12;
            int i21 = ((i20 >>> 26) + i14) - 67108864;
            int i22 = (i21 >>> 31) - 1;
            int i23 = ~i22;
            int i24 = (i16 & i23) | (i17 & 67108863 & i22);
            this.f5954h0 = i24;
            int i25 = (i15 & i23) | (i18 & 67108863 & i22);
            this.f5955h1 = i25;
            int i26 = (i10 & i23) | (i19 & 67108863 & i22);
            this.f5956h2 = i26;
            int i27 = (67108863 & i20 & i22) | (i12 & i23);
            this.f5957h3 = i27;
            int i28 = (i14 & i23) | (i21 & i22);
            this.f5958h4 = i28;
            long j = (((long) (i24 | (i25 << 26))) & 4294967295L) + (((long) this.f5959k0) & 4294967295L);
            long j2 = (long) ((i26 >>> 12) | (i27 << 14));
            long j3 = (long) this.f5961k2;
            long j4 = (long) ((i27 >>> 18) | (i28 << 8));
            long j5 = (long) this.f5962k3;
            Pack.intToLittleEndian((int) j, bArr2, i2);
            long j6 = (((long) ((i25 >>> 6) | (i26 << 20))) & 4294967295L) + (((long) this.f5960k1) & 4294967295L) + (j >>> 32);
            Pack.intToLittleEndian((int) j6, bArr2, i2 + 4);
            long j7 = (j2 & 4294967295L) + (j3 & 4294967295L) + (j6 >>> 32);
            Pack.intToLittleEndian((int) j7, bArr2, i2 + 8);
            Pack.intToLittleEndian((int) ((j4 & 4294967295L) + (j5 & 4294967295L) + (j7 >>> 32)), bArr2, i2 + 12);
            reset();
            return 16;
        }
        throw new DataLengthException("Output buffer is too short.");
    }

    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Poly1305-");
        sb.append(this.cipher.getAlgorithmName());
        return sb.toString();
    }

    public int getMacSize() {
        return 16;
    }

    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] bArr;
        if (this.cipher == null) {
            bArr = null;
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        }
        if (cipherParameters instanceof KeyParameter) {
            setKey(((KeyParameter) cipherParameters).getKey(), bArr);
            reset();
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    public void reset() {
        this.currentBlockOffset = 0;
        this.f5958h4 = 0;
        this.f5957h3 = 0;
        this.f5956h2 = 0;
        this.f5955h1 = 0;
        this.f5954h0 = 0;
    }

    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i3 + i, this.currentBlock, this.currentBlockOffset, min);
            i3 += min;
            this.currentBlockOffset += min;
        }
    }
}
