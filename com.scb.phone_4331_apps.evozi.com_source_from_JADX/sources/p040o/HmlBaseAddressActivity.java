package p040o;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.HmlBaseAddressActivity */
abstract class HmlBaseAddressActivity extends AtomicReference<Future<?>> implements BulkTransferDeepLinkActivity {
    private static FutureTask<Void> IconCompatParcelizer = new FutureTask<>(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver, (Object) null);
    protected static final FutureTask<Void> read = new FutureTask<>(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver, (Object) null);
    protected final Runnable MediaBrowserCompat$CustomActionResultReceiver;
    protected Thread MediaBrowserCompat$ItemReceiver;

    HmlBaseAddressActivity(Runnable runnable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = runnable;
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != read && future != (futureTask = IconCompatParcelizer) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.MediaBrowserCompat$ItemReceiver != Thread.currentThread());
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == read || future == IconCompatParcelizer;
    }

    public final void read(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == read) {
                return;
            }
            if (future2 == IconCompatParcelizer) {
                future.cancel(this.MediaBrowserCompat$ItemReceiver != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
