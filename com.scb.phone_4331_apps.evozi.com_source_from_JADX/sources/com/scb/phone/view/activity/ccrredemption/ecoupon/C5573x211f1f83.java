package com.scb.phone.view.activity.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponRedemptionDetailActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5573x211f1f83 {
    private C5573x211f1f83() {
    }

    public /* synthetic */ C5573x211f1f83(byte b) {
        this();
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3, int i, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "refId");
        onGetStartedClick.write((Object) str3, "itemCode");
        Intent intent = new Intent(context, ECouponRedemptionDetailActivity.class);
        intent.putExtra("EXTRA_CARD_REF_NO_KEY", str);
        intent.putExtra("EXTRA_REF_ID_KEY", str2);
        intent.putExtra("EXTRA_ITEM_CODE_KEY", str3);
        intent.putExtra("EXTRA_RELATION_ID_KEY", i);
        intent.putExtra("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW", z);
        return intent;
    }
}
