package com.scb.phone.view.fragment.transferandpay.topuptab;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class TopUpTargetTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TopUpTargetTabFragment write;

    public TopUpTargetTabFragment_ViewBinding(TopUpTargetTabFragment topUpTargetTabFragment, View view) {
        super(topUpTargetTabFragment, view);
        this.write = topUpTargetTabFragment;
        topUpTargetTabFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_tab_layout, "field 'mTabLayout'", TabLayout.class);
        topUpTargetTabFragment.mTabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_view_pager, "field 'mTabPager'", FragmentWrapContentViewPager.class);
    }

    public final void read() {
        TopUpTargetTabFragment topUpTargetTabFragment = this.write;
        if (topUpTargetTabFragment != null) {
            this.write = null;
            topUpTargetTabFragment.mTabLayout = null;
            topUpTargetTabFragment.mTabPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
