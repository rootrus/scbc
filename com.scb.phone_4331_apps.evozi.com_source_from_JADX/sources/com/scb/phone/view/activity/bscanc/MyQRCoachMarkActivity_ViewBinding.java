package com.scb.phone.view.activity.bscanc;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class MyQRCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MyQRCoachMarkActivity write;

    public MyQRCoachMarkActivity_ViewBinding(MyQRCoachMarkActivity myQRCoachMarkActivity, View view) {
        super(myQRCoachMarkActivity, view);
        this.write = myQRCoachMarkActivity;
        myQRCoachMarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        MyQRCoachMarkActivity myQRCoachMarkActivity = this.write;
        if (myQRCoachMarkActivity != null) {
            this.write = null;
            myQRCoachMarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
