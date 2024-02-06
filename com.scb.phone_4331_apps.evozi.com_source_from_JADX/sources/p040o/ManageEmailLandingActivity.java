package p040o;

/* renamed from: o.ManageEmailLandingActivity */
public final class ManageEmailLandingActivity<T> extends NtbUserInfoActivity<T, T> {
    private HmlBaseDeepLinkActivity<? super Throwable> MediaBrowserCompat$CustomActionResultReceiver;
    private long read;

    public ManageEmailLandingActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, long j, HmlBaseDeepLinkActivity<? super Throwable> hmlBaseDeepLinkActivity) {
        super(debitCardResetOtpActivity);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseDeepLinkActivity;
        this.read = j;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(hmlBusinessOwnerSuccessfulDeepLinkActivity);
        new ManageEmailLandingActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, hmlBusinessOwnerSuccessfulDeepLinkActivity, this.IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver();
    }
}
