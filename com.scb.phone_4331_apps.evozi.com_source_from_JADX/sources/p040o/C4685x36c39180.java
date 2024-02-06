package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getVerticalMovementGuidance$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4685x36c39180<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ getVerticalMovementGuidance MediaBrowserCompat$ItemReceiver;

    public C4685x36c39180(getVerticalMovementGuidance getverticalmovementguidance, String str) {
        this.MediaBrowserCompat$ItemReceiver = getverticalmovementguidance;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getVerticalMovementGuidance.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        getVerticalMovementGuidance getverticalmovementguidance = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<C6913xcf1d2597>(this) {
            private /* synthetic */ C4685x36c39180 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((C6913xcf1d2597) obj).read(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            }
        };
        if (getverticalmovementguidance.RatingCompat != null) {
            r0.IconCompatParcelizer(getverticalmovementguidance.RatingCompat);
        }
    }
}
