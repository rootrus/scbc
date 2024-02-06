package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ScbsSuitabilityAssessmentResultFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ScbsSuitabilityAssessmentResultFragment write;

    public ScbsSuitabilityAssessmentResultFragment_ViewBinding(final ScbsSuitabilityAssessmentResultFragment scbsSuitabilityAssessmentResultFragment, View view) {
        super(scbsSuitabilityAssessmentResultFragment, view);
        this.write = scbsSuitabilityAssessmentResultFragment;
        scbsSuitabilityAssessmentResultFragment.tvAssessmentName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_assessment_name, "field 'tvAssessmentName'", TextView.class);
        scbsSuitabilityAssessmentResultFragment.tvAssessmentScore = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_assessment_score, "field 'tvAssessmentScore'", TextView.class);
        scbsSuitabilityAssessmentResultFragment.tvAssessmentInvestor = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_assessment_investor, "field 'tvAssessmentInvestor'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_assessment_next, "field 'btAssessmentNext' and method 'onNextClicked'");
        scbsSuitabilityAssessmentResultFragment.btAssessmentNext = (Button) onStart.write(IconCompatParcelizer, R.id.bt_assessment_next, "field 'btAssessmentNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScbsSuitabilityAssessmentResultFragment.this.onNextClicked();
            }
        });
    }

    public final void read() {
        ScbsSuitabilityAssessmentResultFragment scbsSuitabilityAssessmentResultFragment = this.write;
        if (scbsSuitabilityAssessmentResultFragment != null) {
            this.write = null;
            scbsSuitabilityAssessmentResultFragment.tvAssessmentName = null;
            scbsSuitabilityAssessmentResultFragment.tvAssessmentScore = null;
            scbsSuitabilityAssessmentResultFragment.tvAssessmentInvestor = null;
            scbsSuitabilityAssessmentResultFragment.btAssessmentNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
