package com.scb.phone.view.activity.transferandpay.billpayment;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class BillPaymentSearchCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BillPaymentSearchCoachMarkActivity MediaBrowserCompat$ItemReceiver;

    public BillPaymentSearchCoachMarkActivity_ViewBinding(BillPaymentSearchCoachMarkActivity billPaymentSearchCoachMarkActivity, View view) {
        super(billPaymentSearchCoachMarkActivity, view);
        this.MediaBrowserCompat$ItemReceiver = billPaymentSearchCoachMarkActivity;
        billPaymentSearchCoachMarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        BillPaymentSearchCoachMarkActivity billPaymentSearchCoachMarkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (billPaymentSearchCoachMarkActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            billPaymentSearchCoachMarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
