package p040o;

/* renamed from: o.RtpInputDeepLinkActivity */
public final class RtpInputDeepLinkActivity<T> extends DebitCardResetOtpActivity<T> {
    private DebitCardProductCatalogActivity read;

    public RtpInputDeepLinkActivity(DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
        this.read = debitCardProductCatalogActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.read.IconCompatParcelizer(new read(bankingAgentTransactionsDeepLinkActivity));
    }

    /* renamed from: o.RtpInputDeepLinkActivity$read */
    static final class read extends InvestmentDeepLinkActivity<Void> implements DebitCardRequestInputActivity {
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<?> write;

        public final void MediaBrowserCompat$ItemReceiver() {
        }

        public final /* bridge */ /* synthetic */ Object read() throws Exception {
            return null;
        }

        public final int write(int i) {
            return i & 2;
        }

        public final boolean write() {
            return true;
        }

        read(BankingAgentTransactionsDeepLinkActivity<?> bankingAgentTransactionsDeepLinkActivity) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onComplete() {
            this.write.onComplete();
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.write.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }
    }
}
