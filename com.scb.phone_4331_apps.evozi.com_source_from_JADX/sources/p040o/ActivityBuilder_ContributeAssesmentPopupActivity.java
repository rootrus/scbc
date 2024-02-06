package p040o;

import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.ActivityBuilder_ContributeAssesmentPopupActivity */
public final /* synthetic */ class ActivityBuilder_ContributeAssesmentPopupActivity implements OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ CaptureMessage read;

    public /* synthetic */ ActivityBuilder_ContributeAssesmentPopupActivity(CaptureMessage captureMessage) {
        this.read = captureMessage;
    }

    public final void IconCompatParcelizer(String str) {
        CaptureMessage captureMessage = this.read;
        ResponseParser responseParser = captureMessage.ParcelableVolumeInfo;
        onGetStartedClick.write((Object) str, "<set-?>");
        responseParser.f2778x50fd9e4a = str;
        CaptureAnimationsModule captureAnimationsModule = new CaptureAnimationsModule(captureMessage);
        if (captureMessage.RatingCompat != null) {
            captureAnimationsModule.IconCompatParcelizer(captureMessage.RatingCompat);
        }
    }
}
