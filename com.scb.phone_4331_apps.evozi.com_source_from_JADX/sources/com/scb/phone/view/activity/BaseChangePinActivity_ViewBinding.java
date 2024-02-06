package com.scb.phone.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseChangePinActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private BaseChangePinActivity MediaBrowserCompat$ItemReceiver;

    public BaseChangePinActivity_ViewBinding(final BaseChangePinActivity baseChangePinActivity, View view) {
        super(baseChangePinActivity, view);
        this.MediaBrowserCompat$ItemReceiver = baseChangePinActivity;
        baseChangePinActivity.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        baseChangePinActivity.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        baseChangePinActivity.topTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_top, "field 'topTextView'", TextView.class);
        baseChangePinActivity.bottomTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_bottom, "field 'bottomTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextClick'");
        baseChangePinActivity.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseChangePinActivity.this.onNextClick();
            }
        });
    }

    public final void read() {
        BaseChangePinActivity baseChangePinActivity = this.MediaBrowserCompat$ItemReceiver;
        if (baseChangePinActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseChangePinActivity.customPinInput = null;
            baseChangePinActivity.customKeypad = null;
            baseChangePinActivity.topTextView = null;
            baseChangePinActivity.bottomTextView = null;
            baseChangePinActivity.buttonNext = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
