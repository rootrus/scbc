package p040o;

import java.util.List;

/* renamed from: o.kW$MediaBrowserCompat$CustomActionResultReceiver */
public final class kW$MediaBrowserCompat$CustomActionResultReceiver extends FundRedeemReviewActivity<List<? extends T>> {
    private /* synthetic */ C7198kW MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kW$MediaBrowserCompat$CustomActionResultReceiver(Object obj, C7198kW kWVar) {
        super(obj);
        this.MediaBrowserCompat$ItemReceiver = kWVar;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(clickNext<?> clicknext) {
        onGetStartedClick.write((Object) clicknext, "property");
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.write();
    }
}
