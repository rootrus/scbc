package com.scb.phone.view.fragment.registration.onboarding;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class RegistrationAccountsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RegistrationAccountsFragment IconCompatParcelizer;

    public RegistrationAccountsFragment_ViewBinding(RegistrationAccountsFragment registrationAccountsFragment, View view) {
        super(registrationAccountsFragment, view);
        this.IconCompatParcelizer = registrationAccountsFragment;
        registrationAccountsFragment.button = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button, "field 'button'", Button.class);
    }

    public final void read() {
        RegistrationAccountsFragment registrationAccountsFragment = this.IconCompatParcelizer;
        if (registrationAccountsFragment != null) {
            this.IconCompatParcelizer = null;
            registrationAccountsFragment.button = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
