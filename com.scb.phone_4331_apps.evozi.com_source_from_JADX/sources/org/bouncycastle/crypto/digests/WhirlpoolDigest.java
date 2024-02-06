package org.bouncycastle.crypto.digests;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;

public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;

    /* renamed from: C0 */
    private static final long[] f5792C0 = new long[256];

    /* renamed from: C1 */
    private static final long[] f5793C1 = new long[256];

    /* renamed from: C2 */
    private static final long[] f5794C2 = new long[256];

    /* renamed from: C3 */
    private static final long[] f5795C3 = new long[256];

    /* renamed from: C4 */
    private static final long[] f5796C4 = new long[256];

    /* renamed from: C5 */
    private static final long[] f5797C5 = new long[256];

    /* renamed from: C6 */
    private static final long[] f5798C6 = new long[256];

    /* renamed from: C7 */
    private static final long[] f5799C7 = new long[256];
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private static final int[] SBOX = {24, 35, 198, 232, 135, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 1, 79, 54, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 210, 245, 121, 111, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 82, 96, 188, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, 142, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 12, EACTags.SECURITY_ENVIRONMENT_TEMPLATE, 53, 29, PassportService.DEFAULT_MAX_BLOCKSIZE, 215, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 46, 75, 254, 87, 21, 119, 55, 229, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, 240, 74, 218, 88, 201, 41, 10, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 160, 107, 133, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 125, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, 216, 251, 238, EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE, 102, 221, 23, 71, 158, 202, 45, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 7, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 90, 131, 51, 99, 2, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 113, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 25, 73, 217, 242, 227, 91, 136, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 38, 50, CipherSuite.TLS_PSK_WITH_NULL_SHA256, 233, 15, 213, 128, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 205, 52, 72, 255, 122, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 95, 32, 104, 26, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 84, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 34, 100, 241, 115, 18, 64, 8, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 236, 219, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 141, 61, 151, 0, 207, 43, 118, ISO781611.BIOMETRIC_SUBTYPE_TAG, ModuleDescriptor.MODULE_VERSION, 27, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 106, 80, 69, 243, 48, 239, 63, 85, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 234, 101, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 47, 192, 222, 28, 253, 77, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 117, 6, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 230, 14, 31, 98, 212, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, 249, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 37, 89, 132, 114, 57, 76, 94, 120, 56, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, 209, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, 226, 97, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 33, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 206, 17, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 78, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 235, 60, 129, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 247, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 19, 44, Primes.SMALL_FACTOR_LIMIT, 231, 110, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 3, 86, 68, 127, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 42, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 83, 220, 11, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 108, 49, 116, 246, 70, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 20, 225, 22, 58, 105, 9, 112, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 208, 237, 204, 66, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 40, 92, 248, 134};

    /* renamed from: _K */
    private long[] f5800_K = new long[8];

    /* renamed from: _L */
    private long[] f5801_L = new long[8];
    private short[] _bitCount = new short[32];
    private long[] _block = new long[8];
    private byte[] _buffer = new byte[64];
    private int _bufferPos = 0;
    private long[] _hash = new long[8];
    private final long[] _rc = new long[11];
    private long[] _state = new long[8];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    public WhirlpoolDigest() {
        for (int i = 0; i < 256; i++) {
            int i2 = SBOX[i];
            int maskWithReductionPolynomial = maskWithReductionPolynomial(i2 << 1);
            int maskWithReductionPolynomial2 = maskWithReductionPolynomial(maskWithReductionPolynomial << 1);
            int i3 = maskWithReductionPolynomial2 ^ i2;
            int maskWithReductionPolynomial3 = maskWithReductionPolynomial(maskWithReductionPolynomial2 << 1);
            int i4 = maskWithReductionPolynomial3 ^ i2;
            int i5 = i2;
            f5792C0[i] = packIntoLong(i2, i5, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4);
            int i6 = i2;
            f5793C1[i] = packIntoLong(i4, i5, i6, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial);
            int i7 = i2;
            f5794C2[i] = packIntoLong(maskWithReductionPolynomial, i4, i6, i7, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3);
            int i8 = i2;
            f5795C3[i] = packIntoLong(i3, maskWithReductionPolynomial, i4, i7, i8, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3);
            int i9 = i2;
            f5796C4[i] = packIntoLong(maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i8, i9, maskWithReductionPolynomial2, i2);
            int i10 = i2;
            f5797C5[i] = packIntoLong(i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i9, i10, maskWithReductionPolynomial2);
            int i11 = i2;
            f5798C6[i] = packIntoLong(maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i10, i11);
            f5799C7[i] = packIntoLong(i2, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i11);
        }
        this._rc[0] = 0;
        for (int i12 = 1; i12 <= 10; i12++) {
            int i13 = (i12 - 1) << 3;
            this._rc[i12] = (((((((f5792C0[i13] & -72057594037927936L) ^ (f5793C1[i13 + 1] & 71776119061217280L)) ^ (f5794C2[i13 + 2] & 280375465082880L)) ^ (f5795C3[i13 + 3] & 1095216660480L)) ^ (f5796C4[i13 + 4] & 4278190080L)) ^ (f5797C5[i13 + 5] & 16711680)) ^ (f5798C6[i13 + 6] & 65280)) ^ (f5799C7[i13 + 7] & 255);
        }
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        reset(whirlpoolDigest);
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i) {
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
    }

    private void convertLongToByteArray(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) ((int) ((j >> (56 - (i2 << 3))) & 255));
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) this._bitCount[i];
        }
        return bArr;
    }

    private void finish() {
        byte[] copyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        int i2 = i + 1;
        this._bufferPos = i2;
        bArr[i] = (byte) (bArr[i] | ISOFileInfo.DATA_BYTES1);
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(copyBitLength, 0, this._buffer, 32, copyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i2 = (sArr[length] & 255) + EIGHT[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i) {
        return ((long) i) >= 256 ? i ^ REDUCTION_POLYNOMIAL : i;
    }

    private long packIntoLong(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((((long) i2) << 48) ^ (((long) i) << 56)) ^ (((long) i3) << 40)) ^ (((long) i4) << 32)) ^ (((long) i5) << 24)) ^ (((long) i6) << 16)) ^ (((long) i7) << 8)) ^ ((long) i8);
    }

    private void processFilledBuffer(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this._state.length; i2++) {
            this._block[i2] = bytesToLongFromBuffer(this._buffer, i2 << 3);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    public final Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    public final int doFinal(byte[] bArr, int i) {
        finish();
        for (int i2 = 0; i2 < 8; i2++) {
            convertLongToByteArray(this._hash[i2], bArr, (i2 << 3) + i);
        }
        reset();
        return getDigestSize();
    }

    public final String getAlgorithmName() {
        return "Whirlpool";
    }

    public final int getByteLength() {
        return 64;
    }

    public final int getDigestSize() {
        return 64;
    }

    /* access modifiers changed from: protected */
    public final void processBlock() {
        long[] jArr;
        for (int i = 0; i < 8; i++) {
            long[] jArr2 = this._state;
            long j = this._block[i];
            long[] jArr3 = this.f5800_K;
            long j2 = this._hash[i];
            jArr3[i] = j2;
            jArr2[i] = j ^ j2;
        }
        int i2 = 1;
        while (i2 <= 10) {
            int i3 = 0;
            while (i3 < 8) {
                long[] jArr4 = this.f5801_L;
                jArr4[i3] = 0;
                long j3 = jArr4[i3];
                long[] jArr5 = f5792C0;
                long[] jArr6 = this.f5800_K;
                jArr4[i3] = jArr5[((int) (jArr6[i3 & 7] >>> 56)) & 255] ^ j3;
                jArr4[i3] = jArr4[i3] ^ f5793C1[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255];
                jArr4[i3] = jArr4[i3] ^ f5794C2[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                jArr4[i3] = jArr4[i3] ^ f5795C3[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                jArr4[i3] = jArr4[i3] ^ f5796C4[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                jArr4[i3] = jArr4[i3] ^ f5797C5[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                jArr4[i3] = jArr4[i3] ^ f5798C6[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                jArr4[i3] = jArr4[i3] ^ f5799C7[((int) jArr6[(i3 - 7) & 7]) & 255];
                i3++;
                i2 = i2;
            }
            int i4 = i2;
            long[] jArr7 = this.f5801_L;
            long[] jArr8 = this.f5800_K;
            System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = this.f5800_K;
            jArr9[0] = jArr9[0] ^ this._rc[i4];
            int i5 = 0;
            while (true) {
                jArr = this.f5801_L;
                if (i5 >= 8) {
                    break;
                }
                jArr[i5] = this.f5800_K[i5];
                long j4 = jArr[i5];
                long[] jArr10 = f5792C0;
                long[] jArr11 = this._state;
                jArr[i5] = j4 ^ jArr10[((int) (jArr11[i5 & 7] >>> 56)) & 255];
                jArr[i5] = jArr[i5] ^ f5793C1[((int) (jArr11[(i5 - 1) & 7] >>> 48)) & 255];
                jArr[i5] = jArr[i5] ^ f5794C2[((int) (jArr11[(i5 - 2) & 7] >>> 40)) & 255];
                jArr[i5] = jArr[i5] ^ f5795C3[((int) (jArr11[(i5 - 3) & 7] >>> 32)) & 255];
                jArr[i5] = jArr[i5] ^ f5796C4[((int) (jArr11[(i5 - 4) & 7] >>> 24)) & 255];
                jArr[i5] = jArr[i5] ^ f5797C5[((int) (jArr11[(i5 - 5) & 7] >>> 16)) & 255];
                jArr[i5] = jArr[i5] ^ f5798C6[((int) (jArr11[(i5 - 6) & 7] >>> 8)) & 255];
                jArr[i5] = jArr[i5] ^ f5799C7[((int) jArr11[(i5 - 7) & 7]) & 255];
                i5++;
            }
            long[] jArr12 = this._state;
            System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
            i2 = i4 + 1;
        }
        for (int i6 = 0; i6 < 8; i6++) {
            long[] jArr13 = this._hash;
            jArr13[i6] = jArr13[i6] ^ (this._state[i6] ^ this._block[i6]);
        }
    }

    public final void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0);
        Arrays.fill(this.f5800_K, 0);
        Arrays.fill(this.f5801_L, 0);
        Arrays.fill(this._block, 0);
        Arrays.fill(this._state, 0);
    }

    public final void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest.f5800_K;
        long[] jArr6 = this.f5800_K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest.f5801_L;
        long[] jArr8 = this.f5801_L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    public final void update(byte b) {
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = b;
        int i2 = i + 1;
        this._bufferPos = i2;
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    public final void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
