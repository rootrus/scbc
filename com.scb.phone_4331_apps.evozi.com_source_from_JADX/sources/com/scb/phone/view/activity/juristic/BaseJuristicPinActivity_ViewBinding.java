package com.scb.phone.view.activity.juristic;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.onStart;

public class BaseJuristicPinActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseJuristicPinActivity write;

    public BaseJuristicPinActivity_ViewBinding(BaseJuristicPinActivity baseJuristicPinActivity, View view) {
        super(baseJuristicPinActivity, view);
        this.write = baseJuristicPinActivity;
        baseJuristicPinActivity.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        baseJuristicPinActivity.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        baseJuristicPinActivity.textLabelTop = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_top, "field 'textLabelTop'", TextView.class);
    }

    public final void read() {
        BaseJuristicPinActivity baseJuristicPinActivity = this.write;
        if (baseJuristicPinActivity != null) {
            this.write = null;
            baseJuristicPinActivity.customPinInput = null;
            baseJuristicPinActivity.customKeypad = null;
            baseJuristicPinActivity.textLabelTop = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
