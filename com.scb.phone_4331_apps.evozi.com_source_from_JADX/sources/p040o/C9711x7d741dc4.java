package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.DepositProductCatalogActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9711x7d741dc4<T, U> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private CreditCardDeepLinkActivity<? super U, ? super T> IconCompatParcelizer;
    private ActivateChequeDeepLinkActivity<? super U> MediaBrowserCompat$CustomActionResultReceiver;
    private U MediaBrowserCompat$ItemReceiver;
    private boolean read;
    private BulkTransferDeepLinkActivity write;

    C9711x7d741dc4(ActivateChequeDeepLinkActivity<? super U> activateChequeDeepLinkActivity, U u, CreditCardDeepLinkActivity<? super U, ? super T> creditCardDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = activateChequeDeepLinkActivity;
        this.IconCompatParcelizer = creditCardDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = u;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.write.dispose();
    }

    public final boolean isDisposed() {
        return this.write.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.read) {
            try {
                this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, t);
            } catch (Throwable th) {
                this.write.dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.read) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.read = true;
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        if (!this.read) {
            this.read = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
    }
}
