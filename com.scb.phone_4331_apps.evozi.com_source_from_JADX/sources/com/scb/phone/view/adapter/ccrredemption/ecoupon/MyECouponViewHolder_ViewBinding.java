package com.scb.phone.view.adapter.ccrredemption.ecoupon;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class MyECouponViewHolder_ViewBinding implements Unbinder {
    private MyECouponViewHolder IconCompatParcelizer;

    public MyECouponViewHolder_ViewBinding(MyECouponViewHolder myECouponViewHolder, View view) {
        this.IconCompatParcelizer = myECouponViewHolder;
        myECouponViewHolder.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
        myECouponViewHolder.tvExpire = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_expire, "field 'tvExpire'", TextView.class);
        myECouponViewHolder.ivIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_landing_tile_icon, "field 'ivIcon'", ImageView.class);
        myECouponViewHolder.ivNotificationIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_notification_mark_icon, "field 'ivNotificationIcon'", ImageView.class);
        myECouponViewHolder.vwSeparatorFull = onStart.IconCompatParcelizer(view, R.id.vw_my_e_coupon_separator, "field 'vwSeparatorFull'");
        myECouponViewHolder.vwSeparatorMarginLeft = onStart.IconCompatParcelizer(view, R.id.vw_my_e_coupon_separator_margin_left, "field 'vwSeparatorMarginLeft'");
    }

    public final void read() {
        MyECouponViewHolder myECouponViewHolder = this.IconCompatParcelizer;
        if (myECouponViewHolder != null) {
            this.IconCompatParcelizer = null;
            myECouponViewHolder.tvTitle = null;
            myECouponViewHolder.tvExpire = null;
            myECouponViewHolder.ivIcon = null;
            myECouponViewHolder.ivNotificationIcon = null;
            myECouponViewHolder.vwSeparatorFull = null;
            myECouponViewHolder.vwSeparatorMarginLeft = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
