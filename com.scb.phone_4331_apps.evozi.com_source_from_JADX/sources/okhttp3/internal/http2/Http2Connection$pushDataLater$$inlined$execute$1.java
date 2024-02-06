package okhttp3.internal.http2;

import java.io.IOException;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class Http2Connection$pushDataLater$$inlined$execute$1 implements Runnable {
    final /* synthetic */ SCBUniversalWebViewActivity $buffer$inlined;
    final /* synthetic */ int $byteCount$inlined;
    final /* synthetic */ boolean $inFinished$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    public Http2Connection$pushDataLater$$inlined$execute$1(String str, Http2Connection http2Connection, int i, SCBUniversalWebViewActivity sCBUniversalWebViewActivity, int i2, boolean z) {
        this.$name = str;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$buffer$inlined = sCBUniversalWebViewActivity;
        this.$byteCount$inlined = i2;
        this.$inFinished$inlined = z;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            boolean onData = this.this$0.pushObserver.onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
            if (onData) {
                this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
            }
            if (onData || this.$inFinished$inlined) {
                synchronized (this.this$0) {
                    this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            currentThread.setName(name);
            throw th;
        }
        currentThread.setName(name);
    }
}
