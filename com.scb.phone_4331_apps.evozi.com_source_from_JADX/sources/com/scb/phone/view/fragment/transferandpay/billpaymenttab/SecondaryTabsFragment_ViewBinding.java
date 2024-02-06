package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SecondaryTabsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SecondaryTabsFragment write;

    public SecondaryTabsFragment_ViewBinding(SecondaryTabsFragment secondaryTabsFragment, View view) {
        super(secondaryTabsFragment, view);
        this.write = secondaryTabsFragment;
        secondaryTabsFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_tab_layout, "field 'mTabLayout'", TabLayout.class);
        secondaryTabsFragment.mTabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_view_pager, "field 'mTabPager'", FragmentWrapContentViewPager.class);
    }

    public final void read() {
        SecondaryTabsFragment secondaryTabsFragment = this.write;
        if (secondaryTabsFragment != null) {
            this.write = null;
            secondaryTabsFragment.mTabLayout = null;
            secondaryTabsFragment.mTabPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
