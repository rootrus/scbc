package p040o;

import java.util.ArrayDeque;

/* renamed from: o.EtbSuccessActivity$MediaBrowserCompat$ItemReceiver */
final class EtbSuccessActivity$MediaBrowserCompat$ItemReceiver<T> extends ArrayDeque<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private volatile boolean MediaBrowserCompat$ItemReceiver;
    private int write;

    EtbSuccessActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, int i) {
        this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        this.write = i;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
            this.IconCompatParcelizer.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (this.write == size()) {
            poll();
        }
        offer(t);
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.onError(th);
    }

    public final void onComplete() {
        BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.IconCompatParcelizer;
        while (!this.MediaBrowserCompat$ItemReceiver) {
            Object poll = poll();
            if (poll != null) {
                bankingAgentTransactionsDeepLinkActivity.onNext(poll);
            } else if (!this.MediaBrowserCompat$ItemReceiver) {
                bankingAgentTransactionsDeepLinkActivity.onComplete();
                return;
            } else {
                return;
            }
        }
    }

    public final void dispose() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
