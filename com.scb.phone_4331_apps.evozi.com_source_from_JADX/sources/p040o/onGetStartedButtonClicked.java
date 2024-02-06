package p040o;

/* renamed from: o.onGetStartedButtonClicked */
public final class onGetStartedButtonClicked<T> extends NtbUserInfoActivity<T, T> {
    private ChequeManagementDeepLinkActivity<T, T, T> write;

    public onGetStartedButtonClicked(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, ChequeManagementDeepLinkActivity<T, T, T> chequeManagementDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = chequeManagementDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C10095xb2d62678(bankingAgentTransactionsDeepLinkActivity, this.write));
    }
}
