package org.jmrtd.p100io;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import org.jmrtd.p100io.InputStreamBuffer;

/* renamed from: org.jmrtd.io.SplittableInputStream */
public class SplittableInputStream extends InputStream {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private InputStreamBuffer.SubInputStream carrier;
    public InputStreamBuffer inputStreamBuffer;

    public SplittableInputStream(InputStream inputStream, int i) {
        InputStreamBuffer inputStreamBuffer2 = new InputStreamBuffer(inputStream, i);
        this.inputStreamBuffer = inputStreamBuffer2;
        this.carrier = inputStreamBuffer2.getInputStream();
    }

    public void updateFrom(SplittableInputStream splittableInputStream) {
        this.inputStreamBuffer.updateFrom(splittableInputStream.inputStreamBuffer);
    }

    public InputStream getInputStream(int i) {
        try {
            InputStreamBuffer.SubInputStream inputStream = this.inputStreamBuffer.getInputStream();
            long j = 0;
            while (true) {
                long j2 = (long) i;
                if (j >= j2) {
                    return inputStream;
                }
                j += inputStream.skip(j2 - j);
            }
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            throw new IllegalStateException(e.getMessage());
        }
    }

    public int getPosition() {
        return this.carrier.getPosition();
    }

    public int read() throws IOException {
        return this.carrier.read();
    }

    public long skip(long j) throws IOException {
        return this.carrier.skip(j);
    }

    public int available() throws IOException {
        return this.carrier.available();
    }

    public void close() throws IOException {
        this.carrier.close();
    }

    public void mark(int i) {
        synchronized (this) {
            this.carrier.mark(i);
        }
    }

    public void reset() throws IOException {
        synchronized (this) {
            this.carrier.reset();
        }
    }

    public boolean markSupported() {
        return this.carrier.markSupported();
    }

    public int getLength() {
        return this.inputStreamBuffer.getLength();
    }

    public int getBytesBuffered() {
        return this.inputStreamBuffer.getBytesBuffered();
    }
}
