package com.scb.phone.view.fragment.otppin;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinTextInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OtpPinFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private OtpPinFragment write;

    public OtpPinFragment_ViewBinding(final OtpPinFragment otpPinFragment, View view) {
        super(otpPinFragment, view);
        this.write = otpPinFragment;
        otpPinFragment.enterOtpMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.enter_otp_label, "field 'enterOtpMessage'", TextView.class);
        otpPinFragment.refCodeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_code, "field 'refCodeTextView'", TextView.class);
        otpPinFragment.customPinInput = (CustomPinTextInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinTextInput.class);
        otpPinFragment.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        otpPinFragment.errorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_message, "field 'errorMessage'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.tv_resend, "method 'onResendSmsClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OtpPinFragment.this.onResendSmsClick();
            }
        });
    }

    public final void read() {
        OtpPinFragment otpPinFragment = this.write;
        if (otpPinFragment != null) {
            this.write = null;
            otpPinFragment.enterOtpMessage = null;
            otpPinFragment.refCodeTextView = null;
            otpPinFragment.customPinInput = null;
            otpPinFragment.customKeypad = null;
            otpPinFragment.errorMessage = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
