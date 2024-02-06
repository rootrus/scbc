package p040o;

/* renamed from: o.lambda$showCoachMark$0$NTBBankingServiceActivity */
public final class lambda$showCoachMark$0$NTBBankingServiceActivity<T, R> extends DebitCardResetOtpActivity<R> {
    private int IconCompatParcelizer;
    private HmlBusinessOccupationInfoActivity MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> MediaBrowserCompat$ItemReceiver;
    private DebitCardResetOtpActivity<T> write;

    public lambda$showCoachMark$0$NTBBankingServiceActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity, int i) {
        this.write = debitCardResetOtpActivity;
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOccupationInfoActivity;
        this.IconCompatParcelizer = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        if (!AlertController$RecycleListView.IconCompatParcelizer((Object) this.write, this.MediaBrowserCompat$ItemReceiver, bankingAgentTransactionsDeepLinkActivity)) {
            this.write.subscribe(new C10039xcbb44eab(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }
}
