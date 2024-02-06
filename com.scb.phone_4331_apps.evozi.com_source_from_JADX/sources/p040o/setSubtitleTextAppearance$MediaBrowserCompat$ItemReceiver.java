package p040o;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver */
class setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver extends InputStream implements DataInput {
    private static final ByteOrder MediaBrowserCompat$ItemReceiver = ByteOrder.BIG_ENDIAN;
    private static final ByteOrder write = ByteOrder.LITTLE_ENDIAN;
    int IconCompatParcelizer;
    ByteOrder MediaBrowserCompat$CustomActionResultReceiver;
    private DataInputStream MediaBrowserCompat$MediaItem;
    final int read;

    public setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver(InputStream inputStream) throws IOException {
        this.MediaBrowserCompat$CustomActionResultReceiver = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.MediaBrowserCompat$MediaItem = dataInputStream;
        int available = dataInputStream.available();
        this.read = available;
        this.IconCompatParcelizer = 0;
        this.MediaBrowserCompat$MediaItem.mark(available);
    }

    public setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver(byte[] bArr) throws IOException {
        this((InputStream) new ByteArrayInputStream(bArr));
    }

    public final void write(long j) throws IOException {
        long j2 = (long) this.IconCompatParcelizer;
        if (j2 > j) {
            this.IconCompatParcelizer = 0;
            this.MediaBrowserCompat$MediaItem.reset();
            this.MediaBrowserCompat$MediaItem.mark(this.read);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (skipBytes(i) != i) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int available() throws IOException {
        return this.MediaBrowserCompat$MediaItem.available();
    }

    public final int read() throws IOException {
        this.IconCompatParcelizer++;
        return this.MediaBrowserCompat$MediaItem.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read2 = this.MediaBrowserCompat$MediaItem.read(bArr, i, i2);
        this.IconCompatParcelizer += read2;
        return read2;
    }

    public final int readUnsignedByte() throws IOException {
        this.IconCompatParcelizer++;
        return this.MediaBrowserCompat$MediaItem.readUnsignedByte();
    }

    public final String readLine() throws IOException {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final boolean readBoolean() throws IOException {
        this.IconCompatParcelizer++;
        return this.MediaBrowserCompat$MediaItem.readBoolean();
    }

    public final char readChar() throws IOException {
        this.IconCompatParcelizer += 2;
        return this.MediaBrowserCompat$MediaItem.readChar();
    }

    public final String readUTF() throws IOException {
        this.IconCompatParcelizer += 2;
        return this.MediaBrowserCompat$MediaItem.readUTF();
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.IconCompatParcelizer + i2;
        this.IconCompatParcelizer = i3;
        if (i3 > this.read) {
            throw new EOFException();
        } else if (this.MediaBrowserCompat$MediaItem.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final void readFully(byte[] bArr) throws IOException {
        int length = this.IconCompatParcelizer + bArr.length;
        this.IconCompatParcelizer = length;
        if (length > this.read) {
            throw new EOFException();
        } else if (this.MediaBrowserCompat$MediaItem.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final byte readByte() throws IOException {
        int i = this.IconCompatParcelizer + 1;
        this.IconCompatParcelizer = i;
        if (i <= this.read) {
            int read2 = this.MediaBrowserCompat$MediaItem.read();
            if (read2 >= 0) {
                return (byte) read2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() throws IOException {
        int i = this.IconCompatParcelizer + 2;
        this.IconCompatParcelizer = i;
        if (i <= this.read) {
            int read2 = this.MediaBrowserCompat$MediaItem.read();
            int read3 = this.MediaBrowserCompat$MediaItem.read();
            if ((read2 | read3) >= 0) {
                ByteOrder byteOrder = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (byteOrder == write) {
                    return (short) ((read3 << 8) + read2);
                }
                if (byteOrder == MediaBrowserCompat$ItemReceiver) {
                    return (short) ((read2 << 8) + read3);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid byte order: ");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                throw new IOException(sb.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int readInt() throws IOException {
        int i = this.IconCompatParcelizer + 4;
        this.IconCompatParcelizer = i;
        if (i <= this.read) {
            int read2 = this.MediaBrowserCompat$MediaItem.read();
            int read3 = this.MediaBrowserCompat$MediaItem.read();
            int read4 = this.MediaBrowserCompat$MediaItem.read();
            int read5 = this.MediaBrowserCompat$MediaItem.read();
            if ((read2 | read3 | read4 | read5) >= 0) {
                ByteOrder byteOrder = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (byteOrder == write) {
                    return (read5 << 24) + (read4 << 16) + (read3 << 8) + read2;
                }
                if (byteOrder == MediaBrowserCompat$ItemReceiver) {
                    return (read2 << 24) + (read3 << 16) + (read4 << 8) + read5;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid byte order: ");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                throw new IOException(sb.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int skipBytes(int i) throws IOException {
        int min = Math.min(i, this.read - this.IconCompatParcelizer);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.MediaBrowserCompat$MediaItem.skipBytes(min - i2);
        }
        this.IconCompatParcelizer += i2;
        return i2;
    }

    public final int readUnsignedShort() throws IOException {
        int i = this.IconCompatParcelizer + 2;
        this.IconCompatParcelizer = i;
        if (i <= this.read) {
            int read2 = this.MediaBrowserCompat$MediaItem.read();
            int read3 = this.MediaBrowserCompat$MediaItem.read();
            if ((read2 | read3) >= 0) {
                ByteOrder byteOrder = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (byteOrder == write) {
                    return (read3 << 8) + read2;
                }
                if (byteOrder == MediaBrowserCompat$ItemReceiver) {
                    return (read2 << 8) + read3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid byte order: ");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                throw new IOException(sb.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final long readLong() throws IOException {
        int i = this.IconCompatParcelizer + 8;
        this.IconCompatParcelizer = i;
        if (i <= this.read) {
            int read2 = this.MediaBrowserCompat$MediaItem.read();
            int read3 = this.MediaBrowserCompat$MediaItem.read();
            int read4 = this.MediaBrowserCompat$MediaItem.read();
            int read5 = this.MediaBrowserCompat$MediaItem.read();
            int read6 = this.MediaBrowserCompat$MediaItem.read();
            int read7 = this.MediaBrowserCompat$MediaItem.read();
            int read8 = this.MediaBrowserCompat$MediaItem.read();
            int read9 = this.MediaBrowserCompat$MediaItem.read();
            if ((read2 | read3 | read4 | read5 | read6 | read7 | read8 | read9) >= 0) {
                ByteOrder byteOrder = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (byteOrder == write) {
                    return (((long) read9) << 56) + (((long) read8) << 48) + (((long) read7) << 40) + (((long) read6) << 32) + (((long) read5) << 24) + (((long) read4) << 16) + (((long) read3) << 8) + ((long) read2);
                }
                int i2 = read3;
                if (byteOrder == MediaBrowserCompat$ItemReceiver) {
                    return (((long) read2) << 56) + (((long) i2) << 48) + (((long) read4) << 40) + (((long) read5) << 32) + (((long) read6) << 24) + (((long) read7) << 16) + (((long) read8) << 8) + ((long) read9);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid byte order: ");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                throw new IOException(sb.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }
}
