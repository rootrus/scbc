package com.scb.phone.view.fragment.investment.fundswitch;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomFundSelect;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.investment.BaseScheduleFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class FundSwitchLandingFragment_ViewBinding extends BaseScheduleFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FundSwitchLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public FundSwitchLandingFragment_ViewBinding(final FundSwitchLandingFragment fundSwitchLandingFragment, View view) {
        super(fundSwitchLandingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fundSwitchLandingFragment;
        fundSwitchLandingFragment.nestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_redeem_landing_scroll_view, "field 'nestedScrollView'", NestedScrollView.class);
        fundSwitchLandingFragment.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        fundSwitchLandingFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        fundSwitchLandingFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_tab_layout, "field 'tabLayout'", TabLayout.class);
        fundSwitchLandingFragment.tabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_view_pager, "field 'tabPager'", FragmentWrapContentViewPager.class);
        fundSwitchLandingFragment.mFundPayContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_container, "field 'mFundPayContainer'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        fundSwitchLandingFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSwitchLandingFragment.this.onReviewButtonClick();
            }
        });
        fundSwitchLandingFragment.fundSwitchOut = (CustomFundSelect) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_select, "field 'fundSwitchOut'", CustomFundSelect.class);
        fundSwitchLandingFragment.fundSwitchIn = (CustomFundSelect) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_switch_in, "field 'fundSwitchIn'", CustomFundSelect.class);
        fundSwitchLandingFragment.fundSelectTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_select_title, "field 'fundSelectTitle'", TextView.class);
    }

    public final void read() {
        FundSwitchLandingFragment fundSwitchLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundSwitchLandingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fundSwitchLandingFragment.nestedScrollView = null;
            fundSwitchLandingFragment.mViewPager = null;
            fundSwitchLandingFragment.mCircleIndicator = null;
            fundSwitchLandingFragment.tabLayout = null;
            fundSwitchLandingFragment.tabPager = null;
            fundSwitchLandingFragment.mFundPayContainer = null;
            fundSwitchLandingFragment.buttonReview = null;
            fundSwitchLandingFragment.fundSwitchOut = null;
            fundSwitchLandingFragment.fundSwitchIn = null;
            fundSwitchLandingFragment.fundSelectTitle = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
