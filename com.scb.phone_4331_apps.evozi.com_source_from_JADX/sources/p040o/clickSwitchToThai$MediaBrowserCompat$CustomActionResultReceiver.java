package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.clickSwitchToThai$MediaBrowserCompat$CustomActionResultReceiver */
final class clickSwitchToThai$MediaBrowserCompat$CustomActionResultReceiver<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private ActivateChequeDeepLinkActivity<? super Boolean> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private HmlBaseDeepLinkActivity<? super T> read;
    private BulkTransferDeepLinkActivity write;

    clickSwitchToThai$MediaBrowserCompat$CustomActionResultReceiver(ActivateChequeDeepLinkActivity<? super Boolean> activateChequeDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = activateChequeDeepLinkActivity;
        this.read = hmlBaseDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            try {
                if (!this.read.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.write.dispose();
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(Boolean.FALSE);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.write.dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = true;
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(Boolean.TRUE);
        }
    }

    public final void dispose() {
        this.write.dispose();
    }

    public final boolean isDisposed() {
        return this.write.isDisposed();
    }
}
