package com.scb.phone.view.fragment.findus;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SelectProvinceOrDistrictFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SelectProvinceOrDistrictFragment IconCompatParcelizer;

    public SelectProvinceOrDistrictFragment_ViewBinding(SelectProvinceOrDistrictFragment selectProvinceOrDistrictFragment, View view) {
        super(selectProvinceOrDistrictFragment, view);
        this.IconCompatParcelizer = selectProvinceOrDistrictFragment;
        selectProvinceOrDistrictFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_item_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        SelectProvinceOrDistrictFragment selectProvinceOrDistrictFragment = this.IconCompatParcelizer;
        if (selectProvinceOrDistrictFragment != null) {
            this.IconCompatParcelizer = null;
            selectProvinceOrDistrictFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
