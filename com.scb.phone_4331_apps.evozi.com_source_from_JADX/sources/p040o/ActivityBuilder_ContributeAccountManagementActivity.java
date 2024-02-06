package p040o;

import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.ActivityBuilder_ContributeAccountManagementActivity */
public final /* synthetic */ class ActivityBuilder_ContributeAccountManagementActivity implements OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ CaptureMessage MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeAccountManagementActivity(CaptureMessage captureMessage) {
        this.MediaBrowserCompat$CustomActionResultReceiver = captureMessage;
    }

    public final void IconCompatParcelizer(String str) {
        CaptureMessage captureMessage = this.MediaBrowserCompat$CustomActionResultReceiver;
        ResponseParser responseParser = captureMessage.ParcelableVolumeInfo;
        onGetStartedClick.write((Object) str, "<set-?>");
        responseParser.MediaBrowserCompat$MediaItem = str;
        CaptureAnimationsModule captureAnimationsModule = new CaptureAnimationsModule(captureMessage);
        if (captureMessage.RatingCompat != null) {
            captureAnimationsModule.IconCompatParcelizer(captureMessage.RatingCompat);
        }
    }
}
