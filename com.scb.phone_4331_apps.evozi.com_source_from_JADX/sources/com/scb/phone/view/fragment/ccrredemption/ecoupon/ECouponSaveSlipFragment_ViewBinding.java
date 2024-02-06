package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ECouponSaveSlipFragment_ViewBinding extends PurchaseSuccessFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private ECouponSaveSlipFragment write;

    public ECouponSaveSlipFragment_ViewBinding(final ECouponSaveSlipFragment eCouponSaveSlipFragment, View view) {
        super(eCouponSaveSlipFragment, view);
        this.write = eCouponSaveSlipFragment;
        eCouponSaveSlipFragment.deepLinkButtonsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_deep_link_buttons_container, "field 'deepLinkButtonsContainer'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onClickReturnButton'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ECouponSaveSlipFragment.this.onClickReturnButton();
            }
        });
    }

    public final void read() {
        ECouponSaveSlipFragment eCouponSaveSlipFragment = this.write;
        if (eCouponSaveSlipFragment != null) {
            this.write = null;
            eCouponSaveSlipFragment.deepLinkButtonsContainer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
