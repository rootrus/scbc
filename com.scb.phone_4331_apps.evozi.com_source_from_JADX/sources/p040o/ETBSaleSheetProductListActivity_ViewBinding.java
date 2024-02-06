package p040o;

/* renamed from: o.ETBSaleSheetProductListActivity_ViewBinding */
public final class ETBSaleSheetProductListActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private HmlBaseDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;

    public ETBSaleSheetProductListActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C9718xdbd4cd45(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
