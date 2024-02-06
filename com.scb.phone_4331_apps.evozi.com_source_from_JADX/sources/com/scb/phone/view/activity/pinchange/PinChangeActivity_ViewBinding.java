package com.scb.phone.view.activity.pinchange;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class PinChangeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PinChangeActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public PinChangeActivity_ViewBinding(final PinChangeActivity pinChangeActivity, View view) {
        super(pinChangeActivity, view);
        this.IconCompatParcelizer = pinChangeActivity;
        pinChangeActivity.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        pinChangeActivity.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        pinChangeActivity.topTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_top, "field 'topTextView'", TextView.class);
        pinChangeActivity.bottomTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_bottom, "field 'bottomTextView'", TextView.class);
        pinChangeActivity.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextClick'");
        pinChangeActivity.buttonNext = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PinChangeActivity.this.onNextClick();
            }
        });
    }

    public final void read() {
        PinChangeActivity pinChangeActivity = this.IconCompatParcelizer;
        if (pinChangeActivity != null) {
            this.IconCompatParcelizer = null;
            pinChangeActivity.customPinInput = null;
            pinChangeActivity.customKeypad = null;
            pinChangeActivity.topTextView = null;
            pinChangeActivity.bottomTextView = null;
            pinChangeActivity.titleTextView = null;
            pinChangeActivity.buttonNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
