package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class HmlNoDepositAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlNoDepositAccountFragment write;

    public HmlNoDepositAccountFragment_ViewBinding(HmlNoDepositAccountFragment hmlNoDepositAccountFragment, View view) {
        super(hmlNoDepositAccountFragment, view);
        this.write = hmlNoDepositAccountFragment;
        hmlNoDepositAccountFragment.findUsButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_hml_no_deposit_find_us, "field 'findUsButton'", Button.class);
    }

    public final void read() {
        HmlNoDepositAccountFragment hmlNoDepositAccountFragment = this.write;
        if (hmlNoDepositAccountFragment != null) {
            this.write = null;
            hmlNoDepositAccountFragment.findUsButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
