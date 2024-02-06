package p040o;

import com.scb.phone.view.fragment.registration.onboarding.RegistrationFingerprintFragment;
import dagger.Lazy;
import p040o.OnDeviceExtractionServer;

/* renamed from: o.ActivityBuilder_ContributeNtbHmlLandingActivity */
public final class ActivityBuilder_ContributeNtbHmlLandingActivity implements MileageQuantitySelectionActivity<RegistrationFingerprintFragment> {
    public static void write(RegistrationFingerprintFragment registrationFingerprintFragment, OnDeviceExtractionServer.C37082 r1) {
        registrationFingerprintFragment.presenter = r1;
    }

    public static void MediaBrowserCompat$ItemReceiver(RegistrationFingerprintFragment registrationFingerprintFragment, Lazy<RttiJsonCheck_MembersInjector> lazy) {
        registrationFingerprintFragment.biometricManagerLazy = lazy;
    }
}
