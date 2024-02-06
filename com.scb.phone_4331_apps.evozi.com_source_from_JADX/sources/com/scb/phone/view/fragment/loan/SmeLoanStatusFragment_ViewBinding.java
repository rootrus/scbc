package com.scb.phone.view.fragment.loan;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SmeLoanStatusFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SmeLoanStatusFragment IconCompatParcelizer;

    public SmeLoanStatusFragment_ViewBinding(SmeLoanStatusFragment smeLoanStatusFragment, View view) {
        super(smeLoanStatusFragment, view);
        this.IconCompatParcelizer = smeLoanStatusFragment;
        smeLoanStatusFragment.mCustomProgressBarSmeLoanStatus = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_progress_bar_sme_loan_status, "field 'mCustomProgressBarSmeLoanStatus'", CustomHorizontalProgressBar.class);
    }

    public final void read() {
        SmeLoanStatusFragment smeLoanStatusFragment = this.IconCompatParcelizer;
        if (smeLoanStatusFragment != null) {
            this.IconCompatParcelizer = null;
            smeLoanStatusFragment.mCustomProgressBarSmeLoanStatus = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
