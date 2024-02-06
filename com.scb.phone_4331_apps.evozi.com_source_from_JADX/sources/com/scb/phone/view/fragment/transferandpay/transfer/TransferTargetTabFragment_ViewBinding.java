package com.scb.phone.view.fragment.transferandpay.transfer;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class TransferTargetTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TransferTargetTabFragment MediaBrowserCompat$ItemReceiver;

    public TransferTargetTabFragment_ViewBinding(TransferTargetTabFragment transferTargetTabFragment, View view) {
        super(transferTargetTabFragment, view);
        this.MediaBrowserCompat$ItemReceiver = transferTargetTabFragment;
        transferTargetTabFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_tab_layout, "field 'mTabLayout'", TabLayout.class);
        transferTargetTabFragment.mTabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_view_pager, "field 'mTabPager'", FragmentWrapContentViewPager.class);
    }

    public final void read() {
        TransferTargetTabFragment transferTargetTabFragment = this.MediaBrowserCompat$ItemReceiver;
        if (transferTargetTabFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            transferTargetTabFragment.mTabLayout = null;
            transferTargetTabFragment.mTabPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
