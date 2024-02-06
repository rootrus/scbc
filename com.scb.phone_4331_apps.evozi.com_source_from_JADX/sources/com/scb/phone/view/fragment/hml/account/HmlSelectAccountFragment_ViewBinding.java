package com.scb.phone.view.fragment.hml.account;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.selectaccount.SelectAccountFragment_ViewBinding;
import p040o.onStart;

public final class HmlSelectAccountFragment_ViewBinding extends SelectAccountFragment_ViewBinding {
    private HmlSelectAccountFragment IconCompatParcelizer;

    public HmlSelectAccountFragment_ViewBinding(HmlSelectAccountFragment hmlSelectAccountFragment, View view) {
        super(hmlSelectAccountFragment, view);
        this.IconCompatParcelizer = hmlSelectAccountFragment;
        hmlSelectAccountFragment.remark2Label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_remark_2, "field 'remark2Label'", TextView.class);
        hmlSelectAccountFragment.remark3Label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_remark_3, "field 'remark3Label'", TextView.class);
    }

    public final void read() {
        HmlSelectAccountFragment hmlSelectAccountFragment = this.IconCompatParcelizer;
        if (hmlSelectAccountFragment != null) {
            this.IconCompatParcelizer = null;
            hmlSelectAccountFragment.remark2Label = null;
            hmlSelectAccountFragment.remark3Label = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
