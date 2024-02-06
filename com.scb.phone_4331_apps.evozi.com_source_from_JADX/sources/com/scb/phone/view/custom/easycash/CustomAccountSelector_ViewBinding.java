package com.scb.phone.view.custom.easycash;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class CustomAccountSelector_ViewBinding implements Unbinder {
    private CustomAccountSelector MediaBrowserCompat$CustomActionResultReceiver;

    public CustomAccountSelector_ViewBinding(CustomAccountSelector customAccountSelector, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customAccountSelector;
        customAccountSelector.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        customAccountSelector.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_indicator, "field 'mCircleIndicator'", CircleIndicator.class);
    }

    public final void read() {
        CustomAccountSelector customAccountSelector = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customAccountSelector != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customAccountSelector.mViewPager = null;
            customAccountSelector.mCircleIndicator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
