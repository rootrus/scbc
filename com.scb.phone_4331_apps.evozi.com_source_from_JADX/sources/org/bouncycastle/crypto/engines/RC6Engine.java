package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;

    /* renamed from: _S */
    private int[] f5902_S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        int bytesToWord3 = bytesToWord(bArr, i + 8);
        int bytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this.f5902_S;
        int i3 = bytesToWord - iArr[42];
        int i4 = bytesToWord4;
        int i5 = bytesToWord3 - iArr[43];
        int i6 = bytesToWord2;
        int i7 = i3;
        int i8 = 20;
        while (i8 > 0) {
            int rotateLeft = rotateLeft(((i7 << 1) + 1) * i7, 5);
            int rotateLeft2 = rotateLeft(((i5 << 1) + 1) * i5, 5);
            int i9 = i8 << 1;
            int rotateRight = rotateRight(i6 - this.f5902_S[i9 + 1], rotateLeft);
            i8--;
            int rotateRight2 = rotateRight(i4 - this.f5902_S[i9], rotateLeft2) ^ rotateLeft;
            i4 = i5;
            i5 = rotateRight ^ rotateLeft2;
            i6 = i7;
            i7 = rotateRight2;
        }
        int[] iArr2 = this.f5902_S;
        int i10 = iArr2[1];
        int i11 = iArr2[0];
        wordToBytes(i7, bArr2, i2);
        wordToBytes(i6 - i11, bArr2, i2 + 4);
        wordToBytes(i5, bArr2, i2 + 8);
        wordToBytes(i4 - i10, bArr2, i2 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        int bytesToWord3 = bytesToWord(bArr, i + 8);
        int bytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this.f5902_S;
        int i3 = bytesToWord2 + iArr[0];
        int i4 = bytesToWord4 + iArr[1];
        int i5 = 1;
        while (i5 <= 20) {
            int rotateLeft = rotateLeft(((i3 << 1) + 1) * i3, 5);
            int rotateLeft2 = rotateLeft(((i4 << 1) + 1) * i4, 5);
            int rotateLeft3 = rotateLeft(bytesToWord ^ rotateLeft, rotateLeft2);
            int i6 = i5 << 1;
            int i7 = this.f5902_S[i6];
            i5++;
            int rotateLeft4 = rotateLeft(bytesToWord3 ^ rotateLeft2, rotateLeft) + this.f5902_S[i6 + 1];
            bytesToWord3 = i4;
            i4 = rotateLeft3 + i7;
            bytesToWord = i3;
            i3 = rotateLeft4;
        }
        int[] iArr2 = this.f5902_S;
        int i8 = iArr2[42];
        int i9 = iArr2[43];
        wordToBytes(bytesToWord + i8, bArr2, i2);
        wordToBytes(i3, bArr2, i2 + 4);
        wordToBytes(bytesToWord3 + i9, bArr2, i2 + 8);
        wordToBytes(i4, bArr2, i2 + 12);
        return 16;
    }

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private int rotateRight(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = ((bArr.length + 4) - 1) / 4;
        int[] iArr2 = new int[length];
        for (int length2 = bArr.length - 1; length2 >= 0; length2--) {
            int i = length2 / 4;
            iArr2[i] = (iArr2[i] << 8) + (bArr[length2] & 255);
        }
        int[] iArr3 = new int[44];
        this.f5902_S = iArr3;
        iArr3[0] = P32;
        int i2 = 1;
        while (true) {
            iArr = this.f5902_S;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = iArr[i2 - 1] - 1640531527;
            i2++;
        }
        int length3 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length3; i7++) {
            int[] iArr4 = this.f5902_S;
            i4 = rotateLeft(iArr4[i3] + i4 + i5, 3);
            iArr4[i3] = i4;
            i5 = rotateLeft(iArr2[i6] + i4 + i5, i5 + i4);
            iArr2[i6] = i5;
            i3 = (i3 + 1) % this.f5902_S.length;
            i6 = (i6 + 1) % length;
        }
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    public String getAlgorithmName() {
        return "RC6";
    }

    public int getBlockSize() {
        return 16;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.forEncryption = z;
            setKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid parameter passed to RC6 init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int blockSize = getBlockSize();
        if (this.f5902_S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        } else if (i + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (blockSize + i2 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
    }
}
