package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungPlanDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private DeejungPlanDetailFragment MediaBrowserCompat$ItemReceiver;

    public DeejungPlanDetailFragment_ViewBinding(final DeejungPlanDetailFragment deejungPlanDetailFragment, View view) {
        super(deejungPlanDetailFragment, view);
        this.MediaBrowserCompat$ItemReceiver = deejungPlanDetailFragment;
        deejungPlanDetailFragment.tvRateLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRateLabel, "field 'tvRateLabel'", TextView.class);
        deejungPlanDetailFragment.layoutTotalPlanDetails = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_total_plan_details, "field 'layoutTotalPlanDetails'", ViewGroup.class);
        deejungPlanDetailFragment.txvMonthlyPlanValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_monthly_plan_details, "field 'txvMonthlyPlanValue'", TextView.class);
        deejungPlanDetailFragment.monthlyInterestRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_monthly_interest_rate, "field 'monthlyInterestRate'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_deejung_review, "field 'btnDeejungReview' and method 'onReviewButtonClick'");
        deejungPlanDetailFragment.btnDeejungReview = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_deejung_review, "field 'btnDeejungReview'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungPlanDetailFragment.this.onReviewButtonClick();
            }
        });
        deejungPlanDetailFragment.layoutMonthlyPlanDetails = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_monthly_plan_details, "field 'layoutMonthlyPlanDetails'", ViewGroup.class);
    }

    public final void read() {
        DeejungPlanDetailFragment deejungPlanDetailFragment = this.MediaBrowserCompat$ItemReceiver;
        if (deejungPlanDetailFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            deejungPlanDetailFragment.tvRateLabel = null;
            deejungPlanDetailFragment.layoutTotalPlanDetails = null;
            deejungPlanDetailFragment.txvMonthlyPlanValue = null;
            deejungPlanDetailFragment.monthlyInterestRate = null;
            deejungPlanDetailFragment.btnDeejungReview = null;
            deejungPlanDetailFragment.layoutMonthlyPlanDetails = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
