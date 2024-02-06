package com.scb.phone.view.activity.etb;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public class EtbActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EtbActivity MediaBrowserCompat$ItemReceiver;

    public EtbActivity_ViewBinding(EtbActivity etbActivity, View view) {
        super(etbActivity, view);
        this.MediaBrowserCompat$ItemReceiver = etbActivity;
        etbActivity.progressStateBar = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_state_bar, "field 'progressStateBar'", ProgressStateBar.class);
    }

    public final void read() {
        EtbActivity etbActivity = this.MediaBrowserCompat$ItemReceiver;
        if (etbActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            etbActivity.progressStateBar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
