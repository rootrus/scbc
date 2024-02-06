package com.google.common.p002io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.common.io.CountingOutputStream */
public final class CountingOutputStream extends FilterOutputStream {
    private long count;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public final long getCount() {
        return this.count;
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.count += (long) i2;
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        this.count++;
    }
}
