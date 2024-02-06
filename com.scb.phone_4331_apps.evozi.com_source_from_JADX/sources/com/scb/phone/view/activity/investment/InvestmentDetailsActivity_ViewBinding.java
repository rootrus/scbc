package com.scb.phone.view.activity.investment;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.NonSwipeableViewPager;
import p040o.onStart;

public class InvestmentDetailsActivity_ViewBinding extends BaseActivity_ViewBinding {
    private InvestmentDetailsActivity IconCompatParcelizer;

    public InvestmentDetailsActivity_ViewBinding(InvestmentDetailsActivity investmentDetailsActivity, View view) {
        super(investmentDetailsActivity, view);
        this.IconCompatParcelizer = investmentDetailsActivity;
        investmentDetailsActivity.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
        investmentDetailsActivity.tabPager = (NonSwipeableViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager, "field 'tabPager'", NonSwipeableViewPager.class);
    }

    public final void read() {
        InvestmentDetailsActivity investmentDetailsActivity = this.IconCompatParcelizer;
        if (investmentDetailsActivity != null) {
            this.IconCompatParcelizer = null;
            investmentDetailsActivity.tabLayout = null;
            investmentDetailsActivity.tabPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
