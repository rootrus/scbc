package com.scb.phone.view.activity.bond;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class BondSelectionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BondSelectionActivity MediaBrowserCompat$ItemReceiver;

    public BondSelectionActivity_ViewBinding(BondSelectionActivity bondSelectionActivity, View view) {
        super(bondSelectionActivity, view);
        this.MediaBrowserCompat$ItemReceiver = bondSelectionActivity;
        bondSelectionActivity.bondSelectionRecycler = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_selection_list, "field 'bondSelectionRecycler'", RecyclerView.class);
    }

    public final void read() {
        BondSelectionActivity bondSelectionActivity = this.MediaBrowserCompat$ItemReceiver;
        if (bondSelectionActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            bondSelectionActivity.bondSelectionRecycler = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
