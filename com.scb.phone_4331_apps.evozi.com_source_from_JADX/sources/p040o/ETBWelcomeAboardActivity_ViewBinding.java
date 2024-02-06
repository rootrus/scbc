package p040o;

/* renamed from: o.ETBWelcomeAboardActivity_ViewBinding */
public final class ETBWelcomeAboardActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    public ETBWelcomeAboardActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity));
    }

    /* renamed from: o.ETBWelcomeAboardActivity_ViewBinding$read */
    static final class read<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private T MediaBrowserCompat$CustomActionResultReceiver;
        private BulkTransferDeepLinkActivity read;
        private BankingAgentTransactionsDeepLinkActivity<? super T> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                this.read = bulkTransferDeepLinkActivity;
                this.write.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver = t;
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.onError(th);
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.read.dispose();
        }

        public final boolean isDisposed() {
            return this.read.isDisposed();
        }

        public final void onComplete() {
            T t = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (t != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                this.write.onNext(t);
            }
            this.write.onComplete();
        }
    }
}
