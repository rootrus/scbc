package com.scb.phone.view.fragment.findus;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class FindUsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FindUsFragment write;

    public FindUsFragment_ViewBinding(FindUsFragment findUsFragment, View view) {
        super(findUsFragment, view);
        this.write = findUsFragment;
        findUsFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.find_us_tab_layout, "field 'mTabLayout'", TabLayout.class);
        findUsFragment.mTabPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.find_us_view_pager, "field 'mTabPager'", NoSwipeViewPager.class);
    }

    public final void read() {
        FindUsFragment findUsFragment = this.write;
        if (findUsFragment != null) {
            this.write = null;
            findUsFragment.mTabLayout = null;
            findUsFragment.mTabPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
