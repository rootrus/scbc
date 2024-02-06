package p040o;

/* renamed from: o.CommercialReferralNCBConsentActivity */
public final class CommercialReferralNCBConsentActivity<T> extends NtbUserInfoActivity<T, T> {
    public CommercialReferralNCBConsentActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity));
    }

    /* renamed from: o.CommercialReferralNCBConsentActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
        private BulkTransferDeepLinkActivity write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void dispose() {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.write;
            this.write = HmlBusinessInformationActivity.INSTANCE;
            this.MediaBrowserCompat$ItemReceiver = HmlBusinessInformationActivity.IconCompatParcelizer();
            bulkTransferDeepLinkActivity.dispose();
        }

        public final boolean isDisposed() {
            return this.write.isDisposed();
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
                this.write = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$ItemReceiver.onNext(t);
        }

        public final void onError(Throwable th) {
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
            this.write = HmlBusinessInformationActivity.INSTANCE;
            this.MediaBrowserCompat$ItemReceiver = HmlBusinessInformationActivity.IconCompatParcelizer();
            bankingAgentTransactionsDeepLinkActivity.onError(th);
        }

        public final void onComplete() {
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
            this.write = HmlBusinessInformationActivity.INSTANCE;
            this.MediaBrowserCompat$ItemReceiver = HmlBusinessInformationActivity.IconCompatParcelizer();
            bankingAgentTransactionsDeepLinkActivity.onComplete();
        }
    }
}
