package com.scb.phone.view.activity.investment.onboarding;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public class FundAppFormActivity_ViewBinding extends BaseActivity_ViewBinding {
    private FundAppFormActivity MediaBrowserCompat$CustomActionResultReceiver;

    public FundAppFormActivity_ViewBinding(FundAppFormActivity fundAppFormActivity, View view) {
        super(fundAppFormActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fundAppFormActivity;
        fundAppFormActivity.progressStateBar = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_state_bar, "field 'progressStateBar'", ProgressStateBar.class);
    }

    public final void read() {
        FundAppFormActivity fundAppFormActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundAppFormActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fundAppFormActivity.progressStateBar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
