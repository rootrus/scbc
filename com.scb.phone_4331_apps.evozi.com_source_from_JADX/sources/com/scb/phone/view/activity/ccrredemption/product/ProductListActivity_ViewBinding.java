package com.scb.phone.view.activity.ccrredemption.product;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ProductListActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private ProductListActivity write;

    public ProductListActivity_ViewBinding(final ProductListActivity productListActivity, View view) {
        super(productListActivity, view);
        this.write = productListActivity;
        productListActivity.txvRewardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txvRewardPoints'", TextView.class);
        productListActivity.txvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'txvTitle'", TextView.class);
        productListActivity.filterAppliedIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.filter_applied_indicator, "field 'filterAppliedIndicator'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_filter_sort, "field 'btnFilterSort' and method 'onFilterButtonClick'");
        productListActivity.btnFilterSort = (ImageButton) onStart.write(IconCompatParcelizer2, R.id.btn_filter_sort, "field 'btnFilterSort'", ImageButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ProductListActivity.this.onFilterButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_search, "method 'onSearchButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ProductListActivity.this.onSearchButtonClick();
            }
        });
    }

    public final void read() {
        ProductListActivity productListActivity = this.write;
        if (productListActivity != null) {
            this.write = null;
            productListActivity.txvRewardPoints = null;
            productListActivity.txvTitle = null;
            productListActivity.filterAppliedIndicator = null;
            productListActivity.btnFilterSort = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
