package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.RegistrationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class RegistrationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private HmlBaseDeepLinkActivity<? super T> IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity read;
    private BankingAgentTransactionsDeepLinkActivity<? super Boolean> write;

    RegistrationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super Boolean> bankingAgentTransactionsDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
        this.IconCompatParcelizer = hmlBaseDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
            this.read = bulkTransferDeepLinkActivity;
            this.write.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            try {
                if (!this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                    this.read.dispose();
                    this.write.onNext(Boolean.FALSE);
                    this.write.onComplete();
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.read.dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.write.onError(th);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.write.onNext(Boolean.TRUE);
            this.write.onComplete();
        }
    }

    public final void dispose() {
        this.read.dispose();
    }

    public final boolean isDisposed() {
        return this.read.isDisposed();
    }
}
