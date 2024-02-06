package p040o;

/* renamed from: o.BaseCommonNCBConsentActivity */
public final class BaseCommonNCBConsentActivity<T> extends NtbUserInfoActivity<T, T> {
    private DebitCardMarketConductDeepLinkActivity<? super T> read;

    public BaseCommonNCBConsentActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = debitCardMarketConductDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new BaseCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.read));
    }
}
