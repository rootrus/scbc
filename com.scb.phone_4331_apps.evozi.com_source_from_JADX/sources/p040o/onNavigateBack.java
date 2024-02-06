package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.onNavigateBack */
public final class onNavigateBack<T> extends BScanCNotificationDeepLinkActivity<Boolean> implements HmlLatestLoanOfferStatusDeepLinkActivity<Boolean> {
    private HmlBaseDeepLinkActivity<? super T> read;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    public onNavigateBack(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
        this.read = hmlBaseDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super Boolean> activateChequeDeepLinkActivity) {
        this.write.subscribe(new IconCompatParcelizer(activateChequeDeepLinkActivity, this.read));
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver() {
        return new WelcomeAboardActivity(this.write, this.read);
    }

    /* renamed from: o.onNavigateBack$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private HmlBaseDeepLinkActivity<? super T> IconCompatParcelizer;
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private ActivateChequeDeepLinkActivity<? super Boolean> read;
        private BulkTransferDeepLinkActivity write;

        IconCompatParcelizer(ActivateChequeDeepLinkActivity<? super Boolean> activateChequeDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
            this.read = activateChequeDeepLinkActivity;
            this.IconCompatParcelizer = hmlBaseDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
                this.write = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                try {
                    if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = true;
                        this.write.dispose();
                        this.read.MediaBrowserCompat$CustomActionResultReceiver(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.write.dispose();
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
            this.read.onError(th);
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                this.read.MediaBrowserCompat$CustomActionResultReceiver(Boolean.FALSE);
            }
        }

        public final void dispose() {
            this.write.dispose();
        }

        public final boolean isDisposed() {
            return this.write.isDisposed();
        }
    }
}
