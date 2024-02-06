package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver */
final class DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver implements BankingAgentTransactionsDeepLinkActivity<U> {
    final HmlBusinessOwnerSuccessfulDeepLinkActivity IconCompatParcelizer;
    private /* synthetic */ DirectDebitSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;
    final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private boolean read;

    DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver(DirectDebitSuccessActivity directDebitSuccessActivity, HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitSuccessActivity;
        this.IconCompatParcelizer = hmlBusinessOwnerSuccessfulDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.write(this.IconCompatParcelizer, bulkTransferDeepLinkActivity);
    }

    public final void onNext(U u) {
        onComplete();
    }

    public final void onError(Throwable th) {
        if (this.read) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.read = true;
        this.MediaBrowserCompat$ItemReceiver.onError(th);
    }

    public final void onComplete() {
        if (!this.read) {
            this.read = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.subscribe(new write());
        }
    }

    /* renamed from: o.DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver$write */
    final class write implements BankingAgentTransactionsDeepLinkActivity<T> {
        write() {
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.write(DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver.this.IconCompatParcelizer, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver.this.MediaBrowserCompat$ItemReceiver.onNext(t);
        }

        public final void onError(Throwable th) {
            DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver.this.MediaBrowserCompat$ItemReceiver.onError(th);
        }

        public final void onComplete() {
            DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver.this.MediaBrowserCompat$ItemReceiver.onComplete();
        }
    }
}
