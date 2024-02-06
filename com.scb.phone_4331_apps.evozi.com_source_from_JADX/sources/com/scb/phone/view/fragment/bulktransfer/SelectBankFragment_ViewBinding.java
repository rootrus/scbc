package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SelectBankFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SelectBankFragment IconCompatParcelizer;

    public SelectBankFragment_ViewBinding(SelectBankFragment selectBankFragment, View view) {
        super(selectBankFragment, view);
        this.IconCompatParcelizer = selectBankFragment;
        selectBankFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        SelectBankFragment selectBankFragment = this.IconCompatParcelizer;
        if (selectBankFragment != null) {
            this.IconCompatParcelizer = null;
            selectBankFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
