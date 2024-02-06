package p040o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.setDrawableBitmap */
public final class setDrawableBitmap extends AtomicLong implements ThreadFactory {
    public static final ThreadFactory MediaBrowserCompat$ItemReceiver = new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    };
    private String read;

    public setDrawableBitmap(String str) {
        this.read = str;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append(incrementAndGet());
        Thread thread = new Thread(runnable, sb.toString());
        thread.setDaemon(true);
        return thread;
    }
}
