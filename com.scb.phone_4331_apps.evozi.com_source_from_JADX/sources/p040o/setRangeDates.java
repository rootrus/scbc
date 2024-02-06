package p040o;

import p040o.access$2300;

/* renamed from: o.setRangeDates */
public final /* synthetic */ class setRangeDates implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C4128bz MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setRangeDates(C4128bz bzVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bzVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4128bz bzVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = (Throwable) obj;
        if (bzVar.RatingCompat != null) {
            bzVar.RatingCompat.aj_();
        }
        bzVar.MediaBrowserCompat$ItemReceiver(bzVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        bzVar.MediaBrowserCompat$ItemReceiver = Boolean.TRUE;
    }
}
