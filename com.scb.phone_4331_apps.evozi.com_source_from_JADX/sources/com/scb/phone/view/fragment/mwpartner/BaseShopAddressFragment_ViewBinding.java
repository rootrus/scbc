package com.scb.phone.view.fragment.mwpartner;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseShopAddressFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseShopAddressFragment MediaBrowserCompat$ItemReceiver;

    public BaseShopAddressFragment_ViewBinding(BaseShopAddressFragment baseShopAddressFragment, View view) {
        super(baseShopAddressFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseShopAddressFragment;
        baseShopAddressFragment.shopTypeDescriptionLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.shop_type_description, "field 'shopTypeDescriptionLabel'", TextView.class);
        baseShopAddressFragment.btnDone = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_done, "field 'btnDone'", Button.class);
    }

    public void read() {
        BaseShopAddressFragment baseShopAddressFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseShopAddressFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseShopAddressFragment.shopTypeDescriptionLabel = null;
            baseShopAddressFragment.btnDone = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
