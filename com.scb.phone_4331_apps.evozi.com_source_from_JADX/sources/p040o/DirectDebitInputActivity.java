package p040o;

/* renamed from: o.DirectDebitInputActivity */
public final class DirectDebitInputActivity<T> extends BScanCNotificationDeepLinkActivity<Long> implements HmlLatestLoanOfferStatusDeepLinkActivity<Long> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$CustomActionResultReceiver;

    public DirectDebitInputActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super Long> activateChequeDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(new IconCompatParcelizer(activateChequeDeepLinkActivity));
    }

    public final DebitCardResetOtpActivity<Long> MediaBrowserCompat$CustomActionResultReceiver() {
        return new DeviceSettingsActivity(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.DirectDebitInputActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer implements BankingAgentTransactionsDeepLinkActivity<Object>, BulkTransferDeepLinkActivity {
        private ActivateChequeDeepLinkActivity<? super Long> IconCompatParcelizer;
        private long read;
        private BulkTransferDeepLinkActivity write;

        IconCompatParcelizer(ActivateChequeDeepLinkActivity<? super Long> activateChequeDeepLinkActivity) {
            this.IconCompatParcelizer = activateChequeDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
                this.write = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.write.dispose();
            this.write = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.write.isDisposed();
        }

        public final void onNext(Object obj) {
            this.read++;
        }

        public final void onError(Throwable th) {
            this.write = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            this.write = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(Long.valueOf(this.read));
        }
    }
}
