package com.scb.phone.view.fragment;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import p040o.onStart;

public class BaseHeaderAndFooterFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseHeaderAndFooterFragment MediaBrowserCompat$ItemReceiver;

    public BaseHeaderAndFooterFragment_ViewBinding(BaseHeaderAndFooterFragment baseHeaderAndFooterFragment, View view) {
        super(baseHeaderAndFooterFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseHeaderAndFooterFragment;
        baseHeaderAndFooterFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_items, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        BaseHeaderAndFooterFragment baseHeaderAndFooterFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseHeaderAndFooterFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseHeaderAndFooterFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
