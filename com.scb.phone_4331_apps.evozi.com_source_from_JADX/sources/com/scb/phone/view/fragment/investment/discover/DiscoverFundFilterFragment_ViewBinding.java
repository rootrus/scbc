package com.scb.phone.view.fragment.investment.discover;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DiscoverFundFilterFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DiscoverFundFilterFragment MediaBrowserCompat$CustomActionResultReceiver;

    public DiscoverFundFilterFragment_ViewBinding(DiscoverFundFilterFragment discoverFundFilterFragment, View view) {
        super(discoverFundFilterFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = discoverFundFilterFragment;
        discoverFundFilterFragment.btApply = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btApply, "field 'btApply'", Button.class);
        discoverFundFilterFragment.btResetToDefault = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btResetToDefault, "field 'btResetToDefault'", Button.class);
        discoverFundFilterFragment.rvFundDiscover = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rvFundDiscover, "field 'rvFundDiscover'", RecyclerView.class);
    }

    public final void read() {
        DiscoverFundFilterFragment discoverFundFilterFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (discoverFundFilterFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            discoverFundFilterFragment.btApply = null;
            discoverFundFilterFragment.btResetToDefault = null;
            discoverFundFilterFragment.rvFundDiscover = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
