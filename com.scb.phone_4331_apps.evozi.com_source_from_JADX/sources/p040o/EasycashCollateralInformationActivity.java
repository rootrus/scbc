package p040o;

/* renamed from: o.EasycashCollateralInformationActivity */
public final class EasycashCollateralInformationActivity<T> extends NtbUserInfoActivity<T, T> {
    private HmlBaseDeepLinkActivity<? super T> write;

    public EasycashCollateralInformationActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = hmlBaseDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C6447x15e3446b(bankingAgentTransactionsDeepLinkActivity, this.write));
    }
}
