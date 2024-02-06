package com.scb.phone.view.custom.hml;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.onStart;

public final class CustomDecimalAmountVerification_ViewBinding implements Unbinder {
    private CustomDecimalAmountVerification MediaBrowserCompat$CustomActionResultReceiver;

    public CustomDecimalAmountVerification_ViewBinding(CustomDecimalAmountVerification customDecimalAmountVerification, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDecimalAmountVerification;
        customDecimalAmountVerification.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_container, "field 'container'", LinearLayout.class);
        customDecimalAmountVerification.editText = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_decimal_amount_code, "field 'editText'", CustomEditText.class);
    }

    public final void read() {
        CustomDecimalAmountVerification customDecimalAmountVerification = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customDecimalAmountVerification != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customDecimalAmountVerification.container = null;
            customDecimalAmountVerification.editText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
