package p040o;

import java.util.NoSuchElementException;

/* renamed from: o.EasycashCreditPowerSummaryActivity$MediaBrowserCompat$ItemReceiver */
final class C9720x27aae5fa<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private T IconCompatParcelizer;
    private T MediaBrowserCompat$CustomActionResultReceiver;
    private ActivateChequeDeepLinkActivity<? super T> read;
    private BulkTransferDeepLinkActivity write;

    C9720x27aae5fa(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, T t) {
        this.read = activateChequeDeepLinkActivity;
        this.IconCompatParcelizer = t;
    }

    public final void dispose() {
        this.write.dispose();
        this.write = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }

    public final boolean isDisposed() {
        return this.write == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.read.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver = t;
    }

    public final void onError(Throwable th) {
        this.write = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.read.onError(th);
    }

    public final void onComplete() {
        this.write = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        T t = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (t != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
            return;
        }
        T t2 = this.IconCompatParcelizer;
        if (t2 != null) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(t2);
        } else {
            this.read.onError(new NoSuchElementException());
        }
    }
}
