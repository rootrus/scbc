package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.NonSwipeableViewPager;
import p040o.onStart;

public final class MyECouponActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MyECouponActivity write;

    public MyECouponActivity_ViewBinding(MyECouponActivity myECouponActivity, View view) {
        super(myECouponActivity, view);
        this.write = myECouponActivity;
        myECouponActivity.tabLayout = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_tab, "field 'tabLayout'", CustomTabLayout.class);
        myECouponActivity.vpECouponViewPager = (NonSwipeableViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.e_coupon_view_pager, "field 'vpECouponViewPager'", NonSwipeableViewPager.class);
    }

    public final void read() {
        MyECouponActivity myECouponActivity = this.write;
        if (myECouponActivity != null) {
            this.write = null;
            myECouponActivity.tabLayout = null;
            myECouponActivity.vpECouponViewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
