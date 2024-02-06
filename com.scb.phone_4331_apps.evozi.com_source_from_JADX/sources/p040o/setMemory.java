package p040o;

import p040o.access$2300;

/* renamed from: o.setMemory */
public final /* synthetic */ class setMemory implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getTaskError MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setMemory(getTaskError gettaskerror) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gettaskerror;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTaskError gettaskerror = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = (Throwable) obj;
        AppStatsDsOpType appStatsDsOpType = AppStatsDsOpType.read;
        boolean z = true;
        if (gettaskerror.RatingCompat != null) {
            appStatsDsOpType.IconCompatParcelizer(gettaskerror.RatingCompat);
        }
        AppStatsEventIDType appStatsEventIDType = AppStatsEventIDType.MediaBrowserCompat$ItemReceiver;
        if (gettaskerror.RatingCompat == null) {
            z = false;
        }
        if (z) {
            appStatsEventIDType.IconCompatParcelizer(gettaskerror.RatingCompat);
        }
        gettaskerror.MediaBrowserCompat$ItemReceiver(gettaskerror.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
