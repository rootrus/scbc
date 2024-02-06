package p040o;

/* renamed from: o.DirectDebitTermsAndConditionsActivity */
public final class DirectDebitTermsAndConditionsActivity<T, U> extends NtbUserInfoActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<U>> MediaBrowserCompat$CustomActionResultReceiver;

    public DirectDebitTermsAndConditionsActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<U>> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C9712x62f797b6(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
