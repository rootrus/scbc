package com.scb.phone.view.fragment.ccrredemption.product;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class OPRRewardsTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private OPRRewardsTabFragment write;

    public OPRRewardsTabFragment_ViewBinding(OPRRewardsTabFragment oPRRewardsTabFragment, View view) {
        super(oPRRewardsTabFragment, view);
        this.write = oPRRewardsTabFragment;
        oPRRewardsTabFragment.rcvTiers = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rcv_tiers, "field 'rcvTiers'", RecyclerView.class);
        oPRRewardsTabFragment.rewardsErrorLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_tiers_error, "field 'rewardsErrorLayout'", ViewGroup.class);
        oPRRewardsTabFragment.txvErrorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_generic_error, "field 'txvErrorMessage'", TextView.class);
        oPRRewardsTabFragment.txvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'txvErrorTitle'", TextView.class);
        oPRRewardsTabFragment.txvErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_icon, "field 'txvErrorIcon'", ImageView.class);
        oPRRewardsTabFragment.rewardsRootLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rewards_root_layout, "field 'rewardsRootLayout'", ViewGroup.class);
        oPRRewardsTabFragment.viewGroupProgress = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_progress, "field 'viewGroupProgress'", ViewGroup.class);
        oPRRewardsTabFragment.viewPagerRewards = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_rewards, "field 'viewPagerRewards'", ViewPager.class);
    }

    public final void read() {
        OPRRewardsTabFragment oPRRewardsTabFragment = this.write;
        if (oPRRewardsTabFragment != null) {
            this.write = null;
            oPRRewardsTabFragment.rcvTiers = null;
            oPRRewardsTabFragment.rewardsErrorLayout = null;
            oPRRewardsTabFragment.txvErrorMessage = null;
            oPRRewardsTabFragment.txvErrorTitle = null;
            oPRRewardsTabFragment.txvErrorIcon = null;
            oPRRewardsTabFragment.rewardsRootLayout = null;
            oPRRewardsTabFragment.viewGroupProgress = null;
            oPRRewardsTabFragment.viewPagerRewards = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
