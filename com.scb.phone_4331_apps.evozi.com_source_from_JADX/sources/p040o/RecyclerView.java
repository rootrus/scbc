package p040o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.RecyclerView */
public final class RecyclerView extends FilterInputStream {
    private int write = PKIFailureInfo.systemUnavail;

    public RecyclerView(InputStream inputStream) {
        super(inputStream);
    }

    public final void mark(int i) {
        synchronized (this) {
            super.mark(i);
            this.write = i;
        }
    }

    public final int read() throws IOException {
        if (write(1) == -1) {
            return -1;
        }
        int read = super.read();
        int i = this.write;
        if (i != Integer.MIN_VALUE) {
            this.write = (int) (((long) i) - 1);
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int write2 = (int) write((long) i2);
        if (write2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, write2);
        long j = (long) read;
        int i3 = this.write;
        if (!(i3 == Integer.MIN_VALUE || j == -1)) {
            this.write = (int) (((long) i3) - j);
        }
        return read;
    }

    public final void reset() throws IOException {
        synchronized (this) {
            super.reset();
            this.write = PKIFailureInfo.systemUnavail;
        }
    }

    public final long skip(long j) throws IOException {
        long write2 = write(j);
        if (write2 == -1) {
            return 0;
        }
        long skip = super.skip(write2);
        int i = this.write;
        if (!(i == Integer.MIN_VALUE || skip == -1)) {
            this.write = (int) (((long) i) - skip);
        }
        return skip;
    }

    public final int available() throws IOException {
        int i = this.write;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    private long write(long j) {
        int i = this.write;
        if (i == 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE) {
            return j;
        }
        long j2 = (long) i;
        return j > j2 ? j2 : j;
    }
}
