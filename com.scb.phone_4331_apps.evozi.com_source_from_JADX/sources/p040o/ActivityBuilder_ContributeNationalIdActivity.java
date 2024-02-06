package p040o;

import android.app.Dialog;
import com.scb.phone.view.fragment.registration.onboarding.RegistrationFingerprintFragment;

/* renamed from: o.ActivityBuilder_ContributeNationalIdActivity */
public final /* synthetic */ class ActivityBuilder_ContributeNationalIdActivity implements Runnable {
    private final /* synthetic */ RegistrationFingerprintFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeNationalIdActivity(RegistrationFingerprintFragment registrationFingerprintFragment) {
        this.MediaBrowserCompat$ItemReceiver = registrationFingerprintFragment;
    }

    public final void run() {
        RegistrationFingerprintFragment registrationFingerprintFragment = this.MediaBrowserCompat$ItemReceiver;
        Dialog dialog = registrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (dialog != null) {
            dialog.dismiss();
            registrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }
}
