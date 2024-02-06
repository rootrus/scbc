package p040o;

/* renamed from: o.EasycashPurposefulLoanIntroductionActivity */
public final class EasycashPurposefulLoanIntroductionActivity extends DebitCardResetOtpActivity<Object> {
    public static final DebitCardResetOtpActivity<Object> MediaBrowserCompat$ItemReceiver = new EasycashPurposefulLoanIntroductionActivity();

    private EasycashPurposefulLoanIntroductionActivity() {
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Object> bankingAgentTransactionsDeepLinkActivity) {
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.NEVER);
    }
}
