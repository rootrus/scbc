package com.scb.phone.view.fragment.ntb.touchpoint;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class TouchPointWifiSettingsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TouchPointWifiSettingsFragment write;

    public TouchPointWifiSettingsFragment_ViewBinding(TouchPointWifiSettingsFragment touchPointWifiSettingsFragment, View view) {
        super(touchPointWifiSettingsFragment, view);
        this.write = touchPointWifiSettingsFragment;
        touchPointWifiSettingsFragment.containerLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_ntb_container, "field 'containerLayout'", LinearLayout.class);
        touchPointWifiSettingsFragment.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ntb_wifi_icon, "field 'icon'", ImageView.class);
        touchPointWifiSettingsFragment.messageTv = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.thai_tv_ntb_wifi_message, "field 'messageTv'", ThaiTextView.class);
        touchPointWifiSettingsFragment.hintMessageTv = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.thai_tv_ntb_wifi_hint_message, "field 'hintMessageTv'", ThaiTextView.class);
        touchPointWifiSettingsFragment.remarkTv = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.thai_tv_ntb_wifi_remark, "field 'remarkTv'", ThaiTextView.class);
        touchPointWifiSettingsFragment.actionButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_ntb_wifi, "field 'actionButton'", Button.class);
    }

    public final void read() {
        TouchPointWifiSettingsFragment touchPointWifiSettingsFragment = this.write;
        if (touchPointWifiSettingsFragment != null) {
            this.write = null;
            touchPointWifiSettingsFragment.containerLayout = null;
            touchPointWifiSettingsFragment.icon = null;
            touchPointWifiSettingsFragment.messageTv = null;
            touchPointWifiSettingsFragment.hintMessageTv = null;
            touchPointWifiSettingsFragment.remarkTv = null;
            touchPointWifiSettingsFragment.actionButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
