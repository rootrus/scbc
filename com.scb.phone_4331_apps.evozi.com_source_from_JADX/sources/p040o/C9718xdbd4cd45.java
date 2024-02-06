package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.ETBSaleSheetProductListActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C9718xdbd4cd45<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBaseDeepLinkActivity<? super T> read;
    private boolean write;

    C9718xdbd4cd45(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.read = hmlBaseDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
            this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.IconCompatParcelizer.dispose();
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer.isDisposed();
    }

    public final void onNext(T t) {
        if (this.write) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            return;
        }
        try {
            if (!this.read.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                this.write = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.IconCompatParcelizer.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
    }
}
