package com.scb.phone.view.fragment.loan;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomBillsToPay;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class LoanDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private LoanDetailFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public LoanDetailFragment_ViewBinding(final LoanDetailFragment loanDetailFragment, View view) {
        super(loanDetailFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = loanDetailFragment;
        loanDetailFragment.mLoanViewPager = (WrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loans_detail_view_pager, "field 'mLoanViewPager'", WrapContentViewPager.class);
        loanDetailFragment.mLoanDetailCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loans_detail_indicator, "field 'mLoanDetailCircleIndicator'", CircleIndicator.class);
        loanDetailFragment.mCollapsibleImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_expand_arrow, "field 'mCollapsibleImageView'", ImageView.class);
        loanDetailFragment.mAccountDetailCollapsibleRelativeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_detail_collapse_layout, "field 'mAccountDetailCollapsibleRelativeLayout'", LinearLayout.class);
        loanDetailFragment.mLoanDetailScrollview = (ScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_scrollview, "field 'mLoanDetailScrollview'", ScrollView.class);
        loanDetailFragment.mLoanAccountNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_account_name_tv, "field 'mLoanAccountNameTextView'", TextView.class);
        loanDetailFragment.mLoanTypeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_type_tv, "field 'mLoanTypeTextView'", TextView.class);
        loanDetailFragment.mInstallmentAmountValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.installment_amount_value_tv, "field 'mInstallmentAmountValueTextView'", TextView.class);
        loanDetailFragment.mInterestRateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_rate_tv, "field 'mInterestRateTextView'", TextView.class);
        loanDetailFragment.mLoanDetailLatePaymentsTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_late_payments_tv, "field 'mLoanDetailLatePaymentsTextView'", TextView.class);
        loanDetailFragment.mLoanDetailTenorTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_tenor_tv, "field 'mLoanDetailTenorTextView'", TextView.class);
        loanDetailFragment.mLoandDetailRestrictedDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_restricted_description_tv, "field 'mLoandDetailRestrictedDescriptionTextView'", TextView.class);
        loanDetailFragment.mCustomHorizontalProgressBar = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_progress_bar, "field 'mCustomHorizontalProgressBar'", CustomHorizontalProgressBar.class);
        loanDetailFragment.mCustomBillsToPay = (CustomBillsToPay) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_bills_to_play, "field 'mCustomBillsToPay'", CustomBillsToPay.class);
        loanDetailFragment.linearLoanStatusOk = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_loan_status_ok, "field 'linearLoanStatusOk'", LinearLayout.class);
        loanDetailFragment.linearLoanStatusRestricted = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_loan_status_restricted, "field 'linearLoanStatusRestricted'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.loan_detail_layout, "method 'respondOnClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LoanDetailFragment.this.respondOnClick();
            }
        });
    }

    public final void read() {
        LoanDetailFragment loanDetailFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (loanDetailFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            loanDetailFragment.mLoanViewPager = null;
            loanDetailFragment.mLoanDetailCircleIndicator = null;
            loanDetailFragment.mCollapsibleImageView = null;
            loanDetailFragment.mAccountDetailCollapsibleRelativeLayout = null;
            loanDetailFragment.mLoanDetailScrollview = null;
            loanDetailFragment.mLoanAccountNameTextView = null;
            loanDetailFragment.mLoanTypeTextView = null;
            loanDetailFragment.mInstallmentAmountValueTextView = null;
            loanDetailFragment.mInterestRateTextView = null;
            loanDetailFragment.mLoanDetailLatePaymentsTextView = null;
            loanDetailFragment.mLoanDetailTenorTextView = null;
            loanDetailFragment.mLoandDetailRestrictedDescriptionTextView = null;
            loanDetailFragment.mCustomHorizontalProgressBar = null;
            loanDetailFragment.mCustomBillsToPay = null;
            loanDetailFragment.linearLoanStatusOk = null;
            loanDetailFragment.linearLoanStatusRestricted = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
