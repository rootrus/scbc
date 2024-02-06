package okhttp3.internal.connection;

import okhttp3.internal.Util;

public final class RealConnectionPool$cleanupRunnable$1 implements Runnable {
    final /* synthetic */ RealConnectionPool this$0;

    RealConnectionPool$cleanupRunnable$1(RealConnectionPool realConnectionPool) {
        this.this$0 = realConnectionPool;
    }

    public final void run() {
        while (true) {
            long cleanup = this.this$0.cleanup(System.nanoTime());
            if (cleanup != -1) {
                try {
                    Util.lockAndWaitNanos(this.this$0, cleanup);
                } catch (InterruptedException unused) {
                    this.this$0.evictAll();
                }
            } else {
                return;
            }
        }
    }
}
