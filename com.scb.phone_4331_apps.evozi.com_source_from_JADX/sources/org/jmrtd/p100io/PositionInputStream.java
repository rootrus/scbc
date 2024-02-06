package org.jmrtd.p100io;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* renamed from: org.jmrtd.io.PositionInputStream */
public class PositionInputStream extends InputStream {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long MARK_NOT_SET = -1;
    private InputStream carrier;
    private long markedPosition = -1;
    private long position = 0;

    public PositionInputStream(InputStream inputStream) {
        this.carrier = inputStream;
    }

    public int read() throws IOException {
        int read = this.carrier.read();
        if (read >= 0) {
            this.position++;
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.carrier.read(bArr, i, i2);
        this.position += (long) read;
        return read;
    }

    public long skip(long j) throws IOException {
        long skip = this.carrier.skip(j);
        if (skip <= 0) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Carrier (");
            sb.append(this.carrier.getClass().getCanonicalName());
            sb.append(")'s skip(");
            sb.append(j);
            sb.append(") only skipped ");
            sb.append(skip);
            sb.append(", position = ");
            sb.append(this.position);
            logger.warning(sb.toString());
        }
        this.position += skip;
        return skip;
    }

    public void mark(int i) {
        this.carrier.mark(i);
        this.markedPosition = this.position;
    }

    public void reset() throws IOException {
        this.carrier.reset();
        this.position = this.markedPosition;
    }

    public boolean markSupported() {
        return this.carrier.markSupported();
    }

    public long getPosition() {
        return this.position;
    }
}
