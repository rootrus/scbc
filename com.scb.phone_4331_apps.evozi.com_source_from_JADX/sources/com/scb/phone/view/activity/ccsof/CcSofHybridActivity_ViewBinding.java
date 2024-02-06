package com.scb.phone.view.activity.ccsof;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import p040o.onStart;

public final class CcSofHybridActivity_ViewBinding extends BaseActivity_ViewBinding {
    private CcSofHybridActivity write;

    public CcSofHybridActivity_ViewBinding(CcSofHybridActivity ccSofHybridActivity, View view) {
        super(ccSofHybridActivity, view);
        this.write = ccSofHybridActivity;
        ccSofHybridActivity.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
        ccSofHybridActivity.sourceOfFundViewPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_view_pager, "field 'sourceOfFundViewPager'", FragmentWrapContentViewPager.class);
    }

    public final void read() {
        CcSofHybridActivity ccSofHybridActivity = this.write;
        if (ccSofHybridActivity != null) {
            this.write = null;
            ccSofHybridActivity.tabLayout = null;
            ccSofHybridActivity.sourceOfFundViewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
