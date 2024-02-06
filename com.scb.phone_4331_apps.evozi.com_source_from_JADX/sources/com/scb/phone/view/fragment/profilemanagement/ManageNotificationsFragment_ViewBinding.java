package com.scb.phone.view.fragment.profilemanagement;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ManageNotificationsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ManageNotificationsFragment MediaBrowserCompat$CustomActionResultReceiver;

    public ManageNotificationsFragment_ViewBinding(ManageNotificationsFragment manageNotificationsFragment, View view) {
        super(manageNotificationsFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = manageNotificationsFragment;
        manageNotificationsFragment.checkboxContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_settings_container, "field 'checkboxContainer'", LinearLayout.class);
    }

    public final void read() {
        ManageNotificationsFragment manageNotificationsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageNotificationsFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageNotificationsFragment.checkboxContainer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
