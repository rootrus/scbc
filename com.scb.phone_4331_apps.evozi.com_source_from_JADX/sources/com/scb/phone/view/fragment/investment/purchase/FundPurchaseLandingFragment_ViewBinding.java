package com.scb.phone.view.fragment.investment.purchase;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomFundSelect;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.investment.BaseScheduleFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class FundPurchaseLandingFragment_ViewBinding extends BaseScheduleFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FundPurchaseLandingFragment write;

    public FundPurchaseLandingFragment_ViewBinding(final FundPurchaseLandingFragment fundPurchaseLandingFragment, View view) {
        super(fundPurchaseLandingFragment, view);
        this.write = fundPurchaseLandingFragment;
        fundPurchaseLandingFragment.nestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_purchase_landing_scroll_view, "field 'nestedScrollView'", NestedScrollView.class);
        fundPurchaseLandingFragment.clientNoLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.client_no_layout, "field 'clientNoLayout'", LinearLayout.class);
        fundPurchaseLandingFragment.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        fundPurchaseLandingFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        fundPurchaseLandingFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_tab_layout, "field 'tabLayout'", TabLayout.class);
        fundPurchaseLandingFragment.tabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_view_pager, "field 'tabPager'", FragmentWrapContentViewPager.class);
        fundPurchaseLandingFragment.mFundPayTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_title_text_view, "field 'mFundPayTitle'", TextView.class);
        fundPurchaseLandingFragment.mFundPayFragmentContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_fragment_container, "field 'mFundPayFragmentContainer'", LinearLayout.class);
        fundPurchaseLandingFragment.mFundPayContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_pay_container, "field 'mFundPayContainer'", LinearLayout.class);
        fundPurchaseLandingFragment.fundSelect = (CustomFundSelect) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_select, "field 'fundSelect'", CustomFundSelect.class);
        fundPurchaseLandingFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        fundPurchaseLandingFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPurchaseLandingFragment.this.onReviewButtonClick();
            }
        });
    }

    public final void read() {
        FundPurchaseLandingFragment fundPurchaseLandingFragment = this.write;
        if (fundPurchaseLandingFragment != null) {
            this.write = null;
            fundPurchaseLandingFragment.nestedScrollView = null;
            fundPurchaseLandingFragment.clientNoLayout = null;
            fundPurchaseLandingFragment.mViewPager = null;
            fundPurchaseLandingFragment.mCircleIndicator = null;
            fundPurchaseLandingFragment.tabLayout = null;
            fundPurchaseLandingFragment.tabPager = null;
            fundPurchaseLandingFragment.mFundPayTitle = null;
            fundPurchaseLandingFragment.mFundPayFragmentContainer = null;
            fundPurchaseLandingFragment.mFundPayContainer = null;
            fundPurchaseLandingFragment.fundSelect = null;
            fundPurchaseLandingFragment.editAmount = null;
            fundPurchaseLandingFragment.buttonReview = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
