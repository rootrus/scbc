package p040o;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: o.HowToAddAccountActivity */
public interface HowToAddAccountActivity extends Closeable {
    void close() throws IOException;

    long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException;

    ModifyQuickPromptPayActivity timeout();
}
