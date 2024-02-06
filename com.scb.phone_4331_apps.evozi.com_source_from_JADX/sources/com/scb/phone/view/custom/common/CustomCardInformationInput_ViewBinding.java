package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomCardInformationInput_ViewBinding implements Unbinder {
    private CustomCardInformationInput MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public CustomCardInformationInput_ViewBinding(final CustomCardInformationInput customCardInformationInput, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customCardInformationInput;
        customCardInformationInput.headerLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label, "field 'headerLabel'", TextView.class);
        customCardInformationInput.cardNoInputField = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_input_field, "field 'cardNoInputField'", ScbEditText.class);
        customCardInformationInput.mErrorValidation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_label, "field 'mErrorValidation'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.clear_button, "field 'clearButton' and method 'onClearButtonClick'");
        customCardInformationInput.clearButton = (ImageButton) onStart.write(IconCompatParcelizer, R.id.clear_button, "field 'clearButton'", ImageButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomCardInformationInput.this.onClearButtonClick();
            }
        });
    }

    public final void read() {
        CustomCardInformationInput customCardInformationInput = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customCardInformationInput != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customCardInformationInput.headerLabel = null;
            customCardInformationInput.cardNoInputField = null;
            customCardInformationInput.mErrorValidation = null;
            customCardInformationInput.clearButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
