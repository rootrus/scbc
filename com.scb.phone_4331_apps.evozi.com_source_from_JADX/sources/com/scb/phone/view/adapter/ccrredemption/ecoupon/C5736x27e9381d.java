package com.scb.phone.view.adapter.ccrredemption.ecoupon;

import android.os.CountDownTimer;
import p040o.verifyResetPin;

/* renamed from: com.scb.phone.view.adapter.ccrredemption.ecoupon.MyECouponViewHolder$MediaBrowserCompat$CustomActionResultReceiver */
final class C5736x27e9381d implements Runnable {
    private /* synthetic */ MyECouponViewHolder IconCompatParcelizer;

    C5736x27e9381d(MyECouponViewHolder myECouponViewHolder) {
        this.IconCompatParcelizer = myECouponViewHolder;
    }

    public final void run() {
        MyECouponViewHolder myECouponViewHolder = this.IconCompatParcelizer;
        CountDownTimer countDownTimer = myECouponViewHolder.Keep;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        myECouponViewHolder.Keep = null;
        verifyResetPin read = this.IconCompatParcelizer.setBackgroundResource;
        MyECouponViewHolder myECouponViewHolder2 = this.IconCompatParcelizer;
        int i = myECouponViewHolder2.ParcelableVolumeInfo;
        if (i == -1) {
            i = myECouponViewHolder2.MediaSessionCompat$QueueItem;
        }
        read.IconCompatParcelizer(i);
    }
}
