package p040o;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.OpenAccountDeepLinkActivity */
public final class OpenAccountDeepLinkActivity<T> extends CountDownLatch implements BankingAgentTransactionsDeepLinkActivity<T>, Future<T>, BulkTransferDeepLinkActivity {
    private T MediaBrowserCompat$CustomActionResultReceiver;
    private AtomicReference<BulkTransferDeepLinkActivity> read = new AtomicReference<>();
    private Throwable write;

    public final void dispose() {
    }

    public OpenAccountDeepLinkActivity() {
        super(1);
    }

    public final boolean cancel(boolean z) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        do {
            bulkTransferDeepLinkActivity = this.read.get();
            if (bulkTransferDeepLinkActivity == this || bulkTransferDeepLinkActivity == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                return false;
            }
        } while (!this.read.compareAndSet(bulkTransferDeepLinkActivity, HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED));
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        countDown();
        return true;
    }

    public final boolean isCancelled() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.read.get());
    }

    public final boolean isDone() {
        return getCount() == 0;
    }

    public final T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            boolean z = AlertController$RecycleListView.read.read;
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.write;
            if (th == null) {
                return this.MediaBrowserCompat$CustomActionResultReceiver;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public final T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            boolean z = AlertController$RecycleListView.read.read;
            if (!await(j, timeUnit)) {
                throw new TimeoutException(HmlBusinessOccupationInfoActivity_ViewBinding.read(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.write;
            if (th == null) {
                return this.MediaBrowserCompat$CustomActionResultReceiver;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.read, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.read.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = t;
    }

    public final void onError(Throwable th) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        if (this.write == null) {
            this.write = th;
            do {
                bulkTransferDeepLinkActivity = this.read.get();
                if (bulkTransferDeepLinkActivity == this || bulkTransferDeepLinkActivity == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                    AlertController$RecycleListView.read.read(th);
                    return;
                }
            } while (!this.read.compareAndSet(bulkTransferDeepLinkActivity, this));
            countDown();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bulkTransferDeepLinkActivity = this.read.get();
            if (bulkTransferDeepLinkActivity == this || bulkTransferDeepLinkActivity == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                return;
            }
        } while (!this.read.compareAndSet(bulkTransferDeepLinkActivity, this));
        countDown();
    }

    public final boolean isDisposed() {
        return isDone();
    }
}
