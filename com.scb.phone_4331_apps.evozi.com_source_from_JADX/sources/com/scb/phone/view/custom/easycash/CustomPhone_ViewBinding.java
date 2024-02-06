package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScbEditText;
import p040o.onStart;

public class CustomPhone_ViewBinding implements Unbinder {
    private CustomPhone MediaBrowserCompat$ItemReceiver;

    public CustomPhone_ViewBinding(CustomPhone customPhone, View view) {
        this.MediaBrowserCompat$ItemReceiver = customPhone;
        customPhone.proxyLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label, "field 'proxyLabel'", TextView.class);
        customPhone.proxyNumberField = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_input_field, "field 'proxyNumberField'", ScbEditText.class);
        customPhone.errorValidation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_label, "field 'errorValidation'", TextView.class);
    }

    public final void read() {
        CustomPhone customPhone = this.MediaBrowserCompat$ItemReceiver;
        if (customPhone != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customPhone.proxyLabel = null;
            customPhone.proxyNumberField = null;
            customPhone.errorValidation = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
