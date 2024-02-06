package p040o;

/* renamed from: o.SharingMomentsPreviewActivity_ViewBinding */
public final class SharingMomentsPreviewActivity_ViewBinding<T, R> extends NtbUserInfoActivity<T, R> {
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinActivity<R>> MediaBrowserCompat$ItemReceiver;

    public SharingMomentsPreviewActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinActivity<R>> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C9826x77b4a4ee(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver));
    }
}
