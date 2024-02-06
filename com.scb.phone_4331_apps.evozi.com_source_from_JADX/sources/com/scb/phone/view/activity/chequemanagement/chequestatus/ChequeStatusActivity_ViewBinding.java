package com.scb.phone.view.activity.chequemanagement.chequestatus;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class ChequeStatusActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ChequeStatusActivity MediaBrowserCompat$ItemReceiver;

    public ChequeStatusActivity_ViewBinding(ChequeStatusActivity chequeStatusActivity, View view) {
        super(chequeStatusActivity, view);
        this.MediaBrowserCompat$ItemReceiver = chequeStatusActivity;
        chequeStatusActivity.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
        chequeStatusActivity.tabPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager, "field 'tabPager'", ViewPager.class);
    }

    public final void read() {
        ChequeStatusActivity chequeStatusActivity = this.MediaBrowserCompat$ItemReceiver;
        if (chequeStatusActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            chequeStatusActivity.tabLayout = null;
            chequeStatusActivity.tabPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
