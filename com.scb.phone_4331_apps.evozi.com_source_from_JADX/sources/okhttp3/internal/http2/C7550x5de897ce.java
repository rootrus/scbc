package okhttp3.internal.http2;

import okhttp3.internal.http2.Http2Connection;
import p040o.onGetStartedClick;

/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$execute$1 */
public final class C7550x5de897ce implements Runnable {
    final /* synthetic */ String $name;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public C7550x5de897ce(String str, Http2Connection.ReaderRunnable readerRunnable) {
        this.$name = str;
        this.this$0 = readerRunnable;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.this$0.getListener$okhttp().onSettings(this.this$0.this$0);
        } finally {
            currentThread.setName(name);
        }
    }
}
