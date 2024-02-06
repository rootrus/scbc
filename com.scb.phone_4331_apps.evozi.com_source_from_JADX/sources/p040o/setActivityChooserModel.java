package p040o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.setActivityChooserModel */
public final class setActivityChooserModel extends setProvider {
    private final ExecutorService IconCompatParcelizer = Executors.newFixedThreadPool(2, new ThreadFactory() {
        private final AtomicInteger write = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.write.getAndIncrement())}));
            return thread;
        }
    });
    private volatile Handler MediaBrowserCompat$CustomActionResultReceiver;
    private final Object read = new Object();

    public final void IconCompatParcelizer(Runnable runnable) {
        this.IconCompatParcelizer.execute(runnable);
    }

    public final void read(Runnable runnable) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            synchronized (this.read) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.post(runnable);
    }

    public final boolean write() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
