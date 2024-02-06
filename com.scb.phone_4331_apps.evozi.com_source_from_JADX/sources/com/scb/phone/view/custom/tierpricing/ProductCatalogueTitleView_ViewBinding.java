package com.scb.phone.view.custom.tierpricing;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import p040o.onStart;

public final class ProductCatalogueTitleView_ViewBinding implements Unbinder {
    private ProductCatalogueTitleView MediaBrowserCompat$CustomActionResultReceiver;

    public ProductCatalogueTitleView_ViewBinding(ProductCatalogueTitleView productCatalogueTitleView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = productCatalogueTitleView;
        productCatalogueTitleView.titleColumn = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_catalogue_title_column, "field 'titleColumn'", TextView.class);
        productCatalogueTitleView.valueColumn = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_catalogue_value_column, "field 'valueColumn'", ThaiTextView.class);
    }

    public final void read() {
        ProductCatalogueTitleView productCatalogueTitleView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (productCatalogueTitleView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            productCatalogueTitleView.titleColumn = null;
            productCatalogueTitleView.valueColumn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
