package okhttp3.internal.http2;

import p040o.onGetStartedClick;

public final class Http2Connection$pushResetLater$$inlined$execute$1 implements Runnable {
    final /* synthetic */ ErrorCode $errorCode$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    public Http2Connection$pushResetLater$$inlined$execute$1(String str, Http2Connection http2Connection, int i, ErrorCode errorCode) {
        this.$name = str;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$errorCode$inlined = errorCode;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
            synchronized (this.this$0) {
                this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            currentThread.setName(name);
            throw th;
        }
    }
}
