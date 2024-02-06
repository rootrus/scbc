package com.google.common.p002io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.google.common.io.LineReader */
public final class LineReader {
    private final char[] buf;
    private final CharBuffer cbuf;
    private final LineBuffer lineBuf = new LineBuffer() {
        /* access modifiers changed from: protected */
        public void handleLine(String str, String str2) {
            LineReader.this.lines.add(str);
        }
    };
    /* access modifiers changed from: private */
    public final Queue<String> lines = new LinkedList();
    private final Readable readable;
    private final Reader reader;

    public LineReader(Readable readable2) {
        char[] cArr = new char[4096];
        this.buf = cArr;
        this.cbuf = CharBuffer.wrap(cArr);
        Preconditions.checkNotNull(readable2);
        this.readable = readable2;
        this.reader = readable2 instanceof Reader ? (Reader) readable2 : null;
    }

    public final String readLine() throws IOException {
        int i;
        while (true) {
            if (this.lines.peek() != null) {
                break;
            }
            this.cbuf.clear();
            Reader reader2 = this.reader;
            if (reader2 != null) {
                char[] cArr = this.buf;
                i = reader2.read(cArr, 0, cArr.length);
            } else {
                i = this.readable.read(this.cbuf);
            }
            if (i == -1) {
                this.lineBuf.finish();
                break;
            }
            this.lineBuf.add(this.buf, 0, i);
        }
        return this.lines.poll();
    }
}
