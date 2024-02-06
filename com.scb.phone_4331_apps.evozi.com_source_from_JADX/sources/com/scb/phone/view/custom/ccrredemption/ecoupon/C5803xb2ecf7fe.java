package com.scb.phone.view.custom.ccrredemption.ecoupon;

import android.view.View;

/* renamed from: com.scb.phone.view.custom.ccrredemption.ecoupon.CustomECouponFooterButtonViewComponent$MediaBrowserCompat$CustomActionResultReceiver */
final class C5803xb2ecf7fe implements View.OnClickListener {
    private /* synthetic */ View.OnClickListener read;

    C5803xb2ecf7fe(View.OnClickListener onClickListener) {
        this.read = onClickListener;
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.read;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
