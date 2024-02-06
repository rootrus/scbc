package p040o;

/* renamed from: o.SelfieBaseCaptureExperience */
public final /* synthetic */ class SelfieBaseCaptureExperience implements FundFactSheetActivity {
    private final /* synthetic */ C10829Sizeof MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ SelfieBaseCaptureExperience(C10829Sizeof sizeof) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sizeof;
    }

    public final Object invoke(Object obj) {
        C10829Sizeof sizeof = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (sizeof.RatingCompat != null) {
            sizeof.RatingCompat.aj_();
        }
        getBlinkMessage getblinkmessage = getBlinkMessage.MediaBrowserCompat$ItemReceiver;
        if (sizeof.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getblinkmessage.IconCompatParcelizer(sizeof.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
