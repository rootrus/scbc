package com.scb.phone.view.fragment.creditcard;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BilledDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BilledDetailFragment MediaBrowserCompat$CustomActionResultReceiver;

    public BilledDetailFragment_ViewBinding(BilledDetailFragment billedDetailFragment, View view) {
        super(billedDetailFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = billedDetailFragment;
        billedDetailFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_billed_detail_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        BilledDetailFragment billedDetailFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (billedDetailFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            billedDetailFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
