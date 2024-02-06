package p040o;

import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment;

/* renamed from: o.ActivityBuilder_ContributeBaseLivenessCheckActivity */
public final class ActivityBuilder_ContributeBaseLivenessCheckActivity implements MileageQuantitySelectionActivity<OnboardingInputAddressFragment> {
    public static void read(OnboardingInputAddressFragment onboardingInputAddressFragment, CaptureMessage captureMessage) {
        onboardingInputAddressFragment.presenter = captureMessage;
    }
}
