package p040o;

/* renamed from: o.RegistrationActivity */
public final class RegistrationActivity<T, R> extends DebitCardResetOtpActivity<R> {
    private boolean IconCompatParcelizer;
    private DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> MediaBrowserCompat$ItemReceiver;
    private DebitCardResetOtpActivity<T> write;

    public RegistrationActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        this.write = debitCardResetOtpActivity;
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
        this.IconCompatParcelizer = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        if (!AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((Object) this.write, this.MediaBrowserCompat$ItemReceiver, bankingAgentTransactionsDeepLinkActivity)) {
            this.write.subscribe(new RegistrationActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer));
        }
    }
}
