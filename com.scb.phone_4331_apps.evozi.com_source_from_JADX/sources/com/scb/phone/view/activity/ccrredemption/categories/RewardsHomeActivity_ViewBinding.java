package com.scb.phone.view.activity.ccrredemption.categories;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class RewardsHomeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RewardsHomeActivity MediaBrowserCompat$CustomActionResultReceiver;

    public RewardsHomeActivity_ViewBinding(RewardsHomeActivity rewardsHomeActivity, View view) {
        super(rewardsHomeActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = rewardsHomeActivity;
        rewardsHomeActivity.txvCardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txvCardPoints'", TextView.class);
    }

    public final void read() {
        RewardsHomeActivity rewardsHomeActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (rewardsHomeActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            rewardsHomeActivity.txvCardPoints = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
