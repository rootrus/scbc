package com.scb.phone.view.fragment.creditcard;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class CreditCardDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CreditCardDetailFragment write;

    public CreditCardDetailFragment_ViewBinding(CreditCardDetailFragment creditCardDetailFragment, View view) {
        super(creditCardDetailFragment, view);
        this.write = creditCardDetailFragment;
        creditCardDetailFragment.creditCardTutorialContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_tutorial_relative_layout, "field 'creditCardTutorialContainer'", RelativeLayout.class);
        creditCardDetailFragment.rootView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root, "field 'rootView'", FrameLayout.class);
        creditCardDetailFragment.mViewPager = (WrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", WrapContentViewPager.class);
        creditCardDetailFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        creditCardDetailFragment.mCreditDetailTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_detail_tab_layout, "field 'mCreditDetailTabLayout'", TabLayout.class);
        creditCardDetailFragment.mCreditCardDetailViewPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_detail_view_pager, "field 'mCreditCardDetailViewPager'", FragmentWrapContentViewPager.class);
        creditCardDetailFragment.creditCardCoachMarkViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_coach_mark_view_pager, "field 'creditCardCoachMarkViewPager'", NoSwipeViewPager.class);
        creditCardDetailFragment.viewRewardsButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_rewards_button, "field 'viewRewardsButton'", Button.class);
    }

    public final void read() {
        CreditCardDetailFragment creditCardDetailFragment = this.write;
        if (creditCardDetailFragment != null) {
            this.write = null;
            creditCardDetailFragment.creditCardTutorialContainer = null;
            creditCardDetailFragment.rootView = null;
            creditCardDetailFragment.mViewPager = null;
            creditCardDetailFragment.mCircleIndicator = null;
            creditCardDetailFragment.mCreditDetailTabLayout = null;
            creditCardDetailFragment.mCreditCardDetailViewPager = null;
            creditCardDetailFragment.creditCardCoachMarkViewPager = null;
            creditCardDetailFragment.viewRewardsButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
