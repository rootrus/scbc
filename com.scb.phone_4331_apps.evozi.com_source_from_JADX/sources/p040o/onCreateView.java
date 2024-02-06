package p040o;

import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.onCreateView */
public final class onCreateView extends FilterInputStream {
    private static final byte[] write = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};
    private int IconCompatParcelizer;
    private final byte MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean markSupported() {
        return false;
    }

    public onCreateView(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot add invalid orientation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final int read() throws IOException {
        int i;
        int i2 = this.IconCompatParcelizer;
        if (i2 < 2 || i2 > 31) {
            i = super.read();
        } else if (i2 == 31) {
            i = this.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            i = write[i2 - 2] & 255;
        }
        if (i != -1) {
            this.IconCompatParcelizer++;
        }
        return i;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.IconCompatParcelizer;
        if (i4 > 31) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == 31) {
            bArr[i] = this.MediaBrowserCompat$CustomActionResultReceiver;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(31 - i4, i2);
            System.arraycopy(write, this.IconCompatParcelizer - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.IconCompatParcelizer += i3;
        }
        return i3;
    }

    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.IconCompatParcelizer = (int) (((long) this.IconCompatParcelizer) + skip);
        }
        return skip;
    }

    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
}
