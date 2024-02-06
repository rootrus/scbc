package p040o;

/* renamed from: o.FundRedeemReviewActivity */
public abstract class FundRedeemReviewActivity<T> implements FundRedeemLandingActivity<Object, T> {
    private T IconCompatParcelizer;

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(clickNext<?> clicknext) {
        onGetStartedClick.write((Object) clicknext, "property");
    }

    public FundRedeemReviewActivity(T t) {
        this.IconCompatParcelizer = t;
    }

    public final T read(clickNext<?> clicknext) {
        onGetStartedClick.write((Object) clicknext, "property");
        return this.IconCompatParcelizer;
    }

    public final void MediaBrowserCompat$ItemReceiver(clickNext<?> clicknext, T t) {
        onGetStartedClick.write((Object) clicknext, "property");
        onGetStartedClick.write((Object) clicknext, "property");
        this.IconCompatParcelizer = t;
        MediaBrowserCompat$CustomActionResultReceiver(clicknext);
    }
}
