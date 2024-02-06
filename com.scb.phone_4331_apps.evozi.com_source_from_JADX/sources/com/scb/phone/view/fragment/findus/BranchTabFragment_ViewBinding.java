package com.scb.phone.view.fragment.findus;

import android.view.View;
import com.scb.phone.R;
import p040o.onStart;

public class BranchTabFragment_ViewBinding extends BaseMapTabFragment_ViewBinding {
    private BranchTabFragment MediaBrowserCompat$ItemReceiver;

    public BranchTabFragment_ViewBinding(BranchTabFragment branchTabFragment, View view) {
        super(branchTabFragment, view);
        this.MediaBrowserCompat$ItemReceiver = branchTabFragment;
        branchTabFragment.mLine = onStart.IconCompatParcelizer(view, R.id.line, "field 'mLine'");
    }

    public final void read() {
        BranchTabFragment branchTabFragment = this.MediaBrowserCompat$ItemReceiver;
        if (branchTabFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            branchTabFragment.mLine = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
