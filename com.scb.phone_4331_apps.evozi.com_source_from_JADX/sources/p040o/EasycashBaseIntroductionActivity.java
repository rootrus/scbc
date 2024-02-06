package p040o;

/* renamed from: o.EasycashBaseIntroductionActivity */
public final class EasycashBaseIntroductionActivity<T> extends NtbUserInfoActivity<T, DebitCardResetPinActivity<T>> {
    public EasycashBaseIntroductionActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetPinActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity));
    }

    /* renamed from: o.EasycashBaseIntroductionActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BulkTransferDeepLinkActivity IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetPinActivity<T>> MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetPinActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.IconCompatParcelizer.dispose();
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(DebitCardResetPinActivity.MediaBrowserCompat$ItemReceiver(t));
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(DebitCardResetPinActivity.MediaBrowserCompat$CustomActionResultReceiver(th));
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }

        public final void onComplete() {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(DebitCardResetPinActivity.write());
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }
    }
}
