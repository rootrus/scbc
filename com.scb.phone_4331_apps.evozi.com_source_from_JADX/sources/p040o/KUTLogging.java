package p040o;

import java.util.List;
import p040o.C10829Sizeof;
import p040o.Licensing;

/* renamed from: o.KUTLogging */
public final /* synthetic */ class KUTLogging implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C10829Sizeof.C37931 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ KUTLogging(C10829Sizeof.C37931 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof.C37931 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        Licensing.VolumeLicenseResultData volumeLicenseResultData = new Licensing.VolumeLicenseResultData(r0, (List) obj);
        if (r0.RatingCompat != null) {
            volumeLicenseResultData.IconCompatParcelizer(r0.RatingCompat);
        }
    }
}
