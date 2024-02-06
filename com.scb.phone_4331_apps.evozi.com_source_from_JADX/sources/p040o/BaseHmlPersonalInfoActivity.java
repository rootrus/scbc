package p040o;

/* renamed from: o.BaseHmlPersonalInfoActivity */
public final class BaseHmlPersonalInfoActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private BillerDeepLinkActivity<? extends T> read;
    private BankingAgentDeepLinkActivity write;

    public BaseHmlPersonalInfoActivity(BillerDeepLinkActivity<? extends T> billerDeepLinkActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.read = billerDeepLinkActivity;
        this.write = bankingAgentDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        BaseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver baseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver = new BaseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver(activateChequeDeepLinkActivity, this.read);
        activateChequeDeepLinkActivity.onSubscribe(baseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver);
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(baseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.write.MediaBrowserCompat$CustomActionResultReceiver(baseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver));
    }
}
