package com.scb.phone.view.fragment.investment.fundswitch;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.CustomHyperLinkTextView;
import com.scb.phone.view.fragment.investment.BaseInvestmentSwitchSuccessReviewFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class FundSwitchReviewFragment_ViewBinding extends BaseInvestmentSwitchSuccessReviewFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private FundSwitchReviewFragment MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View RatingCompat;
    private View write;

    public FundSwitchReviewFragment_ViewBinding(final FundSwitchReviewFragment fundSwitchReviewFragment, View view) {
        super(fundSwitchReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fundSwitchReviewFragment;
        fundSwitchReviewFragment.tvTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'tvTransactionDate'", TextView.class);
        fundSwitchReviewFragment.llDisclaimerContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_disclaimer_container, "field 'llDisclaimerContainer'", LinearLayout.class);
        fundSwitchReviewFragment.tvDisclaimerMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_disclaimer_message, "field 'tvDisclaimerMessage'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.rb_holding_yes, "field 'rbHoldingYes' and method 'onHoldingYesRadioButtonClicked'");
        fundSwitchReviewFragment.rbHoldingYes = (RadioButton) onStart.write(IconCompatParcelizer2, R.id.rb_holding_yes, "field 'rbHoldingYes'", RadioButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSwitchReviewFragment.this.onHoldingYesRadioButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.rb_holding_no, "field 'rbHoldingNo' and method 'onHoldingNoRadioButtonClicked'");
        fundSwitchReviewFragment.rbHoldingNo = (RadioButton) onStart.write(IconCompatParcelizer3, R.id.rb_holding_no, "field 'rbHoldingNo'", RadioButton.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSwitchReviewFragment.this.onHoldingNoRadioButtonClicked();
            }
        });
        fundSwitchReviewFragment.llLtfContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_ltf_container, "field 'llLtfContainer'", LinearLayout.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.rb_transfer, "field 'rbTransfer' and method 'onTransferRadioButtonClicked'");
        fundSwitchReviewFragment.rbTransfer = (RadioButton) onStart.write(IconCompatParcelizer4, R.id.rb_transfer, "field 'rbTransfer'", RadioButton.class);
        this.RatingCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSwitchReviewFragment.this.onTransferRadioButtonClicked();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.rb_redeem, "field 'rbRedeem' and method 'onRedeemRadioButtonClicked'");
        fundSwitchReviewFragment.rbRedeem = (RadioButton) onStart.write(IconCompatParcelizer5, R.id.rb_redeem, "field 'rbRedeem'", RadioButton.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSwitchReviewFragment.this.onRedeemRadioButtonClicked();
            }
        });
        fundSwitchReviewFragment.tvPayDisclaimerMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_pay_disclaimer_message, "field 'tvPayDisclaimerMessage'", TextView.class);
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.bt_confirm, "field 'btConfirm' and method 'onConfirmButtonClick'");
        fundSwitchReviewFragment.btConfirm = (Button) onStart.write(IconCompatParcelizer6, R.id.bt_confirm, "field 'btConfirm'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSwitchReviewFragment.this.onConfirmButtonClick();
            }
        });
        fundSwitchReviewFragment.llComplexDisclaimer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_complex_disclaimer, "field 'llComplexDisclaimer'", LinearLayout.class);
        fundSwitchReviewFragment.tvComplexDisclaimerMessage = (CustomHyperLinkTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_complex_disclaimer_message, "field 'tvComplexDisclaimerMessage'", CustomHyperLinkTextView.class);
        fundSwitchReviewFragment.cbComplexDisclaimer = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_complex_disclaimer, "field 'cbComplexDisclaimer'", CheckBox.class);
        fundSwitchReviewFragment.linearLayoutVulnerableInvestorContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_vulnerable_investor, "field 'linearLayoutVulnerableInvestorContainer'", LinearLayout.class);
        fundSwitchReviewFragment.textViewVulnerableDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_vulnerable_disclaimer, "field 'textViewVulnerableDisclaimer'", TextView.class);
    }

    public final void read() {
        FundSwitchReviewFragment fundSwitchReviewFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fundSwitchReviewFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fundSwitchReviewFragment.tvTransactionDate = null;
            fundSwitchReviewFragment.llDisclaimerContainer = null;
            fundSwitchReviewFragment.tvDisclaimerMessage = null;
            fundSwitchReviewFragment.rbHoldingYes = null;
            fundSwitchReviewFragment.rbHoldingNo = null;
            fundSwitchReviewFragment.llLtfContainer = null;
            fundSwitchReviewFragment.rbTransfer = null;
            fundSwitchReviewFragment.rbRedeem = null;
            fundSwitchReviewFragment.tvPayDisclaimerMessage = null;
            fundSwitchReviewFragment.btConfirm = null;
            fundSwitchReviewFragment.llComplexDisclaimer = null;
            fundSwitchReviewFragment.tvComplexDisclaimerMessage = null;
            fundSwitchReviewFragment.cbComplexDisclaimer = null;
            fundSwitchReviewFragment.linearLayoutVulnerableInvestorContainer = null;
            fundSwitchReviewFragment.textViewVulnerableDisclaimer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
