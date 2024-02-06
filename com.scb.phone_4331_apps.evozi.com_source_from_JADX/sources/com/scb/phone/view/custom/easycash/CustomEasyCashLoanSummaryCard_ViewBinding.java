package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import p040o.onStart;

public final class CustomEasyCashLoanSummaryCard_ViewBinding implements Unbinder {
    private CustomEasyCashLoanSummaryCard IconCompatParcelizer;

    public CustomEasyCashLoanSummaryCard_ViewBinding(CustomEasyCashLoanSummaryCard customEasyCashLoanSummaryCard, View view) {
        this.IconCompatParcelizer = customEasyCashLoanSummaryCard;
        customEasyCashLoanSummaryCard.itvLoanName = (ImageTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.itv_loan_name, "field 'itvLoanName'", ImageTextView.class);
        customEasyCashLoanSummaryCard.tvCreditAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_credit_amount, "field 'tvCreditAmount'", TextView.class);
        customEasyCashLoanSummaryCard.csvDetails = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.csv_details, "field 'csvDetails'", CustomSeparatedViews.class);
        customEasyCashLoanSummaryCard.btApplyNow = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_apply_now, "field 'btApplyNow'", Button.class);
    }

    public final void read() {
        CustomEasyCashLoanSummaryCard customEasyCashLoanSummaryCard = this.IconCompatParcelizer;
        if (customEasyCashLoanSummaryCard != null) {
            this.IconCompatParcelizer = null;
            customEasyCashLoanSummaryCard.itvLoanName = null;
            customEasyCashLoanSummaryCard.tvCreditAmount = null;
            customEasyCashLoanSummaryCard.csvDetails = null;
            customEasyCashLoanSummaryCard.btApplyNow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
