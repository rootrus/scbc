package com.scb.phone.view.fragment.investment.assessment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RiskSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RiskSummaryFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public RiskSummaryFragment_ViewBinding(final RiskSummaryFragment riskSummaryFragment, View view) {
        super(riskSummaryFragment, view);
        this.MediaBrowserCompat$ItemReceiver = riskSummaryFragment;
        riskSummaryFragment.tvRiskSubTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_risk_sub_title, "field 'tvRiskSubTitle'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'btContinue' and method 'continueButtonClicked'");
        riskSummaryFragment.btContinue = (Button) onStart.write(IconCompatParcelizer, R.id.bt_next, "field 'btContinue'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RiskSummaryFragment.this.continueButtonClicked();
            }
        });
        riskSummaryFragment.rvQuestions = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_questions, "field 'rvQuestions'", RecyclerView.class);
    }

    public final void read() {
        RiskSummaryFragment riskSummaryFragment = this.MediaBrowserCompat$ItemReceiver;
        if (riskSummaryFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            riskSummaryFragment.tvRiskSubTitle = null;
            riskSummaryFragment.btContinue = null;
            riskSummaryFragment.rvQuestions = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
