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
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

public class SM4Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: CK */
    private static final int[] f5912CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* renamed from: FK */
    private static final int[] f5913FK = {-1548633402, 1453994832, 1736282519, -1301273892};
    private static final byte[] Sbox = {ISO7816.INS_UPDATE_BINARY, -112, -23, -2, -52, -31, 61, -73, Ascii.SYN, ISO7816.INS_READ_RECORD_STAMPED, Ascii.DC4, ISO7816.INS_ENVELOPE, 40, -5, ISO7816.INS_UNBLOCK_CHV, 5, 43, 103, -102, 118, ISO7816.INS_PSO, -66, 4, -61, -86, ISO7816.INS_REHABILITATE_CHV, 19, 38, 73, -122, 6, -103, -100, CVCAFile.CAR_TAG, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, ISOFileInfo.FCP_BYTE, ISO7816.INS_DELETE_FILE, ISO7816.INS_READ_RECORD2, 28, -87, -55, 8, -24, -107, ISOFileInfo.DATA_BYTES1, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, Ascii.ETB, -70, ISOFileInfo.FILE_IDENTIFIER, 89, 60, Ascii.f3248EM, -26, ISOFileInfo.PROP_INFO, 79, -88, 104, 107, ISOFileInfo.DATA_BYTES2, -78, 113, ISOFileInfo.FMD_BYTE, ISO7816.INS_PUT_DATA, ISOFileInfo.SECURITY_ATTR_EXP, -8, -21, 15, 75, ISO7816.INS_MANAGE_CHANNEL, 86, -99, 53, 30, ISO7816.INS_CHANGE_CHV, 14, 94, 99, 88, -47, -94, 37, ISO7816.INS_MSE, 124, 59, 1, 33, 120, ISOFileInfo.FCI_EXT, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, ISOFileInfo.f5467A0, -60, -56, -98, -22, -65, ISOFileInfo.LCS_BYTE, ISO7816.INS_WRITE_RECORD, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, Ascii.NAK, ISOFileInfo.f5468A1, ISO7816.INS_CREATE_FILE, -82, 93, -92, -101, ISO7816.INS_DECREASE_STAMPED, Ascii.SUB, 85, -83, -109, ISO7816.INS_INCREASE, ISO7816.INS_DECREASE, -11, ISOFileInfo.SECURITY_ATTR_COMPACT, ISO7816.INS_READ_BINARY2, -29, 29, -10, ISO7816.INS_APPEND_RECORD, 46, -126, 102, ISO7816.INS_GET_DATA, 96, ISO7816.INS_GET_RESPONSE, 41, 35, ISOFileInfo.f5471AB, 13, 83, 78, ISOFileInfo.FCI_BYTE, -43, -37, 55, 69, -34, -3, ISOFileInfo.CHANNEL_SECURITY, 47, 3, -1, 106, 114, 109, 108, 91, 81, ISOFileInfo.ENV_TEMP_EF, Ascii.ESC, -81, -110, -69, -35, PSSSigner.TRAILER_IMPLICIT, Ascii.DEL, 17, -39, 92, 65, Ascii.f3259US, 16, 90, ISO7816.INS_LOAD_KEY_FILE, 10, -63, 49, -120, ISOFileInfo.f5470A5, -51, 123, -67, 45, 116, ISO7816.INS_WRITE_BINARY, Ascii.DC2, -72, -27, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_READ_BINARY, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, Ascii.CAN, -16, 125, -20, 58, ISO7816.INS_UPDATE_RECORD, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};

    /* renamed from: X */
    private final int[] f5914X = new int[4];

    /* renamed from: rk */
    private int[] f5915rk;

    /* renamed from: F0 */
    private int m6269F0(int[] iArr, int i) {
        return m6275T((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i) ^ iArr[0];
    }

    /* renamed from: F1 */
    private int m6270F1(int[] iArr, int i) {
        return m6275T((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i) ^ iArr[1];
    }

    /* renamed from: F2 */
    private int m6271F2(int[] iArr, int i) {
        return m6275T((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i) ^ iArr[2];
    }

    /* renamed from: F3 */
    private int m6272F3(int[] iArr, int i) {
        return m6275T((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i) ^ iArr[3];
    }

    /* renamed from: L */
    private int m6273L(int i) {
        int rotateLeft = rotateLeft(i, 2);
        int rotateLeft2 = rotateLeft(i, 10);
        int rotateLeft3 = rotateLeft(i, 18);
        return (((i ^ rotateLeft) ^ rotateLeft2) ^ rotateLeft3) ^ rotateLeft(i, 24);
    }

    private int L_ap(int i) {
        int rotateLeft = rotateLeft(i, 13);
        return (i ^ rotateLeft) ^ rotateLeft(i, 23);
    }

    /* renamed from: R */
    private void m6274R(int[] iArr, int i) {
        int i2 = i + 1;
        int i3 = i + 2;
        int i4 = i + 3;
        iArr[i] = iArr[i] ^ iArr[i4];
        iArr[i4] = iArr[i] ^ iArr[i4];
        iArr[i] = iArr[i4] ^ iArr[i];
        iArr[i2] = iArr[i2] ^ iArr[i3];
        iArr[i3] = iArr[i2] ^ iArr[i3];
        iArr[i2] = iArr[i2] ^ iArr[i3];
    }

    /* renamed from: T */
    private int m6275T(int i) {
        return m6273L(tau(i));
    }

    private int T_ap(int i) {
        return L_ap(tau(i));
    }

    private int[] expandKey(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {Pack.bigEndianToInt(bArr, 0), Pack.bigEndianToInt(bArr, 4), Pack.bigEndianToInt(bArr, 8), Pack.bigEndianToInt(bArr, 12)};
        int i = iArr2[0];
        int[] iArr3 = f5913FK;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z) {
            iArr[0] = iArr4[0] ^ T_ap(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ f5912CK[0]);
            iArr[1] = iArr4[1] ^ T_ap(((iArr4[2] ^ iArr4[3]) ^ iArr[0]) ^ f5912CK[1]);
            iArr[2] = iArr4[2] ^ T_ap(((iArr4[3] ^ iArr[0]) ^ iArr[1]) ^ f5912CK[2]);
            iArr[3] = iArr4[3] ^ T_ap(((iArr[0] ^ iArr[1]) ^ iArr[2]) ^ f5912CK[3]);
            for (int i2 = 4; i2 < 32; i2++) {
                iArr[i2] = iArr[i2 - 4] ^ T_ap(((iArr[i2 - 3] ^ iArr[i2 - 2]) ^ iArr[i2 - 1]) ^ f5912CK[i2]);
            }
        } else {
            iArr[31] = iArr4[0] ^ T_ap(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ f5912CK[0]);
            iArr[30] = iArr4[1] ^ T_ap(((iArr4[2] ^ iArr4[3]) ^ iArr[31]) ^ f5912CK[1]);
            iArr[29] = iArr4[2] ^ T_ap(((iArr4[3] ^ iArr[31]) ^ iArr[30]) ^ f5912CK[2]);
            iArr[28] = iArr4[3] ^ T_ap(((iArr[31] ^ iArr[30]) ^ iArr[29]) ^ f5912CK[3]);
            for (int i3 = 27; i3 >= 0; i3--) {
                iArr[i3] = iArr[i3 + 4] ^ T_ap(((iArr[i3 + 3] ^ iArr[i3 + 2]) ^ iArr[i3 + 1]) ^ f5912CK[31 - i3]);
            }
        }
        return iArr;
    }

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private int tau(int i) {
        byte[] bArr = Sbox;
        return (bArr[i & 255] & 255) | ((bArr[i >>> 24] & 255) << Ascii.CAN) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }

    public String getAlgorithmName() {
        return "SM4";
    }

    public int getBlockSize() {
        return 16;
    }

    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            if (key.length == 16) {
                this.f5915rk = expandKey(z, key);
                return;
            }
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid parameter passed to SM4 init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.f5915rk == null) {
            throw new IllegalStateException("SM4 not initialised");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            this.f5914X[0] = Pack.bigEndianToInt(bArr, i);
            this.f5914X[1] = Pack.bigEndianToInt(bArr, i + 4);
            this.f5914X[2] = Pack.bigEndianToInt(bArr, i + 8);
            this.f5914X[3] = Pack.bigEndianToInt(bArr, i + 12);
            for (int i3 = 0; i3 < 32; i3 += 4) {
                int[] iArr = this.f5914X;
                iArr[0] = m6269F0(iArr, this.f5915rk[i3]);
                int[] iArr2 = this.f5914X;
                iArr2[1] = m6270F1(iArr2, this.f5915rk[i3 + 1]);
                int[] iArr3 = this.f5914X;
                iArr3[2] = m6271F2(iArr3, this.f5915rk[i3 + 2]);
                int[] iArr4 = this.f5914X;
                iArr4[3] = m6272F3(iArr4, this.f5915rk[i3 + 3]);
            }
            m6274R(this.f5914X, 0);
            Pack.intToBigEndian(this.f5914X[0], bArr2, i2);
            Pack.intToBigEndian(this.f5914X[1], bArr2, i2 + 4);
            Pack.intToBigEndian(this.f5914X[2], bArr2, i2 + 8);
            Pack.intToBigEndian(this.f5914X[3], bArr2, i2 + 12);
            return 16;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
    }
}
