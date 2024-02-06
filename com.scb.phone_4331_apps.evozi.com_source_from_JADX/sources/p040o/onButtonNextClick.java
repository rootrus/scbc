package p040o;

/* renamed from: o.onButtonNextClick */
public final class onButtonNextClick<T> extends BScanCNotificationDeepLinkActivity<T> {
    final DebitCardMarketConductDeepLinkActivity<? super Throwable> MediaBrowserCompat$ItemReceiver;
    private BillerDeepLinkActivity<T> read;

    public onButtonNextClick(BillerDeepLinkActivity<T> billerDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity) {
        this.read = billerDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = debitCardMarketConductDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.read.IconCompatParcelizer(new onButtonNextClick$MediaBrowserCompat$ItemReceiver(this, activateChequeDeepLinkActivity));
    }
}
