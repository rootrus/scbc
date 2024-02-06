package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class PKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* renamed from: u */
    private int f5949u;

    /* renamed from: v */
    private int f5950v;

    public PKCS12ParametersGenerator(Digest digest2) {
        this.digest = digest2;
        if (digest2 instanceof ExtendedDigest) {
            this.f5949u = digest2.getDigestSize();
            this.f5950v = ((ExtendedDigest) digest2).getByteLength();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Digest ");
        sb.append(digest2.getAlgorithmName());
        sb.append(" unsupported");
        throw new IllegalArgumentException(sb.toString());
    }

    private void adjust(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i4 = i + length;
            int i5 = i3 + (bArr2[length] & 255) + (bArr[i4] & 255);
            bArr[i4] = (byte) i5;
            i3 = i5 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        int i4 = i2;
        int i5 = this.f5950v;
        byte[] bArr3 = new byte[i5];
        byte[] bArr4 = new byte[i4];
        int i6 = 0;
        for (int i7 = 0; i7 != i5; i7++) {
            bArr3[i7] = (byte) i;
        }
        int i8 = 1;
        if (this.salt == null || this.salt.length == 0) {
            bArr = new byte[0];
        } else {
            int i9 = this.f5950v;
            int length = this.salt.length;
            int i10 = this.f5950v;
            int i11 = i9 * (((length + i10) - 1) / i10);
            bArr = new byte[i11];
            for (int i12 = 0; i12 != i11; i12++) {
                byte[] bArr5 = this.salt;
                bArr[i12] = bArr5[i12 % bArr5.length];
            }
        }
        if (this.password == null || this.password.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i13 = this.f5950v;
            int length2 = this.password.length;
            int i14 = this.f5950v;
            int i15 = i13 * (((length2 + i14) - 1) / i14);
            bArr2 = new byte[i15];
            for (int i16 = 0; i16 != i15; i16++) {
                byte[] bArr6 = this.password;
                bArr2[i16] = bArr6[i16 % bArr6.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr7 = new byte[length3];
        System.arraycopy(bArr, 0, bArr7, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr7, bArr.length, bArr2.length);
        int i17 = this.f5950v;
        byte[] bArr8 = new byte[i17];
        int i18 = this.f5949u;
        int i19 = ((i4 + i18) - 1) / i18;
        byte[] bArr9 = new byte[i18];
        int i20 = 1;
        while (i20 <= i19) {
            this.digest.update(bArr3, i6, i5);
            this.digest.update(bArr7, i6, length3);
            this.digest.doFinal(bArr9, i6);
            for (int i21 = i8; i21 < this.iterationCount; i21++) {
                this.digest.update(bArr9, i6, i18);
                this.digest.doFinal(bArr9, i6);
            }
            for (int i22 = i6; i22 != i17; i22++) {
                bArr8[i22] = bArr9[i22 % i18];
            }
            int i23 = i6;
            while (true) {
                int i24 = this.f5950v;
                if (i23 == length3 / i24) {
                    break;
                }
                adjust(bArr7, i24 * i23, bArr8);
                i23++;
            }
            if (i20 == i19) {
                int i25 = (i20 - 1) * this.f5949u;
                i3 = 0;
                System.arraycopy(bArr9, 0, bArr4, i25, i4 - i25);
            } else {
                i3 = 0;
                System.arraycopy(bArr9, 0, bArr4, (i20 - 1) * this.f5949u, i18);
            }
            i20++;
            i6 = i3;
            i8 = 1;
        }
        return bArr4;
    }

    public CipherParameters generateDerivedMacParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(3, i2), 0, i2);
    }

    public CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(1, i2), 0, i2);
    }

    public CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i3);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i3), generateDerivedKey(2, i4), 0, i4);
    }
}
