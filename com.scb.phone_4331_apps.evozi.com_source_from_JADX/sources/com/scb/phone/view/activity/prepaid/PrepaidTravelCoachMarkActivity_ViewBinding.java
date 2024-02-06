package com.scb.phone.view.activity.prepaid;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class PrepaidTravelCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PrepaidTravelCoachMarkActivity MediaBrowserCompat$ItemReceiver;

    public PrepaidTravelCoachMarkActivity_ViewBinding(PrepaidTravelCoachMarkActivity prepaidTravelCoachMarkActivity, View view) {
        super(prepaidTravelCoachMarkActivity, view);
        this.MediaBrowserCompat$ItemReceiver = prepaidTravelCoachMarkActivity;
        prepaidTravelCoachMarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        PrepaidTravelCoachMarkActivity prepaidTravelCoachMarkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (prepaidTravelCoachMarkActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            prepaidTravelCoachMarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
