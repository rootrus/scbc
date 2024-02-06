package com.scb.phone.view.fragment.investment.redeem;

import android.view.View;
import android.widget.RadioButton;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.investment.BaseInvestmentSuccessReviewFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class FundRedeemReviewFragment_ViewBinding extends BaseInvestmentSuccessReviewFragment_ViewBinding {
    private FundRedeemReviewFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public FundRedeemReviewFragment_ViewBinding(final FundRedeemReviewFragment fundRedeemReviewFragment, View view) {
        super(fundRedeemReviewFragment, view);
        this.IconCompatParcelizer = fundRedeemReviewFragment;
        fundRedeemReviewFragment.tvTransactionDate = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'tvTransactionDate'", CustomTransferAndPayItem.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.rb_holding_yes, "field 'rbHoldingYes' and method 'onHoldingYesRadioButtonClicked'");
        fundRedeemReviewFragment.rbHoldingYes = (RadioButton) onStart.write(IconCompatParcelizer2, R.id.rb_holding_yes, "field 'rbHoldingYes'", RadioButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundRedeemReviewFragment.this.onHoldingYesRadioButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.rb_holding_no, "field 'rbHoldingNo' and method 'onHoldingNoRadioButtonClicked'");
        fundRedeemReviewFragment.rbHoldingNo = (RadioButton) onStart.write(IconCompatParcelizer3, R.id.rb_holding_no, "field 'rbHoldingNo'", RadioButton.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundRedeemReviewFragment.this.onHoldingNoRadioButtonClicked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onConfirmButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundRedeemReviewFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        FundRedeemReviewFragment fundRedeemReviewFragment = this.IconCompatParcelizer;
        if (fundRedeemReviewFragment != null) {
            this.IconCompatParcelizer = null;
            fundRedeemReviewFragment.tvTransactionDate = null;
            fundRedeemReviewFragment.rbHoldingYes = null;
            fundRedeemReviewFragment.rbHoldingNo = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
