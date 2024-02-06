package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlSummaryFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlSummaryFragment_ViewBinding(final HmlSummaryFragment hmlSummaryFragment, View view) {
        super(hmlSummaryFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlSummaryFragment;
        hmlSummaryFragment.step2Image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_step2, "field 'step2Image'", ImageView.class);
        hmlSummaryFragment.step2Text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step2, "field 'step2Text'", TextView.class);
        hmlSummaryFragment.step3Image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_step3, "field 'step3Image'", ImageView.class);
        hmlSummaryFragment.duration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_summary_duration_per, "field 'duration'", TextView.class);
        hmlSummaryFragment.requestValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_summary_request_value, "field 'requestValue'", TextView.class);
        hmlSummaryFragment.requestAmountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_summary_request_amount_value, "field 'requestAmountValue'", TextView.class);
        hmlSummaryFragment.durationValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_summary_duration, "field 'durationValue'", TextView.class);
        hmlSummaryFragment.repaymentDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tv_hml_start_repayment_value, "field 'repaymentDate'", TextView.class);
        hmlSummaryFragment.annualInterest = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_summary_duration_description, "field 'annualInterest'", TextView.class);
        hmlSummaryFragment.simplePromotionContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_simple_promotion_container, "field 'simplePromotionContainer'", LinearLayout.class);
        hmlSummaryFragment.dutyStampTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_duty_stamp, "field 'dutyStampTitle'", TextView.class);
        hmlSummaryFragment.dutyStampDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_duty_stamp_description, "field 'dutyStampDisclaimer'", TextView.class);
        hmlSummaryFragment.dutyStampSeparator = onStart.IconCompatParcelizer(view, R.id.separator4, "field 'dutyStampSeparator'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next_customer, "field 'btNextCustomer' and method 'submit'");
        hmlSummaryFragment.btNextCustomer = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next_customer, "field 'btNextCustomer'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlSummaryFragment.this.submit();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_next_business, "field 'btNextBusiness' and method 'submit'");
        hmlSummaryFragment.btNextBusiness = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_next_business, "field 'btNextBusiness'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlSummaryFragment.this.submit();
            }
        });
        hmlSummaryFragment.tvLoanPersonalizationLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loan_personalization_label, "field 'tvLoanPersonalizationLabel'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_loan_personalization_button, "field 'tvLoanPersonalizationButton' and method 'onLoanPersonalizationClick'");
        hmlSummaryFragment.tvLoanPersonalizationButton = (TextView) onStart.write(IconCompatParcelizer4, R.id.tv_loan_personalization_button, "field 'tvLoanPersonalizationButton'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlSummaryFragment.this.onLoanPersonalizationClick();
            }
        });
        hmlSummaryFragment.vPrivacyNoticeContainer = onStart.IconCompatParcelizer(view, R.id.v_privacy_notice_container, "field 'vPrivacyNoticeContainer'");
        hmlSummaryFragment.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
    }

    public void read() {
        HmlSummaryFragment hmlSummaryFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlSummaryFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlSummaryFragment.step2Image = null;
            hmlSummaryFragment.step2Text = null;
            hmlSummaryFragment.step3Image = null;
            hmlSummaryFragment.duration = null;
            hmlSummaryFragment.requestValue = null;
            hmlSummaryFragment.requestAmountValue = null;
            hmlSummaryFragment.durationValue = null;
            hmlSummaryFragment.repaymentDate = null;
            hmlSummaryFragment.annualInterest = null;
            hmlSummaryFragment.simplePromotionContainer = null;
            hmlSummaryFragment.dutyStampTitle = null;
            hmlSummaryFragment.dutyStampDisclaimer = null;
            hmlSummaryFragment.dutyStampSeparator = null;
            hmlSummaryFragment.btNextCustomer = null;
            hmlSummaryFragment.btNextBusiness = null;
            hmlSummaryFragment.tvLoanPersonalizationLabel = null;
            hmlSummaryFragment.tvLoanPersonalizationButton = null;
            hmlSummaryFragment.vPrivacyNoticeContainer = null;
            hmlSummaryFragment.tvPrivacyNotice = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
