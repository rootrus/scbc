package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomATMInput_ViewBinding implements Unbinder {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CustomATMInput write;

    public CustomATMInput_ViewBinding(final CustomATMInput customATMInput, View view) {
        this.write = customATMInput;
        customATMInput.atmPin = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_input_field, "field 'atmPin'", ScbEditText.class);
        customATMInput.mErrorValidation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_label, "field 'mErrorValidation'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.clear_button, "field 'clearButton' and method 'onClearButtonClick'");
        customATMInput.clearButton = (ImageButton) onStart.write(IconCompatParcelizer, R.id.clear_button, "field 'clearButton'", ImageButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomATMInput.this.onClearButtonClick();
            }
        });
    }

    public final void read() {
        CustomATMInput customATMInput = this.write;
        if (customATMInput != null) {
            this.write = null;
            customATMInput.atmPin = null;
            customATMInput.mErrorValidation = null;
            customATMInput.clearButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
