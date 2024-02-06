package com.scb.phone.view.fragment.ccrredemption.review;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ReviewRedemptionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private ReviewRedemptionFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public ReviewRedemptionFragment_ViewBinding(final ReviewRedemptionFragment reviewRedemptionFragment, View view) {
        super(reviewRedemptionFragment, view);
        this.MediaBrowserCompat$ItemReceiver = reviewRedemptionFragment;
        reviewRedemptionFragment.txvItemName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_item_name, "field 'txvItemName'", TextView.class);
        reviewRedemptionFragment.txvCardType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_type, "field 'txvCardType'", TextView.class);
        reviewRedemptionFragment.txvCardNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_number, "field 'txvCardNo'", TextView.class);
        reviewRedemptionFragment.txvItemDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_item_description, "field 'txvItemDescription'", TextView.class);
        reviewRedemptionFragment.txvTotalPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_points, "field 'txvTotalPoints'", TextView.class);
        reviewRedemptionFragment.txvTotalPayable = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_payable, "field 'txvTotalPayable'", TextView.class);
        reviewRedemptionFragment.txvCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_currency, "field 'txvCurrency'", TextView.class);
        reviewRedemptionFragment.totalPayableSection = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_payable_section, "field 'totalPayableSection'", ConstraintLayout.class);
        reviewRedemptionFragment.txvEffectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_effective_date, "field 'txvEffectiveDate'", TextView.class);
        reviewRedemptionFragment.layoutEffectiveDate = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_effective_date, "field 'layoutEffectiveDate'", ConstraintLayout.class);
        reviewRedemptionFragment.cashRewardsEta = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cash_rewards_eta, "field 'cashRewardsEta'", TextView.class);
        reviewRedemptionFragment.deliveryEta = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.delivery_eta, "field 'deliveryEta'", TextView.class);
        reviewRedemptionFragment.oprUserReviewConsent = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.opr_user_review_consent, "field 'oprUserReviewConsent'", TextView.class);
        reviewRedemptionFragment.termsAndConditionsView = (TermsAndConditionsView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions, "field 'termsAndConditionsView'", TermsAndConditionsView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_confirm, "field 'btnConfirm' and method 'onConfirmRedemptionClick'");
        reviewRedemptionFragment.btnConfirm = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_confirm, "field 'btnConfirm'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewRedemptionFragment.this.onConfirmRedemptionClick();
            }
        });
        reviewRedemptionFragment.txvPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points, "field 'txvPoints'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.chk_terms_and_conditions, "method 'onTermsAndConditionsCheckChanged'");
        this.write = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ReviewRedemptionFragment.this.onTermsAndConditionsCheckChanged(z);
            }
        });
    }

    public final void read() {
        ReviewRedemptionFragment reviewRedemptionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (reviewRedemptionFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            reviewRedemptionFragment.txvItemName = null;
            reviewRedemptionFragment.txvCardType = null;
            reviewRedemptionFragment.txvCardNo = null;
            reviewRedemptionFragment.txvItemDescription = null;
            reviewRedemptionFragment.txvTotalPoints = null;
            reviewRedemptionFragment.txvTotalPayable = null;
            reviewRedemptionFragment.txvCurrency = null;
            reviewRedemptionFragment.totalPayableSection = null;
            reviewRedemptionFragment.txvEffectiveDate = null;
            reviewRedemptionFragment.layoutEffectiveDate = null;
            reviewRedemptionFragment.cashRewardsEta = null;
            reviewRedemptionFragment.deliveryEta = null;
            reviewRedemptionFragment.oprUserReviewConsent = null;
            reviewRedemptionFragment.termsAndConditionsView = null;
            reviewRedemptionFragment.btnConfirm = null;
            reviewRedemptionFragment.txvPoints = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            ((CompoundButton) this.write).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
