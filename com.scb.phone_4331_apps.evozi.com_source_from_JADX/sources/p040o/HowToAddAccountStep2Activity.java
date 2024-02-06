package p040o;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: o.HowToAddAccountStep2Activity */
public interface HowToAddAccountStep2Activity extends Closeable {
    void close() throws IOException;

    long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException;

    PinChangeActivity_ViewBinding timeout();
}
