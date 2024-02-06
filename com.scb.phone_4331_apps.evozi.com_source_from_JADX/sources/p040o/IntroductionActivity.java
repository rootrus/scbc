package p040o;

/* renamed from: o.IntroductionActivity */
public final class IntroductionActivity<T> extends DebitCardResetOtpActivity<T> {
    private BaseChangePinWithMaxActivity<T> MediaBrowserCompat$CustomActionResultReceiver;

    public IntroductionActivity(BaseChangePinWithMaxActivity<T> baseChangePinWithMaxActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseChangePinWithMaxActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity));
    }

    public static <T> BaseChangePinWithMaxActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        return new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity);
    }

    /* renamed from: o.IntroductionActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends NotificationDeepLinkActivity<T> implements BaseChangePinWithMaxActivity_ViewBinding<T> {
        private BulkTransferDeepLinkActivity read;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            super(bankingAgentTransactionsDeepLinkActivity);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                this.read = bulkTransferDeepLinkActivity;
                this.write.onSubscribe(this);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            MediaBrowserCompat$ItemReceiver(t);
        }

        public final void onError(Throwable th) {
            IconCompatParcelizer(th);
        }

        public final void onComplete() {
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void dispose() {
            super.dispose();
            this.read.dispose();
        }
    }
}
