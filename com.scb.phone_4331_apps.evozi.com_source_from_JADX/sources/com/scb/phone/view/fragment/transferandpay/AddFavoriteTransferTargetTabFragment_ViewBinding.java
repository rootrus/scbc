package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class AddFavoriteTransferTargetTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AddFavoriteTransferTargetTabFragment IconCompatParcelizer;

    public AddFavoriteTransferTargetTabFragment_ViewBinding(AddFavoriteTransferTargetTabFragment addFavoriteTransferTargetTabFragment, View view) {
        super(addFavoriteTransferTargetTabFragment, view);
        this.IconCompatParcelizer = addFavoriteTransferTargetTabFragment;
        addFavoriteTransferTargetTabFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_tab_layout, "field 'mTabLayout'", TabLayout.class);
        addFavoriteTransferTargetTabFragment.mTabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_view_pager, "field 'mTabPager'", FragmentWrapContentViewPager.class);
    }

    public final void read() {
        AddFavoriteTransferTargetTabFragment addFavoriteTransferTargetTabFragment = this.IconCompatParcelizer;
        if (addFavoriteTransferTargetTabFragment != null) {
            this.IconCompatParcelizer = null;
            addFavoriteTransferTargetTabFragment.mTabLayout = null;
            addFavoriteTransferTargetTabFragment.mTabPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
