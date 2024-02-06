package com.scb.phone.view.fragment.investment.redeem;

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

public class FundRedeemLandingFragment_ViewBinding extends BaseScheduleFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private FundRedeemLandingFragment write;

    public FundRedeemLandingFragment_ViewBinding(final FundRedeemLandingFragment fundRedeemLandingFragment, View view) {
        super(fundRedeemLandingFragment, view);
        this.write = fundRedeemLandingFragment;
        fundRedeemLandingFragment.nestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_redeem_landing_scroll_view, "field 'nestedScrollView'", NestedScrollView.class);
        fundRedeemLandingFragment.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        fundRedeemLandingFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        fundRedeemLandingFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_tab_layout, "field 'tabLayout'", TabLayout.class);
        fundRedeemLandingFragment.tabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_view_pager, "field 'tabPager'", FragmentWrapContentViewPager.class);
        fundRedeemLandingFragment.mFundPayContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_container, "field 'mFundPayContainer'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        fundRedeemLandingFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundRedeemLandingFragment.this.onReviewButtonClick();
            }
        });
        fundRedeemLandingFragment.fundSelect = (CustomFundSelect) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_select, "field 'fundSelect'", CustomFundSelect.class);
        fundRedeemLandingFragment.selectFundTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_select_title, "field 'selectFundTitle'", TextView.class);
    }

    public final void read() {
        FundRedeemLandingFragment fundRedeemLandingFragment = this.write;
        if (fundRedeemLandingFragment != null) {
            this.write = null;
            fundRedeemLandingFragment.nestedScrollView = null;
            fundRedeemLandingFragment.mViewPager = null;
            fundRedeemLandingFragment.mCircleIndicator = null;
            fundRedeemLandingFragment.tabLayout = null;
            fundRedeemLandingFragment.tabPager = null;
            fundRedeemLandingFragment.mFundPayContainer = null;
            fundRedeemLandingFragment.buttonReview = null;
            fundRedeemLandingFragment.fundSelect = null;
            fundRedeemLandingFragment.selectFundTitle = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
