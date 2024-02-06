package com.scb.phone.view.activity.ccrredemption.product;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class OPRRegistrationLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private OPRRegistrationLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    public OPRRegistrationLandingActivity_ViewBinding(OPRRegistrationLandingActivity oPRRegistrationLandingActivity, View view) {
        super(oPRRegistrationLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = oPRRegistrationLandingActivity;
        oPRRegistrationLandingActivity.txvRewardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txvRewardPoints'", TextView.class);
    }

    public final void read() {
        OPRRegistrationLandingActivity oPRRegistrationLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (oPRRegistrationLandingActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            oPRRegistrationLandingActivity.txvRewardPoints = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
