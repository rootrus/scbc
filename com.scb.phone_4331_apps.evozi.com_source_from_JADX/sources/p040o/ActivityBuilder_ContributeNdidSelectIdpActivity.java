package p040o;

import android.view.View;
import com.scb.phone.view.fragment.registration.onboarding.RegistrationFingerprintFragment;
import p040o.OnDeviceExtractionServer;

/* renamed from: o.ActivityBuilder_ContributeNdidSelectIdpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeNdidSelectIdpActivity implements View.OnClickListener {
    private final /* synthetic */ RegistrationFingerprintFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeNdidSelectIdpActivity(RegistrationFingerprintFragment registrationFingerprintFragment) {
        this.IconCompatParcelizer = registrationFingerprintFragment;
    }

    public final void onClick(View view) {
        OnDeviceExtractionServer.C37082 r3 = this.IconCompatParcelizer.presenter;
        exceptionType exceptiontype = exceptionType.IconCompatParcelizer;
        if (r3.RatingCompat != null) {
            exceptiontype.IconCompatParcelizer(r3.RatingCompat);
        }
    }
}
