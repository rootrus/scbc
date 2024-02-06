package com.scb.phone.view.activity.debitcard;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class DebitCardCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private DebitCardCoachMarkActivity MediaBrowserCompat$ItemReceiver;

    public DebitCardCoachMarkActivity_ViewBinding(DebitCardCoachMarkActivity debitCardCoachMarkActivity, View view) {
        super(debitCardCoachMarkActivity, view);
        this.MediaBrowserCompat$ItemReceiver = debitCardCoachMarkActivity;
        debitCardCoachMarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        DebitCardCoachMarkActivity debitCardCoachMarkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (debitCardCoachMarkActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            debitCardCoachMarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
