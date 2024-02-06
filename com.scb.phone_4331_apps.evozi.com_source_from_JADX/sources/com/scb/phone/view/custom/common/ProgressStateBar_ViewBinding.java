package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ProgressStateBar_ViewBinding implements Unbinder {
    private ProgressStateBar write;

    public ProgressStateBar_ViewBinding(ProgressStateBar progressStateBar, View view) {
        this.write = progressStateBar;
        progressStateBar.viewProgressState = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_progress_state, "field 'viewProgressState'", LinearLayout.class);
    }

    public final void read() {
        ProgressStateBar progressStateBar = this.write;
        if (progressStateBar != null) {
            this.write = null;
            progressStateBar.viewProgressState = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
