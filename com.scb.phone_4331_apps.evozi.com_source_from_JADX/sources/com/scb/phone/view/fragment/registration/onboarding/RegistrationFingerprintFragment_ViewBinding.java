package com.scb.phone.view.fragment.registration.onboarding;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class RegistrationFingerprintFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RegistrationFingerprintFragment MediaBrowserCompat$ItemReceiver;

    public RegistrationFingerprintFragment_ViewBinding(RegistrationFingerprintFragment registrationFingerprintFragment, View view) {
        super(registrationFingerprintFragment, view);
        this.MediaBrowserCompat$ItemReceiver = registrationFingerprintFragment;
        registrationFingerprintFragment.leftButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.left_button, "field 'leftButton'", Button.class);
        registrationFingerprintFragment.rightButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.right_button, "field 'rightButton'", Button.class);
    }

    public final void read() {
        RegistrationFingerprintFragment registrationFingerprintFragment = this.MediaBrowserCompat$ItemReceiver;
        if (registrationFingerprintFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            registrationFingerprintFragment.leftButton = null;
            registrationFingerprintFragment.rightButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
