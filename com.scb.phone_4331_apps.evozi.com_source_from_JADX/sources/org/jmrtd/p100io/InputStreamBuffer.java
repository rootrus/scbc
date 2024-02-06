package org.jmrtd.p100io;

import java.io.IOException;
import java.io.InputStream;
import org.jmrtd.p100io.FragmentBuffer;

/* renamed from: org.jmrtd.io.InputStreamBuffer */
public class InputStreamBuffer {
    public FragmentBuffer buffer;
    /* access modifiers changed from: private */
    public PositionInputStream carrier;

    public InputStreamBuffer(InputStream inputStream, int i) {
        PositionInputStream positionInputStream = new PositionInputStream(inputStream);
        this.carrier = positionInputStream;
        positionInputStream.mark(i);
        this.buffer = new FragmentBuffer(i);
    }

    public void updateFrom(InputStreamBuffer inputStreamBuffer) {
        this.buffer.updateFrom(inputStreamBuffer.buffer);
    }

    public SubInputStream getInputStream() {
        SubInputStream subInputStream;
        synchronized (this.carrier) {
            subInputStream = new SubInputStream(this.carrier);
        }
        return subInputStream;
    }

    public int getPosition() {
        int position;
        synchronized (this) {
            position = this.buffer.getPosition();
        }
        return position;
    }

    public int getBytesBuffered() {
        int bytesBuffered;
        synchronized (this) {
            bytesBuffered = this.buffer.getBytesBuffered();
        }
        return bytesBuffered;
    }

    public int getLength() {
        return this.buffer.getLength();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputStreamBuffer [");
        sb.append(this.buffer);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: org.jmrtd.io.InputStreamBuffer$SubInputStream */
    public class SubInputStream extends InputStream {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private int markedPosition = -1;
        private int position = 0;
        private Object syncObject;

        public void close() throws IOException {
        }

        public boolean markSupported() {
            return true;
        }

        public SubInputStream(Object obj) {
            this.syncObject = obj;
        }

        public FragmentBuffer getBuffer() {
            return InputStreamBuffer.this.buffer;
        }

        public int read() throws IOException {
            synchronized (this.syncObject) {
                if (this.position >= InputStreamBuffer.this.buffer.getLength()) {
                    return -1;
                }
                if (InputStreamBuffer.this.buffer.isCoveredByFragment(this.position)) {
                    byte[] buffer = InputStreamBuffer.this.buffer.getBuffer();
                    int i = this.position;
                    this.position = i + 1;
                    byte b = buffer[i];
                    return b & 255;
                }
                if (InputStreamBuffer.this.carrier.markSupported()) {
                    syncCarrierPosition(this.position);
                }
                try {
                    int read = InputStreamBuffer.this.carrier.read();
                    if (read < 0) {
                        return -1;
                    }
                    FragmentBuffer fragmentBuffer = InputStreamBuffer.this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    fragmentBuffer.addFragment(i2, (byte) read);
                    return read;
                } catch (IOException e) {
                    throw e;
                }
            }
        }

        public int read(byte[] bArr) throws IOException {
            int read;
            synchronized (this.syncObject) {
                read = read(bArr, 0, bArr.length);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            synchronized (this.syncObject) {
                if (bArr != null) {
                    if (i >= 0 && i2 >= 0) {
                        if (i2 <= bArr.length - i) {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (i2 > InputStreamBuffer.this.buffer.getLength() - this.position) {
                                i2 = InputStreamBuffer.this.buffer.getLength() - this.position;
                            }
                            if (this.position >= InputStreamBuffer.this.buffer.getLength()) {
                                return -1;
                            }
                            if (InputStreamBuffer.this.carrier.markSupported()) {
                                syncCarrierPosition(this.position);
                            }
                            FragmentBuffer.Fragment smallestUnbufferedFragment = InputStreamBuffer.this.buffer.getSmallestUnbufferedFragment(this.position, i2);
                            if (smallestUnbufferedFragment.getLength() > 0) {
                                int offset = smallestUnbufferedFragment.getOffset() - this.position;
                                int length = smallestUnbufferedFragment.getLength();
                                System.arraycopy(InputStreamBuffer.this.buffer.getBuffer(), this.position, bArr, i, offset);
                                this.position += offset;
                                if (InputStreamBuffer.this.carrier.markSupported()) {
                                    syncCarrierPosition(this.position);
                                }
                                int i3 = i + offset;
                                int read = InputStreamBuffer.this.carrier.read(bArr, i3, length);
                                InputStreamBuffer.this.buffer.addFragment(smallestUnbufferedFragment.getOffset(), bArr, i3, read);
                                this.position += read;
                                return offset + read;
                            }
                            int min = Math.min(i2, InputStreamBuffer.this.buffer.getLength() - this.position);
                            System.arraycopy(InputStreamBuffer.this.buffer.getBuffer(), this.position, bArr, i, min);
                            this.position += min;
                            return min;
                        }
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new NullPointerException();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
            return r2 + r6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long skip(long r6) throws java.io.IOException {
            /*
                r5 = this;
                java.lang.Object r0 = r5.syncObject
                monitor-enter(r0)
                org.jmrtd.io.InputStreamBuffer r1 = org.jmrtd.p100io.InputStreamBuffer.this     // Catch:{ all -> 0x004b }
                org.jmrtd.io.FragmentBuffer r1 = r1.buffer     // Catch:{ all -> 0x004b }
                int r2 = r5.position     // Catch:{ all -> 0x004b }
                int r1 = r1.getBufferedLength(r2)     // Catch:{ all -> 0x004b }
                long r2 = (long) r1     // Catch:{ all -> 0x004b }
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 > 0) goto L_0x001b
                int r1 = r5.position     // Catch:{ all -> 0x004b }
                long r1 = (long) r1     // Catch:{ all -> 0x004b }
                long r1 = r1 + r6
                int r1 = (int) r1     // Catch:{ all -> 0x004b }
                r5.position = r1     // Catch:{ all -> 0x004b }
                monitor-exit(r0)
                return r6
            L_0x001b:
                int r4 = r5.position     // Catch:{ all -> 0x004b }
                int r4 = r4 + r1
                r5.position = r4     // Catch:{ all -> 0x004b }
                org.jmrtd.io.InputStreamBuffer r1 = org.jmrtd.p100io.InputStreamBuffer.this     // Catch:{ all -> 0x004b }
                org.jmrtd.io.PositionInputStream r1 = r1.carrier     // Catch:{ all -> 0x004b }
                boolean r1 = r1.markSupported()     // Catch:{ all -> 0x004b }
                if (r1 == 0) goto L_0x0043
                int r1 = r5.position     // Catch:{ all -> 0x004b }
                r5.syncCarrierPosition(r1)     // Catch:{ all -> 0x004b }
                org.jmrtd.io.InputStreamBuffer r1 = org.jmrtd.p100io.InputStreamBuffer.this     // Catch:{ all -> 0x004b }
                org.jmrtd.io.PositionInputStream r1 = r1.carrier     // Catch:{ all -> 0x004b }
                long r6 = r6 - r2
                long r6 = r1.skip(r6)     // Catch:{ all -> 0x004b }
                int r1 = r5.position     // Catch:{ all -> 0x004b }
                int r4 = (int) r6     // Catch:{ all -> 0x004b }
                int r1 = r1 + r4
                r5.position = r1     // Catch:{ all -> 0x004b }
                goto L_0x0048
            L_0x0043:
                long r6 = r6 - r2
                long r6 = super.skip(r6)     // Catch:{ all -> 0x004b }
            L_0x0048:
                monitor-exit(r0)
                long r2 = r2 + r6
                return r2
            L_0x004b:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.p100io.InputStreamBuffer.SubInputStream.skip(long):long");
        }

        public int available() throws IOException {
            return InputStreamBuffer.this.buffer.getBufferedLength(this.position);
        }

        public void mark(int i) {
            synchronized (this) {
                this.markedPosition = this.position;
            }
        }

        public void reset() throws IOException {
            synchronized (this) {
                if (this.markedPosition >= 0) {
                    this.position = this.markedPosition;
                } else {
                    throw new IOException("Invalid reset, was mark() called?");
                }
            }
        }

        public int getPosition() {
            return this.position;
        }

        private void syncCarrierPosition(int i) throws IOException {
            if (((long) i) != InputStreamBuffer.this.carrier.getPosition()) {
                InputStreamBuffer.this.carrier.reset();
                int i2 = 0;
                while (i2 < i) {
                    i2 = (int) (((long) i2) + InputStreamBuffer.this.carrier.skip((long) (i - i2)));
                }
            }
        }
    }
}
