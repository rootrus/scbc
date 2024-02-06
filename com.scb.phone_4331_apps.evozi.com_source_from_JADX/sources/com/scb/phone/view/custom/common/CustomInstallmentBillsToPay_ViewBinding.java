package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomInstallmentBillsToPay_ViewBinding implements Unbinder {
    private CustomInstallmentBillsToPay write;

    public CustomInstallmentBillsToPay_ViewBinding(CustomInstallmentBillsToPay customInstallmentBillsToPay, View view) {
        this.write = customInstallmentBillsToPay;
        customInstallmentBillsToPay.mIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivIcon, "field 'mIconImageView'", ImageView.class);
        customInstallmentBillsToPay.mAmountTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvAmountTitle, "field 'mAmountTitleTextView'", TextView.class);
        customInstallmentBillsToPay.mAmountValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvAmountValue, "field 'mAmountValueTextView'", TextView.class);
        customInstallmentBillsToPay.mMinimumPaymentValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvMinimumPaymentValue, "field 'mMinimumPaymentValueTextView'", TextView.class);
        customInstallmentBillsToPay.mStatementDateValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvStatementDateValue, "field 'mStatementDateValueTextView'", TextView.class);
        customInstallmentBillsToPay.mDueDateValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvDueDateValue, "field 'mDueDateValueTextView'", TextView.class);
        customInstallmentBillsToPay.mPayButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.buttonPay, "field 'mPayButton'", Button.class);
        customInstallmentBillsToPay.mInstallmentButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.buttonInstallment, "field 'mInstallmentButton'", Button.class);
    }

    public final void read() {
        CustomInstallmentBillsToPay customInstallmentBillsToPay = this.write;
        if (customInstallmentBillsToPay != null) {
            this.write = null;
            customInstallmentBillsToPay.mIconImageView = null;
            customInstallmentBillsToPay.mAmountTitleTextView = null;
            customInstallmentBillsToPay.mAmountValueTextView = null;
            customInstallmentBillsToPay.mMinimumPaymentValueTextView = null;
            customInstallmentBillsToPay.mStatementDateValueTextView = null;
            customInstallmentBillsToPay.mDueDateValueTextView = null;
            customInstallmentBillsToPay.mPayButton = null;
            customInstallmentBillsToPay.mInstallmentButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
