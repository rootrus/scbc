package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomDeltaInput_ViewBinding implements Unbinder {
    private CustomDeltaInput IconCompatParcelizer;

    public CustomDeltaInput_ViewBinding(CustomDeltaInput customDeltaInput, View view) {
        this.IconCompatParcelizer = customDeltaInput;
        customDeltaInput.inputValue = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_value, "field 'inputValue'", AmountEditText.class);
        customDeltaInput.increaseButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_increase, "field 'increaseButton'", ImageButton.class);
        customDeltaInput.decreaseButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_decrease, "field 'decreaseButton'", ImageButton.class);
        customDeltaInput.errorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_error_message, "field 'errorMessage'", TextView.class);
        customDeltaInput.limitMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_limit_message, "field 'limitMessage'", TextView.class);
        customDeltaInput.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container, "field 'container'", RelativeLayout.class);
    }

    public final void read() {
        CustomDeltaInput customDeltaInput = this.IconCompatParcelizer;
        if (customDeltaInput != null) {
            this.IconCompatParcelizer = null;
            customDeltaInput.inputValue = null;
            customDeltaInput.increaseButton = null;
            customDeltaInput.decreaseButton = null;
            customDeltaInput.errorMessage = null;
            customDeltaInput.limitMessage = null;
            customDeltaInput.container = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
