package p040o;

import com.scb.phone.view.activity.registration.onboarding.RegistrationOnboardingActivity;
import dagger.Lazy;
import p040o.OnDeviceExtractionServer;

/* renamed from: o.access$2500 */
public final class access$2500 implements MileageQuantitySelectionActivity<RegistrationOnboardingActivity> {
    public static void read(RegistrationOnboardingActivity registrationOnboardingActivity, OnDeviceExtractionServer.C37124 r1) {
        registrationOnboardingActivity.registrationOnboardingPresenter = r1;
    }

    public static void IconCompatParcelizer(RegistrationOnboardingActivity registrationOnboardingActivity, Lazy<RttiJsonCheck_MembersInjector> lazy) {
        registrationOnboardingActivity.biometricManagerLazy = lazy;
    }
}
