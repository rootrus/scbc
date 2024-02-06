package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomSchedulePayment_ViewBinding implements Unbinder {
    private CustomSchedulePayment IconCompatParcelizer;
    private View write;

    public CustomSchedulePayment_ViewBinding(final CustomSchedulePayment customSchedulePayment, View view) {
        this.IconCompatParcelizer = customSchedulePayment;
        customSchedulePayment.container = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container, "field 'container'", ConstraintLayout.class);
        customSchedulePayment.spinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner, "field 'spinner'", Spinner.class);
        customSchedulePayment.etAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_amount, "field 'etAmount'", AmountEditText.class);
        customSchedulePayment.tvCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_currency, "field 'tvCurrency'", TextView.class);
        customSchedulePayment.tvExtraInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_extra_info, "field 'tvExtraInfo'", TextView.class);
        customSchedulePayment.tvError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error, "field 'tvError'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.ivSpinnerArrow, "field 'ivSpinnerArrow' and method 'onClickArrow'");
        customSchedulePayment.ivSpinnerArrow = (ImageView) onStart.write(IconCompatParcelizer2, R.id.ivSpinnerArrow, "field 'ivSpinnerArrow'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomSchedulePayment.this.onClickArrow();
            }
        });
        customSchedulePayment.vSeparator = onStart.IconCompatParcelizer(view, R.id.v_separator, "field 'vSeparator'");
        customSchedulePayment.clickableSpinner = onStart.IconCompatParcelizer(view, R.id.clickable_spinner, "field 'clickableSpinner'");
    }

    public final void read() {
        CustomSchedulePayment customSchedulePayment = this.IconCompatParcelizer;
        if (customSchedulePayment != null) {
            this.IconCompatParcelizer = null;
            customSchedulePayment.container = null;
            customSchedulePayment.spinner = null;
            customSchedulePayment.etAmount = null;
            customSchedulePayment.tvCurrency = null;
            customSchedulePayment.tvExtraInfo = null;
            customSchedulePayment.tvError = null;
            customSchedulePayment.ivSpinnerArrow = null;
            customSchedulePayment.vSeparator = null;
            customSchedulePayment.clickableSpinner = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
