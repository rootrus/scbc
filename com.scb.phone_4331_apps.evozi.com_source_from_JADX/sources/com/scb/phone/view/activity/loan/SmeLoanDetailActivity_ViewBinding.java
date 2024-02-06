package com.scb.phone.view.activity.loan;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import p040o.onStart;

public class SmeLoanDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SmeLoanDetailActivity MediaBrowserCompat$ItemReceiver;

    public SmeLoanDetailActivity_ViewBinding(SmeLoanDetailActivity smeLoanDetailActivity, View view) {
        super(smeLoanDetailActivity, view);
        this.MediaBrowserCompat$ItemReceiver = smeLoanDetailActivity;
        smeLoanDetailActivity.mCustomProgressBarSmeLoanStatus = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_progress_bar_sme_loan_status, "field 'mCustomProgressBarSmeLoanStatus'", CustomHorizontalProgressBar.class);
    }

    public final void read() {
        SmeLoanDetailActivity smeLoanDetailActivity = this.MediaBrowserCompat$ItemReceiver;
        if (smeLoanDetailActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            smeLoanDetailActivity.mCustomProgressBarSmeLoanStatus = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
