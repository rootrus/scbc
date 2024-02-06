package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class MwCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwCoachMarkActivity MediaBrowserCompat$CustomActionResultReceiver;

    public MwCoachMarkActivity_ViewBinding(MwCoachMarkActivity mwCoachMarkActivity, View view) {
        super(mwCoachMarkActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mwCoachMarkActivity;
        mwCoachMarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_mw_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        MwCoachMarkActivity mwCoachMarkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mwCoachMarkActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mwCoachMarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
