package p040o;

/* renamed from: o.openTermsAndConditions */
public final class openTermsAndConditions<T> extends BScanCNotificationDeepLinkActivity<T> {
    private T IconCompatParcelizer;

    public openTermsAndConditions(T t) {
        this.IconCompatParcelizer = t;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        activateChequeDeepLinkActivity.onSubscribe(HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE);
        activateChequeDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }
}
