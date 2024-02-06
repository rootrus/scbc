package com.scb.phone.view.fragment.findus;

import android.view.View;
import com.scb.phone.R;
import p040o.onStart;

public class ATMTabFragment_ViewBinding extends BaseMapTabFragment_ViewBinding {
    private ATMTabFragment IconCompatParcelizer;

    public ATMTabFragment_ViewBinding(ATMTabFragment aTMTabFragment, View view) {
        super(aTMTabFragment, view);
        this.IconCompatParcelizer = aTMTabFragment;
        aTMTabFragment.mLine = onStart.IconCompatParcelizer(view, R.id.line, "field 'mLine'");
    }

    public final void read() {
        ATMTabFragment aTMTabFragment = this.IconCompatParcelizer;
        if (aTMTabFragment != null) {
            this.IconCompatParcelizer = null;
            aTMTabFragment.mLine = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
