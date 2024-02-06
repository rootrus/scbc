package p040o;

import java.util.List;

/* renamed from: o.KtaJsonBill$MediaBrowserCompat$CustomActionResultReceiver */
public class KtaJsonBill$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>> {
    private /* synthetic */ KtaJsonBill MediaBrowserCompat$ItemReceiver;

    private KtaJsonBill$MediaBrowserCompat$CustomActionResultReceiver(KtaJsonBill ktaJsonBill) {
        this.MediaBrowserCompat$ItemReceiver = ktaJsonBill;
    }

    public /* synthetic */ KtaJsonBill$MediaBrowserCompat$CustomActionResultReceiver(KtaJsonBill ktaJsonBill, byte b) {
        this(ktaJsonBill);
    }

    public final void onError(Throwable th) {
        KtaJsonBill ktaJsonBill = this.MediaBrowserCompat$ItemReceiver;
        getCity getcity = getCity.MediaBrowserCompat$CustomActionResultReceiver;
        if (ktaJsonBill.RatingCompat != null) {
            getcity.IconCompatParcelizer(ktaJsonBill.RatingCompat);
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        KtaJsonBill ktaJsonBill = this.MediaBrowserCompat$ItemReceiver;
        getCity getcity = getCity.MediaBrowserCompat$CustomActionResultReceiver;
        if (ktaJsonBill.RatingCompat != null) {
            getcity.IconCompatParcelizer(ktaJsonBill.RatingCompat);
        }
    }
}
