package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ManagePromptpayLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ManagePromptpayLandingFragment MediaBrowserCompat$ItemReceiver;

    public ManagePromptpayLandingFragment_ViewBinding(ManagePromptpayLandingFragment managePromptpayLandingFragment, View view) {
        super(managePromptpayLandingFragment, view);
        this.MediaBrowserCompat$ItemReceiver = managePromptpayLandingFragment;
        managePromptpayLandingFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.promptpay_recycler, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        ManagePromptpayLandingFragment managePromptpayLandingFragment = this.MediaBrowserCompat$ItemReceiver;
        if (managePromptpayLandingFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            managePromptpayLandingFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
