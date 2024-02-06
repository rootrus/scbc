package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.scb.phone.R;
import java.util.Date;
import p040o.onGetStartedClick;

public final class ECouponBarCodeFragment$MediaBrowserCompat$ItemReceiver extends CountDownTimer implements Runnable {
    private /* synthetic */ ECouponBarCodeFragment MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ECouponBarCodeFragment$MediaBrowserCompat$ItemReceiver(ECouponBarCodeFragment eCouponBarCodeFragment, long j) {
        super(j, 1000);
        this.MediaBrowserCompat$ItemReceiver = eCouponBarCodeFragment;
    }

    public final void onTick(long j) {
        String format = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.format(new Date(j));
        TextView textView = this.MediaBrowserCompat$ItemReceiver.tvTimeCountDown;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTimeCountDown");
        }
        textView.setText(this.MediaBrowserCompat$ItemReceiver.getString(R.string.e_coupon_scan_expire_in, format));
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) format, (Object) "00:01")) {
            ECouponBarCodeFragment.m3383x50fd9e4a().postDelayed(this, 1000);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [o.isSynthetic] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r3 = this;
            com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponBarCodeFragment r0 = r3.MediaBrowserCompat$ItemReceiver
            o.modifyString r0 = r0.presenter
            if (r0 != 0) goto L_0x000b
            java.lang.String r1 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x000b:
            o.modifyString$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.modifyString$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
            if (r1 == 0) goto L_0x0017
            o.isSynthetic r2 = new o.isSynthetic
            r2.<init>(r1)
            r1 = r2
        L_0x0017:
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x0027
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0027:
            com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponBarCodeFragment r0 = r3.MediaBrowserCompat$ItemReceiver
            android.os.CountDownTimer r0 = r0.MediaDescriptionCompat
            if (r0 == 0) goto L_0x0032
            r0.cancel()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponBarCodeFragment$MediaBrowserCompat$ItemReceiver.onFinish():void");
    }

    public final void run() {
        CountDownTimer read = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
        if (read != null) {
            read.onFinish();
        }
    }
}
