package p040o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.AudioAttributesImplApi21Parcelizer */
public final class AudioAttributesImplApi21Parcelizer extends FilterInputStream {
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    private int read;

    public AudioAttributesImplApi21Parcelizer(InputStream inputStream, long j) {
        super(inputStream);
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
    }

    public final int available() throws IOException {
        int max;
        synchronized (this) {
            max = (int) Math.max(this.MediaBrowserCompat$CustomActionResultReceiver - ((long) this.read), (long) this.in.available());
        }
        return max;
    }

    public final int read() throws IOException {
        int read2;
        synchronized (this) {
            read2 = super.read();
            read(read2 >= 0 ? 1 : -1);
        }
        return read2;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read2;
        synchronized (this) {
            read2 = read(super.read(bArr, i, i2));
        }
        return read2;
    }

    private int read(int i) throws IOException {
        if (i >= 0) {
            this.read += i;
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver - ((long) this.read) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", but read: ");
            sb.append(this.read);
            throw new IOException(sb.toString());
        }
        return i;
    }
}
