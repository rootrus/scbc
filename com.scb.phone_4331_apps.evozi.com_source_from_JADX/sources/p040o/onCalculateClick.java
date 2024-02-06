package p040o;

/* renamed from: o.onCalculateClick */
public final class onCalculateClick extends DebitCardResetOtpActivity<Object> implements HmlPersonalInformationDeepLinkActivity<Object> {
    public static final DebitCardResetOtpActivity<Object> MediaBrowserCompat$ItemReceiver = new onCalculateClick();

    public final Object call() {
        return null;
    }

    private onCalculateClick() {
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Object> bankingAgentTransactionsDeepLinkActivity) {
        HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
    }
}
