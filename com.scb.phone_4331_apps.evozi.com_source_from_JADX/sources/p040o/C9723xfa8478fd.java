package p040o;

/* renamed from: o.EasycashReferralSendDfwDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9723xfa8478fd<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private BankingAgentTransactionsDeepLinkActivity<? super T> write;

    C9723xfa8478fd(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void dispose() {
        this.IconCompatParcelizer.dispose();
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer.isDisposed();
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
            this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
            this.write.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.write.onNext(t);
    }

    public final void onError(Throwable th) {
        this.write.onError(th);
    }

    public final void onComplete() {
        this.write.onComplete();
    }
}
