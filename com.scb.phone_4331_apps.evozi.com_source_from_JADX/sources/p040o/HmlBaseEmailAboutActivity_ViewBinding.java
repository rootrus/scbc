package p040o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlBaseEmailAboutActivity_ViewBinding */
final class HmlBaseEmailAboutActivity_ViewBinding implements Callable<Void>, BulkTransferDeepLinkActivity {
    private static FutureTask<Void> read = new FutureTask<>(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver, (Object) null);
    private AtomicReference<Future<?>> IconCompatParcelizer = new AtomicReference<>();
    private Thread MediaBrowserCompat$CustomActionResultReceiver;
    private AtomicReference<Future<?>> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
    private Runnable MediaBrowserCompat$MediaItem;
    private ExecutorService write;

    HmlBaseEmailAboutActivity_ViewBinding(Runnable runnable, ExecutorService executorService) {
        this.MediaBrowserCompat$MediaItem = runnable;
        this.write = executorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: IconCompatParcelizer */
    public Void call() throws Exception {
        this.MediaBrowserCompat$CustomActionResultReceiver = Thread.currentThread();
        try {
            this.MediaBrowserCompat$MediaItem.run();
            Future submit = this.write.submit(this);
            while (true) {
                Future future = this.MediaBrowserCompat$ItemReceiver.get();
                if (future != read) {
                    if (this.MediaBrowserCompat$ItemReceiver.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    submit.cancel(this.MediaBrowserCompat$CustomActionResultReceiver != Thread.currentThread());
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        } catch (Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            AlertController$RecycleListView.read.read(th);
        }
        return null;
    }

    public final void dispose() {
        Future andSet = this.IconCompatParcelizer.getAndSet(read);
        boolean z = true;
        if (!(andSet == null || andSet == read)) {
            andSet.cancel(this.MediaBrowserCompat$CustomActionResultReceiver != Thread.currentThread());
        }
        Future andSet2 = this.MediaBrowserCompat$ItemReceiver.getAndSet(read);
        if (andSet2 != null && andSet2 != read) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer.get() == read;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Future<?> future) {
        Future future2;
        do {
            future2 = this.IconCompatParcelizer.get();
            if (future2 == read) {
                future.cancel(this.MediaBrowserCompat$CustomActionResultReceiver != Thread.currentThread());
                return;
            }
        } while (!this.IconCompatParcelizer.compareAndSet(future2, future));
    }
}
