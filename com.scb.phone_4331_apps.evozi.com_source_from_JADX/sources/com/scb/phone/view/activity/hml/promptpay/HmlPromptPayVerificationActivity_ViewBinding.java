package com.scb.phone.view.activity.hml.promptpay;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public final class HmlPromptPayVerificationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private HmlPromptPayVerificationActivity write;

    public HmlPromptPayVerificationActivity_ViewBinding(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, View view) {
        super(hmlPromptPayVerificationActivity, view);
        this.write = hmlPromptPayVerificationActivity;
        hmlPromptPayVerificationActivity.breadcrumbnsNtb = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.breadcrumbs_ntb, "field 'breadcrumbnsNtb'", ProgressStateBar.class);
        hmlPromptPayVerificationActivity.mainTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_main, "field 'mainTextView'", TextView.class);
        hmlPromptPayVerificationActivity.secondaryTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_secondary, "field 'secondaryTextView'", TextView.class);
        hmlPromptPayVerificationActivity.button = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt, "field 'button'", Button.class);
    }

    public final void read() {
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = this.write;
        if (hmlPromptPayVerificationActivity != null) {
            this.write = null;
            hmlPromptPayVerificationActivity.breadcrumbnsNtb = null;
            hmlPromptPayVerificationActivity.mainTextView = null;
            hmlPromptPayVerificationActivity.secondaryTextView = null;
            hmlPromptPayVerificationActivity.button = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
