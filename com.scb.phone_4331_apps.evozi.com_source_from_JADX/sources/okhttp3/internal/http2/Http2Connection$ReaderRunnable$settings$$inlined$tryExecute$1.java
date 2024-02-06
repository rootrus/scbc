package okhttp3.internal.http2;

import okhttp3.internal.http2.Http2Connection;
import p040o.onGetStartedClick;

public final class Http2Connection$ReaderRunnable$settings$$inlined$tryExecute$1 implements Runnable {
    final /* synthetic */ boolean $clearPrevious$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ Settings $settings$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public Http2Connection$ReaderRunnable$settings$$inlined$tryExecute$1(String str, Http2Connection.ReaderRunnable readerRunnable, boolean z, Settings settings) {
        this.$name = str;
        this.this$0 = readerRunnable;
        this.$clearPrevious$inlined = z;
        this.$settings$inlined = settings;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
        } finally {
            currentThread.setName(name);
        }
    }
}
