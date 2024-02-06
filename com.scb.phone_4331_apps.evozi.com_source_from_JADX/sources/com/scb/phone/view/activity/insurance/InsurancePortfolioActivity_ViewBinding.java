package com.scb.phone.view.activity.insurance;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class InsurancePortfolioActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private InsurancePortfolioActivity write;

    public InsurancePortfolioActivity_ViewBinding(final InsurancePortfolioActivity insurancePortfolioActivity, View view) {
        super(insurancePortfolioActivity, view);
        this.write = insurancePortfolioActivity;
        insurancePortfolioActivity.nsvInsurancePortfolio = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nsv_insurance_portfolio, "field 'nsvInsurancePortfolio'", NestedScrollView.class);
        insurancePortfolioActivity.csLayoutEmptyPolicy = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_empty_policy, "field 'csLayoutEmptyPolicy'", ConstraintLayout.class);
        insurancePortfolioActivity.csLayoutPolicyHeaderSection = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_policy_header_section, "field 'csLayoutPolicyHeaderSection'", ConstraintLayout.class);
        insurancePortfolioActivity.tvPolicyHeaderLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_policy_header_label, "field 'tvPolicyHeaderLabel'", TextView.class);
        insurancePortfolioActivity.tvPolicyHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_policy_header, "field 'tvPolicyHeader'", TextView.class);
        insurancePortfolioActivity.tvSumAssured = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_sum_assured, "field 'tvSumAssured'", TextView.class);
        insurancePortfolioActivity.tvPaymentPlan = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_payment_plan, "field 'tvPaymentPlan'", TextView.class);
        insurancePortfolioActivity.tvPremiumAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_premium_amount, "field 'tvPremiumAmount'", TextView.class);
        insurancePortfolioActivity.tvEffectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_effective_date, "field 'tvEffectiveDate'", TextView.class);
        insurancePortfolioActivity.tvEndDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_end_date, "field 'tvEndDate'", TextView.class);
        insurancePortfolioActivity.tvPolicyRenewal = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_policy_renewal, "field 'tvPolicyRenewal'", TextView.class);
        insurancePortfolioActivity.tvInsuranceType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_insurance_type, "field 'tvInsuranceType'", TextView.class);
        insurancePortfolioActivity.tvCarRepairType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_car_repair_type, "field 'tvCarRepairType'", TextView.class);
        insurancePortfolioActivity.tvNewSumAssured = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_new_sum_assured, "field 'tvNewSumAssured'", TextView.class);
        insurancePortfolioActivity.tvPremium = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_premium, "field 'tvPremium'", TextView.class);
        insurancePortfolioActivity.tvDueDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_due_date, "field 'tvDueDate'", TextView.class);
        insurancePortfolioActivity.tvDueAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_due_amount, "field 'tvDueAmount'", TextView.class);
        insurancePortfolioActivity.tvPaymentDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_payment_disclaimer, "field 'tvPaymentDisclaimer'", TextView.class);
        insurancePortfolioActivity.caLayoutPaymentCarSection = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_payment_car_section, "field 'caLayoutPaymentCarSection'", ConstraintLayout.class);
        insurancePortfolioActivity.llLayoutPaymentSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_payment_section, "field 'llLayoutPaymentSection'", LinearLayout.class);
        insurancePortfolioActivity.rvInsurers = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_insurers, "field 'rvInsurers'", RecyclerView.class);
        insurancePortfolioActivity.rvPolicyCard = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_policy_card, "field 'rvPolicyCard'", RecyclerView.class);
        insurancePortfolioActivity.pivPolicyCardIndicator = (PageIndicatorView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.piv_policy_card, "field 'pivPolicyCardIndicator'", PageIndicatorView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_insurance_pay, "method 'onClickPay'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                InsurancePortfolioActivity.this.onClickPay();
            }
        });
    }

    public final void read() {
        InsurancePortfolioActivity insurancePortfolioActivity = this.write;
        if (insurancePortfolioActivity != null) {
            this.write = null;
            insurancePortfolioActivity.nsvInsurancePortfolio = null;
            insurancePortfolioActivity.csLayoutEmptyPolicy = null;
            insurancePortfolioActivity.csLayoutPolicyHeaderSection = null;
            insurancePortfolioActivity.tvPolicyHeaderLabel = null;
            insurancePortfolioActivity.tvPolicyHeader = null;
            insurancePortfolioActivity.tvSumAssured = null;
            insurancePortfolioActivity.tvPaymentPlan = null;
            insurancePortfolioActivity.tvPremiumAmount = null;
            insurancePortfolioActivity.tvEffectiveDate = null;
            insurancePortfolioActivity.tvEndDate = null;
            insurancePortfolioActivity.tvPolicyRenewal = null;
            insurancePortfolioActivity.tvInsuranceType = null;
            insurancePortfolioActivity.tvCarRepairType = null;
            insurancePortfolioActivity.tvNewSumAssured = null;
            insurancePortfolioActivity.tvPremium = null;
            insurancePortfolioActivity.tvDueDate = null;
            insurancePortfolioActivity.tvDueAmount = null;
            insurancePortfolioActivity.tvPaymentDisclaimer = null;
            insurancePortfolioActivity.caLayoutPaymentCarSection = null;
            insurancePortfolioActivity.llLayoutPaymentSection = null;
            insurancePortfolioActivity.rvInsurers = null;
            insurancePortfolioActivity.rvPolicyCard = null;
            insurancePortfolioActivity.pivPolicyCardIndicator = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
