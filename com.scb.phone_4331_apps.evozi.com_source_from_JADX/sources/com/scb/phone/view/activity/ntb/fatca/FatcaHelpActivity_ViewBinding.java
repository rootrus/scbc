package com.scb.phone.view.activity.ntb.fatca;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class FatcaHelpActivity_ViewBinding extends BaseActivity_ViewBinding {
    private FatcaHelpActivity MediaBrowserCompat$ItemReceiver;

    public FatcaHelpActivity_ViewBinding(FatcaHelpActivity fatcaHelpActivity, View view) {
        super(fatcaHelpActivity, view);
        this.MediaBrowserCompat$ItemReceiver = fatcaHelpActivity;
        fatcaHelpActivity.helpTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_help, "field 'helpTextView'", TextView.class);
    }

    public final void read() {
        FatcaHelpActivity fatcaHelpActivity = this.MediaBrowserCompat$ItemReceiver;
        if (fatcaHelpActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fatcaHelpActivity.helpTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
