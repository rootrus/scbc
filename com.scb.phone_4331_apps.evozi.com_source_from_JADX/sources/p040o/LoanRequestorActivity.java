package p040o;

/* renamed from: o.LoanRequestorActivity */
public final class LoanRequestorActivity<T> extends NtbUserInfoActivity<T, T> {
    public LoanRequestorActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new write(bankingAgentTransactionsDeepLinkActivity));
    }

    /* renamed from: o.LoanRequestorActivity$write */
    static final class write<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;

        public final void onNext(T t) {
        }

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
            this.IconCompatParcelizer.onSubscribe(this);
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }

        public final void dispose() {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver.isDisposed();
        }
    }
}
