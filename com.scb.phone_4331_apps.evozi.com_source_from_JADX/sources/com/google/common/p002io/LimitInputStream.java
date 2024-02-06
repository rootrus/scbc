package com.google.common.p002io;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.common.io.LimitInputStream */
public final class LimitInputStream extends FilterInputStream {
    private long left;
    private long mark = -1;

    public LimitInputStream(InputStream inputStream, long j) {
        super(inputStream);
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkArgument(j >= 0, "limit must be non-negative");
        this.left = j;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.left);
    }

    public final void mark(int i) {
        this.in.mark(i);
        this.mark = this.left;
    }

    public final int read() throws IOException {
        if (this.left == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.left--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.left;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.left -= (long) read;
        }
        return read;
    }

    public final void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.mark != -1) {
            this.in.reset();
            this.left = this.mark;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.left));
        this.left -= skip;
        return skip;
    }
}
