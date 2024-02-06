package p040o;

/* renamed from: o.EasycashLoanTrackActivity_ViewBinding */
public final class EasycashLoanTrackActivity_ViewBinding<T> extends DebitCardResetOtpActivity<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    public EasycashLoanTrackActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.write.subscribe(bankingAgentTransactionsDeepLinkActivity);
    }
}
