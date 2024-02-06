package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class ECouponCommonActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ECouponCommonActivity MediaBrowserCompat$CustomActionResultReceiver;

    public ECouponCommonActivity_ViewBinding(ECouponCommonActivity eCouponCommonActivity, View view) {
        super(eCouponCommonActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = eCouponCommonActivity;
        eCouponCommonActivity.tvCardPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'tvCardPoint'", TextView.class);
    }

    public final void read() {
        ECouponCommonActivity eCouponCommonActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (eCouponCommonActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            eCouponCommonActivity.tvCardPoint = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
