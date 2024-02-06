package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.FastPayInputActivity$MediaBrowserCompat$ItemReceiver */
final class FastPayInputActivity$MediaBrowserCompat$ItemReceiver<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
    private AtomicReference<BulkTransferDeepLinkActivity> IconCompatParcelizer;
    private BankingAgentTransactionsDeepLinkActivity<? super T> read;

    FastPayInputActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, AtomicReference<BulkTransferDeepLinkActivity> atomicReference) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.IconCompatParcelizer = atomicReference;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        this.read.onNext(t);
    }

    public final void onError(Throwable th) {
        this.read.onError(th);
    }

    public final void onComplete() {
        this.read.onComplete();
    }
}
