package com.scb.phone.view.fragment.ntb.selectaccount;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SelectAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SelectAccountFragment IconCompatParcelizer;

    public SelectAccountFragment_ViewBinding(SelectAccountFragment selectAccountFragment, View view) {
        super(selectAccountFragment, view);
        this.IconCompatParcelizer = selectAccountFragment;
        selectAccountFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }

    public void read() {
        SelectAccountFragment selectAccountFragment = this.IconCompatParcelizer;
        if (selectAccountFragment != null) {
            this.IconCompatParcelizer = null;
            selectAccountFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
