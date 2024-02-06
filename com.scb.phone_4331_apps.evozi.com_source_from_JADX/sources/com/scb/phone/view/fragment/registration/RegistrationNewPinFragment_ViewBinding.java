package com.scb.phone.view.fragment.registration;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class RegistrationNewPinFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RegistrationNewPinFragment write;

    public RegistrationNewPinFragment_ViewBinding(RegistrationNewPinFragment registrationNewPinFragment, View view) {
        super(registrationNewPinFragment, view);
        this.write = registrationNewPinFragment;
        registrationNewPinFragment.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        registrationNewPinFragment.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        registrationNewPinFragment.topTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_top, "field 'topTextView'", TextView.class);
        registrationNewPinFragment.bottomTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_bottom, "field 'bottomTextView'", TextView.class);
        registrationNewPinFragment.buttonNext = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_next, "field 'buttonNext'", DefaultButton.class);
    }

    public final void read() {
        RegistrationNewPinFragment registrationNewPinFragment = this.write;
        if (registrationNewPinFragment != null) {
            this.write = null;
            registrationNewPinFragment.customPinInput = null;
            registrationNewPinFragment.customKeypad = null;
            registrationNewPinFragment.topTextView = null;
            registrationNewPinFragment.bottomTextView = null;
            registrationNewPinFragment.buttonNext = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
