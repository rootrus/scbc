package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.copyFromUnchecked */
public final class copyFromUnchecked extends copy1DRangeFromUnchecked {
    private long read;
    private final InputStream write;

    public final long write() {
        return this.read;
    }

    public copyFromUnchecked(InputStream inputStream) {
        if (inputStream != null) {
            this.write = inputStream;
            this.read = 0;
            return;
        }
        throw null;
    }

    public final byte MediaBrowserCompat$ItemReceiver() throws IOException {
        int read2 = this.write.read();
        if (read2 != -1) {
            this.read++;
            return (byte) read2;
        }
        throw new EOFException("End of data reached.");
    }

    public final byte[] IconCompatParcelizer(int i) throws IOException {
        byte[] bArr = new byte[i];
        IconCompatParcelizer(bArr, 0, i);
        return bArr;
    }

    public final void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 != i2) {
            int read2 = this.write.read(bArr, i + i3, i2 - i3);
            if (read2 != -1) {
                i3 += read2;
            } else {
                throw new EOFException("End of data reached.");
            }
        }
        this.read += (long) i3;
    }

    public final void write(long j) throws IOException {
        if (j >= 0) {
            long IconCompatParcelizer = IconCompatParcelizer(j);
            if (IconCompatParcelizer != j) {
                throw new EOFException(String.format("Unable to skip. Requested %d bytes but skipped %d.", new Object[]{Long.valueOf(j), Long.valueOf(IconCompatParcelizer)}));
            }
            return;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(long j) throws IOException {
        if (j >= 0) {
            return IconCompatParcelizer(j) == j;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    public final int IconCompatParcelizer() {
        try {
            return this.write.available();
        } catch (IOException unused) {
            return 0;
        }
    }

    private long IconCompatParcelizer(long j) throws IOException {
        long j2 = 0;
        while (j2 != j) {
            long skip = this.write.skip(j - j2);
            j2 += skip;
            if (skip == 0) {
                break;
            }
        }
        this.read += j2;
        return j2;
    }
}
