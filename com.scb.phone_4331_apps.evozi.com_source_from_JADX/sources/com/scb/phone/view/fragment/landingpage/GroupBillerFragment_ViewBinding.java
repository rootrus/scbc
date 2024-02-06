package com.scb.phone.view.fragment.landingpage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class GroupBillerFragment_ViewBinding extends BaseFragment_ViewBinding {
    private GroupBillerFragment IconCompatParcelizer;

    public GroupBillerFragment_ViewBinding(GroupBillerFragment groupBillerFragment, View view) {
        super(groupBillerFragment, view);
        this.IconCompatParcelizer = groupBillerFragment;
        groupBillerFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.base_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        GroupBillerFragment groupBillerFragment = this.IconCompatParcelizer;
        if (groupBillerFragment != null) {
            this.IconCompatParcelizer = null;
            groupBillerFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
