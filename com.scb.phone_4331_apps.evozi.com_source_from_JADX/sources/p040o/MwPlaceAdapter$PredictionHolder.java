package p040o;

import java.io.IOException;
import java.io.OutputStream;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;

/* renamed from: o.MwPlaceAdapter$PredictionHolder */
public final class MwPlaceAdapter$PredictionHolder implements MwMarketMallSearchAdapter$MwSearchMarketMallViewHolder {
    private byte[] MediaBrowserCompat$ItemReceiver = {ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102};
    private byte[] read = new byte[128];

    private static boolean read(char c) {
        return c == 10 || c == 13 || c == 9 || c == ' ';
    }

    private void read() {
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
            byte[] bArr2 = this.MediaBrowserCompat$ItemReceiver;
            if (i < bArr2.length) {
                this.read[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.read;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }

    public MwPlaceAdapter$PredictionHolder() {
        read();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = bArr[i3] & 255;
            outputStream.write(this.MediaBrowserCompat$ItemReceiver[b >>> 4]);
            outputStream.write(this.MediaBrowserCompat$ItemReceiver[b & 15]);
        }
        return i2 << 1;
    }

    public final int write(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && read(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && read(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b = this.read[str.charAt(i)];
            while (i3 < length && read(str.charAt(i3))) {
                i3++;
            }
            byte b2 = this.read[str.charAt(i3)];
            if ((b | b2) >= 0) {
                outputStream.write((b << 4) | b2);
                i2++;
                i = i3 + 1;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i2;
    }
}
