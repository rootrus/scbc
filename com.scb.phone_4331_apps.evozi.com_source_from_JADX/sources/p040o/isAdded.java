package p040o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: o.isAdded */
final class isAdded implements Closeable {
    private int IconCompatParcelizer;
    final Charset MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    private final InputStream read;
    private byte[] write;

    public isAdded(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private isAdded(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(instantiateChildFragmentManager.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.read = inputStream;
            this.MediaBrowserCompat$CustomActionResultReceiver = charset;
            this.write = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() throws IOException {
        synchronized (this.read) {
            if (this.write != null) {
                this.write = null;
                this.read.close();
            }
        }
    }

    public final String IconCompatParcelizer() throws IOException {
        int i;
        int i2;
        synchronized (this.read) {
            if (this.write != null) {
                if (this.IconCompatParcelizer >= this.MediaBrowserCompat$ItemReceiver) {
                    MediaBrowserCompat$ItemReceiver();
                }
                for (int i3 = this.IconCompatParcelizer; i3 != this.MediaBrowserCompat$ItemReceiver; i3++) {
                    if (this.write[i3] == 10) {
                        if (i3 != this.IconCompatParcelizer) {
                            i2 = i3 - 1;
                            if (this.write[i2] == 13) {
                                String str = new String(this.write, this.IconCompatParcelizer, i2 - this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver.name());
                                this.IconCompatParcelizer = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.write, this.IconCompatParcelizer, i2 - this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver.name());
                        this.IconCompatParcelizer = i3 + 1;
                        return str2;
                    }
                }
                C13571 r1 = new ByteArrayOutputStream((this.MediaBrowserCompat$ItemReceiver - this.IconCompatParcelizer) + 80) {
                    public final String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, isAdded.this.MediaBrowserCompat$CustomActionResultReceiver.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.write, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver - this.IconCompatParcelizer);
                    this.MediaBrowserCompat$ItemReceiver = -1;
                    MediaBrowserCompat$ItemReceiver();
                    i = this.IconCompatParcelizer;
                    while (true) {
                        if (i != this.MediaBrowserCompat$ItemReceiver) {
                            if (this.write[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.IconCompatParcelizer) {
                    r1.write(this.write, this.IconCompatParcelizer, i - this.IconCompatParcelizer);
                }
                this.IconCompatParcelizer = i + 1;
                String obj = r1.toString();
                return obj;
            }
            throw new IOException("LineReader is closed");
        }
    }

    private void MediaBrowserCompat$ItemReceiver() throws IOException {
        InputStream inputStream = this.read;
        byte[] bArr = this.write;
        int read2 = inputStream.read(bArr, 0, bArr.length);
        if (read2 != -1) {
            this.IconCompatParcelizer = 0;
            this.MediaBrowserCompat$ItemReceiver = read2;
            return;
        }
        throw new EOFException();
    }
}
