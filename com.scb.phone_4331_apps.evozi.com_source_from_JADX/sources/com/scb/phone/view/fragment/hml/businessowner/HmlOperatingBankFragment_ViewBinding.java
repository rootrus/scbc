package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import android.widget.GridView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class HmlOperatingBankFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlOperatingBankFragment MediaBrowserCompat$CustomActionResultReceiver;

    public HmlOperatingBankFragment_ViewBinding(HmlOperatingBankFragment hmlOperatingBankFragment, View view) {
        super(hmlOperatingBankFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlOperatingBankFragment;
        hmlOperatingBankFragment.bankGrid = (GridView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.grd_bank_accounts, "field 'bankGrid'", GridView.class);
    }

    public final void read() {
        HmlOperatingBankFragment hmlOperatingBankFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlOperatingBankFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlOperatingBankFragment.bankGrid = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
