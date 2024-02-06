package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.RtpEBillSubscriptionDetailActivity$MediaBrowserCompat$ItemReceiver */
final class C9818x545aba17<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private T IconCompatParcelizer;
    private ChequeManagementDeepLinkActivity<T, T, T> MediaBrowserCompat$CustomActionResultReceiver;
    private BaseChangePinWithMaxActivity_ViewBinding<? super T> MediaBrowserCompat$ItemReceiver;
    private boolean read;
    private BulkTransferDeepLinkActivity write;

    C9818x545aba17(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding, ChequeManagementDeepLinkActivity<T, T, T> chequeManagementDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = baseChangePinWithMaxActivity_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = chequeManagementDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (!this.read) {
            T t2 = this.IconCompatParcelizer;
            if (t2 == null) {
                this.IconCompatParcelizer = t;
                return;
            }
            try {
                this.IconCompatParcelizer = HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.read(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
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
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$ItemReceiver.onError(th);
    }

    public final void onComplete() {
        if (!this.read) {
            this.read = true;
            T t = this.IconCompatParcelizer;
            this.IconCompatParcelizer = null;
            if (t != null) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
            } else {
                this.MediaBrowserCompat$ItemReceiver.onComplete();
            }
        }
    }

    public final void dispose() {
        this.write.dispose();
    }

    public final boolean isDisposed() {
        return this.write.isDisposed();
    }
}
