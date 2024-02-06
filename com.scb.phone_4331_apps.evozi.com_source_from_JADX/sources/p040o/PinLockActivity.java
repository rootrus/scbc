package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.PinLockActivity */
public final class PinLockActivity<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private AtomicReference<BulkTransferDeepLinkActivity> IconCompatParcelizer = new AtomicReference<>();
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;

    public PinLockActivity(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
    }

    public final void onError(Throwable th) {
        dispose();
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        dispose();
        this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.IconCompatParcelizer);
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer.get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
