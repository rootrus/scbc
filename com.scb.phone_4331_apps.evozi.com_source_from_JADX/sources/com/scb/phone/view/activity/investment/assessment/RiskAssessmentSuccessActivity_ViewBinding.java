package com.scb.phone.view.activity.investment.assessment;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onCreateDialog;
import p040o.onStart;

public class RiskAssessmentSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RiskAssessmentSuccessActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public RiskAssessmentSuccessActivity_ViewBinding(final RiskAssessmentSuccessActivity riskAssessmentSuccessActivity, View view) {
        super(riskAssessmentSuccessActivity, view);
        this.IconCompatParcelizer = riskAssessmentSuccessActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.investment_save_slip_button, "field 'slipButton' and method 'onSaveSlipClicked'");
        riskAssessmentSuccessActivity.slipButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.investment_save_slip_button, "field 'slipButton'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RiskAssessmentSuccessActivity.this.onSaveSlipClicked();
            }
        });
        riskAssessmentSuccessActivity.nameText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_name, "field 'nameText'", TextView.class);
        riskAssessmentSuccessActivity.scoreText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_score, "field 'scoreText'", TextView.class);
        riskAssessmentSuccessActivity.investorTypeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_investor_type, "field 'investorTypeText'", TextView.class);
        riskAssessmentSuccessActivity.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'dateText'", TextView.class);
        riskAssessmentSuccessActivity.baaRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.baa_recycler_view, "field 'baaRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onCloseClicked'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RiskAssessmentSuccessActivity.this.onCloseClicked();
            }
        });
    }

    public final void read() {
        RiskAssessmentSuccessActivity riskAssessmentSuccessActivity = this.IconCompatParcelizer;
        if (riskAssessmentSuccessActivity != null) {
            this.IconCompatParcelizer = null;
            riskAssessmentSuccessActivity.slipButton = null;
            riskAssessmentSuccessActivity.nameText = null;
            riskAssessmentSuccessActivity.scoreText = null;
            riskAssessmentSuccessActivity.investorTypeText = null;
            riskAssessmentSuccessActivity.dateText = null;
            riskAssessmentSuccessActivity.baaRecyclerView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
