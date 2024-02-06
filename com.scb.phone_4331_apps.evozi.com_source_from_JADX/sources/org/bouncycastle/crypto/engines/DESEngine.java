package org.bouncycastle.crypto.engines;

import com.google.android.gms.location.places.Place;
import com.google.common.base.Ascii;
import net.p088sf.scuba.smartcards.ISO7816;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class DESEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private static final int[] SP1 = {16843776, 0, 65536, 16843780, 16842756, 66564, 4, 65536, 1024, 16843776, 16843780, 1024, 16778244, 16842756, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 4, Place.TYPE_SUBPREMISE, 16778240, 16778240, 66560, 66560, 16842752, 16842752, 16778244, 65540, 16777220, 16777220, 65540, 0, Place.TYPE_SUBPREMISE, 66564, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 65536, 16843780, 4, 16842752, 16843776, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 1024, 16842756, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, 16843780, 65540, 16842752, 16778244, 16777220, Place.TYPE_SUBPREMISE, 66564, 16843776, Place.TYPE_SUBPREMISE, 16778240, 16778240, 0, 65540, 66560, 0, 16842756};
    private static final int[] SP2 = {-2146402272, -2147450880, 32768, 1081376, PKIFailureInfo.badCertTemplate, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, PKIFailureInfo.systemUnavail, -2147450880, PKIFailureInfo.badCertTemplate, 32, -2146435040, 1081344, 1048608, -2147450848, 0, PKIFailureInfo.systemUnavail, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, PKIFailureInfo.badCertTemplate, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, PKIFailureInfo.systemUnavail, 32800, -2146402304, PKIFailureInfo.badCertTemplate, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, PKIFailureInfo.systemUnavail, -2146435040, -2146402272, 1081344};
    private static final int[] SP3 = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] SP4 = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
    private static final int[] SP5 = {256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};
    private static final int[] SP6 = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, PKIFailureInfo.duplicateCertReq, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, PKIFailureInfo.duplicateCertReq, 4194320, 536887312};
    private static final int[] SP7 = {PKIFailureInfo.badSenderNonce, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, PKIFailureInfo.badSenderNonce, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, PKIFailureInfo.badSenderNonce, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, PKIFailureInfo.badSenderNonce, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] SP8 = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};
    private static final int[] bigbyte = {8388608, 4194304, PKIFailureInfo.badSenderNonce, PKIFailureInfo.badCertTemplate, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    private static final short[] bytebit = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final byte[] pc1 = {56, ISO7816.INS_DECREASE, 40, 32, Ascii.CAN, 16, 8, 0, 57, 49, 41, 33, Ascii.f3248EM, 17, 9, 1, 58, ISO7816.INS_INCREASE, ISO7816.INS_PSO, ISO7816.INS_MSE, Ascii.SUB, Ascii.DC2, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, Ascii.SYN, 14, 6, 61, 53, 45, 37, 29, Ascii.NAK, 13, 5, 60, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_CHANGE_CHV, 28, Ascii.DC4, 12, 4, Ascii.ESC, 19, 11, 3};
    private static final byte[] pc2 = {13, 16, 10, Ascii.ETB, 0, 4, 2, Ascii.ESC, 14, 5, Ascii.DC4, 9, Ascii.SYN, Ascii.DC2, 11, 3, Ascii.f3248EM, 7, 15, 6, Ascii.SUB, 19, 12, 1, 40, 51, 30, ISO7816.INS_CHANGE_CHV, 46, 54, 29, 39, ISO7816.INS_INCREASE, ISO7816.INS_UNBLOCK_CHV, 32, 47, 43, ISO7816.INS_DECREASE, 38, 55, 33, ISO7816.INS_DECREASE_STAMPED, 45, 41, 49, 35, 28, Ascii.f3259US};
    private static final byte[] totrot = {1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, Ascii.NAK, Ascii.ETB, Ascii.f3248EM, Ascii.ESC, 28};
    private int[] workingKey = null;

    /* access modifiers changed from: protected */
    public void desFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        byte b = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
        byte b2 = ((bArr[i + 4] & 255) << Ascii.CAN) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
        byte b3 = ((b >>> 4) ^ b2) & 252645135;
        byte b4 = b2 ^ b3;
        byte b5 = b ^ (b3 << 4);
        byte b6 = ((b5 >>> 16) ^ b4) & 65535;
        byte b7 = b4 ^ b6;
        byte b8 = b5 ^ (b6 << 16);
        byte b9 = ((b7 >>> 2) ^ b8) & 858993459;
        byte b10 = b8 ^ b9;
        byte b11 = b7 ^ (b9 << 2);
        byte b12 = ((b11 >>> 8) ^ b10) & 16711935;
        byte b13 = b10 ^ b12;
        byte b14 = b11 ^ (b12 << 8);
        byte b15 = (b14 << 1) | ((b14 >>> Ascii.f3259US) & 1);
        byte b16 = (b13 ^ b15) & -1431655766;
        byte b17 = b13 ^ b16;
        byte b18 = b15 ^ b16;
        int i3 = (b17 << 1) | ((b17 >>> Ascii.f3259US) & 1);
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i4 << 2;
            int i6 = ((b18 << 28) | (b18 >>> 4)) ^ iArr[i5];
            int[] iArr2 = SP7;
            int i7 = iArr2[i6 & 63];
            int[] iArr3 = SP5;
            int i8 = iArr3[(i6 >>> 8) & 63];
            int[] iArr4 = SP3;
            int i9 = iArr4[(i6 >>> 16) & 63];
            int[] iArr5 = SP1;
            int i10 = iArr5[(i6 >>> 24) & 63];
            byte b19 = iArr[i5 + 1] ^ b18;
            int[] iArr6 = SP8;
            int i11 = iArr6[b19 & 63];
            int[] iArr7 = SP6;
            int i12 = iArr7[(b19 >>> 8) & 63];
            int[] iArr8 = SP4;
            int i13 = iArr8[(b19 >>> 16) & 63];
            int[] iArr9 = SP2;
            i3 ^= ((((i10 | ((i7 | i8) | i9)) | i11) | i12) | i13) | iArr9[(b19 >>> Ascii.CAN) & 63];
            int i14 = ((i3 << 28) | (i3 >>> 4)) ^ iArr[i5 + 2];
            int i15 = iArr2[i14 & 63];
            int i16 = iArr3[(i14 >>> 8) & 63];
            int i17 = iArr4[(i14 >>> 16) & 63];
            int i18 = iArr5[(i14 >>> 24) & 63];
            int i19 = iArr[i5 + 3] ^ i3;
            b18 ^= iArr9[(i19 >>> 24) & 63] | ((((i18 | ((i15 | i16) | i17)) | iArr6[i19 & 63]) | iArr7[(i19 >>> 8) & 63]) | iArr8[(i19 >>> 16) & 63]);
        }
        int i20 = (b18 << Ascii.f3259US) | (b18 >>> 1);
        int i21 = (i3 ^ i20) & -1431655766;
        int i22 = i3 ^ i21;
        int i23 = i20 ^ i21;
        int i24 = (i22 << 31) | (i22 >>> 1);
        int i25 = ((i24 >>> 8) ^ i23) & 16711935;
        int i26 = i23 ^ i25;
        int i27 = i24 ^ (i25 << 8);
        int i28 = ((i27 >>> 2) ^ i26) & 858993459;
        int i29 = i26 ^ i28;
        int i30 = i27 ^ (i28 << 2);
        int i31 = ((i29 >>> 16) ^ i30) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int i32 = i30 ^ i31;
        int i33 = i29 ^ (i31 << 16);
        int i34 = ((i33 >>> 4) ^ i32) & 252645135;
        int i35 = i32 ^ i34;
        int i36 = i33 ^ (i34 << 4);
        bArr2[i2] = (byte) (i36 >>> 24);
        bArr2[i2 + 1] = (byte) (i36 >>> 16);
        bArr2[i2 + 2] = (byte) (i36 >>> 8);
        bArr2[i2 + 3] = (byte) i36;
        bArr2[i2 + 4] = (byte) (i35 >>> 24);
        bArr2[i2 + 5] = (byte) (i35 >>> 16);
        bArr2[i2 + 6] = (byte) (i35 >>> 8);
        bArr2[i2 + 7] = (byte) i35;
    }

    /* access modifiers changed from: protected */
    public int[] generateWorkingKey(boolean z, byte[] bArr) {
        int i;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= 56) {
                break;
            }
            byte b = pc1[i2];
            if ((bytebit[b & 7] & bArr[b >>> 3]) == 0) {
                z2 = false;
            }
            zArr[i2] = z2;
            i2++;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = z ? i3 << 1 : (15 - i3) << 1;
            int i5 = i4 + 1;
            iArr[i5] = 0;
            iArr[i4] = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= 28) {
                    break;
                }
                int i7 = totrot[i3] + i6;
                if (i7 < 28) {
                    zArr2[i6] = zArr[i7];
                } else {
                    zArr2[i6] = zArr[i7 - 28];
                }
                i6++;
            }
            for (i = 28; i < 56; i++) {
                int i8 = totrot[i3] + i;
                if (i8 < 56) {
                    zArr2[i] = zArr[i8];
                } else {
                    zArr2[i] = zArr[i8 - 28];
                }
            }
            for (int i9 = 0; i9 < 24; i9++) {
                if (zArr2[pc2[i9]]) {
                    iArr[i4] = iArr[i4] | bigbyte[i9];
                }
                if (zArr2[pc2[i9 + 24]]) {
                    iArr[i5] = iArr[i5] | bigbyte[i9];
                }
            }
        }
        for (int i10 = 0; i10 != 32; i10 += 2) {
            int i11 = iArr[i10];
            int i12 = i10 + 1;
            int i13 = iArr[i12];
            iArr[i10] = ((16515072 & i11) << 6) | ((i11 & 4032) << 10) | ((i13 & 16515072) >>> 10) | ((i13 & 4032) >>> 6);
            iArr[i12] = ((i11 & 258048) << 12) | ((i11 & 63) << 16) | ((i13 & 258048) >>> 4) | (i13 & 63);
        }
        return iArr;
    }

    public String getAlgorithmName() {
        return "DES";
    }

    public int getBlockSize() {
        return 8;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            KeyParameter keyParameter = (KeyParameter) cipherParameters;
            if (keyParameter.getKey().length <= 8) {
                this.workingKey = generateWorkingKey(z, keyParameter.getKey());
                return;
            }
            throw new IllegalArgumentException("DES key too long - should be 8 bytes");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid parameter passed to DES init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("DES engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            desFunc(iArr, bArr, i, bArr2, i2);
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
    }
}
