package p040o;

/* renamed from: o.onCopy */
public final class onCopy<T, R> extends BScanCNotificationDeepLinkActivity<R> {
    private DirectDebitDeepLinkActivity<? super T, ? extends R> IconCompatParcelizer;
    private BillerDeepLinkActivity<? extends T> MediaBrowserCompat$ItemReceiver;

    public onCopy(BillerDeepLinkActivity<? extends T> billerDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends R> directDebitDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = billerDeepLinkActivity;
        this.IconCompatParcelizer = directDebitDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new onCopy$MediaBrowserCompat$ItemReceiver(activateChequeDeepLinkActivity, this.IconCompatParcelizer));
    }
}
