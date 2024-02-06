package com.scb.phone.view.fragment.wifisettings;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class WifiSettingsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private WifiSettingsFragment MediaBrowserCompat$ItemReceiver;

    public WifiSettingsFragment_ViewBinding(final WifiSettingsFragment wifiSettingsFragment, View view) {
        super(wifiSettingsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = wifiSettingsFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.wifi_settings_button, "method 'onWifiSettingsClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                WifiSettingsFragment.this.onWifiSettingsClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
