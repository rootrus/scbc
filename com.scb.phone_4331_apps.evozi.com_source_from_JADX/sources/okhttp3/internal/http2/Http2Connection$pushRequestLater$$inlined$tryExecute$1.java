package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p040o.onGetStartedClick;

public final class Http2Connection$pushRequestLater$$inlined$tryExecute$1 implements Runnable {
    final /* synthetic */ String $name;
    final /* synthetic */ List $requestHeaders$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    public Http2Connection$pushRequestLater$$inlined$tryExecute$1(String str, Http2Connection http2Connection, int i, List list) {
        this.$name = str;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$requestHeaders$inlined = list;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            if (this.this$0.pushObserver.onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
                try {
                    this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    synchronized (this.this$0) {
                        this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                    }
                } catch (IOException unused) {
                }
            }
        } finally {
            currentThread.setName(name);
        }
    }
}
