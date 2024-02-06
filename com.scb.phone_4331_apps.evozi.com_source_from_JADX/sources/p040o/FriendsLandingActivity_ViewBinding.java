package p040o;

/* renamed from: o.FriendsLandingActivity_ViewBinding */
public final class FriendsLandingActivity_ViewBinding<T> extends DebitCardResetOtpActivity<T> {
    private BillerDeepLinkActivity<? extends T> MediaBrowserCompat$CustomActionResultReceiver;

    public FriendsLandingActivity_ViewBinding(BillerDeepLinkActivity<? extends T> billerDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = billerDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new write(bankingAgentTransactionsDeepLinkActivity));
    }

    public static <T> ActivateChequeDeepLinkActivity<T> MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        return new write(bankingAgentTransactionsDeepLinkActivity);
    }

    /* renamed from: o.FriendsLandingActivity_ViewBinding$write */
    static final class write<T> extends NotificationDeepLinkActivity<T> implements ActivateChequeDeepLinkActivity<T> {
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            super(bankingAgentTransactionsDeepLinkActivity);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.write.onSubscribe(this);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            MediaBrowserCompat$ItemReceiver(t);
        }

        public final void onError(Throwable th) {
            IconCompatParcelizer(th);
        }

        public final void dispose() {
            super.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }
    }
}
