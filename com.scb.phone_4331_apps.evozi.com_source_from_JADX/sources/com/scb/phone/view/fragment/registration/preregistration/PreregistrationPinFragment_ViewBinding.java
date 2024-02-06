package com.scb.phone.view.fragment.registration.preregistration;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class PreregistrationPinFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PreregistrationPinFragment write;

    public PreregistrationPinFragment_ViewBinding(PreregistrationPinFragment preregistrationPinFragment, View view) {
        super(preregistrationPinFragment, view);
        this.write = preregistrationPinFragment;
        preregistrationPinFragment.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        preregistrationPinFragment.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        preregistrationPinFragment.buttonClose = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_close, "field 'buttonClose'", ImageView.class);
        preregistrationPinFragment.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'titleTextView'", TextView.class);
        preregistrationPinFragment.subtitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text, "field 'subtitleTextView'", TextView.class);
    }

    public final void read() {
        PreregistrationPinFragment preregistrationPinFragment = this.write;
        if (preregistrationPinFragment != null) {
            this.write = null;
            preregistrationPinFragment.customPinInput = null;
            preregistrationPinFragment.customKeypad = null;
            preregistrationPinFragment.buttonClose = null;
            preregistrationPinFragment.titleTextView = null;
            preregistrationPinFragment.subtitleTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
