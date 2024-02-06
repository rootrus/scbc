package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomAddressInput_ViewBinding implements Unbinder {
    private CustomAddressInput write;

    public CustomAddressInput_ViewBinding(CustomAddressInput customAddressInput, View view) {
        this.write = customAddressInput;
        customAddressInput.titleLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_label, "field 'titleLabel'", TextView.class);
        customAddressInput.mandatorySymbol = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mandatory_symbol, "field 'mandatorySymbol'", TextView.class);
        customAddressInput.inputTextField = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_text_field, "field 'inputTextField'", EditText.class);
        customAddressInput.errorInline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.address_inline_error, "field 'errorInline'", TextView.class);
    }

    public final void read() {
        CustomAddressInput customAddressInput = this.write;
        if (customAddressInput != null) {
            this.write = null;
            customAddressInput.titleLabel = null;
            customAddressInput.mandatorySymbol = null;
            customAddressInput.inputTextField = null;
            customAddressInput.errorInline = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
