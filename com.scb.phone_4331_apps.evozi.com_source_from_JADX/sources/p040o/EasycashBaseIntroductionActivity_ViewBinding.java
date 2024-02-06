package p040o;

/* renamed from: o.EasycashBaseIntroductionActivity_ViewBinding */
public final class EasycashBaseIntroductionActivity_ViewBinding<T, U> extends NtbUserInfoActivity<T, U> {
    private DirectDebitDeepLinkActivity<? super T, ? extends U> write;

    public EasycashBaseIntroductionActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends U> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C6442xe8ff2f0c(bankingAgentTransactionsDeepLinkActivity, this.write));
    }
}
