package p040o;

/* renamed from: o.ETBSaleSheetProductListActivity */
public final class ETBSaleSheetProductListActivity<T> extends NtbUserInfoActivity<T, T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> MediaBrowserCompat$CustomActionResultReceiver;

    public ETBSaleSheetProductListActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        write write2 = new write(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(write2.read);
        this.IconCompatParcelizer.subscribe(write2);
    }

    /* renamed from: o.ETBSaleSheetProductListActivity$write */
    static final class write<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private boolean IconCompatParcelizer = true;
        private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> MediaBrowserCompat$CustomActionResultReceiver;
        final HmlBusinessOwnerSuccessfulDeepLinkActivity read = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        private BankingAgentTransactionsDeepLinkActivity<? super T> write;

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.write(this.read, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            if (this.IconCompatParcelizer) {
                this.IconCompatParcelizer = false;
            }
            this.write.onNext(t);
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        public final void onComplete() {
            if (this.IconCompatParcelizer) {
                this.IconCompatParcelizer = false;
                this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(this);
                return;
            }
            this.write.onComplete();
        }
    }
}
