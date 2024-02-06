package p040o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: o.PinChangeActivity */
public interface PinChangeActivity extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    PinChangeActivity_ViewBinding timeout();

    void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException;
}
