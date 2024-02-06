package p040o;

/* renamed from: o.HmlCalculatorDeepLinkActivity$MediaSessionCompat$Token */
final class HmlCalculatorDeepLinkActivity$MediaSessionCompat$Token<T> implements HmlBaseDeepLinkActivity<T> {
    private ECouponRedemptionDeeplinkActivity read;

    HmlCalculatorDeepLinkActivity$MediaSessionCompat$Token(ECouponRedemptionDeeplinkActivity eCouponRedemptionDeeplinkActivity) {
        this.read = eCouponRedemptionDeeplinkActivity;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(T t) throws Exception {
        return !this.read.MediaBrowserCompat$ItemReceiver();
    }
}
