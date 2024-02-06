package com.scb.phone.view.fragment.devicesettings;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeviceSettingsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeviceSettingsFragment MediaBrowserCompat$CustomActionResultReceiver;

    public DeviceSettingsFragment_ViewBinding(DeviceSettingsFragment deviceSettingsFragment, View view) {
        super(deviceSettingsFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = deviceSettingsFragment;
        deviceSettingsFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        DeviceSettingsFragment deviceSettingsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deviceSettingsFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            deviceSettingsFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
