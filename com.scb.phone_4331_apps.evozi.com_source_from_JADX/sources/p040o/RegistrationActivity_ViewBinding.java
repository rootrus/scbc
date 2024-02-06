package p040o;

/* renamed from: o.RegistrationActivity_ViewBinding */
public final class RegistrationActivity_ViewBinding<T> extends NtbUserInfoActivity<T, Boolean> {
    private HmlBaseDeepLinkActivity<? super T> read;

    public RegistrationActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = hmlBaseDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Boolean> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new RegistrationActivity_ViewBinding$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.read));
    }
}
