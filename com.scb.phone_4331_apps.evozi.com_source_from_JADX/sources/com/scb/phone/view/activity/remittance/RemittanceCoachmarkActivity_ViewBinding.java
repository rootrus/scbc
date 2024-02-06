package com.scb.phone.view.activity.remittance;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class RemittanceCoachmarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RemittanceCoachmarkActivity MediaBrowserCompat$ItemReceiver;

    public RemittanceCoachmarkActivity_ViewBinding(RemittanceCoachmarkActivity remittanceCoachmarkActivity, View view) {
        super(remittanceCoachmarkActivity, view);
        this.MediaBrowserCompat$ItemReceiver = remittanceCoachmarkActivity;
        remittanceCoachmarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        RemittanceCoachmarkActivity remittanceCoachmarkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (remittanceCoachmarkActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            remittanceCoachmarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
