package p040o;

/* renamed from: o.DirectDebitBillerSearchActivity */
public final class DirectDebitBillerSearchActivity<T> extends NtbUserInfoActivity<T, T> {
    private BillerDeepLinkActivity<? extends T> read;

    public DirectDebitBillerSearchActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, BillerDeepLinkActivity<? extends T> billerDeepLinkActivity) {
        super(debitCardResetOtpActivity);
        this.read = billerDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.read));
    }
}
