package com.scb.phone.view.fragment.investment.funddetails;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class FundDetailSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundDetailSummaryFragment IconCompatParcelizer;

    public FundDetailSummaryFragment_ViewBinding(FundDetailSummaryFragment fundDetailSummaryFragment, View view) {
        super(fundDetailSummaryFragment, view);
        this.IconCompatParcelizer = fundDetailSummaryFragment;
        fundDetailSummaryFragment.mFundName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_name_text_view, "field 'mFundName'", TextView.class);
        fundDetailSummaryFragment.mFundDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_description_text_view, "field 'mFundDescription'", TextView.class);
        fundDetailSummaryFragment.mAverageUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_average_unit_text_view, "field 'mAverageUnit'", TextView.class);
        fundDetailSummaryFragment.mCurrentUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_current_unit_text_view, "field 'mCurrentUnit'", TextView.class);
        fundDetailSummaryFragment.mAverageCost = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_average_cost_text_view, "field 'mAverageCost'", TextView.class);
        fundDetailSummaryFragment.mCurrentValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_current_value_text_view, "field 'mCurrentValue'", TextView.class);
    }

    public final void read() {
        FundDetailSummaryFragment fundDetailSummaryFragment = this.IconCompatParcelizer;
        if (fundDetailSummaryFragment != null) {
            this.IconCompatParcelizer = null;
            fundDetailSummaryFragment.mFundName = null;
            fundDetailSummaryFragment.mFundDescription = null;
            fundDetailSummaryFragment.mAverageUnit = null;
            fundDetailSummaryFragment.mCurrentUnit = null;
            fundDetailSummaryFragment.mAverageCost = null;
            fundDetailSummaryFragment.mCurrentValue = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
