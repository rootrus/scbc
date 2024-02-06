package p040o;

import com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment;

/* renamed from: o.ActivityBuilder_BindTempLimitHomeActivity */
public final /* synthetic */ class ActivityBuilder_BindTempLimitHomeActivity implements OnboardingAddressInformationItemCustomView.write {
    private final /* synthetic */ OnboardingInputAddressFragment write;

    public /* synthetic */ ActivityBuilder_BindTempLimitHomeActivity(OnboardingInputAddressFragment onboardingInputAddressFragment) {
        this.write = onboardingInputAddressFragment;
    }

    public final void IconCompatParcelizer() {
        CaptureMessage captureMessage = this.write.presenter;
        CaptureAnimationsModule captureAnimationsModule = new CaptureAnimationsModule(captureMessage);
        if (captureMessage.RatingCompat != null) {
            captureAnimationsModule.IconCompatParcelizer(captureMessage.RatingCompat);
        }
    }
}
