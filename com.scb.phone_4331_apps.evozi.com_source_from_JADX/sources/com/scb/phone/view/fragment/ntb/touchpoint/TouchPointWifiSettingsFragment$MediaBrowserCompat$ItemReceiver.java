package com.scb.phone.view.fragment.ntb.touchpoint;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import com.scb.phone.view.fragment.ntb.touchpoint.TouchPointWifiSettingsFragment;

public final class TouchPointWifiSettingsFragment$MediaBrowserCompat$ItemReceiver extends ConnectivityManager.NetworkCallback {
    private /* synthetic */ TouchPointWifiSettingsFragment MediaBrowserCompat$CustomActionResultReceiver;

    TouchPointWifiSettingsFragment$MediaBrowserCompat$ItemReceiver(TouchPointWifiSettingsFragment touchPointWifiSettingsFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = touchPointWifiSettingsFragment;
    }

    public final void onLost(Network network) {
        super.onLost(network);
        new Handler(Looper.getMainLooper()).postDelayed(new TouchPointWifiSettingsFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver), 800);
    }

    public final void onAvailable(Network network) {
        super.onAvailable(network);
        new Handler(Looper.getMainLooper()).postDelayed(new TouchPointWifiSettingsFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver), 800);
    }
}
