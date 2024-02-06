package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: S */
    private static final byte[] f5850S = {99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.f5471AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.f5470A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, Ascii.SUB, Ascii.ESC, 110, 90, ISOFileInfo.f5467A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Ascii.DEL, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, 16, -1, -13, ISO7816.INS_WRITE_RECORD, -51, 12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, Ascii.ETB, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, Ascii.f3248EM, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, 11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, Ascii.f3259US, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, 30, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.f5468A1, -119, 13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, 15, ISO7816.INS_READ_BINARY, 84, -69, Ascii.SYN};

    /* renamed from: Si */
    private static final byte[] f5851Si = {82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.f5470A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, 11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.f5468A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, Ascii.NAK, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.f5471AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, 30, -113, ISO7816.INS_GET_DATA, 63, 15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, Ascii.SUB, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, 14, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, 32, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, Ascii.f3259US, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, Ascii.DC2, 16, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Ascii.DEL, -87, Ascii.f3248EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.f5467A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, Ascii.DC4, 99, 85, 33, 12, 125};

    /* renamed from: m1 */
    private static final int f5852m1 = -2139062144;

    /* renamed from: m2 */
    private static final int f5853m2 = 2139062143;

    /* renamed from: m3 */
    private static final int f5854m3 = 27;

    /* renamed from: m4 */
    private static final int f5855m4 = -1061109568;

    /* renamed from: m5 */
    private static final int f5856m5 = 1061109567;
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 47, 94, 188, 99, 198, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, 250, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    /* renamed from: C0 */
    private int f5857C0;

    /* renamed from: C1 */
    private int f5858C1;

    /* renamed from: C2 */
    private int f5859C2;

    /* renamed from: C3 */
    private int f5860C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    private static int FFmulX(int i) {
        return ((i & f5853m2) << 1) ^ (((f5852m1 & i) >>> 7) * 27);
    }

    private static int FFmulX2(int i) {
        int i2 = f5855m4 & i;
        int i3 = i2 ^ (i2 >>> 1);
        return (((i & f5856m5) << 2) ^ (i3 >>> 2)) ^ (i3 >>> 5);
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.f5857C0;
        int i2 = this.ROUNDS;
        char c = 0;
        int i3 = i ^ iArr[i2][0];
        int i4 = 1;
        int i5 = this.f5858C1 ^ iArr[i2][1];
        int i6 = this.f5859C2 ^ iArr[i2][2];
        int i7 = i2 - 1;
        int i8 = iArr[i2][3] ^ this.f5860C3;
        while (true) {
            byte[] bArr = f5851Si;
            int i9 = i3 & 255;
            if (i7 > i4) {
                int inv_mcol = inv_mcol((bArr[i5 >>> 24] << Ascii.CAN) ^ (((bArr[i9] & 255) ^ ((bArr[(i8 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i6 >> 16) & 255] & 255) << 16))) ^ iArr[i7][c];
                byte[] bArr2 = f5851Si;
                int inv_mcol2 = inv_mcol((bArr2[i6 >>> 24] << Ascii.CAN) ^ (((bArr2[i5 & 255] & 255) ^ ((bArr2[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i8 >> 16) & 255] & 255) << 16))) ^ iArr[i7][i4];
                byte[] bArr3 = f5851Si;
                int inv_mcol3 = inv_mcol((bArr3[i8 >>> 24] << Ascii.CAN) ^ (((bArr3[i6 & 255] & 255) ^ ((bArr3[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i3 >> 16) & 255] & 255) << 16))) ^ iArr[i7][2];
                byte[] bArr4 = f5851Si;
                int i10 = i7 - 1;
                int inv_mcol4 = inv_mcol((bArr4[i3 >>> 24] << Ascii.CAN) ^ (((bArr4[i8 & 255] & 255) ^ ((bArr4[(i6 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i5 >> 16) & 255] & 255) << 16))) ^ iArr[i7][3];
                byte[] bArr5 = f5851Si;
                int inv_mcol5 = inv_mcol((bArr5[inv_mcol2 >>> 24] << Ascii.CAN) ^ (((bArr5[inv_mcol & 255] & 255) ^ ((bArr5[(inv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(inv_mcol3 >> 16) & 255] & 255) << 16)));
                int i11 = iArr[i10][c];
                byte[] bArr6 = f5851Si;
                int inv_mcol6 = inv_mcol((bArr6[inv_mcol3 >>> 24] << Ascii.CAN) ^ (((bArr6[inv_mcol2 & 255] & 255) ^ ((bArr6[(inv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr6[(inv_mcol4 >> 16) & 255] & 255) << 16)));
                int i12 = iArr[i10][i4];
                byte[] bArr7 = f5851Si;
                byte b = bArr7[inv_mcol3 & 255];
                int inv_mcol7 = inv_mcol(((((bArr7[(inv_mcol2 >> 8) & 255] & 255) << 8) ^ (b & 255)) ^ ((bArr7[(inv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr7[inv_mcol4 >>> 24] << Ascii.CAN));
                int i13 = iArr[i10][2];
                byte[] bArr8 = f5851Si;
                int i14 = inv_mcol5 ^ i11;
                int i15 = inv_mcol6 ^ i12;
                int i16 = inv_mcol7 ^ i13;
                i4 = 1;
                i7 = i10 - 1;
                i8 = inv_mcol((((bArr8[inv_mcol4 & 255] & 255) ^ ((bArr8[(inv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr8[(inv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr8[inv_mcol >>> 24] << Ascii.CAN)) ^ iArr[i10][3];
                i3 = i14;
                i5 = i15;
                i6 = i16;
                c = 0;
            } else {
                int inv_mcol8 = inv_mcol((((bArr[i9] & 255) ^ ((bArr[(i8 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i6 >> 16) & 255] & 255) << 16)) ^ (bArr[i5 >>> 24] << Ascii.CAN)) ^ iArr[i7][0];
                byte[] bArr9 = f5851Si;
                int inv_mcol9 = inv_mcol((bArr9[i6 >>> 24] << Ascii.CAN) ^ (((bArr9[i5 & 255] & 255) ^ ((bArr9[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(i8 >> 16) & 255] & 255) << 16))) ^ iArr[i7][1];
                byte[] bArr10 = f5851Si;
                int inv_mcol10 = inv_mcol((bArr10[i8 >>> 24] << Ascii.CAN) ^ (((bArr10[i6 & 255] & 255) ^ ((bArr10[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr10[(i3 >> 16) & 255] & 255) << 16))) ^ iArr[i7][2];
                byte[] bArr11 = f5851Si;
                int inv_mcol11 = inv_mcol((bArr11[i3 >>> 24] << Ascii.CAN) ^ (((bArr11[i8 & 255] & 255) ^ ((bArr11[(i6 >> 8) & 255] & 255) << 8)) ^ ((bArr11[(i5 >> 16) & 255] & 255) << 16))) ^ iArr[i7][3];
                byte[] bArr12 = f5851Si;
                this.f5857C0 = ((((bArr12[inv_mcol8 & 255] & 255) ^ ((bArr12[(inv_mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr12[(inv_mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr12[inv_mcol9 >>> 24] << Ascii.CAN)) ^ iArr[0][0];
                this.f5858C1 = ((((bArr12[inv_mcol9 & 255] & 255) ^ ((bArr12[(inv_mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr12[(inv_mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr12[inv_mcol10 >>> 24] << Ascii.CAN)) ^ iArr[0][1];
                this.f5859C2 = ((((bArr12[inv_mcol10 & 255] & 255) ^ ((bArr12[(inv_mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr12[(inv_mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr12[inv_mcol11 >>> 24] << Ascii.CAN)) ^ iArr[0][2];
                this.f5860C3 = ((((bArr12[inv_mcol11 & 255] & 255) ^ ((bArr12[(inv_mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr12[(inv_mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr12[inv_mcol8 >>> 24] << Ascii.CAN)) ^ iArr[0][3];
                return;
            }
        }
    }

    private void encryptBlock(int[][] iArr) {
        char c = 0;
        int i = this.f5857C0 ^ iArr[0][0];
        int i2 = 1;
        int i3 = this.f5858C1 ^ iArr[0][1];
        int i4 = this.f5859C2 ^ iArr[0][2];
        int i5 = this.f5860C3 ^ iArr[0][3];
        int i6 = 1;
        while (i6 < this.ROUNDS - i2) {
            byte[] bArr = f5850S;
            int mcol = mcol((bArr[i5 >>> 24] << Ascii.CAN) ^ (((bArr[i & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16))) ^ iArr[i6][c];
            byte[] bArr2 = f5850S;
            int mcol2 = mcol((bArr2[i >>> 24] << Ascii.CAN) ^ (((bArr2[i3 & 255] & 255) ^ ((bArr2[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i5 >> 16) & 255] & 255) << 16))) ^ iArr[i6][i2];
            byte[] bArr3 = f5850S;
            int mcol3 = mcol((bArr3[i3 >>> 24] << Ascii.CAN) ^ (((bArr3[i4 & 255] & 255) ^ ((bArr3[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i >> 16) & 255] & 255) << 16))) ^ iArr[i6][2];
            byte[] bArr4 = f5850S;
            int i7 = i6 + 1;
            int mcol4 = mcol(((((bArr4[(i >> 8) & 255] & 255) << 8) ^ (bArr4[i5 & 255] & 255)) ^ ((bArr4[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr4[i4 >>> 24] << Ascii.CAN)) ^ iArr[i6][3];
            byte[] bArr5 = f5850S;
            int mcol5 = mcol((bArr5[mcol4 >>> 24] << Ascii.CAN) ^ (((bArr5[mcol & 255] & 255) ^ ((bArr5[(mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(mcol3 >> 16) & 255] & 255) << 16)));
            int i8 = iArr[i7][c];
            byte[] bArr6 = f5850S;
            int mcol6 = mcol((bArr6[mcol >>> 24] << Ascii.CAN) ^ (((bArr6[mcol2 & 255] & 255) ^ ((bArr6[(mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(mcol4 >> 16) & 255] & 255) << 16)));
            int i9 = iArr[i7][i2];
            byte[] bArr7 = f5850S;
            byte b = bArr7[mcol3 & 255];
            int mcol7 = mcol(((((bArr7[(mcol4 >> 8) & 255] & 255) << 8) ^ (b & 255)) ^ ((bArr7[(mcol >> 16) & 255] & 255) << 16)) ^ (bArr7[mcol2 >>> 24] << Ascii.CAN));
            int i10 = iArr[i7][2];
            byte[] bArr8 = f5850S;
            int i11 = mcol5 ^ i8;
            int i12 = mcol7 ^ i10;
            i2 = 1;
            i5 = mcol((((bArr8[mcol4 & 255] & 255) ^ ((bArr8[(mcol >> 8) & 255] & 255) << 8)) ^ ((bArr8[(mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr8[mcol3 >>> 24] << Ascii.CAN)) ^ iArr[i7][3];
            i = i11;
            i4 = i12;
            c = 0;
            int i13 = mcol6 ^ i9;
            i6 = i7 + 1;
            i3 = i13;
        }
        byte[] bArr9 = f5850S;
        int mcol8 = mcol((bArr9[i5 >>> 24] << Ascii.CAN) ^ (((bArr9[i & 255] & 255) ^ ((bArr9[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(i4 >> 16) & 255] & 255) << 16))) ^ iArr[i6][0];
        byte[] bArr10 = f5850S;
        int mcol9 = mcol((bArr10[i >>> 24] << Ascii.CAN) ^ (((bArr10[i3 & 255] & 255) ^ ((bArr10[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr10[(i5 >> 16) & 255] & 255) << 16))) ^ iArr[i6][1];
        byte[] bArr11 = f5850S;
        int mcol10 = mcol((bArr11[i3 >>> 24] << Ascii.CAN) ^ (((bArr11[i4 & 255] & 255) ^ ((bArr11[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr11[(i >> 16) & 255] & 255) << 16))) ^ iArr[i6][2];
        byte[] bArr12 = f5850S;
        int i14 = i6 + 1;
        int mcol11 = mcol(((((bArr12[(i >> 8) & 255] & 255) << 8) ^ (bArr12[i5 & 255] & 255)) ^ ((bArr12[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr12[i4 >>> 24] << Ascii.CAN)) ^ iArr[i6][3];
        byte[] bArr13 = f5850S;
        this.f5857C0 = ((((bArr13[mcol8 & 255] & 255) ^ ((bArr13[(mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr13[mcol11 >>> 24] << Ascii.CAN)) ^ iArr[i14][0];
        this.f5858C1 = ((((bArr13[mcol9 & 255] & 255) ^ ((bArr13[(mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr13[mcol8 >>> 24] << Ascii.CAN)) ^ iArr[i14][1];
        this.f5859C2 = ((((bArr13[mcol10 & 255] & 255) ^ ((bArr13[(mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr13[mcol9 >>> 24] << Ascii.CAN)) ^ iArr[i14][2];
        this.f5860C3 = ((((bArr13[mcol11 & 255] & 255) ^ ((bArr13[(mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr13[(mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr13[mcol10 >>> 24] << Ascii.CAN)) ^ iArr[i14][3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >> 2;
        int i2 = i + 6;
        this.ROUNDS = i2;
        int[] iArr = new int[2];
        iArr[1] = 4;
        iArr[0] = i2 + 1;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        if (i == 4) {
            int littleEndianToInt = Pack.littleEndianToInt(bArr2, 0);
            iArr2[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr2, 4);
            iArr2[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr2, 8);
            iArr2[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr2, 12);
            iArr2[0][3] = littleEndianToInt4;
            for (int i3 = 1; i3 <= 10; i3++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i3 - 1];
                iArr2[i3][0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[i3][1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[i3][2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[i3][3] = littleEndianToInt4;
            }
        } else if (i == 6) {
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr2, 0);
            iArr2[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr2, 4);
            iArr2[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr2, 8);
            iArr2[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr2, 12);
            iArr2[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr2, 16);
            iArr2[1][0] = littleEndianToInt9;
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr2, 20);
            iArr2[1][1] = littleEndianToInt10;
            int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ 1);
            iArr2[1][2] = subWord;
            int i4 = littleEndianToInt6 ^ subWord;
            iArr2[1][3] = i4;
            int i5 = littleEndianToInt7 ^ i4;
            iArr2[2][0] = i5;
            int i6 = littleEndianToInt8 ^ i5;
            iArr2[2][1] = i6;
            int i7 = littleEndianToInt9 ^ i6;
            iArr2[2][2] = i7;
            int i8 = littleEndianToInt10 ^ i7;
            iArr2[2][3] = i8;
            int i9 = 3;
            int i10 = 2;
            while (i9 < 12) {
                int i11 = i10 << 1;
                int subWord2 = subWord ^ (i10 ^ subWord(shift(i8, 8)));
                iArr2[i9][0] = subWord2;
                int i12 = i4 ^ subWord2;
                iArr2[i9][1] = i12;
                int i13 = i5 ^ i12;
                iArr2[i9][2] = i13;
                int i14 = i6 ^ i13;
                iArr2[i9][3] = i14;
                int i15 = i7 ^ i14;
                int i16 = i9 + 1;
                iArr2[i16][0] = i15;
                int i17 = i8 ^ i15;
                iArr2[i16][1] = i17;
                subWord = subWord2 ^ (subWord(shift(i17, 8)) ^ i11);
                iArr2[i16][2] = subWord;
                i4 = i12 ^ subWord;
                iArr2[i16][3] = i4;
                i5 = i13 ^ i4;
                int i18 = i9 + 2;
                iArr2[i18][0] = i5;
                i6 = i14 ^ i5;
                iArr2[i18][1] = i6;
                i7 = i15 ^ i6;
                iArr2[i18][2] = i7;
                i8 = i17 ^ i7;
                iArr2[i18][3] = i8;
                i9 += 3;
                i10 = i11 << 1;
            }
            int subWord3 = (subWord(shift(i8, 8)) ^ 128) ^ subWord;
            iArr2[12][0] = subWord3;
            int i19 = subWord3 ^ i4;
            iArr2[12][1] = i19;
            int i20 = i19 ^ i5;
            iArr2[12][2] = i20;
            iArr2[12][3] = i20 ^ i6;
        } else if (i == 8) {
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr2, 0);
            iArr2[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr2, 4);
            iArr2[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr2, 8);
            iArr2[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr2, 12);
            iArr2[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr2, 16);
            iArr2[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr2, 20);
            iArr2[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr2, 24);
            iArr2[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr2, 28);
            iArr2[1][3] = littleEndianToInt18;
            int i21 = 2;
            int i22 = 1;
            while (i21 < 14) {
                littleEndianToInt11 ^= subWord(shift(littleEndianToInt18, 8)) ^ i22;
                iArr2[i21][0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr2[i21][1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr2[i21][2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr2[i21][3] = littleEndianToInt14;
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int i23 = i21 + 1;
                iArr2[i23][0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr2[i23][1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr2[i23][2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr2[i23][3] = littleEndianToInt18;
                i21 += 2;
                i22 <<= 1;
            }
            int subWord4 = (subWord(shift(littleEndianToInt18, 8)) ^ i22) ^ littleEndianToInt11;
            iArr2[14][0] = subWord4;
            int i24 = subWord4 ^ littleEndianToInt12;
            iArr2[14][1] = i24;
            int i25 = i24 ^ littleEndianToInt13;
            iArr2[14][2] = i25;
            iArr2[14][3] = i25 ^ littleEndianToInt14;
        } else {
            throw new IllegalStateException("Should never get here");
        }
        if (!z) {
            for (int i26 = 1; i26 < this.ROUNDS; i26++) {
                for (int i27 = 0; i27 < 4; i27++) {
                    iArr2[i26][i27] = inv_mcol(iArr2[i26][i27]);
                }
            }
        }
        return iArr2;
    }

    private static int inv_mcol(int i) {
        int shift = shift(i, 8) ^ i;
        int FFmulX = i ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private static int mcol(int i) {
        int shift = shift(i, 8);
        int i2 = i ^ shift;
        return FFmulX(i2) ^ (shift ^ shift(i2, 16));
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = this.f5857C0;
        bArr[i] = (byte) i3;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i3 >> 24);
        int i7 = i6 + 1;
        int i8 = this.f5858C1;
        bArr[i6] = (byte) i8;
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i8 >> 24);
        int i12 = i11 + 1;
        int i13 = this.f5859C2;
        bArr[i11] = (byte) i13;
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 16);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i13 >> 24);
        int i17 = i16 + 1;
        int i18 = this.f5860C3;
        bArr[i16] = (byte) i18;
        int i19 = i17 + 1;
        bArr[i17] = (byte) (i18 >> 8);
        bArr[i19] = (byte) (i18 >> 16);
        bArr[i19 + 1] = (byte) (i18 >> 24);
    }

    private static int shift(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private static int subWord(int i) {
        byte[] bArr = f5850S;
        return (bArr[i >>> 24] << Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        this.f5857C0 = b;
        int i3 = i2 + 1;
        byte b2 = b | ((bArr[i2] & 255) << 8);
        this.f5857C0 = b2;
        int i4 = i3 + 1;
        byte b3 = b2 | ((bArr[i3] & 255) << 16);
        this.f5857C0 = b3;
        int i5 = i4 + 1;
        this.f5857C0 = b3 | (bArr[i4] << Ascii.CAN);
        int i6 = i5 + 1;
        byte b4 = bArr[i5] & 255;
        this.f5858C1 = b4;
        int i7 = i6 + 1;
        byte b5 = ((bArr[i6] & 255) << 8) | b4;
        this.f5858C1 = b5;
        int i8 = i7 + 1;
        byte b6 = b5 | ((bArr[i7] & 255) << 16);
        this.f5858C1 = b6;
        int i9 = i8 + 1;
        this.f5858C1 = b6 | (bArr[i8] << Ascii.CAN);
        int i10 = i9 + 1;
        byte b7 = bArr[i9] & 255;
        this.f5859C2 = b7;
        int i11 = i10 + 1;
        byte b8 = ((bArr[i10] & 255) << 8) | b7;
        this.f5859C2 = b8;
        int i12 = i11 + 1;
        byte b9 = b8 | ((bArr[i11] & 255) << 16);
        this.f5859C2 = b9;
        int i13 = i12 + 1;
        this.f5859C2 = b9 | (bArr[i12] << Ascii.CAN);
        int i14 = i13 + 1;
        byte b10 = bArr[i13] & 255;
        this.f5860C3 = b10;
        int i15 = i14 + 1;
        byte b11 = ((bArr[i14] & 255) << 8) | b10;
        this.f5860C3 = b11;
        byte b12 = b11 | ((bArr[i15] & 255) << 16);
        this.f5860C3 = b12;
        this.f5860C3 = (bArr[i15 + 1] << Ascii.CAN) | b12;
    }

    public String getAlgorithmName() {
        return "AES";
    }

    public int getBlockSize() {
        return 16;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
            this.forEncryption = z;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid parameter passed to AES init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            boolean z = this.forEncryption;
            unpackBlock(bArr, i);
            int[][] iArr = this.WorkingKey;
            if (z) {
                encryptBlock(iArr);
            } else {
                decryptBlock(iArr);
            }
            packBlock(bArr2, i2);
            return 16;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
    }
}
