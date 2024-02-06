package org.bouncycastle.crypto.prng.drbg;

import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class CTRSP800DRBG implements SP80090DRBG {
    private static final int AES_MAX_BITS_REQUEST = 262144;
    private static final long AES_RESEED_MAX = 140737488355328L;
    private static final byte[] K_BITS = Hex.decode("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    private static final int TDEA_MAX_BITS_REQUEST = 4096;
    private static final long TDEA_RESEED_MAX = 2147483648L;
    private byte[] _Key;

    /* renamed from: _V */
    private byte[] f6085_V;
    private BlockCipher _engine;
    private EntropySource _entropySource;
    private boolean _isTDEA = false;
    private int _keySizeInBits;
    private long _reseedCounter = 0;
    private int _securityStrength;
    private int _seedLength;

    public CTRSP800DRBG(BlockCipher blockCipher, int i, int i2, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._entropySource = entropySource;
        this._engine = blockCipher;
        this._keySizeInBits = i;
        this._securityStrength = i2;
        this._seedLength = (blockCipher.getBlockSize() << 3) + i;
        this._isTDEA = isTDEA(blockCipher);
        if (i2 > 256) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        } else if (getMaxSecurityStrength(blockCipher, i) < i2) {
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        } else if (entropySource.entropySize() >= i2) {
            CTR_DRBG_Instantiate_algorithm(getEntropy(), bArr2, bArr);
        } else {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
    }

    private void BCC(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int blockSize = this._engine.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        this._engine.processBlock(bArr3, 0, bArr5, 0);
        for (int i = 0; i < length; i++) {
            XOR(bArr6, bArr5, bArr4, i * blockSize);
            this._engine.processBlock(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private byte[] Block_Cipher_df(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int blockSize = this._engine.getBlockSize();
        int length = bArr2.length;
        int i2 = length + 8;
        byte[] bArr3 = new byte[(((((i2 + 1) + blockSize) - 1) / blockSize) * blockSize)];
        copyIntToByteArray(bArr3, length, 0);
        copyIntToByteArray(bArr3, i / 8, 4);
        System.arraycopy(bArr2, 0, bArr3, 8, length);
        bArr3[i2] = ISOFileInfo.DATA_BYTES1;
        int i3 = this._keySizeInBits / 8;
        int i4 = i3 + blockSize;
        byte[] bArr4 = new byte[i4];
        byte[] bArr5 = new byte[blockSize];
        byte[] bArr6 = new byte[blockSize];
        byte[] bArr7 = new byte[i3];
        System.arraycopy(K_BITS, 0, bArr7, 0, i3);
        int i5 = 0;
        while (true) {
            int i6 = i5 * blockSize;
            if ((i6 << 3) >= this._keySizeInBits + (blockSize << 3)) {
                break;
            }
            copyIntToByteArray(bArr6, i5, 0);
            BCC(bArr5, bArr7, bArr6, bArr3);
            int i7 = i4 - i6;
            if (i7 > blockSize) {
                i7 = blockSize;
            }
            System.arraycopy(bArr5, 0, bArr4, i6, i7);
            i5++;
        }
        byte[] bArr8 = new byte[blockSize];
        System.arraycopy(bArr4, 0, bArr7, 0, i3);
        System.arraycopy(bArr4, i3, bArr8, 0, blockSize);
        int i8 = i / 2;
        byte[] bArr9 = new byte[i8];
        this._engine.init(true, new KeyParameter(expandKey(bArr7)));
        int i9 = 0;
        while (true) {
            int i10 = i9 * blockSize;
            if (i10 >= i8) {
                return bArr9;
            }
            this._engine.processBlock(bArr8, 0, bArr8, 0);
            int i11 = i8 - i10;
            if (i11 > blockSize) {
                i11 = blockSize;
            }
            System.arraycopy(bArr8, 0, bArr9, i10, i11);
            i9++;
        }
    }

    private void CTR_DRBG_Instantiate_algorithm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] Block_Cipher_df = Block_Cipher_df(Arrays.concatenate(bArr, bArr2, bArr3), this._seedLength);
        int blockSize = this._engine.getBlockSize();
        byte[] bArr4 = new byte[((this._keySizeInBits + 7) / 8)];
        this._Key = bArr4;
        byte[] bArr5 = new byte[blockSize];
        this.f6085_V = bArr5;
        CTR_DRBG_Update(Block_Cipher_df, bArr4, bArr5);
        this._reseedCounter = 1;
    }

    private void CTR_DRBG_Reseed_algorithm(byte[] bArr) {
        CTR_DRBG_Update(Block_Cipher_df(Arrays.concatenate(getEntropy(), bArr), this._seedLength), this._Key, this.f6085_V);
        this._reseedCounter = 1;
    }

    private void CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this._engine.getBlockSize()];
        int blockSize = this._engine.getBlockSize();
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        int i = 0;
        while (true) {
            int i2 = i * blockSize;
            if (i2 < bArr.length) {
                addOneTo(bArr3);
                this._engine.processBlock(bArr3, 0, bArr5, 0);
                int i3 = length - i2;
                if (i3 > blockSize) {
                    i3 = blockSize;
                }
                System.arraycopy(bArr5, 0, bArr4, i2, i3);
                i++;
            } else {
                XOR(bArr4, bArr, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            }
        }
    }

    private void XOR(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr2[i2] ^ bArr3[i2 + i]);
        }
    }

    private void addOneTo(byte[] bArr) {
        byte b = 1;
        for (int i = 1; i <= bArr.length; i++) {
            int i2 = (bArr[bArr.length - i] & 255) + b;
            b = i2 > 255 ? (byte) 1 : 0;
            bArr[bArr.length - i] = (byte) i2;
        }
    }

    private void copyIntToByteArray(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private int getMaxSecurityStrength(BlockCipher blockCipher, int i) {
        if (isTDEA(blockCipher) && i == 168) {
            return 112;
        }
        if (blockCipher.getAlgorithmName().equals("AES")) {
            return i;
        }
        return -1;
    }

    private boolean isTDEA(BlockCipher blockCipher) {
        return blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA");
    }

    private void padKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        bArr2[i2] = (byte) (bArr[i] & 254);
        int i3 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i] << 7) | ((bArr[i3] & 252) >>> 1));
        byte b = bArr[i3];
        int i4 = i + 2;
        bArr2[i2 + 2] = (byte) ((b << 6) | ((bArr[i4] & 248) >>> 2));
        byte b2 = bArr[i4];
        int i5 = i + 3;
        bArr2[i2 + 3] = (byte) ((b2 << 5) | ((bArr[i5] & 240) >>> 3));
        byte b3 = bArr[i5];
        int i6 = i + 4;
        bArr2[i2 + 4] = (byte) ((b3 << 4) | ((bArr[i6] & ISO7816.INS_CREATE_FILE) >>> 4));
        byte b4 = bArr[i6];
        int i7 = i + 5;
        bArr2[i2 + 5] = (byte) ((b4 << 3) | ((bArr[i7] & ISO7816.INS_GET_RESPONSE) >>> 5));
        int i8 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i7] << 2) | ((bArr[i8] & ISOFileInfo.DATA_BYTES1) >>> 6));
        int i9 = i2 + 7;
        bArr2[i9] = (byte) (bArr[i8] << 1);
        while (i2 <= i9) {
            byte b5 = bArr2[i2];
            bArr2[i2] = (byte) ((b5 & 254) | ((((b5 >> 7) ^ ((((((b5 >> 1) ^ (b5 >> 2)) ^ (b5 >> 3)) ^ (b5 >> 4)) ^ (b5 >> 5)) ^ (b5 >> 6))) ^ 1) & 1));
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] expandKey(byte[] bArr) {
        if (!this._isTDEA) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        padKey(bArr, 0, bArr2, 0);
        padKey(bArr, 7, bArr2, 8);
        padKey(bArr, 14, bArr2, 16);
        return bArr2;
    }

    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArr3;
        boolean z2 = this._isTDEA;
        long j = this._reseedCounter;
        if (z2) {
            if (j > TDEA_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else if (j > AES_RESEED_MAX) {
            return -1;
        } else {
            if (Utils.isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z) {
            CTR_DRBG_Reseed_algorithm(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArr3 = Block_Cipher_df(bArr2, this._seedLength);
            CTR_DRBG_Update(bArr3, this._Key, this.f6085_V);
        } else {
            bArr3 = new byte[this._seedLength];
        }
        int length = this.f6085_V.length;
        byte[] bArr4 = new byte[length];
        this._engine.init(true, new KeyParameter(expandKey(this._Key)));
        for (int i = 0; i <= bArr.length / length; i++) {
            int i2 = i * length;
            int length2 = bArr.length - i2 > length ? length : bArr.length - (this.f6085_V.length * i);
            if (length2 != 0) {
                addOneTo(this.f6085_V);
                this._engine.processBlock(this.f6085_V, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr, i2, length2);
            }
        }
        CTR_DRBG_Update(bArr3, this._Key, this.f6085_V);
        this._reseedCounter++;
        return bArr.length << 3;
    }

    public int getBlockSize() {
        return this.f6085_V.length << 3;
    }

    public void reseed(byte[] bArr) {
        CTR_DRBG_Reseed_algorithm(bArr);
    }
}
