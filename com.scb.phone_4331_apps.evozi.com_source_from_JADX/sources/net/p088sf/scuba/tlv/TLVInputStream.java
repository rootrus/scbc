package net.p088sf.scuba.tlv;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import p040o.TouchPointLivenessCheckActivity;

/* renamed from: net.sf.scuba.tlv.TLVInputStream */
public class TLVInputStream extends InputStream {
    public TouchPointLivenessCheckActivity IconCompatParcelizer;
    private TouchPointLivenessCheckActivity MediaBrowserCompat$ItemReceiver;
    private DataInputStream read;

    public TLVInputStream(InputStream inputStream) {
        if ((inputStream instanceof BufferedInputStream) || (inputStream instanceof ByteArrayInputStream)) {
            try {
                inputStream.available();
            } catch (IOException unused) {
            }
        }
        this.read = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.IconCompatParcelizer = new TouchPointLivenessCheckActivity();
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final int write() throws IOException {
        if (this.IconCompatParcelizer.read || this.IconCompatParcelizer.IconCompatParcelizer) {
            try {
                int readUnsignedByte = this.read.readUnsignedByte();
                int i = 1;
                while (true) {
                    if (readUnsignedByte != 0 && readUnsignedByte != 255) {
                        break;
                    }
                    readUnsignedByte = this.read.readUnsignedByte();
                    i++;
                }
                if ((readUnsignedByte & 31) == 31) {
                    int readUnsignedByte2 = this.read.readUnsignedByte();
                    while (true) {
                        i++;
                        if ((readUnsignedByte2 & 128) != 128) {
                            break;
                        }
                        readUnsignedByte = (readUnsignedByte << 8) | (readUnsignedByte2 & 127);
                        readUnsignedByte2 = this.read.readUnsignedByte();
                    }
                    readUnsignedByte = (readUnsignedByte << 8) | (readUnsignedByte2 & 127);
                }
                TouchPointLivenessCheckActivity touchPointLivenessCheckActivity = this.IconCompatParcelizer;
                TouchPointLivenessCheckActivity.write write = new TouchPointLivenessCheckActivity.write(readUnsignedByte);
                if (!touchPointLivenessCheckActivity.write.isEmpty()) {
                    touchPointLivenessCheckActivity.write.peek().MediaBrowserCompat$ItemReceiver += i;
                }
                touchPointLivenessCheckActivity.write.push(write);
                touchPointLivenessCheckActivity.read = false;
                touchPointLivenessCheckActivity.MediaBrowserCompat$CustomActionResultReceiver = true;
                touchPointLivenessCheckActivity.IconCompatParcelizer = false;
                return readUnsignedByte;
            } catch (IOException e) {
                throw e;
            }
        } else {
            throw new IllegalStateException("Not at start of tag");
        }
    }

    public final int IconCompatParcelizer() throws IOException {
        int i;
        try {
            if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
                int readUnsignedByte = this.read.readUnsignedByte();
                if ((readUnsignedByte & 128) == 0) {
                    i = 1;
                } else {
                    int i2 = 0;
                    i = 1;
                    for (int i3 = 0; i3 < (readUnsignedByte & 127); i3++) {
                        i++;
                        i2 = (i2 << 8) | this.read.readUnsignedByte();
                    }
                    readUnsignedByte = i2;
                }
                TouchPointLivenessCheckActivity touchPointLivenessCheckActivity = this.IconCompatParcelizer;
                if (readUnsignedByte >= 0) {
                    TouchPointLivenessCheckActivity.write pop = touchPointLivenessCheckActivity.write.pop();
                    if (!touchPointLivenessCheckActivity.write.isEmpty()) {
                        touchPointLivenessCheckActivity.write.peek().MediaBrowserCompat$ItemReceiver += i;
                    }
                    pop.MediaBrowserCompat$CustomActionResultReceiver = readUnsignedByte;
                    touchPointLivenessCheckActivity.write.push(pop);
                    touchPointLivenessCheckActivity.read = false;
                    touchPointLivenessCheckActivity.MediaBrowserCompat$CustomActionResultReceiver = false;
                    touchPointLivenessCheckActivity.IconCompatParcelizer = true;
                    return readUnsignedByte;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot set negative length (length = ");
                sb.append(readUnsignedByte);
                sb.append(", 0x");
                sb.append(Integer.toHexString(readUnsignedByte));
                sb.append(" for tag ");
                sb.append(Integer.toHexString(touchPointLivenessCheckActivity.write()));
                sb.append(").");
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalStateException("Not at start of length");
        } catch (IOException e) {
            throw e;
        }
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() throws IOException {
        try {
            if (this.IconCompatParcelizer.IconCompatParcelizer) {
                TouchPointLivenessCheckActivity touchPointLivenessCheckActivity = this.IconCompatParcelizer;
                if (!touchPointLivenessCheckActivity.write.isEmpty()) {
                    int i = touchPointLivenessCheckActivity.write.peek().MediaBrowserCompat$CustomActionResultReceiver;
                    byte[] bArr = new byte[i];
                    this.read.readFully(bArr);
                    this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i);
                    return bArr;
                }
                throw new IllegalStateException("Length not yet known.");
            }
            throw new IllegalStateException("Not yet processing value!");
        } catch (IOException e) {
            throw e;
        }
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        if (this.IconCompatParcelizer.read || this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            return 0;
        }
        TouchPointLivenessCheckActivity touchPointLivenessCheckActivity = this.IconCompatParcelizer;
        if (!touchPointLivenessCheckActivity.write.isEmpty()) {
            TouchPointLivenessCheckActivity.write peek = touchPointLivenessCheckActivity.write.peek();
            return skip((long) (peek.MediaBrowserCompat$CustomActionResultReceiver - peek.MediaBrowserCompat$ItemReceiver));
        }
        throw new IllegalStateException("Length of value is unknown.");
    }

    public int available() throws IOException {
        return this.read.available();
    }

    public int read() throws IOException {
        int read2 = this.read.read();
        if (read2 < 0) {
            return -1;
        }
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(1);
        return read2;
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        long skip = this.read.skip(j);
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((int) skip);
        return skip;
    }

    public void mark(int i) {
        synchronized (this) {
            this.read.mark(i);
            this.MediaBrowserCompat$ItemReceiver = (TouchPointLivenessCheckActivity) this.IconCompatParcelizer.clone();
        }
    }

    public boolean markSupported() {
        return this.read.markSupported();
    }

    public void reset() throws IOException {
        synchronized (this) {
            if (markSupported()) {
                this.read.reset();
                this.IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$ItemReceiver = null;
            } else {
                throw new IOException("mark/reset not supported");
            }
        }
    }

    public void close() throws IOException {
        this.read.close();
    }

    public String toString() {
        return this.IconCompatParcelizer.toString();
    }
}
