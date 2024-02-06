package com.scb.phone.view.fragment.ccrredemption.product;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class OPRRewardsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private OPRRewardsFragment write;

    public OPRRewardsFragment_ViewBinding(OPRRewardsFragment oPRRewardsFragment, View view) {
        super(oPRRewardsFragment, view);
        this.write = oPRRewardsFragment;
        oPRRewardsFragment.rcvTierRewards = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rcv_tier_rewards, "field 'rcvTierRewards'", RecyclerView.class);
        oPRRewardsFragment.txvRewardsTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_rewards_title, "field 'txvRewardsTitle'", TextView.class);
        oPRRewardsFragment.inlineLoader = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_progress, "field 'inlineLoader'", ViewGroup.class);
        oPRRewardsFragment.layoutTierRewards = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_tier_rewards, "field 'layoutTierRewards'", ViewGroup.class);
        oPRRewardsFragment.rewardsErrorLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_rewards_error, "field 'rewardsErrorLayout'", ViewGroup.class);
        oPRRewardsFragment.txvErrorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_generic_error, "field 'txvErrorMessage'", TextView.class);
        oPRRewardsFragment.txvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'txvErrorTitle'", TextView.class);
        oPRRewardsFragment.txvErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_icon, "field 'txvErrorIcon'", ImageView.class);
    }

    public final void read() {
        OPRRewardsFragment oPRRewardsFragment = this.write;
        if (oPRRewardsFragment != null) {
            this.write = null;
            oPRRewardsFragment.rcvTierRewards = null;
            oPRRewardsFragment.txvRewardsTitle = null;
            oPRRewardsFragment.inlineLoader = null;
            oPRRewardsFragment.layoutTierRewards = null;
            oPRRewardsFragment.rewardsErrorLayout = null;
            oPRRewardsFragment.txvErrorMessage = null;
            oPRRewardsFragment.txvErrorTitle = null;
            oPRRewardsFragment.txvErrorIcon = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
