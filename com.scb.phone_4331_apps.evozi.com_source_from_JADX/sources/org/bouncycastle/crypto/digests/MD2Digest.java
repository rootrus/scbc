package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Memoable;
import org.jmrtd.lds.CVCAFile;

public class MD2Digest implements ExtendedDigest, Memoable {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: S */
    private static final byte[] f5705S = {41, 46, 67, -55, -94, ISO7816.INS_LOAD_KEY_FILE, 124, 1, 61, 54, 84, ISOFileInfo.f5468A1, -20, -16, 6, 19, ISOFileInfo.FCP_BYTE, -89, 5, -13, ISO7816.INS_GET_RESPONSE, -57, 115, ISOFileInfo.SECURITY_ATTR_COMPACT, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, ISO7816.INS_GET_DATA, 30, -101, 87, 60, -3, -44, ISO7816.INS_CREATE_FILE, Ascii.SYN, 103, CVCAFile.CAR_TAG, ISOFileInfo.FCI_BYTE, Ascii.CAN, ISOFileInfo.LCS_BYTE, Ascii.ETB, -27, Ascii.DC2, -66, 78, -60, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_PUT_DATA, -98, -34, 73, ISOFileInfo.f5467A0, -5, -11, ISOFileInfo.CHANNEL_SECURITY, -69, 47, -18, 122, -87, 104, 121, -111, Ascii.NAK, -78, 7, 63, -108, ISO7816.INS_ENVELOPE, 16, -119, 11, ISO7816.INS_MSE, 95, 33, ISOFileInfo.DATA_BYTES1, Ascii.DEL, 93, -102, 90, -112, ISO7816.INS_INCREASE, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, Ascii.f3248EM, ISO7816.INS_DECREASE, ISO7816.INS_READ_RECORD2, 72, ISOFileInfo.f5470A5, -75, -47, -41, 94, -110, ISO7816.INS_PSO, -84, 86, -86, -58, 79, -72, 56, ISO7816.INS_WRITE_RECORD, -106, -92, 125, ISO7816.INS_READ_RECORD_STAMPED, 118, -4, 107, ISO7816.INS_APPEND_RECORD, -100, 116, 4, -15, 69, -99, ISO7816.INS_MANAGE_CHANNEL, 89, ISOFileInfo.FMD_BYTE, 113, ISOFileInfo.FCI_EXT, 32, -122, 91, -49, 101, -26, 45, -88, 2, Ascii.ESC, 96, 37, -83, -82, ISO7816.INS_READ_BINARY, -71, -10, 28, 70, 97, 105, ISO7816.INS_DECREASE_STAMPED, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, ISO7816.INS_UNBLOCK_CHV, 83, 13, 110, ISOFileInfo.PROP_INFO, 40, -124, 9, -45, -33, -51, -12, 65, ISOFileInfo.DATA_BYTES2, 77, 82, 106, ISO7816.INS_UPDATE_RECORD, 55, -56, 108, -63, ISOFileInfo.f5471AB, -6, ISO7816.INS_CHANGE_CHV, -31, 123, 8, 12, -67, ISO7816.INS_READ_BINARY2, 74, 120, -120, -107, ISOFileInfo.SECURITY_ATTR_EXP, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, ISO7816.INS_WRITE_BINARY, ISO7816.INS_DELETE_FILE, -90, 119, 114, -8, -21, 117, 75, 10, 49, ISO7816.INS_REHABILITATE_CHV, 80, ISO7816.INS_READ_BINARY_STAMPED, -113, -19, Ascii.f3259US, Ascii.SUB, -37, -103, ISOFileInfo.ENV_TEMP_EF, 51, -97, 17, ISOFileInfo.FILE_IDENTIFIER, Ascii.DC4};

    /* renamed from: C */
    private byte[] f5706C = new byte[16];
    private int COff;

    /* renamed from: M */
    private byte[] f5707M = new byte[16];

    /* renamed from: X */
    private byte[] f5708X = new byte[48];
    private int mOff;
    private int xOff;

    public MD2Digest() {
        reset();
    }

    public MD2Digest(MD2Digest mD2Digest) {
        copyIn(mD2Digest);
    }

    private void copyIn(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.f5708X;
        System.arraycopy(bArr, 0, this.f5708X, 0, bArr.length);
        this.xOff = mD2Digest.xOff;
        byte[] bArr2 = mD2Digest.f5707M;
        System.arraycopy(bArr2, 0, this.f5707M, 0, bArr2.length);
        this.mOff = mD2Digest.mOff;
        byte[] bArr3 = mD2Digest.f5706C;
        System.arraycopy(bArr3, 0, this.f5706C, 0, bArr3.length);
        this.COff = mD2Digest.COff;
    }

    public Memoable copy() {
        return new MD2Digest(this);
    }

    public int doFinal(byte[] bArr, int i) {
        int length = this.f5707M.length;
        int i2 = this.mOff;
        byte b = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.f5707M;
            if (i2 < bArr2.length) {
                bArr2[i2] = b;
                i2++;
            } else {
                processCheckSum(bArr2);
                processBlock(this.f5707M);
                processBlock(this.f5706C);
                System.arraycopy(this.f5708X, this.xOff, bArr, i, 16);
                reset();
                return 16;
            }
        }
    }

    public String getAlgorithmName() {
        return "MD2";
    }

    public int getByteLength() {
        return 16;
    }

    public int getDigestSize() {
        return 16;
    }

    /* access modifiers changed from: protected */
    public void processBlock(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f5708X;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.f5708X;
                byte b = (byte) (f5705S[i2] ^ bArr3[i4]);
                bArr3[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    /* access modifiers changed from: protected */
    public void processCheckSum(byte[] bArr) {
        byte b = this.f5706C[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f5706C;
            bArr2[i] = (byte) (f5705S[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            b = bArr2[i];
        }
    }

    public void reset() {
        this.xOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f5708X;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.mOff = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f5707M;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.COff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f5706C;
            if (i3 != bArr3.length) {
                bArr3[i3] = 0;
                i3++;
            } else {
                return;
            }
        }
    }

    public void reset(Memoable memoable) {
        copyIn((MD2Digest) memoable);
    }

    public void update(byte b) {
        byte[] bArr = this.f5707M;
        int i = this.mOff;
        int i2 = i + 1;
        this.mOff = i2;
        bArr[i] = b;
        if (i2 == 16) {
            processCheckSum(bArr);
            processBlock(this.f5707M);
            this.mOff = 0;
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.mOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            System.arraycopy(bArr, i, this.f5707M, 0, 16);
            processCheckSum(this.f5707M);
            processBlock(this.f5707M);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
