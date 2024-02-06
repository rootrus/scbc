package com.google.common.p002io;

import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.zip.Checksum;

/* renamed from: com.google.common.io.ByteStreams */
public final class ByteStreams {
    private static final int BUF_SIZE = 4096;

    private ByteStreams() {
    }

    public static InputSupplier<ByteArrayInputStream> newInputStreamSupplier(byte[] bArr) {
        return newInputStreamSupplier(bArr, 0, bArr.length);
    }

    public static InputSupplier<ByteArrayInputStream> newInputStreamSupplier(final byte[] bArr, final int i, final int i2) {
        return new InputSupplier<ByteArrayInputStream>() {
            public final ByteArrayInputStream getInput() {
                return new ByteArrayInputStream(bArr, i, i2);
            }
        };
    }

    public static void write(byte[] bArr, OutputSupplier<? extends OutputStream> outputSupplier) throws IOException {
        Preconditions.checkNotNull(bArr);
        OutputStream outputStream = (OutputStream) outputSupplier.getOutput();
        try {
            outputStream.write(bArr);
        } finally {
            Closeables.close(outputStream, true);
        }
    }

    public static long copy(InputSupplier<? extends InputStream> inputSupplier, OutputSupplier<? extends OutputStream> outputSupplier) throws IOException {
        OutputStream outputStream;
        InputStream inputStream = (InputStream) inputSupplier.getInput();
        boolean z = true;
        try {
            outputStream = (OutputStream) outputSupplier.getOutput();
            long copy = copy(inputStream, outputStream);
            try {
                Closeables.close(outputStream, false);
                Closeables.close(inputStream, false);
                return copy;
            } catch (Throwable th) {
                th = th;
                z = false;
                Closeables.close(inputStream, z);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Closeables.close(inputStream, z);
            throw th;
        }
    }

    public static long copy(InputSupplier<? extends InputStream> inputSupplier, OutputStream outputStream) throws IOException {
        InputStream inputStream = (InputStream) inputSupplier.getInput();
        try {
            return copy(inputStream, outputStream);
        } finally {
            Closeables.close(inputStream, true);
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4096);
        long j = 0;
        while (readableByteChannel.read(allocate) != -1) {
            allocate.flip();
            while (allocate.hasRemaining()) {
                j += (long) writableByteChannel.write(allocate);
            }
            allocate.clear();
        }
        return j;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toByteArray(InputSupplier<? extends InputStream> inputSupplier) throws IOException {
        InputStream inputStream = (InputStream) inputSupplier.getInput();
        try {
            return toByteArray(inputStream);
        } finally {
            Closeables.close(inputStream, true);
        }
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return new ByteArrayDataInputStream(bArr);
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr, int i) {
        Preconditions.checkPositionIndex(i, bArr.length);
        return new ByteArrayDataInputStream(bArr, i);
    }

    /* renamed from: com.google.common.io.ByteStreams$ByteArrayDataInputStream */
    static class ByteArrayDataInputStream implements ByteArrayDataInput {
        final DataInput input;

        ByteArrayDataInputStream(byte[] bArr) {
            this.input = new DataInputStream(new ByteArrayInputStream(bArr));
        }

        ByteArrayDataInputStream(byte[] bArr, int i) {
            this.input = new DataInputStream(new ByteArrayInputStream(bArr, i, bArr.length - i));
        }

        public void readFully(byte[] bArr) {
            try {
                this.input.readFully(bArr);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public void readFully(byte[] bArr, int i, int i2) {
            try {
                this.input.readFully(bArr, i, i2);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int skipBytes(int i) {
            try {
                return this.input.skipBytes(i);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (EOFException e) {
                throw new IllegalStateException(e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public short readShort() {
            try {
                return this.input.readShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public char readChar() {
            try {
                return this.input.readChar();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readInt() {
            try {
                return this.input.readInt();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public long readLong() {
            try {
                return this.input.readLong();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String readLine() {
            try {
                return this.input.readLine();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String readUTF() {
            try {
                return this.input.readUTF();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static ByteArrayDataOutput newDataOutput() {
        return new ByteArrayDataOutputStream();
    }

    public static ByteArrayDataOutput newDataOutput(int i) {
        Preconditions.checkArgument(i >= 0, "Invalid size: %s", Integer.valueOf(i));
        return new ByteArrayDataOutputStream(i);
    }

    /* renamed from: com.google.common.io.ByteStreams$ByteArrayDataOutputStream */
    static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        final ByteArrayOutputStream byteArrayOutputSteam;
        final DataOutput output;

        ByteArrayDataOutputStream() {
            this(new ByteArrayOutputStream());
        }

        ByteArrayDataOutputStream(int i) {
            this(new ByteArrayOutputStream(i));
        }

        ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputSteam = byteArrayOutputStream;
            this.output = new DataOutputStream(byteArrayOutputStream);
        }

        public void write(int i) {
            try {
                this.output.write(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void write(byte[] bArr) {
            try {
                this.output.write(bArr);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            try {
                this.output.write(bArr, i, i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeBoolean(boolean z) {
            try {
                this.output.writeBoolean(z);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeByte(int i) {
            try {
                this.output.writeByte(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeBytes(String str) {
            try {
                this.output.writeBytes(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeChar(int i) {
            try {
                this.output.writeChar(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeChars(String str) {
            try {
                this.output.writeChars(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeDouble(double d) {
            try {
                this.output.writeDouble(d);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeFloat(float f) {
            try {
                this.output.writeFloat(f);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeInt(int i) {
            try {
                this.output.writeInt(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeLong(long j) {
            try {
                this.output.writeLong(j);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeShort(int i) {
            try {
                this.output.writeShort(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeUTF(String str) {
            try {
                this.output.writeUTF(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public byte[] toByteArray() {
            return this.byteArrayOutputSteam.toByteArray();
        }
    }

    public static long length(InputSupplier<? extends InputStream> inputSupplier) throws IOException {
        InputStream inputStream = (InputStream) inputSupplier.getInput();
        long j = 0;
        while (true) {
            try {
                long skip = inputStream.skip(2147483647L);
                if (skip == 0) {
                    if (inputStream.read() == -1) {
                        return j;
                    }
                    skip = 1;
                }
                j += skip;
            } finally {
                Closeables.close(inputStream, true);
            }
        }
    }

    public static boolean equal(InputSupplier<? extends InputStream> inputSupplier, InputSupplier<? extends InputStream> inputSupplier2) throws IOException {
        InputStream inputStream;
        int read;
        byte[] bArr = new byte[4096];
        byte[] bArr2 = new byte[4096];
        InputStream inputStream2 = (InputStream) inputSupplier.getInput();
        boolean z = true;
        try {
            inputStream = (InputStream) inputSupplier2.getInput();
            do {
                read = read(inputStream2, bArr, 0, 4096);
                if (read != read(inputStream, bArr2, 0, 4096) || !Arrays.equals(bArr, bArr2)) {
                    Closeables.close(inputStream, false);
                    Closeables.close(inputStream2, false);
                    return false;
                }
            } while (read == 4096);
            try {
                Closeables.close(inputStream, false);
                Closeables.close(inputStream2, false);
                return true;
            } catch (Throwable th) {
                th = th;
                z = false;
                Closeables.close(inputStream2, z);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Closeables.close(inputStream2, z);
            throw th;
        }
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (read(inputStream, bArr, i, i2) != i2) {
            throw new EOFException();
        }
    }

    public static void skipFully(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip != 0) {
                j -= skip;
            } else if (inputStream.read() != -1) {
                j--;
            } else {
                throw new EOFException();
            }
        }
    }

    public static <T> T readBytes(InputSupplier<? extends InputStream> inputSupplier, ByteProcessor<T> byteProcessor) throws IOException {
        byte[] bArr = new byte[4096];
        InputStream inputStream = (InputStream) inputSupplier.getInput();
        while (true) {
            boolean z = true;
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    if (!byteProcessor.processBytes(bArr, 0, read)) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            } finally {
                Closeables.close(inputStream, z);
            }
        }
        return byteProcessor.getResult();
    }

    public static long getChecksum(InputSupplier<? extends InputStream> inputSupplier, final Checksum checksum) throws IOException {
        return ((Long) readBytes(inputSupplier, new ByteProcessor<Long>() {
            public final boolean processBytes(byte[] bArr, int i, int i2) {
                checksum.update(bArr, i, i2);
                return true;
            }

            public final Long getResult() {
                long value = checksum.getValue();
                checksum.reset();
                return Long.valueOf(value);
            }
        })).longValue();
    }

    public static byte[] getDigest(InputSupplier<? extends InputStream> inputSupplier, final MessageDigest messageDigest) throws IOException {
        return (byte[]) readBytes(inputSupplier, new ByteProcessor<byte[]>() {
            public final boolean processBytes(byte[] bArr, int i, int i2) {
                messageDigest.update(bArr, i, i2);
                return true;
            }

            public final byte[] getResult() {
                return messageDigest.digest();
            }
        });
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    public static InputSupplier<InputStream> slice(InputSupplier<? extends InputStream> inputSupplier, long j, long j2) {
        Preconditions.checkNotNull(inputSupplier);
        boolean z = true;
        Preconditions.checkArgument(j >= 0, "offset is negative");
        if (j2 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "length is negative");
        final InputSupplier<? extends InputStream> inputSupplier2 = inputSupplier;
        final long j3 = j;
        final long j4 = j2;
        return new InputSupplier<InputStream>() {
            public final InputStream getInput() throws IOException {
                InputStream inputStream = (InputStream) inputSupplier2.getInput();
                long j = j3;
                if (j > 0) {
                    try {
                        ByteStreams.skipFully(inputStream, j);
                    } catch (IOException e) {
                        Closeables.closeQuietly(inputStream);
                        throw e;
                    }
                }
                return new LimitInputStream(inputStream, j4);
            }
        };
    }

    public static InputSupplier<InputStream> join(final Iterable<? extends InputSupplier<? extends InputStream>> iterable) {
        return new InputSupplier<InputStream>() {
            public final InputStream getInput() throws IOException {
                return new MultiInputStream(iterable.iterator());
            }
        };
    }

    public static InputSupplier<InputStream> join(InputSupplier<? extends InputStream>... inputSupplierArr) {
        return join((Iterable<? extends InputSupplier<? extends InputStream>>) Arrays.asList(inputSupplierArr));
    }
}
