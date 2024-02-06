package com.scb.phone.view.activity.ntb;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public class BaseNtbInstructionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseNtbInstructionActivity MediaBrowserCompat$ItemReceiver;

    public BaseNtbInstructionActivity_ViewBinding(BaseNtbInstructionActivity baseNtbInstructionActivity, View view) {
        super(baseNtbInstructionActivity, view);
        this.MediaBrowserCompat$ItemReceiver = baseNtbInstructionActivity;
        baseNtbInstructionActivity.progressStateBar = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_state_bar, "field 'progressStateBar'", ProgressStateBar.class);
    }

    public final void read() {
        BaseNtbInstructionActivity baseNtbInstructionActivity = this.MediaBrowserCompat$ItemReceiver;
        if (baseNtbInstructionActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseNtbInstructionActivity.progressStateBar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
