package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomBillsToPay_ViewBinding implements Unbinder {
    private CustomBillsToPay write;

    public CustomBillsToPay_ViewBinding(CustomBillsToPay customBillsToPay, View view) {
        this.write = customBillsToPay;
        customBillsToPay.mIconDrawableImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bills_to_pay_image_view, "field 'mIconDrawableImageView'", ImageView.class);
        customBillsToPay.mAmountTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bills_to_pay_amount_title_text_view, "field 'mAmountTitleTextView'", TextView.class);
        customBillsToPay.mAmountValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bills_to_pay_amount_due_text_view, "field 'mAmountValueTextView'", TextView.class);
        customBillsToPay.mDueDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bills_to_pay_due_date_text_view, "field 'mDueDateTextView'", TextView.class);
        customBillsToPay.mDefaultButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bills_to_pay_default_button, "field 'mDefaultButton'", DefaultButton.class);
        customBillsToPay.mCompletedText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bills_to_pay_completed, "field 'mCompletedText'", TextView.class);
    }

    public final void read() {
        CustomBillsToPay customBillsToPay = this.write;
        if (customBillsToPay != null) {
            this.write = null;
            customBillsToPay.mIconDrawableImageView = null;
            customBillsToPay.mAmountTitleTextView = null;
            customBillsToPay.mAmountValueTextView = null;
            customBillsToPay.mDueDateTextView = null;
            customBillsToPay.mDefaultButton = null;
            customBillsToPay.mCompletedText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
