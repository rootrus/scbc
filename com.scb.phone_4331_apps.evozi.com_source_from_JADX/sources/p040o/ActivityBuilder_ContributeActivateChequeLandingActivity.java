package p040o;

import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.ActivityBuilder_ContributeActivateChequeLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeActivateChequeLandingActivity implements OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ CaptureMessage write;

    public /* synthetic */ ActivityBuilder_ContributeActivateChequeLandingActivity(CaptureMessage captureMessage) {
        this.write = captureMessage;
    }

    public final void IconCompatParcelizer(String str) {
        CaptureMessage captureMessage = this.write;
        ResponseParser responseParser = captureMessage.ParcelableVolumeInfo;
        onGetStartedClick.write((Object) str, "<set-?>");
        responseParser.MediaSessionCompat$QueueItem = str;
        CaptureAnimationsModule captureAnimationsModule = new CaptureAnimationsModule(captureMessage);
        if (captureMessage.RatingCompat != null) {
            captureAnimationsModule.IconCompatParcelizer(captureMessage.RatingCompat);
        }
    }
}
