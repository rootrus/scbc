package com.google.common.p002io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.common.io.FileBackedOutputStream */
public final class FileBackedOutputStream extends OutputStream {
    private File file;
    private final int fileThreshold;
    private MemoryOutput memory;
    private OutputStream out;
    private final boolean resetOnFinalize;
    private final InputSupplier<InputStream> supplier;

    /* renamed from: com.google.common.io.FileBackedOutputStream$MemoryOutput */
    static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        /* access modifiers changed from: package-private */
        public byte[] getBuffer() {
            return this.buf;
        }

        /* access modifiers changed from: package-private */
        public int getCount() {
            return this.count;
        }
    }

    /* access modifiers changed from: package-private */
    public final File getFile() {
        File file2;
        synchronized (this) {
            file2 = this.file;
        }
        return file2;
    }

    public FileBackedOutputStream(int i) {
        this(i, false);
    }

    public FileBackedOutputStream(int i, boolean z) {
        this.fileThreshold = i;
        this.resetOnFinalize = z;
        MemoryOutput memoryOutput = new MemoryOutput();
        this.memory = memoryOutput;
        this.out = memoryOutput;
        if (z) {
            this.supplier = new InputSupplier<InputStream>() {
                public InputStream getInput() throws IOException {
                    return FileBackedOutputStream.this.openStream();
                }

                /* access modifiers changed from: protected */
                public void finalize() {
                    try {
                        FileBackedOutputStream.this.reset();
                    } catch (Throwable th) {
                        th.printStackTrace(System.err);
                    }
                }
            };
        } else {
            this.supplier = new InputSupplier<InputStream>() {
                public InputStream getInput() throws IOException {
                    return FileBackedOutputStream.this.openStream();
                }
            };
        }
    }

    public final InputSupplier<InputStream> getSupplier() {
        return this.supplier;
    }

    /* access modifiers changed from: private */
    public InputStream openStream() throws IOException {
        synchronized (this) {
            if (this.file != null) {
                FileInputStream fileInputStream = new FileInputStream(this.file);
                return fileInputStream;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.memory.getBuffer(), 0, this.memory.getCount());
            return byteArrayInputStream;
        }
    }

    public final void reset() throws IOException {
        synchronized (this) {
            try {
                close();
                if (this.memory == null) {
                    this.memory = new MemoryOutput();
                } else {
                    this.memory.reset();
                }
                this.out = this.memory;
                if (this.file != null) {
                    File file2 = this.file;
                    this.file = null;
                    if (!file2.delete()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Could not delete: ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
            } catch (Throwable th) {
                if (this.memory == null) {
                    this.memory = new MemoryOutput();
                } else {
                    this.memory.reset();
                }
                this.out = this.memory;
                if (this.file != null) {
                    File file3 = this.file;
                    this.file = null;
                    if (!file3.delete()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Could not delete: ");
                        sb2.append(file3);
                        throw new IOException(sb2.toString());
                    }
                }
                throw th;
            }
        }
    }

    public final void write(int i) throws IOException {
        synchronized (this) {
            update(1);
            this.out.write(i);
        }
    }

    public final void write(byte[] bArr) throws IOException {
        synchronized (this) {
            write(bArr, 0, bArr.length);
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            update(i2);
            this.out.write(bArr, i, i2);
        }
    }

    public final void close() throws IOException {
        synchronized (this) {
            this.out.close();
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            this.out.flush();
        }
    }

    private void update(int i) throws IOException {
        if (this.file == null && this.memory.getCount() + i > this.fileThreshold) {
            File createTempFile = File.createTempFile("FileBackedOutputStream", (String) null);
            if (this.resetOnFinalize) {
                createTempFile.deleteOnExit();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(this.memory.getBuffer(), 0, this.memory.getCount());
            fileOutputStream.flush();
            this.out = fileOutputStream;
            this.file = createTempFile;
            this.memory = null;
        }
    }
}
