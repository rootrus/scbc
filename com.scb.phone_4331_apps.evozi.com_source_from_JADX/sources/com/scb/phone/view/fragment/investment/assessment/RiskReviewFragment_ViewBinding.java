package com.scb.phone.view.fragment.investment.assessment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RiskReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RiskReviewFragment IconCompatParcelizer;
    private View write;

    public RiskReviewFragment_ViewBinding(final RiskReviewFragment riskReviewFragment, View view) {
        super(riskReviewFragment, view);
        this.IconCompatParcelizer = riskReviewFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'continueButton' and method 'continueButtonClicked'");
        riskReviewFragment.continueButton = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'continueButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RiskReviewFragment.this.continueButtonClicked(view);
            }
        });
        riskReviewFragment.disclaimerText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_description, "field 'disclaimerText'", TextView.class);
        riskReviewFragment.nameText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_name, "field 'nameText'", TextView.class);
        riskReviewFragment.scoreText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_score, "field 'scoreText'", TextView.class);
        riskReviewFragment.investorTypeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_success_investor_type, "field 'investorTypeText'", TextView.class);
        riskReviewFragment.baaRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.baa_recycler_view, "field 'baaRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        RiskReviewFragment riskReviewFragment = this.IconCompatParcelizer;
        if (riskReviewFragment != null) {
            this.IconCompatParcelizer = null;
            riskReviewFragment.continueButton = null;
            riskReviewFragment.disclaimerText = null;
            riskReviewFragment.nameText = null;
            riskReviewFragment.scoreText = null;
            riskReviewFragment.investorTypeText = null;
            riskReviewFragment.baaRecyclerView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
