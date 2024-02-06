package com.scb.phone.view.fragment.ccrredemption.product;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ProductListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ProductListFragment IconCompatParcelizer;

    public ProductListFragment_ViewBinding(ProductListFragment productListFragment, View view) {
        super(productListFragment, view);
        this.IconCompatParcelizer = productListFragment;
        productListFragment.rcvProductList = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rcv_products_list, "field 'rcvProductList'", RecyclerView.class);
        productListFragment.rewardsErrorLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_rewards_error, "field 'rewardsErrorLayout'", ViewGroup.class);
        productListFragment.txvErrorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_generic_error, "field 'txvErrorMessage'", TextView.class);
        productListFragment.txvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'txvErrorTitle'", TextView.class);
        productListFragment.txvErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_icon, "field 'txvErrorIcon'", ImageView.class);
        productListFragment.swipeRefreshLayout = (SwipeRefreshLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swipe_refresh_products_list, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    }

    public final void read() {
        ProductListFragment productListFragment = this.IconCompatParcelizer;
        if (productListFragment != null) {
            this.IconCompatParcelizer = null;
            productListFragment.rcvProductList = null;
            productListFragment.rewardsErrorLayout = null;
            productListFragment.txvErrorMessage = null;
            productListFragment.txvErrorTitle = null;
            productListFragment.txvErrorIcon = null;
            productListFragment.swipeRefreshLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
