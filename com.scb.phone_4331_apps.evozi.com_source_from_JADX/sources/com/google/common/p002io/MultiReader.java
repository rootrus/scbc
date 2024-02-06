package com.google.common.p002io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/* renamed from: com.google.common.io.MultiReader */
class MultiReader extends Reader {
    private Reader current;

    /* renamed from: it */
    private final Iterator<? extends InputSupplier<? extends Reader>> f3270it;

    MultiReader(Iterator<? extends InputSupplier<? extends Reader>> it) throws IOException {
        this.f3270it = it;
        advance();
    }

    private void advance() throws IOException {
        close();
        if (this.f3270it.hasNext()) {
            this.current = (Reader) ((InputSupplier) this.f3270it.next()).getInput();
        }
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        Reader reader = this.current;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i, i2);
        if (read != -1) {
            return read;
        }
        advance();
        return read(cArr, i, i2);
    }

    public long skip(long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        Preconditions.checkArgument(i >= 0, "n is negative");
        if (i > 0) {
            while (true) {
                Reader reader = this.current;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                advance();
            }
        }
        return 0;
    }

    public boolean ready() throws IOException {
        Reader reader = this.current;
        return reader != null && reader.ready();
    }

    public void close() throws IOException {
        Reader reader = this.current;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.current = null;
            }
        }
    }
}