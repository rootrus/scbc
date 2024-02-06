package p040o;

import p040o.MicrParser;

/* renamed from: o.PassportCaptureExperienceCriteriaHolder */
public final /* synthetic */ class PassportCaptureExperienceCriteriaHolder implements FundFactSheetActivity {
    private final /* synthetic */ C10829Sizeof read;

    public /* synthetic */ PassportCaptureExperienceCriteriaHolder(C10829Sizeof sizeof) {
        this.read = sizeof;
    }

    public final Object invoke(Object obj) {
        C10829Sizeof sizeof = this.read;
        MicrParser.C36571 r0 = MicrParser.C36571.MediaBrowserCompat$CustomActionResultReceiver;
        if (sizeof.RatingCompat != null) {
            r0.IconCompatParcelizer(sizeof.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
