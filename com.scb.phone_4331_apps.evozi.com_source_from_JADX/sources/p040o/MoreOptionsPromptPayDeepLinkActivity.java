package p040o;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.MoreOptionsPromptPayDeepLinkActivity */
public final class MoreOptionsPromptPayDeepLinkActivity<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    public static final Object MediaBrowserCompat$ItemReceiver = new Object();
    private Queue<Object> write;

    public MoreOptionsPromptPayDeepLinkActivity(Queue<Object> queue) {
        this.write = queue;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        this.write.offer(HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t));
    }

    public final void onError(Throwable th) {
        this.write.offer(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(th));
    }

    public final void onComplete() {
        this.write.offer(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final void dispose() {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this)) {
            this.write.offer(MediaBrowserCompat$ItemReceiver);
        }
    }

    public final boolean isDisposed() {
        return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
