package com.scb.phone.view.fragment.investment.discover;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DiscoverTopFundListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DiscoverTopFundListFragment IconCompatParcelizer;

    public DiscoverTopFundListFragment_ViewBinding(DiscoverTopFundListFragment discoverTopFundListFragment, View view) {
        super(discoverTopFundListFragment, view);
        this.IconCompatParcelizer = discoverTopFundListFragment;
        discoverTopFundListFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        discoverTopFundListFragment.tvAsOfDateTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvAsOfDateTitle, "field 'tvAsOfDateTitle'", TextView.class);
    }

    public final void read() {
        DiscoverTopFundListFragment discoverTopFundListFragment = this.IconCompatParcelizer;
        if (discoverTopFundListFragment != null) {
            this.IconCompatParcelizer = null;
            discoverTopFundListFragment.recyclerView = null;
            discoverTopFundListFragment.tvAsOfDateTitle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
