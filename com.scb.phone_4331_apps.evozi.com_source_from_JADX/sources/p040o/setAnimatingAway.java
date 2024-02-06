package p040o;

import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o.setAnimatingAway */
public final class setAnimatingAway implements ExecutorService {
    private static final long MediaBrowserCompat$ItemReceiver = TimeUnit.SECONDS.toMillis(10);
    private static volatile int write;
    private final ExecutorService MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.setAnimatingAway$write */
    public interface write {
        public static final write MediaBrowserCompat$ItemReceiver = new write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        };

        void MediaBrowserCompat$CustomActionResultReceiver(Throwable th);
    }

    public static setAnimatingAway read() {
        return new setAnimatingAway(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new read("disk-cache", write.MediaBrowserCompat$ItemReceiver, true)));
    }

    public static setAnimatingAway MediaBrowserCompat$ItemReceiver() {
        int IconCompatParcelizer = IconCompatParcelizer();
        return new setAnimatingAway(new ThreadPoolExecutor(IconCompatParcelizer, IconCompatParcelizer, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new read("source", write.MediaBrowserCompat$ItemReceiver, false)));
    }

    public static setAnimatingAway MediaBrowserCompat$CustomActionResultReceiver() {
        return new setAnimatingAway(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, MediaBrowserCompat$ItemReceiver, TimeUnit.MILLISECONDS, new SynchronousQueue(), new read("source-unlimited", write.MediaBrowserCompat$ItemReceiver, false)));
    }

    public static setAnimatingAway write() {
        int i = IconCompatParcelizer() >= 4 ? 2 : 1;
        return new setAnimatingAway(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new read("animation", write.MediaBrowserCompat$ItemReceiver, true)));
    }

    private setAnimatingAway(ExecutorService executorService) {
        this.MediaBrowserCompat$CustomActionResultReceiver = executorService;
    }

    public final void execute(Runnable runnable) {
        this.MediaBrowserCompat$CustomActionResultReceiver.execute(runnable);
    }

    public final Future<?> submit(Runnable runnable) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.submit(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.invokeAll(collection);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.invokeAny(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.invokeAny(collection, j, timeUnit);
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.submit(runnable, t);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.submit(callable);
    }

    public final void shutdown() {
        this.MediaBrowserCompat$CustomActionResultReceiver.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.shutdownNow();
    }

    public final boolean isShutdown() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isShutdown();
    }

    public final boolean isTerminated() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isTerminated();
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.awaitTermination(j, timeUnit);
    }

    public final String toString() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.toString();
    }

    private static int IconCompatParcelizer() {
        if (write == 0) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            if (Build.VERSION.SDK_INT < 17) {
                availableProcessors = Math.max(setAnimator.IconCompatParcelizer(), availableProcessors);
            }
            write = Math.min(4, availableProcessors);
        }
        return write;
    }

    /* renamed from: o.setAnimatingAway$read */
    static final class read implements ThreadFactory {
        final write IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private final String MediaBrowserCompat$ItemReceiver;
        final boolean read;

        read(String str, write write, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = write;
            this.read = z;
        }

        public final Thread newThread(Runnable runnable) {
            C14505 r0;
            synchronized (this) {
                StringBuilder sb = new StringBuilder();
                sb.append("glide-");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append("-thread-");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                r0 = new Thread(runnable, sb.toString()) {
                    public final void run() {
                        Process.setThreadPriority(9);
                        if (read.this.read) {
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                        }
                        try {
                            super.run();
                        } catch (Throwable th) {
                            read.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(th);
                        }
                    }
                };
                this.MediaBrowserCompat$CustomActionResultReceiver++;
            }
            return r0;
        }
    }
}
