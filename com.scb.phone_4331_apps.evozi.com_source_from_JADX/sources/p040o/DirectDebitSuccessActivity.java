package p040o;

/* renamed from: o.DirectDebitSuccessActivity */
public final class DirectDebitSuccessActivity<T, U> extends DebitCardResetOtpActivity<T> {
    final DebitCardResetPinSuccessActivity_ViewBinding<? extends T> IconCompatParcelizer;
    private DebitCardResetPinSuccessActivity_ViewBinding<U> MediaBrowserCompat$ItemReceiver;

    public DirectDebitSuccessActivity(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding2) {
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(hmlBusinessOwnerSuccessfulDeepLinkActivity);
        this.MediaBrowserCompat$ItemReceiver.subscribe(new DirectDebitSuccessActivity$MediaBrowserCompat$ItemReceiver(this, hmlBusinessOwnerSuccessfulDeepLinkActivity, bankingAgentTransactionsDeepLinkActivity));
    }
}
