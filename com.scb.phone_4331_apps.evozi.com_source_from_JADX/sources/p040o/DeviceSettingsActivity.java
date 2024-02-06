package p040o;

/* renamed from: o.DeviceSettingsActivity */
public final class DeviceSettingsActivity<T> extends NtbUserInfoActivity<T, Long> {
    public DeviceSettingsActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity));
    }

    /* renamed from: o.DeviceSettingsActivity$read */
    static final class read implements BankingAgentTransactionsDeepLinkActivity<Object>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super Long> IconCompatParcelizer;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private long read;

        read(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }

        public final void onNext(Object obj) {
            this.read++;
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            this.IconCompatParcelizer.onNext(Long.valueOf(this.read));
            this.IconCompatParcelizer.onComplete();
        }
    }
}
