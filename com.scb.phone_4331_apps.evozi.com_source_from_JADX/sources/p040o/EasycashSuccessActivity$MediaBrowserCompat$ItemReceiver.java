package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.EasycashSuccessActivity$MediaBrowserCompat$ItemReceiver */
final class EasycashSuccessActivity$MediaBrowserCompat$ItemReceiver extends AtomicReference<BulkTransferDeepLinkActivity> implements BulkTransferDeepLinkActivity, Runnable {
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    private BankingAgentTransactionsDeepLinkActivity<? super Long> read;

    EasycashSuccessActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity, long j, long j2) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = j2;
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }

    public final void run() {
        if (!isDisposed()) {
            long j = this.MediaBrowserCompat$ItemReceiver;
            this.read.onNext(Long.valueOf(j));
            if (j == this.MediaBrowserCompat$CustomActionResultReceiver) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
                this.read.onComplete();
                return;
            }
            this.MediaBrowserCompat$ItemReceiver = j + 1;
        }
    }
}
