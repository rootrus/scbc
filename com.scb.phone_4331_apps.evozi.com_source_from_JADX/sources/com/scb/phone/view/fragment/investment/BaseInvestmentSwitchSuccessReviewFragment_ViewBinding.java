package com.scb.phone.view.fragment.investment;

import android.view.View;
import android.widget.RelativeLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomSwitchItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import p040o.onStart;

public class BaseInvestmentSwitchSuccessReviewFragment_ViewBinding extends BaseInvestmentSuccessReviewFragment_ViewBinding {
    private BaseInvestmentSwitchSuccessReviewFragment IconCompatParcelizer;

    public BaseInvestmentSwitchSuccessReviewFragment_ViewBinding(BaseInvestmentSwitchSuccessReviewFragment baseInvestmentSwitchSuccessReviewFragment, View view) {
        super(baseInvestmentSwitchSuccessReviewFragment, view);
        this.IconCompatParcelizer = baseInvestmentSwitchSuccessReviewFragment;
        baseInvestmentSwitchSuccessReviewFragment.switchDate = (CustomSwitchItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.switch_date, "field 'switchDate'", CustomSwitchItem.class);
        baseInvestmentSwitchSuccessReviewFragment.switchFee = (CustomSwitchItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.switch_fee, "field 'switchFee'", CustomSwitchItem.class);
        baseInvestmentSwitchSuccessReviewFragment.effectiveDate = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.first_item, "field 'effectiveDate'", RelativeLayout.class);
        baseInvestmentSwitchSuccessReviewFragment.defaultFee = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_success_fees, "field 'defaultFee'", CustomTransferAndPayItem.class);
    }

    public void read() {
        BaseInvestmentSwitchSuccessReviewFragment baseInvestmentSwitchSuccessReviewFragment = this.IconCompatParcelizer;
        if (baseInvestmentSwitchSuccessReviewFragment != null) {
            this.IconCompatParcelizer = null;
            baseInvestmentSwitchSuccessReviewFragment.switchDate = null;
            baseInvestmentSwitchSuccessReviewFragment.switchFee = null;
            baseInvestmentSwitchSuccessReviewFragment.effectiveDate = null;
            baseInvestmentSwitchSuccessReviewFragment.defaultFee = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
