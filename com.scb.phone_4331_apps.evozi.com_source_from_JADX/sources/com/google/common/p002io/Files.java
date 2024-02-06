package com.google.common.p002io;

import com.google.common.base.Preconditions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.List;
import java.util.zip.Checksum;
import p040o.RegistrationManageDeviceAdapter$DeviceItemViewHolder;

/* renamed from: com.google.common.io.Files */
public final class Files {
    private static final int TEMP_DIR_ATTEMPTS = 10000;

    private Files() {
    }

    public static BufferedReader newReader(File file, Charset charset) throws FileNotFoundException {
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter newWriter(File file, Charset charset) throws FileNotFoundException {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    public static InputSupplier<FileInputStream> newInputStreamSupplier(final File file) {
        Preconditions.checkNotNull(file);
        return new InputSupplier<FileInputStream>() {
            public final FileInputStream getInput() throws IOException {
                return new FileInputStream(file);
            }
        };
    }

    public static OutputSupplier<FileOutputStream> newOutputStreamSupplier(File file) {
        return newOutputStreamSupplier(file, false);
    }

    public static OutputSupplier<FileOutputStream> newOutputStreamSupplier(final File file, final boolean z) {
        Preconditions.checkNotNull(file);
        return new OutputSupplier<FileOutputStream>() {
            public final FileOutputStream getOutput() throws IOException {
                return new FileOutputStream(file, z);
            }
        };
    }

    public static InputSupplier<InputStreamReader> newReaderSupplier(File file, Charset charset) {
        return CharStreams.newReaderSupplier(newInputStreamSupplier(file), charset);
    }

    public static OutputSupplier<OutputStreamWriter> newWriterSupplier(File file, Charset charset) {
        return newWriterSupplier(file, charset, false);
    }

    public static OutputSupplier<OutputStreamWriter> newWriterSupplier(File file, Charset charset, boolean z) {
        return CharStreams.newWriterSupplier(newOutputStreamSupplier(file, z), charset);
    }

    public static byte[] toByteArray(File file) throws IOException {
        boolean z = true;
        z = false;
        Preconditions.checkArgument(file.length() <= 2147483647L ? z : z);
        if (file.length() == 0) {
            return ByteStreams.toByteArray((InputSupplier<? extends InputStream>) newInputStreamSupplier(file));
        }
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteStreams.readFully(fileInputStream, bArr);
            return bArr;
        } finally {
            Closeables.close(fileInputStream, z);
        }
    }

    public static String toString(File file, Charset charset) throws IOException {
        return new String(toByteArray(file), charset.name());
    }

    public static void copy(InputSupplier<? extends InputStream> inputSupplier, File file) throws IOException {
        ByteStreams.copy(inputSupplier, (OutputSupplier<? extends OutputStream>) newOutputStreamSupplier(file));
    }

    public static void write(byte[] bArr, File file) throws IOException {
        ByteStreams.write(bArr, newOutputStreamSupplier(file));
    }

    public static void copy(File file, OutputSupplier<? extends OutputStream> outputSupplier) throws IOException {
        ByteStreams.copy((InputSupplier<? extends InputStream>) newInputStreamSupplier(file), outputSupplier);
    }

    public static void copy(File file, OutputStream outputStream) throws IOException {
        ByteStreams.copy((InputSupplier<? extends InputStream>) newInputStreamSupplier(file), outputStream);
    }

    public static void copy(File file, File file2) throws IOException {
        copy((InputSupplier<? extends InputStream>) newInputStreamSupplier(file), file2);
    }

    public static <R extends Readable & Closeable> void copy(InputSupplier<R> inputSupplier, File file, Charset charset) throws IOException {
        CharStreams.copy(inputSupplier, newWriterSupplier(file, charset));
    }

    public static void write(CharSequence charSequence, File file, Charset charset) throws IOException {
        write(charSequence, file, charset, false);
    }

    public static void append(CharSequence charSequence, File file, Charset charset) throws IOException {
        write(charSequence, file, charset, true);
    }

    private static void write(CharSequence charSequence, File file, Charset charset, boolean z) throws IOException {
        CharStreams.write(charSequence, newWriterSupplier(file, charset, z));
    }

    public static <W extends Appendable & Closeable> void copy(File file, Charset charset, OutputSupplier<W> outputSupplier) throws IOException {
        CharStreams.copy(newReaderSupplier(file, charset), outputSupplier);
    }

    public static void copy(File file, Charset charset, Appendable appendable) throws IOException {
        CharStreams.copy(newReaderSupplier(file, charset), appendable);
    }

    public static boolean equal(File file, File file2) throws IOException {
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long length = file.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return ByteStreams.equal(newInputStreamSupplier(file), newInputStreamSupplier(file2));
        }
        return false;
    }

    public static File createTempDir() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("-");
        String obj = sb.toString();
        for (int i = 0; i < TEMP_DIR_ATTEMPTS; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(i);
            File file2 = new File(file, sb2.toString());
            if (file2.mkdir()) {
                return file2;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Failed to create directory within 10000 attempts (tried ");
        sb3.append(obj);
        sb3.append("0 to ");
        sb3.append(obj);
        sb3.append(RegistrationManageDeviceAdapter$DeviceItemViewHolder.MAX_VALUE_OF_ERA);
        sb3.append(')');
        throw new IllegalStateException(sb3.toString());
    }

    public static void touch(File file) throws IOException {
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to update modification time of ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    public static void createParentDirs(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create parent directories of ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }
    }

    public static void move(File file, File file2) throws IOException {
        Preconditions.checkNotNull(file2);
        Object[] objArr = {file, file2};
        Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", objArr);
        if (!file.renameTo(file2)) {
            copy(file, file2);
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to delete ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to delete ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    }

    public static void deleteDirectoryContents(File file) throws IOException {
        Preconditions.checkArgument(file.isDirectory(), "Not a directory: %s", file);
        if (file.getCanonicalPath().equals(file.getAbsolutePath())) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File deleteRecursively : listFiles) {
                    deleteRecursively(deleteRecursively);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Error listing files for ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    public static void deleteRecursively(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectoryContents(file);
        }
        if (!file.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    public static String readFirstLine(File file, Charset charset) throws IOException {
        return CharStreams.readFirstLine(newReaderSupplier(file, charset));
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        return CharStreams.readLines(newReaderSupplier(file, charset));
    }

    public static <T> T readLines(File file, Charset charset, LineProcessor<T> lineProcessor) throws IOException {
        return CharStreams.readLines(newReaderSupplier(file, charset), lineProcessor);
    }

    public static <T> T readBytes(File file, ByteProcessor<T> byteProcessor) throws IOException {
        return ByteStreams.readBytes(newInputStreamSupplier(file), byteProcessor);
    }

    public static long getChecksum(File file, Checksum checksum) throws IOException {
        return ByteStreams.getChecksum(newInputStreamSupplier(file), checksum);
    }

    public static byte[] getDigest(File file, MessageDigest messageDigest) throws IOException {
        return ByteStreams.getDigest(newInputStreamSupplier(file), messageDigest);
    }

    public static MappedByteBuffer map(File file) throws IOException {
        return map(file, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode) throws IOException {
        if (file.exists()) {
            return map(file, mapMode, file.length());
        }
        throw new FileNotFoundException(file.toString());
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode, long j) throws FileNotFoundException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? "r" : "rw");
        try {
            return map(randomAccessFile, mapMode, j);
        } finally {
            Closeables.close(randomAccessFile, true);
        }
    }

    private static MappedByteBuffer map(RandomAccessFile randomAccessFile, FileChannel.MapMode mapMode, long j) throws IOException {
        FileChannel channel = randomAccessFile.getChannel();
        try {
            return channel.map(mapMode, 0, j);
        } finally {
            Closeables.close(channel, true);
        }
    }
}
