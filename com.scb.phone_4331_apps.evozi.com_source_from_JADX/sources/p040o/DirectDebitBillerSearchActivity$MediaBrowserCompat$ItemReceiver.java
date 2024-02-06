package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver */
final class DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BillerDeepLinkActivity<? extends T> IconCompatParcelizer;
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;

    DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, BillerDeepLinkActivity<? extends T> billerDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.IconCompatParcelizer = billerDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity) && !this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
        this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        this.MediaBrowserCompat$ItemReceiver = true;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, (BulkTransferDeepLinkActivity) null);
        BillerDeepLinkActivity<? extends T> billerDeepLinkActivity = this.IconCompatParcelizer;
        this.IconCompatParcelizer = null;
        billerDeepLinkActivity.IconCompatParcelizer(this);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
