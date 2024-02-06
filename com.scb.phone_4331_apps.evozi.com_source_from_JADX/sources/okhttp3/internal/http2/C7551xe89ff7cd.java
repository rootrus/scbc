package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.platform.Platform;
import p040o.onGetStartedClick;

/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1 */
public final class C7551xe89ff7cd implements Runnable {
    final /* synthetic */ List $headerBlock$inlined;
    final /* synthetic */ boolean $inFinished$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ Http2Stream $newStream$inlined;
    final /* synthetic */ Http2Stream $stream$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public C7551xe89ff7cd(String str, Http2Stream http2Stream, Http2Connection.ReaderRunnable readerRunnable, Http2Stream http2Stream2, int i, List list, boolean z) {
        this.$name = str;
        this.$newStream$inlined = http2Stream;
        this.this$0 = readerRunnable;
        this.$stream$inlined = http2Stream2;
        this.$streamId$inlined = i;
        this.$headerBlock$inlined = list;
        this.$inFinished$inlined = z;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
        } catch (IOException e) {
            Platform platform = Platform.Companion.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Http2Connection.Listener failure for ");
            sb.append(this.this$0.this$0.getConnectionName$okhttp());
            platform.log(4, sb.toString(), e);
            try {
                this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, e);
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            currentThread.setName(name);
            throw th;
        }
        currentThread.setName(name);
    }
}
