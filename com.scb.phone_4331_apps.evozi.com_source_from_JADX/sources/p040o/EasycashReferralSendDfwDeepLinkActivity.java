package p040o;

/* renamed from: o.EasycashReferralSendDfwDeepLinkActivity */
public final class EasycashReferralSendDfwDeepLinkActivity<T> extends NtbUserInfoActivity<T, T> {
    public EasycashReferralSendDfwDeepLinkActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C9723xfa8478fd(bankingAgentTransactionsDeepLinkActivity));
    }
}
