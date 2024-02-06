package com.scb.phone.view.activity.transferandpay.transfer;

import android.view.View;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class TransferActivity_ViewBinding extends BaseActivity_ViewBinding {
    private TransferActivity MediaBrowserCompat$CustomActionResultReceiver;

    public TransferActivity_ViewBinding(TransferActivity transferActivity, View view) {
        super(transferActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = transferActivity;
        transferActivity.historyCoachmark = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_coachmark_history_transfer_image_view, "field 'historyCoachmark'", ImageView.class);
    }

    public final void read() {
        TransferActivity transferActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (transferActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            transferActivity.historyCoachmark = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
