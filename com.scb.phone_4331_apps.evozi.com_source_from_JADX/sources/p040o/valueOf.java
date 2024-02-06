package p040o;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.valueOf */
abstract class valueOf<Params, Progress, Result> {
    private static volatile Executor IconCompatParcelizer;
    private static write MediaBrowserCompat$CustomActionResultReceiver;
    private static final BlockingQueue<Runnable> MediaBrowserCompat$MediaItem = new LinkedBlockingQueue(10);
    private static final ThreadFactory RatingCompat = new ThreadFactory() {
        private final AtomicInteger write = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("ModernAsyncTask #");
            sb.append(this.write.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };
    public static final Executor write;
    final AtomicBoolean MediaBrowserCompat$ItemReceiver = new AtomicBoolean();
    private volatile IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer.PENDING;
    private final FutureTask<Result> MediaDescriptionCompat = new FutureTask<Result>(this.MediaMetadataCompat) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                Object obj = get();
                valueOf valueof = valueOf.this;
                if (!valueof.read.get()) {
                    valueOf.MediaBrowserCompat$CustomActionResultReceiver().obtainMessage(1, new read(valueof, obj)).sendToTarget();
                }
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                valueOf valueof2 = valueOf.this;
                if (!valueof2.read.get()) {
                    valueOf.MediaBrowserCompat$CustomActionResultReceiver().obtainMessage(1, new read(valueof2, null)).sendToTarget();
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };
    private final valueOf$MediaBrowserCompat$ItemReceiver<Params, Result> MediaMetadataCompat = new valueOf$MediaBrowserCompat$ItemReceiver<Params, Result>() {
        public final Result call() throws Exception {
            valueOf.this.read.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = valueOf.this.IconCompatParcelizer();
                Binder.flushPendingCommands();
                valueOf valueof = valueOf.this;
                valueOf.MediaBrowserCompat$CustomActionResultReceiver().obtainMessage(1, new read(valueof, result)).sendToTarget();
                return result;
            } catch (Throwable th) {
                valueOf valueof2 = valueOf.this;
                valueOf.MediaBrowserCompat$CustomActionResultReceiver().obtainMessage(1, new read(valueof2, result)).sendToTarget();
                throw th;
            }
        }
    };
    final AtomicBoolean read = new AtomicBoolean();

    /* renamed from: o.valueOf$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: protected */
    public abstract Result IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(Result result) {
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$ItemReceiver(Result result) {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, MediaBrowserCompat$MediaItem, RatingCompat);
        write = threadPoolExecutor;
        IconCompatParcelizer = threadPoolExecutor;
    }

    static Handler MediaBrowserCompat$CustomActionResultReceiver() {
        write write2;
        synchronized (valueOf.class) {
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = new write();
            }
            write2 = MediaBrowserCompat$CustomActionResultReceiver;
        }
        return write2;
    }

    valueOf() {
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.MediaBrowserCompat$ItemReceiver.set(true);
        return this.MediaDescriptionCompat.cancel(false);
    }

    /* renamed from: o.valueOf$1 */
    static /* synthetic */ class C16011 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.valueOf$IconCompatParcelizer[] r0 = p040o.valueOf.IconCompatParcelizer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.valueOf$IconCompatParcelizer r1 = p040o.valueOf.IconCompatParcelizer.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.valueOf$IconCompatParcelizer r1 = p040o.valueOf.IconCompatParcelizer.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.valueOf.C16011.<clinit>():void");
        }
    }

    public final valueOf<Params, Progress, Result> read(Executor executor, Params... paramsArr) {
        if (this.MediaBrowserCompat$SearchResultReceiver != IconCompatParcelizer.PENDING) {
            int i = C16011.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$SearchResultReceiver.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer.RUNNING;
            this.MediaMetadataCompat.read = paramsArr;
            executor.execute(this.MediaDescriptionCompat);
            return this;
        }
    }

    /* renamed from: o.valueOf$write */
    static class write extends Handler {
        write() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            read read = (read) message.obj;
            int i = message.what;
            if (i == 1) {
                read.read.read(read.write[0]);
            } else if (i != 2) {
            }
        }
    }

    /* renamed from: o.valueOf$read */
    static class read<Data> {
        final valueOf read;
        final Data[] write;

        read(valueOf valueof, Data... dataArr) {
            this.read = valueof;
            this.write = dataArr;
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(Result result) {
        if (this.MediaBrowserCompat$ItemReceiver.get()) {
            MediaBrowserCompat$ItemReceiver(result);
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(result);
        }
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer.FINISHED;
    }
}
