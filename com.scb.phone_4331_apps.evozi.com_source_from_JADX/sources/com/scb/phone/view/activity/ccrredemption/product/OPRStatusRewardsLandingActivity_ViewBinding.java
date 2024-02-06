package com.scb.phone.view.activity.ccrredemption.product;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class OPRStatusRewardsLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private OPRStatusRewardsLandingActivity MediaBrowserCompat$ItemReceiver;

    public OPRStatusRewardsLandingActivity_ViewBinding(OPRStatusRewardsLandingActivity oPRStatusRewardsLandingActivity, View view) {
        super(oPRStatusRewardsLandingActivity, view);
        this.MediaBrowserCompat$ItemReceiver = oPRStatusRewardsLandingActivity;
        oPRStatusRewardsLandingActivity.statusRewardsTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_reward_tab_layout, "field 'statusRewardsTabLayout'", TabLayout.class);
        oPRStatusRewardsLandingActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_reward_details_view_pager, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        OPRStatusRewardsLandingActivity oPRStatusRewardsLandingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (oPRStatusRewardsLandingActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            oPRStatusRewardsLandingActivity.statusRewardsTabLayout = null;
            oPRStatusRewardsLandingActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
