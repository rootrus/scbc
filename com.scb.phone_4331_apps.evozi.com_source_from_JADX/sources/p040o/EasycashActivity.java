package p040o;

/* renamed from: o.EasycashActivity */
public final class EasycashActivity<T> extends NtbUserInfoActivity<T, T> {
    private final DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> read;

    public EasycashActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        super(debitCardResetOtpActivity);
        this.read = debitCardMarketConductDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = dataPrivacyManagementDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new MyInsuranceDeepLinkActivity(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
