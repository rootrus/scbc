package com.scb.phone.view.fragment.investment.purchase;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.investment.CustomHyperLinkTextView;
import com.scb.phone.view.fragment.investment.BaseInvestmentSuccessReviewFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundPurchaseReviewFragment_ViewBinding extends BaseInvestmentSuccessReviewFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FundPurchaseReviewFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View MediaMetadataCompat;
    private View write;

    public FundPurchaseReviewFragment_ViewBinding(final FundPurchaseReviewFragment fundPurchaseReviewFragment, View view) {
        super(fundPurchaseReviewFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fundPurchaseReviewFragment;
        fundPurchaseReviewFragment.mTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_date_text_view, "field 'mTransactionDate'", TextView.class);
        fundPurchaseReviewFragment.mDisclaimerMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_message_text_view, "field 'mDisclaimerMessage'", TextView.class);
        fundPurchaseReviewFragment.mDisclaimerSeparator = onStart.IconCompatParcelizer(view, R.id.disclaimer_line_view, "field 'mDisclaimerSeparator'");
        fundPurchaseReviewFragment.mLtfDisclaimerMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ltf_disclaimer_message, "field 'mLtfDisclaimerMessage'", TextView.class);
        fundPurchaseReviewFragment.mHoldingGroup = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.holding_radio_group, "field 'mHoldingGroup'", RadioGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.holding_yes_radio_button, "field 'mHoldingYes' and method 'onHoldingRadioButtonClicked'");
        fundPurchaseReviewFragment.mHoldingYes = (RadioButton) onStart.write(IconCompatParcelizer2, R.id.holding_yes_radio_button, "field 'mHoldingYes'", RadioButton.class);
        this.MediaMetadataCompat = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPurchaseReviewFragment.this.onHoldingRadioButtonClicked((RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onHoldingRadioButtonClicked", RadioButton.class));
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.holding_no_radio_button, "field 'mHoldingNo' and method 'onHoldingRadioButtonClicked'");
        fundPurchaseReviewFragment.mHoldingNo = (RadioButton) onStart.write(IconCompatParcelizer3, R.id.holding_no_radio_button, "field 'mHoldingNo'", RadioButton.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPurchaseReviewFragment.this.onHoldingRadioButtonClicked((RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onHoldingRadioButtonClicked", RadioButton.class));
            }
        });
        fundPurchaseReviewFragment.mTransferGroup = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_radio_group, "field 'mTransferGroup'", RadioGroup.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.transfer_radio_button, "field 'mTransferYes' and method 'onRadioButtonClicked'");
        fundPurchaseReviewFragment.mTransferYes = (RadioButton) onStart.write(IconCompatParcelizer4, R.id.transfer_radio_button, "field 'mTransferYes'", RadioButton.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPurchaseReviewFragment.this.onRadioButtonClicked((RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onRadioButtonClicked", RadioButton.class));
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.redeem_radio_button, "field 'mRedeemYes' and method 'onRadioButtonClicked'");
        fundPurchaseReviewFragment.mRedeemYes = (RadioButton) onStart.write(IconCompatParcelizer5, R.id.redeem_radio_button, "field 'mRedeemYes'", RadioButton.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPurchaseReviewFragment.this.onRadioButtonClicked((RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onRadioButtonClicked", RadioButton.class));
            }
        });
        fundPurchaseReviewFragment.mPayDisclaimerMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pay_disclaimer_message, "field 'mPayDisclaimerMessage'", TextView.class);
        fundPurchaseReviewFragment.mLtfSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ltf_linear_layout, "field 'mLtfSection'", LinearLayout.class);
        fundPurchaseReviewFragment.mLayoutComplexFundDisclaimer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_complex_fund_disclaimer, "field 'mLayoutComplexFundDisclaimer'", LinearLayout.class);
        fundPurchaseReviewFragment.mTvComplexFundDisclaimer = (CustomHyperLinkTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_complex_fund_disclaimer, "field 'mTvComplexFundDisclaimer'", CustomHyperLinkTextView.class);
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.button_continue, "field 'mBtnContinue' and method 'onConfirmButtonClicked'");
        fundPurchaseReviewFragment.mBtnContinue = (DefaultButton) onStart.write(IconCompatParcelizer6, R.id.button_continue, "field 'mBtnContinue'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPurchaseReviewFragment.this.onConfirmButtonClicked();
            }
        });
        fundPurchaseReviewFragment.linearLayoutVulnerableInvestorContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_vulnerable_investor, "field 'linearLayoutVulnerableInvestorContainer'", LinearLayout.class);
        fundPurchaseReviewFragment.textViewVulnerableDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_vulnerable_disclaimer, "field 'textViewVulnerableDisclaimer'", TextView.class);
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.agree_checkbox, "method 'onCheckBoxClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPurchaseReviewFragment.this.onCheckBoxClicked((CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onCheckBoxClicked", CheckBox.class));
            }
        });
    }

    public final void read() {
        FundPurchaseReviewFragment fundPurchaseReviewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundPurchaseReviewFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fundPurchaseReviewFragment.mTransactionDate = null;
            fundPurchaseReviewFragment.mDisclaimerMessage = null;
            fundPurchaseReviewFragment.mDisclaimerSeparator = null;
            fundPurchaseReviewFragment.mLtfDisclaimerMessage = null;
            fundPurchaseReviewFragment.mHoldingGroup = null;
            fundPurchaseReviewFragment.mHoldingYes = null;
            fundPurchaseReviewFragment.mHoldingNo = null;
            fundPurchaseReviewFragment.mTransferGroup = null;
            fundPurchaseReviewFragment.mTransferYes = null;
            fundPurchaseReviewFragment.mRedeemYes = null;
            fundPurchaseReviewFragment.mPayDisclaimerMessage = null;
            fundPurchaseReviewFragment.mLtfSection = null;
            fundPurchaseReviewFragment.mLayoutComplexFundDisclaimer = null;
            fundPurchaseReviewFragment.mTvComplexFundDisclaimer = null;
            fundPurchaseReviewFragment.mBtnContinue = null;
            fundPurchaseReviewFragment.linearLayoutVulnerableInvestorContainer = null;
            fundPurchaseReviewFragment.textViewVulnerableDisclaimer = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
