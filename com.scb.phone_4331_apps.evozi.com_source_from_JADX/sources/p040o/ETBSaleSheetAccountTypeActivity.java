package p040o;

/* renamed from: o.ETBSaleSheetAccountTypeActivity */
public final class ETBSaleSheetAccountTypeActivity<T> extends NtbUserInfoActivity<T, T> {
    private long MediaBrowserCompat$ItemReceiver;

    public ETBSaleSheetAccountTypeActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = j;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.ETBSaleSheetAccountTypeActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private long MediaBrowserCompat$ItemReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super T> read;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = j;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            long j = this.MediaBrowserCompat$ItemReceiver;
            if (j != 0) {
                this.MediaBrowserCompat$ItemReceiver = j - 1;
            } else {
                this.read.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        public final void onComplete() {
            this.read.onComplete();
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }
    }
}
