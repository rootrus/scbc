package p040o;

/* renamed from: o.Field */
public final /* synthetic */ class Field implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ CaptureGuidance MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ Field(CaptureGuidance captureGuidance) {
        this.MediaBrowserCompat$ItemReceiver = captureGuidance;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureGuidance captureGuidance = this.MediaBrowserCompat$ItemReceiver;
        nativeGetToken nativegettoken = new nativeGetToken(captureGuidance);
        if (captureGuidance.RatingCompat != null) {
            nativegettoken.IconCompatParcelizer(captureGuidance.RatingCompat);
        }
    }
}
