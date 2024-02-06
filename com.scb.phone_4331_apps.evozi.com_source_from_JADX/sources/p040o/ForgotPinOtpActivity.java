package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.ForgotPinOtpActivity */
public final class ForgotPinOtpActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private DebitCardMarketConductDeepLinkActivity<? super T> read;
    private BillerDeepLinkActivity<T> write;

    public ForgotPinOtpActivity(BillerDeepLinkActivity<T> billerDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        this.write = billerDeepLinkActivity;
        this.read = debitCardMarketConductDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.write.IconCompatParcelizer(new read(activateChequeDeepLinkActivity, this.read));
    }

    /* renamed from: o.ForgotPinOtpActivity$read */
    static final class read<T> implements ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private DebitCardMarketConductDeepLinkActivity<? super T> IconCompatParcelizer;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private ActivateChequeDeepLinkActivity<? super T> write;

        read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
            this.write = activateChequeDeepLinkActivity;
            this.IconCompatParcelizer = debitCardMarketConductDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.write.onSubscribe(this);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver(t);
            try {
                this.IconCompatParcelizer.IconCompatParcelizer(t);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }
    }
}
