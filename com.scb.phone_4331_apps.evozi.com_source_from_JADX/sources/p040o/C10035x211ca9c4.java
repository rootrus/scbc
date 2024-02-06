package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.lambda$displayCoachMark$0$DepositDetailActivity$MediaBrowserCompat$ItemReceiver */
final class C10035x211ca9c4<T, U> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BankingAgentTransactionsDeepLinkActivity<? super U> IconCompatParcelizer;
    private U MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private CreditCardDeepLinkActivity<? super U, ? super T> read;
    private boolean write;

    C10035x211ca9c4(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, U u, CreditCardDeepLinkActivity<? super U, ? super T> creditCardDeepLinkActivity) {
        this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        this.read = creditCardDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = u;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
            this.IconCompatParcelizer.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.MediaBrowserCompat$ItemReceiver.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$ItemReceiver.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.write) {
            try {
                this.read.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, t);
            } catch (Throwable th) {
                this.MediaBrowserCompat$ItemReceiver.dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.write) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.write = true;
        this.IconCompatParcelizer.onError(th);
    }

    public final void onComplete() {
        if (!this.write) {
            this.write = true;
            this.IconCompatParcelizer.onNext(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.IconCompatParcelizer.onComplete();
        }
    }
}
