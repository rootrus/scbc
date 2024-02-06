package com.scb.phone.view.activity.easycash;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public class EasycashActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EasycashActivity IconCompatParcelizer;

    public EasycashActivity_ViewBinding(EasycashActivity easycashActivity, View view) {
        super(easycashActivity, view);
        this.IconCompatParcelizer = easycashActivity;
        easycashActivity.progressStateBar = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_state_bar, "field 'progressStateBar'", ProgressStateBar.class);
    }

    public final void read() {
        EasycashActivity easycashActivity = this.IconCompatParcelizer;
        if (easycashActivity != null) {
            this.IconCompatParcelizer = null;
            easycashActivity.progressStateBar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
