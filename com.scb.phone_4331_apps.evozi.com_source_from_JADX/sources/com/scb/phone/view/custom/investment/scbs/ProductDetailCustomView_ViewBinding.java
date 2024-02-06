package com.scb.phone.view.custom.investment.scbs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ProductDetailCustomView_ViewBinding implements Unbinder {
    private ProductDetailCustomView IconCompatParcelizer;

    public ProductDetailCustomView_ViewBinding(ProductDetailCustomView productDetailCustomView, View view) {
        this.IconCompatParcelizer = productDetailCustomView;
        productDetailCustomView.value = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.value_text, "field 'value'", TextView.class);
        productDetailCustomView.label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_text, "field 'label'", TextView.class);
        productDetailCustomView.separator = onStart.IconCompatParcelizer(view, R.id.separator, "field 'separator'");
    }

    public final void read() {
        ProductDetailCustomView productDetailCustomView = this.IconCompatParcelizer;
        if (productDetailCustomView != null) {
            this.IconCompatParcelizer = null;
            productDetailCustomView.value = null;
            productDetailCustomView.label = null;
            productDetailCustomView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
