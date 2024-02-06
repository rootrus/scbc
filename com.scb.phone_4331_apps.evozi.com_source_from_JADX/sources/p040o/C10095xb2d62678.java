package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.onGetStartedButtonClicked$MediaBrowserCompat$CustomActionResultReceiver */
final class C10095xb2d62678<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private T IconCompatParcelizer;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private ChequeManagementDeepLinkActivity<T, T, T> MediaBrowserCompat$ItemReceiver;
    private BankingAgentTransactionsDeepLinkActivity<? super T> read;
    private boolean write;

    C10095xb2d62678(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, ChequeManagementDeepLinkActivity<T, T, T> chequeManagementDeepLinkActivity) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = chequeManagementDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
            this.read.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.write) {
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.read;
            T t2 = this.IconCompatParcelizer;
            if (t2 == null) {
                this.IconCompatParcelizer = t;
                bankingAgentTransactionsDeepLinkActivity.onNext(t);
                return;
            }
            try {
                T write2 = HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.read(t2, t), "The value returned by the accumulator is null");
                this.IconCompatParcelizer = write2;
                bankingAgentTransactionsDeepLinkActivity.onNext(write2);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
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
        this.read.onError(th);
    }

    public final void onComplete() {
        if (!this.write) {
            this.write = true;
            this.read.onComplete();
        }
    }
}
