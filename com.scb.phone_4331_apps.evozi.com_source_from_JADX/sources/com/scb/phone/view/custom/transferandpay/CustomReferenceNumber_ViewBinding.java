package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomReferenceNumber_ViewBinding implements Unbinder {
    private CustomReferenceNumber IconCompatParcelizer;

    public CustomReferenceNumber_ViewBinding(CustomReferenceNumber customReferenceNumber, View view) {
        this.IconCompatParcelizer = customReferenceNumber;
        customReferenceNumber.mReferenceNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_number_text_view, "field 'mReferenceNumberTextView'", TextView.class);
    }

    public final void read() {
        CustomReferenceNumber customReferenceNumber = this.IconCompatParcelizer;
        if (customReferenceNumber != null) {
            this.IconCompatParcelizer = null;
            customReferenceNumber.mReferenceNumberTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
