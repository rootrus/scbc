package com.scb.phone.view.fragment.easycash.salesheets;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class EasycashSalesheetIndexFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashSalesheetIndexFragment write;

    public EasycashSalesheetIndexFragment_ViewBinding(EasycashSalesheetIndexFragment easycashSalesheetIndexFragment, View view) {
        super(easycashSalesheetIndexFragment, view);
        this.write = easycashSalesheetIndexFragment;
        easycashSalesheetIndexFragment.easycashSalesheetsRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_salesheets_recyclerview, "field 'easycashSalesheetsRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        EasycashSalesheetIndexFragment easycashSalesheetIndexFragment = this.write;
        if (easycashSalesheetIndexFragment != null) {
            this.write = null;
            easycashSalesheetIndexFragment.easycashSalesheetsRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
