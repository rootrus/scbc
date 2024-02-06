package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.jmrtd.lds.CVCAFile;

public class CamelliaLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 255;
    private static final byte[] SBOX1 = {ISO7816.INS_MANAGE_CHANNEL, -126, ISO7816.INS_UNBLOCK_CHV, -20, ISO7816.INS_READ_RECORD2, 39, ISO7816.INS_GET_RESPONSE, -27, ISO7816.INS_DELETE_FILE, ISOFileInfo.PROP_INFO, 87, 53, -22, 12, -82, 65, 35, -17, 107, -109, 69, Ascii.f3248EM, ISOFileInfo.f5470A5, 33, -19, 14, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, Ascii.f3259US, -50, 62, ISO7816.INS_DECREASE, ISO7816.INS_UPDATE_RECORD, 95, 94, -59, 11, Ascii.SUB, -90, -31, 57, ISO7816.INS_GET_DATA, -43, 71, 93, 61, -39, 1, 90, ISO7816.INS_UPDATE_BINARY, 81, 86, 108, 77, ISOFileInfo.SECURITY_ATTR_EXP, 13, -102, 102, -5, -52, ISO7816.INS_READ_BINARY, 45, 116, Ascii.DC2, 43, 32, -16, ISO7816.INS_READ_BINARY2, -124, -103, -33, 76, -53, ISO7816.INS_ENVELOPE, ISO7816.INS_DECREASE_STAMPED, 126, 118, 5, 109, -73, -87, 49, -47, Ascii.ETB, 4, -41, Ascii.DC4, 88, 58, 97, -34, Ascii.ESC, 17, 28, ISO7816.INS_INCREASE, 15, -100, Ascii.SYN, 83, Ascii.CAN, -14, ISO7816.INS_MSE, -2, ISO7816.INS_REHABILITATE_CHV, -49, -78, -61, -75, 122, -111, ISO7816.INS_CHANGE_CHV, 8, -24, -88, 96, -4, 105, 80, -86, ISO7816.INS_WRITE_BINARY, ISOFileInfo.f5467A0, 125, ISOFileInfo.f5468A1, -119, ISOFileInfo.FCP_BYTE, -105, 84, 91, 30, -107, ISO7816.INS_CREATE_FILE, -1, ISOFileInfo.FMD_BYTE, ISO7816.INS_WRITE_RECORD, 16, -60, 0, 72, -93, -9, 117, -37, ISOFileInfo.LCS_BYTE, 3, -26, ISO7816.INS_PUT_DATA, 9, 63, -35, -108, ISOFileInfo.FCI_EXT, 92, ISOFileInfo.FILE_IDENTIFIER, 2, -51, 74, -112, 51, 115, 103, -10, -13, -99, Ascii.DEL, -65, ISO7816.INS_APPEND_RECORD, 82, -101, ISO7816.INS_LOAD_KEY_FILE, 38, -56, 55, -58, 59, ISOFileInfo.DATA_BYTES2, -106, ISOFileInfo.FCI_BYTE, 75, 19, -66, 99, 46, -23, 121, -89, ISOFileInfo.SECURITY_ATTR_COMPACT, -97, 110, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.CHANNEL_SECURITY, 41, -11, -7, ISO7816.INS_READ_RECORD_STAMPED, 47, -3, ISO7816.INS_READ_BINARY_STAMPED, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, 37, ISOFileInfo.f5471AB, CVCAFile.CAR_TAG, -120, -94, ISOFileInfo.ENV_TEMP_EF, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, ISO7816.INS_PSO, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, Ascii.NAK, -29, -83, -12, 119, -57, ISOFileInfo.DATA_BYTES1, -98};
    private static final int[] SIGMA = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};
    private boolean _keyis128;
    private boolean initialized;

    /* renamed from: ke */
    private int[] f5877ke = new int[12];

    /* renamed from: kw */
    private int[] f5878kw = new int[8];
    private int[] state = new int[4];
    private int[] subkey = new int[96];

    private int bytes2int(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private void camelliaF2(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0] ^ iArr2[i];
        int sbox4 = sbox4(i2 & 255);
        int sbox3 = sbox3((i2 >>> 8) & 255);
        int sbox2 = sbox2((i2 >>> 16) & 255);
        byte[] bArr = SBOX1;
        byte b = bArr[i2 >>> 24];
        int i3 = iArr[1] ^ iArr2[i + 1];
        int leftRotate = leftRotate((bArr[i3 & 255] & 255) | (sbox4((i3 >>> 8) & 255) << 8) | (sbox3((i3 >>> 16) & 255) << 16) | (sbox2(i3 >>> 24) << 24), 8);
        int i4 = (((b & 255) << Ascii.CAN) | ((sbox4 | (sbox3 << 8)) | (sbox2 << 16))) ^ leftRotate;
        int leftRotate2 = leftRotate(leftRotate, 8) ^ i4;
        int rightRotate = rightRotate(i4, 8) ^ leftRotate2;
        iArr[2] = (leftRotate(leftRotate2, 16) ^ rightRotate) ^ iArr[2];
        iArr[3] = leftRotate(rightRotate, 8) ^ iArr[3];
        int i5 = iArr[2] ^ iArr2[i + 2];
        int sbox42 = sbox4(i5 & 255);
        int sbox32 = sbox3((i5 >>> 8) & 255);
        int sbox22 = sbox2((i5 >>> 16) & 255);
        byte[] bArr2 = SBOX1;
        byte b2 = bArr2[i5 >>> 24];
        int i6 = iArr2[i + 3] ^ iArr[3];
        int leftRotate3 = leftRotate((sbox2(i6 >>> 24) << 24) | (bArr2[i6 & 255] & 255) | (sbox4((i6 >>> 8) & 255) << 8) | (sbox3((i6 >>> 16) & 255) << 16), 8);
        int i7 = (((b2 & 255) << Ascii.CAN) | (((sbox32 << 8) | sbox42) | (sbox22 << 16))) ^ leftRotate3;
        int leftRotate4 = leftRotate(leftRotate3, 8) ^ i7;
        int rightRotate2 = rightRotate(i7, 8) ^ leftRotate4;
        iArr[0] = (leftRotate(leftRotate4, 16) ^ rightRotate2) ^ iArr[0];
        iArr[1] = iArr[1] ^ leftRotate(rightRotate2, 8);
    }

    private void camelliaFLs(int[] iArr, int[] iArr2, int i) {
        iArr[1] = iArr[1] ^ leftRotate(iArr[0] & iArr2[i], 1);
        iArr[0] = iArr[0] ^ (iArr2[i + 1] | iArr[1]);
        iArr[2] = iArr[2] ^ (iArr2[i + 3] | iArr[3]);
        iArr[3] = leftRotate(iArr2[i + 2] & iArr[2], 1) ^ iArr[3];
    }

    private static void decroldq(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 2;
        int i5 = i2 + 1;
        int i6 = 32 - i;
        iArr2[i4] = (iArr[i2] << i) | (iArr[i5] >>> i6);
        int i7 = i3 + 3;
        int i8 = i2 + 2;
        iArr2[i7] = (iArr[i5] << i) | (iArr[i8] >>> i6);
        int i9 = i2 + 3;
        iArr2[i3] = (iArr[i8] << i) | (iArr[i9] >>> i6);
        int i10 = i3 + 1;
        iArr2[i10] = (iArr[i9] << i) | (iArr[i2] >>> i6);
        iArr[i2] = iArr2[i4];
        iArr[i5] = iArr2[i7];
        iArr[i8] = iArr2[i3];
        iArr[i9] = iArr2[i10];
    }

    private static void decroldqo32(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 2;
        int i5 = i2 + 1;
        int i6 = i - 32;
        int i7 = i2 + 2;
        int i8 = 64 - i;
        iArr2[i4] = (iArr[i5] << i6) | (iArr[i7] >>> i8);
        int i9 = i3 + 3;
        int i10 = i2 + 3;
        iArr2[i9] = (iArr[i7] << i6) | (iArr[i10] >>> i8);
        iArr2[i3] = (iArr[i10] << i6) | (iArr[i2] >>> i8);
        int i11 = i3 + 1;
        iArr2[i11] = (iArr[i5] >>> i8) | (iArr[i2] << i6);
        iArr[i2] = iArr2[i4];
        iArr[i5] = iArr2[i9];
        iArr[i7] = iArr2[i3];
        iArr[i10] = iArr2[i11];
    }

    private void int2bytes(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[(3 - i3) + i2] = (byte) i;
            i >>>= 8;
        }
    }

    private byte lRot8(byte b, int i) {
        return (byte) ((b << i) | ((b & 255) >>> (8 - i)));
    }

    private static int leftRotate(int i, int i2) {
        return (i << i2) + (i >>> (32 - i2));
    }

    private int processBlock128(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            this.state[i3] = bytes2int(bArr, (i3 << 2) + i);
            int[] iArr = this.state;
            iArr[i3] = iArr[i3] ^ this.f5878kw[i3];
        }
        camelliaF2(this.state, this.subkey, 0);
        camelliaF2(this.state, this.subkey, 4);
        camelliaF2(this.state, this.subkey, 8);
        camelliaFLs(this.state, this.f5877ke, 0);
        camelliaF2(this.state, this.subkey, 12);
        camelliaF2(this.state, this.subkey, 16);
        camelliaF2(this.state, this.subkey, 20);
        camelliaFLs(this.state, this.f5877ke, 4);
        camelliaF2(this.state, this.subkey, 24);
        camelliaF2(this.state, this.subkey, 28);
        camelliaF2(this.state, this.subkey, 32);
        int[] iArr2 = this.state;
        int i4 = iArr2[2];
        int[] iArr3 = this.f5878kw;
        iArr2[2] = iArr3[4] ^ i4;
        iArr2[3] = iArr2[3] ^ iArr3[5];
        iArr2[0] = iArr2[0] ^ iArr3[6];
        iArr2[1] = iArr3[7] ^ iArr2[1];
        int2bytes(iArr2[2], bArr2, i2);
        int2bytes(this.state[3], bArr2, i2 + 4);
        int2bytes(this.state[0], bArr2, i2 + 8);
        int2bytes(this.state[1], bArr2, i2 + 12);
        return 16;
    }

    private int processBlock192or256(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            this.state[i3] = bytes2int(bArr, (i3 << 2) + i);
            int[] iArr = this.state;
            iArr[i3] = iArr[i3] ^ this.f5878kw[i3];
        }
        camelliaF2(this.state, this.subkey, 0);
        camelliaF2(this.state, this.subkey, 4);
        camelliaF2(this.state, this.subkey, 8);
        camelliaFLs(this.state, this.f5877ke, 0);
        camelliaF2(this.state, this.subkey, 12);
        camelliaF2(this.state, this.subkey, 16);
        camelliaF2(this.state, this.subkey, 20);
        camelliaFLs(this.state, this.f5877ke, 4);
        camelliaF2(this.state, this.subkey, 24);
        camelliaF2(this.state, this.subkey, 28);
        camelliaF2(this.state, this.subkey, 32);
        camelliaFLs(this.state, this.f5877ke, 8);
        camelliaF2(this.state, this.subkey, 36);
        camelliaF2(this.state, this.subkey, 40);
        camelliaF2(this.state, this.subkey, 44);
        int[] iArr2 = this.state;
        int i4 = iArr2[2];
        int[] iArr3 = this.f5878kw;
        iArr2[2] = i4 ^ iArr3[4];
        iArr2[3] = iArr2[3] ^ iArr3[5];
        iArr2[0] = iArr2[0] ^ iArr3[6];
        iArr2[1] = iArr3[7] ^ iArr2[1];
        int2bytes(iArr2[2], bArr2, i2);
        int2bytes(this.state[3], bArr2, i2 + 4);
        int2bytes(this.state[0], bArr2, i2 + 8);
        int2bytes(this.state[1], bArr2, i2 + 12);
        return 16;
    }

    private static int rightRotate(int i, int i2) {
        return (i >>> i2) + (i << (32 - i2));
    }

    private static void roldq(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i2 + 1;
        int i5 = 32 - i;
        iArr2[i3] = (iArr[i2] << i) | (iArr[i4] >>> i5);
        int i6 = i3 + 1;
        int i7 = i2 + 2;
        iArr2[i6] = (iArr[i4] << i) | (iArr[i7] >>> i5);
        int i8 = i3 + 2;
        int i9 = i2 + 3;
        iArr2[i8] = (iArr[i7] << i) | (iArr[i9] >>> i5);
        int i10 = i3 + 3;
        iArr2[i10] = (iArr[i9] << i) | (iArr[i2] >>> i5);
        iArr[i2] = iArr2[i3];
        iArr[i4] = iArr2[i6];
        iArr[i7] = iArr2[i8];
        iArr[i9] = iArr2[i10];
    }

    private static void roldqo32(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i2 + 1;
        int i5 = i - 32;
        int i6 = i2 + 2;
        int i7 = 64 - i;
        iArr2[i3] = (iArr[i4] << i5) | (iArr[i6] >>> i7);
        int i8 = i3 + 1;
        int i9 = i2 + 3;
        iArr2[i8] = (iArr[i6] << i5) | (iArr[i9] >>> i7);
        int i10 = i3 + 2;
        iArr2[i10] = (iArr[i9] << i5) | (iArr[i2] >>> i7);
        int i11 = i3 + 3;
        iArr2[i11] = (iArr[i4] >>> i7) | (iArr[i2] << i5);
        iArr[i2] = iArr2[i3];
        iArr[i4] = iArr2[i8];
        iArr[i6] = iArr2[i10];
        iArr[i9] = iArr2[i11];
    }

    private int sbox2(int i) {
        return lRot8(SBOX1[i], 1) & 255;
    }

    private int sbox3(int i) {
        return lRot8(SBOX1[i], 7) & 255;
    }

    private int sbox4(int i) {
        return SBOX1[lRot8((byte) i, 1) & 255] & 255;
    }

    private void setKey(boolean z, byte[] bArr) {
        byte[] bArr2 = bArr;
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        int length = bArr2.length;
        if (length != 16) {
            if (length == 24) {
                iArr[0] = bytes2int(bArr2, 0);
                iArr[1] = bytes2int(bArr2, 4);
                iArr[2] = bytes2int(bArr2, 8);
                iArr[3] = bytes2int(bArr2, 12);
                iArr[4] = bytes2int(bArr2, 16);
                iArr[5] = bytes2int(bArr2, 20);
                iArr[6] = ~iArr[4];
                iArr[7] = ~iArr[5];
            } else if (length == 32) {
                iArr[0] = bytes2int(bArr2, 0);
                iArr[1] = bytes2int(bArr2, 4);
                iArr[2] = bytes2int(bArr2, 8);
                iArr[3] = bytes2int(bArr2, 12);
                iArr[4] = bytes2int(bArr2, 16);
                iArr[5] = bytes2int(bArr2, 20);
                iArr[6] = bytes2int(bArr2, 24);
                iArr[7] = bytes2int(bArr2, 28);
            } else {
                throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
            }
            this._keyis128 = false;
        } else {
            this._keyis128 = true;
            iArr[0] = bytes2int(bArr2, 0);
            iArr[1] = bytes2int(bArr2, 4);
            iArr[2] = bytes2int(bArr2, 8);
            iArr[3] = bytes2int(bArr2, 12);
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        }
        for (int i = 0; i < 4; i++) {
            iArr2[i] = iArr[i] ^ iArr[i + 4];
        }
        camelliaF2(iArr2, SIGMA, 0);
        for (int i2 = 0; i2 < 4; i2++) {
            iArr2[i2] = iArr2[i2] ^ iArr[i2];
        }
        camelliaF2(iArr2, SIGMA, 4);
        if (this._keyis128) {
            int[] iArr5 = this.f5878kw;
            if (z) {
                iArr5[0] = iArr[0];
                iArr5[1] = iArr[1];
                iArr5[2] = iArr[2];
                iArr5[3] = iArr[3];
                roldq(15, iArr, 0, this.subkey, 4);
                roldq(30, iArr, 0, this.subkey, 12);
                roldq(15, iArr, 0, iArr4, 0);
                int[] iArr6 = this.subkey;
                iArr6[18] = iArr4[2];
                iArr6[19] = iArr4[3];
                roldq(17, iArr, 0, this.f5877ke, 4);
                roldq(17, iArr, 0, this.subkey, 24);
                roldq(17, iArr, 0, this.subkey, 32);
                int[] iArr7 = this.subkey;
                iArr7[0] = iArr2[0];
                iArr7[1] = iArr2[1];
                iArr7[2] = iArr2[2];
                iArr7[3] = iArr2[3];
                roldq(15, iArr2, 0, iArr7, 8);
                roldq(15, iArr2, 0, this.f5877ke, 0);
                roldq(15, iArr2, 0, iArr4, 0);
                int[] iArr8 = this.subkey;
                iArr8[16] = iArr4[0];
                iArr8[17] = iArr4[1];
                roldq(15, iArr2, 0, iArr8, 20);
                roldqo32(34, iArr2, 0, this.subkey, 28);
                roldq(17, iArr2, 0, this.f5878kw, 4);
                return;
            }
            iArr5[4] = iArr[0];
            iArr5[5] = iArr[1];
            iArr5[6] = iArr[2];
            iArr5[7] = iArr[3];
            decroldq(15, iArr, 0, this.subkey, 28);
            decroldq(30, iArr, 0, this.subkey, 20);
            decroldq(15, iArr, 0, iArr4, 0);
            int[] iArr9 = this.subkey;
            iArr9[16] = iArr4[0];
            iArr9[17] = iArr4[1];
            decroldq(17, iArr, 0, this.f5877ke, 0);
            decroldq(17, iArr, 0, this.subkey, 8);
            decroldq(17, iArr, 0, this.subkey, 0);
            int[] iArr10 = this.subkey;
            iArr10[34] = iArr2[0];
            iArr10[35] = iArr2[1];
            iArr10[32] = iArr2[2];
            iArr10[33] = iArr2[3];
            decroldq(15, iArr2, 0, iArr10, 24);
            decroldq(15, iArr2, 0, this.f5877ke, 4);
            decroldq(15, iArr2, 0, iArr4, 0);
            int[] iArr11 = this.subkey;
            iArr11[18] = iArr4[2];
            iArr11[19] = iArr4[3];
            decroldq(15, iArr2, 0, iArr11, 12);
            decroldqo32(34, iArr2, 0, this.subkey, 4);
            roldq(17, iArr2, 0, this.f5878kw, 0);
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            iArr3[i3] = iArr2[i3] ^ iArr[i3 + 4];
        }
        camelliaF2(iArr3, SIGMA, 8);
        int[] iArr12 = this.f5878kw;
        if (z) {
            iArr12[0] = iArr[0];
            iArr12[1] = iArr[1];
            iArr12[2] = iArr[2];
            iArr12[3] = iArr[3];
            roldqo32(45, iArr, 0, this.subkey, 16);
            roldq(15, iArr, 0, this.f5877ke, 4);
            roldq(17, iArr, 0, this.subkey, 32);
            roldqo32(34, iArr, 0, this.subkey, 44);
            roldq(15, iArr, 4, this.subkey, 4);
            roldq(15, iArr, 4, this.f5877ke, 0);
            roldq(30, iArr, 4, this.subkey, 24);
            roldqo32(34, iArr, 4, this.subkey, 36);
            roldq(15, iArr2, 0, this.subkey, 8);
            roldq(30, iArr2, 0, this.subkey, 20);
            int[] iArr13 = this.f5877ke;
            iArr13[8] = iArr2[1];
            iArr13[9] = iArr2[2];
            iArr13[10] = iArr2[3];
            iArr13[11] = iArr2[0];
            roldqo32(49, iArr2, 0, this.subkey, 40);
            int[] iArr14 = this.subkey;
            iArr14[0] = iArr3[0];
            iArr14[1] = iArr3[1];
            iArr14[2] = iArr3[2];
            iArr14[3] = iArr3[3];
            roldq(30, iArr3, 0, iArr14, 12);
            roldq(30, iArr3, 0, this.subkey, 28);
            roldqo32(51, iArr3, 0, this.f5878kw, 4);
            return;
        }
        iArr12[4] = iArr[0];
        iArr12[5] = iArr[1];
        iArr12[6] = iArr[2];
        iArr12[7] = iArr[3];
        decroldqo32(45, iArr, 0, this.subkey, 28);
        decroldq(15, iArr, 0, this.f5877ke, 4);
        decroldq(17, iArr, 0, this.subkey, 12);
        decroldqo32(34, iArr, 0, this.subkey, 0);
        decroldq(15, iArr, 4, this.subkey, 40);
        decroldq(15, iArr, 4, this.f5877ke, 8);
        decroldq(30, iArr, 4, this.subkey, 20);
        decroldqo32(34, iArr, 4, this.subkey, 8);
        decroldq(15, iArr2, 0, this.subkey, 36);
        decroldq(30, iArr2, 0, this.subkey, 24);
        int[] iArr15 = this.f5877ke;
        iArr15[2] = iArr2[1];
        iArr15[3] = iArr2[2];
        iArr15[0] = iArr2[3];
        iArr15[1] = iArr2[0];
        decroldqo32(49, iArr2, 0, this.subkey, 4);
        int[] iArr16 = this.subkey;
        iArr16[46] = iArr3[0];
        iArr16[47] = iArr3[1];
        iArr16[44] = iArr3[2];
        iArr16[45] = iArr3[3];
        decroldq(30, iArr3, 0, iArr16, 32);
        decroldq(30, iArr3, 0, this.subkey, 16);
        roldqo32(51, iArr3, 0, this.f5878kw, 0);
    }

    public String getAlgorithmName() {
        return "Camellia";
    }

    public int getBlockSize() {
        return 16;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            setKey(z, ((KeyParameter) cipherParameters).getKey());
            this.initialized = true;
            return;
        }
        throw new IllegalArgumentException("only simple KeyParameter expected.");
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException {
        if (!this.initialized) {
            throw new IllegalStateException("Camellia is not initialized");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            return this._keyis128 ? processBlock128(bArr, i, bArr2, i2) : processBlock192or256(bArr, i, bArr2, i2);
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
    }
}
