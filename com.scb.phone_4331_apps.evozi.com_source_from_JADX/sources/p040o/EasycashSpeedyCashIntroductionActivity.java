package p040o;

/* renamed from: o.EasycashSpeedyCashIntroductionActivity */
public final class EasycashSpeedyCashIntroductionActivity<T> extends NtbUserInfoActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;

    public EasycashSpeedyCashIntroductionActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> directDebitDeepLinkActivity, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        C6455x7dc28e1f easycashSpeedyCashIntroductionActivity$MediaBrowserCompat$ItemReceiver = new C6455x7dc28e1f(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(easycashSpeedyCashIntroductionActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        this.IconCompatParcelizer.subscribe(easycashSpeedyCashIntroductionActivity$MediaBrowserCompat$ItemReceiver);
    }
}
