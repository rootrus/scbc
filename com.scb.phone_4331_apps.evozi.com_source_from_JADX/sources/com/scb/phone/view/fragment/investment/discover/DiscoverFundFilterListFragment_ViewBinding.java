package com.scb.phone.view.fragment.investment.discover;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DiscoverFundFilterListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DiscoverFundFilterListFragment IconCompatParcelizer;

    public DiscoverFundFilterListFragment_ViewBinding(DiscoverFundFilterListFragment discoverFundFilterListFragment, View view) {
        super(discoverFundFilterListFragment, view);
        this.IconCompatParcelizer = discoverFundFilterListFragment;
        discoverFundFilterListFragment.btSelect = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btSelect, "field 'btSelect'", Button.class);
        discoverFundFilterListFragment.rvFundDiscover = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rvFundDiscover, "field 'rvFundDiscover'", RecyclerView.class);
    }

    public final void read() {
        DiscoverFundFilterListFragment discoverFundFilterListFragment = this.IconCompatParcelizer;
        if (discoverFundFilterListFragment != null) {
            this.IconCompatParcelizer = null;
            discoverFundFilterListFragment.btSelect = null;
            discoverFundFilterListFragment.rvFundDiscover = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
