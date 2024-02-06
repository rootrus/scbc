package com.scb.phone.view.fragment.investment.funddetails;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomFundsActions;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class InvestmentFundDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private InvestmentFundDetailFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public InvestmentFundDetailFragment_ViewBinding(final InvestmentFundDetailFragment investmentFundDetailFragment, View view) {
        super(investmentFundDetailFragment, view);
        this.IconCompatParcelizer = investmentFundDetailFragment;
        investmentFundDetailFragment.mLayoutExpanded = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_expanded, "field 'mLayoutExpanded'", ViewGroup.class);
        investmentFundDetailFragment.mExpandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'mExpandIcon'", ImageView.class);
        investmentFundDetailFragment.nestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_details_scrollview, "field 'nestedScrollView'", NestedScrollView.class);
        investmentFundDetailFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_details_tab_layout, "field 'tabLayout'", TabLayout.class);
        investmentFundDetailFragment.tabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_details_view_pager, "field 'tabPager'", FragmentWrapContentViewPager.class);
        investmentFundDetailFragment.mViewPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", FragmentWrapContentViewPager.class);
        investmentFundDetailFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        investmentFundDetailFragment.ltfDividendContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ltf_dividend_container, "field 'ltfDividendContainer'", LinearLayout.class);
        investmentFundDetailFragment.ltfDividendFragmentContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ltf_dividend_fragment_container, "field 'ltfDividendFragmentContainer'", LinearLayout.class);
        investmentFundDetailFragment.ltfDividendTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ltf_dividend_text_view, "field 'ltfDividendTitle'", TextView.class);
        investmentFundDetailFragment.customFundsActions = (CustomFundsActions) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_funds_actions, "field 'customFundsActions'", CustomFundsActions.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.layout_collapsed, "method 'onLayoutCollapsedClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                InvestmentFundDetailFragment.this.onLayoutCollapsedClick();
            }
        });
    }

    public final void read() {
        InvestmentFundDetailFragment investmentFundDetailFragment = this.IconCompatParcelizer;
        if (investmentFundDetailFragment != null) {
            this.IconCompatParcelizer = null;
            investmentFundDetailFragment.mLayoutExpanded = null;
            investmentFundDetailFragment.mExpandIcon = null;
            investmentFundDetailFragment.nestedScrollView = null;
            investmentFundDetailFragment.tabLayout = null;
            investmentFundDetailFragment.tabPager = null;
            investmentFundDetailFragment.mViewPager = null;
            investmentFundDetailFragment.mCircleIndicator = null;
            investmentFundDetailFragment.ltfDividendContainer = null;
            investmentFundDetailFragment.ltfDividendFragmentContainer = null;
            investmentFundDetailFragment.ltfDividendTitle = null;
            investmentFundDetailFragment.customFundsActions = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
