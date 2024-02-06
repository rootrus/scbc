package p040o;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: o.copyTo */
public final class copyTo extends copy1DRangeFromUnchecked {
    private final byte[] MediaBrowserCompat$CustomActionResultReceiver;
    private int read;

    public final long write() {
        return (long) this.read;
    }

    public copyTo(byte[] bArr) {
        this(bArr, 0);
    }

    public copyTo(byte[] bArr, int i) {
        if (bArr != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bArr;
            this.read = i;
            return;
        }
        throw null;
    }

    public final byte MediaBrowserCompat$ItemReceiver() throws IOException {
        int i = this.read;
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i < bArr.length) {
            this.read = i + 1;
            return bArr[i];
        }
        throw new EOFException("End of data reached.");
    }

    public final byte[] IconCompatParcelizer(int i) throws IOException {
        int i2 = this.read;
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i2 + i <= bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, i2, bArr2, 0, i);
            this.read += i;
            return bArr2;
        }
        throw new EOFException("End of data reached.");
    }

    public final void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.read;
        byte[] bArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i3 + i2 <= bArr2.length) {
            System.arraycopy(bArr2, i3, bArr, i, i2);
            this.read += i2;
            return;
        }
        throw new EOFException("End of data reached.");
    }

    public final void write(long j) throws IOException {
        if (j >= 0) {
            long j2 = ((long) this.read) + j;
            if (j2 <= ((long) this.MediaBrowserCompat$CustomActionResultReceiver.length)) {
                this.read = (int) j2;
                return;
            }
            throw new EOFException("End of data reached.");
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(long j) throws IOException {
        if (j >= 0) {
            int i = (int) (((long) this.read) + j);
            this.read = i;
            byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i <= bArr.length) {
                return true;
            }
            this.read = bArr.length;
            return false;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.length - this.read;
    }
}
