package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.ManageEmailInputActivity */
public final class ManageEmailInputActivity<T, R> extends BScanCNotificationDeepLinkActivity<R> {
    private R IconCompatParcelizer;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver;
    private ChequeManagementDeepLinkActivity<R, ? super T, R> write;

    public ManageEmailInputActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, R r, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        this.IconCompatParcelizer = r;
        this.write = chequeManagementDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver.subscribe(new write(activateChequeDeepLinkActivity, this.write, this.IconCompatParcelizer));
    }

    /* renamed from: o.ManageEmailInputActivity$write */
    static final class write<T, R> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BulkTransferDeepLinkActivity IconCompatParcelizer;
        private ActivateChequeDeepLinkActivity<? super R> MediaBrowserCompat$CustomActionResultReceiver;
        private R MediaBrowserCompat$ItemReceiver;
        private ChequeManagementDeepLinkActivity<R, ? super T, R> read;

        write(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity, R r) {
            this.MediaBrowserCompat$CustomActionResultReceiver = activateChequeDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = r;
            this.read = chequeManagementDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            R r = this.MediaBrowserCompat$ItemReceiver;
            if (r != null) {
                try {
                    this.MediaBrowserCompat$ItemReceiver = HmlLatestPersonalInformationDeepLinkActivity.write(this.read.read(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.IconCompatParcelizer.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            R r = this.MediaBrowserCompat$ItemReceiver;
            if (r != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(r);
            }
        }

        public final void dispose() {
            this.IconCompatParcelizer.dispose();
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }
    }
}
