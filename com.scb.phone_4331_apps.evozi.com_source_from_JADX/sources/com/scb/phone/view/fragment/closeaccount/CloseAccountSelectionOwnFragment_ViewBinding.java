package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CloseAccountSelectionOwnFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CloseAccountSelectionOwnFragment MediaBrowserCompat$CustomActionResultReceiver;

    public CloseAccountSelectionOwnFragment_ViewBinding(CloseAccountSelectionOwnFragment closeAccountSelectionOwnFragment, View view) {
        super(closeAccountSelectionOwnFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = closeAccountSelectionOwnFragment;
        closeAccountSelectionOwnFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        closeAccountSelectionOwnFragment.viewGroupNoTargets = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_no_targets, "field 'viewGroupNoTargets'", ViewGroup.class);
    }

    public final void read() {
        CloseAccountSelectionOwnFragment closeAccountSelectionOwnFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (closeAccountSelectionOwnFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            closeAccountSelectionOwnFragment.recyclerView = null;
            closeAccountSelectionOwnFragment.viewGroupNoTargets = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
