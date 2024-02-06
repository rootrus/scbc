package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.onStart;

public final class EasycashCommercialLoanAccountFragment_ViewBinding extends BaseCommonAccountFragment_ViewBinding {
    private EasycashCommercialLoanAccountFragment write;

    public EasycashCommercialLoanAccountFragment_ViewBinding(EasycashCommercialLoanAccountFragment easycashCommercialLoanAccountFragment, View view) {
        super(easycashCommercialLoanAccountFragment, view);
        this.write = easycashCommercialLoanAccountFragment;
        easycashCommercialLoanAccountFragment.tvDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textview_disclaimer, "field 'tvDisclaimer'", TextView.class);
        easycashCommercialLoanAccountFragment.repayAccountLabel = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.repay_account_label, "field 'repayAccountLabel'", CustomEasyCashSectionLabel.class);
        easycashCommercialLoanAccountFragment.receivingAccountLabel = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.receiving_account_label, "field 'receivingAccountLabel'", CustomEasyCashSectionLabel.class);
    }

    public final void read() {
        EasycashCommercialLoanAccountFragment easycashCommercialLoanAccountFragment = this.write;
        if (easycashCommercialLoanAccountFragment != null) {
            this.write = null;
            easycashCommercialLoanAccountFragment.tvDisclaimer = null;
            easycashCommercialLoanAccountFragment.repayAccountLabel = null;
            easycashCommercialLoanAccountFragment.receivingAccountLabel = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
