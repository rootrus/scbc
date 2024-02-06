package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;

public final class MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver {
    private MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public static Intent IconCompatParcelizer(Context context, String str, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "cardRefNo");
        Intent intent = new Intent(context, MyECouponActivity.class);
        intent.putExtra("EXTRA_MY_E_COUPON_CARD_REF_KEY", str);
        intent.putExtra("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW", z);
        return intent;
    }
}
