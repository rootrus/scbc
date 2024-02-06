package p040o;

import java.util.List;

/* renamed from: o.CameraPreview */
public final /* synthetic */ class CameraPreview implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getStringValues MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ CameraPreview(getStringValues getstringvalues) {
        this.MediaBrowserCompat$ItemReceiver = getstringvalues;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValues getstringvalues = this.MediaBrowserCompat$ItemReceiver;
        List list = (List) obj;
        nativeDispose nativedispose = nativeDispose.write;
        boolean z = true;
        if (getstringvalues.RatingCompat != null) {
            nativedispose.IconCompatParcelizer(getstringvalues.RatingCompat);
        }
        for (nonNull next : getstringvalues.read.MediaBrowserCompat$ItemReceiver(list)) {
            if (next.read.equalsIgnoreCase(getstringvalues.write.MediaBrowserCompat$MediaItem)) {
                List<String> list2 = next.MediaBrowserCompat$ItemReceiver;
                if (list2 != null && (list2.contains("CARD_LIMIT_WITHDRAWAL") || list2.contains("CARD_LIMIT_PURCHASE"))) {
                    FormatException formatException = new FormatException(next);
                    if (getstringvalues.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        formatException.IconCompatParcelizer(getstringvalues.RatingCompat);
                        return;
                    }
                    return;
                }
                BarcodeView barcodeView = new BarcodeView(getstringvalues, next);
                if (getstringvalues.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    barcodeView.IconCompatParcelizer(getstringvalues.RatingCompat);
                    return;
                }
                return;
            }
        }
    }
}
