package org.bouncycastle.crypto.macs;

import com.google.common.base.Ascii;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class VMPCMac implements Mac {

    /* renamed from: P */
    private byte[] f5981P = null;

    /* renamed from: T */
    private byte[] f5982T;

    /* renamed from: g */
    private byte f5983g;

    /* renamed from: n */
    private byte f5984n = 0;

    /* renamed from: s */
    private byte f5985s = 0;
    private byte[] workingIV;
    private byte[] workingKey;

    /* renamed from: x1 */
    private byte f5986x1;

    /* renamed from: x2 */
    private byte f5987x2;

    /* renamed from: x3 */
    private byte f5988x3;

    /* renamed from: x4 */
    private byte f5989x4;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f5985s = 0;
        this.f5981P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f5981P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f5981P;
            int i3 = i2 & 255;
            byte b = bArr3[(this.f5985s + bArr3[i3] + bArr[i2 % bArr.length]) & 255];
            this.f5985s = b;
            byte b2 = bArr3[i3];
            byte b3 = b & 255;
            bArr3[i3] = bArr3[b3];
            bArr3[b3] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f5981P;
            int i5 = i4 & 255;
            byte b4 = bArr4[(this.f5985s + bArr4[i5] + bArr2[i4 % bArr2.length]) & 255];
            this.f5985s = b4;
            byte b5 = bArr4[i5];
            byte b6 = b4 & 255;
            bArr4[i5] = bArr4[b6];
            bArr4[b6] = b5;
        }
        this.f5984n = 0;
    }

    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.f5981P;
            byte b = this.f5985s;
            byte b2 = this.f5984n;
            byte b3 = b2 & 255;
            byte b4 = bArr2[(b + bArr2[b3]) & 255];
            this.f5985s = b4;
            byte b5 = this.f5989x4;
            byte b6 = this.f5988x3;
            byte b7 = bArr2[(b5 + b6 + i2) & 255];
            this.f5989x4 = b7;
            byte b8 = this.f5987x2;
            byte b9 = bArr2[(b6 + b8 + i2) & 255];
            this.f5988x3 = b9;
            byte b10 = this.f5986x1;
            byte b11 = bArr2[(b8 + b10 + i2) & 255];
            this.f5987x2 = b11;
            byte b12 = bArr2[(b10 + b4 + i2) & 255];
            this.f5986x1 = b12;
            byte[] bArr3 = this.f5982T;
            byte b13 = this.f5983g;
            byte b14 = b13 & Ascii.f3259US;
            bArr3[b14] = (byte) (b12 ^ bArr3[b14]);
            int i3 = (b13 + 1) & 31;
            bArr3[i3] = (byte) (b11 ^ bArr3[i3]);
            int i4 = (b13 + 2) & 31;
            bArr3[i4] = (byte) (b9 ^ bArr3[i4]);
            int i5 = (b13 + 3) & 31;
            bArr3[i5] = (byte) (b7 ^ bArr3[i5]);
            this.f5983g = (byte) ((b13 + 4) & 31);
            byte b15 = bArr2[b3];
            byte b16 = b4 & 255;
            bArr2[b3] = bArr2[b16];
            bArr2[b16] = b15;
            this.f5984n = (byte) (b2 + 1);
        }
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr4 = this.f5981P;
            int i7 = i6 & 255;
            byte b17 = bArr4[(this.f5985s + bArr4[i7] + this.f5982T[i6 & 31]) & 255];
            this.f5985s = b17;
            byte b18 = bArr4[i7];
            byte b19 = b17 & 255;
            bArr4[i7] = bArr4[b19];
            bArr4[b19] = b18;
        }
        byte[] bArr5 = new byte[20];
        for (int i8 = 0; i8 < 20; i8++) {
            byte[] bArr6 = this.f5981P;
            int i9 = i8 & 255;
            byte b20 = bArr6[(this.f5985s + bArr6[i9]) & 255];
            this.f5985s = b20;
            byte b21 = b20 & 255;
            bArr5[i8] = bArr6[(bArr6[bArr6[b21] & 255] + 1) & 255];
            byte b22 = bArr6[i9];
            bArr6[i9] = bArr6[b21];
            bArr6[b21] = b22;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    public int getMacSize() {
        return 20;
    }

    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
            if (parametersWithIV.getParameters() instanceof KeyParameter) {
                byte[] iv = parametersWithIV.getIV();
                this.workingIV = iv;
                if (iv == null || iv.length <= 0 || iv.length > 768) {
                    throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
                }
                this.workingKey = keyParameter.getKey();
                reset();
                return;
            }
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
    }

    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f5984n = 0;
        this.f5989x4 = 0;
        this.f5988x3 = 0;
        this.f5987x2 = 0;
        this.f5986x1 = 0;
        this.f5983g = 0;
        this.f5982T = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.f5982T[i] = 0;
        }
    }

    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.f5981P;
        byte b2 = this.f5985s;
        byte b3 = this.f5984n;
        byte b4 = b3 & 255;
        byte b5 = bArr[(b2 + bArr[b4]) & 255];
        this.f5985s = b5;
        byte b6 = b5 & 255;
        byte b7 = this.f5989x4;
        byte b8 = this.f5988x3;
        byte b9 = bArr[(b7 + b8) & 255];
        this.f5989x4 = b9;
        byte b10 = this.f5987x2;
        byte b11 = bArr[(b8 + b10) & 255];
        this.f5988x3 = b11;
        byte b12 = this.f5986x1;
        byte b13 = bArr[(b10 + b12) & 255];
        this.f5987x2 = b13;
        byte b14 = bArr[(b12 + b5 + ((byte) (b ^ bArr[(bArr[bArr[b6] & 255] + 1) & 255]))) & 255];
        this.f5986x1 = b14;
        byte[] bArr2 = this.f5982T;
        byte b15 = this.f5983g;
        byte b16 = b15 & Ascii.f3259US;
        bArr2[b16] = (byte) (b14 ^ bArr2[b16]);
        int i = (b15 + 1) & 31;
        bArr2[i] = (byte) (b13 ^ bArr2[i]);
        int i2 = (b15 + 2) & 31;
        bArr2[i2] = (byte) (b11 ^ bArr2[i2]);
        int i3 = (b15 + 3) & 31;
        bArr2[i3] = (byte) (b9 ^ bArr2[i3]);
        this.f5983g = (byte) ((b15 + 4) & 31);
        byte b17 = bArr[b4];
        bArr[b4] = bArr[b6];
        bArr[b6] = b17;
        this.f5984n = (byte) (b3 + 1);
    }

    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (i + i2 <= bArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                update(bArr[i + i3]);
            }
            return;
        }
        throw new DataLengthException("input buffer too short");
    }
}
