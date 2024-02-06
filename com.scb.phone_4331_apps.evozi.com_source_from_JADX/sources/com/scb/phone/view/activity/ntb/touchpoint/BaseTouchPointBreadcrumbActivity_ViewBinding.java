package com.scb.phone.view.activity.ntb.touchpoint;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public class BaseTouchPointBreadcrumbActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseTouchPointBreadcrumbActivity MediaBrowserCompat$ItemReceiver;

    public BaseTouchPointBreadcrumbActivity_ViewBinding(BaseTouchPointBreadcrumbActivity baseTouchPointBreadcrumbActivity, View view) {
        super(baseTouchPointBreadcrumbActivity, view);
        this.MediaBrowserCompat$ItemReceiver = baseTouchPointBreadcrumbActivity;
        baseTouchPointBreadcrumbActivity.breadcrumb = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.touch_point_breadcrumb, "field 'breadcrumb'", ProgressStateBar.class);
    }

    public void read() {
        BaseTouchPointBreadcrumbActivity baseTouchPointBreadcrumbActivity = this.MediaBrowserCompat$ItemReceiver;
        if (baseTouchPointBreadcrumbActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseTouchPointBreadcrumbActivity.breadcrumb = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
