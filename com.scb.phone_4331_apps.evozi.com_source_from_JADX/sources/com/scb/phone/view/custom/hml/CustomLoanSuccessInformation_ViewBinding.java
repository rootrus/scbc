package com.scb.phone.view.custom.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.tierpricing.TierPricingSimplePromotionView;
import p040o.onStart;

public final class CustomLoanSuccessInformation_ViewBinding implements Unbinder {
    private CustomLoanSuccessInformation IconCompatParcelizer;

    public CustomLoanSuccessInformation_ViewBinding(CustomLoanSuccessInformation customLoanSuccessInformation, View view) {
        this.IconCompatParcelizer = customLoanSuccessInformation;
        customLoanSuccessInformation.counterIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_counter_icon, "field 'counterIcon'", ImageView.class);
        customLoanSuccessInformation.amountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loaninfo_amount_title, "field 'amountTitle'", TextView.class);
        customLoanSuccessInformation.loanAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loan_amount, "field 'loanAmount'", TextView.class);
        customLoanSuccessInformation.installmentTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loaninfo_repayment_title, "field 'installmentTitle'", TextView.class);
        customLoanSuccessInformation.loanRepayment = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loan_repayment, "field 'loanRepayment'", TextView.class);
        customLoanSuccessInformation.promotion = (TierPricingSimplePromotionView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tpspv_loaninfo_promo, "field 'promotion'", TierPricingSimplePromotionView.class);
    }

    public final void read() {
        CustomLoanSuccessInformation customLoanSuccessInformation = this.IconCompatParcelizer;
        if (customLoanSuccessInformation != null) {
            this.IconCompatParcelizer = null;
            customLoanSuccessInformation.counterIcon = null;
            customLoanSuccessInformation.amountTitle = null;
            customLoanSuccessInformation.loanAmount = null;
            customLoanSuccessInformation.installmentTitle = null;
            customLoanSuccessInformation.loanRepayment = null;
            customLoanSuccessInformation.promotion = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
