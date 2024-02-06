package com.scb.phone.view.activity.investment.assessment;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class RiskLevelAssessmentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RiskLevelAssessmentActivity MediaBrowserCompat$ItemReceiver;

    public RiskLevelAssessmentActivity_ViewBinding(RiskLevelAssessmentActivity riskLevelAssessmentActivity, View view) {
        super(riskLevelAssessmentActivity, view);
        this.MediaBrowserCompat$ItemReceiver = riskLevelAssessmentActivity;
        riskLevelAssessmentActivity.toolbar = onStart.IconCompatParcelizer(view, R.id.toolbar, "field 'toolbar'");
    }

    public final void read() {
        RiskLevelAssessmentActivity riskLevelAssessmentActivity = this.MediaBrowserCompat$ItemReceiver;
        if (riskLevelAssessmentActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            riskLevelAssessmentActivity.toolbar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
