package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.EtbSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class EtbSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private boolean IconCompatParcelizer;
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private HmlBaseDeepLinkActivity<? super T> read;

    EtbSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.read = hmlBaseDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.MediaBrowserCompat$ItemReceiver.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$ItemReceiver.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.IconCompatParcelizer) {
            try {
                if (!this.read.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                    this.IconCompatParcelizer = true;
                    this.MediaBrowserCompat$ItemReceiver.dispose();
                    this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                    return;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.MediaBrowserCompat$ItemReceiver.dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.IconCompatParcelizer) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        if (!this.IconCompatParcelizer) {
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }
    }
}
