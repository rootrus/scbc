package p040o;

/* renamed from: o.SharingMomentsPreviewActivity */
public final class SharingMomentsPreviewActivity<T, K> extends NtbUserInfoActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super T, K> MediaBrowserCompat$ItemReceiver;
    private CreditCardServiceTabDeepLinkActivity<? super K, ? super K> read;

    public SharingMomentsPreviewActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, K> directDebitDeepLinkActivity, CreditCardServiceTabDeepLinkActivity<? super K, ? super K> creditCardServiceTabDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
        this.read = creditCardServiceTabDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new SharingMomentsPreviewActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, this.read));
    }
}
