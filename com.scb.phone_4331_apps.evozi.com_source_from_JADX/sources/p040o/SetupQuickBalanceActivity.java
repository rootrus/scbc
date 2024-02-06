package p040o;

import java.io.UnsupportedEncodingException;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.lds.CVCAFile;

/* renamed from: o.SetupQuickBalanceActivity */
public final class SetupQuickBalanceActivity {
    private static final byte[] read = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};

    public static byte[] IconCompatParcelizer(String str) {
        int i;
        String str2 = str;
        int length = str.length();
        while (length > 0 && ((r6 = str2.charAt(length - 1)) == '=' || r6 == 10 || r6 == 13 || r6 == ' ' || r6 == 9)) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        byte b = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str2.charAt(i5);
            if (charAt >= 'A' && charAt <= 'Z') {
                i = charAt - 'A';
            } else if (charAt >= 'a' && charAt <= 'z') {
                i = charAt - 'G';
            } else if (charAt >= '0' && charAt <= '9') {
                i = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i = 62;
            } else if (charAt == '/' || charAt == '_') {
                i = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            b = ((byte) i) | (b << 6);
            i3++;
            if (i3 % 4 == 0) {
                int i6 = i4 + 1;
                bArr[i4] = (byte) (b >> 16);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (b >> 8);
                bArr[i7] = (byte) b;
                i4 = i7 + 1;
            }
        }
        int i8 = i3 % 4;
        if (i8 == 1) {
            return null;
        }
        if (i8 == 2) {
            bArr[i4] = (byte) ((b << 12) >> 16);
            i4++;
        } else if (i8 == 3) {
            int i9 = b << 6;
            int i10 = i4 + 1;
            bArr[i4] = (byte) (i9 >> 16);
            i4 = i10 + 1;
            bArr[i10] = (byte) (i9 >> 8);
        }
        if (i4 == i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    public static String MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        return read(bArr, read);
    }

    private static String read(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(((bArr.length + 2) << 2) / 3)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i + 1;
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr3[i3] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            int i6 = i4 + 1;
            byte b = bArr[i5];
            int i7 = i2 + 2;
            bArr3[i4] = bArr2[((b & 15) << 2) | ((bArr[i7] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = bArr2[bArr[i7] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i8 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(bArr[length] & 3) << 4];
            int i10 = i9 + 1;
            bArr3[i9] = 61;
            i = i10 + 1;
            bArr3[i10] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = i11 + 1;
            byte b2 = bArr[length];
            int i13 = length + 1;
            bArr3[i11] = bArr2[((bArr[i13] & 255) >> 4) | ((b2 & 3) << 4)];
            int i14 = i12 + 1;
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            i = i14 + 1;
            bArr3[i14] = 61;
        }
        try {
            return new String(bArr3, 0, i, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
