package p040o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: o.QuickPromptPayActivity */
public interface QuickPromptPayActivity extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    ModifyQuickPromptPayActivity timeout();

    void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException;
}
