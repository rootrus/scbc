package com.scb.phone.view.fragment.transferandpay.transfer;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class TransferToMeAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TransferToMeAccountFragment MediaBrowserCompat$CustomActionResultReceiver;

    public TransferToMeAccountFragment_ViewBinding(TransferToMeAccountFragment transferToMeAccountFragment, View view) {
        super(transferToMeAccountFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = transferToMeAccountFragment;
        transferToMeAccountFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        transferToMeAccountFragment.viewGroupNoTargets = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_no_targets, "field 'viewGroupNoTargets'", ViewGroup.class);
    }

    public final void read() {
        TransferToMeAccountFragment transferToMeAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (transferToMeAccountFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            transferToMeAccountFragment.recyclerView = null;
            transferToMeAccountFragment.viewGroupNoTargets = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
