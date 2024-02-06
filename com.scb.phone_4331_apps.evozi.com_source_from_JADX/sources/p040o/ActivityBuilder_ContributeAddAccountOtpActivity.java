package p040o;

import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.ActivityBuilder_ContributeAddAccountOtpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeAddAccountOtpActivity implements OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ CaptureMessage read;

    public /* synthetic */ ActivityBuilder_ContributeAddAccountOtpActivity(CaptureMessage captureMessage) {
        this.read = captureMessage;
    }

    public final void IconCompatParcelizer(String str) {
        CaptureMessage captureMessage = this.read;
        ResponseParser responseParser = captureMessage.ParcelableVolumeInfo;
        onGetStartedClick.write((Object) str, "<set-?>");
        responseParser.write = str;
        CaptureAnimationsModule captureAnimationsModule = new CaptureAnimationsModule(captureMessage);
        if (captureMessage.RatingCompat != null) {
            captureAnimationsModule.IconCompatParcelizer(captureMessage.RatingCompat);
        }
    }
}
