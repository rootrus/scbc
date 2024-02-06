package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class FundSourceListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundSourceListFragment IconCompatParcelizer;

    public FundSourceListFragment_ViewBinding(FundSourceListFragment fundSourceListFragment, View view) {
        super(fundSourceListFragment, view);
        this.IconCompatParcelizer = fundSourceListFragment;
        fundSourceListFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_source_of_fund, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        FundSourceListFragment fundSourceListFragment = this.IconCompatParcelizer;
        if (fundSourceListFragment != null) {
            this.IconCompatParcelizer = null;
            fundSourceListFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
