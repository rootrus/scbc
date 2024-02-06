package com.scb.phone.view.activity.hml.businessowner;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.tierpricing.TierPricingSimplePromotionView;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlBusinessOwnerReviewSubmissionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private HmlBusinessOwnerReviewSubmissionActivity MediaBrowserCompat$CustomActionResultReceiver;

    public HmlBusinessOwnerReviewSubmissionActivity_ViewBinding(final HmlBusinessOwnerReviewSubmissionActivity hmlBusinessOwnerReviewSubmissionActivity, View view) {
        super(hmlBusinessOwnerReviewSubmissionActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerReviewSubmissionActivity;
        hmlBusinessOwnerReviewSubmissionActivity.tvRequestedLoan = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_requested_loan, "field 'tvRequestedLoan'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvRepaymentAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_amount, "field 'tvRepaymentAmount'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvDuration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_duration, "field 'tvDuration'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvDurationDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_duration_description, "field 'tvDurationDescription'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvStartRepayment = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_start_payment, "field 'tvStartRepayment'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tierPricing = (TierPricingSimplePromotionView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tpspv_tierpricing_promo, "field 'tierPricing'", TierPricingSimplePromotionView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_name, "field 'tvName'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvEducation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_education, "field 'tvEducation'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvResidential = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_residential, "field 'tvResidential'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvMarital = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_marital, "field 'tvMarital'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvLaserId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_laserid, "field 'tvLaserId'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvExpiry = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_expiry, "field 'tvExpiry'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvSpouseHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_spouse_info_header, "field 'tvSpouseHeader'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvSpouseIdLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_spouse_id_label, "field 'tvSpouseIdLabel'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvSpouseId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_spouse_id, "field 'tvSpouseId'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvSpouseNameLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_spouse_name_label, "field 'tvSpouseNameLabel'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvSpouseName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_spouse_name, "field 'tvSpouseName'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvMobile = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mobile, "field 'tvMobile'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_email, "field 'tvEmail'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address, "field 'tvAddress'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvProfessionHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_profession_info_header, "field 'tvProfessionHeader'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvProfessionLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_profession_label, "field 'tvProfessionLabel'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvProfession = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_profession, "field 'tvProfession'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvDutyLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_duty_label, "field 'tvDutyLabel'", TextView.class);
        hmlBusinessOwnerReviewSubmissionActivity.tvDutyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_duty_description, "field 'tvDutyDescription'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "method 'onNextClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessOwnerReviewSubmissionActivity.this.onNextClicked();
            }
        });
    }

    public final void read() {
        HmlBusinessOwnerReviewSubmissionActivity hmlBusinessOwnerReviewSubmissionActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessOwnerReviewSubmissionActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvRequestedLoan = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvRepaymentAmount = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvDuration = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvDurationDescription = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvStartRepayment = null;
            hmlBusinessOwnerReviewSubmissionActivity.tierPricing = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvName = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvEducation = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvResidential = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvMarital = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvLaserId = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvExpiry = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvSpouseHeader = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvSpouseIdLabel = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvSpouseId = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvSpouseNameLabel = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvSpouseName = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvMobile = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvEmail = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvAddress = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvProfessionHeader = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvProfessionLabel = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvProfession = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvDutyLabel = null;
            hmlBusinessOwnerReviewSubmissionActivity.tvDutyDescription = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
