package org.bouncycastle.crypto.prng;

import com.google.common.base.Ascii;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

public class VMPCRandomGenerator implements RandomGenerator {

    /* renamed from: P */
    private byte[] f6078P = {-69, ISO7816.INS_UNBLOCK_CHV, ISOFileInfo.FCP_BYTE, Ascii.DEL, -75, -86, -44, 13, ISOFileInfo.DATA_BYTES2, -2, -78, -126, -53, ISOFileInfo.f5467A0, ISOFileInfo.f5468A1, 8, Ascii.CAN, 113, 86, -24, 73, 2, 16, -60, -34, 53, ISOFileInfo.f5470A5, -20, ISOFileInfo.DATA_BYTES1, Ascii.DC2, -72, 105, ISO7816.INS_PUT_DATA, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, ISO7816.INS_CREATE_FILE, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, ISO7816.INS_LOAD_KEY_FILE, 81, -82, 80, ISOFileInfo.PROP_INFO, 60, 10, ISO7816.INS_DELETE_FILE, -13, -100, 38, 35, 83, -55, ISOFileInfo.FILE_IDENTIFIER, -105, 70, ISO7816.INS_READ_BINARY2, -103, ISOFileInfo.FMD_BYTE, 49, 119, -43, 29, ISO7816.INS_UPDATE_BINARY, 120, -67, 94, ISO7816.INS_READ_BINARY, ISOFileInfo.LCS_BYTE, ISO7816.INS_MSE, 56, -8, 104, 43, ISO7816.INS_PSO, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.FCI_BYTE, -33, 4, -27, -107, 62, 37, -122, -90, 11, -113, -15, ISO7816.INS_CHANGE_CHV, 14, -41, 64, ISO7816.INS_READ_RECORD2, -49, 126, 6, Ascii.NAK, -102, 77, 28, -93, -37, ISO7816.INS_INCREASE, -110, 88, 17, 39, -12, 89, ISO7816.INS_WRITE_BINARY, 78, 106, Ascii.ETB, 91, -84, -1, 7, ISO7816.INS_GET_RESPONSE, 101, 121, -4, -57, -51, 118, CVCAFile.CAR_TAG, 93, -25, 58, ISO7816.INS_DECREASE_STAMPED, 122, ISO7816.INS_DECREASE, 40, 15, 115, 1, -7, -47, ISO7816.INS_WRITE_RECORD, Ascii.f3248EM, -23, -111, -71, 90, -19, 65, 109, ISO7816.INS_READ_BINARY_STAMPED, -61, -98, -65, 99, -6, Ascii.f3259US, 51, 96, 71, -119, -16, -106, Ascii.SUB, 95, -109, 61, 55, 75, -39, -88, -63, Ascii.ESC, -10, 57, ISOFileInfo.SECURITY_ATTR_EXP, -73, 12, 32, -50, -120, 110, ISO7816.INS_READ_RECORD_STAMPED, 116, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, Ascii.SYN, 41, -14, ISOFileInfo.FCI_EXT, -11, -21, ISO7816.INS_MANAGE_CHANNEL, -29, -5, 85, -97, -58, ISO7816.INS_REHABILITATE_CHV, 74, 69, 125, ISO7816.INS_APPEND_RECORD, 107, 92, 108, 102, -87, ISOFileInfo.SECURITY_ATTR_COMPACT, -18, -124, 19, -89, 30, -99, ISO7816.INS_UPDATE_RECORD, 103, 72, -70, 46, -26, -92, ISOFileInfo.f5471AB, 124, -108, 0, 33, -17, -22, -66, ISO7816.INS_GET_DATA, 114, 79, 82, -104, 63, ISO7816.INS_ENVELOPE, Ascii.DC4, 123, 59, 84};

    /* renamed from: n */
    private byte f6079n = 0;

    /* renamed from: s */
    private byte f6080s = -66;

    public void addSeedMaterial(long j) {
        addSeedMaterial(Pack.longToBigEndian(j));
    }

    public void addSeedMaterial(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.f6078P;
            byte b2 = this.f6080s;
            byte b3 = this.f6079n;
            byte b4 = b3 & 255;
            byte b5 = bArr2[(b2 + bArr2[b4] + b) & 255];
            this.f6080s = b5;
            byte b6 = bArr2[b4];
            byte b7 = b5 & 255;
            bArr2[b4] = bArr2[b7];
            bArr2[b7] = b6;
            this.f6079n = (byte) (b3 + 1);
        }
    }

    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.f6078P) {
            for (int i3 = i; i3 != i2 + i; i3++) {
                byte b = this.f6078P[(this.f6080s + this.f6078P[this.f6079n & 255]) & 255];
                this.f6080s = b;
                byte b2 = b & 255;
                bArr[i3] = this.f6078P[(this.f6078P[this.f6078P[b2] & 255] + 1) & 255];
                byte b3 = this.f6078P[this.f6079n & 255];
                this.f6078P[this.f6079n & 255] = this.f6078P[b2];
                this.f6078P[b2] = b3;
                this.f6079n = (byte) (this.f6079n + 1);
            }
        }
    }
}
