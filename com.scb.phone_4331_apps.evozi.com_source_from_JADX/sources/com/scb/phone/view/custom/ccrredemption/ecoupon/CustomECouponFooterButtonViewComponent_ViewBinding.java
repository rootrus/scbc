package com.scb.phone.view.custom.ccrredemption.ecoupon;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomECouponFooterButtonViewComponent_ViewBinding implements Unbinder {
    private CustomECouponFooterButtonViewComponent IconCompatParcelizer;

    public CustomECouponFooterButtonViewComponent_ViewBinding(CustomECouponFooterButtonViewComponent customECouponFooterButtonViewComponent, View view) {
        this.IconCompatParcelizer = customECouponFooterButtonViewComponent;
        customECouponFooterButtonViewComponent.btNext = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_next, "field 'btNext'", Button.class);
    }

    public final void read() {
        CustomECouponFooterButtonViewComponent customECouponFooterButtonViewComponent = this.IconCompatParcelizer;
        if (customECouponFooterButtonViewComponent != null) {
            this.IconCompatParcelizer = null;
            customECouponFooterButtonViewComponent.btNext = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
