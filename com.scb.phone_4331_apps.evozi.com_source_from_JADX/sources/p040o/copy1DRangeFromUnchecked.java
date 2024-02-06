package p040o;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: o.copy1DRangeFromUnchecked */
public abstract class copy1DRangeFromUnchecked {
    public boolean IconCompatParcelizer = true;

    public abstract int IconCompatParcelizer();

    public abstract void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException;

    public abstract byte[] IconCompatParcelizer(int i) throws IOException;

    public abstract boolean MediaBrowserCompat$CustomActionResultReceiver(long j) throws IOException;

    public abstract byte MediaBrowserCompat$ItemReceiver() throws IOException;

    public abstract long write() throws IOException;

    public abstract void write(long j) throws IOException;

    public final int RatingCompat() throws IOException {
        byte b;
        byte b2;
        if (this.IconCompatParcelizer) {
            b2 = (MediaBrowserCompat$ItemReceiver() << 8) & 65280;
            b = MediaBrowserCompat$ItemReceiver() & 255;
        } else {
            b2 = MediaBrowserCompat$ItemReceiver() & 255;
            b = 65280 & (MediaBrowserCompat$ItemReceiver() << 8);
        }
        return b2 | b;
    }

    public final short read() throws IOException {
        short s;
        short s2;
        if (this.IconCompatParcelizer) {
            s2 = (((short) MediaBrowserCompat$ItemReceiver()) << 8) & -256;
            s = ((short) MediaBrowserCompat$ItemReceiver()) & 255;
        } else {
            s2 = ((short) MediaBrowserCompat$ItemReceiver()) & 255;
            s = (((short) MediaBrowserCompat$ItemReceiver()) << 8) & -256;
        }
        return (short) (s2 | s);
    }

    public final long MediaMetadataCompat() throws IOException {
        if (this.IconCompatParcelizer) {
            long MediaBrowserCompat$ItemReceiver = 4278190080L & (((long) MediaBrowserCompat$ItemReceiver()) << 24);
            long MediaBrowserCompat$ItemReceiver2 = (((long) MediaBrowserCompat$ItemReceiver()) << 8) & 65280;
            return (((long) MediaBrowserCompat$ItemReceiver()) & 255) | MediaBrowserCompat$ItemReceiver2 | ((((long) MediaBrowserCompat$ItemReceiver()) << 16) & 16711680) | MediaBrowserCompat$ItemReceiver;
        }
        long MediaBrowserCompat$ItemReceiver3 = (long) MediaBrowserCompat$ItemReceiver();
        long MediaBrowserCompat$ItemReceiver4 = (long) MediaBrowserCompat$ItemReceiver();
        long j = ((MediaBrowserCompat$ItemReceiver4 << 8) & 65280) | (255 & MediaBrowserCompat$ItemReceiver3);
        return j | ((((long) MediaBrowserCompat$ItemReceiver()) << 16) & 16711680) | ((((long) MediaBrowserCompat$ItemReceiver()) << 24) & 4278190080L);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        byte b;
        byte b2;
        if (this.IconCompatParcelizer) {
            b2 = ((MediaBrowserCompat$ItemReceiver() << Ascii.CAN) & -16777216) | ((MediaBrowserCompat$ItemReceiver() << 16) & 16711680) | ((MediaBrowserCompat$ItemReceiver() << 8) & 65280);
            b = MediaBrowserCompat$ItemReceiver() & 255;
        } else {
            b2 = (MediaBrowserCompat$ItemReceiver() & 255) | (65280 & (MediaBrowserCompat$ItemReceiver() << 8)) | (16711680 & (MediaBrowserCompat$ItemReceiver() << 16));
            b = -16777216 & (MediaBrowserCompat$ItemReceiver() << Ascii.CAN);
        }
        return b2 | b;
    }

    public final createFromBitmap MediaBrowserCompat$ItemReceiver(int i, Charset charset) throws IOException {
        return new createFromBitmap(MediaBrowserCompat$ItemReceiver(i), charset);
    }

    public final byte[] MediaBrowserCompat$ItemReceiver(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            byte MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
            bArr[i2] = MediaBrowserCompat$ItemReceiver;
            if (MediaBrowserCompat$ItemReceiver == 0) {
                break;
            }
            i2++;
        }
        if (i2 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        if (i2 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i2);
        }
        return bArr2;
    }
}
