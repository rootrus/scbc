package com.scb.phone.view.activity.transferandpay.topup;

import android.view.View;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class TopUpActivity_ViewBinding extends BaseActivity_ViewBinding {
    private TopUpActivity MediaBrowserCompat$CustomActionResultReceiver;

    public TopUpActivity_ViewBinding(TopUpActivity topUpActivity, View view) {
        super(topUpActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = topUpActivity;
        topUpActivity.historyCoachmark = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_coachmark_history_top_up_image_view, "field 'historyCoachmark'", ImageView.class);
    }

    public final void read() {
        TopUpActivity topUpActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (topUpActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            topUpActivity.historyCoachmark = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
