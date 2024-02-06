package com.scb.phone.view.fragment.remittance;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class RemittanceInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RemittanceInputFragment MediaBrowserCompat$ItemReceiver;

    public RemittanceInputFragment_ViewBinding(RemittanceInputFragment remittanceInputFragment, View view) {
        super(remittanceInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = remittanceInputFragment;
        remittanceInputFragment.svRoot = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sv_root, "field 'svRoot'", NestedScrollView.class);
        remittanceInputFragment.favouriteFragment = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fragment_favourite_transfer_target, "field 'favouriteFragment'", FrameLayout.class);
    }

    public final void read() {
        RemittanceInputFragment remittanceInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (remittanceInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            remittanceInputFragment.svRoot = null;
            remittanceInputFragment.favouriteFragment = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
