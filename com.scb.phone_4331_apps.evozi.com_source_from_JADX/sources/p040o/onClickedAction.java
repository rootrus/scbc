package p040o;

/* renamed from: o.onClickedAction */
public final class onClickedAction<T, R> extends NtbUserInfoActivity<T, R> {
    private DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;

    public onClickedAction(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new onClickedAction$MediaBrowserCompat$CustomActionResultReceiver(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver));
    }
}
