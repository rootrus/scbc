package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class ECouponRedemptionDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ECouponRedemptionDetailActivity write;

    public ECouponRedemptionDetailActivity_ViewBinding(ECouponRedemptionDetailActivity eCouponRedemptionDetailActivity, View view) {
        super(eCouponRedemptionDetailActivity, view);
        this.write = eCouponRedemptionDetailActivity;
        eCouponRedemptionDetailActivity.txtCardPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txtCardPoint'", TextView.class);
    }

    public final void read() {
        ECouponRedemptionDetailActivity eCouponRedemptionDetailActivity = this.write;
        if (eCouponRedemptionDetailActivity != null) {
            this.write = null;
            eCouponRedemptionDetailActivity.txtCardPoint = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
