package com.scb.phone.view.custom.tierpricing;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ProductCatalogueInterestOptionsView_ViewBinding implements Unbinder {
    private ProductCatalogueInterestOptionsView IconCompatParcelizer;

    public ProductCatalogueInterestOptionsView_ViewBinding(ProductCatalogueInterestOptionsView productCatalogueInterestOptionsView, View view) {
        this.IconCompatParcelizer = productCatalogueInterestOptionsView;
        productCatalogueInterestOptionsView.principal = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_catalogue_principal, "field 'principal'", TextView.class);
        productCatalogueInterestOptionsView.interestsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_product_catalogue_interests_container, "field 'interestsContainer'", LinearLayout.class);
    }

    public final void read() {
        ProductCatalogueInterestOptionsView productCatalogueInterestOptionsView = this.IconCompatParcelizer;
        if (productCatalogueInterestOptionsView != null) {
            this.IconCompatParcelizer = null;
            productCatalogueInterestOptionsView.principal = null;
            productCatalogueInterestOptionsView.interestsContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
