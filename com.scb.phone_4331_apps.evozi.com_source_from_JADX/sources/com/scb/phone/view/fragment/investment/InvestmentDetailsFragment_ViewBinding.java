package com.scb.phone.view.fragment.investment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.tabs.TabLayout;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.view.custom.InfiniteRecyclerView;
import com.scb.phone.view.custom.common.CustomFundsActions;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class InvestmentDetailsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private InvestmentDetailsFragment IconCompatParcelizer;

    public InvestmentDetailsFragment_ViewBinding(InvestmentDetailsFragment investmentDetailsFragment, View view) {
        super(investmentDetailsFragment, view);
        this.IconCompatParcelizer = investmentDetailsFragment;
        investmentDetailsFragment.mInvestmentDetailScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_detail_scrollview, "field 'mInvestmentDetailScrollView'", NestedScrollView.class);
        investmentDetailsFragment.mTotalBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_total_balance_text_view, "field 'mTotalBalance'", TextView.class);
        investmentDetailsFragment.mNetGain = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_net_gain_text_view, "field 'mNetGain'", TextView.class);
        investmentDetailsFragment.mNetGainPercent = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_net_gain_percent_text_view, "field 'mNetGainPercent'", TextView.class);
        investmentDetailsFragment.mNetGainIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_gain_indicator, "field 'mNetGainIndicator'", ImageView.class);
        investmentDetailsFragment.mChart = (PieChart) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_piechart, "field 'mChart'", PieChart.class);
        investmentDetailsFragment.mRiskLevel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.profile_risk_level_text_view, "field 'mRiskLevel'", TextView.class);
        investmentDetailsFragment.mCustomerNameView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_profile_customer_name, "field 'mCustomerNameView'", LinearLayout.class);
        investmentDetailsFragment.mExpiredProfileView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_profile_expired_view, "field 'mExpiredProfileView'", LinearLayout.class);
        investmentDetailsFragment.mRiskProfileView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_detials_profile_risk_view, "field 'mRiskProfileView'", LinearLayout.class);
        investmentDetailsFragment.mRiskExpiryDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.profile_risk_expiry_date_text_view, "field 'mRiskExpiryDate'", TextView.class);
        investmentDetailsFragment.mCustomerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.profile_customer_name_text_view, "field 'mCustomerName'", TextView.class);
        investmentDetailsFragment.mAssetGroupListView = (ListView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.asset_group_list, "field 'mAssetGroupListView'", ListView.class);
        investmentDetailsFragment.pieChartContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.piechart_container, "field 'pieChartContainer'", LinearLayout.class);
        investmentDetailsFragment.contextualAdsView = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.contextual_ads_view, "field 'contextualAdsView'", ConstraintLayout.class);
        investmentDetailsFragment.rvContextualAds = (InfiniteRecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_contextual_ads, "field 'rvContextualAds'", InfiniteRecyclerView.class);
        investmentDetailsFragment.layoutIndicator = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_indicator, "field 'layoutIndicator'", LinearLayout.class);
        investmentDetailsFragment.pivAdsIndicator = (PageIndicatorView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.piv_ads_indicator, "field 'pivAdsIndicator'", PageIndicatorView.class);
        investmentDetailsFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_tab_layout, "field 'mTabLayout'", TabLayout.class);
        investmentDetailsFragment.mTabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_view_pager, "field 'mTabPager'", FragmentWrapContentViewPager.class);
        investmentDetailsFragment.customFundsActions = (CustomFundsActions) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_funds_actions, "field 'customFundsActions'", CustomFundsActions.class);
    }

    public final void read() {
        InvestmentDetailsFragment investmentDetailsFragment = this.IconCompatParcelizer;
        if (investmentDetailsFragment != null) {
            this.IconCompatParcelizer = null;
            investmentDetailsFragment.mInvestmentDetailScrollView = null;
            investmentDetailsFragment.mTotalBalance = null;
            investmentDetailsFragment.mNetGain = null;
            investmentDetailsFragment.mNetGainPercent = null;
            investmentDetailsFragment.mNetGainIndicator = null;
            investmentDetailsFragment.mChart = null;
            investmentDetailsFragment.mRiskLevel = null;
            investmentDetailsFragment.mCustomerNameView = null;
            investmentDetailsFragment.mExpiredProfileView = null;
            investmentDetailsFragment.mRiskProfileView = null;
            investmentDetailsFragment.mRiskExpiryDate = null;
            investmentDetailsFragment.mCustomerName = null;
            investmentDetailsFragment.mAssetGroupListView = null;
            investmentDetailsFragment.pieChartContainer = null;
            investmentDetailsFragment.contextualAdsView = null;
            investmentDetailsFragment.rvContextualAds = null;
            investmentDetailsFragment.layoutIndicator = null;
            investmentDetailsFragment.pivAdsIndicator = null;
            investmentDetailsFragment.mTabLayout = null;
            investmentDetailsFragment.mTabPager = null;
            investmentDetailsFragment.customFundsActions = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
