package p040o;

import java.io.IOException;
import java.io.OutputStream;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.lds.CVCAFile;

/* renamed from: o.MoneyActionAdapter$CustomViewHolder_ViewBinding */
public final class MoneyActionAdapter$CustomViewHolder_ViewBinding implements MwMarketMallSearchAdapter$MwSearchMarketMallViewHolder {
    private byte[] MediaBrowserCompat$CustomActionResultReceiver = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};
    private byte MediaBrowserCompat$ItemReceiver = 61;
    private byte[] read = new byte[128];

    private static boolean write(char c) {
        return c == 10 || c == 13 || c == 9 || c == ' ';
    }

    private void IconCompatParcelizer() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.read;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i < bArr2.length) {
                this.read[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    public MoneyActionAdapter$CustomViewHolder_ViewBinding() {
        IconCompatParcelizer();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3;
        int i4;
        int i5 = i2 % 3;
        int i6 = i2 - i5;
        int i7 = i;
        while (true) {
            i3 = i + i6;
            i4 = 4;
            if (i7 >= i3) {
                break;
            }
            byte b = bArr[i7] & 255;
            byte b2 = bArr[i7 + 1] & 255;
            byte b3 = bArr[i7 + 2] & 255;
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[(b >>> 2) & 63]);
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[((b << 4) | (b2 >>> 4)) & 63]);
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[((b2 << 2) | (b3 >>> 6)) & 63]);
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[b3 & 63]);
            i7 += 3;
        }
        if (i5 == 1) {
            byte b4 = bArr[i3] & 255;
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[(b4 >>> 2) & 63]);
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[(b4 << 4) & 63]);
            outputStream.write(this.MediaBrowserCompat$ItemReceiver);
            outputStream.write(this.MediaBrowserCompat$ItemReceiver);
        } else if (i5 == 2) {
            byte b5 = bArr[i3] & 255;
            byte b6 = bArr[i3 + 1] & 255;
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[(b5 >>> 2) & 63]);
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[((b5 << 4) | (b6 >>> 4)) & 63]);
            outputStream.write(this.MediaBrowserCompat$CustomActionResultReceiver[(b6 << 2) & 63]);
            outputStream.write(this.MediaBrowserCompat$ItemReceiver);
        }
        int i8 = i6 / 3;
        if (i5 == 0) {
            i4 = 0;
        }
        return (i8 << 2) + i4;
    }

    public final int write(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && write(str.charAt(length - 1))) {
            length--;
        }
        int i = length - 4;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i && write(str.charAt(i3))) {
            i3++;
        }
        while (i3 < i) {
            byte b = this.read[str.charAt(i3)];
            do {
                i3++;
                if (i3 >= i || !write(str.charAt(i3))) {
                    byte b2 = this.read[str.charAt(i3)];
                }
                i3++;
                break;
            } while (!write(str.charAt(i3)));
            byte b22 = this.read[str.charAt(i3)];
            do {
                i3++;
                if (i3 >= i || !write(str.charAt(i3))) {
                    byte b3 = this.read[str.charAt(i3)];
                }
                i3++;
                break;
            } while (!write(str.charAt(i3)));
            byte b32 = this.read[str.charAt(i3)];
            do {
                i3++;
                if (i3 >= i || !write(str.charAt(i3))) {
                    byte b4 = this.read[str.charAt(i3)];
                }
                i3++;
                break;
            } while (!write(str.charAt(i3)));
            byte b42 = this.read[str.charAt(i3)];
            if ((b | b22 | b32 | b42) >= 0) {
                outputStream.write((b << 2) | (b22 >> 4));
                outputStream.write((b22 << 4) | (b32 >> 2));
                outputStream.write((b32 << 6) | b42);
                i2 += 3;
                do {
                    i3++;
                    if (i3 >= i || !write(str.charAt(i3))) {
                    }
                    i3++;
                    break;
                } while (!write(str.charAt(i3)));
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(length - 3);
        char charAt3 = str.charAt(length - 2);
        int i4 = 1;
        char charAt4 = str.charAt(length - 1);
        byte b5 = this.MediaBrowserCompat$ItemReceiver;
        if (charAt3 == b5) {
            byte[] bArr = this.read;
            byte b6 = bArr[charAt];
            byte b7 = bArr[charAt2];
            if ((b6 | b7) >= 0) {
                outputStream.write((b7 >> 4) | (b6 << 2));
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        } else if (charAt4 == b5) {
            byte[] bArr2 = this.read;
            byte b8 = bArr2[charAt];
            byte b9 = bArr2[charAt2];
            byte b10 = bArr2[charAt3];
            if ((b8 | b9 | b10) >= 0) {
                outputStream.write((b8 << 2) | (b9 >> 4));
                outputStream.write((b10 >> 2) | (b9 << 4));
                i4 = 2;
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        } else {
            byte[] bArr3 = this.read;
            byte b11 = bArr3[charAt];
            byte b12 = bArr3[charAt2];
            byte b13 = bArr3[charAt3];
            byte b14 = bArr3[charAt4];
            if ((b11 | b12 | b13 | b14) >= 0) {
                outputStream.write((b11 << 2) | (b12 >> 4));
                outputStream.write((b12 << 4) | (b13 >> 2));
                outputStream.write(b14 | (b13 << 6));
                i4 = 3;
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        }
        return i2 + i4;
    }
}
