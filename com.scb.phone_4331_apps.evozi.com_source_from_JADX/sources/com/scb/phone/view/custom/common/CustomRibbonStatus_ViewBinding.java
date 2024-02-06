package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomRibbonStatus_ViewBinding implements Unbinder {
    private CustomRibbonStatus MediaBrowserCompat$CustomActionResultReceiver;

    public CustomRibbonStatus_ViewBinding(CustomRibbonStatus customRibbonStatus, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customRibbonStatus;
        customRibbonStatus.ivIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_status_icon, "field 'ivIcon'", ImageView.class);
        customRibbonStatus.tvContent = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_status_content, "field 'tvContent'", TextView.class);
        customRibbonStatus.tvAction = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ribbon_action, "field 'tvAction'", TextView.class);
    }

    public final void read() {
        CustomRibbonStatus customRibbonStatus = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customRibbonStatus != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customRibbonStatus.ivIcon = null;
            customRibbonStatus.tvContent = null;
            customRibbonStatus.tvAction = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
