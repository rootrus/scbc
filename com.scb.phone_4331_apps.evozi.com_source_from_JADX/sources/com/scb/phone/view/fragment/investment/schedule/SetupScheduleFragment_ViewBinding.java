package com.scb.phone.view.fragment.investment.schedule;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SetupScheduleFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SetupScheduleFragment MediaBrowserCompat$ItemReceiver;

    public SetupScheduleFragment_ViewBinding(SetupScheduleFragment setupScheduleFragment, View view) {
        super(setupScheduleFragment, view);
        this.MediaBrowserCompat$ItemReceiver = setupScheduleFragment;
        setupScheduleFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
        setupScheduleFragment.tabPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager, "field 'tabPager'", ViewPager.class);
        setupScheduleFragment.okButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_ok, "field 'okButton'", DefaultButton.class);
        setupScheduleFragment.unscheduledButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_unschedule_transaction, "field 'unscheduledButton'", DefaultButton.class);
    }

    public final void read() {
        SetupScheduleFragment setupScheduleFragment = this.MediaBrowserCompat$ItemReceiver;
        if (setupScheduleFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            setupScheduleFragment.tabLayout = null;
            setupScheduleFragment.tabPager = null;
            setupScheduleFragment.okButton = null;
            setupScheduleFragment.unscheduledButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
