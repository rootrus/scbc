package com.scb.phone.view.fragment.investment;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseScheduleFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseScheduleFragment MediaBrowserCompat$ItemReceiver;

    public BaseScheduleFragment_ViewBinding(BaseScheduleFragment baseScheduleFragment, View view) {
        super(baseScheduleFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseScheduleFragment;
        baseScheduleFragment.customScheduleView = (CustomScheduleView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_view, "field 'customScheduleView'", CustomScheduleView.class);
    }

    public void read() {
        BaseScheduleFragment baseScheduleFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseScheduleFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseScheduleFragment.customScheduleView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
