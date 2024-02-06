package com.scb.phone.view.fragment.accountsummary;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class MerchantWalletFragment_ViewBinding extends BaseCardFragment_ViewBinding {
    private MerchantWalletFragment MediaBrowserCompat$CustomActionResultReceiver;

    public MerchantWalletFragment_ViewBinding(MerchantWalletFragment merchantWalletFragment, View view) {
        super(merchantWalletFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = merchantWalletFragment;
        merchantWalletFragment.mTotalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.my_shop_total_amount_text_view, "field 'mTotalAmount'", TextView.class);
    }

    public final void read() {
        MerchantWalletFragment merchantWalletFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (merchantWalletFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            merchantWalletFragment.mTotalAmount = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
