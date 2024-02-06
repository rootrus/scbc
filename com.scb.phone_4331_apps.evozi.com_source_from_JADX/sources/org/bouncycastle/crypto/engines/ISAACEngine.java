package org.bouncycastle.crypto.engines;

import com.google.android.gms.location.places.Place;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

public class ISAACEngine implements StreamCipher {

    /* renamed from: a */
    private int f5893a = 0;

    /* renamed from: b */
    private int f5894b = 0;

    /* renamed from: c */
    private int f5895c = 0;
    private int[] engineState = null;
    private int index = 0;
    private boolean initialised = false;
    private byte[] keyStream = new byte[1024];
    private int[] results = null;
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private byte[] workingKey = null;

    private void isaac() {
        int i;
        int i2;
        int i3 = this.f5894b;
        int i4 = this.f5895c + 1;
        this.f5895c = i4;
        this.f5894b = i3 + i4;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = this.engineState[i5];
            int i7 = i5 & 3;
            if (i7 == 0) {
                i2 = this.f5893a;
                i = i2 << 13;
            } else if (i7 == 1) {
                i2 = this.f5893a;
                i = i2 >>> 6;
            } else if (i7 == 2) {
                i2 = this.f5893a;
                i = i2 << 2;
            } else if (i7 == 3) {
                i2 = this.f5893a;
                i = i2 >>> 16;
            } else {
                int i8 = this.f5893a;
                int[] iArr = this.engineState;
                int i9 = i8 + iArr[(i5 + 128) & 255];
                this.f5893a = i9;
                int i10 = iArr[(i6 >>> 2) & 255] + i9 + this.f5894b;
                iArr[i5] = i10;
                int[] iArr2 = this.results;
                int i11 = iArr[(i10 >>> 10) & 255] + i6;
                this.f5894b = i11;
                iArr2[i5] = i11;
            }
            this.f5893a = i2 ^ i;
            int i82 = this.f5893a;
            int[] iArr3 = this.engineState;
            int i92 = i82 + iArr3[(i5 + 128) & 255];
            this.f5893a = i92;
            int i102 = iArr3[(i6 >>> 2) & 255] + i92 + this.f5894b;
            iArr3[i5] = i102;
            int[] iArr22 = this.results;
            int i112 = iArr3[(i102 >>> 10) & 255] + i6;
            this.f5894b = i112;
            iArr22[i5] = i112;
        }
    }

    private void mix(int[] iArr) {
        iArr[0] = iArr[0] ^ (iArr[1] << 11);
        iArr[3] = iArr[3] + iArr[0];
        iArr[1] = iArr[1] + iArr[2];
        iArr[1] = iArr[1] ^ (iArr[2] >>> 2);
        iArr[4] = iArr[4] + iArr[1];
        iArr[2] = iArr[2] + iArr[3];
        iArr[2] = iArr[2] ^ (iArr[3] << 8);
        iArr[5] = iArr[5] + iArr[2];
        iArr[3] = iArr[3] + iArr[4];
        iArr[3] = iArr[3] ^ (iArr[4] >>> 16);
        iArr[6] = iArr[6] + iArr[3];
        iArr[4] = iArr[4] + iArr[5];
        iArr[4] = iArr[4] ^ (iArr[5] << 10);
        iArr[7] = iArr[7] + iArr[4];
        iArr[5] = iArr[5] + iArr[6];
        iArr[5] = (iArr[6] >>> 4) ^ iArr[5];
        iArr[0] = iArr[0] + iArr[5];
        iArr[6] = iArr[6] + iArr[7];
        iArr[6] = iArr[6] ^ (iArr[7] << 8);
        iArr[1] = iArr[1] + iArr[6];
        iArr[7] = iArr[7] + iArr[0];
        iArr[7] = iArr[7] ^ (iArr[0] >>> 9);
        iArr[2] = iArr[2] + iArr[7];
        iArr[0] = iArr[0] + iArr[1];
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        if (this.engineState == null) {
            this.engineState = new int[256];
        }
        if (this.results == null) {
            this.results = new int[256];
        }
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.engineState;
            this.results[i] = 0;
            iArr[i] = 0;
        }
        this.f5895c = 0;
        this.f5894b = 0;
        this.f5893a = 0;
        this.index = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i2 = 0; i2 < length; i2 += 4) {
            this.results[i2 >>> 2] = Pack.littleEndianToInt(bArr2, i2);
        }
        int[] iArr2 = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr2[i3] = -1640531527;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            mix(iArr2);
        }
        int i5 = 0;
        while (i5 < 2) {
            for (int i6 = 0; i6 < 256; i6 += 8) {
                for (int i7 = 0; i7 < 8; i7++) {
                    iArr2[i7] = iArr2[i7] + (i5 <= 0 ? this.results[i6 + i7] : this.engineState[i6 + i7]);
                }
                mix(iArr2);
                for (int i8 = 0; i8 < 8; i8++) {
                    this.engineState[i6 + i8] = iArr2[i8];
                }
            }
            i5++;
        }
        isaac();
        this.initialised = true;
    }

    public String getAlgorithmName() {
        return "ISAAC";
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            setKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid parameter passed to ISAAC init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.initialised) {
            StringBuilder sb = new StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new IllegalStateException(sb.toString());
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (this.index == 0) {
                    isaac();
                    this.keyStream = Pack.intToBigEndian(this.results);
                }
                byte[] bArr3 = this.keyStream;
                int i5 = this.index;
                bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
                this.index = (i5 + 1) & Place.TYPE_SUBLOCALITY_LEVEL_1;
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
        setKey(this.workingKey);
    }

    public byte returnByte(byte b) {
        if (this.index == 0) {
            isaac();
            this.keyStream = Pack.intToBigEndian(this.results);
        }
        byte[] bArr = this.keyStream;
        int i = this.index;
        byte b2 = (byte) (b ^ bArr[i]);
        this.index = (i + 1) & Place.TYPE_SUBLOCALITY_LEVEL_1;
        return b2;
    }
}
