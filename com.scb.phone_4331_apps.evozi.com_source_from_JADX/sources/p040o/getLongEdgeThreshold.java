package p040o;

import p040o.DocumentDetectionSettings;

/* renamed from: o.getLongEdgeThreshold */
public final /* synthetic */ class getLongEdgeThreshold implements FundFactSheetActivity {
    private final /* synthetic */ getLegacySharedPrefs IconCompatParcelizer;
    private final /* synthetic */ clearBitmapWithoutRecycle read;

    public /* synthetic */ getLongEdgeThreshold(clearBitmapWithoutRecycle clearbitmapwithoutrecycle, getLegacySharedPrefs getlegacysharedprefs) {
        this.read = clearbitmapwithoutrecycle;
        this.IconCompatParcelizer = getlegacysharedprefs;
    }

    public final Object invoke(Object obj) {
        clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.read;
        getLegacySharedPrefs getlegacysharedprefs = this.IconCompatParcelizer;
        boolean z = true;
        if (clearbitmapwithoutrecycle.RatingCompat != null) {
            clearbitmapwithoutrecycle.RatingCompat.aj_();
        }
        DocumentDetectionSettings.DocumentEdgeDetection documentEdgeDetection = new DocumentDetectionSettings.DocumentEdgeDetection(clearbitmapwithoutrecycle, getlegacysharedprefs);
        if (clearbitmapwithoutrecycle.RatingCompat == null) {
            z = false;
        }
        if (z) {
            documentEdgeDetection.IconCompatParcelizer(clearbitmapwithoutrecycle.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
