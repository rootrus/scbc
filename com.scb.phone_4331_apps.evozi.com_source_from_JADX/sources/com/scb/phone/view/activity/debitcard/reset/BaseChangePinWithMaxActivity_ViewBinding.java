package com.scb.phone.view.activity.debitcard.reset;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput;
import com.scb.phone.view.custom.login.CustomKeypad;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseChangePinWithMaxActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private BaseChangePinWithMaxActivity MediaBrowserCompat$ItemReceiver;

    public BaseChangePinWithMaxActivity_ViewBinding(final BaseChangePinWithMaxActivity baseChangePinWithMaxActivity, View view) {
        super(baseChangePinWithMaxActivity, view);
        this.MediaBrowserCompat$ItemReceiver = baseChangePinWithMaxActivity;
        baseChangePinWithMaxActivity.customPinInput = (CustomPinWithMaxInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinWithMaxInput.class);
        baseChangePinWithMaxActivity.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        baseChangePinWithMaxActivity.topTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_top, "field 'topTextView'", TextView.class);
        baseChangePinWithMaxActivity.bottomTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label_bottom, "field 'bottomTextView'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextClick'");
        baseChangePinWithMaxActivity.buttonNext = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseChangePinWithMaxActivity.this.onNextClick();
            }
        });
    }

    public final void read() {
        BaseChangePinWithMaxActivity baseChangePinWithMaxActivity = this.MediaBrowserCompat$ItemReceiver;
        if (baseChangePinWithMaxActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseChangePinWithMaxActivity.customPinInput = null;
            baseChangePinWithMaxActivity.customKeypad = null;
            baseChangePinWithMaxActivity.topTextView = null;
            baseChangePinWithMaxActivity.bottomTextView = null;
            baseChangePinWithMaxActivity.buttonNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
