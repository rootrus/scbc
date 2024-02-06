package p040o;

/* renamed from: o.EtbSuccessActivity_ViewBinding */
public final class EtbSuccessActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private HmlBaseDeepLinkActivity<? super T> read;

    public EtbSuccessActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = hmlBaseDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new EtbSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.read));
    }
}
