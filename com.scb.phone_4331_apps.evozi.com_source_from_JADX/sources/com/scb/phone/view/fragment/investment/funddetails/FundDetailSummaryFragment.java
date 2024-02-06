package com.scb.phone.view.fragment.investment.funddetails;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_BindMileageReviewRedemptionActivity;
import p040o.ActivityBuilder_BindModifyQuickBalanceActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.setChildDrawingOrderCallback;

public class FundDetailSummaryFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @BindView
    public TextView mAverageCost;
    @BindView
    public TextView mAverageUnit;
    @BindView
    public TextView mCurrentUnit;
    @BindView
    public TextView mCurrentValue;
    @BindView
    public TextView mFundDescription;
    @BindView
    public TextView mFundName;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87582131493985, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_FUND_DETAILS_SUMMARY")).subscribe(new ActivityBuilder_BindMileageReviewRedemptionActivity(this), ActivityBuilder_BindModifyQuickBalanceActivity.MediaBrowserCompat$ItemReceiver);
        super.Keep();
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public final void Keep() {
        super.Keep();
    }
}
