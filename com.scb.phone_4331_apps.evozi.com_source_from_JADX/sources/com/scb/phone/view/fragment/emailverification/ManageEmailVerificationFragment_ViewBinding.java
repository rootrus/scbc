package com.scb.phone.view.fragment.emailverification;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinTextInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ManageEmailVerificationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ManageEmailVerificationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public ManageEmailVerificationFragment_ViewBinding(ManageEmailVerificationFragment manageEmailVerificationFragment, View view) {
        super(manageEmailVerificationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = manageEmailVerificationFragment;
        manageEmailVerificationFragment.enterOtpMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.enter_otp_label, "field 'enterOtpMessage'", TextView.class);
        manageEmailVerificationFragment.refCodeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_code, "field 'refCodeTextView'", TextView.class);
        manageEmailVerificationFragment.customPinInput = (CustomPinTextInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinTextInput.class);
        manageEmailVerificationFragment.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        manageEmailVerificationFragment.didNotReceiveTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_did_not_receive_otp, "field 'didNotReceiveTextView'", TextView.class);
        manageEmailVerificationFragment.errorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_message, "field 'errorMessage'", TextView.class);
    }

    public final void read() {
        ManageEmailVerificationFragment manageEmailVerificationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageEmailVerificationFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageEmailVerificationFragment.enterOtpMessage = null;
            manageEmailVerificationFragment.refCodeTextView = null;
            manageEmailVerificationFragment.customPinInput = null;
            manageEmailVerificationFragment.customKeypad = null;
            manageEmailVerificationFragment.didNotReceiveTextView = null;
            manageEmailVerificationFragment.errorMessage = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
