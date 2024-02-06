package p040o;

import com.google.common.base.Ascii;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.CVCAFile;

/* renamed from: o.SuitabilitySummaryAdapter$SuitabilitySummaryHeaderViewHolder */
public final class SuitabilitySummaryAdapter$SuitabilitySummaryHeaderViewHolder implements C10432xa04fa290 {
    private static final byte[][] write = {new byte[]{-87, 103, ISO7816.INS_READ_RECORD2, -24, 4, -3, -93, 118, -102, -110, ISOFileInfo.DATA_BYTES1, 120, ISO7816.INS_DELETE_FILE, -35, -47, 56, 13, -58, 53, -104, Ascii.CAN, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, ISO7816.INS_WRITE_BINARY, ISOFileInfo.SECURITY_ATTR_EXP, ISO7816.INS_DECREASE, -124, 84, -33, 35, Ascii.f3248EM, 91, 61, 89, -13, -82, -94, -126, 99, 1, ISOFileInfo.FILE_IDENTIFIER, 46, -39, 81, -101, 124, -90, -21, ISOFileInfo.f5470A5, -66, Ascii.SYN, 12, -29, 97, ISO7816.INS_GET_RESPONSE, ISOFileInfo.SECURITY_ATTR_COMPACT, 58, -11, 115, ISO7816.INS_UNBLOCK_CHV, 37, 11, -69, 78, -119, 107, 83, 106, ISO7816.INS_READ_BINARY_STAMPED, -15, -31, -26, -67, 69, ISO7816.INS_APPEND_RECORD, -12, ISO7816.INS_READ_RECORD_STAMPED, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, ISOFileInfo.CHANNEL_SECURITY, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, ISOFileInfo.FCP_BYTE, 113, ISOFileInfo.DATA_BYTES2, 121, 9, -83, ISO7816.INS_CHANGE_CHV, -51, -7, ISO7816.INS_LOAD_KEY_FILE, -27, -59, -71, 77, ISO7816.INS_REHABILITATE_CHV, 8, -122, -25, ISOFileInfo.f5468A1, 29, -86, -19, 6, ISO7816.INS_MANAGE_CHANNEL, -78, ISO7816.INS_WRITE_RECORD, 65, 123, ISOFileInfo.f5467A0, 17, 49, ISO7816.INS_ENVELOPE, 39, -112, 32, -10, 96, -1, -106, 92, ISO7816.INS_READ_BINARY2, ISOFileInfo.f5471AB, -98, -100, 82, Ascii.ESC, 95, -109, 10, -17, -111, ISOFileInfo.PROP_INFO, 73, -18, 45, 79, -113, 59, 71, ISOFileInfo.FCI_EXT, 109, 70, ISO7816.INS_UPDATE_BINARY, 62, 105, ISOFileInfo.FMD_BYTE, ISO7816.INS_PSO, -50, -53, 47, -4, -105, 5, 122, -84, Ascii.DEL, -43, Ascii.SUB, 75, 14, -89, 90, 40, Ascii.DC4, 63, 41, -120, 60, 76, 2, -72, ISO7816.INS_PUT_DATA, ISO7816.INS_READ_BINARY, Ascii.ETB, 85, Ascii.f3259US, ISOFileInfo.LCS_BYTE, 125, 87, -57, ISOFileInfo.ENV_TEMP_EF, 116, -73, -60, -97, 114, 126, Ascii.NAK, ISO7816.INS_MSE, Ascii.DC2, 88, 7, -103, ISO7816.INS_DECREASE_STAMPED, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, ISO7816.INS_UPDATE_RECORD, -2, ISO7816.INS_INCREASE, -92, ISO7816.INS_GET_DATA, 16, 33, -16, -45, 93, 15, 0, ISOFileInfo.FCI_BYTE, -99, 54, CVCAFile.CAR_TAG, 74, 94, -63, ISO7816.INS_CREATE_FILE}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_INCREASE, ISO7816.INS_LOAD_KEY_FILE, -3, 55, 113, -15, -31, ISO7816.INS_DECREASE, 15, -8, Ascii.ESC, ISOFileInfo.FCI_EXT, -6, 6, 63, 94, -70, -82, 91, ISOFileInfo.LCS_BYTE, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, ISO7816.INS_READ_BINARY2, 14, ISOFileInfo.DATA_BYTES1, 93, ISO7816.INS_WRITE_RECORD, -43, ISOFileInfo.f5467A0, -124, 7, Ascii.DC4, -75, -112, ISO7816.INS_UNBLOCK_CHV, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, ISO7816.INS_READ_BINARY, -67, 90, -4, 96, ISOFileInfo.FCP_BYTE, -106, 108, CVCAFile.CAR_TAG, -9, 16, 124, 40, 39, ISOFileInfo.SECURITY_ATTR_COMPACT, 19, -107, -100, -57, ISO7816.INS_CHANGE_CHV, 70, 59, ISO7816.INS_MANAGE_CHANNEL, ISO7816.INS_GET_DATA, -29, ISOFileInfo.PROP_INFO, -53, 17, ISO7816.INS_WRITE_BINARY, -109, -72, -90, ISOFileInfo.FILE_IDENTIFIER, 32, -1, -97, 119, -61, -52, 3, ISOFileInfo.FCI_BYTE, 8, -65, 64, -25, 43, ISO7816.INS_APPEND_RECORD, 121, 12, -86, -126, 65, 58, -22, -71, ISO7816.INS_DELETE_FILE, -102, -92, -105, 126, ISO7816.INS_PUT_DATA, 122, Ascii.ETB, 102, -108, ISOFileInfo.f5468A1, 29, 61, -16, -34, ISO7816.INS_READ_RECORD2, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, ISO7816.INS_PSO, 73, ISOFileInfo.DATA_BYTES2, -120, -18, 33, -60, Ascii.SUB, -21, -39, -59, 57, -103, -51, -83, 49, ISOFileInfo.SECURITY_ATTR_EXP, 1, Ascii.CAN, 35, -35, Ascii.f3259US, 78, 45, -7, 72, 79, -14, 101, ISOFileInfo.CHANNEL_SECURITY, 120, 92, 88, Ascii.f3248EM, ISOFileInfo.ENV_TEMP_EF, -27, -104, 87, 103, Ascii.DEL, 5, ISOFileInfo.FMD_BYTE, -81, 99, ISO7816.INS_READ_RECORD_STAMPED, -2, -11, -73, 60, ISOFileInfo.f5470A5, -50, -23, 104, ISO7816.INS_REHABILITATE_CHV, ISO7816.INS_CREATE_FILE, 77, 67, 105, 41, 46, -84, Ascii.NAK, 89, -88, 10, -98, 110, 71, -33, ISO7816.INS_DECREASE_STAMPED, 53, 106, -49, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, -55, ISO7816.INS_GET_RESPONSE, -101, -119, -44, -19, ISOFileInfo.f5471AB, Ascii.DC2, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, ISO7816.INS_READ_BINARY_STAMPED, 80, 4, -10, ISO7816.INS_ENVELOPE, Ascii.SYN, 37, -122, 86, 85, 9, -66, -111}};
    private int[] IconCompatParcelizer = new int[256];
    private int[] MediaBrowserCompat$CustomActionResultReceiver = new int[256];
    private int[] MediaBrowserCompat$ItemReceiver = new int[256];
    private int[] read = new int[256];

    private static int IconCompatParcelizer(int i) {
        int i2 = 0;
        int i3 = (i & 2) != 0 ? CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : 0;
        if ((i & 1) != 0) {
            i2 = 90;
        }
        return ((i >> 2) ^ i3) ^ i2;
    }

    public final int IconCompatParcelizer() {
        return 16;
    }

    public SuitabilitySummaryAdapter$SuitabilitySummaryHeaderViewHolder() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i = 0; i < 256; i++) {
            int i2 = write[0][i] & 255;
            iArr[0] = i2;
            iArr2[0] = (IconCompatParcelizer(i2) ^ i2) & 255;
            int i3 = i2 & 1;
            int i4 = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            iArr3[0] = ((i2 ^ ((i3 != 0 ? 180 : 0) ^ (i2 >> 1))) ^ IconCompatParcelizer(i2)) & 255;
            int i5 = write[1][i] & 255;
            iArr[1] = i5;
            iArr2[1] = (IconCompatParcelizer(i5) ^ i5) & 255;
            if ((i5 & 1) == 0) {
                i4 = 0;
            }
            iArr3[1] = ((i5 ^ (i4 ^ (i5 >> 1))) ^ IconCompatParcelizer(i5)) & 255;
            this.MediaBrowserCompat$ItemReceiver[i] = iArr[1] | (iArr2[1] << 8) | (iArr3[1] << 16) | (iArr3[1] << 24);
            this.read[i] = iArr3[0] | (iArr3[0] << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            this.IconCompatParcelizer[i] = (iArr3[1] << 24) | iArr2[1] | (iArr3[1] << 8) | (iArr[1] << 16);
            this.MediaBrowserCompat$CustomActionResultReceiver[i] = iArr2[0] | (iArr[0] << 8) | (iArr3[0] << 16) | (iArr2[0] << 24);
        }
    }
}
