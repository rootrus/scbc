package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class ECouponDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ECouponDetailActivity write;

    public ECouponDetailActivity_ViewBinding(ECouponDetailActivity eCouponDetailActivity, View view) {
        super(eCouponDetailActivity, view);
        this.write = eCouponDetailActivity;
        eCouponDetailActivity.tvCardPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'tvCardPoint'", TextView.class);
    }

    public final void read() {
        ECouponDetailActivity eCouponDetailActivity = this.write;
        if (eCouponDetailActivity != null) {
            this.write = null;
            eCouponDetailActivity.tvCardPoint = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
