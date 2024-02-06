package p040o;

import java.util.List;

/* renamed from: o.setBlinkMessage */
public final /* synthetic */ class setBlinkMessage implements FundFactSheetActivity {
    private final /* synthetic */ C10829Sizeof IconCompatParcelizer;

    public /* synthetic */ setBlinkMessage(C10829Sizeof sizeof) {
        this.IconCompatParcelizer = sizeof;
    }

    public final Object invoke(Object obj) {
        C10829Sizeof sizeof = this.IconCompatParcelizer;
        List list = (List) obj;
        boolean z = true;
        if (sizeof.RatingCompat != null) {
            sizeof.RatingCompat.aj_();
        }
        getPassportDetectionSettings getpassportdetectionsettings = getPassportDetectionSettings.IconCompatParcelizer;
        if (sizeof.RatingCompat != null) {
            getpassportdetectionsettings.IconCompatParcelizer(sizeof.RatingCompat);
        }
        PassportCaptureExperience_MembersInjector passportCaptureExperience_MembersInjector = new PassportCaptureExperience_MembersInjector(list);
        if (sizeof.RatingCompat == null) {
            z = false;
        }
        if (z) {
            passportCaptureExperience_MembersInjector.IconCompatParcelizer(sizeof.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
