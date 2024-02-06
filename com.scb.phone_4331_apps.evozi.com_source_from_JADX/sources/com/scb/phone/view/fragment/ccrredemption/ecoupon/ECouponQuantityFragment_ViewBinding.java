package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ECouponQuantityFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ECouponQuantityFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public ECouponQuantityFragment_ViewBinding(final ECouponQuantityFragment eCouponQuantityFragment, View view) {
        super(eCouponQuantityFragment, view);
        this.IconCompatParcelizer = eCouponQuantityFragment;
        eCouponQuantityFragment.txtMaximumQuota = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_maximum_quota, "field 'txtMaximumQuota'", TextView.class);
        eCouponQuantityFragment.txtPointAndUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point_and_unit, "field 'txtPointAndUnit'", TextView.class);
        eCouponQuantityFragment.tvPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point, "field 'tvPoint'", TextView.class);
        eCouponQuantityFragment.inputQuantity = (CustomDeltaInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_quantity, "field 'inputQuantity'", CustomDeltaInput.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_confirm, "field 'redeemButton' and method 'onNextClick'");
        eCouponQuantityFragment.redeemButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_confirm, "field 'redeemButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ECouponQuantityFragment.this.onNextClick();
            }
        });
        eCouponQuantityFragment.customInputValue = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_value, "field 'customInputValue'", AmountEditText.class);
    }

    public final void read() {
        ECouponQuantityFragment eCouponQuantityFragment = this.IconCompatParcelizer;
        if (eCouponQuantityFragment != null) {
            this.IconCompatParcelizer = null;
            eCouponQuantityFragment.txtMaximumQuota = null;
            eCouponQuantityFragment.txtPointAndUnit = null;
            eCouponQuantityFragment.tvPoint = null;
            eCouponQuantityFragment.inputQuantity = null;
            eCouponQuantityFragment.redeemButton = null;
            eCouponQuantityFragment.customInputValue = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
