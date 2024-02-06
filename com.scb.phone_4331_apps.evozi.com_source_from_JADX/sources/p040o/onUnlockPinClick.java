package p040o;

/* renamed from: o.onUnlockPinClick */
public final class onUnlockPinClick<T> extends BScanCNotificationDeepLinkActivity<T> {
    private BillerDeepLinkActivity<T> IconCompatParcelizer;
    private DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> write;

    public onUnlockPinClick(BillerDeepLinkActivity<T> billerDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity) {
        this.IconCompatParcelizer = billerDeepLinkActivity;
        this.write = debitCardMarketConductDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.IconCompatParcelizer.IconCompatParcelizer(new onUnlockPinClick$MediaBrowserCompat$ItemReceiver(activateChequeDeepLinkActivity, this.write));
    }
}
