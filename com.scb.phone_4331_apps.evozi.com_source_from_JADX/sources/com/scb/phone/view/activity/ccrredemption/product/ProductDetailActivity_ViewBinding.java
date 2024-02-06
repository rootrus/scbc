package com.scb.phone.view.activity.ccrredemption.product;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class ProductDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ProductDetailActivity IconCompatParcelizer;

    public ProductDetailActivity_ViewBinding(ProductDetailActivity productDetailActivity, View view) {
        super(productDetailActivity, view);
        this.IconCompatParcelizer = productDetailActivity;
        productDetailActivity.txvRewardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txvRewardPoints'", TextView.class);
    }

    public final void read() {
        ProductDetailActivity productDetailActivity = this.IconCompatParcelizer;
        if (productDetailActivity != null) {
            this.IconCompatParcelizer = null;
            productDetailActivity.txvRewardPoints = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
