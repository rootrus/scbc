package com.scb.phone.view.fragment.investment.assessment;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class RiskAssessmentSuccessScreenshotFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RiskAssessmentSuccessScreenshotFragment MediaBrowserCompat$CustomActionResultReceiver;

    public RiskAssessmentSuccessScreenshotFragment_ViewBinding(RiskAssessmentSuccessScreenshotFragment riskAssessmentSuccessScreenshotFragment, View view) {
        super(riskAssessmentSuccessScreenshotFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = riskAssessmentSuccessScreenshotFragment;
        riskAssessmentSuccessScreenshotFragment.nameText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_name, "field 'nameText'", TextView.class);
        riskAssessmentSuccessScreenshotFragment.scoreText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_score, "field 'scoreText'", TextView.class);
        riskAssessmentSuccessScreenshotFragment.investorTypeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_investor_type, "field 'investorTypeText'", TextView.class);
        riskAssessmentSuccessScreenshotFragment.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'dateText'", TextView.class);
        riskAssessmentSuccessScreenshotFragment.baaRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.baa_recycler_view, "field 'baaRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        RiskAssessmentSuccessScreenshotFragment riskAssessmentSuccessScreenshotFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (riskAssessmentSuccessScreenshotFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            riskAssessmentSuccessScreenshotFragment.nameText = null;
            riskAssessmentSuccessScreenshotFragment.scoreText = null;
            riskAssessmentSuccessScreenshotFragment.investorTypeText = null;
            riskAssessmentSuccessScreenshotFragment.dateText = null;
            riskAssessmentSuccessScreenshotFragment.baaRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
