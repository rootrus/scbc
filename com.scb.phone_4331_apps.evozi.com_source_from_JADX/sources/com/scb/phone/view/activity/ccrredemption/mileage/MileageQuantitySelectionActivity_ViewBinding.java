package com.scb.phone.view.activity.ccrredemption.mileage;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class MileageQuantitySelectionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MileageQuantitySelectionActivity write;

    public MileageQuantitySelectionActivity_ViewBinding(MileageQuantitySelectionActivity mileageQuantitySelectionActivity, View view) {
        super(mileageQuantitySelectionActivity, view);
        this.write = mileageQuantitySelectionActivity;
        mileageQuantitySelectionActivity.txvRewardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txvRewardPoints'", TextView.class);
    }

    public final void read() {
        MileageQuantitySelectionActivity mileageQuantitySelectionActivity = this.write;
        if (mileageQuantitySelectionActivity != null) {
            this.write = null;
            mileageQuantitySelectionActivity.txvRewardPoints = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
