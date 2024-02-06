package com.scb.phone.view.activity.hml;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public class HmlBusinessOccupationInfoActivity_ViewBinding extends BaseActivity_ViewBinding {
    private HmlBusinessOccupationInfoActivity MediaBrowserCompat$CustomActionResultReceiver;

    public HmlBusinessOccupationInfoActivity_ViewBinding(HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity, View view) {
        super(hmlBusinessOccupationInfoActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOccupationInfoActivity;
        hmlBusinessOccupationInfoActivity.progressStateBar = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_state_bar, "field 'progressStateBar'", ProgressStateBar.class);
    }

    public final void read() {
        HmlBusinessOccupationInfoActivity hmlBusinessOccupationInfoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessOccupationInfoActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlBusinessOccupationInfoActivity.progressStateBar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
