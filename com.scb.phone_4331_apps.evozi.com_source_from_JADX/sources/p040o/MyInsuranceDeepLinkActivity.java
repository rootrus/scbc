package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.MyInsuranceDeepLinkActivity */
public final class MyInsuranceDeepLinkActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
    private DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private BulkTransferDeepLinkActivity read;

    public MyInsuranceDeepLinkActivity(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardMarketConductDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = dataPrivacyManagementDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(bulkTransferDeepLinkActivity);
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                this.read = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            bulkTransferDeepLinkActivity.dispose();
            this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) this.IconCompatParcelizer);
        }
    }

    public final void onNext(T t) {
        this.IconCompatParcelizer.onNext(t);
    }

    public final void onError(Throwable th) {
        if (this.read != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            this.IconCompatParcelizer.onError(th);
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        if (this.read != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            this.IconCompatParcelizer.onComplete();
        }
    }

    public final void dispose() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.read;
        if (bulkTransferDeepLinkActivity != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            try {
                this.MediaBrowserCompat$ItemReceiver.read();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.read.isDisposed();
    }
}
