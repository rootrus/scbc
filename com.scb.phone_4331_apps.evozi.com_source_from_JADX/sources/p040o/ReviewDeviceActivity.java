package p040o;

/* renamed from: o.ReviewDeviceActivity */
public final class ReviewDeviceActivity<T, R> extends BScanCNotificationDeepLinkActivity<R> {
    private BillerDeepLinkActivity<? extends T> read;
    private DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> write;

    public ReviewDeviceActivity(BillerDeepLinkActivity<? extends T> billerDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity) {
        this.write = directDebitDeepLinkActivity;
        this.read = billerDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity) {
        this.read.IconCompatParcelizer(new C7026x7a342ea(activateChequeDeepLinkActivity, this.write));
    }
}
