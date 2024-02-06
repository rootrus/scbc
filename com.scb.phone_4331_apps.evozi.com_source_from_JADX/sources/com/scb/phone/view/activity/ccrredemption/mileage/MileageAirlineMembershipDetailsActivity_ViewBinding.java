package com.scb.phone.view.activity.ccrredemption.mileage;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class MileageAirlineMembershipDetailsActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MileageAirlineMembershipDetailsActivity IconCompatParcelizer;

    public MileageAirlineMembershipDetailsActivity_ViewBinding(MileageAirlineMembershipDetailsActivity mileageAirlineMembershipDetailsActivity, View view) {
        super(mileageAirlineMembershipDetailsActivity, view);
        this.IconCompatParcelizer = mileageAirlineMembershipDetailsActivity;
        mileageAirlineMembershipDetailsActivity.txvRewardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txvRewardPoints'", TextView.class);
    }

    public final void read() {
        MileageAirlineMembershipDetailsActivity mileageAirlineMembershipDetailsActivity = this.IconCompatParcelizer;
        if (mileageAirlineMembershipDetailsActivity != null) {
            this.IconCompatParcelizer = null;
            mileageAirlineMembershipDetailsActivity.txvRewardPoints = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
