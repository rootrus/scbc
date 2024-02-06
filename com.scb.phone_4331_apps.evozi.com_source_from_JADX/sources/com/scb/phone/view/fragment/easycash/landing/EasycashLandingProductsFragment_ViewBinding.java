package com.scb.phone.view.fragment.easycash.landing;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import p040o.onStart;

public class EasycashLandingProductsFragment_ViewBinding extends EasycashBaseLandingFragment_ViewBinding {
    private EasycashLandingProductsFragment MediaBrowserCompat$ItemReceiver;

    public EasycashLandingProductsFragment_ViewBinding(EasycashLandingProductsFragment easycashLandingProductsFragment, View view) {
        super(easycashLandingProductsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashLandingProductsFragment;
        easycashLandingProductsFragment.easycashTrackingRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_tracking_recyclerview, "field 'easycashTrackingRecyclerView'", RecyclerView.class);
        easycashLandingProductsFragment.easycashHeaderRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_header_recyclerview, "field 'easycashHeaderRecyclerView'", RecyclerView.class);
        easycashLandingProductsFragment.easycashProductsRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_products_recyclerview, "field 'easycashProductsRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        EasycashLandingProductsFragment easycashLandingProductsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (easycashLandingProductsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashLandingProductsFragment.easycashTrackingRecyclerView = null;
            easycashLandingProductsFragment.easycashHeaderRecyclerView = null;
            easycashLandingProductsFragment.easycashProductsRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
