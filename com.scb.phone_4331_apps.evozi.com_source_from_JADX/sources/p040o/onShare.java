package p040o;

/* renamed from: o.onShare */
public final class onShare<T> extends BScanCNotificationDeepLinkActivity<T> {
    private BillerDeepLinkActivity<T> MediaBrowserCompat$CustomActionResultReceiver;

    public onShare(BillerDeepLinkActivity<T> billerDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = billerDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(activateChequeDeepLinkActivity);
    }
}
