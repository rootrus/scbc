package okhttp3.internal.http2;

import okhttp3.internal.http2.Http2Connection;
import p040o.onGetStartedClick;

public final class Http2Connection$ReaderRunnable$ping$$inlined$tryExecute$1 implements Runnable {
    final /* synthetic */ String $name;
    final /* synthetic */ int $payload1$inlined;
    final /* synthetic */ int $payload2$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public Http2Connection$ReaderRunnable$ping$$inlined$tryExecute$1(String str, Http2Connection.ReaderRunnable readerRunnable, int i, int i2) {
        this.$name = str;
        this.this$0 = readerRunnable;
        this.$payload1$inlined = i;
        this.$payload2$inlined = i2;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
        } finally {
            currentThread.setName(name);
        }
    }
}
