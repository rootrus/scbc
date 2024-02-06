package com.google.common.p002io;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.common.io.LittleEndianDataInputStream */
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    public LittleEndianDataInputStream(InputStream inputStream) {
        super((InputStream) Preconditions.checkNotNull(inputStream));
    }

    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    public final void readFully(byte[] bArr) throws IOException {
        ByteStreams.readFully(this, bArr);
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        ByteStreams.readFully(this, bArr, i, i2);
    }

    public final int skipBytes(int i) throws IOException {
        return (int) this.in.skip((long) i);
    }

    public final int readUnsignedByte() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public final int readUnsignedShort() throws IOException {
        return Ints.fromBytes((byte) 0, (byte) 0, readAndCheckByte(), readAndCheckByte());
    }

    public final int readInt() throws IOException {
        byte readAndCheckByte = readAndCheckByte();
        byte readAndCheckByte2 = readAndCheckByte();
        return Ints.fromBytes(readAndCheckByte(), readAndCheckByte(), readAndCheckByte2, readAndCheckByte);
    }

    public final long readLong() throws IOException {
        byte readAndCheckByte = readAndCheckByte();
        byte readAndCheckByte2 = readAndCheckByte();
        byte readAndCheckByte3 = readAndCheckByte();
        byte readAndCheckByte4 = readAndCheckByte();
        byte readAndCheckByte5 = readAndCheckByte();
        byte readAndCheckByte6 = readAndCheckByte();
        return Longs.fromBytes(readAndCheckByte(), readAndCheckByte(), readAndCheckByte6, readAndCheckByte5, readAndCheckByte4, readAndCheckByte3, readAndCheckByte2, readAndCheckByte);
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    public final String readUTF() throws IOException {
        return new DataInputStream(this.in).readUTF();
    }

    public final short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    public final char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    public final byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    public final boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    private byte readAndCheckByte() throws IOException, EOFException {
        int read = this.in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }
}
