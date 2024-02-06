package com.scb.phone.view.activity.prepaid;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class PrepaidTravelGettingStartedActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PrepaidTravelGettingStartedActivity IconCompatParcelizer;

    public PrepaidTravelGettingStartedActivity_ViewBinding(PrepaidTravelGettingStartedActivity prepaidTravelGettingStartedActivity, View view) {
        super(prepaidTravelGettingStartedActivity, view);
        this.IconCompatParcelizer = prepaidTravelGettingStartedActivity;
        prepaidTravelGettingStartedActivity.mGettingStarted = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_get_started, "field 'mGettingStarted'", Button.class);
    }

    public final void read() {
        PrepaidTravelGettingStartedActivity prepaidTravelGettingStartedActivity = this.IconCompatParcelizer;
        if (prepaidTravelGettingStartedActivity != null) {
            this.IconCompatParcelizer = null;
            prepaidTravelGettingStartedActivity.mGettingStarted = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
