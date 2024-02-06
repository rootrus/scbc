package com.google.common.p002io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* renamed from: com.google.common.io.MultiInputStream */
final class MultiInputStream extends InputStream {

    /* renamed from: in */
    private InputStream f3268in;

    /* renamed from: it */
    private Iterator<? extends InputSupplier<? extends InputStream>> f3269it;

    public final boolean markSupported() {
        return false;
    }

    public MultiInputStream(Iterator<? extends InputSupplier<? extends InputStream>> it) throws IOException {
        this.f3269it = it;
        advance();
    }

    public final void close() throws IOException {
        InputStream inputStream = this.f3268in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f3268in = null;
            }
        }
    }

    private void advance() throws IOException {
        close();
        if (this.f3269it.hasNext()) {
            this.f3268in = (InputStream) ((InputSupplier) this.f3269it.next()).getInput();
        }
    }

    public final int available() throws IOException {
        InputStream inputStream = this.f3268in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    public final int read() throws IOException {
        InputStream inputStream = this.f3268in;
        if (inputStream == null) {
            return -1;
        }
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        advance();
        return read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            InputStream inputStream = this.f3268in;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    public final long skip(long j) throws IOException {
        InputStream inputStream = this.f3268in;
        if (inputStream == null || j <= 0) {
            return 0;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0;
        }
        return this.f3268in.skip(j - 1) + 1;
    }
}
