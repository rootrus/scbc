package com.scb.phone.view.fragment.investment;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomScheduleFundItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseInvestmentSuccessReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseInvestmentSuccessReviewFragment IconCompatParcelizer;

    public BaseInvestmentSuccessReviewFragment_ViewBinding(BaseInvestmentSuccessReviewFragment baseInvestmentSuccessReviewFragment, View view) {
        super(baseInvestmentSuccessReviewFragment, view);
        this.IconCompatParcelizer = baseInvestmentSuccessReviewFragment;
        baseInvestmentSuccessReviewFragment.clientNo = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_success_client_no, "field 'clientNo'", CustomTransferAndPaySource.class);
        baseInvestmentSuccessReviewFragment.funds = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_success_funds, "field 'funds'", CustomTransferAndPaySource.class);
        baseInvestmentSuccessReviewFragment.accountNo = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_success_account, "field 'accountNo'", CustomTransferAndPaySource.class);
        baseInvestmentSuccessReviewFragment.scheduleInfo = (CustomScheduleFundItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_schedule, "field 'scheduleInfo'", CustomScheduleFundItem.class);
        baseInvestmentSuccessReviewFragment.transferDate = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_success_transfer_date, "field 'transferDate'", CustomTransferAndPayItem.class);
        baseInvestmentSuccessReviewFragment.customAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_success_amount, "field 'customAmount'", CustomTransferAndPayItem.class);
        baseInvestmentSuccessReviewFragment.customFees = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_review_success_fees, "field 'customFees'", CustomTransferAndPayItem.class);
    }

    public void read() {
        BaseInvestmentSuccessReviewFragment baseInvestmentSuccessReviewFragment = this.IconCompatParcelizer;
        if (baseInvestmentSuccessReviewFragment != null) {
            this.IconCompatParcelizer = null;
            baseInvestmentSuccessReviewFragment.clientNo = null;
            baseInvestmentSuccessReviewFragment.funds = null;
            baseInvestmentSuccessReviewFragment.accountNo = null;
            baseInvestmentSuccessReviewFragment.scheduleInfo = null;
            baseInvestmentSuccessReviewFragment.transferDate = null;
            baseInvestmentSuccessReviewFragment.customAmount = null;
            baseInvestmentSuccessReviewFragment.customFees = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
