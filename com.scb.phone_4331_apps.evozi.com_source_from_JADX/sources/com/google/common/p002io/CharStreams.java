package com.google.common.p002io;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.common.io.CharStreams */
public final class CharStreams {
    private static final int BUF_SIZE = 2048;

    private CharStreams() {
    }

    public static InputSupplier<StringReader> newReaderSupplier(final String str) {
        Preconditions.checkNotNull(str);
        return new InputSupplier<StringReader>() {
            public final StringReader getInput() {
                return new StringReader(str);
            }
        };
    }

    public static InputSupplier<InputStreamReader> newReaderSupplier(final InputSupplier<? extends InputStream> inputSupplier, final Charset charset) {
        Preconditions.checkNotNull(inputSupplier);
        Preconditions.checkNotNull(charset);
        return new InputSupplier<InputStreamReader>() {
            public final InputStreamReader getInput() throws IOException {
                return new InputStreamReader((InputStream) inputSupplier.getInput(), charset);
            }
        };
    }

    public static OutputSupplier<OutputStreamWriter> newWriterSupplier(final OutputSupplier<? extends OutputStream> outputSupplier, final Charset charset) {
        Preconditions.checkNotNull(outputSupplier);
        Preconditions.checkNotNull(charset);
        return new OutputSupplier<OutputStreamWriter>() {
            public final OutputStreamWriter getOutput() throws IOException {
                return new OutputStreamWriter((OutputStream) outputSupplier.getOutput(), charset);
            }
        };
    }

    public static <W extends Appendable & Closeable> void write(CharSequence charSequence, OutputSupplier<W> outputSupplier) throws IOException {
        Preconditions.checkNotNull(charSequence);
        Appendable appendable = (Appendable) outputSupplier.getOutput();
        try {
            appendable.append(charSequence);
        } finally {
            Closeables.close((Closeable) appendable, true);
        }
    }

    public static <R extends Readable & Closeable, W extends Appendable & Closeable> long copy(InputSupplier<R> inputSupplier, OutputSupplier<W> outputSupplier) throws IOException {
        Appendable appendable;
        Readable readable = (Readable) inputSupplier.getInput();
        boolean z = true;
        try {
            appendable = (Appendable) outputSupplier.getOutput();
            long copy = copy(readable, appendable);
            try {
                Closeables.close((Closeable) appendable, false);
                Closeables.close((Closeable) readable, false);
                return copy;
            } catch (Throwable th) {
                th = th;
                z = false;
                Closeables.close((Closeable) readable, z);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Closeables.close((Closeable) readable, z);
            throw th;
        }
    }

    public static <R extends Readable & Closeable> long copy(InputSupplier<R> inputSupplier, Appendable appendable) throws IOException {
        Readable readable = (Readable) inputSupplier.getInput();
        try {
            return copy(readable, appendable);
        } finally {
            Closeables.close((Closeable) readable, true);
        }
    }

    public static long copy(Readable readable, Appendable appendable) throws IOException {
        CharBuffer allocate = CharBuffer.allocate(2048);
        long j = 0;
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return j;
            }
            allocate.flip();
            appendable.append(allocate, 0, read);
            j += (long) read;
        }
    }

    public static String toString(Readable readable) throws IOException {
        return toStringBuilder(readable).toString();
    }

    public static <R extends Readable & Closeable> String toString(InputSupplier<R> inputSupplier) throws IOException {
        return toStringBuilder(inputSupplier).toString();
    }

    private static StringBuilder toStringBuilder(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        copy(readable, (Appendable) sb);
        return sb;
    }

    private static <R extends Readable & Closeable> StringBuilder toStringBuilder(InputSupplier<R> inputSupplier) throws IOException {
        Readable readable = (Readable) inputSupplier.getInput();
        try {
            return toStringBuilder(readable);
        } finally {
            Closeables.close((Closeable) readable, true);
        }
    }

    public static <R extends Readable & Closeable> String readFirstLine(InputSupplier<R> inputSupplier) throws IOException {
        Readable readable = (Readable) inputSupplier.getInput();
        try {
            return new LineReader(readable).readLine();
        } finally {
            Closeables.close((Closeable) readable, true);
        }
    }

    public static <R extends Readable & Closeable> List<String> readLines(InputSupplier<R> inputSupplier) throws IOException {
        Readable readable = (Readable) inputSupplier.getInput();
        try {
            return readLines(readable);
        } finally {
            Closeables.close((Closeable) readable, true);
        }
    }

    public static List<String> readLines(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(readable);
        while (true) {
            String readLine = lineReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    /* JADX INFO: finally extract failed */
    public static <R extends Readable & Closeable, T> T readLines(InputSupplier<R> inputSupplier, LineProcessor<T> lineProcessor) throws IOException {
        String readLine;
        Readable readable = (Readable) inputSupplier.getInput();
        try {
            LineReader lineReader = new LineReader(readable);
            do {
                readLine = lineReader.readLine();
                if (readLine == null || !lineProcessor.processLine(readLine)) {
                    Closeables.close((Closeable) readable, false);
                }
                readLine = lineReader.readLine();
                break;
            } while (!lineProcessor.processLine(readLine));
            Closeables.close((Closeable) readable, false);
            return lineProcessor.getResult();
        } catch (Throwable th) {
            Closeables.close((Closeable) readable, true);
            throw th;
        }
    }

    public static InputSupplier<Reader> join(final Iterable<? extends InputSupplier<? extends Reader>> iterable) {
        return new InputSupplier<Reader>() {
            public final Reader getInput() throws IOException {
                return new MultiReader(iterable.iterator());
            }
        };
    }

    public static InputSupplier<Reader> join(InputSupplier<? extends Reader>... inputSupplierArr) {
        return join((Iterable<? extends InputSupplier<? extends Reader>>) Arrays.asList(inputSupplierArr));
    }

    public static void skipFully(Reader reader, long j) throws IOException {
        while (j > 0) {
            long skip = reader.skip(j);
            if (skip != 0) {
                j -= skip;
            } else if (reader.read() != -1) {
                j--;
            } else {
                throw new EOFException();
            }
        }
    }

    public static Writer asWriter(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new AppendableWriter(appendable);
    }
}
