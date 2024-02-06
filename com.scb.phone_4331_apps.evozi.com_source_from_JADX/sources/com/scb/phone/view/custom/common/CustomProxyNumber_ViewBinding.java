package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomProxyNumber_ViewBinding implements Unbinder {
    private CustomProxyNumber MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public CustomProxyNumber_ViewBinding(final CustomProxyNumber customProxyNumber, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customProxyNumber;
        customProxyNumber.proxyLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label, "field 'proxyLabel'", TextView.class);
        customProxyNumber.proxyNumberField = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_input_field, "field 'proxyNumberField'", ScbEditText.class);
        customProxyNumber.mErrorValidation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_label, "field 'mErrorValidation'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_contacts, "field 'buttonContacts' and method 'onContactsButtonClick'");
        customProxyNumber.buttonContacts = (ImageButton) onStart.write(IconCompatParcelizer, R.id.button_contacts, "field 'buttonContacts'", ImageButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomProxyNumber.this.onContactsButtonClick();
            }
        });
    }

    public final void read() {
        CustomProxyNumber customProxyNumber = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customProxyNumber != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customProxyNumber.proxyLabel = null;
            customProxyNumber.proxyNumberField = null;
            customProxyNumber.mErrorValidation = null;
            customProxyNumber.buttonContacts = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
