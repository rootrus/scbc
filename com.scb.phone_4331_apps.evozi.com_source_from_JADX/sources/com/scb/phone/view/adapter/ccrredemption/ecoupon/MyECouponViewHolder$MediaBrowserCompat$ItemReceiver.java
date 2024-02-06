package com.scb.phone.view.adapter.ccrredemption.ecoupon;

import android.os.CountDownTimer;
import p040o.onGetStartedClick;

public final class MyECouponViewHolder$MediaBrowserCompat$ItemReceiver extends CountDownTimer {
    private /* synthetic */ MyECouponViewHolder MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyECouponViewHolder$MediaBrowserCompat$ItemReceiver(MyECouponViewHolder myECouponViewHolder, long j) {
        super(j, 1000);
        this.MediaBrowserCompat$ItemReceiver = myECouponViewHolder;
    }

    public final void onTick(long j) {
        MyECouponViewHolder myECouponViewHolder = this.MediaBrowserCompat$ItemReceiver;
        String format = myECouponViewHolder.AlertController$RecycleListView.format(Long.valueOf(j));
        onGetStartedClick.IconCompatParcelizer((Object) format, "dateFormat.format(millisUntilFinished)");
        MyECouponViewHolder.write(myECouponViewHolder, format);
    }

    public final void onFinish() {
        this.MediaBrowserCompat$ItemReceiver.setHasDecor.post(new C5736x27e9381d(this.MediaBrowserCompat$ItemReceiver));
    }
}
